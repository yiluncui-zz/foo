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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#requestEnvironmentInfo(RequestEnvironmentInfoRequest) RequestEnvironmentInfo operation}.
 * <p>
 * Initiates a request to compile the specified type of information of
 * the deployed environment.
 * </p>
 * <p>
 * Setting the <code>InfoType</code> to <code>tail</code> compiles the
 * last lines from the application server log files of every Amazon EC2
 * instance in your environment. Use RetrieveEnvironmentInfo to access
 * the compiled information.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * 
 * <ul>
 * <li> RetrieveEnvironmentInfo </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#requestEnvironmentInfo(RequestEnvironmentInfoRequest)
 */
public class RequestEnvironmentInfoRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     */
    private String environmentId;

    /**
     * The name of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The type of information to request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     */
    private String infoType;

    /**
     * Default constructor for a new RequestEnvironmentInfoRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RequestEnvironmentInfoRequest() {}
    
    /**
     * Constructs a new RequestEnvironmentInfoRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param infoType The type of information to request.
     */
    public RequestEnvironmentInfoRequest(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The ID of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     *
     * @return The ID of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     *
     * @param environmentId The ID of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequestEnvironmentInfoRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * The name of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment of the requested data. <p> If no such
     * environment is found, <code>RequestEnvironmentInfo</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment of the requested data. <p> If no such
     *         environment is found, <code>RequestEnvironmentInfo</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequestEnvironmentInfoRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * The type of information to request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @return The type of information to request.
     *
     * @see EnvironmentInfoType
     */
    public String getInfoType() {
        return infoType;
    }
    
    /**
     * The type of information to request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information to request.
     *
     * @see EnvironmentInfoType
     */
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
    
    /**
     * The type of information to request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tail
     *
     * @param infoType The type of information to request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EnvironmentInfoType
     */
    public RequestEnvironmentInfoRequest withInfoType(String infoType) {
        this.infoType = infoType;
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
        sb.append("InfoType: " + infoType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    