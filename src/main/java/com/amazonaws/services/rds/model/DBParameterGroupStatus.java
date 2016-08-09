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

/**
 * <p>
 * The status of the DP Parameter Group.
 * </p>
 */
public class DBParameterGroupStatus {

    /**
     * The name of the DP Parameter Group.
     */
    private String dBParameterGroupName;

    /**
     * The status of parameter updates.
     */
    private String parameterApplyStatus;

    /**
     * Default constructor for a new DBParameterGroupStatus object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DBParameterGroupStatus() {}
    
    /**
     * The name of the DP Parameter Group.
     *
     * @return The name of the DP Parameter Group.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DP Parameter Group.
     *
     * @param dBParameterGroupName The name of the DP Parameter Group.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DP Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DP Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBParameterGroupStatus withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * The status of parameter updates.
     *
     * @return The status of parameter updates.
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     *
     * @param parameterApplyStatus The status of parameter updates.
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterApplyStatus The status of parameter updates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
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
        sb.append("DBParameterGroupName: " + dBParameterGroupName + ", ");
        sb.append("ParameterApplyStatus: " + parameterApplyStatus + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    