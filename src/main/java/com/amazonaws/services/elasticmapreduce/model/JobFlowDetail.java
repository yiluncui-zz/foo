/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * <p>
 * A description of a job flow.
 * </p>
 */
public class JobFlowDetail {

    /**
     * The job flow identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String jobFlowId;

    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * The location in Amazon S3 where log files for the job are stored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String logUri;

    /**
     * The verison of the AMI used to initialize Amazon EC2 instances in the
     * job flow. For a list of AMI versions currently supported by Amazon
     * ElasticMapReduce, go to <a
     * perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String amiVersion;

    /**
     * Describes the execution status of the job flow.
     */
    private JobFlowExecutionStatusDetail executionStatusDetail;

    /**
     * Describes the Amazon EC2 instances of the job flow.
     */
    private JobFlowInstancesDetail instances;

    /**
     * A list of steps run by the job flow.
     */
    private java.util.List<StepDetail> steps;

    /**
     * A list of the bootstrap actions run by the job flow.
     */
    private java.util.List<BootstrapActionDetail> bootstrapActions;

    /**
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     */
    private java.util.List<String> supportedProducts;

    /**
     * Default constructor for a new JobFlowDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public JobFlowDetail() {}
    
    /**
     * Constructs a new JobFlowDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jobFlowId The job flow identifier.
     * @param name The name of the job flow.
     * @param executionStatusDetail Describes the execution status of the job
     * flow.
     * @param instances Describes the Amazon EC2 instances of the job flow.
     */
    public JobFlowDetail(String jobFlowId, String name, JobFlowExecutionStatusDetail executionStatusDetail, JobFlowInstancesDetail instances) {
        this.jobFlowId = jobFlowId;
        this.name = name;
        this.executionStatusDetail = executionStatusDetail;
        this.instances = instances;
    }

    
    
    /**
     * The job flow identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The job flow identifier.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * The job flow identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId The job flow identifier.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * The job flow identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId The job flow identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the job flow.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The location in Amazon S3 where log files for the job are stored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The location in Amazon S3 where log files for the job are stored.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The location in Amazon S3 where log files for the job are stored.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param logUri The location in Amazon S3 where log files for the job are stored.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The location in Amazon S3 where log files for the job are stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param logUri The location in Amazon S3 where log files for the job are stored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * The verison of the AMI used to initialize Amazon EC2 instances in the
     * job flow. For a list of AMI versions currently supported by Amazon
     * ElasticMapReduce, go to <a
     * perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The verison of the AMI used to initialize Amazon EC2 instances in the
     *         job flow. For a list of AMI versions currently supported by Amazon
     *         ElasticMapReduce, go to <a
     *         perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     */
    public String getAmiVersion() {
        return amiVersion;
    }
    
