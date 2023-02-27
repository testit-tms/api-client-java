/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ru.testit.client.api;

import com.google.gson.reflect.TypeToken;
import ru.testit.client.invoker.*;
import ru.testit.client.model.AttachmentModel;
import ru.testit.client.model.ImageResizeType;

import java.io.File;
import java.lang.reflect.Type;
import java.util.*;

public class AttachmentsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AttachmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttachmentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV2AttachmentsIdDelete
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Attachment file was deleted successfully </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Attachment file is already in use </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsIdDeleteCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/attachments/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AttachmentsIdDeleteValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV2AttachmentsIdDelete(Async)");
        }

        return apiV2AttachmentsIdDeleteCall(id, _callback);

    }

    /**
     * Delete attachment file
     * 
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Attachment file was deleted successfully </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Attachment file is already in use </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2AttachmentsIdDelete(UUID id) throws ApiException {
        apiV2AttachmentsIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete attachment file
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Attachment file was deleted successfully </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Attachment file is already in use </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2AttachmentsIdDeleteWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = apiV2AttachmentsIdDeleteValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete attachment file (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Attachment file was deleted successfully </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Attachment file is already in use </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsIdDeleteAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AttachmentsIdDeleteValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2AttachmentsIdGet
     * @param id  (required)
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsIdGetCall(UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/attachments/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (width != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("width", width));
        }

        if (height != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("height", height));
        }

        if (resizeType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resizeType", resizeType));
        }

        if (backgroundColor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("backgroundColor", backgroundColor));
        }

        if (preview != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("preview", preview));
        }

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AttachmentsIdGetValidateBeforeCall(UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV2AttachmentsIdGet(Async)");
        }

        return apiV2AttachmentsIdGetCall(id, width, height, resizeType, backgroundColor, preview, _callback);

    }

    /**
     * Download attachment file
     * 
     * @param id  (required)
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public File apiV2AttachmentsIdGet(UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview) throws ApiException {
        ApiResponse<File> localVarResp = apiV2AttachmentsIdGetWithHttpInfo(id, width, height, resizeType, backgroundColor, preview);
        return localVarResp.getData();
    }

    /**
     * Download attachment file
     * 
     * @param id  (required)
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> apiV2AttachmentsIdGetWithHttpInfo(UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview) throws ApiException {
        okhttp3.Call localVarCall = apiV2AttachmentsIdGetValidateBeforeCall(id, width, height, resizeType, backgroundColor, preview, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download attachment file (asynchronously)
     * 
     * @param id  (required)
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsIdGetAsync(UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AttachmentsIdGetValidateBeforeCall(id, width, height, resizeType, backgroundColor, preview, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2AttachmentsOccupiedFileStorageSizeGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsOccupiedFileStorageSizeGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/attachments/occupiedFileStorageSize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AttachmentsOccupiedFileStorageSizeGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return apiV2AttachmentsOccupiedFileStorageSizeGetCall(_callback);

    }

    /**
     * Get size of attachments storage in bytes
     * 
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public Long apiV2AttachmentsOccupiedFileStorageSizeGet() throws ApiException {
        ApiResponse<Long> localVarResp = apiV2AttachmentsOccupiedFileStorageSizeGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get size of attachments storage in bytes
     * 
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Long> apiV2AttachmentsOccupiedFileStorageSizeGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = apiV2AttachmentsOccupiedFileStorageSizeGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get size of attachments storage in bytes (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsOccupiedFileStorageSizeGetAsync(final ApiCallback<Long> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AttachmentsOccupiedFileStorageSizeGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2AttachmentsPost
     * @param _file  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> &lt;br&gt;- Invalid file contents  &lt;br&gt;- Invalid HTTP headers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsPostCall(File _file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/attachments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AttachmentsPostValidateBeforeCall(File _file, final ApiCallback _callback) throws ApiException {
        return apiV2AttachmentsPostCall(_file, _callback);

    }

    /**
     * Upload new attachment file
     * File size is restricted to 1 GB (1 073 741 824 bytes)
     * @param _file  (optional)
     * @return AttachmentModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> &lt;br&gt;- Invalid file contents  &lt;br&gt;- Invalid HTTP headers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public AttachmentModel apiV2AttachmentsPost(File _file) throws ApiException {
        ApiResponse<AttachmentModel> localVarResp = apiV2AttachmentsPostWithHttpInfo(_file);
        return localVarResp.getData();
    }

    /**
     * Upload new attachment file
     * File size is restricted to 1 GB (1 073 741 824 bytes)
     * @param _file  (optional)
     * @return ApiResponse&lt;AttachmentModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> &lt;br&gt;- Invalid file contents  &lt;br&gt;- Invalid HTTP headers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AttachmentModel> apiV2AttachmentsPostWithHttpInfo(File _file) throws ApiException {
        okhttp3.Call localVarCall = apiV2AttachmentsPostValidateBeforeCall(_file, null);
        Type localVarReturnType = new TypeToken<AttachmentModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upload new attachment file (asynchronously)
     * File size is restricted to 1 GB (1 073 741 824 bytes)
     * @param _file  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> &lt;br&gt;- Invalid file contents  &lt;br&gt;- Invalid HTTP headers </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AttachmentsPostAsync(File _file, final ApiCallback<AttachmentModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AttachmentsPostValidateBeforeCall(_file, _callback);
        Type localVarReturnType = new TypeToken<AttachmentModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
