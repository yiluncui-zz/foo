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
package com.amazonaws.services.identitymanagement.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listUsers(ListUsersRequest) ListUsers operation}.
 * <p>
 * Lists the Users that have the specified path prefix. If there are
 * none, the action returns an empty list.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listUsers(ListUsersRequest)
 */
public class ListUsersRequest extends AmazonWebServiceRequest {

    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all User
     * names whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all User names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     */
    private String pathPrefix;

    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>Marker</code> element
     * in the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * Use this parameter only when paginating results to indicate the
     * maximum number of User names you want in the response. If there are
     * additional User names beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all User
     * names whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all User names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @return The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all User
     *         names whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all User names.
     */
    public String getPathPrefix() {
        return pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all User
     * names whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all User names.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all User
     *         names whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all User names.
     */
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all User
     * names whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all User names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all User
     *         names whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all User names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListUsersRequest withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    
    
    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>Marker</code> element
     * in the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>Marker</code> element
     *         in the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>Marker</code> element
     * in the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>Marker</code> element
     *         in the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * are truncated. Set it to the value of the <code>Marker</code> element
     * in the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this parameter only when paginating results, and only in a
     *         subsequent request after you've received a response where the results
     *         are truncated. Set it to the value of the <code>Marker</code> element
     *         in the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListUsersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Use this parameter only when paginating results to indicate the
     * maximum number of User names you want in the response. If there are
     * additional User names beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this parameter only when paginating results to indicate the
     *         maximum number of User names you want in the response. If there are
     *         additional User names beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this parameter only when paginating results to indicate the
     * maximum number of User names you want in the response. If there are
     * additional User names beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this parameter only when paginating results to indicate the
     *         maximum number of User names you want in the response. If there are
     *         additional User names beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this parameter only when paginating results to indicate the
     * maximum number of User names you want in the response. If there are
     * additional User names beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this parameter only when paginating results to indicate the
     *         maximum number of User names you want in the response. If there are
     *         additional User names beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListUsersRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        sb.append("PathPrefix: " + pathPrefix + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("MaxItems: " + maxItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    