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
 * Create D B Security Group Request Marshaller
 */
public class CreateDBSecurityGroupRequestMarshaller implements Marshaller<Request<CreateDBSecurityGroupRequest>, CreateDBSecurityGroupRequest> {

    public Request<CreateDBSecurityGroupRequest> marshall(CreateDBSecurityGroupRequest createDBSecurityGroupRequest) {
        Request<CreateDBSecurityGroupRequest> request = new DefaultRequest<CreateDBSecurityGroupRequest>(createDBSecurityGroupRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBSecurityGroup");
        request.addParameter("Version", "2011-04-01");
        if (createDBSecurityGroupRequest != null) {
            if (createDBSecurityGroupRequest.getDBSecurityGroupName() != null) {
                request.addParameter("DBSecurityGroupName", StringUtils.fromString(createDBSecurityGroupRequest.getDBSecurityGroupName()));
            }
        }
        if (createDBSecurityGroupRequest != null) {
            if (createDBSecurityGroupRequest.getDBSecurityGroupDescription() != null) {
                request.addParameter("DBSecurityGroupDescription", StringUtils.fromString(createDBSecurityGroupRequest.getDBSecurityGroupDescription()));
            }
        }


        return request;
    }
}
