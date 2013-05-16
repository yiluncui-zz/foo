/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Job JSON Unmarshaller
 */
public class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    job.setId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PipelineId", targetDepth)) {
                    context.nextToken();
                    job.setPipelineId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    context.nextToken();
                    job.setInput(JobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    context.nextToken();
                    job.setOutput(JobOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    job.setOutputs(new ListUnmarshaller<JobOutput>(JobOutputJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OutputKeyPrefix", targetDepth)) {
                    context.nextToken();
                    job.setOutputKeyPrefix(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Playlists", targetDepth)) {
                    job.setPlaylists(new ListUnmarshaller<Playlist>(PlaylistJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    job.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return job;
    }

    private static JobJsonUnmarshaller instance;
    public static JobJsonUnmarshaller getInstance() {
        if (instance == null) instance = new JobJsonUnmarshaller();
        return instance;
    }
}
    