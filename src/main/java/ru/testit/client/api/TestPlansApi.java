package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.CreateTestPlanApiModel;
import ru.testit.client.model.GetXlsxTestPointsByTestPlanModel;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SearchTestRunsApiModel;
import java.util.Set;
import ru.testit.client.model.TestPlanChangeModel;
import ru.testit.client.model.TestPlanLink;
import ru.testit.client.model.TestPlanModel;
import ru.testit.client.model.TestPlanShortModel;
import ru.testit.client.model.TestPlanSummaryModel;
import ru.testit.client.model.TestPlanWithTestSuiteTreeModel;
import ru.testit.client.model.TestPointAnalyticResult;
import ru.testit.client.model.TestPointSelectModel;
import ru.testit.client.model.TestPointWithLastResultResponseModel;
import ru.testit.client.model.TestRunApiResult;
import ru.testit.client.model.TestSuiteHierarchyApiResult;
import java.util.UUID;
import ru.testit.client.model.UpdateTestPlanApiModel;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemSelectModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestPlansApi {
  private ApiClient apiClient;

  public TestPlansApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TestPlansApi(ApiClient apiClient) {
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
   * Add test-points to TestPlan with sections
   * 
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param workItemSelectModel Filter object to retrieve work items for test-suite&#39;s project (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
     </table>
   */
  public void addTestPointsWithSections(String id, WorkItemSelectModel workItemSelectModel) throws ApiException {
    addTestPointsWithSectionsWithHttpInfo(id, workItemSelectModel);
  }

  /**
   * Add test-points to TestPlan with sections
   * 
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param workItemSelectModel Filter object to retrieve work items for test-suite&#39;s project (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addTestPointsWithSectionsWithHttpInfo(String id, WorkItemSelectModel workItemSelectModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addTestPointsWithSections");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/test-points/withSections"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.addTestPointsWithSections", localVarPath, "POST", new ArrayList<>(), workItemSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Add WorkItems to TestPlan with Sections as TestSuites
   *   Use case    User sets TestPlan identifier    User sets WorkItem identifiers (listed in request example)    User runs method execution    System added WorkItems and Sections to TestPlan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   TestPlan is locked    Some of configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for TestPlan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestPlan with id    Some of workItems do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t put a SharedStep in the TestSuite </td><td>  -  </td></tr>
     </table>
   */
  public void addWorkItemsWithSections(String id, Set<UUID> UUID) throws ApiException {
    addWorkItemsWithSectionsWithHttpInfo(id, UUID);
  }

  /**
   * Add WorkItems to TestPlan with Sections as TestSuites
   *   Use case    User sets TestPlan identifier    User sets WorkItem identifiers (listed in request example)    User runs method execution    System added WorkItems and Sections to TestPlan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   TestPlan is locked    Some of configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for TestPlan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestPlan with id    Some of workItems do not exist </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t put a SharedStep in the TestSuite </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addWorkItemsWithSectionsWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addWorkItemsWithSections");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/workItems/withSections"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.addWorkItemsWithSections", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get analytics by TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System returns analytics by test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return TestPointAnalyticResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestPointAnalyticResult apiV2TestPlansIdAnalyticsGet(String id) throws ApiException {
    return apiV2TestPlansIdAnalyticsGetWithHttpInfo(id).getData();
  }

  /**
   * Get analytics by TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System returns analytics by test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;TestPointAnalyticResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestPointAnalyticResult> apiV2TestPlansIdAnalyticsGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdAnalyticsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/analytics"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPointAnalyticResult> localVarReturnType = new GenericType<TestPointAnalyticResult>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdAnalyticsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Distribute test points between the users
   * 
   * @param id Test plan unique or global ID (required)
   * @param testers Specifies a project user IDs to distribute (optional)
   * @return TestPlanWithTestSuiteTreeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public TestPlanWithTestSuiteTreeModel apiV2TestPlansIdAutobalancePost(String id, Set<UUID> testers) throws ApiException {
    return apiV2TestPlansIdAutobalancePostWithHttpInfo(id, testers).getData();
  }

  /**
   * Distribute test points between the users
   * 
   * @param id Test plan unique or global ID (required)
   * @param testers Specifies a project user IDs to distribute (optional)
   * @return ApiResponse&lt;TestPlanWithTestSuiteTreeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<TestPlanWithTestSuiteTreeModel> apiV2TestPlansIdAutobalancePostWithHttpInfo(String id, Set<UUID> testers) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdAutobalancePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/autobalance"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "testers", testers)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPlanWithTestSuiteTreeModel> localVarReturnType = new GenericType<TestPlanWithTestSuiteTreeModel>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdAutobalancePost", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestPlan configurations
   *   Use case    User sets test plan identifier    User runs method execution    System return test plan configurations
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<ConfigurationModel> apiV2TestPlansIdConfigurationsGet(String id) throws ApiException {
    return apiV2TestPlansIdConfigurationsGetWithHttpInfo(id).getData();
  }

  /**
   * Get TestPlan configurations
   *   Use case    User sets test plan identifier    User runs method execution    System return test plan configurations
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> apiV2TestPlansIdConfigurationsGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdConfigurationsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/configurations"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdConfigurationsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export TestPoints from TestPlan in xls format
   *   Use case    User sets test plan identifier    User sets filter model (listed in request example)    User runs method execution    System return export xlsx file
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param getXlsxTestPointsByTestPlanModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestPlansIdExportTestPointsXlsxPost(String id, Long timeZoneOffsetInMinutes, GetXlsxTestPointsByTestPlanModel getXlsxTestPointsByTestPlanModel) throws ApiException {
    apiV2TestPlansIdExportTestPointsXlsxPostWithHttpInfo(id, timeZoneOffsetInMinutes, getXlsxTestPointsByTestPlanModel);
  }

  /**
   * Export TestPoints from TestPlan in xls format
   *   Use case    User sets test plan identifier    User sets filter model (listed in request example)    User runs method execution    System return export xlsx file
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param getXlsxTestPointsByTestPlanModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestPlansIdExportTestPointsXlsxPostWithHttpInfo(String id, Long timeZoneOffsetInMinutes, GetXlsxTestPointsByTestPlanModel getXlsxTestPointsByTestPlanModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdExportTestPointsXlsxPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/export/testPoints/xlsx"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdExportTestPointsXlsxPost", localVarPath, "POST", new ArrayList<>(), getXlsxTestPointsByTestPlanModel,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Export TestResults history from TestPlan in xls format
   *   Use case    User sets test plan identifier    User sets filter model (listed in request example)    User runs method execution    System return export xlsx file
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param mustReturnOnlyLastTestResult  (optional)
   * @param includeSteps  (optional)
   * @param includeDeletedTestSuites  (optional)
   * @param timeZoneOffsetInMinutes  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestPlansIdExportTestResultHistoryXlsxPost(String id, Boolean mustReturnOnlyLastTestResult, Boolean includeSteps, Boolean includeDeletedTestSuites, Long timeZoneOffsetInMinutes) throws ApiException {
    apiV2TestPlansIdExportTestResultHistoryXlsxPostWithHttpInfo(id, mustReturnOnlyLastTestResult, includeSteps, includeDeletedTestSuites, timeZoneOffsetInMinutes);
  }

  /**
   * Export TestResults history from TestPlan in xls format
   *   Use case    User sets test plan identifier    User sets filter model (listed in request example)    User runs method execution    System return export xlsx file
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param mustReturnOnlyLastTestResult  (optional)
   * @param includeSteps  (optional)
   * @param includeDeletedTestSuites  (optional)
   * @param timeZoneOffsetInMinutes  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestPlansIdExportTestResultHistoryXlsxPostWithHttpInfo(String id, Boolean mustReturnOnlyLastTestResult, Boolean includeSteps, Boolean includeDeletedTestSuites, Long timeZoneOffsetInMinutes) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdExportTestResultHistoryXlsxPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/export/testResultHistory/xlsx"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "mustReturnOnlyLastTestResult", mustReturnOnlyLastTestResult)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeSteps", includeSteps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeDeletedTestSuites", includeDeletedTestSuites));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdExportTestResultHistoryXlsxPost", localVarPath, "POST", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get TestPlan history
   *   Use case    User sets test plan identifier    User runs method execution    System return test plan history
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestPlanChangeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanChangeModel> apiV2TestPlansIdHistoryGet(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2TestPlansIdHistoryGetWithHttpInfo(id, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get TestPlan history
   *   Use case    User sets test plan identifier    User runs method execution    System return test plan history
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestPlanChangeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanChangeModel>> apiV2TestPlansIdHistoryGetWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdHistoryGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/history"
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
    GenericType<List<TestPlanChangeModel>> localVarReturnType = new GenericType<List<TestPlanChangeModel>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdHistoryGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Links of TestPlan
   *   Use case    User sets test plan identifier    User sets pagination filter (listed in request example)    User runs method execution    System returns links of TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip  (optional)
   * @param take  (optional)
   * @param orderBy  (optional)
   * @return List&lt;TestPlanLink&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanLink> apiV2TestPlansIdLinksGet(String id, Integer skip, Integer take, String orderBy) throws ApiException {
    return apiV2TestPlansIdLinksGetWithHttpInfo(id, skip, take, orderBy).getData();
  }

  /**
   * Get Links of TestPlan
   *   Use case    User sets test plan identifier    User sets pagination filter (listed in request example)    User runs method execution    System returns links of TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip  (optional)
   * @param take  (optional)
   * @param orderBy  (optional)
   * @return ApiResponse&lt;List&lt;TestPlanLink&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanLink>> apiV2TestPlansIdLinksGetWithHttpInfo(String id, Integer skip, Integer take, String orderBy) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdLinksGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/links"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "skip", skip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanLink>> localVarReturnType = new GenericType<List<TestPlanLink>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdLinksGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Patch test plan
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique ID of the test plan (required)
   * @param operation  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestPlansIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2TestPlansIdPatchWithHttpInfo(id, operation);
  }

  /**
   * Patch test plan
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique ID of the test plan (required)
   * @param operation  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestPlansIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get summary by TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System returns summary by test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return TestPlanSummaryModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Test Plan with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestPlanSummaryModel apiV2TestPlansIdSummariesGet(String id) throws ApiException {
    return apiV2TestPlansIdSummariesGetWithHttpInfo(id).getData();
  }

  /**
   * Get summary by TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System returns summary by test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;TestPlanSummaryModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Test Plan with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestPlanSummaryModel> apiV2TestPlansIdSummariesGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdSummariesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/summaries"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPlanSummaryModel> localVarReturnType = new GenericType<TestPlanSummaryModel>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdSummariesGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestPoints with last result from TestPlan
   *   Use case    User sets test plan identifier    User sets filter (listed in request example)    User runs method execution    System return test points with last result from test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param testerId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestPointWithLastResultResponseModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointWithLastResultResponseModel> apiV2TestPlansIdTestPointsLastResultsGet(String id, UUID testerId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2TestPlansIdTestPointsLastResultsGetWithHttpInfo(id, testerId, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get TestPoints with last result from TestPlan
   *   Use case    User sets test plan identifier    User sets filter (listed in request example)    User runs method execution    System return test points with last result from test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param testerId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestPointWithLastResultResponseModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointWithLastResultResponseModel>> apiV2TestPlansIdTestPointsLastResultsGetWithHttpInfo(String id, UUID testerId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestPointsLastResultsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testPoints/lastResults"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "testerId", testerId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPointWithLastResultResponseModel>> localVarReturnType = new GenericType<List<TestPointWithLastResultResponseModel>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestPointsLastResultsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Reset TestPoints status of TestPlan
   *   Use case    User sets test plan identifier    User sets test points identifiers    User runs method execution    System reset test points statuses of test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param UUID  (optional)
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
  public void apiV2TestPlansIdTestPointsResetPost(String id, Set<UUID> UUID) throws ApiException {
    apiV2TestPlansIdTestPointsResetPostWithHttpInfo(id, UUID);
  }

  /**
   * Reset TestPoints status of TestPlan
   *   Use case    User sets test plan identifier    User sets test points identifiers    User runs method execution    System reset test points statuses of test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param UUID  (optional)
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
  public ApiResponse<Void> apiV2TestPlansIdTestPointsResetPostWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestPointsResetPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testPoints/reset"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestPointsResetPost", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Unassign users from multiple test points
   * 
   * @param id Unique or global ID of the test plan (required)
   * @param testPointSelectModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2TestPlansIdTestPointsTesterDelete(String id, TestPointSelectModel testPointSelectModel) throws ApiException {
    return apiV2TestPlansIdTestPointsTesterDeleteWithHttpInfo(id, testPointSelectModel).getData();
  }

  /**
   * Unassign users from multiple test points
   * 
   * @param id Unique or global ID of the test plan (required)
   * @param testPointSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2TestPlansIdTestPointsTesterDeleteWithHttpInfo(String id, TestPointSelectModel testPointSelectModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestPointsTesterDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testPoints/tester"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestPointsTesterDelete", localVarPath, "DELETE", new ArrayList<>(), testPointSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Assign user as a tester to multiple test points
   * 
   * @param id Unique or global ID of the test plan (required)
   * @param userId Unique ID of the user (required)
   * @param testPointSelectModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2TestPlansIdTestPointsTesterUserIdPost(String id, UUID userId, TestPointSelectModel testPointSelectModel) throws ApiException {
    return apiV2TestPlansIdTestPointsTesterUserIdPostWithHttpInfo(id, userId, testPointSelectModel).getData();
  }

  /**
   * Assign user as a tester to multiple test points
   * 
   * @param id Unique or global ID of the test plan (required)
   * @param userId Unique ID of the user (required)
   * @param testPointSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2TestPlansIdTestPointsTesterUserIdPostWithHttpInfo(String id, UUID userId, TestPointSelectModel testPointSelectModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestPointsTesterUserIdPost");
    }
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling apiV2TestPlansIdTestPointsTesterUserIdPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testPoints/tester/{userId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{userId}", apiClient.escapeString(userId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestPointsTesterUserIdPost", localVarPath, "POST", new ArrayList<>(), testPointSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestRuns of TestPlan
   *   Use case    User sets test plan identifier    User sets TestRun status filter (listed in request example)    User runs method execution    System returns TestRuns for TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestRunApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestRunApiResult> apiV2TestPlansIdTestRunsGet(String id, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2TestPlansIdTestRunsGetWithHttpInfo(id, notStarted, inProgress, stopped, completed, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get TestRuns of TestPlan
   *   Use case    User sets test plan identifier    User sets TestRun status filter (listed in request example)    User runs method execution    System returns TestRuns for TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestRunApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunApiResult>> apiV2TestPlansIdTestRunsGetWithHttpInfo(String id, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestRunsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notStarted", notStarted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inProgress", inProgress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopped", stopped));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completed", completed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestRunApiResult>> localVarReturnType = new GenericType<List<TestRunApiResult>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestRunsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search TestRuns of TestPlan
   *   Use case    User sets test plan identifier    User sets TestRuns filter (listed in request example)    User runs method execution    System returns TestRuns for TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchTestRunsApiModel  (optional)
   * @return List&lt;TestRunApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestRunApiResult> apiV2TestPlansIdTestRunsSearchPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchTestRunsApiModel searchTestRunsApiModel) throws ApiException {
    return apiV2TestPlansIdTestRunsSearchPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, searchTestRunsApiModel).getData();
  }

  /**
   * Search TestRuns of TestPlan
   *   Use case    User sets test plan identifier    User sets TestRuns filter (listed in request example)    User runs method execution    System returns TestRuns for TestPlan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchTestRunsApiModel  (optional)
   * @return ApiResponse&lt;List&lt;TestRunApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunApiResult>> apiV2TestPlansIdTestRunsSearchPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchTestRunsApiModel searchTestRunsApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestRunsSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testRuns/search"
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
    GenericType<List<TestRunApiResult>> localVarReturnType = new GenericType<List<TestRunApiResult>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestRunsSearchPost", localVarPath, "POST", localVarQueryParams, searchTestRunsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get last modification date of test plan&#39;s test results
   * 
   * @param id Internal (UUID) or global (integer) identifier (required)
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
  public void apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet(String id) throws ApiException {
    apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGetWithHttpInfo(id);
  }

  /**
   * Get last modification date of test plan&#39;s test results
   * 
   * @param id Internal (UUID) or global (integer) identifier (required)
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
  public ApiResponse<Void> apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testRuns/testResults/lastModified/modifiedDate"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Send unlock TestPlan notification
   *   Use case    User sets test plan identifier    User runs method execution    System send unlock test plan notification
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestPlansIdUnlockRequestPost(String id) throws ApiException {
    apiV2TestPlansIdUnlockRequestPostWithHttpInfo(id);
  }

  /**
   * Send unlock TestPlan notification
   *   Use case    User sets test plan identifier    User runs method execution    System send unlock test plan notification
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> TestPlan not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestPlansIdUnlockRequestPostWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestPlansIdUnlockRequestPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/unlock/request"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansIdUnlockRequestPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get TestPlans short models by Project identifiers
   *   Use case    User sets projects identifiers    User runs method execution    System return test plans short models (listed in response example)
   * @param isDeleted  (optional)
   * @param UUID  (optional)
   * @return List&lt;TestPlanShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanShortModel> apiV2TestPlansShortsPost(Boolean isDeleted, Set<UUID> UUID) throws ApiException {
    return apiV2TestPlansShortsPostWithHttpInfo(isDeleted, UUID).getData();
  }

  /**
   * Get TestPlans short models by Project identifiers
   *   Use case    User sets projects identifiers    User runs method execution    System return test plans short models (listed in response example)
   * @param isDeleted  (optional)
   * @param UUID  (optional)
   * @return ApiResponse&lt;List&lt;TestPlanShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanShortModel>> apiV2TestPlansShortsPostWithHttpInfo(Boolean isDeleted, Set<UUID> UUID) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanShortModel>> localVarReturnType = new GenericType<List<TestPlanShortModel>>() {};
    return apiClient.invokeAPI("TestPlansApi.apiV2TestPlansShortsPost", "/api/v2/testPlans/shorts", "POST", localVarQueryParams, UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Clone TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System clones test plan    System returns test plan (listed in response example)
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return TestPlanModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestPlanModel clone(String id) throws ApiException {
    return cloneWithHttpInfo(id).getData();
  }

  /**
   * Clone TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System clones test plan    System returns test plan (listed in response example)
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;TestPlanModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestPlanModel> cloneWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling clone");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/clone"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPlanModel> localVarReturnType = new GenericType<TestPlanModel>() {};
    return apiClient.invokeAPI("TestPlansApi.clone", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Complete TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System completes the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Execute status from New to Completed forbidden    Execute status from Completed to Completed forbidden </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void complete(String id) throws ApiException {
    completeWithHttpInfo(id);
  }

  /**
   * Complete TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System completes the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Execute status from New to Completed forbidden    Execute status from Completed to Completed forbidden </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> completeWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling complete");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/complete"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.complete", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create TestPlan
   *   Use case    User sets test plan properties (listed in request example)    User runs method execution    System creates test plan    System returns test plan (listed in response example)
   * @param createTestPlanApiModel  (optional)
   * @return TestPlanModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Tags must be no more than 10! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> TestPlan with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestPlanModel createTestPlan(CreateTestPlanApiModel createTestPlanApiModel) throws ApiException {
    return createTestPlanWithHttpInfo(createTestPlanApiModel).getData();
  }

  /**
   * Create TestPlan
   *   Use case    User sets test plan properties (listed in request example)    User runs method execution    System creates test plan    System returns test plan (listed in response example)
   * @param createTestPlanApiModel  (optional)
   * @return ApiResponse&lt;TestPlanModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Tags must be no more than 10! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> TestPlan with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestPlanModel> createTestPlanWithHttpInfo(CreateTestPlanApiModel createTestPlanApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPlanModel> localVarReturnType = new GenericType<TestPlanModel>() {};
    return apiClient.invokeAPI("TestPlansApi.createTestPlan", "/api/v2/testPlans", "POST", new ArrayList<>(), createTestPlanApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System delete test plan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTestPlan(String id) throws ApiException {
    deleteTestPlanWithHttpInfo(id);
  }

  /**
   * Delete TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System delete test plan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTestPlanWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTestPlan");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.deleteTestPlan", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get TestPlan by Id
   *   Use case    User sets test plan identifier    User runs method execution    System search  test plan by the identifier    System returns test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return TestPlanModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestPlanModel getTestPlanById(String id) throws ApiException {
    return getTestPlanByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestPlan by Id
   *   Use case    User sets test plan identifier    User runs method execution    System search  test plan by the identifier    System returns test plan
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;TestPlanModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestPlanModel> getTestPlanByIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestPlanById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestPlanModel> localVarReturnType = new GenericType<TestPlanModel>() {};
    return apiClient.invokeAPI("TestPlansApi.getTestPlanById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestSuites Tree By Id
   *   Use case    User sets test plan identifier    User runs method execution    System finds test suites related to the test plan    System returns test suites as a tree model (listed in response example)
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return List&lt;TestSuiteHierarchyApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestSuiteHierarchyApiResult> getTestSuitesById(String id) throws ApiException {
    return getTestSuitesByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestSuites Tree By Id
   *   Use case    User sets test plan identifier    User runs method execution    System finds test suites related to the test plan    System returns test suites as a tree model (listed in response example)
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;List&lt;TestSuiteHierarchyApiResult&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestRun with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestSuiteHierarchyApiResult>> getTestSuitesByIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestSuitesById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/testSuites"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestSuiteHierarchyApiResult>> localVarReturnType = new GenericType<List<TestSuiteHierarchyApiResult>>() {};
    return apiClient.invokeAPI("TestPlansApi.getTestSuitesById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Pause TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System pauses the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Execute status from New to Paused forbidden    Execute status from Paused to Paused forbidden    Execute status from Completed to Paused forbidden </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void pause(String id) throws ApiException {
    pauseWithHttpInfo(id);
  }

  /**
   * Pause TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System pauses the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Execute status from New to Paused forbidden    Execute status from Paused to Paused forbidden    Execute status from Completed to Paused forbidden </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> pauseWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pause");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/pause"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.pause", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Permanently delete test plan from archive
   * 
   * @param id Unique or global ID of the test plan (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void purgeTestPlan(String id) throws ApiException {
    purgeTestPlanWithHttpInfo(id);
  }

  /**
   * Permanently delete test plan from archive
   * 
   * @param id Unique or global ID of the test plan (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> purgeTestPlanWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling purgeTestPlan");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/purge"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.purgeTestPlan", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System restores test plan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void restoreTestPlan(String id) throws ApiException {
    restoreTestPlanWithHttpInfo(id);
  }

  /**
   * Restore TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System restores test plan    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> restoreTestPlanWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling restoreTestPlan");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/restore"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.restoreTestPlan", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Start TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System starts the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void start(String id) throws ApiException {
    startWithHttpInfo(id);
  }

  /**
   * Start TestPlan
   *   Use case    User sets test plan identifier    User runs method execution    System starts the test plan and updates test plan status    System returns no content response
   * @param id Test plan internal (guid format) or global (int  format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> startWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling start");
    }

    // Path parameters
    String localVarPath = "/api/v2/testPlans/{id}/start"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.start", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update TestPlan
   *   Use case    User sets test plan properties(listed in request example)    User runs method execution    System updates test plan    System returns no content response
   * @param updateTestPlanApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Tags must be no more than 10!    StartDate can&#39;t be more than EndDate! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> TestPlan with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t change ProjectId </td><td>  -  </td></tr>
     </table>
   */
  public void updateTestPlan(UpdateTestPlanApiModel updateTestPlanApiModel) throws ApiException {
    updateTestPlanWithHttpInfo(updateTestPlanApiModel);
  }

  /**
   * Update TestPlan
   *   Use case    User sets test plan properties(listed in request example)    User runs method execution    System updates test plan    System returns no content response
   * @param updateTestPlanApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Field is required    Tags must be no more than 10!    StartDate can&#39;t be more than EndDate! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestPlan with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> TestPlan with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t change ProjectId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateTestPlanWithHttpInfo(UpdateTestPlanApiModel updateTestPlanApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestPlansApi.updateTestPlan", "/api/v2/testPlans", "PUT", new ArrayList<>(), updateTestPlanApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
