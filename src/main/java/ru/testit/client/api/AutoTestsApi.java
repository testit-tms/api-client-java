package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestAverageDurationModel;
import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.AutoTestPostModel;
import ru.testit.client.model.AutoTestPutModel;
import ru.testit.client.model.AutotestHistoricalResultSelectModel;
import ru.testit.client.model.AutotestResultHistoricalGetModel;
import ru.testit.client.model.FlakyBulkModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SearchAutotestsQueryModel;
import ru.testit.client.model.TestResultChronologyModel;
import ru.testit.client.model.TestResultHistoryReportModel;
import ru.testit.client.model.TestRunShortModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemIdModel;
import ru.testit.client.model.WorkItemIdentifierModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * Set \&quot;Flaky\&quot; status for multiple autotests
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param flakyBulkModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Autotests with provided identifiers do not belong to the same project </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2AutoTestsFlakyBulkPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, FlakyBulkModel flakyBulkModel) throws ApiException {
    apiV2AutoTestsFlakyBulkPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, flakyBulkModel);
  }

  /**
   * Set \&quot;Flaky\&quot; status for multiple autotests
   * User permissions for project:  - Read only  - Execute  - Write  - Full control
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param flakyBulkModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Autotests with provided identifiers do not belong to the same project </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2AutoTestsFlakyBulkPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, FlakyBulkModel flakyBulkModel) throws ApiException {
    Object localVarPostBody = flakyBulkModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/flaky/bulk";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsFlakyBulkPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get test results history for autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets getTestResultHistoryReportQuery (listed in the example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search for test results using filters set by user in getTestResultHistoryReportQuery and id  &lt;br&gt;System returns the enumeration of test results
   * @param id Autotest identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autotestHistoricalResultSelectModel  (optional)
   * @return List&lt;AutotestResultHistoricalGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<AutotestResultHistoricalGetModel> apiV2AutoTestsIdTestResultsSearchPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutotestHistoricalResultSelectModel autotestHistoricalResultSelectModel) throws ApiException {
    return apiV2AutoTestsIdTestResultsSearchPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, autotestHistoricalResultSelectModel).getData();
  }

  /**
   * Get test results history for autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets getTestResultHistoryReportQuery (listed in the example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search for test results using filters set by user in getTestResultHistoryReportQuery and id  &lt;br&gt;System returns the enumeration of test results
   * @param id Autotest identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param autotestHistoricalResultSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;AutotestResultHistoricalGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutotestResultHistoricalGetModel>> apiV2AutoTestsIdTestResultsSearchPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, AutotestHistoricalResultSelectModel autotestHistoricalResultSelectModel) throws ApiException {
    Object localVarPostBody = autotestHistoricalResultSelectModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdTestResultsSearchPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/testResults/search"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<AutotestResultHistoricalGetModel>> localVarReturnType = new GenericType<List<AutotestResultHistoricalGetModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdTestResultsSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2AutoTestsIdWorkItemsChangedIdGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdWorkItemsChangedIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/workItems/changed/id"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};

    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdWorkItemsChangedIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePostWithHttpInfo(UUID id, UUID workItemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost");
    }
    
    // verify the required parameter 'workItemId' is set
    if (workItemId == null) {
      throw new ApiException(400, "Missing the required parameter 'workItemId' when calling apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "workItemId" + "\\}", apiClient.escapeString(workItemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAutotestsQueryModel  (optional)
   * @return List&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<AutoTestModel> apiV2AutoTestsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAutotestsQueryModel searchAutotestsQueryModel) throws ApiException {
    return apiV2AutoTestsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, searchAutotestsQueryModel).getData();
  }

  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAutotestsQueryModel  (optional)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> apiV2AutoTestsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAutotestsQueryModel searchAutotestsQueryModel) throws ApiException {
    Object localVarPostBody = searchAutotestsQueryModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.apiV2AutoTestsSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create autotest
   * &lt;br&gt;This method creates a new autotest.  &lt;br&gt;To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.  &lt;br&gt;Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.
   * @param autoTestPostModel  (optional)
   * @return AutoTestModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestModel createAutoTest(AutoTestPostModel autoTestPostModel) throws ApiException {
    return createAutoTestWithHttpInfo(autoTestPostModel).getData();
  }

  /**
   * Create autotest
   * &lt;br&gt;This method creates a new autotest.  &lt;br&gt;To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.  &lt;br&gt;Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.
   * @param autoTestPostModel  (optional)
   * @return ApiResponse&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestModel> createAutoTestWithHttpInfo(AutoTestPostModel autoTestPostModel) throws ApiException {
    Object localVarPostBody = autoTestPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<AutoTestModel> localVarReturnType = new GenericType<AutoTestModel>() {};

    return apiClient.invokeAPI("AutoTestsApi.createAutoTest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create multiple autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)
   * @param autoTestPostModel  (optional)
   * @return List&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestModel> createMultiple(List<AutoTestPostModel> autoTestPostModel) throws ApiException {
    return createMultipleWithHttpInfo(autoTestPostModel).getData();
  }

  /**
   * Create multiple autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)
   * @param autoTestPostModel  (optional)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> createMultipleWithHttpInfo(List<AutoTestPostModel> autoTestPostModel) throws ApiException {
    Object localVarPostBody = autoTestPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/bulk";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.createMultiple", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System deletes autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAutoTest(String id) throws ApiException {
    deleteAutoTestWithHttpInfo(id);
  }

  /**
   * Delete autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System deletes autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAutoTestWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAutoTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.deleteAutoTest", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Unlink autotest from work item
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;[Optional] User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;              [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.                &lt;br&gt;[Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  &lt;br&gt;System returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemId Work item internal (UUID) or global (integer) identifier (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAutoTestLinkFromWorkItem(String id, String workItemId) throws ApiException {
    deleteAutoTestLinkFromWorkItemWithHttpInfo(id, workItemId);
  }

  /**
   * Unlink autotest from work item
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;[Optional] User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;              [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.                &lt;br&gt;[Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  &lt;br&gt;System returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemId Work item internal (UUID) or global (integer) identifier (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAutoTestLinkFromWorkItemWithHttpInfo(String id, String workItemId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAutoTestLinkFromWorkItem");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workItemId", workItemId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.deleteAutoTestLinkFromWorkItem", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all autotests
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets search parameters (listed in request parameters) and runs method execution  &lt;br&gt;System returns all autotests, matching search criteria
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
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> You have no permissions for the project </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestModel> getAllAutoTests(UUID projectId, String externalId, Long globalId, String namespace, Boolean isNamespaceNull, Boolean includeEmptyNamespaces, String className, Boolean isClassnameNull, Boolean includeEmptyClassNames, Boolean isDeleted, Boolean deleted, List<String> labels, Integer stabilityMinimal, Integer minStability, Integer stabilityMaximal, Integer maxStability, Boolean isFlaky, Boolean flaky, Boolean includeSteps, Boolean includeLabels, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getAllAutoTestsWithHttpInfo(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get all autotests
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets search parameters (listed in request parameters) and runs method execution  &lt;br&gt;System returns all autotests, matching search criteria
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
       <tr><td> 404 </td><td> Project with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> You have no permissions for the project </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> getAllAutoTestsWithHttpInfo(UUID projectId, String externalId, Long globalId, String namespace, Boolean isNamespaceNull, Boolean includeEmptyNamespaces, String className, Boolean isClassnameNull, Boolean includeEmptyClassNames, Boolean isDeleted, Boolean deleted, List<String> labels, Integer stabilityMinimal, Integer minStability, Integer stabilityMaximal, Integer maxStability, Boolean isFlaky, Boolean flaky, Boolean includeSteps, Boolean includeLabels, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.getAllAutoTests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get average autotest duration
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System calculates pass average duration and fail average duration of autotest from all related test results  &lt;br&gt;System returns pass average duration and fail average duration for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return AutoTestAverageDurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestAverageDurationModel getAutoTestAverageDuration(String id) throws ApiException {
    return getAutoTestAverageDurationWithHttpInfo(id).getData();
  }

  /**
   * Get average autotest duration
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System calculates pass average duration and fail average duration of autotest from all related test results  &lt;br&gt;System returns pass average duration and fail average duration for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;AutoTestAverageDurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestAverageDurationModel> getAutoTestAverageDurationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestAverageDuration");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/averageDuration"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<AutoTestAverageDurationModel> localVarReturnType = new GenericType<AutoTestAverageDurationModel>() {};

    return apiClient.invokeAPI("AutoTestsApi.getAutoTestAverageDuration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get autotest by internal or global ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal or global identifier and runs method execution  &lt;br&gt;System returns autotest, which internal or global identifier equals the identifier value set in the previous action
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return AutoTestModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Autotest ID is invalid </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public AutoTestModel getAutoTestById(String id) throws ApiException {
    return getAutoTestByIdWithHttpInfo(id).getData();
  }

  /**
   * Get autotest by internal or global ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal or global identifier and runs method execution  &lt;br&gt;System returns autotest, which internal or global identifier equals the identifier value set in the previous action
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Autotest ID is invalid </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutoTestModel> getAutoTestByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<AutoTestModel> localVarReturnType = new GenericType<AutoTestModel>() {};

    return apiClient.invokeAPI("AutoTestsApi.getAutoTestById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get autotest chronology
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search all test results related to autotest (with default limit equal 100)  &lt;br&gt;System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending  &lt;br&gt;System returns test result chronology for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return List&lt;TestResultChronologyModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultChronologyModel> getAutoTestChronology(String id) throws ApiException {
    return getAutoTestChronologyWithHttpInfo(id).getData();
  }

  /**
   * Get autotest chronology
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search all test results related to autotest (with default limit equal 100)  &lt;br&gt;System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending  &lt;br&gt;System returns test result chronology for autotest
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;TestResultChronologyModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultChronologyModel>> getAutoTestChronologyWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestChronology");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/chronology"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TestResultChronologyModel>> localVarReturnType = new GenericType<List<TestResultChronologyModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.getAutoTestChronology", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get completed tests runs for autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search for all test runs related to the autotest  &lt;br&gt;System returns the enumeration of test runs
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return List&lt;TestRunShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public List<TestRunShortModel> getTestRuns(String id) throws ApiException {
    return getTestRunsWithHttpInfo(id).getData();
  }

  /**
   * Get completed tests runs for autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search for all test runs related to the autotest  &lt;br&gt;System returns the enumeration of test runs
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;TestRunShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunShortModel>> getTestRunsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRuns");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/testRuns"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TestRunShortModel>> localVarReturnType = new GenericType<List<TestRunShortModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.getTestRuns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestResultHistoryReportModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<TestResultHistoryReportModel> getWorkItemResults(String id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getWorkItemResultsWithHttpInfo(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestResultHistoryReportModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<TestResultHistoryReportModel>> getWorkItemResultsWithHttpInfo(String id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/testResultHistory"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "configurationIds", configurationIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testPlanIds", testPlanIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIds", userIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "outcomes", outcomes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutomated", isAutomated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "automated", automated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testRunIds", testRunIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TestResultHistoryReportModel>> localVarReturnType = new GenericType<List<TestResultHistoryReportModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.getWorkItemResults", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get work items linked to autotest
   * &lt;br&gt;              This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:                &lt;br&gt;              1. Open the project in GUI.&lt;br /&gt;              2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.&lt;br /&gt;              3. Select the autotest(s) you want to run using checkboxes.&lt;br /&gt;              4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.              
   * @param id Specifies the autotest entity ID.&lt;br /&gt;  You can copy it from the address bar in your web browser or use autotest GUID. (required)
   * @param isDeleted Specifies that a test is deleted or still relevant. (optional)
   * @param isWorkItemDeleted OBSOLETE: Use &#x60;isDeleted&#x60; instead (optional, default to false)
   * @return List&lt;WorkItemIdentifierModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemIdentifierModel> getWorkItemsLinkedToAutoTest(String id, Boolean isDeleted, Boolean isWorkItemDeleted) throws ApiException {
    return getWorkItemsLinkedToAutoTestWithHttpInfo(id, isDeleted, isWorkItemDeleted).getData();
  }

  /**
   * Get work items linked to autotest
   * &lt;br&gt;              This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:                &lt;br&gt;              1. Open the project in GUI.&lt;br /&gt;              2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.&lt;br /&gt;              3. Select the autotest(s) you want to run using checkboxes.&lt;br /&gt;              4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.              
   * @param id Specifies the autotest entity ID.&lt;br /&gt;  You can copy it from the address bar in your web browser or use autotest GUID. (required)
   * @param isDeleted Specifies that a test is deleted or still relevant. (optional)
   * @param isWorkItemDeleted OBSOLETE: Use &#x60;isDeleted&#x60; instead (optional, default to false)
   * @return ApiResponse&lt;List&lt;WorkItemIdentifierModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Autotest with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for autotests is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemIdentifierModel>> getWorkItemsLinkedToAutoTestWithHttpInfo(String id, Boolean isDeleted, Boolean isWorkItemDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsLinkedToAutoTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isWorkItemDeleted", isWorkItemDeleted));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<WorkItemIdentifierModel>> localVarReturnType = new GenericType<List<WorkItemIdentifierModel>>() {};

    return apiClient.invokeAPI("AutoTestsApi.getWorkItemsLinkedToAutoTest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Link autotest with work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets work item internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;System finds the work item by the work item identifier  &lt;br&gt;System relates the work item with the autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemIdModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Autotest cannot be linked to shared steps  &lt;br&gt;- Autotest cannot be linked to work item from other project  &lt;br&gt;- Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public void linkAutoTestToWorkItem(String id, WorkItemIdModel workItemIdModel) throws ApiException {
    linkAutoTestToWorkItemWithHttpInfo(id, workItemIdModel);
  }

  /**
   * Link autotest with work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets work item internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;System finds the work item by the work item identifier  &lt;br&gt;System relates the work item with the autotest and returns no content response
   * @param id Autotest internal (UUID) or global (integer) identifier (required)
   * @param workItemIdModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Autotest cannot be linked to shared steps  &lt;br&gt;- Autotest cannot be linked to work item from other project  &lt;br&gt;- Work item ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> linkAutoTestToWorkItemWithHttpInfo(String id, WorkItemIdModel workItemIdModel) throws ApiException {
    Object localVarPostBody = workItemIdModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling linkAutoTestToWorkItem");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/{id}/workItems"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.linkAutoTestToWorkItem", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void updateAutoTest(AutoTestPutModel autoTestPutModel) throws ApiException {
    updateAutoTestWithHttpInfo(autoTestPutModel);
  }

  /**
   * Update autotest
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateAutoTestWithHttpInfo(AutoTestPutModel autoTestPutModel) throws ApiException {
    Object localVarPostBody = autoTestPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.updateAutoTest", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update multiple autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
     </table>
   */
  public void updateMultiple(List<AutoTestPutModel> autoTestPutModel) throws ApiException {
    updateMultipleWithHttpInfo(autoTestPutModel);
  }

  /**
   * Update multiple autotests
   * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
   * @param autoTestPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for autotests is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Autotest with the same external ID already exists is the project </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateMultipleWithHttpInfo(List<AutoTestPutModel> autoTestPutModel) throws ApiException {
    Object localVarPostBody = autoTestPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/autoTests/bulk";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("AutoTestsApi.updateMultiple", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
