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
package com.amazonaws.services.identitymanagement.model;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * GetServerCertificate action.
 * </p>
 */
public class GetServerCertificateResult {

    /**
     * Information about the server certificate.
     */
    private ServerCertificate serverCertificate;

    /**
     * Information about the server certificate.
     *
     * @return Information about the server certificate.
     */
    public ServerCertificate getServerCertificate() {
        return serverCertificate;
    }
    
    /**
     * Information about the server certificate.
     *
     * @param serverCertificate Information about the server certificate.
     */
    public void setServerCertificate(ServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
    }
    
    /**
     * Information about the server certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serverCertificate Information about the server certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetServerCertificateResult withServerCertificate(ServerCertificate serverCertificate) {
        this.serverCertificate = serverCertificate;
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
        sb.append("ServerCertificate: " + serverCertificate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    