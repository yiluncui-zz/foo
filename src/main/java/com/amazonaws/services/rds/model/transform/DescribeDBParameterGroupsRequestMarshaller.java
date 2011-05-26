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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe D B Parameter Groups Request Marshaller
 */
public class DescribeDBParameterGroupsRequestMarshaller implements Marshaller<Request<DescribeDBParameterGroupsRequest>, DescribeDBParameterGroupsRequest> {

    public Request<DescribeDBParameterGroupsRequest> marshall(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) {
        Request<DescribeDBParameterGroupsRequest> request = new DefaultRequest<DescribeDBParameterGroupsRequest>(describeDBParameterGroupsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBParameterGroups");
        request.addParameter("Version", "2011-04-01");
        if (describeDBParameterGroupsRequest != null) {
            if (describeDBParameterGroupsRequest.getDBParameterGroupName() != null) {
                request.addParameter("DBParameterGroupName", StringUtils.fromString(describeDBParameterGroupsRequest.getDBParameterGroupName()));
            }
        }
        if (describeDBParameterGroupsRequest != null) {
            if (describeDBParameterGroupsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBParameterGroupsRequest.getMaxRecords()));
            }
        }
        if (describeDBParameterGroupsRequest != null) {
            if (describeDBParameterGroupsRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeDBParameterGroupsRequest.getMarker()));
            }
        }


        return request;
    }
}
