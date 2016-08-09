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
package com.amazonaws.services.support;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.support.model.*;
import com.amazonaws.services.support.model.transform.*;

/**
 * Client for accessing AWSSupport.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need
 * detailed information about the AWS Support actions and data types.
 * This service enables you to manage your AWS Support cases
 * programmatically. It uses HTTP methods that return results in JSON
 * format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of
 * <a href="https://aws.amazon.com/support/trustedadvisor"> Trusted Advisor </a>
 * features. You can retrieve a list of checks and their descriptions,
 * get check results, specify checks to refresh, and get the refresh
 * status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management actions:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity
 * levels. </b> The actions DescribeServices and DescribeSeverityLevels
 * enable you to obtain AWS service names, service codes, service
 * categories, and problem severity levels. You use these values when you
 * call the CreateCase action. </li>
 * <li> <b>Case creation, case details, and case resolution.</b> The
 * actions CreateCase, DescribeCases, and ResolveCase enable you to
 * create AWS Support cases, retrieve them, and resolve them.</li>
 * <li> <b>Case communication.</b> The actions DescribeCommunications
 * and AddCommunicationToCase enable you to retrieve and add
 * communication to AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS
 * Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> DescribeTrustedAdvisorChecks returns the list of checks that run
 * against your AWS resources.</li>
 * <li>Using the CheckId for a specific check returned by
 * DescribeTrustedAdvisorChecks, you can call
 * DescribeTrustedAdvisorCheckResult to obtain the results for the check
 * you specified.</li>
 * <li> DescribeTrustedAdvisorCheckSummaries returns summarized results
 * for one or more Trusted Advisor checks.</li>
 * <li> RefreshTrustedAdvisorCheck requests that Trusted Advisor rerun a
 * specified check. </li>
 * <li> DescribeTrustedAdvisorCheckRefreshStatuses reports the refresh
 * status of one or more checks. </li>
 * 
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * See the AWS Support
 * <a href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html"> User Guide </a>
 * for information about how to use this service to create and manage
 * your support cases, and how to call Trusted Advisor for results of
 * checks on your resources.
 * </p>
 */
