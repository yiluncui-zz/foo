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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#detachVpnGateway(DetachVpnGatewayRequest) DetachVpnGateway operation}.
 * <p>
 * Detaches a VPN gateway from a VPC. You do this if you're planning to
 * turn off the VPC and not use it anymore. You can confirm a VPN gateway
 * has been completely detached from a VPC by describing the VPN gateway
 * (any attachments to the VPN gateway are also described).
 * </p>
 * <p>
 * You must wait for the attachment's state to switch to detached before
 * you can delete the VPC or attach a different VPC to the VPN gateway.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#detachVpnGateway(DetachVpnGatewayRequest)
 */
public class DetachVpnGatewayRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the VPN gateway to detach from the VPC.
     */
    private String vpnGatewayId;

    /**
     * The ID of the VPC to detach the VPN gateway from.
     */
    private String vpcId;

    /**
     * Default constructor for a new DetachVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DetachVpnGatewayRequest() {}
    
    /**
     * Constructs a new DetachVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vpnGatewayId The ID of the VPN gateway to detach from the VPC.
     * @param vpcId The ID of the VPC to detach the VPN gateway from.
     */
    public DetachVpnGatewayRequest(String vpnGatewayId, String vpcId) {
        this.vpnGatewayId = vpnGatewayId;
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPN gateway to detach from the VPC.
     *
     * @return The ID of the VPN gateway to detach from the VPC.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to detach from the VPC.
     *
     * @param vpnGatewayId The ID of the VPN gateway to detach from the VPC.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the VPN gateway to detach from the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the VPN gateway to detach from the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    
    
    /**
     * The ID of the VPC to detach the VPN gateway from.
     *
     * @return The ID of the VPC to detach the VPN gateway from.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC to detach the VPN gateway from.
     *
     * @param vpcId The ID of the VPC to detach the VPN gateway from.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC to detach the VPN gateway from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC to detach the VPN gateway from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVpnGatewayRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        sb.append("VpnGatewayId: " + vpnGatewayId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    