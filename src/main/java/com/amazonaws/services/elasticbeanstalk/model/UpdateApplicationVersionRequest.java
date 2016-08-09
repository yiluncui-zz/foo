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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateApplicationVersion(UpdateApplicationVersionRequest) UpdateApplicationVersion operation}.
 * <p>
 * Updates the specified application version to have the specified
 * properties.
 * </p>
 * <p>
 * <b>NOTE:</b> If a property (for example, description) is not provided,
 * the value remains unchanged. To clear properties, specify an empty
 * string.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateApplicationVersion(UpdateApplicationVersionRequest)
 */
public class UpdateApplicationVersionRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application associated with this version. <p> If no
     * application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the version to update. <p> If no application version is
     * found with this label, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * A new description for this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * Default constructor for a new UpdateApplicationVersionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateApplicationVersionRequest() {}
    
    /**
     * Constructs a new UpdateApplicationVersionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application associated with
     * this version. <p> If no application is found with this name,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * @param versionLabel The name of the version to update. <p> If no
     * application version is found with this label,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     */
    public UpdateApplicationVersionRequest(String applicationName, String versionLabel) {
        this.applicationName = applicationName;
        this.versionLabel = versionLabel;
    }
    
    /**
     * The name of the application associated with this version. <p> If no
     * application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with this version. <p> If no
     *         application is found with this name, <code>UpdateApplication</code>
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with this version. <p> If no
     * application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this version. <p> If no
     *         application is found with this name, <code>UpdateApplication</code>
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with this version. <p> If no
     * application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this version. <p> If no
     *         application is found with this name, <code>UpdateApplication</code>
     *         returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the version to update. <p> If no application version is
     * found with this label, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the version to update. <p> If no application version is
     *         found with this label, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The name of the version to update. <p> If no application version is
     * found with this label, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The name of the version to update. <p> If no application version is
     *         found with this label, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The name of the version to update. <p> If no application version is
     * found with this label, <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The name of the version to update. <p> If no application version is
     *         found with this label, <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * A new description for this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return A new description for this release.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A new description for this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for this release.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A new description for this release.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for this release.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateApplicationVersionRequest withDescription(String description) {
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
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    