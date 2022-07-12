/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.testit.client;

import ru.testit.invoker.ApiCallback;
import ru.testit.invoker.ApiClient;
import ru.testit.invoker.ApiException;
import ru.testit.invoker.ApiResponse;
import ru.testit.invoker.Configuration;
import ru.testit.invoker.Pair;
import ru.testit.invoker.ProgressRequestBody;
import ru.testit.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ru.testit.model.NotificationModel;
import ru.testit.model.NotificationTypeModel;
import ru.testit.model.ProblemDetails;
import java.util.UUID;
import ru.testit.model.ValidationProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsApi {
    private ApiClient apiClient;

    public NotificationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiV2NotificationsCountGet
     * @param isRead  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsCountGetCall(Boolean isRead, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/notifications/count";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isRead != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isRead", isRead));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV2NotificationsCountGetValidateBeforeCall(Boolean isRead, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiV2NotificationsCountGetCall(isRead, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get unread Notifications total in last 7 days
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns unread notifications total (listed in the response example)
     * @param isRead  (optional)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer apiV2NotificationsCountGet(Boolean isRead) throws ApiException {
        ApiResponse<Integer> resp = apiV2NotificationsCountGetWithHttpInfo(isRead);
        return resp.getData();
    }

    /**
     * Get unread Notifications total in last 7 days
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns unread notifications total (listed in the response example)
     * @param isRead  (optional)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> apiV2NotificationsCountGetWithHttpInfo(Boolean isRead) throws ApiException {
        com.squareup.okhttp.Call call = apiV2NotificationsCountGetValidateBeforeCall(isRead, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get unread Notifications total in last 7 days (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns unread notifications total (listed in the response example)
     * @param isRead  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsCountGetAsync(Boolean isRead, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apiV2NotificationsCountGetValidateBeforeCall(isRead, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV2NotificationsGet
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsGetCall(NotificationTypeModel notificationType, Integer skip, Integer take, String orderBy, String searchField, String searchValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/notifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (notificationType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("notificationType", notificationType));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Take", take));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("OrderBy", orderBy));
        if (searchField != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchField", searchField));
        if (searchValue != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("SearchValue", searchValue));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV2NotificationsGetValidateBeforeCall(NotificationTypeModel notificationType, Integer skip, Integer take, String orderBy, String searchField, String searchValue, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiV2NotificationsGetCall(notificationType, skip, take, orderBy, searchField, searchValue, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all Notifications for current User
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns notifications (listed in the response example)
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return List&lt;NotificationModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NotificationModel> apiV2NotificationsGet(NotificationTypeModel notificationType, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
        ApiResponse<List<NotificationModel>> resp = apiV2NotificationsGetWithHttpInfo(notificationType, skip, take, orderBy, searchField, searchValue);
        return resp.getData();
    }

    /**
     * Get all Notifications for current User
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns notifications (listed in the response example)
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return ApiResponse&lt;List&lt;NotificationModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NotificationModel>> apiV2NotificationsGetWithHttpInfo(NotificationTypeModel notificationType, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
        com.squareup.okhttp.Call call = apiV2NotificationsGetValidateBeforeCall(notificationType, skip, take, orderBy, searchField, searchValue, null, null);
        Type localVarReturnType = new TypeToken<List<NotificationModel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Notifications for current User (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns notifications (listed in the response example)
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsGetAsync(NotificationTypeModel notificationType, Integer skip, Integer take, String orderBy, String searchField, String searchValue, final ApiCallback<List<NotificationModel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apiV2NotificationsGetValidateBeforeCall(notificationType, skip, take, orderBy, searchField, searchValue, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NotificationModel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV2NotificationsIdReadPost
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsIdReadPostCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/notifications/{id}/read"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV2NotificationsIdReadPostValidateBeforeCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV2NotificationsIdReadPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV2NotificationsIdReadPostCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set Notification as read
     * &lt;br&gt;Use case  &lt;br&gt;User sets notification internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set notification as read
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiV2NotificationsIdReadPost(UUID id) throws ApiException {
        apiV2NotificationsIdReadPostWithHttpInfo(id);
    }

    /**
     * Set Notification as read
     * &lt;br&gt;Use case  &lt;br&gt;User sets notification internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set notification as read
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiV2NotificationsIdReadPostWithHttpInfo(UUID id) throws ApiException {
        com.squareup.okhttp.Call call = apiV2NotificationsIdReadPostValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Set Notification as read (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User sets notification internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set notification as read
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsIdReadPostAsync(UUID id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apiV2NotificationsIdReadPostValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for apiV2NotificationsReadPost
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsReadPostCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/notifications/read";

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

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV2NotificationsReadPostValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = apiV2NotificationsReadPostCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Set all Notifications as read
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System set all notifications as read
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiV2NotificationsReadPost() throws ApiException {
        apiV2NotificationsReadPostWithHttpInfo();
    }

    /**
     * Set all Notifications as read
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System set all notifications as read
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiV2NotificationsReadPostWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = apiV2NotificationsReadPostValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Set all Notifications as read (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System set all notifications as read
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV2NotificationsReadPostAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apiV2NotificationsReadPostValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
