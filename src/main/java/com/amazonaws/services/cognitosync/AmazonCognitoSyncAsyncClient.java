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
package com.amazonaws.services.cognitosync;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.cognitosync.model.*;

/**
 * Asynchronous client for accessing AmazonCognitoSync.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Cognito Sync <p>
 * Amazon Cognito Sync provides an AWS service and client library that
 * enable cross-device syncing of application-related user data.
 * High-level client libraries are available for both iOS and Android.
 * You can use these libraries to persist data locally so that it's
 * available even if the device is offline. Developer credentials don't
 * need to be stored on the mobile device to access the service. You can
 * use Amazon Cognito to obtain a normalized user ID and credentials.
 * User data is persisted in a dataset that can store up to 1 MB of
 * key-value pairs, and you can have up to 20 datasets per user identity.
 * </p>
 */
public class AmazonCognitoSyncAsyncClient extends AmazonCognitoSyncClient
        implements AmazonCognitoSyncAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync.  A credentials provider chain will be used
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
    public AmazonCognitoSyncAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync.  A credentials provider chain will be used
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
     *                       client connects to AmazonCognitoSync
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCognitoSyncAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCognitoSync using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonCognitoSyncAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Posts updates to records and add and delete records for a dataset and
     * user.
     * </p>
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(final UpdateRecordsRequest updateRecordsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateRecordsResult>() {
            public UpdateRecordsResult call() throws Exception {
                return updateRecords(updateRecordsRequest);
        }
    });
    }

    /**
     * <p>
     * Posts updates to records and add and delete records for a dataset and
     * user.
     * </p>
     *
     * @param updateRecordsRequest Container for the necessary parameters to
     *           execute the UpdateRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRecordsResult> updateRecordsAsync(
            final UpdateRecordsRequest updateRecordsRequest,
            final AsyncHandler<UpdateRecordsRequest, UpdateRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateRecordsResult>() {
            public UpdateRecordsResult call() throws Exception {
              UpdateRecordsResult result;
                try {
                result = updateRecords(updateRecordsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateRecordsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular
     * identity pool.
     * </p>
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(final DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityPoolUsageResult>() {
            public DescribeIdentityPoolUsageResult call() throws Exception {
                return describeIdentityPoolUsage(describeIdentityPoolUsageRequest);
        }
    });
    }

    /**
     * <p>
     * Gets usage details (for example, data storage) about a particular
     * identity pool.
     * </p>
     *
     * @param describeIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityPoolUsageResult> describeIdentityPoolUsageAsync(
            final DescribeIdentityPoolUsageRequest describeIdentityPoolUsageRequest,
            final AsyncHandler<DescribeIdentityPoolUsageRequest, DescribeIdentityPoolUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityPoolUsageResult>() {
            public DescribeIdentityPoolUsageResult call() throws Exception {
              DescribeIdentityPoolUsageResult result;
                try {
                result = describeIdentityPoolUsage(describeIdentityPoolUsageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeIdentityPoolUsageRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists datasets for an identity.
     * </p>
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(final ListDatasetsRequest listDatasetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDatasetsResult>() {
            public ListDatasetsResult call() throws Exception {
                return listDatasets(listDatasetsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists datasets for an identity.
     * </p>
     *
     * @param listDatasetsRequest Container for the necessary parameters to
     *           execute the ListDatasets operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDatasetsResult> listDatasetsAsync(
            final ListDatasetsRequest listDatasetsRequest,
            final AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDatasetsResult>() {
            public ListDatasetsResult call() throws Exception {
              ListDatasetsResult result;
                try {
                result = listDatasets(listDatasetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDatasetsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(final ListIdentityPoolUsageRequest listIdentityPoolUsageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoolUsageResult>() {
            public ListIdentityPoolUsageResult call() throws Exception {
                return listIdentityPoolUsage(listIdentityPoolUsageRequest);
        }
    });
    }

    /**
     * <p>
     * Gets a list of identity pools registered with Cognito.
     * </p>
     *
     * @param listIdentityPoolUsageRequest Container for the necessary
     *           parameters to execute the ListIdentityPoolUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentityPoolUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentityPoolUsageResult> listIdentityPoolUsageAsync(
            final ListIdentityPoolUsageRequest listIdentityPoolUsageRequest,
            final AsyncHandler<ListIdentityPoolUsageRequest, ListIdentityPoolUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentityPoolUsageResult>() {
            public ListIdentityPoolUsageResult call() throws Exception {
              ListIdentityPoolUsageResult result;
                try {
                result = listIdentityPoolUsage(listIdentityPoolUsageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listIdentityPoolUsageRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync
     * count for a dataset and identity.
     * </p>
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(final ListRecordsRequest listRecordsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRecordsResult>() {
            public ListRecordsResult call() throws Exception {
                return listRecords(listRecordsRequest);
        }
    });
    }

    /**
     * <p>
     * Gets paginated records, optionally changed after a particular sync
     * count for a dataset and identity.
     * </p>
     *
     * @param listRecordsRequest Container for the necessary parameters to
     *           execute the ListRecords operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListRecords service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListRecordsResult> listRecordsAsync(
            final ListRecordsRequest listRecordsRequest,
            final AsyncHandler<ListRecordsRequest, ListRecordsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListRecordsResult>() {
            public ListRecordsResult call() throws Exception {
              ListRecordsResult result;
                try {
                result = listRecords(listRecordsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listRecordsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets metadata about a dataset by identity and dataset name.
     * </p>
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(final DescribeDatasetRequest describeDatasetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDatasetResult>() {
            public DescribeDatasetResult call() throws Exception {
                return describeDataset(describeDatasetRequest);
        }
    });
    }

    /**
     * <p>
     * Gets metadata about a dataset by identity and dataset name.
     * </p>
     *
     * @param describeDatasetRequest Container for the necessary parameters
     *           to execute the DescribeDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDatasetResult> describeDatasetAsync(
            final DescribeDatasetRequest describeDatasetRequest,
            final AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDatasetResult>() {
            public DescribeDatasetResult call() throws Exception {
              DescribeDatasetResult result;
                try {
                result = describeDataset(describeDatasetRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDatasetRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted
     * permanently, and the action can't be undone. Datasets that this
     * dataset was merged with will no longer report the merge. Any
     * consequent operation on this dataset will result in a
     * ResourceNotFoundException.
     * </p>
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(final DeleteDatasetRequest deleteDatasetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDatasetResult>() {
            public DeleteDatasetResult call() throws Exception {
                return deleteDataset(deleteDatasetRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes the specific dataset. The dataset will be deleted
     * permanently, and the action can't be undone. Datasets that this
     * dataset was merged with will no longer report the merge. Any
     * consequent operation on this dataset will result in a
     * ResourceNotFoundException.
     * </p>
     *
     * @param deleteDatasetRequest Container for the necessary parameters to
     *           execute the DeleteDataset operation on AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataset service method, as returned by AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDatasetResult> deleteDatasetAsync(
            final DeleteDatasetRequest deleteDatasetRequest,
            final AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDatasetResult>() {
            public DeleteDatasetResult call() throws Exception {
              DeleteDatasetResult result;
                try {
                result = deleteDataset(deleteDatasetRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDatasetRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Gets usage information for an identity, including number of datasets
     * and data usage.
     * </p>
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(final DescribeIdentityUsageRequest describeIdentityUsageRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityUsageResult>() {
            public DescribeIdentityUsageResult call() throws Exception {
                return describeIdentityUsage(describeIdentityUsageRequest);
        }
    });
    }

    /**
     * <p>
     * Gets usage information for an identity, including number of datasets
     * and data usage.
     * </p>
     *
     * @param describeIdentityUsageRequest Container for the necessary
     *           parameters to execute the DescribeIdentityUsage operation on
     *           AmazonCognitoSync.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIdentityUsage service method, as returned by
     *         AmazonCognitoSync.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCognitoSync indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIdentityUsageResult> describeIdentityUsageAsync(
            final DescribeIdentityUsageRequest describeIdentityUsageRequest,
            final AsyncHandler<DescribeIdentityUsageRequest, DescribeIdentityUsageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIdentityUsageResult>() {
            public DescribeIdentityUsageResult call() throws Exception {
              DescribeIdentityUsageResult result;
                try {
                result = describeIdentityUsage(describeIdentityUsageRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeIdentityUsageRequest, result);
                 return result;
        }
    });
    }
    
}
        