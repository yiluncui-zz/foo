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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a get application revision operation.
 * </p>
 */
public class GetApplicationRevisionResult implements Serializable {

    /**
     * The name of the application that corresponds to the revision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * Additional information about the revision, including the revision's
     * type and its location.
     */
    private RevisionLocation revision;

    /**
     * General information about the revision.
     */
    private GenericRevisionInfo revisionInfo;

    /**
     * The name of the application that corresponds to the revision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application that corresponds to the revision.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application that corresponds to the revision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that corresponds to the revision.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application that corresponds to the revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that corresponds to the revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetApplicationRevisionResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Additional information about the revision, including the revision's
     * type and its location.
     *
     * @return Additional information about the revision, including the revision's
     *         type and its location.
     */
    public RevisionLocation getRevision() {
        return revision;
    }
    
    /**
     * Additional information about the revision, including the revision's
     * type and its location.
     *
     * @param revision Additional information about the revision, including the revision's
     *         type and its location.
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }
    
    /**
     * Additional information about the revision, including the revision's
     * type and its location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision Additional information about the revision, including the revision's
     *         type and its location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetApplicationRevisionResult withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * General information about the revision.
     *
     * @return General information about the revision.
     */
    public GenericRevisionInfo getRevisionInfo() {
        return revisionInfo;
    }
    
    /**
     * General information about the revision.
     *
     * @param revisionInfo General information about the revision.
     */
    public void setRevisionInfo(GenericRevisionInfo revisionInfo) {
        this.revisionInfo = revisionInfo;
    }
    
    /**
     * General information about the revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revisionInfo General information about the revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetApplicationRevisionResult withRevisionInfo(GenericRevisionInfo revisionInfo) {
        this.revisionInfo = revisionInfo;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getRevision() != null) sb.append("Revision: " + getRevision() + ",");
        if (getRevisionInfo() != null) sb.append("RevisionInfo: " + getRevisionInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode()); 
        hashCode = prime * hashCode + ((getRevisionInfo() == null) ? 0 : getRevisionInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetApplicationRevisionResult == false) return false;
        GetApplicationRevisionResult other = (GetApplicationRevisionResult)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        if (other.getRevisionInfo() == null ^ this.getRevisionInfo() == null) return false;
        if (other.getRevisionInfo() != null && other.getRevisionInfo().equals(this.getRevisionInfo()) == false) return false; 
        return true;
    }
    
}
    