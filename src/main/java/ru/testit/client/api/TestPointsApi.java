package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2TestPointsSearchPostRequest;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestPointShortGetModel;
import ru.testit.client.model.TestRunModel;
import java.util.UUID;
import ru.testit.client.model.WorkItemModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointsApi {
  private ApiClient apiClient;

  public TestPointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TestPointsApi(ApiClient apiClient) {
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
   * Get all test runs which use test point
   * 
   * @param id Test point unique ID (required)
   * @return List&lt;TestRunModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<TestRunModel> apiV2TestPointsIdTestRunsGet(UUID id) throws ApiException {
    return apiV2TestPointsIdTestRunsGetWithHttpInfo(id).getData();
  }

  /**
   * Get all test runs which use test point
   * 
   * @param id Test point unique ID (required)
   * @return ApiResponse&lt;List&lt;TestRunModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunModel>> apiV2TestPointsIdTestRunsGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPointsIdTestRunsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPoints/{id}/testRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestRunModel>> localVarReturnType = new GenericType<List<TestRunModel>>() {};
    return apiClient.invokeAPI("TestPointsApi.apiV2TestPointsIdTestRunsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get work item represented by test point
   * 
   * @param id Test point unique ID (required)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel apiV2TestPointsIdWorkItemGet(UUID id) throws ApiException {
    return apiV2TestPointsIdWorkItemGetWithHttpInfo(id).getData();
  }

  /**
   * Get work item represented by test point
   * 
   * @param id Test point unique ID (required)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> apiV2TestPointsIdWorkItemGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPointsIdWorkItemGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPoints/{id}/workItem"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};
    return apiClient.invokeAPI("TestPointsApi.apiV2TestPointsIdWorkItemGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for test points and extract IDs only
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestPointsSearchPostRequest  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2TestPointsSearchIdPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestPointsSearchPostRequest apiV2TestPointsSearchPostRequest) throws ApiException {
    return apiV2TestPointsSearchIdPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2TestPointsSearchPostRequest).getData();
  }

  /**
   * Search for test points and extract IDs only
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestPointsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2TestPointsSearchIdPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestPointsSearchPostRequest apiV2TestPointsSearchPostRequest) throws ApiException {
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
    return apiClient.invokeAPI("TestPointsApi.apiV2TestPointsSearchIdPost", "/api/v2/testPoints/search/id", "POST", localVarQueryParams, apiV2TestPointsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for test points
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestPointsSearchPostRequest  (optional)
   * @return List&lt;TestPointShortGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointShortGetModel> apiV2TestPointsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestPointsSearchPostRequest apiV2TestPointsSearchPostRequest) throws ApiException {
    return apiV2TestPointsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2TestPointsSearchPostRequest).getData();
  }

  /**
   * Search for test points
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2TestPointsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;TestPointShortGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointShortGetModel>> apiV2TestPointsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2TestPointsSearchPostRequest apiV2TestPointsSearchPostRequest) throws ApiException {
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
    GenericType<List<TestPointShortGetModel>> localVarReturnType = new GenericType<List<TestPointShortGetModel>>() {};
    return apiClient.invokeAPI("TestPointsApi.apiV2TestPointsSearchPost", "/api/v2/testPoints/search", "POST", localVarQueryParams, apiV2TestPointsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
