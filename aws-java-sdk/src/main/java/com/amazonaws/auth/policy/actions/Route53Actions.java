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
 * The available AWS access control policy actions for Amazon Route 53.
 */
public enum Route53Actions implements Action {
    /** Represents any action executed on Amazon Route 53. */
    AllRoute53Actions("route53:*"),

    /** Action for the ChangeResourceRecordSets operation. */
    ChangeResourceRecordSets("route53:ChangeResourceRecordSets"),

    /** Action for the CreateHostedZone operation. */
    CreateHostedZone("route53:CreateHostedZone"),

    /** Action for the DeleteHostedZone operation. */
    DeleteHostedZone("route53:DeleteHostedZone"),

    /** Action for the GetChange operation. */
    GetChange("route53:GetChange"),

    /** Action for the GetHostedZone operation. */
    GetHostedZone("route53:GetHostedZone"),

    /** Action for the ListHostedZones operation. */
    ListHostedZones("route53:ListHostedZones"),

    /** Action for the ListResourceRecordSets operation. */
    ListResourceRecordSets("route53:ListResourceRecordSets");

    private final String action;

    private Route53Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
