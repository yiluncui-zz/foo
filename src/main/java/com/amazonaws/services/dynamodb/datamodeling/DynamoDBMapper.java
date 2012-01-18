/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodb.datamodeling;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodb.datamodeling.internal.PaginatedQueryList;
import com.amazonaws.services.dynamodb.datamodeling.internal.PaginatedScanList;
import com.amazonaws.services.dynamodb.model.AttributeValue;
import com.amazonaws.services.dynamodb.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodb.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodb.model.DeleteItemRequest;
import com.amazonaws.services.dynamodb.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodb.model.GetItemRequest;
import com.amazonaws.services.dynamodb.model.GetItemResult;
import com.amazonaws.services.dynamodb.model.Key;
import com.amazonaws.services.dynamodb.model.PutItemRequest;
import com.amazonaws.services.dynamodb.model.QueryRequest;
import com.amazonaws.services.dynamodb.model.QueryResult;
import com.amazonaws.services.dynamodb.model.ScanRequest;
import com.amazonaws.services.dynamodb.model.ScanResult;
import com.amazonaws.services.dynamodb.model.UpdateItemRequest;

/**
 * Object mapper for domain-object interaction with DynamoDB.
 * <p>
 * To use, annotate domain classes with the annotations found in the
 * com.amazonaws.services.dynamodb.datamodeling package. A minimal example:
 * 
 * <pre>
 * &#064;DynamoDBTable(tableName = &quot;TestTable&quot;)
 * public class TestClass {
 * 
 *     private Long key;
 *     private double rangeKey;
 *     private Long version;
 * 
 *     private Set&lt;Integer&gt; integerSetAttribute;
 * 
 *     &#064;DynamoDBHashKey
 *     public Long getKey() {
 *         return key;
 *     }
 * 
 *     public void setKey(Long key) {
 *         this.key = key;
 *     }
 * 
 *     &#064;DynamoDBRangeKey
 *     public double getRangeKey() {
 *         return rangeKey;
 *     }
 * 
 *     public void setRangeKey(double rangeKey) {
 *         this.rangeKey = rangeKey;
 *     }
 * 
 *     &#064;DynamoDBAttribute(attributeName = &quot;integerSetAttribute&quot;)
 *     public Set&lt;Integer&gt; getIntegerAttribute() {
 *         return integerSetAttribute;
 *     }
 * 
 *     public void setIntegerAttribute(Set&lt;Integer&gt; integerAttribute) {
 *         this.integerSetAttribute = integerAttribute;
 *     }
 * 
 *     &#064;DynamoDBVersionAttribute
 *     public Long getVersion() {
 *         return version;
 *     }
 * 
 *     public void setVersion(Long version) {
 *         this.version = version;
 *     }
 * }
 * </pre>
 * <p>
 * Save instances of annotated classes to DynamoDB, retrieve them, and delete
 * them using the {@link DynamoDBMapper} class, as in the following example.
 * 
 * <pre>
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * Long key = 105L;
 * TestClass obj = mapper.load(TestClass.class, key);
 * obj.getIntegerAttribute().add(42);
 * mapper.save(obj);
 * mapper.delete(obj);
 * </pre>
 * <p>
 * When using the save, load, and delete methods, {@link DynamoDBMapper} will
 * throw {@link DynamoDBMappingException}s to indicate that domain classes are
 * incorrectly annotated or otherwise incompatible with this class. Service
 * exceptions will always be propagated as {@link AmazonClientException}, and
 * DynamoDB-specific subclasses such as {@link ConditionalCheckFailedException}
 * will be used when possible.
 * 
 * @see DynamoDBTable
 * @see DynamoDBHashKey
 * @see DynamoDBRangeKey
 * @see DynamoDBAutoGeneratedKey
 * @see DynamoDBAttribute
 * @see DynamoDBVersionAttribute
 * @see DynamoDBIgnore
 * @see DynamoDBMarshalling
 * @see DynamoDBMapperConfig
 */
public class DynamoDBMapper {

    private final AmazonDynamoDB db;
    private final DynamoDBMapperConfig config;
    private static final DynamoDBReflector reflector = new DynamoDBReflector();

