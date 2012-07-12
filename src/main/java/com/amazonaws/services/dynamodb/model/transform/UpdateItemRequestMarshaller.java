/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Update Item Request Marshaller
 */
public class UpdateItemRequestMarshaller implements Marshaller<Request<UpdateItemRequest>, UpdateItemRequest> {

    

    public Request<UpdateItemRequest> marshall(UpdateItemRequest updateItemRequest) {
		if (updateItemRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UpdateItemRequest> request = new DefaultRequest<UpdateItemRequest>(updateItemRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20111205.UpdateItem";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);

        	
            
        	jsonWriter.object();
        	
            if (updateItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(updateItemRequest.getTableName());
            }
            Key key = updateItemRequest.getKey();
            if (key != null) {

                jsonWriter.key("Key");
                jsonWriter.object();

                AttributeValue hashKeyElement = key.getHashKeyElement();
                if (hashKeyElement != null) {

                    jsonWriter.key("HashKeyElement");
                    jsonWriter.object();

                    if (hashKeyElement.getS() != null) {
                        jsonWriter.key("S").value(hashKeyElement.getS());
                    }
                    if (hashKeyElement.getN() != null) {
                        jsonWriter.key("N").value(hashKeyElement.getN());
                    }

                    java.util.List<String> sSList = hashKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {

                        jsonWriter.key("SS");
                        jsonWriter.array();

                        for (String sSListValue : sSList) {
                            jsonWriter.value(sSListValue);
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = hashKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {

                        jsonWriter.key("NS");
                        jsonWriter.array();

                        for (String nSListValue : nSList) {
                            jsonWriter.value(nSListValue);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                AttributeValue rangeKeyElement = key.getRangeKeyElement();
                if (rangeKeyElement != null) {

                    jsonWriter.key("RangeKeyElement");
                    jsonWriter.object();

                    if (rangeKeyElement.getS() != null) {
                        jsonWriter.key("S").value(rangeKeyElement.getS());
                    }
                    if (rangeKeyElement.getN() != null) {
                        jsonWriter.key("N").value(rangeKeyElement.getN());
                    }

                    java.util.List<String> sSList = rangeKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {

                        jsonWriter.key("SS");
                        jsonWriter.array();

                        for (String sSListValue : sSList) {
                            jsonWriter.value(sSListValue);
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = rangeKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {

                        jsonWriter.key("NS");
                        jsonWriter.array();

                        for (String nSListValue : nSList) {
                            jsonWriter.value(nSListValue);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getAttributeUpdates() != null) {
                jsonWriter.key("AttributeUpdates");
                jsonWriter.object();
                for (Map.Entry<String, AttributeValueUpdate> attributeUpdatesListValue : updateItemRequest.getAttributeUpdates().entrySet()) {
                    if (attributeUpdatesListValue.getValue() != null) {
                        jsonWriter.key(attributeUpdatesListValue.getKey());

                        jsonWriter.object();
                        AttributeValue value = attributeUpdatesListValue.getValue().getValue();
                        if (value != null) {

                            jsonWriter.key("Value");
                            jsonWriter.object();

                            if (value.getS() != null) {
                                jsonWriter.key("S").value(value.getS());
                            }
                            if (value.getN() != null) {
                                jsonWriter.key("N").value(value.getN());
                            }

                            java.util.List<String> sSList = value.getSS();
                            if (sSList != null && sSList.size() > 0) {

                                jsonWriter.key("SS");
                                jsonWriter.array();

                                for (String sSListValue : sSList) {
                                    jsonWriter.value(sSListValue);
                                }
                                jsonWriter.endArray();
                            }

                            java.util.List<String> nSList = value.getNS();
                            if (nSList != null && nSList.size() > 0) {

                                jsonWriter.key("NS");
                                jsonWriter.array();

                                for (String nSListValue : nSList) {
                                    jsonWriter.value(nSListValue);
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        if (attributeUpdatesListValue.getValue().getAction() != null) {
                            jsonWriter.key("Action").value(attributeUpdatesListValue.getValue().getAction());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getExpected() != null) {
                jsonWriter.key("Expected");
                jsonWriter.object();
                for (Map.Entry<String, ExpectedAttributeValue> expectedListValue : updateItemRequest.getExpected().entrySet()) {
                    if (expectedListValue.getValue() != null) {
                        jsonWriter.key(expectedListValue.getKey());

                        jsonWriter.object();
                        AttributeValue value = expectedListValue.getValue().getValue();
                        if (value != null) {

                            jsonWriter.key("Value");
                            jsonWriter.object();

                            if (value.getS() != null) {
                                jsonWriter.key("S").value(value.getS());
                            }
                            if (value.getN() != null) {
                                jsonWriter.key("N").value(value.getN());
                            }

                            java.util.List<String> sSList = value.getSS();
                            if (sSList != null && sSList.size() > 0) {

                                jsonWriter.key("SS");
                                jsonWriter.array();

                                for (String sSListValue : sSList) {
                                    jsonWriter.value(sSListValue);
                                }
                                jsonWriter.endArray();
                            }

                            java.util.List<String> nSList = value.getNS();
                            if (nSList != null && nSList.size() > 0) {

                                jsonWriter.key("NS");
                                jsonWriter.array();

                                for (String nSListValue : nSList) {
                                    jsonWriter.value(nSListValue);
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        if (expectedListValue.getValue().isExists() != null) {
                            jsonWriter.key("Exists").value(expectedListValue.getValue().isExists());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (updateItemRequest.getReturnValues() != null) {
                jsonWriter.key("ReturnValues").value(updateItemRequest.getReturnValues());
            }

    	    jsonWriter.endObject();
        	

    	    String snippet = stringWriter.toString();
    	    byte[] content = snippet.getBytes("UTF-8");
        	request.setContent(new StringInputStream(snippet));
	        request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
