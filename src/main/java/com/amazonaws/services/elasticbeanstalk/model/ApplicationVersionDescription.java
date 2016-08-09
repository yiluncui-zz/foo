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
 * Describes the properties of an application version.
 * </p>
 */
public class ApplicationVersionDescription {

    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * The location where the source bundle is located for this version.
     */
    private S3Location sourceBundle;

    /**
     * The creation date of the application version.
     */
    private java.util.Date dateCreated;

    /**
     * The last modified date of the application version.
     */
    private java.util.Date dateUpdated;

    /**
     * Default constructor for a new ApplicationVersionDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ApplicationVersionDescription() {}
    
    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with this release.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this release.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with this release.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this release.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return The description of this application version.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description The description of this application version.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of this application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description The description of this application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A label uniquely identifying the version for the associated
     *         application.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label uniquely identifying the version for the associated
     *         application.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label uniquely identifying the version for the associated
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * The location where the source bundle is located for this version.
     *
     * @return The location where the source bundle is located for this version.
     */
    public S3Location getSourceBundle() {
        return sourceBundle;
    }
    
    /**
     * The location where the source bundle is located for this version.
     *
     * @param sourceBundle The location where the source bundle is located for this version.
     */
    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }
    
    /**
     * The location where the source bundle is located for this version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceBundle The location where the source bundle is located for this version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }
    
    
    /**
     * The creation date of the application version.
     *
     * @return The creation date of the application version.
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * The creation date of the application version.
     *
     * @param dateCreated The creation date of the application version.
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    /**
     * The creation date of the application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateCreated The creation date of the application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    
    /**
     * The last modified date of the application version.
     *
     * @return The last modified date of the application version.
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }
    
    /**
     * The last modified date of the application version.
     *
     * @param dateUpdated The last modified date of the application version.
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    /**
     * The last modified date of the application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateUpdated The last modified date of the application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationVersionDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
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
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("SourceBundle: " + sourceBundle + ", ");
        sb.append("DateCreated: " + dateCreated + ", ");
        sb.append("DateUpdated: " + dateUpdated + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    