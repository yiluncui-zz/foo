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

package com.amazonaws.services.kms.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Grant List Entry JSON Unmarshaller
 */
public class GrantListEntryJsonUnmarshaller implements Unmarshaller<GrantListEntry, JsonUnmarshallerContext> {

    public GrantListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        GrantListEntry grantListEntry = new GrantListEntry();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GrantId", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setGrantId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GranteePrincipal", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setGranteePrincipal(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetiringPrincipal", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setRetiringPrincipal(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IssuingAccount", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setIssuingAccount(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Operations", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setOperations(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Constraints", targetDepth)) {
                    context.nextToken();
                    grantListEntry.setConstraints(GrantConstraintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return grantListEntry;
    }

    private static GrantListEntryJsonUnmarshaller instance;
    public static GrantListEntryJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GrantListEntryJsonUnmarshaller();
        return instance;
    }
}
    