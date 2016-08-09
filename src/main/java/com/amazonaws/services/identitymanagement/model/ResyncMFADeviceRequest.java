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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#resyncMFADevice(ResyncMFADeviceRequest) ResyncMFADevice operation}.
 * <p>
 * Synchronizes the specified MFA device with AWS servers.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#resyncMFADevice(ResyncMFADeviceRequest)
 */
public class ResyncMFADeviceRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String serialNumber;

    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String authenticationCode1;

    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     */
    private String authenticationCode2;

    /**
     * Name of the User whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User whose MFA device you want to resynchronize.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User whose MFA device you want to resynchronize.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose MFA device you want to resynchronize.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User whose MFA device you want to resynchronize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User whose MFA device you want to resynchronize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResyncMFADeviceRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return Serial number that uniquely identifies the MFA device.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber Serial number that uniquely identifies the MFA device.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * Serial number that uniquely identifies the MFA device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 48<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serialNumber Serial number that uniquely identifies the MFA device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResyncMFADeviceRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    
    
    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return An authentication code emitted by the device.
     */
    public String getAuthenticationCode1() {
        return authenticationCode1;
    }
    
    /**
     * An authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode1 An authentication code emitted by the device.
     */
    public void setAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
    }
    
    /**
     * An authentication code emitted by the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode1 An authentication code emitted by the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResyncMFADeviceRequest withAuthenticationCode1(String authenticationCode1) {
        this.authenticationCode1 = authenticationCode1;
        return this;
    }
    
    
    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @return A subsequent authentication code emitted by the device.
     */
    public String getAuthenticationCode2() {
        return authenticationCode2;
    }
    
    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode2 A subsequent authentication code emitted by the device.
     */
    public void setAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
    }
    
    /**
     * A subsequent authentication code emitted by the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[\d]*<br/>
     *
     * @param authenticationCode2 A subsequent authentication code emitted by the device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ResyncMFADeviceRequest withAuthenticationCode2(String authenticationCode2) {
        this.authenticationCode2 = authenticationCode2;
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
        sb.append("UserName: " + userName + ", ");
        sb.append("SerialNumber: " + serialNumber + ", ");
        sb.append("AuthenticationCode1: " + authenticationCode1 + ", ");
        sb.append("AuthenticationCode2: " + authenticationCode2 + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    