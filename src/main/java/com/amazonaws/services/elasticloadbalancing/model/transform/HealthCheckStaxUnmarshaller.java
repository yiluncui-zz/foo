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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Health Check StAX Unmarshaller
 */
public class HealthCheckStaxUnmarshaller implements Unmarshaller<HealthCheck, StaxUnmarshallerContext> {

    public HealthCheck unmarshall(StaxUnmarshallerContext context) throws Exception {
        HealthCheck healthCheck = new HealthCheck();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return healthCheck;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Target", targetDepth)) {
                    healthCheck.setTarget(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Interval", targetDepth)) {
                    healthCheck.setInterval(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    healthCheck.setTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UnhealthyThreshold", targetDepth)) {
                    healthCheck.setUnhealthyThreshold(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthyThreshold", targetDepth)) {
                    healthCheck.setHealthyThreshold(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return healthCheck;
                }
            }
        }
    }

    private static HealthCheckStaxUnmarshaller instance;
    public static HealthCheckStaxUnmarshaller getInstance() {
        if (instance == null) instance = new HealthCheckStaxUnmarshaller();
        return instance;
    }
}
    