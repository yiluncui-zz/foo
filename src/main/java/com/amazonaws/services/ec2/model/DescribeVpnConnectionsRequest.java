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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest) DescribeVpnConnections operation}.
 * <p>
 * Gives you information about your VPN connections.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> We strongly recommend you use HTTPS when calling
 * this operation because the response contains sensitive cryptographic
 * information for configuring your customer gateway. You can filter the
 * results to return information only about VPN connections that match
 * criteria you specify. For example, you could ask to get information
 * about a particular VPN connection (or all) only if the VPN's state is
 * pending or available. You can specify multiple filters (e.g., the VPN
 * connection is associated with a particular VPN gateway, and the
 * gateway's state is pending or available). The result includes
 * information for a particular VPN connection only if the VPN connection
 * matches all your filters. If there's no match, no special message is
 * returned; the response is simply empty. The following table shows the
 * available filters.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpnConnections(DescribeVpnConnectionsRequest)
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest {

    /**
     * A VPN connection ID. More than one may be specified per request.
     */
    private java.util.List<String> vpnConnectionIds;

    private java.util.List<Filter> filters;

    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @return A VPN connection ID. More than one may be specified per request.
     */
    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
            vpnConnectionIds = new java.util.ArrayList<String>();
        }
        return vpnConnectionIds;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     */
    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        java.util.List<String> vpnConnectionIdsCopy = new java.util.ArrayList<String>();
        if (vpnConnectionIds != null) {
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        }
        this.vpnConnectionIds = vpnConnectionIdsCopy;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(String... vpnConnectionIds) {
        for (String value : vpnConnectionIds) {
            getVpnConnectionIds().add(value);
        }
        return this;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        java.util.List<String> vpnConnectionIdsCopy = new java.util.ArrayList<String>();
        if (vpnConnectionIds != null) {
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        }
        this.vpnConnectionIds = vpnConnectionIdsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Filters property for this object.
     *
     * @return The value of the Filters property for this object.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     *
     * @param filters The new value for the Filters property for this object.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
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
        sb.append("VpnConnectionIds: " + vpnConnectionIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    