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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listMFADevices(ListMFADevicesRequest) ListMFADevices operation}.
 * <p>
 * Lists the MFA devices associated with the specified User name.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listMFADevices(ListMFADevicesRequest)
 */
public class ListMFADevicesRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User whose MFA devices you want to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of keys you want in the response. If there are additional keys beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Default constructor for a new ListMFADevicesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListMFADevicesRequest() {}
    
    /**
     * Constructs a new ListMFADevicesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the User whose MFA devices you want to list.
     */
    public ListMFADevicesRequest(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose MFA devices you want to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User whose MFA devices you want to list.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User whose MFA devices you want to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose MFA devices you want to list.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose MFA devices you want to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose MFA devices you want to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of keys you want in the response. If there are additional keys beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of keys you want in the response. If there are additional keys beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of keys you want in the response. If there are additional keys beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of keys you want in the response. If there are additional keys beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of keys you want in the response. If there are additional keys beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of keys you want in the response. If there are additional keys beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesRequest withMaxItems(Integer maxItems) {
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
        sb.append("UserName: " + userName + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("MaxItems: " + maxItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    