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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createApplication(CreateApplicationRequest) CreateApplication operation}.
 * <p>
 * Creates an application that has one configuration template named
 * <code>default</code> and no application versions.
 * </p>
 * <p>
 * <b>NOTE:</b> The default configuration template is for a 32-bit
 * version of the Amazon Linux operating system running the Tomcat 6
 * application container.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createApplication(CreateApplicationRequest)
 */
public class CreateApplicationRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application. <p> Constraint: This name must be unique
     * within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * Describes the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * Default constructor for a new CreateApplicationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateApplicationRequest() {}
    
    /**
     * Constructs a new CreateApplicationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application. <p> Constraint:
     * This name must be unique within your account. If the specified name
     * already exists, the action returns an
     * <code>InvalidParameterValue</code> error.
     */
    public CreateApplicationRequest(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application. <p> Constraint: This name must be unique
     * within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application. <p> Constraint: This name must be unique
     *         within your account. If the specified name already exists, the action
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application. <p> Constraint: This name must be unique
     * within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application. <p> Constraint: This name must be unique
     *         within your account. If the specified name already exists, the action
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application. <p> Constraint: This name must be unique
     * within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application. <p> Constraint: This name must be unique
     *         within your account. If the specified name already exists, the action
     *         returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * Describes the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes the application.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes the application.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateApplicationRequest withDescription(String description) {
        this.description = description;
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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    