    /**
     * Constructs a new mapper with the service object given, using the default
     * configuration.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(AmazonDynamoDB dynamoDB) {
        this(dynamoDB, DynamoDBMapperConfig.DEFAULT);
    }

    /**
     * Constructs a new mapper with the service object and configuration given.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     */
    public DynamoDBMapper(AmazonDynamoDB dynamoDB, DynamoDBMapperConfig config) {
        this.db = dynamoDB;
        this.config = config;
    }

    /**
     * Loads an object with the hash key given and a configuration override.
     * This configuration overrides the default provided at object construction.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config) {
        return load(clazz, hashKey, null, config);
    }

    /**
     * Loads an object with the hash key given, using the default configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey) {
        return load(clazz, hashKey, null, config);
    }

    /**
     * Loads an object with a hash and range key, using the default
     * configuration.
     *
     * @see DynamoDBMapper#load(Class, Object, Object, DynamoDBMapperConfig)
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey) {
        return load(clazz, hashKey, rangeKey, config);
    }

    /**
     * Returns an object with the given hash key, or null if no such object
     * exists.
     *
     * @param clazz
     *            The class to load, corresponding to a DynamoDB table.
     * @param hashKey
     *            The key of the object.
     * @param rangeKey
     *            The range key of the object, or null for tables without a
     *            range key.
     * @param config
     *            Configuration for the service call to retrieve the object from
     *            DynamoDB. This configuration overrides the default given at
     *            construction.
     */
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        if ( config != this.config )
            config = new DynamoDBMapperConfig(this.config, config);
        
        String tableName = getTableName(clazz, config);

        // Fill in the hash key element in the service request
        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(hashKey, hashKeyGetter);

        // Determine the range key, if provided
        AttributeValue rangeKeyElement = null;
        if ( rangeKey != null ) {
            Method rangeKeyMethod = reflector.getRangeKeyGetter(clazz);
            if ( rangeKeyMethod == null ) {
                throw new DynamoDBMappingException("Zero-parameter range key property must be annotated with "
                        + DynamoDBRangeKey.class);
            }
            rangeKeyElement = getRangeKeyElement(rangeKey, rangeKeyMethod);
        }

