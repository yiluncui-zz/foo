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
package com.amazonaws.services.codedeploy.model;

/**
 * Instance Status
 */
public enum InstanceStatus {
    
    Pending("Pending"),
    InProgress("InProgress"),
    Succeeded("Succeeded"),
    Failed("Failed"),
    Skipped("Skipped"),
    Unknown("Unknown");

    private String value;

    private InstanceStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return InstanceStatus corresponding to the value
     */
    public static InstanceStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Pending".equals(value)) {
            return InstanceStatus.Pending;
        } else if ("InProgress".equals(value)) {
            return InstanceStatus.InProgress;
        } else if ("Succeeded".equals(value)) {
            return InstanceStatus.Succeeded;
        } else if ("Failed".equals(value)) {
            return InstanceStatus.Failed;
        } else if ("Skipped".equals(value)) {
            return InstanceStatus.Skipped;
        } else if ("Unknown".equals(value)) {
            return InstanceStatus.Unknown;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    