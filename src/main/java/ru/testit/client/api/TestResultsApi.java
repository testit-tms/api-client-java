package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2TestResultsIdPutRequest;
import ru.testit.client.model.ApiV2TestResultsSearchPostRequest;
import ru.testit.client.model.AttachmentModel;
import java.io.File;
import ru.testit.client.model.ImageResizeType;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestResultModel;
import ru.testit.client.model.TestResultShortGetModel;
import ru.testit.client.model.TestResultsStatisticsGetModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultsApi {
  private ApiClient apiClient;

  public TestResultsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TestResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get test result by ID aggregated with previous results
   * 
   * @param id Test result unique ID (required)
   * @return TestResultModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
     </table>
   */
  public TestResultModel apiV2TestResultsIdAggregatedGet(UUID id) throws ApiException {
    return apiV2TestResultsIdAggregatedGetWithHttpInfo(id).getData();
  }

  /**
   * Get test result by ID aggregated with previous results
   * 
   * @param id Test result unique ID (required)
   * @return ApiResponse&lt;TestResultModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestResultModel> apiV2TestResultsIdAggregatedGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestResultsIdAggregatedGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/aggregated"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestResultModel> localVarReturnType = new GenericType<TestResultModel>() {};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsIdAggregatedGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Attach file to the test result
   * 
   * @param id Test result unique ID (required)
   * @param attachmentId Attachment unique ID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Only edits from assigned user are allowed </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestResultsIdAttachmentsAttachmentIdPut(UUID id, UUID attachmentId) throws ApiException {
    apiV2TestResultsIdAttachmentsAttachmentIdPutWithHttpInfo(id, attachmentId);
  }

  /**
   * Attach file to the test result
   * 
   * @param id Test result unique ID (required)
   * @param attachmentId Attachment unique ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Only edits from assigned user are allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestResultsIdAttachmentsAttachmentIdPutWithHttpInfo(UUID id, UUID attachmentId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestResultsIdAttachmentsAttachmentIdPut");
    }
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling apiV2TestResultsIdAttachmentsAttachmentIdPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments/{attachmentId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{attachmentId}", apiClient.escapeString(attachmentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsIdAttachmentsAttachmentIdPut", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get test result attachments meta-information
   * 
   * @param id Test result unique ID (required)
   * @return List&lt;AttachmentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<AttachmentModel> apiV2TestResultsIdAttachmentsInfoGet(UUID id) throws ApiException {
    return apiV2TestResultsIdAttachmentsInfoGetWithHttpInfo(id).getData();
  }

  /**
   * Get test result attachments meta-information
   * 
   * @param id Test result unique ID (required)
   * @return ApiResponse&lt;List&lt;AttachmentModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AttachmentModel>> apiV2TestResultsIdAttachmentsInfoGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestResultsIdAttachmentsInfoGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments/info"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AttachmentModel>> localVarReturnType = new GenericType<List<AttachmentModel>>() {};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsIdAttachmentsInfoGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get test result by ID
   * 
   * @param id Test result unique ID (required)
   * @return TestResultModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TestResultModel apiV2TestResultsIdGet(UUID id) throws ApiException {
    return apiV2TestResultsIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get test result by ID
   * 
   * @param id Test result unique ID (required)
   * @return ApiResponse&lt;TestResultModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the test result is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestResultModel> apiV2TestResultsIdGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestResultsIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestResultModel> localVarReturnType = new GenericType<TestResultModel>() {};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit test result by ID
   * 
   * @param id Test result unique ID (required)
   * @param apiV2TestResultsIdPutRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Only edits from assigned user are allowed </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestResultsIdPut(UUID id, ApiV2TestResultsIdPutRequest apiV2TestResultsIdPutRequest) throws ApiException {
    apiV2TestResultsIdPutWithHttpInfo(id, apiV2TestResultsIdPutRequest);
  }

  /**
   * Edit test result by ID
   * 
   * @param id Test result unique ID (required)
   * @param apiV2TestResultsIdPutRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Only edits from assigned user are allowed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestResultsIdPutWithHttpInfo(UUID id, ApiV2TestResultsIdPutRequest apiV2TestResultsIdPutRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestResultsIdPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsIdPut", localVarPath, "PUT", new ArrayList<>(), apiV2TestResultsIdPutRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search for test results
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestResultsSearchPostRequest  (optional)
   * @return List&lt;TestResultShortGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test runs is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<TestResultShortGetModel> apiV2TestResultsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestResultsSearchPostRequest apiV2TestResultsSearchPostRequest) throws ApiException {
    return apiV2TestResultsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2TestResultsSearchPostRequest).getData();
  }

  /**
   * Search for test results
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestResultsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;TestResultShortGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test runs is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultShortGetModel>> apiV2TestResultsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestResultsSearchPostRequest apiV2TestResultsSearchPostRequest) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "Skip", skip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestResultShortGetModel>> localVarReturnType = new GenericType<List<TestResultShortGetModel>>() {};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsSearchPost", "/api/v2/testResults/search", "POST", localVarQueryParams, apiV2TestResultsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for test results and extract statistics
   * 
   * @param apiV2TestResultsSearchPostRequest  (optional)
   * @return TestResultsStatisticsGetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test runs is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TestResultsStatisticsGetModel apiV2TestResultsStatisticsFilterPost(ApiV2TestResultsSearchPostRequest apiV2TestResultsSearchPostRequest) throws ApiException {
    return apiV2TestResultsStatisticsFilterPostWithHttpInfo(apiV2TestResultsSearchPostRequest).getData();
  }

  /**
   * Search for test results and extract statistics
   * 
   * @param apiV2TestResultsSearchPostRequest  (optional)
   * @return ApiResponse&lt;TestResultsStatisticsGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test runs is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestResultsStatisticsGetModel> apiV2TestResultsStatisticsFilterPostWithHttpInfo(ApiV2TestResultsSearchPostRequest apiV2TestResultsSearchPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestResultsStatisticsGetModel> localVarReturnType = new GenericType<TestResultsStatisticsGetModel>() {};
    return apiClient.invokeAPI("TestResultsApi.apiV2TestResultsStatisticsFilterPost", "/api/v2/testResults/statistics/filter", "POST", new ArrayList<>(), apiV2TestResultsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload and link attachment to TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User attaches a file  &lt;br&gt;System creates attachment and links it to the test result  &lt;br&gt;System returns attachment identifier
   * @param id Test result internal identifier (guid format) (required)
   * @param _file Select file (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded (default constraint is one gigabyte) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public UUID createAttachment(UUID id, File _file) throws ApiException {
    return createAttachmentWithHttpInfo(id, _file).getData();
  }

  /**
   * Upload and link attachment to TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User attaches a file  &lt;br&gt;System creates attachment and links it to the test result  &lt;br&gt;System returns attachment identifier
   * @param id Test result internal identifier (guid format) (required)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded (default constraint is one gigabyte) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> createAttachmentWithHttpInfo(UUID id, File _file) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createAttachment");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("TestResultsApi.createAttachment", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove attachment and unlink from TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId and attachmentId  &lt;br&gt;User attaches a file  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes attachment and unlinks it from the test result  &lt;br&gt;System returns attachment identifier
   * @param id Test result internal identifier (guid format) (required)
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAttachment(UUID id, UUID attachmentId) throws ApiException {
    deleteAttachmentWithHttpInfo(id, attachmentId);
  }

  /**
   * Remove attachment and unlink from TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId and attachmentId  &lt;br&gt;User attaches a file  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes attachment and unlinks it from the test result  &lt;br&gt;System returns attachment identifier
   * @param id Test result internal identifier (guid format) (required)
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAttachmentWithHttpInfo(UUID id, UUID attachmentId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAttachment");
    }
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling deleteAttachment");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments/{attachmentId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{attachmentId}", apiClient.escapeString(attachmentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestResultsApi.deleteAttachment", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get attachment of TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;[Optional] User sets resize configuration  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachments by the attachmentId and the testResultId  &lt;br&gt;                      [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                    &lt;br&gt;[Optional] Otherwise, System does not resize the attachment  &lt;br&gt;System returns attachment as a file
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @param id Test result internal identifier (guid format) (required)
   * @param width Width of the result image (optional)
   * @param height Height of the result image (optional)
   * @param resizeType Type of resizing to apply to the result image (optional)
   * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
   * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;File not found  &lt;br&gt;Attachment not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public void downloadAttachment(UUID attachmentId, UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview) throws ApiException {
    downloadAttachmentWithHttpInfo(attachmentId, id, width, height, resizeType, backgroundColor, preview);
  }

  /**
   * Get attachment of TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;[Optional] User sets resize configuration  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachments by the attachmentId and the testResultId  &lt;br&gt;                      [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                    &lt;br&gt;[Optional] Otherwise, System does not resize the attachment  &lt;br&gt;System returns attachment as a file
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @param id Test result internal identifier (guid format) (required)
   * @param width Width of the result image (optional)
   * @param height Height of the result image (optional)
   * @param resizeType Type of resizing to apply to the result image (optional)
   * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
   * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;File not found  &lt;br&gt;Attachment not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> downloadAttachmentWithHttpInfo(UUID attachmentId, UUID id, Integer width, Integer height, ImageResizeType resizeType, String backgroundColor, Boolean preview) throws ApiException {
    // Check required parameters
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling downloadAttachment");
    }
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling downloadAttachment");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments/{attachmentId}"
            .replaceAll("\\{attachmentId}", apiClient.escapeString(attachmentId.toString()))
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "width", width)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resizeType", resizeType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "backgroundColor", backgroundColor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "preview", preview));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestResultsApi.downloadAttachment", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get Metadata of TestResult&#39;s attachment
   * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachment by the attachmentId and the testResultId  &lt;br&gt;System returns attachment data
   * @param id Test result internal identifier (guid format) (required)
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @return AttachmentModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public AttachmentModel getAttachment(UUID id, UUID attachmentId) throws ApiException {
    return getAttachmentWithHttpInfo(id, attachmentId).getData();
  }

  /**
   * Get Metadata of TestResult&#39;s attachment
   * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachment by the attachmentId and the testResultId  &lt;br&gt;System returns attachment data
   * @param id Test result internal identifier (guid format) (required)
   * @param attachmentId Attachment internal identifier (guid format) (required)
   * @return ApiResponse&lt;AttachmentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AttachmentModel> getAttachmentWithHttpInfo(UUID id, UUID attachmentId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttachment");
    }
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling getAttachment");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments/{attachmentId}/info"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{attachmentId}", apiClient.escapeString(attachmentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AttachmentModel> localVarReturnType = new GenericType<AttachmentModel>() {};
    return apiClient.invokeAPI("TestResultsApi.getAttachment", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all attachments of TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search all attachments of the test result  &lt;br&gt;System returns attachments enumeration
   * @param id Test result internal identifier (guid format) (required)
   * @return List&lt;AttachmentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestResult not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public List<AttachmentModel> getAttachments(UUID id) throws ApiException {
    return getAttachmentsWithHttpInfo(id).getData();
  }

  /**
   * Get all attachments of TestResult
   * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search all attachments of the test result  &lt;br&gt;System returns attachments enumeration
   * @param id Test result internal identifier (guid format) (required)
   * @return ApiResponse&lt;List&lt;AttachmentModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestResult not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AttachmentModel>> getAttachmentsWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttachments");
    }

    // Path parameters
    String localVarPath = "/api/v2/testResults/{id}/attachments"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AttachmentModel>> localVarReturnType = new GenericType<List<AttachmentModel>>() {};
    return apiClient.invokeAPI("TestResultsApi.getAttachments", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
