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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe D B Parameter Groups Request Marshaller
 */
public class DescribeDBParameterGroupsRequestMarshaller implements Marshaller<Request<DescribeDBParameterGroupsRequest>, DescribeDBParameterGroupsRequest> {

    public Request<DescribeDBParameterGroupsRequest> marshall(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) {

        if (describeDBParameterGroupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBParameterGroupsRequest> request = new DefaultRequest<DescribeDBParameterGroupsRequest>(describeDBParameterGroupsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBParameterGroups");
        request.addParameter("Version", "2013-09-09");

        if (describeDBParameterGroupsRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(describeDBParameterGroupsRequest.getDBParameterGroupName()));
        }

        java.util.List<Filter> filtersList = describeDBParameterGroupsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getFilterName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".FilterName", StringUtils.fromString(filterMember.getFilterName()));
                }

                java.util.List<String> filterValueList = filterMember.getFilterValue();
                int filterValueListIndex = 1;

                for (String filterValueListValue : filterValueList) {
                    if (filterValueListValue != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".FilterValue.Value." + filterValueListIndex, StringUtils.fromString(filterValueListValue));
                    }

                    filterValueListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describeDBParameterGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBParameterGroupsRequest.getMaxRecords()));
        }
        if (describeDBParameterGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBParameterGroupsRequest.getMarker()));
        }

        return request;
    }
}
