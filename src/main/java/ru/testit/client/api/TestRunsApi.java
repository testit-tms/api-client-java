package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestResultsForTestRunModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestPointResultModel;
import ru.testit.client.model.TestResultsLocalFilterModel;
import ru.testit.client.model.TestResultsStatisticsGetModel;
import ru.testit.client.model.TestRunFillByAutoTestsPostModel;
import ru.testit.client.model.TestRunFillByConfigurationsPostModel;
import ru.testit.client.model.TestRunFillByWorkItemsPostModel;
import ru.testit.client.model.TestRunFilterModel;
import ru.testit.client.model.TestRunShortGetModel;
import ru.testit.client.model.TestRunTestResultsPartialBulkSetModel;
import ru.testit.client.model.TestRunV2GetModel;
import ru.testit.client.model.TestRunV2PostShortModel;
import ru.testit.client.model.TestRunV2PutModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunsApi {
  private ApiClient apiClient;

  public TestRunsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TestRunsApi(ApiClient apiClient) {
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
   * 
   * 
   * @param id  (required)
   * @param testResultsLocalFilterModel  (optional)
   * @return TestResultsStatisticsGetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TestResultsStatisticsGetModel apiV2TestRunsIdStatisticsFilterPost(UUID id, TestResultsLocalFilterModel testResultsLocalFilterModel) throws ApiException {
    return apiV2TestRunsIdStatisticsFilterPostWithHttpInfo(id, testResultsLocalFilterModel).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param testResultsLocalFilterModel  (optional)
   * @return ApiResponse&lt;TestResultsStatisticsGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestResultsStatisticsGetModel> apiV2TestRunsIdStatisticsFilterPostWithHttpInfo(UUID id, TestResultsLocalFilterModel testResultsLocalFilterModel) throws ApiException {
    Object localVarPostBody = testResultsLocalFilterModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdStatisticsFilterPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/statistics/filter"
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

    GenericType<TestResultsStatisticsGetModel> localVarReturnType = new GenericType<TestResultsStatisticsGetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdStatisticsFilterPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @return List&lt;TestPointResultModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointResultModel> apiV2TestRunsIdTestPointsResultsGet(UUID id) throws ApiException {
    return apiV2TestRunsIdTestPointsResultsGetWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;List&lt;TestPointResultModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointResultModel>> apiV2TestRunsIdTestPointsResultsGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestPointsResultsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/testPoints/results"
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

    GenericType<List<TestPointResultModel>> localVarReturnType = new GenericType<List<TestPointResultModel>>() {};

    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestPointsResultsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param testRunTestResultsPartialBulkSetModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsIdTestResultsBulkPut(UUID id, TestRunTestResultsPartialBulkSetModel testRunTestResultsPartialBulkSetModel) throws ApiException {
    apiV2TestRunsIdTestResultsBulkPutWithHttpInfo(id, testRunTestResultsPartialBulkSetModel);
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param testRunTestResultsPartialBulkSetModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsIdTestResultsBulkPutWithHttpInfo(UUID id, TestRunTestResultsPartialBulkSetModel testRunTestResultsPartialBulkSetModel) throws ApiException {
    Object localVarPostBody = testRunTestResultsPartialBulkSetModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestResultsBulkPut");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/testResults/bulk"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestResultsBulkPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @return OffsetDateTime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public OffsetDateTime apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(UUID id) throws ApiException {
    return apiV2TestRunsIdTestResultsLastModifiedModificationDateGetWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;OffsetDateTime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OffsetDateTime> apiV2TestRunsIdTestResultsLastModifiedModificationDateGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestResultsLastModifiedModificationDateGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/testResults/lastModified/modificationDate"
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

    GenericType<OffsetDateTime> localVarReturnType = new GenericType<OffsetDateTime>() {};

    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestResultsLastModifiedModificationDateGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
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
   * @param testRunFilterModel  (optional)
   * @return List&lt;TestRunShortGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<TestRunShortGetModel> apiV2TestRunsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestRunFilterModel testRunFilterModel) throws ApiException {
    return apiV2TestRunsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, testRunFilterModel).getData();
  }

  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testRunFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;TestRunShortGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunShortGetModel>> apiV2TestRunsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestRunFilterModel testRunFilterModel) throws ApiException {
    Object localVarPostBody = testRunFilterModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/search";

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

    GenericType<List<TestRunShortGetModel>> localVarReturnType = new GenericType<List<TestRunShortGetModel>>() {};

    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Complete TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System completes test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
     </table>
   */
  public void completeTestRun(UUID id) throws ApiException {
    completeTestRunWithHttpInfo(id);
  }

  /**
   * Complete TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System completes test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> completeTestRunWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling completeTestRun");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/complete"
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

    return apiClient.invokeAPI("TestRunsApi.completeTestRun", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create test runs based on autotests and configurations
   * This method creates a test run based on an autotest and a configuration.  The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is  that in this method there is no need to create a test plan and work items (test cases and checklists).
   * @param testRunFillByAutoTestsPostModel  (optional)
   * @return TestRunV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Configuration does not exist in the project  &lt;br&gt;- Autotest does not exist in the project  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Autotest external IDs are required  &lt;br&gt;- Configuration IDs are required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some autotests do not exist </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2GetModel createAndFillByAutoTests(TestRunFillByAutoTestsPostModel testRunFillByAutoTestsPostModel) throws ApiException {
    return createAndFillByAutoTestsWithHttpInfo(testRunFillByAutoTestsPostModel).getData();
  }

  /**
   * Create test runs based on autotests and configurations
   * This method creates a test run based on an autotest and a configuration.  The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is  that in this method there is no need to create a test plan and work items (test cases and checklists).
   * @param testRunFillByAutoTestsPostModel  (optional)
   * @return ApiResponse&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Configuration does not exist in the project  &lt;br&gt;- Autotest does not exist in the project  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Autotest external IDs are required  &lt;br&gt;- Configuration IDs are required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some autotests do not exist </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2GetModel> createAndFillByAutoTestsWithHttpInfo(TestRunFillByAutoTestsPostModel testRunFillByAutoTestsPostModel) throws ApiException {
    Object localVarPostBody = testRunFillByAutoTestsPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/byAutoTests";

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

    GenericType<TestRunV2GetModel> localVarReturnType = new GenericType<TestRunV2GetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.createAndFillByAutoTests", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create test runs picking the needed test points
   * This method creates a test run based on a combination of a configuration and a work item(test case or checklist).  Before you create a test run using this method, make sure to create a test plan. Work items must be automated.  This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a  jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.
   * @param testRunFillByConfigurationsPostModel  (optional)
   * @return TestRunV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Test point selectors are required  &lt;br&gt;- Some work item IDs are invalid  &lt;br&gt;- Some configuration IDs are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points do not exists </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2GetModel createAndFillByConfigurations(TestRunFillByConfigurationsPostModel testRunFillByConfigurationsPostModel) throws ApiException {
    return createAndFillByConfigurationsWithHttpInfo(testRunFillByConfigurationsPostModel).getData();
  }

  /**
   * Create test runs picking the needed test points
   * This method creates a test run based on a combination of a configuration and a work item(test case or checklist).  Before you create a test run using this method, make sure to create a test plan. Work items must be automated.  This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a  jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.
   * @param testRunFillByConfigurationsPostModel  (optional)
   * @return ApiResponse&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Test point selectors are required  &lt;br&gt;- Some work item IDs are invalid  &lt;br&gt;- Some configuration IDs are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points do not exists </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2GetModel> createAndFillByConfigurationsWithHttpInfo(TestRunFillByConfigurationsPostModel testRunFillByConfigurationsPostModel) throws ApiException {
    Object localVarPostBody = testRunFillByConfigurationsPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/byConfigurations";

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

    GenericType<TestRunV2GetModel> localVarReturnType = new GenericType<TestRunV2GetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.createAndFillByConfigurations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create test run based on configurations and work items
   * This method creates a test run based on a combination of configuration and work item (test case or checklist).  Before you create a test run using this method, make sure to create a test plan.  Work items must be automated.
   * @param testRunFillByWorkItemsPostModel  (optional)
   * @return TestRunV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points, work items or configurations do not exist </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2GetModel createAndFillByWorkItems(TestRunFillByWorkItemsPostModel testRunFillByWorkItemsPostModel) throws ApiException {
    return createAndFillByWorkItemsWithHttpInfo(testRunFillByWorkItemsPostModel).getData();
  }

  /**
   * Create test run based on configurations and work items
   * This method creates a test run based on a combination of configuration and work item (test case or checklist).  Before you create a test run using this method, make sure to create a test plan.  Work items must be automated.
   * @param testRunFillByWorkItemsPostModel  (optional)
   * @return ApiResponse&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points, work items or configurations do not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2GetModel> createAndFillByWorkItemsWithHttpInfo(TestRunFillByWorkItemsPostModel testRunFillByWorkItemsPostModel) throws ApiException {
    Object localVarPostBody = testRunFillByWorkItemsPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/byWorkItems";

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

    GenericType<TestRunV2GetModel> localVarReturnType = new GenericType<TestRunV2GetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.createAndFillByWorkItems", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create empty TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System returns test run model
   * @param testRunV2PostShortModel  (optional)
   * @return TestRunV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> TestRunTesterRequirement permission required </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;TestRun must be automated  &lt;br&gt;ProjectId is not a valid! </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id &#x3D; testRunId </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2GetModel createEmpty(TestRunV2PostShortModel testRunV2PostShortModel) throws ApiException {
    return createEmptyWithHttpInfo(testRunV2PostShortModel).getData();
  }

  /**
   * Create empty TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System returns test run model
   * @param testRunV2PostShortModel  (optional)
   * @return ApiResponse&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> TestRunTesterRequirement permission required </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;TestRun must be automated  &lt;br&gt;ProjectId is not a valid! </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id &#x3D; testRunId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2GetModel> createEmptyWithHttpInfo(TestRunV2PostShortModel testRunV2PostShortModel) throws ApiException {
    Object localVarPostBody = testRunV2PostShortModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns";

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

    GenericType<TestRunV2GetModel> localVarReturnType = new GenericType<TestRunV2GetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.createEmpty", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestRun by Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds test run  &lt;br&gt;System returns test run
   * @param id Test Run internal identifier (GUID format) (required)
   * @return TestRunV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2GetModel getTestRunById(UUID id) throws ApiException {
    return getTestRunByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestRun by Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds test run  &lt;br&gt;System returns test run
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2GetModel> getTestRunByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRunById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}"
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

    GenericType<TestRunV2GetModel> localVarReturnType = new GenericType<TestRunV2GetModel>() {};

    return apiClient.invokeAPI("TestRunsApi.getTestRunById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send test results to the test runs in the system
   * This method sends test results to the test management system.
   * @param id Test Run internal identifier (GUID format) (required)
   * @param autoTestResultsForTestRunModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Configuration with provided ID was not found  &lt;br&gt;- Test points relevant to provided filters were not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Test run with provided ID was not found  &lt;br&gt;- Test point was not found  &lt;br&gt;- Autotest with provided external ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Body is invalid  &lt;br&gt;- Test points are required  &lt;br&gt;- Duration must be a positive number  &lt;br&gt;- Outcome is not defined  &lt;br&gt;- Test run is stopped </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> setAutoTestResultsForTestRun(UUID id, List<AutoTestResultsForTestRunModel> autoTestResultsForTestRunModel) throws ApiException {
    return setAutoTestResultsForTestRunWithHttpInfo(id, autoTestResultsForTestRunModel).getData();
  }

  /**
   * Send test results to the test runs in the system
   * This method sends test results to the test management system.
   * @param id Test Run internal identifier (GUID format) (required)
   * @param autoTestResultsForTestRunModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Configuration with provided ID was not found  &lt;br&gt;- Test points relevant to provided filters were not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Test run with provided ID was not found  &lt;br&gt;- Test point was not found  &lt;br&gt;- Autotest with provided external ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Field is required  &lt;br&gt;- Body is invalid  &lt;br&gt;- Test points are required  &lt;br&gt;- Duration must be a positive number  &lt;br&gt;- Outcome is not defined  &lt;br&gt;- Test run is stopped </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> setAutoTestResultsForTestRunWithHttpInfo(UUID id, List<AutoTestResultsForTestRunModel> autoTestResultsForTestRunModel) throws ApiException {
    Object localVarPostBody = autoTestResultsForTestRunModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setAutoTestResultsForTestRun");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/testResults"
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

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};

    return apiClient.invokeAPI("TestRunsApi.setAutoTestResultsForTestRun", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Start TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System starts test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already InProgress  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
     </table>
   */
  public void startTestRun(UUID id) throws ApiException {
    startTestRunWithHttpInfo(id);
  }

  /**
   * Start TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System starts test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already InProgress  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> startTestRunWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startTestRun");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/start"
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

    return apiClient.invokeAPI("TestRunsApi.startTestRun", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Stop TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System stops test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void stopTestRun(UUID id) throws ApiException {
    stopTestRunWithHttpInfo(id);
  }

  /**
   * Stop TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System stops test run  &lt;br&gt;System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> stopTestRunWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopTestRun");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns/{id}/stop"
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

    return apiClient.invokeAPI("TestRunsApi.stopTestRun", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update empty TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test run  &lt;br&gt;System returns returns no content response
   * @param testRunV2PutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Name is not valid </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void updateEmpty(TestRunV2PutModel testRunV2PutModel) throws ApiException {
    updateEmptyWithHttpInfo(testRunV2PutModel);
  }

  /**
   * Update empty TestRun
   * &lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test run  &lt;br&gt;System returns returns no content response
   * @param testRunV2PutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Name is not valid </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateEmptyWithHttpInfo(TestRunV2PutModel testRunV2PutModel) throws ApiException {
    Object localVarPostBody = testRunV2PutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testRuns";

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

    return apiClient.invokeAPI("TestRunsApi.updateEmpty", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
