/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a condition to be compared with an attribute value. This
 * condition can be used with <i>DeleteItem</i> ,
 * <i>PutItem</i> or <i>UpdateItem</i> operations; if
 * the comparison evaluates to true, the operation succeeds; if not the
 * operation fails. You can use <i>ExpectedAttributeValue</i> in one of
 * two different ways:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Use <i>AttributeValueList</i> to specify one or more values to compare
 * against an attribute. Use <i>ComparisonOperator</i> to specify how you
 * want to perform the comparison. If the comparison evaluates to true,
 * then the conditional operation succeeds.
 * </p>
 * </li>
 * <li> <p>
 * Use <i>Value</i> to specify a value that DynamoDB will compare against
 * an attribute. If the values match, then <i>ExpectedAttributeValue</i>
 * evaluates to true and the conditional operation succeeds. Optionally,
 * you can also set <i>Exists</i> to false, indicating that you <i>do
 * not</i> expect to find the attribute value in the table. In this case,
 * the conditional operation succeeds only if the comparison evaluates to
 * false.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <i>Value</i> and <i>Exists</i> are incompatible with
 * <i>AttributeValueList</i> and <i>ComparisonOperator</i> . If you
 * attempt to use both sets of parameters at once, DynamoDB will throw a
 * <i>ValidationException</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The Value and Exists parameters are deprecated. Even
 * though DynamoDB will continue to support these parameters, we
 * recommend that you use AttributeValueList and ComparisonOperator
 * instead. AttributeValueList and ComparisonOperator let you construct a
 * much wider range of conditions than is possible with Value and Exists.
 * </p>
 */
public class ExpectedAttributeValue implements Serializable {

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     */
    private AttributeValue value;

    /**
     * Causes DynamoDB to evaluate the value before attempting a conditional
     * operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     * DynamoDB will check to see if that attribute value already exists in
     * the table. If it is found, then the operation succeeds. If it is not
     * found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     */
    private Boolean exists;

    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     */
    private String comparisonOperator;

    /**
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueList;

    /**
     * Default constructor for a new ExpectedAttributeValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ExpectedAttributeValue() {}
    
    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value Represents the data for an attribute. You can set one,
     * and only one, of the elements.
     */
    public ExpectedAttributeValue(AttributeValue value) {
        setValue(value);
    }

    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exists Causes DynamoDB to evaluate the value before attempting
     * a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, DynamoDB will check to see if that attribute value
     * already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     */
    public ExpectedAttributeValue(Boolean exists) {
        setExists(exists);
    }

    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @return Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * Represents the data for an attribute. You can set one, and only one,
     * of the elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Represents the data for an attribute. You can set one, and only one,
     *         of the elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withValue(AttributeValue value) {
        this.value = value;
        return this;
    }

