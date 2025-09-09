package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestNamespacesCountResponse;
import ru.testit.client.model.AutoTestResultsForTestRunModel;
import ru.testit.client.model.CreateEmptyTestRunApiModel;
import ru.testit.client.model.CreateTestRunAndFillByAutoTestsApiModel;
import ru.testit.client.model.CreateTestRunAndFillByConfigurationsApiModel;
import ru.testit.client.model.CreateTestRunAndFillByWorkItemsApiModel;
import ru.testit.client.model.ManualRerunApiResult;
import ru.testit.client.model.ManualRerunSelectTestResultsApiModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestPointResultApiResult;
import ru.testit.client.model.TestResultsStatisticsApiResult;
import ru.testit.client.model.TestRunFilterApiModel;
import ru.testit.client.model.TestRunSelectApiModel;
import ru.testit.client.model.TestRunShortApiResult;
import ru.testit.client.model.TestRunStatisticsFilterApiModel;
import ru.testit.client.model.TestRunTestResultsPartialBulkSetModel;
import ru.testit.client.model.TestRunV2ApiResult;
import java.util.UUID;
import ru.testit.client.model.UpdateEmptyTestRunApiModel;
import ru.testit.client.model.UpdateMultipleTestRunsApiModel;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
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
   * Delete multiple test runs
   *  Use case  User sets selection parameters of test runs  System search and delete collection of test runs  System returns the number of deleted test runs
   * @param testRunSelectApiModel  (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2TestRunsDelete(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    return apiV2TestRunsDeleteWithHttpInfo(testRunSelectApiModel).getData();
  }

  /**
   * Delete multiple test runs
   *  Use case  User sets selection parameters of test runs  System search and delete collection of test runs  System returns the number of deleted test runs
   * @param testRunSelectApiModel  (optional)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2TestRunsDeleteWithHttpInfo(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsDelete", "/api/v2/testRuns", "DELETE", new ArrayList<>(), testRunSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get autotest classes and namespaces in test run
   * 
   * @param id  (required)
   * @return AutoTestNamespacesCountResponse
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
  public AutoTestNamespacesCountResponse apiV2TestRunsIdAutoTestsNamespacesGet(UUID id) throws ApiException {
    return apiV2TestRunsIdAutoTestsNamespacesGetWithHttpInfo(id).getData();
  }

  /**
   * Get autotest classes and namespaces in test run
   * 
   * @param id  (required)
   * @return ApiResponse&lt;AutoTestNamespacesCountResponse&gt;
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
  public ApiResponse<AutoTestNamespacesCountResponse> apiV2TestRunsIdAutoTestsNamespacesGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdAutoTestsNamespacesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/autoTestsNamespaces"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<AutoTestNamespacesCountResponse> localVarReturnType = new GenericType<AutoTestNamespacesCountResponse>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdAutoTestsNamespacesGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete test run
   *  Use case  User sets test run internal (guid format) identifier  System search and delete test run
   * @param id Test run internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test run with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsIdDelete(UUID id) throws ApiException {
    apiV2TestRunsIdDeleteWithHttpInfo(id);
  }

  /**
   * Delete test run
   *  Use case  User sets test run internal (guid format) identifier  System search and delete test run
   * @param id Test run internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test run with provided ID cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsIdDeleteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Permanently delete test run from archive
   *  Use case  User sets archived test run internal (guid format) identifier  System search and purge archived test run
   * @param id Test run internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for archived test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsIdPurgePost(UUID id) throws ApiException {
    apiV2TestRunsIdPurgePostWithHttpInfo(id);
  }

  /**
   * Permanently delete test run from archive
   *  Use case  User sets archived test run internal (guid format) identifier  System search and purge archived test run
   * @param id Test run internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for archived test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsIdPurgePostWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdPurgePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/purge"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdPurgePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Manual autotests rerun in test run
   * 
   * @param id  (required)
   * @param manualRerunSelectTestResultsApiModel  (optional)
   * @return ManualRerunApiResult
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
  public ManualRerunApiResult apiV2TestRunsIdRerunsPost(UUID id, ManualRerunSelectTestResultsApiModel manualRerunSelectTestResultsApiModel) throws ApiException {
    return apiV2TestRunsIdRerunsPostWithHttpInfo(id, manualRerunSelectTestResultsApiModel).getData();
  }

  /**
   * Manual autotests rerun in test run
   * 
   * @param id  (required)
   * @param manualRerunSelectTestResultsApiModel  (optional)
   * @return ApiResponse&lt;ManualRerunApiResult&gt;
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
  public ApiResponse<ManualRerunApiResult> apiV2TestRunsIdRerunsPostWithHttpInfo(UUID id, ManualRerunSelectTestResultsApiModel manualRerunSelectTestResultsApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdRerunsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/reruns"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<ManualRerunApiResult> localVarReturnType = new GenericType<ManualRerunApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdRerunsPost", localVarPath, "POST", new ArrayList<>(), manualRerunSelectTestResultsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Restore test run from the archive
   *  Use case  User sets archived test run internal (guid format) identifier  System search and restore test run
   * @param id Unique ID of the test run (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsIdRestorePost(UUID id) throws ApiException {
    apiV2TestRunsIdRestorePostWithHttpInfo(id);
  }

  /**
   * Restore test run from the archive
   *  Use case  User sets archived test run internal (guid format) identifier  System search and restore test run
   * @param id Unique ID of the test run (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - ID is not valid  - Project was archived and cannot be edited anymore </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsIdRestorePostWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdRestorePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/restore"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdRestorePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search for the test run test results and build statistics
   * 
   * @param id Test run unique ID (required)
   * @param testRunStatisticsFilterApiModel  (optional)
   * @return TestResultsStatisticsApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestResultsStatisticsApiResult apiV2TestRunsIdStatisticsFilterPost(UUID id, TestRunStatisticsFilterApiModel testRunStatisticsFilterApiModel) throws ApiException {
    return apiV2TestRunsIdStatisticsFilterPostWithHttpInfo(id, testRunStatisticsFilterApiModel).getData();
  }

  /**
   * Search for the test run test results and build statistics
   * 
   * @param id Test run unique ID (required)
   * @param testRunStatisticsFilterApiModel  (optional)
   * @return ApiResponse&lt;TestResultsStatisticsApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestResultsStatisticsApiResult> apiV2TestRunsIdStatisticsFilterPostWithHttpInfo(UUID id, TestRunStatisticsFilterApiModel testRunStatisticsFilterApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdStatisticsFilterPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/statistics/filter"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestResultsStatisticsApiResult> localVarReturnType = new GenericType<TestResultsStatisticsApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdStatisticsFilterPost", localVarPath, "POST", new ArrayList<>(), testRunStatisticsFilterApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get test results from the test run grouped by test points
   * 
   * @param id Test run unique ID (required)
   * @return List&lt;TestPointResultApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointResultApiResult> apiV2TestRunsIdTestPointsResultsGet(UUID id) throws ApiException {
    return apiV2TestRunsIdTestPointsResultsGetWithHttpInfo(id).getData();
  }

  /**
   * Get test results from the test run grouped by test points
   * 
   * @param id Test run unique ID (required)
   * @return ApiResponse&lt;List&lt;TestPointResultApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointResultApiResult>> apiV2TestRunsIdTestPointsResultsGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestPointsResultsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/testPoints/results"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPointResultApiResult>> localVarReturnType = new GenericType<List<TestPointResultApiResult>>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestPointsResultsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Partial edit of multiple test results in the test run
   * 
   * @param id Test run unique ID (required)
   * @param testRunTestResultsPartialBulkSetModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsIdTestResultsBulkPut(UUID id, TestRunTestResultsPartialBulkSetModel testRunTestResultsPartialBulkSetModel) throws ApiException {
    apiV2TestRunsIdTestResultsBulkPutWithHttpInfo(id, testRunTestResultsPartialBulkSetModel);
  }

  /**
   * Partial edit of multiple test results in the test run
   * 
   * @param id Test run unique ID (required)
   * @param testRunTestResultsPartialBulkSetModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsIdTestResultsBulkPutWithHttpInfo(UUID id, TestRunTestResultsPartialBulkSetModel testRunTestResultsPartialBulkSetModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestResultsBulkPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/testResults/bulk"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestResultsBulkPut", localVarPath, "PUT", new ArrayList<>(), testRunTestResultsPartialBulkSetModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get modification date of last test result of the test run
   * 
   * @param id Test run unique ID (required)
   * @return OffsetDateTime
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public OffsetDateTime apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(UUID id) throws ApiException {
    return apiV2TestRunsIdTestResultsLastModifiedModificationDateGetWithHttpInfo(id).getData();
  }

  /**
   * Get modification date of last test result of the test run
   * 
   * @param id Test run unique ID (required)
   * @return ApiResponse&lt;OffsetDateTime&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OffsetDateTime> apiV2TestRunsIdTestResultsLastModifiedModificationDateGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestRunsIdTestResultsLastModifiedModificationDateGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/testResults/lastModified/modificationDate"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<OffsetDateTime> localVarReturnType = new GenericType<OffsetDateTime>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsIdTestResultsLastModifiedModificationDateGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Permanently delete multiple test runs from archive
   *  Use case  User sets selection parameters of archived test runs  System search and delete collection of archived test runs  System returns the number of deleted archived test runs
   * @param testRunSelectApiModel  (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for archived test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2TestRunsPurgeBulkPost(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    return apiV2TestRunsPurgeBulkPostWithHttpInfo(testRunSelectApiModel).getData();
  }

  /**
   * Permanently delete multiple test runs from archive
   *  Use case  User sets selection parameters of archived test runs  System search and delete collection of archived test runs  System returns the number of deleted archived test runs
   * @param testRunSelectApiModel  (optional)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for archived test runs is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2TestRunsPurgeBulkPostWithHttpInfo(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsPurgeBulkPost", "/api/v2/testRuns/purge/bulk", "POST", new ArrayList<>(), testRunSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Restore multiple test runs from the archive
   *  Use case  User sets selection parameters of archived test runs  System search and restore collection of archived test runs  System returns the number of restored test runs
   * @param testRunSelectApiModel  (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2TestRunsRestoreBulkPost(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    return apiV2TestRunsRestoreBulkPostWithHttpInfo(testRunSelectApiModel).getData();
  }

  /**
   * Restore multiple test runs from the archive
   *  Use case  User sets selection parameters of archived test runs  System search and restore collection of archived test runs  System returns the number of restored test runs
   * @param testRunSelectApiModel  (optional)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2TestRunsRestoreBulkPostWithHttpInfo(TestRunSelectApiModel testRunSelectApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsRestoreBulkPost", "/api/v2/testRuns/restore/bulk", "POST", new ArrayList<>(), testRunSelectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for test runs
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testRunFilterApiModel  (optional)
   * @return List&lt;TestRunShortApiResult&gt;
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
  public List<TestRunShortApiResult> apiV2TestRunsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestRunFilterApiModel testRunFilterApiModel) throws ApiException {
    return apiV2TestRunsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, testRunFilterApiModel).getData();
  }

  /**
   * Search for test runs
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testRunFilterApiModel  (optional)
   * @return ApiResponse&lt;List&lt;TestRunShortApiResult&gt;&gt;
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
  public ApiResponse<List<TestRunShortApiResult>> apiV2TestRunsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestRunFilterApiModel testRunFilterApiModel) throws ApiException {
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
    GenericType<List<TestRunShortApiResult>> localVarReturnType = new GenericType<List<TestRunShortApiResult>>() {};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsSearchPost", "/api/v2/testRuns/search", "POST", localVarQueryParams, testRunFilterApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update multiple test runs
   * 
   * @param updateMultipleTestRunsApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestRunsUpdateMultiplePost(UpdateMultipleTestRunsApiModel updateMultipleTestRunsApiModel) throws ApiException {
    apiV2TestRunsUpdateMultiplePostWithHttpInfo(updateMultipleTestRunsApiModel);
  }

  /**
   * Update multiple test runs
   * 
   * @param updateMultipleTestRunsApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestRunsUpdateMultiplePostWithHttpInfo(UpdateMultipleTestRunsApiModel updateMultipleTestRunsApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.apiV2TestRunsUpdateMultiplePost", "/api/v2/testRuns/updateMultiple", "POST", new ArrayList<>(), updateMultipleTestRunsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Complete TestRun
   *  Use case  User sets test run identifier  User runs method execution  System completes test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void completeTestRun(UUID id) throws ApiException {
    completeTestRunWithHttpInfo(id);
  }

  /**
   * Complete TestRun
   *  Use case  User sets test run identifier  User runs method execution  System completes test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> completeTestRunWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling completeTestRun");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/complete"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.completeTestRun", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create test runs based on autotests and configurations
   * This method creates a test run based on an autotest and a configuration. The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is that in this method there is no need to create a test plan and work items (test cases and checklists).
   * @param createTestRunAndFillByAutoTestsApiModel  (optional)
   * @return TestRunV2ApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Configuration does not exist in the project  - Autotest does not exist in the project  - Test run must be automated  - Project ID is invalid  - Autotest external IDs are required  - Configuration IDs are required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some autotests do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2ApiResult createAndFillByAutoTests(CreateTestRunAndFillByAutoTestsApiModel createTestRunAndFillByAutoTestsApiModel) throws ApiException {
    return createAndFillByAutoTestsWithHttpInfo(createTestRunAndFillByAutoTestsApiModel).getData();
  }

  /**
   * Create test runs based on autotests and configurations
   * This method creates a test run based on an autotest and a configuration. The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is that in this method there is no need to create a test plan and work items (test cases and checklists).
   * @param createTestRunAndFillByAutoTestsApiModel  (optional)
   * @return ApiResponse&lt;TestRunV2ApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Configuration does not exist in the project  - Autotest does not exist in the project  - Test run must be automated  - Project ID is invalid  - Autotest external IDs are required  - Configuration IDs are required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some autotests do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2ApiResult> createAndFillByAutoTestsWithHttpInfo(CreateTestRunAndFillByAutoTestsApiModel createTestRunAndFillByAutoTestsApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunV2ApiResult> localVarReturnType = new GenericType<TestRunV2ApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.createAndFillByAutoTests", "/api/v2/testRuns/byAutoTests", "POST", new ArrayList<>(), createTestRunAndFillByAutoTestsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create test runs picking the needed test points
   * This method creates a test run based on a combination of a configuration and a work item(test case or checklist). Before you create a test run using this method, make sure to create a test plan. Work items must be automated. This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.
   * @param createTestRunAndFillByConfigurationsApiModel  (optional)
   * @return TestRunV2ApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Test run cannot be created with deleted test points  - Test suites with IDs [ids] is archived  - Configurations with IDs [ids] is archived  - Test run cannot be created with non-automated test point  - Test run must be automated  - Some work items do not exist  - Project ID is invalid  - Test point selectors are required  - Some work item IDs are invalid  - Some configuration IDs are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points do not exists </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2ApiResult createAndFillByConfigurations(CreateTestRunAndFillByConfigurationsApiModel createTestRunAndFillByConfigurationsApiModel) throws ApiException {
    return createAndFillByConfigurationsWithHttpInfo(createTestRunAndFillByConfigurationsApiModel).getData();
  }

  /**
   * Create test runs picking the needed test points
   * This method creates a test run based on a combination of a configuration and a work item(test case or checklist). Before you create a test run using this method, make sure to create a test plan. Work items must be automated. This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.
   * @param createTestRunAndFillByConfigurationsApiModel  (optional)
   * @return ApiResponse&lt;TestRunV2ApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Test run cannot be created with deleted test points  - Test suites with IDs [ids] is archived  - Configurations with IDs [ids] is archived  - Test run cannot be created with non-automated test point  - Test run must be automated  - Some work items do not exist  - Project ID is invalid  - Test point selectors are required  - Some work item IDs are invalid  - Some configuration IDs are invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points do not exists </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2ApiResult> createAndFillByConfigurationsWithHttpInfo(CreateTestRunAndFillByConfigurationsApiModel createTestRunAndFillByConfigurationsApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunV2ApiResult> localVarReturnType = new GenericType<TestRunV2ApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.createAndFillByConfigurations", "/api/v2/testRuns/byConfigurations", "POST", new ArrayList<>(), createTestRunAndFillByConfigurationsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create test run based on configurations and work items
   * This method creates a test run based on a combination of configuration and work item (test case or checklist). Before you create a test run using this method, make sure to create a test plan. Work items must be automated.
   * @param createTestRunAndFillByWorkItemsApiModel  (optional)
   * @return TestRunV2ApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Test run cannot be created with deleted test points  - Test suites with IDs [ids] is archived  - Configurations with IDs [ids] is archived  - Test run cannot be created with non-automated test point  - Some work items do not exist  - Project ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points, work items or configurations do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2ApiResult createAndFillByWorkItems(CreateTestRunAndFillByWorkItemsApiModel createTestRunAndFillByWorkItemsApiModel) throws ApiException {
    return createAndFillByWorkItemsWithHttpInfo(createTestRunAndFillByWorkItemsApiModel).getData();
  }

  /**
   * Create test run based on configurations and work items
   * This method creates a test run based on a combination of configuration and work item (test case or checklist). Before you create a test run using this method, make sure to create a test plan. Work items must be automated.
   * @param createTestRunAndFillByWorkItemsApiModel  (optional)
   * @return ApiResponse&lt;TestRunV2ApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Test run cannot be created with deleted test points  - Test suites with IDs [ids] is archived  - Configurations with IDs [ids] is archived  - Test run cannot be created with non-automated test point  - Some work items do not exist  - Project ID is invalid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Some test points, work items or configurations do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2ApiResult> createAndFillByWorkItemsWithHttpInfo(CreateTestRunAndFillByWorkItemsApiModel createTestRunAndFillByWorkItemsApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunV2ApiResult> localVarReturnType = new GenericType<TestRunV2ApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.createAndFillByWorkItems", "/api/v2/testRuns/byWorkItems", "POST", new ArrayList<>(), createTestRunAndFillByWorkItemsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create empty TestRun
   *  Use case  User sets test run model (listed in the request example)  User runs method execution  System creates test run  System returns test run model
   * @param createEmptyTestRunApiModel  (optional)
   * @return TestRunV2ApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  TestRun must be automated  ProjectId is not a valid! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> TestRunTesterRequirement permission required </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id &#x3D; testRunId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2ApiResult createEmpty(CreateEmptyTestRunApiModel createEmptyTestRunApiModel) throws ApiException {
    return createEmptyWithHttpInfo(createEmptyTestRunApiModel).getData();
  }

  /**
   * Create empty TestRun
   *  Use case  User sets test run model (listed in the request example)  User runs method execution  System creates test run  System returns test run model
   * @param createEmptyTestRunApiModel  (optional)
   * @return ApiResponse&lt;TestRunV2ApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  TestRun must be automated  ProjectId is not a valid! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> TestRunTesterRequirement permission required </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id &#x3D; testRunId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2ApiResult> createEmptyWithHttpInfo(CreateEmptyTestRunApiModel createEmptyTestRunApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunV2ApiResult> localVarReturnType = new GenericType<TestRunV2ApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.createEmpty", "/api/v2/testRuns", "POST", new ArrayList<>(), createEmptyTestRunApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestRun by Id
   *  Use case  User sets test run identifier  User runs method execution  System finds test run  System returns test run
   * @param id Test Run internal identifier (GUID format) (required)
   * @return TestRunV2ApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  TestRun with ID &#39;{id}&#39; does not exist. </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestRunV2ApiResult getTestRunById(UUID id) throws ApiException {
    return getTestRunByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestRun by Id
   *  Use case  User sets test run identifier  User runs method execution  System finds test run  System returns test run
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;TestRunV2ApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  TestRun with ID &#39;{id}&#39; does not exist. </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestRunV2ApiResult> getTestRunByIdWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRunById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunV2ApiResult> localVarReturnType = new GenericType<TestRunV2ApiResult>() {};
    return apiClient.invokeAPI("TestRunsApi.getTestRunById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Body is invalid  - Test points are required  - Duration must be a positive number  - Outcome is not defined  - Test run is stopped </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  - Test run with provided ID was not found  - Test point was not found  - Autotest with provided external ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>  - Configuration with provided ID was not found  - Test points relevant to provided filters were not found </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Field is required  - Body is invalid  - Test points are required  - Duration must be a positive number  - Outcome is not defined  - Test run is stopped </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test results is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  - Test run with provided ID was not found  - Test point was not found  - Autotest with provided external ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td>  - Configuration with provided ID was not found  - Test points relevant to provided filters were not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> setAutoTestResultsForTestRunWithHttpInfo(UUID id, List<AutoTestResultsForTestRunModel> autoTestResultsForTestRunModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setAutoTestResultsForTestRun");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/testResults"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("TestRunsApi.setAutoTestResultsForTestRun", localVarPath, "POST", new ArrayList<>(), autoTestResultsForTestRunModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Start TestRun
   *  Use case  User sets test run identifier  User runs method execution  System starts test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already InProgress  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void startTestRun(UUID id) throws ApiException {
    startTestRunWithHttpInfo(id);
  }

  /**
   * Start TestRun
   *  Use case  User sets test run identifier  User runs method execution  System starts test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already InProgress  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> startTestRunWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startTestRun");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/start"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.startTestRun", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Stop TestRun
   *  Use case  User sets test run identifier  User runs method execution  System stops test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void stopTestRun(UUID id) throws ApiException {
    stopTestRunWithHttpInfo(id);
  }

  /**
   * Stop TestRun
   *  Use case  User sets test run identifier  User runs method execution  System stops test run  System returns no content response
   * @param id Test Run internal identifier (GUID format) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  the StateName is already Stopped  the StateName is already Completed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> stopTestRunWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopTestRun");
    }

    // Path parameters
    String localVarPath = "/api/v2/testRuns/{id}/stop"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.stopTestRun", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update empty TestRun
   *  Use case  User sets test run properties (listed in the request example)  User runs method execution  System updates test run  System returns returns no content response
   * @param updateEmptyTestRunApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  Name is not valid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void updateEmpty(UpdateEmptyTestRunApiModel updateEmptyTestRunApiModel) throws ApiException {
    updateEmptyWithHttpInfo(updateEmptyTestRunApiModel);
  }

  /**
   * Update empty TestRun
   *  Use case  User sets test run properties (listed in the request example)  User runs method execution  System updates test run  System returns returns no content response
   * @param updateEmptyTestRunApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Field is required  Name is not valid </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test result required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateEmptyWithHttpInfo(UpdateEmptyTestRunApiModel updateEmptyTestRunApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestRunsApi.updateEmpty", "/api/v2/testRuns", "PUT", new ArrayList<>(), updateEmptyTestRunApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
