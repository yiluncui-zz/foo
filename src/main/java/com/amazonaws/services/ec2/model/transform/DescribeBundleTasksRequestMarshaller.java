/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Bundle Tasks Request Marshaller
 */        
public class DescribeBundleTasksRequestMarshaller implements Marshaller<Request<DescribeBundleTasksRequest>, DescribeBundleTasksRequest> {

    public Request<DescribeBundleTasksRequest> marshall(DescribeBundleTasksRequest describeBundleTasksRequest) {
        Request<DescribeBundleTasksRequest> request = new DefaultRequest<DescribeBundleTasksRequest>(describeBundleTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeBundleTasks");
        request.addParameter("Version", "2010-06-15");
        if (describeBundleTasksRequest != null) {
            java.util.List<String> bundleIdsList = describeBundleTasksRequest.getBundleIds();
            int bundleIdsListIndex = 1;
            for (String bundleIdsListValue : bundleIdsList) { 
                if (bundleIdsListValue != null) {
                    request.addParameter("BundleId." + bundleIdsListIndex, StringUtils.fromString(bundleIdsListValue));
                }
                bundleIdsListIndex++;
            }
        }


        return request;
    }
}
