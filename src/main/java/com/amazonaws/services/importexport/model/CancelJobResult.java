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
package com.amazonaws.services.importexport.model;

/**
 * <p>
 * Output structure for the CancelJob operation.
 * </p>
 */
public class CancelJobResult {

    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     */
    private Boolean success;

    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @return Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public Boolean isSuccess() {
        return success;
    }
    
    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @param success Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    
    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param success Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelJobResult withSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    
    
    /**
     * Specifies whether (true) or not (false) AWS Import/Export updated your
     * job.
     *
     * @return Specifies whether (true) or not (false) AWS Import/Export updated your
     *         job.
     */
    public Boolean getSuccess() {
        return success;
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
        sb.append("Success: " + success + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    