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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.importexport.AmazonImportExport#getStatus(GetStatusRequest) GetStatus operation}.
 * <p>
 * This operation returns information about a job, including where the
 * job is in the processing pipeline, the status of the results, and the
 * signature value associated with the job. You can only return
 * information about jobs you own.
 * </p>
 *
 * @see com.amazonaws.services.importexport.AmazonImportExport#getStatus(GetStatusRequest)
 */
public class GetStatusRequest extends AmazonWebServiceRequest {

    /**
     * A unique identifier which refers to a particular job.
     */
    private String jobId;

    /**
     * A unique identifier which refers to a particular job.
     *
     * @return A unique identifier which refers to a particular job.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     *
     * @param jobId A unique identifier which refers to a particular job.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId A unique identifier which refers to a particular job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusRequest withJobId(String jobId) {
        this.jobId = jobId;
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
        sb.append("JobId: " + jobId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    