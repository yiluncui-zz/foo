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

package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Deployment Group Info JSON Unmarshaller
 */
public class DeploymentGroupInfoJsonUnmarshaller implements Unmarshaller<DeploymentGroupInfo, JsonUnmarshallerContext> {

    public DeploymentGroupInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentGroupInfo deploymentGroupInfo = new DeploymentGroupInfo();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationName", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setApplicationName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentGroupId", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentGroupId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentGroupName", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentGroupName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentConfigName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2TagFilters", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setEc2TagFilters(new ListUnmarshaller<EC2TagFilter>(EC2TagFilterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("autoScalingGroups", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setAutoScalingGroups(new ListUnmarshaller<AutoScalingGroup>(AutoScalingGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("serviceRoleArn", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setServiceRoleArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("targetRevision", targetDepth)) {
                    context.nextToken();
                    deploymentGroupInfo.setTargetRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return deploymentGroupInfo;
    }

    private static DeploymentGroupInfoJsonUnmarshaller instance;
    public static DeploymentGroupInfoJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DeploymentGroupInfoJsonUnmarshaller();
        return instance;
    }
}
    