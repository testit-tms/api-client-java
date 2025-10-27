package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.CreateWorkItemApiModel;
import java.io.File;
import ru.testit.client.model.IterationModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SearchWorkItemLinkUrlsApiResult;
import ru.testit.client.model.SharedStepReferenceModel;
import ru.testit.client.model.SharedStepReferenceSectionModel;
import ru.testit.client.model.SharedStepReferenceSectionsQueryFilterModel;
import ru.testit.client.model.SharedStepReferencesQueryFilterModel;
import ru.testit.client.model.TestResultChronologyModel;
import ru.testit.client.model.TestResultHistoryReportApiResult;
import java.util.UUID;
import ru.testit.client.model.UpdateWorkItemApiModel;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemApiResult;
import ru.testit.client.model.WorkItemChangeModel;
import ru.testit.client.model.WorkItemLikeModel;
import ru.testit.client.model.WorkItemLinkUrlApiModel;
import ru.testit.client.model.WorkItemModel;
import ru.testit.client.model.WorkItemMovePostModel;
import ru.testit.client.model.WorkItemSelectApiModel;
import ru.testit.client.model.WorkItemShortApiResult;
import ru.testit.client.model.WorkItemShortModel;
import ru.testit.client.model.WorkItemVersionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WorkItemsApi {
  private ApiClient apiClient;

  public WorkItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkItemsApi(ApiClient apiClient) {
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
   * Upload and link attachment to WorkItem
   *   Use case    User sets workItemId    User attaches a file    System creates attachment and links it to the work item    System returns attachment identifier
   * @param id Work item internal identifier (guid format) (required)
   * @param _file Select file (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded (default constraint is one gigabyte) </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsIdAttachmentsPost(UUID id, File _file) throws ApiException {
    apiV2WorkItemsIdAttachmentsPostWithHttpInfo(id, _file);
  }

  /**
   * Upload and link attachment to WorkItem
   *   Use case    User sets workItemId    User attaches a file    System creates attachment and links it to the work item    System returns attachment identifier
   * @param id Work item internal identifier (guid format) (required)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded (default constraint is one gigabyte) </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsIdAttachmentsPostWithHttpInfo(UUID id, File _file) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdAttachmentsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/attachments"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdAttachmentsPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Transform CheckList to TestCase
   *   Use case    User sets checklist identifier    User runs method execution    System transform CheckList to TestCase
   * @param id  (required)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find CheckList with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel apiV2WorkItemsIdCheckListTransformToTestCasePost(UUID id) throws ApiException {
    return apiV2WorkItemsIdCheckListTransformToTestCasePostWithHttpInfo(id).getData();
  }

  /**
   * Transform CheckList to TestCase
   *   Use case    User sets checklist identifier    User runs method execution    System transform CheckList to TestCase
   * @param id  (required)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find CheckList with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> apiV2WorkItemsIdCheckListTransformToTestCasePostWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdCheckListTransformToTestCasePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/checkList/transformTo/testCase"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdCheckListTransformToTestCasePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get change history of WorkItem
   *   Use case    User sets work item identifier    User runs method execution    System return change history of WorkItem
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;WorkItemChangeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemChangeModel> apiV2WorkItemsIdHistoryGet(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2WorkItemsIdHistoryGetWithHttpInfo(id, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get change history of WorkItem
   *   Use case    User sets work item identifier    User runs method execution    System return change history of WorkItem
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;WorkItemChangeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemChangeModel>> apiV2WorkItemsIdHistoryGetWithHttpInfo(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdHistoryGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "Skip", skip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemChangeModel>> localVarReturnType = new GenericType<List<WorkItemChangeModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdHistoryGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete like from WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System delete like from WorkItem
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsIdLikeDelete(UUID id) throws ApiException {
    apiV2WorkItemsIdLikeDeleteWithHttpInfo(id);
  }

  /**
   * Delete like from WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System delete like from WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsIdLikeDeleteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikeDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/like"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikeDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Set like to WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System set like to WorkItem
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsIdLikePost(UUID id) throws ApiException {
    apiV2WorkItemsIdLikePostWithHttpInfo(id);
  }

  /**
   * Set like to WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System set like to WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsIdLikePostWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/like"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get likes count of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return likes count of WorkItem
   * @param id  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2WorkItemsIdLikesCountGet(UUID id) throws ApiException {
    return apiV2WorkItemsIdLikesCountGetWithHttpInfo(id).getData();
  }

  /**
   * Get likes count of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return likes count of WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2WorkItemsIdLikesCountGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikesCountGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/likes/count"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikesCountGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get likes of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return likes of WorkItem
   * @param id  (required)
   * @return List&lt;WorkItemLikeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemLikeModel> apiV2WorkItemsIdLikesGet(UUID id) throws ApiException {
    return apiV2WorkItemsIdLikesGetWithHttpInfo(id).getData();
  }

  /**
   * Get likes of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return likes of WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;List&lt;WorkItemLikeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemLikeModel>> apiV2WorkItemsIdLikesGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/likes"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemLikeModel>> localVarReturnType = new GenericType<List<WorkItemLikeModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikesGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get test results history of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return test results history of WorkItem
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param statusCodes List of status codes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestResultHistoryReportApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultHistoryReportApiResult> apiV2WorkItemsIdTestResultsHistoryGet(UUID id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, List<String> statusCodes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2WorkItemsIdTestResultsHistoryGetWithHttpInfo(id, from, to, configurationIds, testPlanIds, userIds, outcomes, statusCodes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get test results history of WorkItem
   *   Use case    User sets WorkItem identifier    User runs method execution    System return test results history of WorkItem
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param statusCodes List of status codes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestResultHistoryReportApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultHistoryReportApiResult>> apiV2WorkItemsIdTestResultsHistoryGetWithHttpInfo(UUID id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, List<String> statusCodes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdTestResultsHistoryGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/testResults/history"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "from", from)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "configurationIds", configurationIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testPlanIds", testPlanIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIds", userIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "outcomes", outcomes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "statusCodes", statusCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutomated", isAutomated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "automated", automated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testRunIds", testRunIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestResultHistoryReportApiResult>> localVarReturnType = new GenericType<List<TestResultHistoryReportApiResult>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdTestResultsHistoryGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set WorkItem as actual
   *   Use case    User sets work item identifier    User runs method execution    System set WorkItem as actual
   * @param id  (required)
   * @param versionId  (required)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel apiV2WorkItemsIdVersionVersionIdActualPost(UUID id, UUID versionId) throws ApiException {
    return apiV2WorkItemsIdVersionVersionIdActualPostWithHttpInfo(id, versionId).getData();
  }

  /**
   * Set WorkItem as actual
   *   Use case    User sets work item identifier    User runs method execution    System set WorkItem as actual
   * @param id  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> apiV2WorkItemsIdVersionVersionIdActualPostWithHttpInfo(UUID id, UUID versionId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdVersionVersionIdActualPost");
    }
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling apiV2WorkItemsIdVersionVersionIdActualPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/version/{versionId}/actual"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{versionId}", apiClient.escapeString(versionId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdVersionVersionIdActualPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemLinkUrlApiModel  (optional)
   * @return SearchWorkItemLinkUrlsApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public SearchWorkItemLinkUrlsApiResult apiV2WorkItemsLinksUrlsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemLinkUrlApiModel workItemLinkUrlApiModel) throws ApiException {
    return apiV2WorkItemsLinksUrlsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, workItemLinkUrlApiModel).getData();
  }

  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemLinkUrlApiModel  (optional)
   * @return ApiResponse&lt;SearchWorkItemLinkUrlsApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchWorkItemLinkUrlsApiResult> apiV2WorkItemsLinksUrlsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemLinkUrlApiModel workItemLinkUrlApiModel) throws ApiException {
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
    GenericType<SearchWorkItemLinkUrlsApiResult> localVarReturnType = new GenericType<SearchWorkItemLinkUrlsApiResult>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsLinksUrlsSearchPost", "/api/v2/workItems/links/urls/search", "POST", localVarQueryParams, workItemLinkUrlApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Move WorkItem to another section
   *   Use case    User sets WorkItem identifier    User runs method execution    System move WorkItem to another section
   * @param workItemMovePostModel  (optional)
   * @return WorkItemShortModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemShortModel apiV2WorkItemsMovePost(WorkItemMovePostModel workItemMovePostModel) throws ApiException {
    return apiV2WorkItemsMovePostWithHttpInfo(workItemMovePostModel).getData();
  }

  /**
   * Move WorkItem to another section
   *   Use case    User sets WorkItem identifier    User runs method execution    System move WorkItem to another section
   * @param workItemMovePostModel  (optional)
   * @return ApiResponse&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemShortModel> apiV2WorkItemsMovePostWithHttpInfo(WorkItemMovePostModel workItemMovePostModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemShortModel> localVarReturnType = new GenericType<WorkItemShortModel>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsMovePost", "/api/v2/workItems/move", "POST", new ArrayList<>(), workItemMovePostModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates work item
   * 
   * @param createWorkItemApiModel  (optional)
   * @return WorkItemApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemApiResult apiV2WorkItemsPost(CreateWorkItemApiModel createWorkItemApiModel) throws ApiException {
    return apiV2WorkItemsPostWithHttpInfo(createWorkItemApiModel).getData();
  }

  /**
   * Creates work item
   * 
   * @param createWorkItemApiModel  (optional)
   * @return ApiResponse&lt;WorkItemApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemApiResult> apiV2WorkItemsPostWithHttpInfo(CreateWorkItemApiModel createWorkItemApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemApiResult> localVarReturnType = new GenericType<WorkItemApiResult>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsPost", "/api/v2/workItems", "POST", new ArrayList<>(), createWorkItemApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for work items
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectApiModel  (optional)
   * @return List&lt;WorkItemShortApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Test library read permission for all requested projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortApiResult> apiV2WorkItemsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
    return apiV2WorkItemsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, workItemSelectApiModel).getData();
  }

  /**
   * Search for work items
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectApiModel  (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Test library read permission for all requested projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortApiResult>> apiV2WorkItemsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
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
    GenericType<List<WorkItemShortApiResult>> localVarReturnType = new GenericType<List<WorkItemShortApiResult>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSearchPost", "/api/v2/workItems/search", "POST", localVarQueryParams, workItemSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references in sections
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferenceSectionsQueryFilterModel  (optional)
   * @return List&lt;SharedStepReferenceSectionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<SharedStepReferenceSectionModel> apiV2WorkItemsSharedStepIdReferencesSectionsPost(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferenceSectionsQueryFilterModel sharedStepReferenceSectionsQueryFilterModel) throws ApiException {
    return apiV2WorkItemsSharedStepIdReferencesSectionsPostWithHttpInfo(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel).getData();
  }

  /**
   * Get SharedStep references in sections
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferenceSectionsQueryFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceSectionModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SharedStepReferenceSectionModel>> apiV2WorkItemsSharedStepIdReferencesSectionsPostWithHttpInfo(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferenceSectionsQueryFilterModel sharedStepReferenceSectionsQueryFilterModel) throws ApiException {
    // Check required parameters
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepIdReferencesSectionsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{sharedStepId}/references/sections"
            .replaceAll("\\{sharedStepId}", apiClient.escapeString(sharedStepId.toString()));

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
    GenericType<List<SharedStepReferenceSectionModel>> localVarReturnType = new GenericType<List<SharedStepReferenceSectionModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepIdReferencesSectionsPost", localVarPath, "POST", localVarQueryParams, sharedStepReferenceSectionsQueryFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references in work items
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferencesQueryFilterModel  (optional)
   * @return List&lt;SharedStepReferenceModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<SharedStepReferenceModel> apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferencesQueryFilterModel sharedStepReferencesQueryFilterModel) throws ApiException {
    return apiV2WorkItemsSharedStepIdReferencesWorkItemsPostWithHttpInfo(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel).getData();
  }

  /**
   * Get SharedStep references in work items
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferencesQueryFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SharedStepReferenceModel>> apiV2WorkItemsSharedStepIdReferencesWorkItemsPostWithHttpInfo(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferencesQueryFilterModel sharedStepReferencesQueryFilterModel) throws ApiException {
    // Check required parameters
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepIdReferencesWorkItemsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{sharedStepId}/references/workItems"
            .replaceAll("\\{sharedStepId}", apiClient.escapeString(sharedStepId.toString()));

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
    GenericType<List<SharedStepReferenceModel>> localVarReturnType = new GenericType<List<SharedStepReferenceModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepIdReferencesWorkItemsPost", localVarPath, "POST", localVarQueryParams, sharedStepReferencesQueryFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @return List&lt;SharedStepReferenceModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<SharedStepReferenceModel> apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(UUID sharedStepId) throws ApiException {
    return apiV2WorkItemsSharedStepsSharedStepIdReferencesGetWithHttpInfo(sharedStepId).getData();
  }

  /**
   * Get SharedStep references
   *   Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references
   * @param sharedStepId  (required)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<SharedStepReferenceModel>> apiV2WorkItemsSharedStepsSharedStepIdReferencesGetWithHttpInfo(UUID sharedStepId) throws ApiException {
    // Check required parameters
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepsSharedStepIdReferencesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/sharedSteps/{sharedStepId}/references"
            .replaceAll("\\{sharedStepId}", apiClient.escapeString(sharedStepId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<SharedStepReferenceModel>> localVarReturnType = new GenericType<List<SharedStepReferenceModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepsSharedStepIdReferencesGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete all links AutoTests from WorkItem by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search and delete all autotests, related to found work item    System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAllWorkItemsFromAutoTest(String id) throws ApiException {
    deleteAllWorkItemsFromAutoTestWithHttpInfo(id);
  }

  /**
   * Delete all links AutoTests from WorkItem by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search and delete all autotests, related to found work item    System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAllWorkItemsFromAutoTestWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAllWorkItemsFromAutoTest");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/autoTests"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.deleteAllWorkItemsFromAutoTest", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete Test Case, Checklist or Shared Step by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System deletes work item    System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Could not delete Shared Step that has references </td><td>  -  </td></tr>
     </table>
   */
  public void deleteWorkItem(String id) throws ApiException {
    deleteWorkItemWithHttpInfo(id);
  }

  /**
   * Delete Test Case, Checklist or Shared Step by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System deletes work item    System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Could not delete Shared Step that has references </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWorkItemWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.deleteWorkItem", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all AutoTests linked to WorkItem by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search all autotests, related to found work item    System returns list of found autotests
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return List&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestModel> getAutoTestsForWorkItem(String id) throws ApiException {
    return getAutoTestsForWorkItemWithHttpInfo(id).getData();
  }

  /**
   * Get all AutoTests linked to WorkItem by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search all autotests, related to found work item    System returns list of found autotests
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> getAutoTestsForWorkItemWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestsForWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/autoTests"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.getAutoTestsForWorkItem", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get iterations by work item Id or GlobalId
   * 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return List&lt;IterationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<IterationModel> getIterations(String id, UUID versionId, Integer versionNumber) throws ApiException {
    return getIterationsWithHttpInfo(id, versionId, versionNumber).getData();
  }

  /**
   * Get iterations by work item Id or GlobalId
   * 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return ApiResponse&lt;List&lt;IterationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<IterationModel>> getIterationsWithHttpInfo(String id, UUID versionId, Integer versionNumber) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getIterations");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/iterations"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "versionId", versionId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<IterationModel>> localVarReturnType = new GenericType<List<IterationModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.getIterations", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Test Case, Checklist or Shared Step by Id or GlobalId
   *   Use case    User sets work item identifier    [Optional] User sets work item version identifier    [Optional] User sets work item version number    User runs method execution    System search work item by identifier    [Optional] if User sets work item version identifier, system search work item version by identifier.    [Optional] if user sets work item version number, system search work item version by number    Otherwise, system search last work item version    System returns work item
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier\&quot; (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel getWorkItemById(String id, UUID versionId, Integer versionNumber) throws ApiException {
    return getWorkItemByIdWithHttpInfo(id, versionId, versionNumber).getData();
  }

  /**
   * Get Test Case, Checklist or Shared Step by Id or GlobalId
   *   Use case    User sets work item identifier    [Optional] User sets work item version identifier    [Optional] User sets work item version number    User runs method execution    System search work item by identifier    [Optional] if User sets work item version identifier, system search work item version by identifier.    [Optional] if user sets work item version number, system search work item version by number    Otherwise, system search last work item version    System returns work item
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier\&quot; (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> getWorkItemByIdWithHttpInfo(String id, UUID versionId, Integer versionNumber) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemById");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "versionId", versionId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};
    return apiClient.invokeAPI("WorkItemsApi.getWorkItemById", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItem chronology by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search test results of all autotests, related to found work item    System sort results by CompletedOn ascending, then by CreatedDate ascending    System returns sorted collection of test results
   * @param id Internal (UUID) or global (integer) identifier (required)
   * @return List&lt;TestResultChronologyModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid workItemId </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<TestResultChronologyModel> getWorkItemChronology(String id) throws ApiException {
    return getWorkItemChronologyWithHttpInfo(id).getData();
  }

  /**
   * Get WorkItem chronology by Id or GlobalId
   *   Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search test results of all autotests, related to found work item    System sort results by CompletedOn ascending, then by CreatedDate ascending    System returns sorted collection of test results
   * @param id Internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;TestResultChronologyModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid workItemId </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<TestResultChronologyModel>> getWorkItemChronologyWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemChronology");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/chronology"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestResultChronologyModel>> localVarReturnType = new GenericType<List<TestResultChronologyModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.getWorkItemChronology", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItem versions
   *   Use case    User sets work item identifier    [Optional] User sets work item version identifier    User runs method execution    System search work item by identifier    [Optional] If User set work item version identifier, System search work item version by version identifier                      Otherwise, system search all version of work item    System returns array of work item version models (listed in response example)
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param workItemVersionId WorkItem version (guid format)  identifier\&quot; (optional)
   * @param versionNumber WorkItem version (integer format)  number\&quot; (optional)
   * @return List&lt;WorkItemVersionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemVersionModel> getWorkItemVersions(String id, UUID workItemVersionId, Integer versionNumber) throws ApiException {
    return getWorkItemVersionsWithHttpInfo(id, workItemVersionId, versionNumber).getData();
  }

  /**
   * Get WorkItem versions
   *   Use case    User sets work item identifier    [Optional] User sets work item version identifier    User runs method execution    System search work item by identifier    [Optional] If User set work item version identifier, System search work item version by version identifier                      Otherwise, system search all version of work item    System returns array of work item version models (listed in response example)
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param workItemVersionId WorkItem version (guid format)  identifier\&quot; (optional)
   * @param versionNumber WorkItem version (integer format)  number\&quot; (optional)
   * @return ApiResponse&lt;List&lt;WorkItemVersionModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemVersionModel>> getWorkItemVersionsWithHttpInfo(String id, UUID workItemVersionId, Integer versionNumber) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemVersions");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/versions"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "workItemVersionId", workItemVersionId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemVersionModel>> localVarReturnType = new GenericType<List<WorkItemVersionModel>>() {};
    return apiClient.invokeAPI("WorkItemsApi.getWorkItemVersions", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Permanently delete test case, checklist or shared steps from archive
   * 
   * @param id Unique or global ID of the work item (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void purgeWorkItem(String id) throws ApiException {
    purgeWorkItemWithHttpInfo(id);
  }

  /**
   * Permanently delete test case, checklist or shared steps from archive
   * 
   * @param id Unique or global ID of the work item (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> purgeWorkItemWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling purgeWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/purge"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.purgeWorkItem", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore test case, checklist or shared steps from archive
   * 
   * @param id Unique or global ID of the work item (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void restoreWorkItem(String id) throws ApiException {
    restoreWorkItemWithHttpInfo(id);
  }

  /**
   * Restore test case, checklist or shared steps from archive
   * 
   * @param id Unique or global ID of the work item (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> restoreWorkItemWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling restoreWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/restore"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.restoreWorkItem", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update Test Case, Checklist or Shared Step
   *   Use case    User sets work item properties (listed in request parameters)    User runs method execution    System updates work item by identifier    System returns updated work item model (listed in response parameters)
   * @param updateWorkItemApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Priority is not a valid    duration should be a positive number    should be empty for CheckList    There is no option in ProjectAttributesScheme with such Id    Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   WorkItem not found    Can&#39;t find section    Can&#39;t attributesScheme    Can&#39;t attribute    AutoTestIds not exist in project </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void updateWorkItem(UpdateWorkItemApiModel updateWorkItemApiModel) throws ApiException {
    updateWorkItemWithHttpInfo(updateWorkItemApiModel);
  }

  /**
   * Update Test Case, Checklist or Shared Step
   *   Use case    User sets work item properties (listed in request parameters)    User runs method execution    System updates work item by identifier    System returns updated work item model (listed in response parameters)
   * @param updateWorkItemApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Priority is not a valid    duration should be a positive number    should be empty for CheckList    There is no option in ProjectAttributesScheme with such Id    Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   WorkItem not found    Can&#39;t find section    Can&#39;t attributesScheme    Can&#39;t attribute    AutoTestIds not exist in project </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateWorkItemWithHttpInfo(UpdateWorkItemApiModel updateWorkItemApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsApi.updateWorkItem", "/api/v2/workItems", "PUT", new ArrayList<>(), updateWorkItemApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
