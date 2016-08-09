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
 * Describe D B Instances Request Marshaller
 */
public class DescribeDBInstancesRequestMarshaller implements Marshaller<Request<DescribeDBInstancesRequest>, DescribeDBInstancesRequest> {

    public Request<DescribeDBInstancesRequest> marshall(DescribeDBInstancesRequest describeDBInstancesRequest) {
        Request<DescribeDBInstancesRequest> request = new DefaultRequest<DescribeDBInstancesRequest>(describeDBInstancesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBInstances");
        request.addParameter("Version", "2010-07-28");
        if (describeDBInstancesRequest != null) {
            if (describeDBInstancesRequest.getDBInstanceIdentifier() != null) {
                request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBInstancesRequest.getDBInstanceIdentifier()));
            }
        }
        if (describeDBInstancesRequest != null) {
            if (describeDBInstancesRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBInstancesRequest.getMaxRecords()));
            }
        }
        if (describeDBInstancesRequest != null) {
            if (describeDBInstancesRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeDBInstancesRequest.getMarker()));
            }
        }


        return request;
    }
}
