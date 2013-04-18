/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a <i>Scan</i> operation.
 * </p>
 */
public class ScanResult  implements Serializable  {

    /**
     * An array of item attributes that match the scan criteria. Each element
     * in this array consists of an attribute name and the value for that
     * attribute.
     */
    private java.util.List<java.util.Map<String,AttributeValue>> items;

    /**
     * The number of items in the response.
     */
    private Integer count;

    /**
     * The number of items in the complete scan, before any filters are
     * applied. A high <i>ScannedCount</i> value with few, or no,
     * <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     * and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    private Integer scannedCount;

    /**
     * The primary key of the item where the operation stopped, inclusive of
     * the previous result set. Use this value to start a new operation,
     * excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     * null when the entire result set is complete (in other words, when the
     * operation processed the "last page" of results).
     */
    private java.util.Map<String,AttributeValue> lastEvaluatedKey;

    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * An array of item attributes that match the scan criteria. Each element
     * in this array consists of an attribute name and the value for that
     * attribute.
     *
     * @return An array of item attributes that match the scan criteria. Each element
     *         in this array consists of an attribute name and the value for that
     *         attribute.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getItems() {
        
        return items;
    }
    
    /**
     * An array of item attributes that match the scan criteria. Each element
     * in this array consists of an attribute name and the value for that
     * attribute.
     *
     * @param items An array of item attributes that match the scan criteria. Each element
     *         in this array consists of an attribute name and the value for that
     *         attribute.
     */
    public void setItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * An array of item attributes that match the scan criteria. Each element
     * in this array consists of an attribute name and the value for that
     * attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items An array of item attributes that match the scan criteria. Each element
     *         in this array consists of an attribute name and the value for that
     *         attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withItems(java.util.Map<String,AttributeValue>... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.length));
        for (java.util.Map<String,AttributeValue> value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * An array of item attributes that match the scan criteria. Each element
     * in this array consists of an attribute name and the value for that
     * attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items An array of item attributes that match the scan criteria. Each element
     *         in this array consists of an attribute name and the value for that
     *         attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
        } else {
            java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

        return this;
    }
    
    /**
     * The number of items in the response.
     *
     * @return The number of items in the response.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * The number of items in the response.
     *
     * @param count The number of items in the response.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * The number of items in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The number of items in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withCount(Integer count) {
        this.count = count;
        return this;
    }
    
    
    /**
     * The number of items in the complete scan, before any filters are
     * applied. A high <i>ScannedCount</i> value with few, or no,
     * <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     * and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return The number of items in the complete scan, before any filters are
     *         applied. A high <i>ScannedCount</i> value with few, or no,
     *         <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     *         and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public Integer getScannedCount() {
        return scannedCount;
    }
    
    /**
     * The number of items in the complete scan, before any filters are
     * applied. A high <i>ScannedCount</i> value with few, or no,
     * <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     * and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @param scannedCount The number of items in the complete scan, before any filters are
     *         applied. A high <i>ScannedCount</i> value with few, or no,
     *         <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     *         and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
    }
    
    /**
     * The number of items in the complete scan, before any filters are
     * applied. A high <i>ScannedCount</i> value with few, or no,
     * <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     * and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scannedCount The number of items in the complete scan, before any filters are
     *         applied. A high <i>ScannedCount</i> value with few, or no,
     *         <i>Count</i> results indicates an inefficient <i>Scan</i> operation.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count
     *         and ScannedCount</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withScannedCount(Integer scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }
    
    
    /**
     * The primary key of the item where the operation stopped, inclusive of
     * the previous result set. Use this value to start a new operation,
     * excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     * null when the entire result set is complete (in other words, when the
     * operation processed the "last page" of results).
     *
     * @return The primary key of the item where the operation stopped, inclusive of
     *         the previous result set. Use this value to start a new operation,
     *         excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     *         null when the entire result set is complete (in other words, when the
     *         operation processed the "last page" of results).
     */
    public java.util.Map<String,AttributeValue> getLastEvaluatedKey() {
        
        return lastEvaluatedKey;

    }
    
    /**
     * The primary key of the item where the operation stopped, inclusive of
     * the previous result set. Use this value to start a new operation,
     * excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     * null when the entire result set is complete (in other words, when the
     * operation processed the "last page" of results).
     *
     * @param lastEvaluatedKey The primary key of the item where the operation stopped, inclusive of
     *         the previous result set. Use this value to start a new operation,
     *         excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     *         null when the entire result set is complete (in other words, when the
     *         operation processed the "last page" of results).
     */
    public void setLastEvaluatedKey(java.util.Map<String,AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }
    
    /**
     * The primary key of the item where the operation stopped, inclusive of
     * the previous result set. Use this value to start a new operation,
     * excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     * null when the entire result set is complete (in other words, when the
     * operation processed the "last page" of results).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastEvaluatedKey The primary key of the item where the operation stopped, inclusive of
     *         the previous result set. Use this value to start a new operation,
     *         excluding this value in the new request. <p><i>LastEvaluatedKey</i> is
     *         null when the entire result set is complete (in other words, when the
     *         operation processed the "last page" of results).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withLastEvaluatedKey(java.util.Map<String,AttributeValue> lastEvaluatedKey) {
        setLastEvaluatedKey(lastEvaluatedKey);
        return this;
    }
    
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public ConsumedCapacity getConsumedCapacity() {
        return consumedCapacity;
    }
    
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @param consumedCapacity The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }
    
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> of the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
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
        if (getItems() != null) sb.append("Items: " + getItems() + ",");    	
        if (getCount() != null) sb.append("Count: " + getCount() + ",");    	
        if (getScannedCount() != null) sb.append("ScannedCount: " + getScannedCount() + ",");    	
        if (getLastEvaluatedKey() != null) sb.append("LastEvaluatedKey: " + getLastEvaluatedKey() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getScannedCount() == null) ? 0 : getScannedCount().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScanResult == false) return false;
        ScanResult other = (ScanResult)obj;
        
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getScannedCount() == null ^ this.getScannedCount() == null) return false;
        if (other.getScannedCount() != null && other.getScannedCount().equals(this.getScannedCount()) == false) return false; 
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null) return false;
        if (other.getLastEvaluatedKey() != null && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    