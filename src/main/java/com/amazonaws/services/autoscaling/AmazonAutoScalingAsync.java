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
package com.amazonaws.services.autoscaling;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing AmazonAutoScaling asynchronously,
 * using Java Futures.
 * <p>
 * Amazon Auto Scaling is an easy-to-use web service designed to
 * automatically launch or terminate EC2 instances based on user defined
 * triggers. Users can set up Auto Scaling groups and associate triggers
 * with these groups to automatically scale computing resources based on
 * parameters such as bandwidth usage or CPU utilization. Auto Scaling
 * groups can work across multiple Availability Zones - distinct physical
 * locations for the hosted EC2 instances - so that if an Availability
 * Zone becomes unhealthy or unavailable, Auto Scaling will automatically
 * re-distribute applications to a healthy Availability Zone.
 * </p> 
 */       
public interface AmazonAutoScalingAsync extends AmazonAutoScaling {
    /**
     * <p>
     * Deletes the specified LaunchConfiguration.
     * </p>
     * <p>
     * The specified LaunchConfiguration must not be currently attached to
     * any Auto Scaling group. Once this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     *
     * @param deleteLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLaunchConfigurationAsync(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a full description of the specified AutoScalingGroup's
     * triggers.
     * </p>
     *
     * @param describeTriggersRequest Container for the necessary parameters
     *           to execute the DescribeTriggers operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTriggers service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTriggersResult> describeTriggersAsync(DescribeTriggersRequest describeTriggersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration for the specified AutoScalingGroup.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any
     * launch configuration settings take effect on any triggers after this
     * call returns. Triggers that are currently in progress aren't affected.
     * </p>
     * <p>
     * <b>NOTE:</b> If the new values are specified for the MinSize or
     * MaxSize parameters, then there will be an implicit call to
     * SetDesiredCapacity to set the group to the new MaxSize. All optional
     * parameters are left unchanged if not passed in the request.
     * </p>
     *
     * @param updateAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the UpdateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Auto Scaling group with the specified name. Once the
     * creation request is completed, the AutoScalingGroup is ready to be
     * used in other calls.
     * </p>
     * <p>
     * <b>NOTE:</b> The client must not have already used up their entire
     * quota of AutoScaling groups in order for this call to be successful.
     * </p>
     *
     * @param createAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the CreateAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified trigger.
     * </p>
     * <p>
     * If a trigger is currently in progress, the trigger continues to run
     * until its activities complete.
     * </p>
     *
     * @param deleteTriggerRequest Container for the necessary parameters to
     *           execute the DeleteTrigger operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrigger service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTriggerAsync(DeleteTriggerRequest deleteTriggerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified instance. Optionally, the desired group size
     * can be adjusted.
     * </p>
     * <p>
     * <b>NOTE:</b> This call simply registers a termination request. The
     * termination of the instance cannot happen immediately.
     * </p>
     *
     * @param terminateInstanceInAutoScalingGroupRequest Container for the
     *           necessary parameters to execute the
     *           TerminateInstanceInAutoScalingGroup operation on AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstanceInAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the parameters that govern how and when to scale an AutoScaling
     * group.
     * </p>
     *
     * @param createOrUpdateScalingTriggerRequest Container for the necessary
     *           parameters to execute the CreateOrUpdateScalingTrigger operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateOrUpdateScalingTrigger service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createOrUpdateScalingTriggerAsync(CreateOrUpdateScalingTriggerRequest createOrUpdateScalingTriggerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a full description of the AutoScalingGroup instances
     * specified in the given list. This includes all Amazon EC2 instances
     * that are members of the Auto Scaling group. If a list of names is not
     * provided, then the full details of all AutoScalingGroups is returned.
     * </p>
     *
     * @param describeAutoScalingGroupsRequest Container for the necessary
     *           parameters to execute the DescribeAutoScalingGroups operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAutoScalingGroups service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new launch configuration. Once created, the new launch
     * configuration is available for immediate use.
     * </p>
     * <p>
     * <b>NOTE:</b> The launch configuration name used must be unique, within
     * the scope of the client's AWS account, and the maximum limit of launch
     * configurations must not yet have been met, or else the call will fail.
     * </p>
     *
     * @param createLaunchConfigurationRequest Container for the necessary
     *           parameters to execute the CreateLaunchConfiguration operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLaunchConfiguration service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createLaunchConfigurationAsync(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a full description of the launch configurations given the
     * specified names.
     * </p>
     * <p>
     * If no names are specified, then the full details of all launch
     * configurations are returned.
     * </p>
     *
     * @param describeLaunchConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeLaunchConfigurations operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLaunchConfigurations service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the scaling activities for the specified Auto Scaling group.
     * </p>
     * <p>
     * If the specified <i>ActivityIds</i> list is empty, all the activities
     * from the past six weeks are returned. Activities will be sorted by
     * completion time. Activities that have no completion time are
     * considered as using the most recent possible time.
     * </p>
     *
     * @param describeScalingActivitiesRequest Container for the necessary
     *           parameters to execute the DescribeScalingActivities operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeScalingActivities service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adjusts the desired size of the AutoScalingGroup by initiating
     * scaling activities. When reducing the size of the group, it is not
     * possible to define which EC2 instances will be terminated. This
     * applies to any auto-scaling decisions that might result in the
     * termination of instances.
     * </p>
     *
     * @param setDesiredCapacityRequest Container for the necessary
     *           parameters to execute the SetDesiredCapacity operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         SetDesiredCapacity service method, as returned by AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes all configuration for the specified AutoScalingGroup and
     * deletes the group.
     * </p>
     * <p>
     * In order to successfully call this API, no triggers can be currently
     * in progress. Once this call successfully executes, no further triggers
     * will begin, and the specified AutoScalingGroup will not be available
     * for use in other API calls.
     * </p>
     * <p>
     * <b>NOTE:</b> The client cannot delete an AutoScalingGroup if it
     * contains instances or if there are scaling activities in progress.
     * Before attempting to delete an AutoScalingGroup, call the
     * UpdateAutoScalingGroup operation to set the minimum and maximum size
     * of the AutoScalingGroup to zero. This will remove all instances and
     * avoid problems with a previously set trigger preventing the deletion
     * of the AutoScalingGroup.
     * </p>
     *
     * @param deleteAutoScalingGroupRequest Container for the necessary
     *           parameters to execute the DeleteAutoScalingGroup operation on
     *           AmazonAutoScaling.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAutoScalingGroup service method, as returned by
     *         AmazonAutoScaling.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonAutoScaling indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        