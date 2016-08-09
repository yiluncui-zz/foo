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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getLoginProfile(GetLoginProfileRequest) GetLoginProfile operation}.
 * <p>
 * Retrieves the login profile for the specified User.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getLoginProfile(GetLoginProfileRequest)
 */
public class GetLoginProfileRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User whose login profile you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Default constructor for a new GetLoginProfileRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetLoginProfileRequest() {}
    
    /**
     * Constructs a new GetLoginProfileRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the User whose login profile you want to
     * retrieve.
     */
    public GetLoginProfileRequest(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose login profile you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User whose login profile you want to retrieve.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User whose login profile you want to retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose login profile you want to retrieve.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose login profile you want to retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose login profile you want to retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetLoginProfileRequest withUserName(String userName) {
        this.userName = userName;
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
        sb.append("}");
        return sb.toString();
    }
    
}
    