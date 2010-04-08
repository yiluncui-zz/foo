/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * 
 * </p>
 */
public class CreateSpotDatafeedSubscriptionResult {

    /**
     * 
     */
    private SpotDatafeedSubscription spotDatafeedSubscription;

    /**
     * 
     *
     * @return 
     */
    public SpotDatafeedSubscription getSpotDatafeedSubscription() {
        return spotDatafeedSubscription;
    }
    
    /**
     * 
     *
     * @param spotDatafeedSubscription 
     */
    public void setSpotDatafeedSubscription(SpotDatafeedSubscription spotDatafeedSubscription) {
        this.spotDatafeedSubscription = spotDatafeedSubscription;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotDatafeedSubscription 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSpotDatafeedSubscriptionResult withSpotDatafeedSubscription(SpotDatafeedSubscription spotDatafeedSubscription) {
        this.spotDatafeedSubscription = spotDatafeedSubscription;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("SpotDatafeedSubscription: " + spotDatafeedSubscription + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    