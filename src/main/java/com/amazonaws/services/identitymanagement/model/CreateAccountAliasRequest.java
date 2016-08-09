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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccountAlias(CreateAccountAliasRequest) CreateAccountAlias operation}.
 * <p>
 * This action creates an alias for your AWS Account. For information
 * about using an AWS Account alias, see <a
 * ://docs.amazonwebservices.com/IAM/latest/UserGuide/AccountAlias.html">
 * Using an Alias for Your AWS Account ID </a> in <i>Using AWS Identity
 * and Access Management</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccountAlias(CreateAccountAliasRequest)
 */
public class CreateAccountAliasRequest extends AmazonWebServiceRequest {

    /**
     * Name of the account alias to create
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     */
    private String accountAlias;

    /**
     * Default constructor for a new CreateAccountAliasRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateAccountAliasRequest() {}
    
    /**
     * Constructs a new CreateAccountAliasRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountAlias Name of the account alias to create
     */
    public CreateAccountAliasRequest(String accountAlias) {
        this.accountAlias = accountAlias;
    }
    
    /**
     * Name of the account alias to create
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @return Name of the account alias to create
     */
    public String getAccountAlias() {
        return accountAlias;
    }
    
    /**
     * Name of the account alias to create
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @param accountAlias Name of the account alias to create
     */
    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }
    
    /**
     * Name of the account alias to create
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$<br/>
     *
     * @param accountAlias Name of the account alias to create
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateAccountAliasRequest withAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
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
        sb.append("AccountAlias: " + accountAlias + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    