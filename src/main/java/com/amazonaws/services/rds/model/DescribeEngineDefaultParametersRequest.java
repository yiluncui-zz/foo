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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest) DescribeEngineDefaultParameters operation}.
 * <p>
 * This API returns the default engine and system parameter information
 * for the specified database engine.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest)
 */
public class DescribeEngineDefaultParametersRequest extends AmazonWebServiceRequest {

    /**
     * The name of the DB Parameter Group Family. <p>Valid Values:
     * <code>MySQL5.1</code>
     */
    private String dBParameterGroupFamily;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeEngineDefaultParametersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeEngineDefaultParametersRequest() {}
    
    /**
     * Constructs a new DescribeEngineDefaultParametersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupFamily The name of the DB Parameter Group
     * Family. <p>Valid Values: <code>MySQL5.1</code>
     */
    public DescribeEngineDefaultParametersRequest(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The name of the DB Parameter Group Family. <p>Valid Values:
     * <code>MySQL5.1</code>
     *
     * @return The name of the DB Parameter Group Family. <p>Valid Values:
     *         <code>MySQL5.1</code>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }
    
    /**
     * The name of the DB Parameter Group Family. <p>Valid Values:
     * <code>MySQL5.1</code>
     *
     * @param dBParameterGroupFamily The name of the DB Parameter Group Family. <p>Valid Values:
     *         <code>MySQL5.1</code>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }
    
    /**
     * The name of the DB Parameter Group Family. <p>Valid Values:
     * <code>MySQL5.1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupFamily The name of the DB Parameter Group Family. <p>Valid Values:
     *         <code>MySQL5.1</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEngineDefaultParametersRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: 100 <p>Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEngineDefaultParametersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @return An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker provided in the previous DescribeDBInstances
     * request. If this parameter is specified, the response includes only
     * records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker provided in the previous DescribeDBInstances
     *         request. If this parameter is specified, the response includes only
     *         records beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeEngineDefaultParametersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("DBParameterGroupFamily: " + dBParameterGroupFamily + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    