    /**
     * Causes DynamoDB to evaluate the value before attempting a conditional
     * operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     * DynamoDB will check to see if that attribute value already exists in
     * the table. If it is found, then the operation succeeds. If it is not
     * found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     *
     * @return Causes DynamoDB to evaluate the value before attempting a conditional
     *         operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     *         DynamoDB will check to see if that attribute value already exists in
     *         the table. If it is found, then the operation succeeds. If it is not
     *         found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the operation succeeds. If the value
     *         is found, despite the assumption that it does not exist, the operation
     *         fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     *         <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     *         supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     *         exists: You don't have to set <i>Exists</i> to <code>true</code>,
     *         because it is implied. <p>DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul>
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * Causes DynamoDB to evaluate the value before attempting a conditional
     * operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     * DynamoDB will check to see if that attribute value already exists in
     * the table. If it is found, then the operation succeeds. If it is not
     * found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     *
     * @param exists Causes DynamoDB to evaluate the value before attempting a conditional
     *         operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     *         DynamoDB will check to see if that attribute value already exists in
     *         the table. If it is found, then the operation succeeds. If it is not
     *         found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the operation succeeds. If the value
     *         is found, despite the assumption that it does not exist, the operation
     *         fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     *         <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     *         supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     *         exists: You don't have to set <i>Exists</i> to <code>true</code>,
     *         because it is implied. <p>DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul>
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * Causes DynamoDB to evaluate the value before attempting a conditional
     * operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     * DynamoDB will check to see if that attribute value already exists in
     * the table. If it is found, then the operation succeeds. If it is not
     * found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists Causes DynamoDB to evaluate the value before attempting a conditional
     *         operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     *         DynamoDB will check to see if that attribute value already exists in
     *         the table. If it is found, then the operation succeeds. If it is not
     *         found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the operation succeeds. If the value
     *         is found, despite the assumption that it does not exist, the operation
     *         fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     *         <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     *         supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     *         exists: You don't have to set <i>Exists</i> to <code>true</code>,
     *         because it is implied. <p>DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * Causes DynamoDB to evaluate the value before attempting a conditional
     * operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     * DynamoDB will check to see if that attribute value already exists in
     * the table. If it is found, then the operation succeeds. If it is not
     * found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, DynamoDB assumes that the attribute value does
     * <i>not</i> exist in the table. If in fact the value does not exist,
     * then the assumption is valid and the operation succeeds. If the value
     * is found, despite the assumption that it does not exist, the operation
     * fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     * <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     * supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     * exists: You don't have to set <i>Exists</i> to <code>true</code>,
     * because it is implied. <p>DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul>
     *
     * @return Causes DynamoDB to evaluate the value before attempting a conditional
     *         operation: <ul> <li> <p>If <i>Exists</i> is <code>true</code>,
     *         DynamoDB will check to see if that attribute value already exists in
     *         the table. If it is found, then the operation succeeds. If it is not
     *         found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, DynamoDB assumes that the attribute value does
     *         <i>not</i> exist in the table. If in fact the value does not exist,
     *         then the assumption is valid and the operation succeeds. If the value
     *         is found, despite the assumption that it does not exist, the operation
     *         fails with a <i>ConditionalCheckFailedException</i>. </li> </ul>
     *         <p>The default setting for <i>Exists</i> is <code>true</code>. If you
     *         supply a <i>Value</i> all by itself, DynamoDB assumes the attribute
     *         exists: You don't have to set <i>Exists</i> to <code>true</code>,
     *         because it is implied. <p>DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul>
     */
    public Boolean getExists() {
        return exists;
    }

    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @return A comparator for evaluating attributes in the
     *         <i>AttributeValueList</i>. For example, equals, greater than, less
     *         than, etc. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes in the
     *         <i>AttributeValueList</i>. For example, equals, greater than, less
     *         than, etc. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes in the
     *         <i>AttributeValueList</i>. For example, equals, greater than, less
     *         than, etc. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ComparisonOperator
     */
    public ExpectedAttributeValue withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes in the
     *         <i>AttributeValueList</i>. For example, equals, greater than, less
     *         than, etc. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }
    
    /**
     * A comparator for evaluating attributes in the
     * <i>AttributeValueList</i>. For example, equals, greater than, less
     * than, etc. <p>The following comparison operators are available:
     * <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     * NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     * descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     * : Equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, Binary, String Set,
     * Number Set, or Binary Set. If an item contains an
     * <i>AttributeValue</i> of a different type than the one specified in
     * the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     * "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     * or equal. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If an item contains an <i>AttributeValue</i> of a different type than
     * the one specified in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     * Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     * "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     * attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     * not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     * subsequence, or value in a set. <p><i>AttributeValueList</i> can
     * contain only one <i>AttributeValue</i> of type String, Number, or
     * Binary (not a set). If the target attribute of the comparison is a
     * String, then the operation checks for a substring match. If the target
     * attribute of the comparison is Binary, then the operation looks for a
     * subsequence of the target that matches the input. If the target
     * attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     * operation checks for a member of the set (not as a substring). </li>
     * <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     * subsequence, or absence of a value in a set.
     * <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     * If the target attribute of the comparison is a String, then the
     * operation checks for the absence of a substring match. If the target
     * attribute of the comparison is Binary, then the operation checks for
     * the absence of a subsequence of the target that matches the input. If
     * the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     * then the operation checks for the absence of a member of the set (not
     * as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     * prefix. <p><i>AttributeValueList</i> can contain only one
     * <i>AttributeValue</i> of type String or Binary (not a Number or a
     * set). The target attribute of the comparison must be a String or
     * Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     * checks for exact matches. <p><i>AttributeValueList</i> can contain
     * more than one <i>AttributeValue</i> of type String, Number, or Binary
     * (not a set). The target attribute of the comparison must be of the
     * same type and exact value to match. A String never matches a String
     * set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     * first value, and less than or equal to the second value.
     * <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     * elements of the same type, either String, Number, or Binary (not a
     * set). A target attribute matches if the target value is greater than,
     * or equal to, the first element and less than, or equal to, the second
     * element. If an item contains an <i>AttributeValue</i> of a different
     * type than the one specified in the request, the value does not match.
     * For example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     * to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator A comparator for evaluating attributes in the
     *         <i>AttributeValueList</i>. For example, equals, greater than, less
     *         than, etc. <p>The following comparison operators are available:
     *         <p><code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS |
     *         NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code> <p>The following are
     *         descriptions of each comparison operator. <ul> <li> <p><code>EQ</code>
     *         : Equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>NE</code> : Not equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, Binary, String Set,
     *         Number Set, or Binary Set. If an item contains an
     *         <i>AttributeValue</i> of a different type than the one specified in
     *         the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2",
     *         "1"]}</code>. <p/> </li> <li> <p><code>LE</code> : Less than or equal.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>LT</code> : Less than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GE</code> : Greater than
     *         or equal. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>GT</code> : Greater than.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If an item contains an <i>AttributeValue</i> of a different type than
     *         the one specified in the request, the value does not match. For
     *         example, <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>.
     *         Also, <code>{"N":"6"}</code> does not compare to <code>{"NS":["6",
     *         "2", "1"]}</code>. <p/> </li> <li> <p><code>NOT_NULL</code> : The
     *         attribute exists. </li> <li> <p><code>NULL</code> : The attribute does
     *         not exist. </li> <li> <p><code>CONTAINS</code> : checks for a
     *         subsequence, or value in a set. <p><i>AttributeValueList</i> can
     *         contain only one <i>AttributeValue</i> of type String, Number, or
     *         Binary (not a set). If the target attribute of the comparison is a
     *         String, then the operation checks for a substring match. If the target
     *         attribute of the comparison is Binary, then the operation looks for a
     *         subsequence of the target that matches the input. If the target
     *         attribute of the comparison is a set ("SS", "NS", or "BS"), then the
     *         operation checks for a member of the set (not as a substring). </li>
     *         <li> <p><code>NOT_CONTAINS</code> : checks for absence of a
     *         subsequence, or absence of a value in a set.
     *         <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a set).
     *         If the target attribute of the comparison is a String, then the
     *         operation checks for the absence of a substring match. If the target
     *         attribute of the comparison is Binary, then the operation checks for
     *         the absence of a subsequence of the target that matches the input. If
     *         the target attribute of the comparison is a set ("SS", "NS", or "BS"),
     *         then the operation checks for the absence of a member of the set (not
     *         as a substring).</li> <li> <p><code>BEGINS_WITH</code> : checks for a
     *         prefix. <p><i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set). The target attribute of the comparison must be a String or
     *         Binary (not a Number or a set). <p/> </li> <li> <p><code>IN</code> :
     *         checks for exact matches. <p><i>AttributeValueList</i> can contain
     *         more than one <i>AttributeValue</i> of type String, Number, or Binary
     *         (not a set). The target attribute of the comparison must be of the
     *         same type and exact value to match. A String never matches a String
     *         set. </li> <li> <p><code>BETWEEN</code> : Greater than or equal to the
     *         first value, and less than or equal to the second value.
     *         <p><i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not a
     *         set). A target attribute matches if the target value is greater than,
     *         or equal to, the first element and less than, or equal to, the second
     *         element. If an item contains an <i>AttributeValue</i> of a different
     *         type than the one specified in the request, the value does not match.
     *         For example, <code>{"S":"6"}</code> does not compare to
     *         <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare
     *         to <code>{"NS":["6", "2", "1"]}</code> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ComparisonOperator
     */
    public ExpectedAttributeValue withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide.
     */
    public java.util.List<AttributeValue> getAttributeValueList() {
        return attributeValueList;
    }
    
    /**
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide.
     */
    public void setAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(attributeValueList.size());
        attributeValueListCopy.addAll(attributeValueList);
        this.attributeValueList = attributeValueListCopy;
    }
    
    /**
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withAttributeValueList(AttributeValue... attributeValueList) {
        if (getAttributeValueList() == null) setAttributeValueList(new java.util.ArrayList<AttributeValue>(attributeValueList.length));
        for (AttributeValue value : attributeValueList) {
            getAttributeValueList().add(value);
        }
        return this;
    }
    
    /**
     * One or more values to evaluate against the supplied attribute. The
     * number of values in the list depends on the <i>ComparisonOperator</i>
     * being used. <p>For type Number, value comparisons are numeric.
     * <p>String value comparisons for greater than, equals, or less than are
     * based on ASCII character code values. For example, <code>a</code> is
     * greater than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList One or more values to evaluate against the supplied attribute. The
     *         number of values in the list depends on the <i>ComparisonOperator</i>
     *         being used. <p>For type Number, value comparisons are numeric.
     *         <p>String value comparisons for greater than, equals, or less than are
     *         based on ASCII character code values. For example, <code>a</code> is
     *         greater than <code>A</code>, and <code>aa</code> is greater than
     *         <code>B</code>. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         <p>For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values, for example when evaluating
     *         query expressions. <p>For information on specifying data types in
     *         JSON, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     *         Data Format</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExpectedAttributeValue withAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> attributeValueListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>(attributeValueList.size());
            attributeValueListCopy.addAll(attributeValueList);
            this.attributeValueList = attributeValueListCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isExists() != null) sb.append("Exists: " + isExists() + ",");
        if (getComparisonOperator() != null) sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getAttributeValueList() != null) sb.append("AttributeValueList: " + getAttributeValueList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isExists() == null) ? 0 : isExists().hashCode()); 
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValueList() == null) ? 0 : getAttributeValueList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExpectedAttributeValue == false) return false;
        ExpectedAttributeValue other = (ExpectedAttributeValue)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isExists() == null ^ this.isExists() == null) return false;
        if (other.isExists() != null && other.isExists().equals(this.isExists()) == false) return false; 
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null) return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false) return false; 
        if (other.getAttributeValueList() == null ^ this.getAttributeValueList() == null) return false;
        if (other.getAttributeValueList() != null && other.getAttributeValueList().equals(this.getAttributeValueList()) == false) return false; 
        return true;
    }
    
}
    