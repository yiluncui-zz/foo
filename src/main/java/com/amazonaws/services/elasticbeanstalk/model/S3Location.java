/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * A specification of a location in Amazon S3.
 * </p>
 */
public class S3Location {

    /**
     * The Amazon S3 bucket where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String s3Bucket;

    /**
     * The Amazon S3 key where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String s3Key;

    /**
     * Default constructor for a new S3Location object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public S3Location() {}
    
    /**
     * Constructs a new S3Location object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param s3Bucket The Amazon S3 bucket where the data is located.
     * @param s3Key The Amazon S3 key where the data is located.
     */
    public S3Location(String s3Bucket, String s3Key) {
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
    }
    
    /**
     * The Amazon S3 bucket where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The Amazon S3 bucket where the data is located.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * The Amazon S3 bucket where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param s3Bucket The Amazon S3 bucket where the data is located.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * The Amazon S3 bucket where the data is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param s3Bucket The Amazon S3 bucket where the data is located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public S3Location withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }
    
    
    /**
     * The Amazon S3 key where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The Amazon S3 key where the data is located.
     */
    public String getS3Key() {
        return s3Key;
    }
    
    /**
     * The Amazon S3 key where the data is located.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param s3Key The Amazon S3 key where the data is located.
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }
    
    /**
     * The Amazon S3 key where the data is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param s3Key The Amazon S3 key where the data is located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public S3Location withS3Key(String s3Key) {
        this.s3Key = s3Key;
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
        sb.append("S3Bucket: " + s3Bucket + ", ");
        sb.append("S3Key: " + s3Key + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    