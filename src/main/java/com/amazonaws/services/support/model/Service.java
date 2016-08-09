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
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an AWS Service returned by the DescribeServices action.
 * </p>
 */
public class Service implements Serializable {

    /**
     * The code for an AWS service returned by <a>DescribeServices</a>
     * response. Has a corresponding name represented by Service.name.
     */
    private String code;

    /**
     * The friendly name for an AWS service. Has a corresponding code
     * represented by Service.code.
     */
    private String name;

    /**
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Category> categories;

    /**
     * The code for an AWS service returned by <a>DescribeServices</a>
     * response. Has a corresponding name represented by Service.name.
     *
     * @return The code for an AWS service returned by <a>DescribeServices</a>
     *         response. Has a corresponding name represented by Service.name.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The code for an AWS service returned by <a>DescribeServices</a>
     * response. Has a corresponding name represented by Service.name.
     *
     * @param code The code for an AWS service returned by <a>DescribeServices</a>
     *         response. Has a corresponding name represented by Service.name.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The code for an AWS service returned by <a>DescribeServices</a>
     * response. Has a corresponding name represented by Service.name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The code for an AWS service returned by <a>DescribeServices</a>
     *         response. Has a corresponding name represented by Service.name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The friendly name for an AWS service. Has a corresponding code
     * represented by Service.code.
     *
     * @return The friendly name for an AWS service. Has a corresponding code
     *         represented by Service.code.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The friendly name for an AWS service. Has a corresponding code
     * represented by Service.code.
     *
     * @param name The friendly name for an AWS service. Has a corresponding code
     *         represented by Service.code.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The friendly name for an AWS service. Has a corresponding code
     * represented by Service.code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The friendly name for an AWS service. Has a corresponding code
     *         represented by Service.code.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     *
     * @return A list of categories that describe the type of support issue a case
     *         describes. Categories consist of a category name and a category code.
     *         Category names and codes are passed to AWS Support when you call
     *         <a>CreateCase</a>.
     */
    public java.util.List<Category> getCategories() {
        if (categories == null) {
              categories = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>();
              categories.setAutoConstruct(true);
        }
        return categories;
    }
    
    /**
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     *
     * @param categories A list of categories that describe the type of support issue a case
     *         describes. Categories consist of a category name and a category code.
     *         Category names and codes are passed to AWS Support when you call
     *         <a>CreateCase</a>.
     */
    public void setCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Category> categoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>(categories.size());
        categoriesCopy.addAll(categories);
        this.categories = categoriesCopy;
    }
    
    /**
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categories A list of categories that describe the type of support issue a case
     *         describes. Categories consist of a category name and a category code.
     *         Category names and codes are passed to AWS Support when you call
     *         <a>CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCategories(Category... categories) {
        if (getCategories() == null) setCategories(new java.util.ArrayList<Category>(categories.length));
        for (Category value : categories) {
            getCategories().add(value);
        }
        return this;
    }
    
    /**
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categories A list of categories that describe the type of support issue a case
     *         describes. Categories consist of a category name and a category code.
     *         Category names and codes are passed to AWS Support when you call
     *         <a>CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Category> categoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>(categories.size());
            categoriesCopy.addAll(categories);
            this.categories = categoriesCopy;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCategories() != null) sb.append("Categories: " + getCategories() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Service == false) return false;
        Service other = (Service)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCategories() == null ^ this.getCategories() == null) return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false) return false; 
        return true;
    }
    
}
    