    /**
     * The verison of the AMI used to initialize Amazon EC2 instances in the
     * job flow. For a list of AMI versions currently supported by Amazon
     * ElasticMapReduce, go to <a
     * perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param amiVersion The verison of the AMI used to initialize Amazon EC2 instances in the
     *         job flow. For a list of AMI versions currently supported by Amazon
     *         ElasticMapReduce, go to <a
     *         perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     */
    public void setAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
    }
    
    /**
     * The verison of the AMI used to initialize Amazon EC2 instances in the
     * job flow. For a list of AMI versions currently supported by Amazon
     * ElasticMapReduce, go to <a
     * perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param amiVersion The verison of the AMI used to initialize Amazon EC2 instances in the
     *         job flow. For a list of AMI versions currently supported by Amazon
     *         ElasticMapReduce, go to <a
     *         perGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
        return this;
    }
    
    
    /**
     * Describes the execution status of the job flow.
     *
     * @return Describes the execution status of the job flow.
     */
    public JobFlowExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }
    
    /**
     * Describes the execution status of the job flow.
     *
     * @param executionStatusDetail Describes the execution status of the job flow.
     */
    public void setExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }
    
    /**
     * Describes the execution status of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionStatusDetail Describes the execution status of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
        return this;
    }
    
    
    /**
     * Describes the Amazon EC2 instances of the job flow.
     *
     * @return Describes the Amazon EC2 instances of the job flow.
     */
    public JobFlowInstancesDetail getInstances() {
        return instances;
    }
    
    /**
     * Describes the Amazon EC2 instances of the job flow.
     *
     * @param instances Describes the Amazon EC2 instances of the job flow.
     */
    public void setInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
    }
    
    /**
     * Describes the Amazon EC2 instances of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Describes the Amazon EC2 instances of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * A list of steps run by the job flow.
     *
     * @return A list of steps run by the job flow.
     */
    public java.util.List<StepDetail> getSteps() {
        
        if (steps == null) {
            steps = new java.util.ArrayList<StepDetail>();
        }
        return steps;
    }
    
    /**
     * A list of steps run by the job flow.
     *
     * @param steps A list of steps run by the job flow.
     */
    public void setSteps(java.util.Collection<StepDetail> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        java.util.List<StepDetail> stepsCopy = new java.util.ArrayList<StepDetail>(steps.size());
        stepsCopy.addAll(steps);
        this.steps = stepsCopy;
    }
    
    /**
     * A list of steps run by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps run by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSteps(StepDetail... steps) {
        if (getSteps() == null) setSteps(new java.util.ArrayList<StepDetail>(steps.length));
        for (StepDetail value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * A list of steps run by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps run by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSteps(java.util.Collection<StepDetail> steps) {
        if (steps == null) {
            this.steps = null;
        } else {
            java.util.List<StepDetail> stepsCopy = new java.util.ArrayList<StepDetail>(steps.size());
            stepsCopy.addAll(steps);
            this.steps = stepsCopy;
        }

        return this;
    }
    
    /**
     * A list of the bootstrap actions run by the job flow.
     *
     * @return A list of the bootstrap actions run by the job flow.
     */
    public java.util.List<BootstrapActionDetail> getBootstrapActions() {
        
        if (bootstrapActions == null) {
            bootstrapActions = new java.util.ArrayList<BootstrapActionDetail>();
        }
        return bootstrapActions;
    }
    
    /**
     * A list of the bootstrap actions run by the job flow.
     *
     * @param bootstrapActions A list of the bootstrap actions run by the job flow.
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        java.util.List<BootstrapActionDetail> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionDetail>(bootstrapActions.size());
        bootstrapActionsCopy.addAll(bootstrapActions);
        this.bootstrapActions = bootstrapActionsCopy;
    }
    
    /**
     * A list of the bootstrap actions run by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of the bootstrap actions run by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withBootstrapActions(BootstrapActionDetail... bootstrapActions) {
        if (getBootstrapActions() == null) setBootstrapActions(new java.util.ArrayList<BootstrapActionDetail>(bootstrapActions.length));
        for (BootstrapActionDetail value : bootstrapActions) {
            getBootstrapActions().add(value);
        }
        return this;
    }
    
    /**
     * A list of the bootstrap actions run by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of the bootstrap actions run by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
        } else {
            java.util.List<BootstrapActionDetail> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionDetail>(bootstrapActions.size());
            bootstrapActionsCopy.addAll(bootstrapActions);
            this.bootstrapActions = bootstrapActionsCopy;
        }

        return this;
    }
    
    /**
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     *
     * @return A list of strings set by third party software when the job flow is
     *         launched. If you are not using third party software to manage the job
     *         flow this value is empty.
     */
    public java.util.List<String> getSupportedProducts() {
        
        if (supportedProducts == null) {
            supportedProducts = new java.util.ArrayList<String>();
        }
        return supportedProducts;
    }
    
    /**
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     *
     * @param supportedProducts A list of strings set by third party software when the job flow is
     *         launched. If you are not using third party software to manage the job
     *         flow this value is empty.
     */
    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }

        java.util.List<String> supportedProductsCopy = new java.util.ArrayList<String>(supportedProducts.size());
        supportedProductsCopy.addAll(supportedProducts);
        this.supportedProducts = supportedProductsCopy;
    }
    
    /**
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param supportedProducts A list of strings set by third party software when the job flow is
     *         launched. If you are not using third party software to manage the job
     *         flow this value is empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSupportedProducts(String... supportedProducts) {
        if (getSupportedProducts() == null) setSupportedProducts(new java.util.ArrayList<String>(supportedProducts.length));
        for (String value : supportedProducts) {
            getSupportedProducts().add(value);
        }
        return this;
    }
    
    /**
     * A list of strings set by third party software when the job flow is
     * launched. If you are not using third party software to manage the job
     * flow this value is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param supportedProducts A list of strings set by third party software when the job flow is
     *         launched. If you are not using third party software to manage the job
     *         flow this value is empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
        } else {
            java.util.List<String> supportedProductsCopy = new java.util.ArrayList<String>(supportedProducts.size());
            supportedProductsCopy.addAll(supportedProducts);
            this.supportedProducts = supportedProductsCopy;
        }

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
        if (jobFlowId != null) sb.append("JobFlowId: " + jobFlowId + ", ");
        if (name != null) sb.append("Name: " + name + ", ");
        if (logUri != null) sb.append("LogUri: " + logUri + ", ");
        if (amiVersion != null) sb.append("AmiVersion: " + amiVersion + ", ");
        if (executionStatusDetail != null) sb.append("ExecutionStatusDetail: " + executionStatusDetail + ", ");
        if (instances != null) sb.append("Instances: " + instances + ", ");
        if (steps != null) sb.append("Steps: " + steps + ", ");
        if (bootstrapActions != null) sb.append("BootstrapActions: " + bootstrapActions + ", ");
        if (supportedProducts != null) sb.append("SupportedProducts: " + supportedProducts + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode()); 
        hashCode = prime * hashCode + ((getAmiVersion() == null) ? 0 : getAmiVersion().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionStatusDetail() == null) ? 0 : getExecutionStatusDetail().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode()); 
        hashCode = prime * hashCode + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode()); 
        hashCode = prime * hashCode + ((getSupportedProducts() == null) ? 0 : getSupportedProducts().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof JobFlowDetail == false) return false;
        JobFlowDetail other = (JobFlowDetail)obj;
        
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null) return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null) return false;
        if (other.getAmiVersion() != null && other.getAmiVersion().equals(this.getAmiVersion()) == false) return false; 
        if (other.getExecutionStatusDetail() == null ^ this.getExecutionStatusDetail() == null) return false;
        if (other.getExecutionStatusDetail() != null && other.getExecutionStatusDetail().equals(this.getExecutionStatusDetail()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getSteps() == null ^ this.getSteps() == null) return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false) return false; 
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null) return false;
        if (other.getBootstrapActions() != null && other.getBootstrapActions().equals(this.getBootstrapActions()) == false) return false; 
        if (other.getSupportedProducts() == null ^ this.getSupportedProducts() == null) return false;
        if (other.getSupportedProducts() != null && other.getSupportedProducts().equals(this.getSupportedProducts()) == false) return false; 
        return true;
    }
    
}
    