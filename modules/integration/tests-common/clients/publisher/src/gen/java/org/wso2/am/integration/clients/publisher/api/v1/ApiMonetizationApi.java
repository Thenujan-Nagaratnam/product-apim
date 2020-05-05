/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1;

import org.wso2.am.integration.clients.publisher.api.ApiCallback;
import org.wso2.am.integration.clients.publisher.api.ApiClient;
import org.wso2.am.integration.clients.publisher.api.ApiException;
import org.wso2.am.integration.clients.publisher.api.ApiResponse;
import org.wso2.am.integration.clients.publisher.api.Configuration;
import org.wso2.am.integration.clients.publisher.api.Pair;
import org.wso2.am.integration.clients.publisher.api.ProgressRequestBody;
import org.wso2.am.integration.clients.publisher.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.publisher.api.v1.dto.APIMonetizationInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIMonetizationUsageDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIRevenueDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiMonetizationApi {
    private ApiClient apiClient;

    public ApiMonetizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiMonetizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisApiIdMonetizationGet
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdMonetizationGetCall(String apiId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/monetization"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdMonetizationGetValidateBeforeCall(String apiId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdMonetizationGet(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdMonetizationGetCall(apiId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get monetization status for each tier in a given API
     * This operation can be used to get monetization status for each tier in a given API 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apisApiIdMonetizationGet(String apiId) throws ApiException {
        apisApiIdMonetizationGetWithHttpInfo(apiId);
    }

    /**
     * Get monetization status for each tier in a given API
     * This operation can be used to get monetization status for each tier in a given API 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apisApiIdMonetizationGetWithHttpInfo(String apiId) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdMonetizationGetValidateBeforeCall(apiId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get monetization status for each tier in a given API (asynchronously)
     * This operation can be used to get monetization status for each tier in a given API 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdMonetizationGetAsync(String apiId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdMonetizationGetValidateBeforeCall(apiId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for apisApiIdMonetizePost
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Monetization data object  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdMonetizePostCall(String apiId, APIMonetizationInfoDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/monetize"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdMonetizePostValidateBeforeCall(String apiId, APIMonetizationInfoDTO body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdMonetizePost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apisApiIdMonetizePost(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdMonetizePostCall(apiId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Configure monetization for a given API
     * This operation can be used to configure monetization for a given API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Monetization data object  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apisApiIdMonetizePost(String apiId, APIMonetizationInfoDTO body) throws ApiException {
        apisApiIdMonetizePostWithHttpInfo(apiId, body);
    }

    /**
     * Configure monetization for a given API
     * This operation can be used to configure monetization for a given API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Monetization data object  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apisApiIdMonetizePostWithHttpInfo(String apiId, APIMonetizationInfoDTO body) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdMonetizePostValidateBeforeCall(apiId, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Configure monetization for a given API (asynchronously)
     * This operation can be used to configure monetization for a given API. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param body Monetization data object  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdMonetizePostAsync(String apiId, APIMonetizationInfoDTO body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdMonetizePostValidateBeforeCall(apiId, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for apisApiIdRevenueGet
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRevenueGetCall(String apiId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/revenue"
            .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisApiIdRevenueGetValidateBeforeCall(String apiId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdRevenueGet(Async)");
        }
        

        com.squareup.okhttp.Call call = apisApiIdRevenueGetCall(apiId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get total revenue details of a given monetized API with meterd billing.
     * This operation can be used to get details of total revenue details of a given monetized API with meterd billing. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @return APIRevenueDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIRevenueDTO apisApiIdRevenueGet(String apiId) throws ApiException {
        ApiResponse<APIRevenueDTO> resp = apisApiIdRevenueGetWithHttpInfo(apiId);
        return resp.getData();
    }

    /**
     * Get total revenue details of a given monetized API with meterd billing.
     * This operation can be used to get details of total revenue details of a given monetized API with meterd billing. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @return ApiResponse&lt;APIRevenueDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIRevenueDTO> apisApiIdRevenueGetWithHttpInfo(String apiId) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdRevenueGetValidateBeforeCall(apiId, null, null);
        Type localVarReturnType = new TypeToken<APIRevenueDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get total revenue details of a given monetized API with meterd billing. (asynchronously)
     * This operation can be used to get details of total revenue details of a given monetized API with meterd billing. 
     * @param apiId **API ID** consisting of the **UUID** of the API.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRevenueGetAsync(String apiId, final ApiCallback<APIRevenueDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisApiIdRevenueGetValidateBeforeCall(apiId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIRevenueDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsSubscriptionIdUsageGet
     * @param subscriptionId Subscription Id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsSubscriptionIdUsageGetCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscriptions/{subscriptionId}/usage"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsSubscriptionIdUsageGetValidateBeforeCall(String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling subscriptionsSubscriptionIdUsageGet(Async)");
        }
        

        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdUsageGetCall(subscriptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get details of a pending invoice for a monetized subscription with meterd billing.
     * This operation can be used to get details of a pending invoice for a monetized subscription with meterd billing. 
     * @param subscriptionId Subscription Id  (required)
     * @return APIMonetizationUsageDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIMonetizationUsageDTO subscriptionsSubscriptionIdUsageGet(String subscriptionId) throws ApiException {
        ApiResponse<APIMonetizationUsageDTO> resp = subscriptionsSubscriptionIdUsageGetWithHttpInfo(subscriptionId);
        return resp.getData();
    }

    /**
     * Get details of a pending invoice for a monetized subscription with meterd billing.
     * This operation can be used to get details of a pending invoice for a monetized subscription with meterd billing. 
     * @param subscriptionId Subscription Id  (required)
     * @return ApiResponse&lt;APIMonetizationUsageDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIMonetizationUsageDTO> subscriptionsSubscriptionIdUsageGetWithHttpInfo(String subscriptionId) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdUsageGetValidateBeforeCall(subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<APIMonetizationUsageDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of a pending invoice for a monetized subscription with meterd billing. (asynchronously)
     * This operation can be used to get details of a pending invoice for a monetized subscription with meterd billing. 
     * @param subscriptionId Subscription Id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsSubscriptionIdUsageGetAsync(String subscriptionId, final ApiCallback<APIMonetizationUsageDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsSubscriptionIdUsageGetValidateBeforeCall(subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIMonetizationUsageDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}