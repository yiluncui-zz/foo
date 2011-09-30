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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeRouteTables(DescribeRouteTablesRequest) DescribeRouteTables operation}.
 * <p>
 * Gives you information about your route tables. You can filter the
 * results to return information only about tables that match criteria
 * you specify. For example, you could get information only about a table
 * associated with a particular subnet. You can specify multiple values
 * for the filter. The table must match at least one of the specified
 * values for it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters (e.g., the table has a particular
 * route, and is associated with a particular subnet). The result
 * includes information for a particular table only if it matches all
 * your filters. If there's no match, no special message is returned; the
 * response is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: an asterisk matches
 * zero or more characters, and <code>?</code> matches exactly one
 * character. You can escape special characters using a backslash before
 * the character. For example, a value of <code>\*amazon\?\\</code>
 * searches for the literal string <code>*amazon?\</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeRouteTables(DescribeRouteTablesRequest)
 */
public class DescribeRouteTablesRequest extends AmazonWebServiceRequest {

    /**
     * One or more route table IDs.
     */
    private java.util.List<String> routeTableIds;

    /**
     * A list of filters used to match properties for Route Tables. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * One or more route table IDs.
     *
     * @return One or more route table IDs.
     */
    public java.util.List<String> getRouteTableIds() {
        
        if (routeTableIds == null) {
            routeTableIds = new java.util.ArrayList<String>();
        }
        return routeTableIds;
    }
    
    /**
     * One or more route table IDs.
     *
     * @param routeTableIds One or more route table IDs.
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        java.util.List<String> routeTableIdsCopy = new java.util.ArrayList<String>();
        if (routeTableIds != null) {
            routeTableIdsCopy.addAll(routeTableIds);
        }
        this.routeTableIds = routeTableIdsCopy;
    }
    
    /**
     * One or more route table IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRouteTablesRequest withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) setRouteTableIds(new java.util.ArrayList<String>());
        for (String value : routeTableIds) {
            getRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route table IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRouteTablesRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        java.util.List<String> routeTableIdsCopy = new java.util.ArrayList<String>();
        if (routeTableIds != null) {
            routeTableIdsCopy.addAll(routeTableIds);
        }
        this.routeTableIds = routeTableIdsCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for Route Tables. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Route Tables. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Route Tables. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Route Tables. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for Route Tables. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Route Tables. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRouteTablesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>());
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Route Tables. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Route Tables. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRouteTablesRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

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
        sb.append("RouteTableIds: " + routeTableIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    