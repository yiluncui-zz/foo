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
package com.amazonaws.services.cloudformation;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AmazonCloudFormation asynchronously,
 * using Java Futures.
 * AWS CloudFormation <p>
 * This is the AWS CloudFormation API Reference. The major sections of
 * this guide are described in the following table.
 * </p>
 * 
 * <ul>
 * <li> <a
 * rvices.com/AWSCloudFormation/latest/APIReference/API_Operations.html">
 * Actions </a> : Alphabetical list of CloudFormation actions</li>
 * <li> <a
 * webservices.com/AWSCloudFormation/latest/APIReference/API_Types.html">
 * Data Types </a> : Alphabetical list of CloudFormation data types</li>
 * <li> <a
 * ices.com/AWSCloudFormation/latest/APIReference/CommonParameters.html">
 * Common Parameters </a> : Parameters that all Query actions can
 * use</li>
 * <li> <a
 * services.com/AWSCloudFormation/latest/APIReference/CommonErrors.html">
 * Common Errors </a> : Client and server errors that all actions can
 * return</li>
 * 
 * </ul>
 * <p>
 * This guide is for programmers who need detailed information about the
 * CloudFormation APIs. You use AWS CloudFormation to create and manage
 * AWS infrastructure deployments predictably and repeatedly.
 * CloudFormation helps you leverage AWS products such as Amazon EC2,
 * EBS, Amazon SNS, ELB, and Auto Scaling to build highly-reliable,
 * highly scalable, cost effective applications without worrying about
 * creating and configuring the underlying the AWS infrastructure.
 * </p>
 * <p>
 * Through the use of a template file you write, and a few AWS
 * CloudFormation commands or API actions, AWS CloudFormation enables you
 * to manage a collection of resources together as a single unit called a
 * stack. AWS CloudFormation creates and deletes all member resources of
 * the stack together and manages all dependencies between the resources
 * for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/cloudformation/"> CloudFormation Product
 * Page </a> .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need
 * additional technical information about a specific AWS product, you can
 * find the product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/">
 * http://aws.amazon.com/documentation/ </a> .
 * </p> 
 */       
public interface AmazonCloudFormationAsync extends AmazonCloudFormation {
    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStacks service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStacksResult> listStacksAsync(ListStacksRequest listStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a stack as specified in the template. After the call
     * completes successfully, the stack creation starts. You can check the
     * status of the stack via the DescribeStacks API.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
     * per region.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ValidateTemplate service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ValidateTemplateResult> validateTemplateAsync(ValidateTemplateRequest validateTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simply Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         EstimateTemplateCost service method, as returned by
     *         AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EstimateTemplateCostResult> estimateTemplateCostAsync(EstimateTemplateCostRequest estimateTemplateCostRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns all the stack related events for the AWS account. If
     * <code>StackName</code> is specified, returns events related to all the
     * stacks with the given name. If <code>StackName</code> is not
     * specified, returns all the events for the account. For more
     * information about a stack's event history, go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackEvents service method, as returned by
     *         AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackEventsResult> describeStackEventsAsync(DescribeStackEventsRequest describeStackEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the template body for a specified stack name. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         GetTemplate service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTemplateResult> getTemplateAsync(GetTemplateRequest getTemplateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResource service method, as returned by
     *         AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourceResult> describeStackResourceAsync(DescribeStackResourceRequest describeStackResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully,
     * stack deletion starts. Deleted stacks do not show up in the
     * DescribeStacks API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         ListStackResources service method, as returned by
     *         AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStackResourcesResult> listStackResourcesAsync(ListStackResourcesRequest listStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, all the associated resources of the stack the resource
     * belongs to are returned.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResources returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify <code>StackName</code> or
     * <code>PhysicalResourceId.</code> In addition, you can specify
     * <code>LogicalResourceId</code> to filter the returned result. For more
     * information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code> , go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b> A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources operation on
     *           AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackResources service method, as returned by
     *         AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackResourcesResult> describeStackResourcesAsync(DescribeStackResourcesRequest describeStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a stack as specified in the template. After the call
     * completes successfully, the stack update starts. You can check the
     * status of the stack via the DescribeStacks action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see <a
     * om/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">
     * Updating a Stack </a> .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AmazonCloudFormation.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AmazonCloudFormation.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        