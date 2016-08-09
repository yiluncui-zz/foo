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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * Provides a list of validation messages.
 * </p>
 */
public class ValidateConfigurationSettingsResult {

    /**
     * A list of <a>ValidationMessage</a>.
     */
    private java.util.List<ValidationMessage> messages;

    /**
     * A list of <a>ValidationMessage</a>.
     *
     * @return A list of <a>ValidationMessage</a>.
     */
    public java.util.List<ValidationMessage> getMessages() {
        if (messages == null) {
            messages = new java.util.ArrayList<ValidationMessage>();
        }
        return messages;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     */
    public void setMessages(java.util.Collection<ValidationMessage> messages) {
        java.util.List<ValidationMessage> messagesCopy = new java.util.ArrayList<ValidationMessage>();
        if (messages != null) {
            messagesCopy.addAll(messages);
        }
        this.messages = messagesCopy;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsResult withMessages(ValidationMessage... messages) {
        for (ValidationMessage value : messages) {
            getMessages().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ValidationMessage</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of <a>ValidationMessage</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateConfigurationSettingsResult withMessages(java.util.Collection<ValidationMessage> messages) {
        java.util.List<ValidationMessage> messagesCopy = new java.util.ArrayList<ValidationMessage>();
        if (messages != null) {
            messagesCopy.addAll(messages);
        }
        this.messages = messagesCopy;

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
        sb.append("Messages: " + messages + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    