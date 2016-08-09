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
 * The information retrieved from the Amazon EC2 instances.
 * </p>
 */
public class EnvironmentInfoDescription {

    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     */
    private String infoType;

    /**
     * The Amazon EC2 Instance ID for this information.
     */
    private String ec2InstanceId;

    /**
     * The time stamp when this information was retrieved.
     */
    private java.util.Date sampleTimestamp;

    /**
     * The retrieved information.
     */
    private String message;

    /**
     * Default constructor for a new EnvironmentInfoDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EnvironmentInfoDescription() {}
    
    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @return The type of information retrieved.
     *
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }
    
    /**
     * The type of information retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The type of information retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EnvironmentInfoType
     */
    public EnvironmentInfoDescription withInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }
    
    
    /**
     * The Amazon EC2 Instance ID for this information.
     *
     * @return The Amazon EC2 Instance ID for this information.
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 Instance ID for this information.
     *
     * @param ec2InstanceId The Amazon EC2 Instance ID for this information.
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }
    
    /**
     * The Amazon EC2 Instance ID for this information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceId The Amazon EC2 Instance ID for this information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnvironmentInfoDescription withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }
    
    
    /**
     * The time stamp when this information was retrieved.
     *
     * @return The time stamp when this information was retrieved.
     */
    public java.util.Date getSampleTimestamp() {
        return sampleTimestamp;
    }
    
    /**
     * The time stamp when this information was retrieved.
     *
     * @param sampleTimestamp The time stamp when this information was retrieved.
     */
    public void setSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
    }
    
    /**
     * The time stamp when this information was retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sampleTimestamp The time stamp when this information was retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnvironmentInfoDescription withSampleTimestamp(java.util.Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
        return this;
    }
    
    
    /**
     * The retrieved information.
     *
     * @return The retrieved information.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The retrieved information.
     *
     * @param message The retrieved information.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The retrieved information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The retrieved information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnvironmentInfoDescription withMessage(String message) {
        this.message = message;
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
        sb.append("InfoType: " + infoType + ", ");
        sb.append("Ec2InstanceId: " + ec2InstanceId + ", ");
        sb.append("SampleTimestamp: " + sampleTimestamp + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    