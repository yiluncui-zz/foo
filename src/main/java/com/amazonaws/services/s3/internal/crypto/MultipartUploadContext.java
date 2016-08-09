/*
 * Copyright 2011-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto;

/**
 * Contextual information for an in-flight multipart upload.
 */
public abstract class MultipartUploadContext {
    private final String bucketName;
    private final String key;
    private boolean hasFinalPartBeenSeen;

    protected MultipartUploadContext(String bucketName, String key) {
        this.bucketName = bucketName;
        this.key = key;
    }

    public final String getBucketName() {
        return bucketName;
    }

    public final String getKey() {
        return key;
    }

    public final boolean hasFinalPartBeenSeen() {
        return hasFinalPartBeenSeen;
    }

    public final void setHasFinalPartBeenSeen(boolean hasFinalPartBeenSeen) {
        this.hasFinalPartBeenSeen = hasFinalPartBeenSeen;
    }
}
