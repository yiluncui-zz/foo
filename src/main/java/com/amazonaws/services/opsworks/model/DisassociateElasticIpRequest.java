/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#disassociateElasticIp(DisassociateElasticIpRequest) DisassociateElasticIp operation}.
 * <p>
 * Disassociates an Elastic IP address from its instance. The address
 * remains registered with the stack. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
 * .
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack, or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#disassociateElasticIp(DisassociateElasticIpRequest)
 */
public class DisassociateElasticIpRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Elastic IP address.
     */
    private String elasticIp;

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param elasticIp The Elastic IP address.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisassociateElasticIpRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
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
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisassociateElasticIpRequest == false) return false;
        DisassociateElasticIpRequest other = (DisassociateElasticIpRequest)obj;
        
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        return true;
    }
    
}
    