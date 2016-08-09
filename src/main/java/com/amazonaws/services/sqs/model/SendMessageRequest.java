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
package com.amazonaws.services.sqs.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sqs.AmazonSQS#sendMessage(SendMessageRequest) SendMessage operation}.
 * <p>
 * The SendMessage action delivers a message to the specified queue.
 * </p>
 *
 * @see com.amazonaws.services.sqs.AmazonSQS#sendMessage(SendMessageRequest)
 */
public class SendMessageRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private String queueUrl;

    /**
     * The message to send.
     */
    private String messageBody;

    /**
     * Default constructor for a new SendMessageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendMessageRequest() {}
    
    /**
     * Constructs a new SendMessageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param queueUrl
     * @param messageBody The message to send.
     */
    public SendMessageRequest(String queueUrl, String messageBody) {
        this.queueUrl = queueUrl;
        this.messageBody = messageBody;
    }
    
    /**
     * 
     *
     * @return 
     */
    public String getQueueUrl() {
        return queueUrl;
    }
    
    /**
     * 
     *
     * @param queueUrl 
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queueUrl 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageRequest withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    
    /**
     * The message to send.
     *
     * @return The message to send.
     */
    public String getMessageBody() {
        return messageBody;
    }
    
    /**
     * The message to send.
     *
     * @param messageBody The message to send.
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    
    /**
     * The message to send.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageBody The message to send.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendMessageRequest withMessageBody(String messageBody) {
        this.messageBody = messageBody;
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
        sb.append("QueueUrl: " + queueUrl + ", ");
        sb.append("MessageBody: " + messageBody + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    