        GetItemResult item = db.getItem(new GetItemRequest().withTableName(tableName)
                .withKey(new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement))
                .withConsistentRead(config.getConsistentReads() == ConsistentReads.CONSISTENT));
        Map<String, AttributeValue> itemAttributes = item.getItem();
        if ( itemAttributes == null ) {
            return null;
        }

        return marshallIntoObject(clazz, itemAttributes);
    }

    private <T> String getTableName(Class<T> clazz, DynamoDBMapperConfig config) {
        DynamoDBTable table = reflector.getTable(clazz);
        String tableName = table.tableName();
        if ( config.getTableNameOverride() != null ) {
            tableName = config.getTableNameOverride().getTableName();
        }
        return tableName;
    }

    private AttributeValue getHashKeyElement(Object hashKey, Method hashKeyGetter) {
        AttributeValue hashKeyElement = new AttributeValue();
        Class<?> hashKeyMethodReturnType = hashKeyGetter.getReturnType();
        if ( hashKeyMethodReturnType.isPrimitive() || Number.class.isAssignableFrom(hashKeyMethodReturnType) ) {
            hashKeyElement.setN(String.valueOf(hashKey));
        } else if ( String.class.isAssignableFrom(hashKeyMethodReturnType) ) {
            hashKeyElement.setS(String.valueOf(hashKey));
        } else {
            throw new DynamoDBMappingException("Hash key property must be either a Number or a String");
        }
        return hashKeyElement;
    }

    private AttributeValue getRangeKeyElement(Object rangeKey, Method rangeKeyMethod) {
        AttributeValue rangeKeyElement = new AttributeValue();
        Class<?> rangeKeyMethodReturnType = rangeKeyMethod.getReturnType();
        if ( rangeKeyMethodReturnType.isPrimitive() || Number.class.isAssignableFrom(rangeKeyMethodReturnType) ) {
            rangeKeyElement.setN(String.valueOf(rangeKey));
        } else if ( String.class.isAssignableFrom(rangeKeyMethodReturnType) ) {
            rangeKeyElement.setS(String.valueOf(rangeKey));
        } else {
            throw new DynamoDBMappingException("Range key property must be either a Number or a String");
        }
        return rangeKeyElement;
    }

    /**
     * Creates and fills in the attributes on an instance of the class given
     * with the attributes given.
     * <p>
     * This is accomplished by looking for getter methods annotated with an
     * appropriate annotation, then looking for matching attribute names in the
     * item attribute map.
     *
     * @param clazz
     *            The class to instantiate and hydrate
     * @param itemAttributes
     *            The set of item attributes, keyed by attribute name.
     */
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {
        T toReturn = null;
        try {
            toReturn = clazz.newInstance();
        } catch ( InstantiationException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        } catch ( IllegalAccessException e ) {
            throw new DynamoDBMappingException("Failed to instantiate new instance of class", e);
        }

        if ( itemAttributes == null || itemAttributes.isEmpty() )
            return toReturn;

        for ( Method m : reflector.getRelevantGetters(clazz) ) {
            String attributeName = reflector.getAttributeName(m);
            if ( itemAttributes.containsKey(attributeName) ) {
                setValue(toReturn, m, itemAttributes.get(attributeName));
            }
        }

        return toReturn;
    }

    /**
     * Sets the value in the return object corresponding to the service result.
     */
    private <T> void setValue(final T toReturn, final Method getter, AttributeValue value) {

        Method setter = reflector.getSetter(getter);
        ArgumentUnmarshaller unmarhsaller = reflector.getArgumentUnmarshaller(toReturn, getter, setter);
        unmarhsaller.typeCheck(value, setter);

        Object argument;
        try {
            argument = unmarhsaller.unmarshall(value);
        } catch ( IllegalArgumentException e ) {
            throw new DynamoDBMappingException("Couldn't unmarshall value " + value + " for " + setter, e);
        } catch ( ParseException e ) {
            throw new DynamoDBMappingException("Error attempting to parse date string " + value + " for "+ setter, e);
        }

        safeInvoke(setter, toReturn, argument);
    }

    /**
     * Returns an {@link AttributeValue} corresponding to the getter and return
     * result given, treating it as a non-versioned attribute. Only useful when
     * differentiating between this method and getAttributeValue.
     */
    private AttributeValue getSimpleAttributeValue(final Method getter, final Object getterReturnResult) {
        if ( getterReturnResult == null )
            return null;

        ArgumentMarshaller marshaller = reflector.getArgumentMarshaller(getter);
        return marshaller.marshall(getterReturnResult);
    }

    /**
     * Saves the object given into DynamoDB, using the default configuration.
     *
     * @see DynamoDBMapper#save(Object, DynamoDBMapperConfig)
     */
    public <T extends Object> void save(T object) {
        save(object, config);
    }

    /**
     * Saves an item in DynamoDB. The service method used is determined by the
     * {@link DynamoDBMapperConfig#getSaveBehavior()} value, to use either
     * {@link AWSDynamoDB#putItem(PutItemRequest)} or
     * {@link AWSDynamoDB#updateItem(UpdateItemRequest)}. For updates, a null
     * value for an object property will remove it from that item in DynamoDB.
     * For puts, a null value will not be passed to the service. The effect is
     * therefore the same, except when the item in DynamoDB contains attributes
     * that aren't modeled by the domain object given.
     *
     * @param object
     *            The object to save into DynamoDB
     * @param config
     *            The configuration to use, which overrides the default provided
     *            at object construction.
     */
    public <T extends Object> void save(T object, DynamoDBMapperConfig config) {
        if ( config != this.config )
            config = new DynamoDBMapperConfig(this.config, config);
        
        @SuppressWarnings("unchecked")
        Class<? extends T> clazz = (Class<? extends T>) object.getClass();
        String tableName = getTableName(clazz, config);

        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(safeInvoke(hashKeyGetter, object), hashKeyGetter);

        AttributeValue rangeKeyElement = null;
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        if ( rangeKeyGetter != null ) {
            rangeKeyElement = getRangeKeyElement(safeInvoke(rangeKeyGetter, object), rangeKeyGetter);
        }

        Key objectKey = new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement);

        Map<String, AttributeValueUpdate> updateValues = new HashMap<String, AttributeValueUpdate>();
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();

        // Look at every getter and construct an update object for it
        boolean forcePut = false;
        List<ValueUpdate> inMemoryUpdates = new LinkedList<DynamoDBMapper.ValueUpdate>();
        for ( Method method : reflector.getRelevantGetters(clazz) ) {

            Object getterResult = safeInvoke(method, object);
            String attributeName = reflector.getAttributeName(method);

            /*
             * If this is a versioned field, update it
             */
            if ( reflector.isVersionAttributeGetter(method) ) {
                if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
                    // First establish the expected (current) value for the
                    // update call
                    ExpectedAttributeValue expected = new ExpectedAttributeValue();

                    // For new objects, insist that the value doesn't exist.
                    // For existing ones, insist it has the old value.
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    expected.setExists(currentValue != null);
                    if ( currentValue != null ) {
                        expected.setValue(currentValue);
                    }
                    expectedValues.put(attributeName, expected);
                }

                AttributeValue newVersionValue = getVersionAttributeValue(method, getterResult);
                updateValues
                        .put(attributeName, new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
                inMemoryUpdates.add(new ValueUpdate(method, newVersionValue));
            }

            /*
             * If this is a new item being saved, assign a key if possible and
             * force a put, rather than an update
             */
            else if ( getterResult == null && reflector.isAssignableKey(method) ) {
                forcePut = true;
                AttributeValue newVersionValue = getAutoGeneratedKeyAttributeValue(method, getterResult);
                updateValues
                        .put(attributeName, new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
                inMemoryUpdates.add(new ValueUpdate(method, newVersionValue));
            }

            /*
             * Otherwise apply the put value for this attribute. Hash and range
             * keys are included in puts, but not updates.
             */
            else if ( config.getSaveBehavior() == SaveBehavior.CLOBBER
                    || (!method.equals(hashKeyGetter) && !method.equals(rangeKeyGetter)) ) {
                AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                if ( currentValue != null ) {
                    updateValues.put(attributeName, new AttributeValueUpdate().withValue(currentValue)
                            .withAction("PUT"));
                } else if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
                    updateValues.put(attributeName, new AttributeValueUpdate().withAction("DELETE"));
                }
            }
        }

        /*
         * Do a put or an update, according to the configuration. For a put (not
         * the default), we need to munge the data type.
         */
        if ( config.getSaveBehavior() == SaveBehavior.CLOBBER || forcePut ) {
            db.putItem(new PutItemRequest().withTableName(tableName).withItem(convertToItem(updateValues))
                    .withExpected(expectedValues));
        } else {
            db.updateItem(new UpdateItemRequest().withTableName(tableName).withKey(objectKey)
                    .withAttributeUpdates(updateValues).withExpected(expectedValues));
        }

        /*
         * Finally, after the service call has succeeded, update the in-memory
         * object with new field values as appropriate.
         */
        for ( ValueUpdate update : inMemoryUpdates ) {
            setValue(object, update.method, update.newValue);
        }
    }
    
    /**
     * Deletes the given object from its DynamoDB table.
     */
    public void delete(Object object) {
        delete(object, this.config);
    }

    /**
     * Deletes the given object from its DynamoDB table.
     * 
     * @param config
     *            Config override object. If {@link SaveBehavior#CLOBBER} is
     *            supplied, version fields will not be considered when deleting
     *            the object.
     */
    public void delete(Object object, DynamoDBMapperConfig config) {
        if ( this.config != config )
            config = new DynamoDBMapperConfig(this.config, config);
        
        Class<?> clazz = object.getClass();

        String tableName = getTableName(clazz, config);

        Method hashKeyGetter = reflector.getHashKeyGetter(clazz);
        AttributeValue hashKeyElement = getHashKeyElement(safeInvoke(hashKeyGetter, object), hashKeyGetter);

        AttributeValue rangeKeyElement = null;
        Method rangeKeyGetter = reflector.getRangeKeyGetter(clazz);
        if ( rangeKeyGetter != null ) {
            rangeKeyElement = getRangeKeyElement(safeInvoke(rangeKeyGetter, object), rangeKeyGetter);
        }

        Key objectKey = new Key().withHashKeyElement(hashKeyElement).withRangeKeyElement(rangeKeyElement);
        
        /*
         * If there is a version field, make sure we assert its value. If the
         * version field is null (only should happen in unusual circumstances),
         * pretend it doesn't have a version field after all.
         */
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();               
        if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
            for ( Method method : reflector.getRelevantGetters(clazz) ) {

                if ( reflector.isVersionAttributeGetter(method) ) {
                    Object getterResult = safeInvoke(method, object);
                    String attributeName = reflector.getAttributeName(method);

                    ExpectedAttributeValue expected = new ExpectedAttributeValue();
                    AttributeValue currentValue = getSimpleAttributeValue(method, getterResult);
                    expected.setExists(currentValue != null);
                    if ( currentValue != null )
                        expected.setValue(currentValue);
                    expectedValues.put(attributeName, expected);
                    break;
                }
            }
        }
        
        db.deleteItem(new DeleteItemRequest().withKey(objectKey).withTableName(tableName).withExpected(expectedValues));
    }
    
    /**
     * Swallows the checked exceptions around Method.invoke and repackages them
     * as {@link DynamoDBMappingException}
     */
    private Object safeInvoke(Method method, Object object, Object... arguments) {
        try {
            return method.invoke(object, arguments);
        } catch ( IllegalAccessException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        } catch ( IllegalArgumentException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        } catch ( InvocationTargetException e ) {
            throw new DynamoDBMappingException("Couldn't invoke " + method, e);
        }

    }

    private static final class ValueUpdate {

        private Method method;
        private AttributeValue newValue;

        public ValueUpdate(Method method, AttributeValue newValue) {
            this.method = method;
            this.newValue = newValue;
        }
    }

    /**
     * Converts the {@link AttributeValueUpdate} map given to an equivalent
     * {@link AttributeValue} map.
     */
    private Map<String, AttributeValue> convertToItem(Map<String, AttributeValueUpdate> putValues) {
        Map<String, AttributeValue> map = new HashMap<String, AttributeValue>();
        for ( Entry<String, AttributeValueUpdate> entry : putValues.entrySet() ) {
            /*
             * AttributeValueUpdate allows nulls for its values, since they are
             * semantically meaningful. AttributeValues never have null values.
             */
            if ( entry.getValue().getValue() != null )
                map.put(entry.getKey(), entry.getValue().getValue());
        }
        return map;
    }

    /**
     * Gets the attribute value object corresponding to the
     * {@link DynamoDBVersionAttribute} getter, and its result, given. Null
     * values are assumed to be new objects and given the smallest possible
     * positive value. Non-null values are incremented from their current value.
     */
    private AttributeValue getVersionAttributeValue(final Method getter, Object getterReturnResult) {
        ArgumentMarshaller marshaller = reflector.getVersionedArgumentMarshaller(getter, getterReturnResult);
        return marshaller.marshall(getterReturnResult);
    }

    /**
     * Returns an attribute value corresponding to the key method and value given.
     */
    private AttributeValue getAutoGeneratedKeyAttributeValue(Method getter, Object getterResult) {
        ArgumentMarshaller marshaller = reflector.getAutoGeneratedKeyArgumentMarshaller(getter);
        return marshaller.marshall(getterResult);
    }

    /**
     * Scans through an AWS DynamoDB table and returns the matching results as
     * an unmodifiable list of instantiated objects. The table to scan is
     * determined by looking at the annotations on the specified class, which
     * declares where to store the object data in AWS DynamoDB, and the scan
     * expression parameter allows the caller to filter results and control how
     * the scan is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     *
     * @param <T>
     *            The type of the objects being returned.
     *
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in AWS DynamoDB.
     * @param scanExpression
     *            Details on how to run the scan, including any filters to apply
     *            to limit results.
     *
     * @return An unmodifiable list of the objects constructed from the results
     *         of the scan operation.
     *
     * @throws Exception
     *             If there were any problems loading the data from AWS
     *             DynamoDB.
     */
    public <T> List<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression) throws Exception {
        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression);

        ScanResult scanResult = db.scan(scanRequest);
        int count = scanResult.getCount();

        // If the results are truncated, figure out the count
        if (scanResult.getLastEvaluatedKey() != null) {
            count = count(clazz, scanExpression);
        }

        return new PaginatedScanList<T>(this, clazz, db, count, scanRequest, scanResult);
    }

    /**
     * Queries an AWS DynamoDB table and returns the matching results as an
     * unmodifiable list of instantiated objects. The table to query is
     * determined by looking at the annotations on the specified class, which
     * declares where to store the object data in AWS DynamoDB, and the query
     * expression parameter allows the caller to filter results and control how
     * the query is executed.
     * <p>
     * Callers should be aware that the returned list is unmodifiable, and any
     * attempts to modify the list will result in an
     * UnsupportedOperationException.
     *
     * @param <T>
     *            The type of the objects being returned.
     *
     * @param clazz
     *            The class annotated with DynamoDB annotations describing how
     *            to store the object data in AWS DynamoDB.
     * @param queryExpression
     *            Details on how to run the query, including any filters to
     *            apply to limit the results.
     *
     * @return An unmodifiable list of the objects constructed from the results
     *         of the query operation.
     *
     * @throws Exception
     *             If there were any problems loading the data from AWS
     *             DynamoDB.
     */
    public <T> List<T> query(Class<T> clazz, DynamoDBQueryExpression queryExpression) throws Exception {
        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression);

        QueryResult queryResult = db.query(queryRequest);
        int count = queryResult.getCount();

        // If the results are truncated, figure out the count
        if (queryResult.getLastEvaluatedKey() != null) {
            count = count(clazz, queryExpression);
        }

        return new PaginatedQueryList<T>(this, clazz, db, count, queryRequest, queryResult);
    }

    /**
     * Evaluates the specified scan expression and returns the count of matching
     * items, without returning any of the actual item data.
     *
     * @param clazz
     *            The class mapped to a DynamoDB table.
     * @param scanExpression
     *            The parameters for running the scan.
     *
     * @return The count of matching items, without returning any of the actual
     *         item data.
     *
     * @throws Exception
     *             If any problems were encountered making the request to AWS
     *             DynamoDB.
     */
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression) throws Exception {
        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression);
        scanRequest.setCount(true);

        // Count scans can also be truncated for large datasets
        int count = 0;
        ScanResult scanResult = null;
        do {
            scanResult = db.scan(scanRequest);
            count += scanResult.getCount();
            scanRequest.setExclusiveStartKey(scanResult.getLastEvaluatedKey());
        } while (scanResult.getLastEvaluatedKey() != null);

        return count;
    }

    public int count(Class<?> clazz, DynamoDBQueryExpression queryExpression) throws Exception {
        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression);
        queryRequest.setCount(true);

        // Count queries can also be truncated for large datasets
        int count = 0;
        QueryResult queryResult = null;
        do {
            queryResult = db.query(queryRequest);
            count += queryResult.getCount();
            queryRequest.setExclusiveStartKey(queryResult.getLastEvaluatedKey());
        } while (queryResult.getLastEvaluatedKey() != null);

        return count;
    }

    private ScanRequest createScanRequestFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression) {
        DynamoDBTable table = reflector.getTable(clazz);

        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(table.tableName());
        scanRequest.setScanFilter(scanExpression.getScanFilter());

        return scanRequest;
    }

    private QueryRequest createQueryRequestFromExpression(Class<?> clazz, DynamoDBQueryExpression queryExpression) {
        DynamoDBTable table = reflector.getTable(clazz);

        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setConsistentRead(queryExpression.isConsistentRead());
        queryRequest.setTableName(table.tableName());
        queryRequest.setHashKeyValue(queryExpression.getHashKeyValue());
        queryRequest.setScanIndexForward(queryExpression.isScanIndexForward());
        queryRequest.setRangeKeyCondition(queryExpression.getRangeKeyCondition());

        return queryRequest;
    }
}
