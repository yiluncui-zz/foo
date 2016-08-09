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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateApplication(UpdateApplicationRequest) UpdateApplication operation}.
 * <p>
 * Updates the specified application to have the specified properties.
 * </p>
 * <p>
 * <b>NOTE:</b> If a property (for example, description) is not provided,
 * the value remains unchanged. To clear these properties, specify an
 * empty string.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateApplication(UpdateApplicationRequest)
 */
public class UpdateApplicationRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application to update. If no such application is
     * found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * A new description for the application. <p>Default: If not specified,
     * AWS Elastic Beanstalk does not update the description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * Default constructor for a new UpdateApplicationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateApplicationRequest() {}
    
    /**
     * Constructs a new UpdateApplicationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to update. If no
     * such application is found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     */
    public UpdateApplicationRequest(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to update. If no such application is
     * found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to update. If no such application is
     *         found, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to update. If no such application is
     * found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to update. If no such application is
     *         found, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to update. If no such application is
     * found, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to update. If no such application is
     *         found, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * A new description for the application. <p>Default: If not specified,
     * AWS Elastic Beanstalk does not update the description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return A new description for the application. <p>Default: If not specified,
     *         AWS Elastic Beanstalk does not update the description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A new description for the application. <p>Default: If not specified,
     * AWS Elastic Beanstalk does not update the description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for the application. <p>Default: If not specified,
     *         AWS Elastic Beanstalk does not update the description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A new description for the application. <p>Default: If not specified,
     * AWS Elastic Beanstalk does not update the description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for the application. <p>Default: If not specified,
     *         AWS Elastic Beanstalk does not update the description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationRequest withDescription(String description) {
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
    