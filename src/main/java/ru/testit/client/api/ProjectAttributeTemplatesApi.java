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

import ru.testit.client.invoker.ApiCallback;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;
import ru.testit.client.invoker.ProgressRequestBody;
import ru.testit.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ru.testit.client.model.ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectCustomAttributeTemplateGetModel;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectAttributeTemplatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectAttributeTemplatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectAttributeTemplatesApi(ApiClient apiClient) {
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
     * Build call for apiV2ProjectsProjectIdAttributesTemplatesSearchPost
     * @param projectId  (required)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesSearchPostCall(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest;

        // create path and map variables
        String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/search"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Skip", skip));
        }

        if (take != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Take", take));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("OrderBy", orderBy));
        }

        if (searchField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchField", searchField));
        }

        if (searchValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchValue", searchValue));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesSearchPostValidateBeforeCall(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesSearchPost(Async)");
        }

        return apiV2ProjectsProjectIdAttributesTemplatesSearchPostCall(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, _callback);

    }

    /**
     * Search for custom attributes templates
     * 
     * @param projectId  (required)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest  (optional)
     * @return List&lt;ProjectCustomAttributeTemplateGetModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
     </table>
     */
    public List<ProjectCustomAttributeTemplateGetModel> apiV2ProjectsProjectIdAttributesTemplatesSearchPost(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest) throws ApiException {
        ApiResponse<List<ProjectCustomAttributeTemplateGetModel>> localVarResp = apiV2ProjectsProjectIdAttributesTemplatesSearchPostWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest);
        return localVarResp.getData();
    }

    /**
     * Search for custom attributes templates
     * 
     * @param projectId  (required)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest  (optional)
     * @return ApiResponse&lt;List&lt;ProjectCustomAttributeTemplateGetModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProjectCustomAttributeTemplateGetModel>> apiV2ProjectsProjectIdAttributesTemplatesSearchPostWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesSearchPostValidateBeforeCall(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, null);
        Type localVarReturnType = new TypeToken<List<ProjectCustomAttributeTemplateGetModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search for custom attributes templates (asynchronously)
     * 
     * @param projectId  (required)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesSearchPostAsync(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, final ApiCallback<List<ProjectCustomAttributeTemplateGetModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesSearchPostValidateBeforeCall(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest, _callback);
        Type localVarReturnType = new TypeToken<List<ProjectCustomAttributeTemplateGetModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteCall(String projectId, UUID templateId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/{templateId}"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "templateId" + "}", localVarApiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteValidateBeforeCall(String projectId, UUID templateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(Async)");
        }

        return apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteCall(projectId, templateId, _callback);

    }

    /**
     * Delete CustomAttributeTemplate from Project
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attribute template from project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(String projectId, UUID templateId) throws ApiException {
        apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(projectId, templateId);
    }

    /**
     * Delete CustomAttributeTemplate from Project
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attribute template from project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(String projectId, UUID templateId) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteValidateBeforeCall(projectId, templateId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete CustomAttributeTemplate from Project (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attribute template from project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteAsync(String projectId, UUID templateId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteValidateBeforeCall(projectId, templateId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostCall(String projectId, UUID templateId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/{templateId}"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "templateId" + "}", localVarApiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostValidateBeforeCall(String projectId, UUID templateId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(Async)");
        }

        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(Async)");
        }

        return apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostCall(projectId, templateId, _callback);

    }

    /**
     * Add CustomAttributeTemplate to Project
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System add attribute template to project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public void apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(String projectId, UUID templateId) throws ApiException {
        apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostWithHttpInfo(projectId, templateId);
    }

    /**
     * Add CustomAttributeTemplate to Project
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System add attribute template to project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostWithHttpInfo(String projectId, UUID templateId) throws ApiException {
        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostValidateBeforeCall(projectId, templateId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add CustomAttributeTemplate to Project (asynchronously)
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System add attribute template to project
     * @param projectId Project internal (UUID) or global (integer) identifier (required)
     * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostAsync(String projectId, UUID templateId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostValidateBeforeCall(projectId, templateId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