public class AWSSupportClient extends AmazonWebServiceClient implements AWSSupport {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSupport.class);

    /**
     * List of exception unmarshallers for all AWSSupport exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport.  A credentials provider chain will be used
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
    public AWSSupportClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport.  A credentials provider chain will be used
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
     *                       client connects to AWSSupport
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSupportClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSupportClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSupport
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSupportClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
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
     *                       client connects to AWSSupport
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSupport
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSSupportClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new CaseCreationLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CaseIdNotFoundExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("support.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/support/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/support/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more CaseDetails data types. </li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the
     * <code>CaseDetails</code> objects.</li>
     * </ol>
     *
     * @param describeCasesRequest Container for the necessary parameters to
     *           execute the DescribeCases service method on AWSSupport.
     * 
     * @return The response from the DescribeCases service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCasesResult describeCases(DescribeCasesRequest describeCasesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCasesRequest> request = null;
        Response<DescribeCasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCasesRequestMarshaller().marshall(describeCasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCasesResult, JsonUnmarshallerContext> unmarshaller = new DescribeCasesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCasesResult> responseHandler = new JsonResponseHandler<DescribeCasesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the refresh status of the Trusted Advisor checks that have the
     * specified check IDs. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     *
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest Container for
     *           the necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckRefreshStatuses service method on
     *           AWSSupport.
     * 
     * @return The response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckRefreshStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckRefreshStatusesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckRefreshStatusesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckRefreshStatusesRequestMarshaller().marshall(describeTrustedAdvisorCheckRefreshStatusesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckRefreshStatusesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckRefreshStatusesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckRefreshStatusesResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckRefreshStatusesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels service method on
     *           AWSSupport.
     * 
     * @return The response from the DescribeSeverityLevels service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSeverityLevelsResult describeSeverityLevels(DescribeSeverityLevelsRequest describeSeverityLevelsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSeverityLevelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSeverityLevelsRequest> request = null;
        Response<DescribeSeverityLevelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSeverityLevelsRequestMarshaller().marshall(describeSeverityLevelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSeverityLevelsResult, JsonUnmarshallerContext> unmarshaller = new DescribeSeverityLevelsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSeverityLevelsResult> responseHandler = new JsonResponseHandler<DescribeSeverityLevelsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns communications regarding the support case. You can use the
     * <code>AfterTime</code> and <code>BeforeTime</code> parameters to
     * filter by date. The <code>CaseId</code> parameter enables you to
     * identify a specific case by its <code>CaseId</code> value.
     * </p>
     * <p>
     * The <code>MaxResults</code> and <code>NextToken</code> parameters
     * enable you to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on
     * each page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications service method on
     *           AWSSupport.
     * 
     * @return The response from the DescribeCommunications service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCommunicationsResult describeCommunications(DescribeCommunicationsRequest describeCommunicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCommunicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCommunicationsRequest> request = null;
        Response<DescribeCommunicationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCommunicationsRequestMarshaller().marshall(describeCommunicationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCommunicationsResult, JsonUnmarshallerContext> unmarshaller = new DescribeCommunicationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCommunicationsResult> responseHandler = new JsonResponseHandler<DescribeCommunicationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. You use
     * the <code>CaseId</code> value to identify the case to add
     * communication to. You can list a set of email addresses to copy on the
     * communication using the <code>CcEmailAddresses</code> value. The
     * <code>CommunicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <p>
     * The response indicates the success or failure of the request.
     * </p>
     * <p>
     * This operation implements a subset of the behavior on the AWS Support
     * <a href="https://aws.amazon.com/support"> Your Support Cases </a>
     * web form.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase service method on
     *           AWSSupport.
     * 
     * @return The response from the AddCommunicationToCase service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddCommunicationToCaseResult addCommunicationToCase(AddCommunicationToCaseRequest addCommunicationToCaseRequest) {
        ExecutionContext executionContext = createExecutionContext(addCommunicationToCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCommunicationToCaseRequest> request = null;
        Response<AddCommunicationToCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCommunicationToCaseRequestMarshaller().marshall(addCommunicationToCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AddCommunicationToCaseResult, JsonUnmarshallerContext> unmarshaller = new AddCommunicationToCaseResultJsonUnmarshaller();
            JsonResponseHandler<AddCommunicationToCaseResult> responseHandler = new JsonResponseHandler<AddCommunicationToCaseResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is
     * modeled on the behavior of the AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> The code for an AWS service. You obtain
     * the <code>ServiceCode</code> by calling DescribeServices. </li>
     * <li> <b>CategoryCode.</b> The category for the service defined for
     * the <code>ServiceCode</code> value. You also obtain the category code
     * for a service by calling DescribeServices. Each AWS service defines
     * its own set of category codes. </li>
     * <li> <b>SeverityCode.</b> A value that indicates the urgency of the
     * case, which in turn determines the response time according to your
     * service level agreement with AWS Support. You obtain the SeverityCode
     * by calling DescribeSeverityLevels.</li>
     * <li> <b>Subject.</b> The <b>Subject</b> field on the AWS Support
     * Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>CommunicationBody.</b> The <b>Description</b> field on the
     * AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language.</b> The human language in which AWS Support handles
     * the case. English and Japanese are currently supported.</li>
     * <li> <b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field
     * on the
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an <a href="http://aws.amazon.com/tools/"> AWS SDK </a>
     * . </li>
     * <li> <b>IssueType.</b> The type of issue for the case. You can
     * specify either "customer-service" or "technical." If you do not
     * indicate a value, the default is "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b> The AWS Support API does not currently support the
     * ability to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful CreateCase request returns an AWS Support case number.
     * Case numbers are used by the DescribeCases action to retrieve existing
     * AWS Support cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase service method on AWSSupport.
     * 
     * @return The response from the CreateCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseCreationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCaseResult createCase(CreateCaseRequest createCaseRequest) {
        ExecutionContext executionContext = createExecutionContext(createCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCaseRequest> request = null;
        Response<CreateCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCaseRequestMarshaller().marshall(createCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCaseResult, JsonUnmarshallerContext> unmarshaller = new CreateCaseResultJsonUnmarshaller();
            JsonResponseHandler<CreateCaseResult> responseHandler = new JsonResponseHandler<CreateCaseResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns information about all available Trusted Advisor checks,
     * including name, ID, category, description, and metadata. You must
     * specify a language code; English ("en") and Japanese ("ja") are
     * currently supported. The response contains a
     * TrustedAdvisorCheckDescription for each check.
     * </p>
     *
     * @param describeTrustedAdvisorChecksRequest Container for the necessary
     *           parameters to execute the DescribeTrustedAdvisorChecks service method
     *           on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorChecks service
     *         method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorChecksRequest> request = null;
        Response<DescribeTrustedAdvisorChecksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorChecksRequestMarshaller().marshall(describeTrustedAdvisorChecksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorChecksResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorChecksResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorChecksResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorChecksResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the results of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a TrustedAdvisorCheckResult object, which
     * contains these three objects:
     * </p>
     * 
     * <ul>
     * <li> TrustedAdvisorCategorySpecificSummary </li>
     * <li> TrustedAdvisorResourceDetail </li>
     * <li> TrustedAdvisorResourcesSummary </li>
     * 
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The alert status of the check: "ok" (green),
     * "warning" (yellow), "error" (red), or "not_available".</li>
     * <li> <b>Timestamp.</b> The time of the last refresh of the
     * check.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param describeTrustedAdvisorCheckResultRequest Container for the
     *           necessary parameters to execute the DescribeTrustedAdvisorCheckResult
     *           service method on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorCheckResult
     *         service method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckResultRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckResultRequest> request = null;
        Response<DescribeTrustedAdvisorCheckResultResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckResultRequestMarshaller().marshall(describeTrustedAdvisorCheckResultRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckResultResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckResultResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckResultResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckResultResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase service method on AWSSupport.
     * 
     * @return The response from the ResolveCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResolveCaseResult resolveCase(ResolveCaseRequest resolveCaseRequest) {
        ExecutionContext executionContext = createExecutionContext(resolveCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveCaseRequest> request = null;
        Response<ResolveCaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveCaseRequestMarshaller().marshall(resolveCaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResolveCaseResult, JsonUnmarshallerContext> unmarshaller = new ResolveCaseResultJsonUnmarshaller();
            JsonResponseHandler<ResolveCaseResult> responseHandler = new JsonResponseHandler<ResolveCaseResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the specified
     * check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a RefreshTrustedAdvisorCheckResult object, which
     * contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The refresh status of the check: "none",
     * "enqueued", "processing", "success", or "abandoned".</li>
     * <li> <b>MillisUntilNextRefreshable.</b> The amount of time, in
     * milliseconds, until the check is eligible for refresh.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param refreshTrustedAdvisorCheckRequest Container for the necessary
     *           parameters to execute the RefreshTrustedAdvisorCheck service method on
     *           AWSSupport.
     * 
     * @return The response from the RefreshTrustedAdvisorCheck service
     *         method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(refreshTrustedAdvisorCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshTrustedAdvisorCheckRequest> request = null;
        Response<RefreshTrustedAdvisorCheckResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshTrustedAdvisorCheckRequestMarshaller().marshall(refreshTrustedAdvisorCheckRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RefreshTrustedAdvisorCheckResult, JsonUnmarshallerContext> unmarshaller = new RefreshTrustedAdvisorCheckResultJsonUnmarshaller();
            JsonResponseHandler<RefreshTrustedAdvisorCheckResult> responseHandler = new JsonResponseHandler<RefreshTrustedAdvisorCheckResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your CreateCase requests. Each AWS service has its own
     * set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices service method on AWSSupport.
     * 
     * @return The response from the DescribeServices service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServicesRequest> request = null;
        Response<DescribeServicesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServicesRequestMarshaller().marshall(describeServicesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeServicesResult, JsonUnmarshallerContext> unmarshaller = new DescribeServicesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeServicesResult> responseHandler = new JsonResponseHandler<DescribeServicesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the summaries of the results of the Trusted Advisor checks
     * that have the specified check IDs. Check IDs can be obtained by
     * calling DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains an array of TrustedAdvisorCheckSummary objects.
     * </p>
     *
     * @param describeTrustedAdvisorCheckSummariesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckSummaries service method on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorCheckSummaries
     *         service method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustedAdvisorCheckSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustedAdvisorCheckSummariesRequest> request = null;
        Response<DescribeTrustedAdvisorCheckSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustedAdvisorCheckSummariesRequestMarshaller().marshall(describeTrustedAdvisorCheckSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTrustedAdvisorCheckSummariesResult, JsonUnmarshallerContext> unmarshaller = new DescribeTrustedAdvisorCheckSummariesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTrustedAdvisorCheckSummariesResult> responseHandler = new JsonResponseHandler<DescribeTrustedAdvisorCheckSummariesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more CaseDetails data types. </li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the
     * <code>CaseDetails</code> objects.</li>
     * </ol>
     * 
     * @return The response from the DescribeCases service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCasesResult describeCases() throws AmazonServiceException, AmazonClientException {
        return describeCases(new DescribeCasesRequest());
    }
    
    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     * 
     * @return The response from the DescribeSeverityLevels service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSeverityLevelsResult describeSeverityLevels() throws AmazonServiceException, AmazonClientException {
        return describeSeverityLevels(new DescribeSeverityLevelsRequest());
    }
    
    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     * 
     * @return The response from the ResolveCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResolveCaseResult resolveCase() throws AmazonServiceException, AmazonClientException {
        return resolveCase(new ResolveCaseRequest());
    }
    
    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your CreateCase requests. Each AWS service has its own
     * set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     * 
     * @return The response from the DescribeServices service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices() throws AmazonServiceException, AmazonClientException {
        return describeServices(new DescribeServicesRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        