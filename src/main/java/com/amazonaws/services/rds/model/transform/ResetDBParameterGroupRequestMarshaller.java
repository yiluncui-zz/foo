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
 * Reset D B Parameter Group Request Marshaller
 */
public class ResetDBParameterGroupRequestMarshaller implements Marshaller<Request<ResetDBParameterGroupRequest>, ResetDBParameterGroupRequest> {

    public Request<ResetDBParameterGroupRequest> marshall(ResetDBParameterGroupRequest resetDBParameterGroupRequest) {
        Request<ResetDBParameterGroupRequest> request = new DefaultRequest<ResetDBParameterGroupRequest>(resetDBParameterGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ResetDBParameterGroup");
        request.addParameter("Version", "2010-07-28");
        if (resetDBParameterGroupRequest != null) {
            if (resetDBParameterGroupRequest.getDBParameterGroupName() != null) {
                request.addParameter("DBParameterGroupName", StringUtils.fromString(resetDBParameterGroupRequest.getDBParameterGroupName()));
            }
        }
        if (resetDBParameterGroupRequest != null) {
            if (resetDBParameterGroupRequest.isResetAllParameters() != null) {
                request.addParameter("ResetAllParameters", StringUtils.fromBoolean(resetDBParameterGroupRequest.isResetAllParameters()));
            }
        }

        if (resetDBParameterGroupRequest != null) {
            java.util.List<Parameter> parametersList = resetDBParameterGroupRequest.getParameters();
            int parametersListIndex = 1;
            for (Parameter parametersListValue : parametersList) {
                if (parametersListValue != null) {
                    if (parametersListValue.getParameterName() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterName", StringUtils.fromString(parametersListValue.getParameterName()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getParameterValue() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue", StringUtils.fromString(parametersListValue.getParameterValue()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getDescription() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".Description", StringUtils.fromString(parametersListValue.getDescription()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getSource() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".Source", StringUtils.fromString(parametersListValue.getSource()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getApplyType() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ApplyType", StringUtils.fromString(parametersListValue.getApplyType()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getDataType() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".DataType", StringUtils.fromString(parametersListValue.getDataType()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getAllowedValues() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".AllowedValues", StringUtils.fromString(parametersListValue.getAllowedValues()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.isModifiable() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".IsModifiable", StringUtils.fromBoolean(parametersListValue.isModifiable()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getMinimumEngineVersion() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".MinimumEngineVersion", StringUtils.fromString(parametersListValue.getMinimumEngineVersion()));
                    }
                }
                if (parametersListValue != null) {
                    if (parametersListValue.getApplyMethod() != null) {
                        request.addParameter("Parameters.member." + parametersListIndex + ".ApplyMethod", StringUtils.fromString(parametersListValue.getApplyMethod()));
                    }
                }

                parametersListIndex++;
            }
        }


        return request;
    }
}
