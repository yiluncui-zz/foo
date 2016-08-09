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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#rebootDBInstance(RebootDBInstanceRequest) RebootDBInstance operation}.
 * <p>
 * The RebootDBInstance API reboots a previously provisioned RDS
 * instance. This API results in the application of modified
 * DBParameterGroup parameters with ApplyStatus of pending-reboot to the
 * RDS instance. This action is taken as soon as possible, and results in
 * a momentary outage to the RDS instance during which the RDS instance
 * status is set to rebooting. A DBInstance event is created when the
 * reboot is completed.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#rebootDBInstance(RebootDBInstanceRequest)
 */
public class RebootDBInstanceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     */
    private String dBInstanceIdentifier;

    /**
     * Default constructor for a new RebootDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RebootDBInstanceRequest() {}
    
    /**
     * Constructs a new RebootDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter
     * is stored as a lowercase string.
     */
    public RebootDBInstanceRequest(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     *
     * @return The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This parameter is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RebootDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    