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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS CloudFormation.
 */
public enum CloudFormationActions implements Action {
    /** Represents any action executed on AWS CloudFormation. */
    AllCloudFormationActions("cloudformation:*"),

    /** Action for the CreateStack operation. */
    CreateStack("cloudformation:CreateStack"),

    /** Action for the DeleteStack operation. */
    DeleteStack("cloudformation:DeleteStack"),

    /** Action for the DescribeStackEvents operation. */
    DescribeStackEvents("cloudformation:DescribeStackEvents"),

    /** Action for the DescribeStackResource operation. */
    DescribeStackResource("cloudformation:DescribeStackResource"),

    /** Action for the DescribeStackResources operation. */
    DescribeStackResources("cloudformation:DescribeStackResources"),

    /** Action for the DescribeStacks operation. */
    DescribeStacks("cloudformation:DescribeStacks"),

    /** Action for the EstimateTemplateCost operation. */
    EstimateTemplateCost("cloudformation:EstimateTemplateCost"),

    /** Action for the GetTemplate operation. */
    GetTemplate("cloudformation:GetTemplate"),

    /** Action for the ListStacks operation. */
    ListStacks("cloudformation:ListStacks"),

    /** Action for the ListStackResources operation. */
    ListStackResources("cloudformation:ListStackResources"),

    /** Action for the UpdateStack operation. */
    UpdateStack("cloudformation:UpdateStack"),

    /** Action for the ValidateTemplate operation. */
    ValidateTemplate("cloudformation:ValidateTemplate");

    private final String action;

    private CloudFormationActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
