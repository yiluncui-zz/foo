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
package com.amazonaws.services.cloudformation;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWS3Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;


/**
 * Client for accessing AmazonCloudFormation.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS CloudFormation <p>
 * This is the AWS CloudFormation API Reference. The major sections of
 * this guide are described in the following table.
 * </p>
 * Actions Alphabetical list of CloudFormation actions Data Types
 * Alphabetical list of CloudFormation data types Common Parameters
 * Parameters that all Query actions can use Common Errors Client and
 * server errors that all actions can return <p>
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
 * href="http://aws.amazon.com/documentation/cloudformation">
 * CloudFormation Product Page </a> .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need
 * additional technical information about a specific AWS product, you can
 * find the product's technical documentation at
 * http://aws.amazon.com/documentation/.
 * </p>
 */
public class AmazonCloudFormationClient extends AmazonWebServiceClient implements AmazonCloudFormation {

    /**
     * The AWS credentials (access key ID and secret key) to use when
     * authenticating with AWS services.
     */
    private AWSCredentials awsCredentials;

    /**
     * List of exception unmarshallers for all AmazonCloudFormation exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    /** Low level client for sending requests to AWS services. */
    protected final HttpClient client;

    /** Optional request handlers for additional request processing. */
    private final List<RequestHandler> requestHandlers;
    
    /** AWS signer for authenticating requests. */
    private QueryStringSigner signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudFormation
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentials = awsCredentials;

        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ValidationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("stackbuilder.amazonaws.com");

        signer = new QueryStringSigner();

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers = Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudformation/request.handlers"));
        client = new HttpClient(clientConfiguration);
    }

	/**
	 * Appends a request handler to the list of registered handlers that are run
	 * as part of a request's lifecycle.
	 *
	 * @param requestHandler
	 *            The new handler to add to the current list of request
	 *            handlers.
	 */
    public void addRequestHandler(RequestHandler requestHandler) {
    	requestHandlers.add(requestHandler);
    }

    
    /**
     * <p>
     * Creates a stack as specified in the template. Once the call completes
     * successfully, the stack creation starts. You can check the status of
     * the stack via the DescribeStacks API.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
     * per region.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack service method on AmazonCloudFormation.
     * 
     * @return The response from the CreateStack service method, as returned
     *         by AmazonCloudFormation.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateStackRequest> request = new CreateStackRequestMarshaller().marshall(createStackRequest);
        return invoke(request, new CreateStackResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the ValidateTemplate service method, as
     *         returned by AmazonCloudFormation.
     * 
     * @throws ValidationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ValidateTemplateRequest> request = new ValidateTemplateRequestMarshaller().marshall(validateTemplateRequest);
        return invoke(request, new ValidateTemplateResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks service method on AmazonCloudFormation.
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStacksRequest> request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
        return invoke(request, new DescribeStacksResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns all the stack related events for the AWS account. If
     * <code>StackName</code> is specified, returns events related to all the
     * stacks with the given name. If <code>StackName</code> is not
     * specified, returns all the events for the account. For more
     * information about a stack's event history, go to the <a
     * "http://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the DescribeStackEvents service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest describeStackEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStackEventsRequest> request = new DescribeStackEventsRequestMarshaller().marshall(describeStackEventsRequest);
        return invoke(request, new DescribeStackEventsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns the template body for a specified stack name.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate service method on AmazonCloudFormation.
     * 
     * @return The response from the GetTemplate service method, as returned
     *         by AmazonCloudFormation.
     * 
     * @throws ValidationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetTemplateRequest> request = new GetTemplateRequestMarshaller().marshall(getTemplateRequest);
        return invoke(request, new GetTemplateResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully,
     * stack deletion starts. Deleted stacks do not show up in the
     * DescribeStacks API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteStackRequest> request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
        invoke(request, null);
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions. If <code>StackName</code> is
     * specified, all the associated resources that are part of the stack are
     * returned. If <code>PhysicalResourceId</code> is specified, all the
     * associated resources of the stack the resource belongs to are
     * returned.
     * </p>
     * <p>
     * You must specify <code>StackName</code> or
     * <code>PhysicalResourceId.</code> In addition, you can specify
     * <code>LogicalResourceId</code> to filter the returned result. For more
     * information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code> , go to the <a
     * "http://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b> A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the DescribeStackResources service method,
     *         as returned by AmazonCloudFormation.
     * 
     * @throws ValidationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest describeStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStackResourcesRequest> request = new DescribeStackResourcesRequestMarshaller().marshall(describeStackResourcesRequest);
        return invoke(request, new DescribeStackResourcesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Validates a specified template.
     * </p>
     * 
     * @return The response from the ValidateTemplate service method, as
     *         returned by AmazonCloudFormation.
     * 
     * @throws ValidationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateTemplateResult validateTemplate() throws AmazonServiceException, AmazonClientException {
        return validateTemplate(new ValidateTemplateRequest());
    }
    
    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks() throws AmazonServiceException, AmazonClientException {
        return describeStacks(new DescribeStacksRequest());
    }
    
    /**
     * <p>
     * Returns all the stack related events for the AWS account. If
     * <code>StackName</code> is specified, returns events related to all the
     * stacks with the given name. If <code>StackName</code> is not
     * specified, returns all the events for the account. For more
     * information about a stack's event history, go to the <a
     * "http://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     * 
     * @return The response from the DescribeStackEvents service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackEventsResult describeStackEvents() throws AmazonServiceException, AmazonClientException {
        return describeStackEvents(new DescribeStackEventsRequest());
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions. If <code>StackName</code> is
     * specified, all the associated resources that are part of the stack are
     * returned. If <code>PhysicalResourceId</code> is specified, all the
     * associated resources of the stack the resource belongs to are
     * returned.
     * </p>
     * <p>
     * You must specify <code>StackName</code> or
     * <code>PhysicalResourceId.</code> In addition, you can specify
     * <code>LogicalResourceId</code> to filter the returned result. For more
     * information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code> , go to the <a
     * "http://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b> A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     * 
     * @return The response from the DescribeStackResources service method,
     *         as returned by AmazonCloudFormation.
     * 
     * @throws ValidationErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackResourcesResult describeStackResources() throws AmazonServiceException, AmazonClientException {
        return describeStackResources(new DescribeStackResourcesRequest());
    }
    


    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        // Apply any additional service specific request handlers that need to be run
        if (requestHandlers != null) {
            for (RequestHandler requestHandler : requestHandlers) {
                requestHandler.beforeRequest(request);
            }
        }

        if (request.getOriginalRequest().getRequestCredentials() != null) {
	        signer.sign(request, request.getOriginalRequest().getRequestCredentials());
        } else {
    	    signer.sign(request, awsCredentials);
        }

        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        ExecutionContext executionContext = new ExecutionContext(requestHandlers);
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        