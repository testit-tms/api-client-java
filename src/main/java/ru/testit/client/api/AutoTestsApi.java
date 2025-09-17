package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestApiResult;
import ru.testit.client.model.AutoTestAverageDurationModel;
import ru.testit.client.model.AutoTestBulkDeleteApiModel;
import ru.testit.client.model.AutoTestBulkDeleteApiResult;
import ru.testit.client.model.AutoTestFlakyBulkApiModel;
import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.AutoTestPostModel;
import ru.testit.client.model.AutoTestPutModel;
import ru.testit.client.model.AutoTestResultHistoryApiResult;
import ru.testit.client.model.AutoTestResultHistorySelectApiModel;
import ru.testit.client.model.AutoTestSearchApiModel;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestResultChronologyModel;
import ru.testit.client.model.TestRunByAutoTestApiResult;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemIdModel;
import ru.testit.client.model.WorkItemIdentifierModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AutoTestsApi {
  private ApiClient apiClient;

  public AutoTestsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AutoTestsApi(ApiClient apiClient) {
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
   * Delete autotests
   * 
   * @param autoTestBulkDeleteApiModel  (optional)
   * @return AutoTestBulkDeleteApiResult
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
  public AutoTestBulkDeleteApiResult apiV2AutoTestsDelete(AutoTestBulkDeleteApiModel autoTestBulkDeleteApiModel) throws ApiException {
    return apiV2AutoTestsDeleteWithHttpInfo(autoTestBulkDeleteApiModel).getData();
  }

  /**
   * Delete autotests
   * 
   * @param autoTestBulkDeleteApiModel  (optional)
   * @return ApiResponse&lt;AutoTestBulkDeleteApiResult&gt;
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
  public ApiResponse<AutoTestBulkDeleteApiResult> apiV2AutoTestsDeleteWithHttpInfo(AutoTestBulkDeleteApiModel autoTestBulkDeleteApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AutoTestBulkDeleteApiResult> localVarReturnType = new GenericType<AutoTestBulkDeleteApiResult>() {};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsDelete", "/api/v2/autoTests", "DELETE", new ArrayList<>(), autoTestBulkDeleteApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set \&quot;Flaky\&quot; status for multiple autotests
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestFlakyBulkApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Autotests with provided identifiers do not belong to the same project </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2AutoTestsFlakyBulkPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestFlakyBulkApiModel autoTestFlakyBulkApiModel) throws ApiException {
    apiV2AutoTestsFlakyBulkPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, autoTestFlakyBulkApiModel);
  }

  /**
   * Set \&quot;Flaky\&quot; status for multiple autotests
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestFlakyBulkApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Autotests with provided identifiers do not belong to the same project </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2AutoTestsFlakyBulkPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestFlakyBulkApiModel autoTestFlakyBulkApiModel) throws ApiException {
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
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsFlakyBulkPost", "/api/v2/autoTests/flaky/bulk", "POST", localVarQueryParams, autoTestFlakyBulkApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Patch auto test
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Global Id of auto test (required)
   * @param operation  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for auto tests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2AutoTestsIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2AutoTestsIdPatchWithHttpInfo(id, operation);
  }

  /**
   * Patch auto test
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Global Id of auto test (required)
   * @param operation  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for auto tests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2AutoTestsIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get test results history for autotest
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User sets getTestResultHistoryReportQuery (listed in the example)    User runs method execution    System search for test results using filters set by user in getTestResultHistoryReportQuery and id    System returns the enumeration of test results
   * @param id Autotest identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestResultHistorySelectApiModel  (optional)
   * @return List&lt;AutoTestResultHistoryApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestResultHistoryApiResult> apiV2AutoTestsIdTestResultsSearchPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestResultHistorySelectApiModel autoTestResultHistorySelectApiModel) throws ApiException {
    return apiV2AutoTestsIdTestResultsSearchPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, autoTestResultHistorySelectApiModel).getData();
  }

  /**
   * Get test results history for autotest
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User sets getTestResultHistoryReportQuery (listed in the example)    User runs method execution    System search for test results using filters set by user in getTestResultHistoryReportQuery and id    System returns the enumeration of test results
   * @param id Autotest identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestResultHistorySelectApiModel  (optional)
   * @return ApiResponse&lt;List&lt;AutoTestResultHistoryApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestResultHistoryApiResult>> apiV2AutoTestsIdTestResultsSearchPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestResultHistorySelectApiModel autoTestResultHistorySelectApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdTestResultsSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/testResults/search"
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
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AutoTestResultHistoryApiResult>> localVarReturnType = new GenericType<List<AutoTestResultHistoryApiResult>>() {};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdTestResultsSearchPost", localVarPath, "POST", localVarQueryParams, autoTestResultHistorySelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get identifiers of changed linked work items
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param id  (required)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2AutoTestsIdWorkItemsChangedIdGet(UUID id) throws ApiException {
    return apiV2AutoTestsIdWorkItemsChangedIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get identifiers of changed linked work items
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param id  (required)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2AutoTestsIdWorkItemsChangedIdGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdWorkItemsChangedIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/workItems/changed/id"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdWorkItemsChangedIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Approve changes to work items linked to autotest
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param id  (required)
   * @param workItemId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(UUID id, UUID workItemId) throws ApiException {
    apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePostWithHttpInfo(id, workItemId);
  }

  /**
   * Approve changes to work items linked to autotest
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param id  (required)
   * @param workItemId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePostWithHttpInfo(UUID id, UUID workItemId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost");
    }
    if (workItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'workItemId' when calling apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{workItemId}", apiClient.escapeString(workItemId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search for autotests
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestSearchApiModel  (optional)
   * @return List&lt;AutoTestApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestApiResult> apiV2AutoTestsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestSearchApiModel autoTestSearchApiModel) throws ApiException {
    return apiV2AutoTestsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, autoTestSearchApiModel).getData();
  }

  /**
   * Search for autotests
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autoTestSearchApiModel  (optional)
   * @return ApiResponse&lt;List&lt;AutoTestApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestApiResult>> apiV2AutoTestsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutoTestSearchApiModel autoTestSearchApiModel) throws ApiException {
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
    GenericType<List<AutoTestApiResult>> localVarReturnType = new GenericType<List<AutoTestApiResult>>() {};
    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsSearchPost", "/api/v2/autoTests/search", "POST", localVarQueryParams, autoTestSearchApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create autotest
   *   This method creates a new autotest.    To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.    Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.
   * @param autoTestPostModel  (optional)
   * @return AutoTestModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestModel createAutoTest(AutoTestPostModel autoTestPostModel) throws ApiException {
    return createAutoTestWithHttpInfo(autoTestPostModel).getData();
  }

  /**
   * Create autotest
   *   This method creates a new autotest.    To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.    Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.
   * @param autoTestPostModel  (optional)
   * @return ApiResponse&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestModel> createAutoTestWithHttpInfo(AutoTestPostModel autoTestPostModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AutoTestModel> localVarReturnType = new GenericType<AutoTestModel>() {};
    return apiClient.invokeAPI("AutoTestsApi.createAutoTest", "/api/v2/autoTests", "POST", new ArrayList<>(), autoTestPostModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create multiple autotests
   *   Use case    User sets autotest parameters (listed in the example) and runs method execution    System creates autotest    [Optional] If steps enumeration is set, system creates step items and relates them to autotest    [Optional] If setup enumeration is set, system creates setup items and relates them to autotest    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest    [Optional] If label enumeration is set, system creates labels and relates them to autotest    [Optional] If link enumeration is set, system creates links and relates them to autotest    System returns autotest model (example listed in response parameters)
   * @param autoTestPostModel  (optional)
   * @return List&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestModel> createMultiple(List<AutoTestPostModel> autoTestPostModel) throws ApiException {
    return createMultipleWithHttpInfo(autoTestPostModel).getData();
  }

  /**
   * Create multiple autotests
   *   Use case    User sets autotest parameters (listed in the example) and runs method execution    System creates autotest    [Optional] If steps enumeration is set, system creates step items and relates them to autotest    [Optional] If setup enumeration is set, system creates setup items and relates them to autotest    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest    [Optional] If label enumeration is set, system creates labels and relates them to autotest    [Optional] If link enumeration is set, system creates links and relates them to autotest    System returns autotest model (example listed in response parameters)
   * @param autoTestPostModel  (optional)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> createMultipleWithHttpInfo(List<AutoTestPostModel> autoTestPostModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};
    return apiClient.invokeAPI("AutoTestsApi.createMultiple", "/api/v2/autoTests/bulk", "POST", new ArrayList<>(), autoTestPostModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete autotest
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier and runs method execution    System finds the autotest by the identifier    System deletes autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAutoTest(String id) throws ApiException {
    deleteAutoTestWithHttpInfo(id);
  }

  /**
   * Delete autotest
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier and runs method execution    System finds the autotest by the identifier    System deletes autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAutoTestWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAutoTest");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.deleteAutoTest", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Unlink autotest from work item
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    [Optional] User sets workitem internal (guid format) or global (integer format) identifier    User runs method execution    System finds the autotest by the autotest identifier    [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.    [Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.    System returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemId Work item internal (UUID) or global (integer) identifier (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotest with provided ID cannot be found    - Work item with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAutoTestLinkFromWorkItem(String id, String workItemId) throws ApiException {
    deleteAutoTestLinkFromWorkItemWithHttpInfo(id, workItemId);
  }

  /**
   * Unlink autotest from work item
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    [Optional] User sets workitem internal (guid format) or global (integer format) identifier    User runs method execution    System finds the autotest by the autotest identifier    [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.    [Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.    System returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemId Work item internal (UUID) or global (integer) identifier (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotest with provided ID cannot be found    - Work item with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAutoTestLinkFromWorkItemWithHttpInfo(String id, String workItemId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAutoTestLinkFromWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "workItemId", workItemId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.deleteAutoTestLinkFromWorkItem", localVarPath, "DELETE", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param projectId Project internal ID (optional)
   * @param externalId Autotest external ID (optional)
   * @param globalId Autotest global ID (optional)
   * @param namespace Namespace in which autotest is located (optional)
   * @param isNamespaceNull OBSOLETE: Use &#x60;includeEmptyNamespaces&#x60; instead (optional)
   * @param includeEmptyNamespaces If result must contain autotests without namespace (optional)
   * @param className Name of class in which autotest is located (optional)
   * @param isClassnameNull OBSOLETE: Use &#x60;includeEmptyClassNames&#x60; instead (optional)
   * @param includeEmptyClassNames If result must contain autotests without class (optional)
   * @param isDeleted OBSOLETE: Use &#x60;deleted&#x60; instead (optional)
   * @param deleted Is autotest deleted (optional)
   * @param labels Include only autotests with provided labels (optional)
   * @param stabilityMinimal OBSOLETE: Use &#x60;minStability&#x60; instead (optional)
   * @param minStability Minimum stability value of autotest (optional)
   * @param stabilityMaximal OBSOLETE: Use &#x60;maxStability&#x60; instead (optional)
   * @param maxStability Maximum stability value of autotest (optional)
   * @param isFlaky OBSOLETE: Use &#x60;flaky&#x60; instead (optional)
   * @param flaky Is autotest marked as \&quot;Flaky\&quot; (optional)
   * @param includeSteps If result must also include autotest steps (optional)
   * @param includeLabels If result must also include autotest labels (optional)
   * @param externalKey External key of autotest (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;AutoTestModel&gt;
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
   * @deprecated
   */
  @Deprecated
  public List<AutoTestModel> getAllAutoTests(UUID projectId, String externalId, Long globalId, String namespace, Boolean isNamespaceNull, Boolean includeEmptyNamespaces, String className, Boolean isClassnameNull, Boolean includeEmptyClassNames, Boolean isDeleted, Boolean deleted, List<String> labels, Integer stabilityMinimal, Integer minStability, Integer stabilityMaximal, Integer maxStability, Boolean isFlaky, Boolean flaky, Boolean includeSteps, Boolean includeLabels, String externalKey, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getAllAutoTestsWithHttpInfo(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, externalKey, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * 
   * 
   * @param projectId Project internal ID (optional)
   * @param externalId Autotest external ID (optional)
   * @param globalId Autotest global ID (optional)
   * @param namespace Namespace in which autotest is located (optional)
   * @param isNamespaceNull OBSOLETE: Use &#x60;includeEmptyNamespaces&#x60; instead (optional)
   * @param includeEmptyNamespaces If result must contain autotests without namespace (optional)
   * @param className Name of class in which autotest is located (optional)
   * @param isClassnameNull OBSOLETE: Use &#x60;includeEmptyClassNames&#x60; instead (optional)
   * @param includeEmptyClassNames If result must contain autotests without class (optional)
   * @param isDeleted OBSOLETE: Use &#x60;deleted&#x60; instead (optional)
   * @param deleted Is autotest deleted (optional)
   * @param labels Include only autotests with provided labels (optional)
   * @param stabilityMinimal OBSOLETE: Use &#x60;minStability&#x60; instead (optional)
   * @param minStability Minimum stability value of autotest (optional)
   * @param stabilityMaximal OBSOLETE: Use &#x60;maxStability&#x60; instead (optional)
   * @param maxStability Maximum stability value of autotest (optional)
   * @param isFlaky OBSOLETE: Use &#x60;flaky&#x60; instead (optional)
   * @param flaky Is autotest marked as \&quot;Flaky\&quot; (optional)
   * @param includeSteps If result must also include autotest steps (optional)
   * @param includeLabels If result must also include autotest labels (optional)
   * @param externalKey External key of autotest (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<AutoTestModel>> getAllAutoTestsWithHttpInfo(UUID projectId, String externalId, Long globalId, String namespace, Boolean isNamespaceNull, Boolean includeEmptyNamespaces, String className, Boolean isClassnameNull, Boolean includeEmptyClassNames, Boolean isDeleted, Boolean deleted, List<String> labels, Integer stabilityMinimal, Integer minStability, Integer stabilityMaximal, Integer maxStability, Boolean isFlaky, Boolean flaky, Boolean includeSteps, Boolean includeLabels, String externalKey, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "projectId", projectId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "globalId", globalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "namespace", namespace));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isNamespaceNull", isNamespaceNull));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeEmptyNamespaces", includeEmptyNamespaces));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "className", className));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isClassnameNull", isClassnameNull));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeEmptyClassNames", includeEmptyClassNames));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deleted", deleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "labels", labels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stabilityMinimal", stabilityMinimal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minStability", minStability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stabilityMaximal", stabilityMaximal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxStability", maxStability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFlaky", isFlaky));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flaky", flaky));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSteps", includeSteps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLabels", includeLabels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalKey", externalKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};
    return apiClient.invokeAPI("AutoTestsApi.getAllAutoTests", "/api/v2/autoTests", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get average autotest duration
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System calculates pass average duration and fail average duration of autotest from all related test results    System returns pass average duration and fail average duration for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return AutoTestAverageDurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestAverageDurationModel getAutoTestAverageDuration(String id) throws ApiException {
    return getAutoTestAverageDurationWithHttpInfo(id).getData();
  }

  /**
   * Get average autotest duration
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System calculates pass average duration and fail average duration of autotest from all related test results    System returns pass average duration and fail average duration for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;AutoTestAverageDurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestAverageDurationModel> getAutoTestAverageDurationWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestAverageDuration");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/averageDuration"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AutoTestAverageDurationModel> localVarReturnType = new GenericType<AutoTestAverageDurationModel>() {};
    return apiClient.invokeAPI("AutoTestsApi.getAutoTestAverageDuration", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get autotest by internal or global ID
   *   Use case    User sets autotest internal or global identifier and runs method execution    System returns autotest, which internal or global identifier equals the identifier value set in the previous action
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return AutoTestModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Autotest ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestModel getAutoTestById(String id) throws ApiException {
    return getAutoTestByIdWithHttpInfo(id).getData();
  }

  /**
   * Get autotest by internal or global ID
   *   Use case    User sets autotest internal or global identifier and runs method execution    System returns autotest, which internal or global identifier equals the identifier value set in the previous action
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Autotest ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestModel> getAutoTestByIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestById");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AutoTestModel> localVarReturnType = new GenericType<AutoTestModel>() {};
    return apiClient.invokeAPI("AutoTestsApi.getAutoTestById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get autotest chronology
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System search all test results related to autotest (with default limit equal 100)    System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending    System returns test result chronology for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return List&lt;TestResultChronologyModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<TestResultChronologyModel> getAutoTestChronology(String id) throws ApiException {
    return getAutoTestChronologyWithHttpInfo(id).getData();
  }

  /**
   * Get autotest chronology
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System search all test results related to autotest (with default limit equal 100)    System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending    System returns test result chronology for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;TestResultChronologyModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<TestResultChronologyModel>> getAutoTestChronologyWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestChronology");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/chronology"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestResultChronologyModel>> localVarReturnType = new GenericType<List<TestResultChronologyModel>>() {};
    return apiClient.invokeAPI("AutoTestsApi.getAutoTestChronology", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get completed tests runs for autotests
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System search for all test runs related to the autotest    System returns the enumeration of test runs
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return List&lt;TestRunByAutoTestApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestRunByAutoTestApiResult> getTestRuns(String id) throws ApiException {
    return getTestRunsWithHttpInfo(id).getData();
  }

  /**
   * Get completed tests runs for autotests
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User runs method execution    System search for all test runs related to the autotest    System returns the enumeration of test runs
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;TestRunByAutoTestApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunByAutoTestApiResult>> getTestRunsWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRuns");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/testRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestRunByAutoTestApiResult>> localVarReturnType = new GenericType<List<TestRunByAutoTestApiResult>>() {};
    return apiClient.invokeAPI("AutoTestsApi.getTestRuns", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get work items linked to autotest
   *   This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:    1. Open the project in GUI.                2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.                3. Select the autotest(s) you want to run using checkboxes.                4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.
   * @param id Specifies the autotest entity ID.    You can copy it from the address bar in your web browser or use autotest GUID. (required)
   * @param isDeleted Specifies that a test is deleted or still relevant. (optional)
   * @param isWorkItemDeleted OBSOLETE: Use &#x60;isDeleted&#x60; instead (optional, default to false)
   * @return List&lt;WorkItemIdentifierModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemIdentifierModel> getWorkItemsLinkedToAutoTest(String id, Boolean isDeleted, Boolean isWorkItemDeleted) throws ApiException {
    return getWorkItemsLinkedToAutoTestWithHttpInfo(id, isDeleted, isWorkItemDeleted).getData();
  }

  /**
   * Get work items linked to autotest
   *   This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:    1. Open the project in GUI.                2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.                3. Select the autotest(s) you want to run using checkboxes.                4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.
   * @param id Specifies the autotest entity ID.    You can copy it from the address bar in your web browser or use autotest GUID. (required)
   * @param isDeleted Specifies that a test is deleted or still relevant. (optional)
   * @param isWorkItemDeleted OBSOLETE: Use &#x60;isDeleted&#x60; instead (optional, default to false)
   * @return ApiResponse&lt;List&lt;WorkItemIdentifierModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemIdentifierModel>> getWorkItemsLinkedToAutoTestWithHttpInfo(String id, Boolean isDeleted, Boolean isWorkItemDeleted) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsLinkedToAutoTest");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isWorkItemDeleted", isWorkItemDeleted));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemIdentifierModel>> localVarReturnType = new GenericType<List<WorkItemIdentifierModel>>() {};
    return apiClient.invokeAPI("AutoTestsApi.getWorkItemsLinkedToAutoTest", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Link autotest with work items
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User sets work item internal (guid format) or global (integer format) identifier    User runs method execution    System finds the autotest by the autotest identifier    System finds the work item by the work item identifier    System relates the work item with the autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemIdModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Autotest cannot be linked to shared steps    - Autotest cannot be linked to work item from other project    - Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotest with provided ID cannot be found    - Work item with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void linkAutoTestToWorkItem(String id, WorkItemIdModel workItemIdModel) throws ApiException {
    linkAutoTestToWorkItemWithHttpInfo(id, workItemIdModel);
  }

  /**
   * Link autotest with work items
   *   Use case    User sets autotest internal (guid format) or global (integer format) identifier    User sets work item internal (guid format) or global (integer format) identifier    User runs method execution    System finds the autotest by the autotest identifier    System finds the work item by the work item identifier    System relates the work item with the autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemIdModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Autotest cannot be linked to shared steps    - Autotest cannot be linked to work item from other project    - Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotest with provided ID cannot be found    - Work item with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> linkAutoTestToWorkItemWithHttpInfo(String id, WorkItemIdModel workItemIdModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling linkAutoTestToWorkItem");
    }

    // Path parameters
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.linkAutoTestToWorkItem", localVarPath, "POST", new ArrayList<>(), workItemIdModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update autotest
   *   Use case    User sets autotest updated parameters values (listed in the example) and runs method execution    System finds the autotest by the identifier    System updates autotest parameters    [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)    [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)    [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)    [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)    System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotests with provided ID cannot be found    - Project with provided ID cannot be found    - Link with provided ID cannot be found    - Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Project ID cannot be changed    - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void updateAutoTest(AutoTestPutModel autoTestPutModel) throws ApiException {
    updateAutoTestWithHttpInfo(autoTestPutModel);
  }

  /**
   * Update autotest
   *   Use case    User sets autotest updated parameters values (listed in the example) and runs method execution    System finds the autotest by the identifier    System updates autotest parameters    [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)    [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)    [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)    [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)    System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotests with provided ID cannot be found    - Project with provided ID cannot be found    - Link with provided ID cannot be found    - Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Project ID cannot be changed    - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateAutoTestWithHttpInfo(AutoTestPutModel autoTestPutModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.updateAutoTest", "/api/v2/autoTests", "PUT", new ArrayList<>(), autoTestPutModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update multiple autotests
   *   Use case    User sets autotest updated parameters values (listed in the example) and runs method execution    System finds the autotest by the identifier    System updates autotest parameters    [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)    [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)    [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)    [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)    System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotests with provided ID cannot be found    - Project with provided ID cannot be found    - Link with provided ID cannot be found    - Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Project ID cannot be changed    - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public void updateMultiple(List<AutoTestPutModel> autoTestPutModel) throws ApiException {
    updateMultipleWithHttpInfo(autoTestPutModel);
  }

  /**
   * Update multiple autotests
   *   Use case    User sets autotest updated parameters values (listed in the example) and runs method execution    System finds the autotest by the identifier    System updates autotest parameters    [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)    [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)    [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)    [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)    [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)    System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   - Name cannot be empty or contain only white space characters    - External ID cannot be empty or contain only white space characters    - Namespace cannot be empty or contain only white space characters    - Classname cannot be empty or contain only white space characters    - Steps cannot be &#x60;null&#x60;    - Steps nesting level is more than 15    - Invalid URI </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   - Autotests with provided ID cannot be found    - Project with provided ID cannot be found    - Link with provided ID cannot be found    - Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>   - Project ID cannot be changed    - Labels have duplicates    - Labels begin with &#x60;::&#x60;    - Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateMultipleWithHttpInfo(List<AutoTestPutModel> autoTestPutModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("AutoTestsApi.updateMultiple", "/api/v2/autoTests/bulk", "PUT", new ArrayList<>(), autoTestPutModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
