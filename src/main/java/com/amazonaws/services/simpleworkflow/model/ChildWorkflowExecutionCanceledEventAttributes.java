/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;
import java.io.Serializable;

/**
 * <p>
 * Provide details of the <code>ChildWorkflowExecutionCanceled</code> event.
 * </p>
 */
public class ChildWorkflowExecutionCanceledEventAttributes  implements Serializable  {

    /**
     * The child workflow execution that was canceled.
     */
    private WorkflowExecution workflowExecution;

    /**
     * The type of the child workflow execution.
     */
    private WorkflowType workflowType;

    /**
     * Details of the cancellation (if provided).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this child workflow execution. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     */
    private Long initiatedEventId;

    /**
     * The Id of the <code>ChildWorkflowExecutionStarted</code> event
     * recorded when this child workflow execution was started. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     */
    private Long startedEventId;

    /**
     * The child workflow execution that was canceled.
     *
     * @return The child workflow execution that was canceled.
     */
    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }
    
    /**
     * The child workflow execution that was canceled.
     *
     * @param workflowExecution The child workflow execution that was canceled.
     */
    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }
    
    /**
     * The child workflow execution that was canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecution The child workflow execution that was canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChildWorkflowExecutionCanceledEventAttributes withWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
        return this;
    }
    
    
    /**
     * The type of the child workflow execution.
     *
     * @return The type of the child workflow execution.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The type of the child workflow execution.
     *
     * @param workflowType The type of the child workflow execution.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The type of the child workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The type of the child workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChildWorkflowExecutionCanceledEventAttributes withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }
    
    
    /**
     * Details of the cancellation (if provided).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Details of the cancellation (if provided).
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Details of the cancellation (if provided).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Details of the cancellation (if provided).
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Details of the cancellation (if provided).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Details of the cancellation (if provided).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChildWorkflowExecutionCanceledEventAttributes withDetails(String details) {
        this.details = details;
        return this;
    }
    
    
    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this child workflow execution. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     *
     * @return The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this child workflow execution. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     */
    public Long getInitiatedEventId() {
        return initiatedEventId;
    }
    
    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this child workflow execution. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     *
     * @param initiatedEventId The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this child workflow execution. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     */
    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }
    
    /**
     * The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     * corresponding to the <code>StartChildWorkflowExecution</code>
     * <a>Decision</a> to start this child workflow execution. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initiatedEventId The id of the <code>StartChildWorkflowExecutionInitiated</code> event
     *         corresponding to the <code>StartChildWorkflowExecution</code>
     *         <a>Decision</a> to start this child workflow execution. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChildWorkflowExecutionCanceledEventAttributes withInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
        return this;
    }
    
    
    /**
     * The Id of the <code>ChildWorkflowExecutionStarted</code> event
     * recorded when this child workflow execution was started. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     *
     * @return The Id of the <code>ChildWorkflowExecutionStarted</code> event
     *         recorded when this child workflow execution was started. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The Id of the <code>ChildWorkflowExecutionStarted</code> event
     * recorded when this child workflow execution was started. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     *
     * @param startedEventId The Id of the <code>ChildWorkflowExecutionStarted</code> event
     *         recorded when this child workflow execution was started. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The Id of the <code>ChildWorkflowExecutionStarted</code> event
     * recorded when this child workflow execution was started. This
     * information can be useful for diagnosing problems by tracing back the
     * chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The Id of the <code>ChildWorkflowExecutionStarted</code> event
     *         recorded when this child workflow execution was started. This
     *         information can be useful for diagnosing problems by tracing back the
     *         chain of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ChildWorkflowExecutionCanceledEventAttributes withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
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
        if (getWorkflowExecution() != null) sb.append("WorkflowExecution: " + getWorkflowExecution() + ",");    	
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");    	
        if (getDetails() != null) sb.append("Details: " + getDetails() + ",");    	
        if (getInitiatedEventId() != null) sb.append("InitiatedEventId: " + getInitiatedEventId() + ",");    	
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        hashCode = prime * hashCode + ((getInitiatedEventId() == null) ? 0 : getInitiatedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChildWorkflowExecutionCanceledEventAttributes == false) return false;
        ChildWorkflowExecutionCanceledEventAttributes other = (ChildWorkflowExecutionCanceledEventAttributes)obj;
        
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null) return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null) return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        return true;
    }
    
}
    