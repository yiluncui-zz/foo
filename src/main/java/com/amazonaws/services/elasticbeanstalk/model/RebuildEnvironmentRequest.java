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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#rebuildEnvironment(RebuildEnvironmentRequest) RebuildEnvironment operation}.
 * <p>
 * Deletes and recreates all of the AWS resources (for example: the Auto
 * Scaling group, load balancer, etc.) for a specified environment and
 * forces a restart.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#rebuildEnvironment(RebuildEnvironmentRequest)
 */
public class RebuildEnvironmentRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the environment to rebuild.
     */
    private String environmentId;

    /**
     * The name of the environment to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * Default constructor for a new RebuildEnvironmentRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RebuildEnvironmentRequest() {}
    
    /**
     * The ID of the environment to rebuild.
     *
     * @return The ID of the environment to rebuild.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment to rebuild.
     *
     * @param environmentId The ID of the environment to rebuild.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment to rebuild.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment to rebuild.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RebuildEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * The name of the environment to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment to rebuild.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to rebuild.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment to rebuild.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment to rebuild.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RebuildEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
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
        sb.append("EnvironmentId: " + environmentId + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    