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
 * UploadSigningCertificate action.
 * </p>
 */
public class UploadSigningCertificateResult {

    /**
     * Information about the certificate.
     */
    private SigningCertificate certificate;

    /**
     * Information about the certificate.
     *
     * @return Information about the certificate.
     */
    public SigningCertificate getCertificate() {
        return certificate;
    }
    
    /**
     * Information about the certificate.
     *
     * @param certificate Information about the certificate.
     */
    public void setCertificate(SigningCertificate certificate) {
        this.certificate = certificate;
    }
    
    /**
     * Information about the certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param certificate Information about the certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UploadSigningCertificateResult withCertificate(SigningCertificate certificate) {
        this.certificate = certificate;
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
        sb.append("Certificate: " + certificate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    