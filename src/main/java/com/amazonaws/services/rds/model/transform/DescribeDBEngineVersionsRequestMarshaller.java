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
 * Describe D B Engine Versions Request Marshaller
 */
public class DescribeDBEngineVersionsRequestMarshaller implements Marshaller<Request<DescribeDBEngineVersionsRequest>, DescribeDBEngineVersionsRequest> {

    public Request<DescribeDBEngineVersionsRequest> marshall(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) {
        Request<DescribeDBEngineVersionsRequest> request = new DefaultRequest<DescribeDBEngineVersionsRequest>(describeDBEngineVersionsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBEngineVersions");
        request.addParameter("Version", "2010-07-28");
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.getEngine() != null) {
                request.addParameter("Engine", StringUtils.fromString(describeDBEngineVersionsRequest.getEngine()));
            }
        }
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.getEngineVersion() != null) {
                request.addParameter("EngineVersion", StringUtils.fromString(describeDBEngineVersionsRequest.getEngineVersion()));
            }
        }
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.getDBParameterGroupFamily() != null) {
                request.addParameter("DBParameterGroupFamily", StringUtils.fromString(describeDBEngineVersionsRequest.getDBParameterGroupFamily()));
            }
        }
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBEngineVersionsRequest.getMaxRecords()));
            }
        }
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeDBEngineVersionsRequest.getMarker()));
            }
        }
        if (describeDBEngineVersionsRequest != null) {
            if (describeDBEngineVersionsRequest.isDefaultOnly() != null) {
                request.addParameter("DefaultOnly", StringUtils.fromBoolean(describeDBEngineVersionsRequest.isDefaultOnly()));
            }
        }


        return request;
    }
}
