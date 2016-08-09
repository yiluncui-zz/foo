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

/**
 * <p>
 * The CustomerGateway data type.
 * </p>
 */
public class CustomerGateway {

    /**
     * Specifies the ID of the customer gateway.
     */
    private String customerGatewayId;

    /**
     * Describes the current state of the customer gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     */
    private String state;

    /**
     * Specifies the type of VPN connection the customer gateway supports.
     */
    private String type;

    /**
     * Contains the Internet-routable IP address of the customer gateway's
     * outside interface.
     */
    private String ipAddress;

    /**
     * Specifies the customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     */
    private String bgpAsn;

    /**
     * A list of tags for the CustomerGateway.
     */
    private java.util.List<Tag> tags;

    /**
     * Specifies the ID of the customer gateway.
     *
     * @return Specifies the ID of the customer gateway.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * Specifies the ID of the customer gateway.
     *
     * @param customerGatewayId Specifies the ID of the customer gateway.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * Specifies the ID of the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId Specifies the ID of the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    
    
    /**
     * Describes the current state of the customer gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @return Describes the current state of the customer gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the customer gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @param state Describes the current state of the customer gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the customer gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Describes the current state of the customer gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Specifies the type of VPN connection the customer gateway supports.
     *
     * @return Specifies the type of VPN connection the customer gateway supports.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Specifies the type of VPN connection the customer gateway supports.
     *
     * @param type Specifies the type of VPN connection the customer gateway supports.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Specifies the type of VPN connection the customer gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type Specifies the type of VPN connection the customer gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Contains the Internet-routable IP address of the customer gateway's
     * outside interface.
     *
     * @return Contains the Internet-routable IP address of the customer gateway's
     *         outside interface.
     */
    public String getIpAddress() {
        return ipAddress;
    }
    
    /**
     * Contains the Internet-routable IP address of the customer gateway's
     * outside interface.
     *
     * @param ipAddress Contains the Internet-routable IP address of the customer gateway's
     *         outside interface.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    /**
     * Contains the Internet-routable IP address of the customer gateway's
     * outside interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipAddress Contains the Internet-routable IP address of the customer gateway's
     *         outside interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    
    
    /**
     * Specifies the customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     *
     * @return Specifies the customer gateway's Border Gateway Protocol (BGP)
     *         Autonomous System Number (ASN).
     */
    public String getBgpAsn() {
        return bgpAsn;
    }
    
    /**
     * Specifies the customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     *
     * @param bgpAsn Specifies the customer gateway's Border Gateway Protocol (BGP)
     *         Autonomous System Number (ASN).
     */
    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }
    
    /**
     * Specifies the customer gateway's Border Gateway Protocol (BGP)
     * Autonomous System Number (ASN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bgpAsn Specifies the customer gateway's Border Gateway Protocol (BGP)
     *         Autonomous System Number (ASN).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }
    
    
    /**
     * A list of tags for the CustomerGateway.
     *
     * @return A list of tags for the CustomerGateway.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the CustomerGateway.
     *
     * @param tags A list of tags for the CustomerGateway.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the CustomerGateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the CustomerGateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withTags(Tag... tags) {
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the CustomerGateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the CustomerGateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CustomerGateway withTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("CustomerGatewayId: " + customerGatewayId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("Type: " + type + ", ");
        sb.append("IpAddress: " + ipAddress + ", ");
        sb.append("BgpAsn: " + bgpAsn + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    