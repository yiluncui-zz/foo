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

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Grant Request Marshaller
 */
public class CreateGrantRequestMarshaller implements Marshaller<Request<CreateGrantRequest>, CreateGrantRequest> {

    public Request<CreateGrantRequest> marshall(CreateGrantRequest createGrantRequest) {
        if (createGrantRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGrantRequest> request = new DefaultRequest<CreateGrantRequest>(createGrantRequest, "AWSKMS");
        String target = "TrentService.CreateGrant";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createGrantRequest.getKeyId() != null) {
                jsonWriter.key("KeyId").value(createGrantRequest.getKeyId());
            }
            if (createGrantRequest.getGranteePrincipal() != null) {
                jsonWriter.key("GranteePrincipal").value(createGrantRequest.getGranteePrincipal());
            }
            if (createGrantRequest.getRetiringPrincipal() != null) {
                jsonWriter.key("RetiringPrincipal").value(createGrantRequest.getRetiringPrincipal());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> operationsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createGrantRequest.getOperations());
            if (operationsList != null && !(operationsList.isAutoConstruct() && operationsList.isEmpty())) {

                jsonWriter.key("Operations");
                jsonWriter.array();

                for (String operationsListValue : operationsList) {
                    if (operationsListValue != null) {
                        jsonWriter.value(operationsListValue);
                    }
                }
                jsonWriter.endArray();
            }
            GrantConstraints constraints = createGrantRequest.getConstraints();
            if (constraints != null) {

                jsonWriter.key("Constraints");
                jsonWriter.object();

                if (constraints.getEncryptionContextSubset() != null && !constraints.getEncryptionContextSubset().isEmpty()) {
                    jsonWriter.key("EncryptionContextSubset");
                    jsonWriter.object();
                    for (Map.Entry<String, String> encryptionContextSubsetListValue : constraints.getEncryptionContextSubset().entrySet()) {
                        if (encryptionContextSubsetListValue.getValue() != null) {
                            jsonWriter.key(encryptionContextSubsetListValue.getKey());

                            jsonWriter.value(encryptionContextSubsetListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (constraints.getEncryptionContextEquals() != null && !constraints.getEncryptionContextEquals().isEmpty()) {
                    jsonWriter.key("EncryptionContextEquals");
                    jsonWriter.object();
                    for (Map.Entry<String, String> encryptionContextEqualsListValue : constraints.getEncryptionContextEquals().entrySet()) {
                        if (encryptionContextEqualsListValue.getValue() != null) {
                            jsonWriter.key(encryptionContextEqualsListValue.getKey());

                            jsonWriter.value(encryptionContextEqualsListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createGrantRequest.getGrantTokens());
            if (grantTokensList != null && !(grantTokensList.isAutoConstruct() && grantTokensList.isEmpty())) {

                jsonWriter.key("GrantTokens");
                jsonWriter.array();

                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonWriter.value(grantTokensListValue);
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
