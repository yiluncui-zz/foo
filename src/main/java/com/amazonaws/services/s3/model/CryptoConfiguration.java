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
package com.amazonaws.services.s3.model;

import java.security.Provider;

import com.amazonaws.services.s3.internal.crypto.CryptoRuntime;

/**
 * Stores configuration parameters that will be used during encryption and
 * decryption by the Amazon S3 Encryption Client. With this object, you can set
 * the encryption client to use Instruction Files or Object Metadata for storing
 * encryption information. You can also specify your own crypto provider to be
 * used during encryption and decryption.
 */
public class CryptoConfiguration {

    private CryptoMode cryptoMode;
    private CryptoStorageMode storageMode;
    private Provider cryptoProvider;

    /**
     * Creates a new CryptoConfiguration object with default storage mode and crypto provider settings.
     * The default storage mode is the Object Metadata storage mode, and the default crypto provider
     * is the JCE provider.
     */
    public CryptoConfiguration() {
        this(CryptoMode.EncryptionOnly);    // default to Encryption Only (EO) for backward compatibility
    }   

    /**
     * @param cryptoMode
     *            cryptographic mode to be used
     *
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    public CryptoConfiguration(CryptoMode cryptoMode) {
        check(cryptoMode);
        // By default, store encryption info in metadata
        this.storageMode = CryptoStorageMode.ObjectMetadata;
        // A null value implies that the default JCE crypto provider will be used
        this.cryptoProvider = null;
        this.cryptoMode = cryptoMode;
    }   
    /**
     * Sets the storage mode to the specified mode.
     * 
     * @param storageMode
     *     The storage mode to be used for storing encryption information.
     */
    public void setStorageMode(CryptoStorageMode storageMode) {
        this.storageMode = storageMode;
    }

    /**
     * Sets the storage mode to the specified mode, and returns the updated CryptoConfiguration object.
     * @param storageMode
     *     The storage mode to be used for storing encryption information.
     * @return
     *     The updated CryptoConfiguration object.
     */
    public CryptoConfiguration withStorageMode(CryptoStorageMode storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * Returns the current storage mode of a CryptoConfiguration object.
     * 
     * @return
     *     The storage mode to be used for storing encryption information.
     */
    public CryptoStorageMode getStorageMode() {
        return this.storageMode;
    }

    /**
     * Sets the crypto provider to the specified provider.
     * 
     * @param cryptoProvider
     *     The crypto provider whose encryption implementation will be used to encrypt and decrypt data.
     */
    public void setCryptoProvider(Provider cryptoProvider) {
        this.cryptoProvider = cryptoProvider;
    }

    /**
     * Sets the crypto provider to the specified provider, and returns the updated CryptoConfiguration object.
     * 
     * @param cryptoProvider
     *     The crypto provider whose encryption implementation will be used to encrypt and decrypt data.
     * @return
     *     The updated CryptoConfiguration object.
     */
    public CryptoConfiguration withCryptoProvider(Provider cryptoProvider) {
        this.cryptoProvider = cryptoProvider;
        return this;
    }

    /**
     * Returns the crypto provider whose encryption implementation will be used to encrypt and decrypt data.
     *  
     * @return the crypto provider whose encryption implementation will be used to encrypt and decrypt data.
     */
    public Provider getCryptoProvider() {
        return this.cryptoProvider;
    }
    /**
     * Returns the optionally specified crypto mode applicable only to the S3
     * encryption client; or null.  This attribute is ignored if the S3
     * encryption client is not in use.
     */
    public CryptoMode getCryptoMode() {
        return cryptoMode;
    }

    /**
     * Sets the crypto mode; applicable only to the S3 encryption client.
     * 
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    public void setCryptoMode(CryptoMode cryptoMode) {
        check(cryptoMode);
        this.cryptoMode = cryptoMode;
    }

    /**
     * Fluent API to set the crypto mode; applicable only to the S3 encryption
     * client.
     * 
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    public CryptoConfiguration withCryptoMode(CryptoMode cryptoMode) {
        check(cryptoMode);
        this.cryptoMode = cryptoMode;
        return this;
    }

    /**
     * Checks if the crypto mode is supported by the runtime.
     * 
     * @throws UnsupportedOperationException
     *             if the necessary security provider cannot be found or the
     *             necessary cryptographic operations are not supported for the
     *             specified crypto mode.
     */
    private void check(CryptoMode cryptoMode) {
        if (cryptoMode == CryptoMode.AuthenticatedEncryption
        ||  cryptoMode == CryptoMode.StrictAuthenticatedEncryption) {
            if (!CryptoRuntime.isBouncyCastleAvailable()) {
                CryptoRuntime.enableBouncyCastle();
                if (!CryptoRuntime.isBouncyCastleAvailable()) {
                    throw new UnsupportedOperationException(
                            "The Bouncy castle library jar is required on the classpath to enable authenticated encryption");
                }
            }
            if (!CryptoRuntime.isAesGcmAvailable())
                throw new UnsupportedOperationException(
                        "More recent version of the Bouncy castle library is required to enable authenticated encryption");
        }
    }
}
