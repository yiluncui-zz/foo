/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * List Domains Request
 */
public class ListDomainsRequest extends AmazonWebServiceRequest {

    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     */
    private Integer maxNumberOfDomains;

    /**
     * String that tells Amazon SimpleDB where to start the next list of
     * domain names.
     */
    private String nextToken;

    /**
     * Default constructor for a new ListDomainsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListDomainsRequest() {}
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     *
     * @return The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     */
    public Integer getMaxNumberOfDomains() {
        return maxNumberOfDomains;
    }
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     *
     * @param maxNumberOfDomains The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     */
    public void setMaxNumberOfDomains(Integer maxNumberOfDomains) {
        this.maxNumberOfDomains = maxNumberOfDomains;
    }
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfDomains The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDomainsRequest withMaxNumberOfDomains(Integer maxNumberOfDomains) {
        this.maxNumberOfDomains = maxNumberOfDomains;
        return this;
    }
    
    
    /**
     * String that tells Amazon SimpleDB where to start the next list of
     * domain names.
     *
     * @return String that tells Amazon SimpleDB where to start the next list of
     *         domain names.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that tells Amazon SimpleDB where to start the next list of
     * domain names.
     *
     * @param nextToken String that tells Amazon SimpleDB where to start the next list of
     *         domain names.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that tells Amazon SimpleDB where to start the next list of
     * domain names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken String that tells Amazon SimpleDB where to start the next list of
     *         domain names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDomainsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("MaxNumberOfDomains: " + maxNumberOfDomains + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    