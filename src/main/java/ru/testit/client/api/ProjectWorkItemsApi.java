package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TagShortApiResult;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemGroupGetModel;
import ru.testit.client.model.WorkItemGroupModel;
import ru.testit.client.model.WorkItemIndexApiResult;
import ru.testit.client.model.WorkItemSelectApiModel;
import ru.testit.client.model.WorkItemSelectModel;
import ru.testit.client.model.WorkItemShortApiResult;
import ru.testit.client.model.WorkItemShortModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ProjectWorkItemsApi {
  private ApiClient apiClient;

  public ProjectWorkItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectWorkItemsApi(ApiClient apiClient) {
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
   * Search for work items and group results by attribute
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemGroupGetModel  (optional)
   * @return List&lt;WorkItemGroupModel&gt;
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
  public List<WorkItemGroupModel> apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemGroupGetModel workItemGroupGetModel) throws ApiException {
    return apiV2ProjectsProjectIdWorkItemsSearchGroupedPostWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, workItemGroupGetModel).getData();
  }

  /**
   * Search for work items and group results by attribute
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemGroupGetModel  (optional)
   * @return ApiResponse&lt;List&lt;WorkItemGroupModel&gt;&gt;
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
  public ApiResponse<List<WorkItemGroupModel>> apiV2ProjectsProjectIdWorkItemsSearchGroupedPostWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemGroupGetModel workItemGroupGetModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdWorkItemsSearchGroupedPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems/search/grouped"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

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
    GenericType<List<WorkItemGroupModel>> localVarReturnType = new GenericType<List<WorkItemGroupModel>>() {};
    return apiClient.invokeAPI("ProjectWorkItemsApi.apiV2ProjectsProjectIdWorkItemsSearchGroupedPost", localVarPath, "POST", localVarQueryParams, workItemGroupGetModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for work items and extract IDs only
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ProjectsProjectIdWorkItemsSearchIdPost(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectModel workItemSelectModel) throws ApiException {
    return apiV2ProjectsProjectIdWorkItemsSearchIdPostWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectModel).getData();
  }

  /**
   * Search for work items and extract IDs only
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ProjectsProjectIdWorkItemsSearchIdPostWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectModel workItemSelectModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdWorkItemsSearchIdPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems/search/id"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

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
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("ProjectWorkItemsApi.apiV2ProjectsProjectIdWorkItemsSearchIdPost", localVarPath, "POST", localVarQueryParams, workItemSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for work items
   * 
   * @param projectId Unique or global ID of the project (required)
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortApiResult> apiV2ProjectsProjectIdWorkItemsSearchPost(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
    return apiV2ProjectsProjectIdWorkItemsSearchPostWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel).getData();
  }

  /**
   * Search for work items
   * 
   * @param projectId Unique or global ID of the project (required)
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortApiResult>> apiV2ProjectsProjectIdWorkItemsSearchPostWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdWorkItemsSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems/search"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

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
    return apiClient.invokeAPI("ProjectWorkItemsApi.apiV2ProjectsProjectIdWorkItemsSearchPost", localVarPath, "POST", localVarQueryParams, workItemSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get work item index (position) in a collection by its id.
   * 
   * @param projectId  (required)
   * @param workItemId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectApiModel  (optional)
   * @return WorkItemIndexApiResult
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
  public WorkItemIndexApiResult apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost(String projectId, UUID workItemId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
    return apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPostWithHttpInfo(projectId, workItemId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel).getData();
  }

  /**
   * Get work item index (position) in a collection by its id.
   * 
   * @param projectId  (required)
   * @param workItemId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param workItemSelectApiModel  (optional)
   * @return ApiResponse&lt;WorkItemIndexApiResult&gt;
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
  public ApiResponse<WorkItemIndexApiResult> apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPostWithHttpInfo(String projectId, UUID workItemId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, WorkItemSelectApiModel workItemSelectApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost");
    }
    if (workItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'workItemId' when calling apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems/search/{workItemId}/index"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{workItemId}", apiClient.escapeString(workItemId.toString()));

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
    GenericType<WorkItemIndexApiResult> localVarReturnType = new GenericType<WorkItemIndexApiResult>() {};
    return apiClient.invokeAPI("ProjectWorkItemsApi.apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost", localVarPath, "POST", localVarQueryParams, workItemSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItems Tags
   *   Use case    User sets project internal identifier    User runs method execution    System returns work items tags
   * @param projectId Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @return List&lt;TagShortApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TagShortApiResult> apiV2ProjectsProjectIdWorkItemsTagsGet(UUID projectId, Boolean isDeleted) throws ApiException {
    return apiV2ProjectsProjectIdWorkItemsTagsGetWithHttpInfo(projectId, isDeleted).getData();
  }

  /**
   * Get WorkItems Tags
   *   Use case    User sets project internal identifier    User runs method execution    System returns work items tags
   * @param projectId Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @return ApiResponse&lt;List&lt;TagShortApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TagShortApiResult>> apiV2ProjectsProjectIdWorkItemsTagsGetWithHttpInfo(UUID projectId, Boolean isDeleted) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdWorkItemsTagsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems/tags"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TagShortApiResult>> localVarReturnType = new GenericType<List<TagShortApiResult>>() {};
    return apiClient.invokeAPI("ProjectWorkItemsApi.apiV2ProjectsProjectIdWorkItemsTagsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project work items
   *   Use case    User sets project internal or global identifier    [Optional] User sets isDeleted field value    User runs method execution    System search project    [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project    [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted    If User did not set isDeleted field value, System search all  workitems related to project    System returns array of found workitems (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @param tagNames List of tags to filter by (optional)
   * @param includeIterations  (optional, default to true)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td>   - &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters    - &#x60;orderBy&#x60; statement has invalid length    - &#x60;orderBy&#x60; statement must have UUID as attribute key    - Search field was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<WorkItemShortModel> getWorkItemsByProjectId(String projectId, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getWorkItemsByProjectIdWithHttpInfo(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get project work items
   *   Use case    User sets project internal or global identifier    [Optional] User sets isDeleted field value    User runs method execution    System search project    [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project    [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted    If User did not set isDeleted field value, System search all  workitems related to project    System returns array of found workitems (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @param tagNames List of tags to filter by (optional)
   * @param includeIterations  (optional, default to true)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td>   - &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters    - &#x60;orderBy&#x60; statement has invalid length    - &#x60;orderBy&#x60; statement must have UUID as attribute key    - Search field was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<WorkItemShortModel>> getWorkItemsByProjectIdWithHttpInfo(String projectId, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getWorkItemsByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/workItems"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tagNames", tagNames));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeIterations", includeIterations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};
    return apiClient.invokeAPI("ProjectWorkItemsApi.getWorkItemsByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
