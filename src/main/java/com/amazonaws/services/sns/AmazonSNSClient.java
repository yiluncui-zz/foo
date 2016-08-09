/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns;

import org.w3c.dom.*;

import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.services.sns.model.transform.*;


/**
 * Client for accessing AmazonSNS.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon Simple Notification Service <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested subscribers over multiple delivery protocols. For more information about this
 * product see <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> . For detailed information about Amazon SNS features and their
 * associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/"> Amazon SNS Developer Guide </a> .
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain functionality that automatically
 * takes care of tasks such as: cryptographically signing your service requests, retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/"> Tools for Amazon Web Services </a> .
 * </p>
 */
public class AmazonSNSClient extends AmazonWebServiceClient implements AmazonSNS {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonSNS exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSNSClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSNSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonSNSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonSNSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new TopicLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EndpointDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PlatformApplicationDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionLimitExceededExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("sns.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("sns");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/sns/request.handlers"));
    }

    
    /**
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     *
     * @param confirmSubscriptionRequest Container for the necessary
     *           parameters to execute the ConfirmSubscription service method on
     *           AmazonSNS.
     * 
     * @return The response from the ConfirmSubscription service method, as
     *         returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmSubscriptionResult confirmSubscription(ConfirmSubscriptionRequest confirmSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(confirmSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ConfirmSubscriptionRequest> request = null;
        ConfirmSubscriptionResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ConfirmSubscriptionRequestMarshaller().marshall(confirmSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ConfirmSubscriptionResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>CreatePlatformApplication</code> action creates a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM, to which devices and mobile apps may
     * register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code>
     * action. The PlatformPrincipal is received from the notification
     * service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL
     * certificate". For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is "private key". For GCM, PlatformCredential is
     * "API key". For ADM, PlatformCredential is "client secret". The
     * PlatformApplicationArn that is returned when using
     * <code>CreatePlatformApplication</code> is then used as an attribute
     * for the <code>CreatePlatformEndpoint</code> action. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformApplicationRequest Container for the necessary
     *           parameters to execute the CreatePlatformApplication service method on
     *           AmazonSNS.
     * 
     * @return The response from the CreatePlatformApplication service
     *         method, as returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePlatformApplicationResult createPlatformApplication(CreatePlatformApplicationRequest createPlatformApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePlatformApplicationRequest> request = null;
        CreatePlatformApplicationResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreatePlatformApplicationRequestMarshaller().marshall(createPlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new CreatePlatformApplicationResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>GetTopicAttributes</code> action returns all of the
     * properties of a topic. Topic properties returned might differ based on
     * the authorization of the user.
     * </p>
     *
     * @param getTopicAttributesRequest Container for the necessary
     *           parameters to execute the GetTopicAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetTopicAttributes service method, as
     *         returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTopicAttributesResult getTopicAttributes(GetTopicAttributesRequest getTopicAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetTopicAttributesRequest> request = null;
        GetTopicAttributesResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetTopicAttributesRequestMarshaller().marshall(getTopicAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new GetTopicAttributesResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>Subscribe</code> action prepares to subscribe an endpoint by
     * sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the
     * <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     *
     * @param subscribeRequest Container for the necessary parameters to
     *           execute the Subscribe service method on AmazonSNS.
     * 
     * @return The response from the Subscribe service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws SubscriptionLimitExceededException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SubscribeResult subscribe(SubscribeRequest subscribeRequest) {
        ExecutionContext executionContext = createExecutionContext(subscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SubscribeRequest> request = null;
        SubscribeResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SubscribeRequestMarshaller().marshall(subscribeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new SubscribeResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>DeleteEndpoint</code> action, which is idempotent, deletes
     * the endpoint from SNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deleteEndpointRequest Container for the necessary parameters to
     *           execute the DeleteEndpoint service method on AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteEndpointRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>SetTopicAttributes</code> action allows a topic owner to set
     * an attribute of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes service method on
     *           AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTopicAttributes(SetTopicAttributesRequest setTopicAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(setTopicAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetTopicAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetTopicAttributesRequestMarshaller().marshall(setTopicAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>RemovePermission</code> action removes a statement from a
     * topic's access control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removePermission(RemovePermissionRequest removePermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(removePermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<RemovePermissionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new RemovePermissionRequestMarshaller().marshall(removePermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>GetEndpointAttributes</code> retrieves the endpoint
     * attributes for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getEndpointAttributesRequest Container for the necessary
     *           parameters to execute the GetEndpointAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetEndpointAttributes service method, as
     *         returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEndpointAttributesResult getEndpointAttributes(GetEndpointAttributesRequest getEndpointAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetEndpointAttributesRequest> request = null;
        GetEndpointAttributesResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetEndpointAttributesRequestMarshaller().marshall(getEndpointAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new GetEndpointAttributesResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsRequest Container for the necessary parameters
     *           to execute the ListSubscriptions service method on AmazonSNS.
     * 
     * @return The response from the ListSubscriptions service method, as
     *         returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions(ListSubscriptionsRequest listSubscriptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListSubscriptionsRequest> request = null;
        ListSubscriptionsResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListSubscriptionsRequestMarshaller().marshall(listSubscriptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ListSubscriptionsResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>CreatePlatformEndpoint</code> creates an endpoint for a
     * device and mobile app on one of the supported push notification
     * services, such as GCM and APNS. <code>CreatePlatformEndpoint</code>
     * requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code> . The EndpointArn that is
     * returned when using <code>CreatePlatformEndpoint</code> can then be
     * used by the <code>Publish</code> action to send a message to a mobile
     * app or by the <code>Subscribe</code> action for subscription to a
     * topic. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformEndpointRequest Container for the necessary
     *           parameters to execute the CreatePlatformEndpoint service method on
     *           AmazonSNS.
     * 
     * @return The response from the CreatePlatformEndpoint service method,
     *         as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePlatformEndpointResult createPlatformEndpoint(CreatePlatformEndpointRequest createPlatformEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(createPlatformEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreatePlatformEndpointRequest> request = null;
        CreatePlatformEndpointResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreatePlatformEndpointRequestMarshaller().marshall(createPlatformEndpointRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new CreatePlatformEndpointResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>SetSubscriptionAttributes</code> action allows a
     * subscription owner to set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes service method on
     *           AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setSubscriptionAttributes(SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(setSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetSubscriptionAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetSubscriptionAttributesRequestMarshaller().marshall(setSubscriptionAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>CreateTopic</code> action creates a topic to which
     * notifications can be published. Users can create at most 100 topics.
     * For more information, see <a href="http://aws.amazon.com/sns/">
     * http://aws.amazon.com/sns </a> . This action is idempotent, so if the
     * requester already owns a topic with the specified name, that topic's
     * ARN is returned without creating a new topic.
     * </p>
     *
     * @param createTopicRequest Container for the necessary parameters to
     *           execute the CreateTopic service method on AmazonSNS.
     * 
     * @return The response from the CreateTopic service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     * @throws TopicLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTopicResult createTopic(CreateTopicRequest createTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(createTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateTopicRequest> request = null;
        CreateTopicResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateTopicRequestMarshaller().marshall(createTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new CreateTopicResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>GetSubscriptionAttribtues</code> action returns all of the
     * properties of a subscription.
     * </p>
     *
     * @param getSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the GetSubscriptionAttributes service method on
     *           AmazonSNS.
     * 
     * @return The response from the GetSubscriptionAttributes service
     *         method, as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSubscriptionAttributesResult getSubscriptionAttributes(GetSubscriptionAttributesRequest getSubscriptionAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getSubscriptionAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetSubscriptionAttributesRequest> request = null;
        GetSubscriptionAttributesResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetSubscriptionAttributesRequestMarshaller().marshall(getSubscriptionAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new GetSubscriptionAttributesResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
     * </p>
     *
     * @param listTopicsRequest Container for the necessary parameters to
     *           execute the ListTopics service method on AmazonSNS.
     * 
     * @return The response from the ListTopics service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics(ListTopicsRequest listTopicsRequest) {
        ExecutionContext executionContext = createExecutionContext(listTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListTopicsRequest> request = null;
        ListTopicsResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListTopicsRequestMarshaller().marshall(listTopicsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ListTopicsResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>DeletePlatformApplication</code> action deletes a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deletePlatformApplicationRequest Container for the necessary
     *           parameters to execute the DeletePlatformApplication service method on
     *           AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePlatformApplication(DeletePlatformApplicationRequest deletePlatformApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeletePlatformApplicationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeletePlatformApplicationRequestMarshaller().marshall(deletePlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listPlatformApplicationsRequest Container for the necessary
     *           parameters to execute the ListPlatformApplications service method on
     *           AmazonSNS.
     * 
     * @return The response from the ListPlatformApplications service method,
     *         as returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPlatformApplicationsResult listPlatformApplications(ListPlatformApplicationsRequest listPlatformApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPlatformApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListPlatformApplicationsRequest> request = null;
        ListPlatformApplicationsResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListPlatformApplicationsRequestMarshaller().marshall(listPlatformApplicationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ListPlatformApplicationsResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>SetEndpointAttributes</code> action sets the attributes for
     * an endpoint for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setEndpointAttributesRequest Container for the necessary
     *           parameters to execute the SetEndpointAttributes service method on
     *           AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setEndpointAttributes(SetEndpointAttributesRequest setEndpointAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(setEndpointAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetEndpointAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetEndpointAttributesRequestMarshaller().marshall(setEndpointAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>Unsubscribe</code> action deletes a subscription. If the
     * subscription requires authentication for deletion, only the owner of
     * the subscription or the topic's owner can unsubscribe, and an AWS
     * signature is required. If the <code>Unsubscribe</code> call does not
     * require authentication and the requester is not the subscription
     * owner, a final cancellation message is delivered to the endpoint, so
     * that the endpoint owner can easily resubscribe to the topic if the
     * <code>Unsubscribe</code> request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unsubscribe(UnsubscribeRequest unsubscribeRequest) {
        ExecutionContext executionContext = createExecutionContext(unsubscribeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UnsubscribeRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UnsubscribeRequestMarshaller().marshall(unsubscribeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>DeleteTopic</code> action deletes a topic and all its
     * subscriptions. Deleting a topic might prevent some messages previously
     * sent to the topic from being delivered to subscribers. This action is
     * idempotent, so deleting a topic that does not exist does not result in
     * an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTopic(DeleteTopicRequest deleteTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteTopicRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteTopicRequestMarshaller().marshall(deleteTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>GetPlatformApplicationAttributes</code> action retrieves the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the GetPlatformApplicationAttributes
     *           service method on AmazonSNS.
     * 
     * @return The response from the GetPlatformApplicationAttributes service
     *         method, as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPlatformApplicationAttributesResult getPlatformApplicationAttributes(GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(getPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetPlatformApplicationAttributesRequest> request = null;
        GetPlatformApplicationAttributesResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetPlatformApplicationAttributesRequestMarshaller().marshall(getPlatformApplicationAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new GetPlatformApplicationAttributesResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>SetPlatformApplicationAttributes</code> action sets the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the SetPlatformApplicationAttributes
     *           service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setPlatformApplicationAttributes(SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(setPlatformApplicationAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetPlatformApplicationAttributesRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetPlatformApplicationAttributesRequestMarshaller().marshall(setPlatformApplicationAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>AddPermission</code> action adds a statement to a topic's
     * access control policy, granting access for the specified AWS accounts
     * to the specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission service method on AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addPermission(AddPermissionRequest addPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(addPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<AddPermissionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new AddPermissionRequestMarshaller().marshall(addPermissionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * The <code>ListEndpointsByPlatformApplication</code> action lists the
     * endpoints and endpoint attributes for devices in a supported push
     * notification service, such as GCM and APNS. The results for
     * <code>ListEndpointsByPlatformApplication</code> are paginated and
     * return a limited list of endpoints, up to 100. If additional records
     * are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the
     * NextToken string received from the previous call. When there are no
     * more records to return, NextToken will be null. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listEndpointsByPlatformApplicationRequest Container for the
     *           necessary parameters to execute the ListEndpointsByPlatformApplication
     *           service method on AmazonSNS.
     * 
     * @return The response from the ListEndpointsByPlatformApplication
     *         service method, as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListEndpointsByPlatformApplicationResult listEndpointsByPlatformApplication(ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(listEndpointsByPlatformApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListEndpointsByPlatformApplicationRequest> request = null;
        ListEndpointsByPlatformApplicationResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListEndpointsByPlatformApplicationRequestMarshaller().marshall(listEndpointsByPlatformApplicationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ListEndpointsByPlatformApplicationResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsByTopicRequest Container for the necessary
     *           parameters to execute the ListSubscriptionsByTopic service method on
     *           AmazonSNS.
     * 
     * @return The response from the ListSubscriptionsByTopic service method,
     *         as returned by AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsByTopicResult listSubscriptionsByTopic(ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(listSubscriptionsByTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListSubscriptionsByTopicRequest> request = null;
        ListSubscriptionsByTopicResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListSubscriptionsByTopicRequestMarshaller().marshall(listSubscriptionsByTopicRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new ListSubscriptionsByTopicResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish service method on AmazonSNS.
     * 
     * @return The response from the Publish service method, as returned by
     *         AmazonSNS.
     * 
     * @throws NotFoundException
     * @throws PlatformApplicationDisabledException
     * @throws EndpointDisabledException
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PublishResult publish(PublishRequest publishRequest) {
        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<PublishRequest> request = null;
        PublishResult response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new PublishRequestMarshaller().marshall(publishRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            return response = invoke(request, new PublishResultStaxUnmarshaller(), executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
     * </p>
     * 
     * @return The response from the ListSubscriptions service method, as
     *         returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListSubscriptionsResult listSubscriptions() throws AmazonServiceException, AmazonClientException {
        return listSubscriptions(new ListSubscriptionsRequest());
    }
    
    /**
     * <p>
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
     * </p>
     * 
     * @return The response from the ListTopics service method, as returned
     *         by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTopicsResult listTopics() throws AmazonServiceException, AmazonClientException {
        return listTopics(new ListTopicsRequest());
    }
    
    /**
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     * 
     * @return The response from the ListPlatformApplications service method,
     *         as returned by AmazonSNS.
     * 
     * @throws AuthorizationErrorException
     * @throws InternalErrorException
     * @throws InvalidParameterException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPlatformApplicationsResult listPlatformApplications() throws AmazonServiceException, AmazonClientException {
        return listPlatformApplications(new ListPlatformApplicationsRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("https://sns.us-east-1.amazonaws.com") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "sns.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://sns.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "sns.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sns.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "sns";
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

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        