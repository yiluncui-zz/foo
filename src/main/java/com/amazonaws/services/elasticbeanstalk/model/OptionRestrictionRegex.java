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
 * A regular expression representing a restriction on a string
 * configuration option value.
 * </p>
 */
public class OptionRestrictionRegex {

    /**
     * The regular expression pattern that a string configuration option
     * value with this restriction must match.
     */
    private String pattern;

    /**
     * A unique name representing this regular expression.
     */
    private String label;

    /**
     * Default constructor for a new OptionRestrictionRegex object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public OptionRestrictionRegex() {}
    
    /**
     * The regular expression pattern that a string configuration option
     * value with this restriction must match.
     *
     * @return The regular expression pattern that a string configuration option
     *         value with this restriction must match.
     */
    public String getPattern() {
        return pattern;
    }
    
    /**
     * The regular expression pattern that a string configuration option
     * value with this restriction must match.
     *
     * @param pattern The regular expression pattern that a string configuration option
     *         value with this restriction must match.
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    /**
     * The regular expression pattern that a string configuration option
     * value with this restriction must match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pattern The regular expression pattern that a string configuration option
     *         value with this restriction must match.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionRestrictionRegex withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    
    
    /**
     * A unique name representing this regular expression.
     *
     * @return A unique name representing this regular expression.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * A unique name representing this regular expression.
     *
     * @param label A unique name representing this regular expression.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * A unique name representing this regular expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param label A unique name representing this regular expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionRestrictionRegex withLabel(String label) {
        this.label = label;
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
        sb.append("Pattern: " + pattern + ", ");
        sb.append("Label: " + label + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    