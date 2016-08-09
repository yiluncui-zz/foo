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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpnGateway(CreateVpnGatewayRequest) CreateVpnGateway operation}.
 * <p>
 * Creates a new VPN gateway. A VPN gateway is the VPC-side endpoint for
 * your VPN connection. You can create a VPN gateway before creating the
 * VPC itself.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpnGateway(CreateVpnGatewayRequest)
 */
public class CreateVpnGatewayRequest extends AmazonWebServiceRequest {

    /**
     * The type of VPN connection this VPN gateway supports.
     */
    private String type;

    /**
     * The Availability Zone in which to create the VPN gateway.
     */
    private String availabilityZone;

    /**
     * Default constructor for a new CreateVpnGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateVpnGatewayRequest() {}
    
    /**
     * Constructs a new CreateVpnGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param type The type of VPN connection this VPN gateway supports.
     */
    public CreateVpnGatewayRequest(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     *
     * @return The type of VPN connection this VPN gateway supports.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     *
     * @param type The type of VPN connection this VPN gateway supports.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection this VPN gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of VPN connection this VPN gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * The Availability Zone in which to create the VPN gateway.
     *
     * @return The Availability Zone in which to create the VPN gateway.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the VPN gateway.
     *
     * @param availabilityZone The Availability Zone in which to create the VPN gateway.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which to create the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which to create the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnGatewayRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        sb.append("Type: " + type + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    