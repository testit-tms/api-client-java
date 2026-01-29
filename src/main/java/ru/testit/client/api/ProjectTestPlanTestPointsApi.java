package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestPlanTestPointsAutoTestsRerunApiModel;
import ru.testit.client.model.TestPlanTestPointsAutoTestsRunApiModel;
import ru.testit.client.model.TestRunNameApiResult;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProjectTestPlanTestPointsApi {
  private ApiClient apiClient;

  public ProjectTestPlanTestPointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectTestPlanTestPointsApi(ApiClient apiClient) {
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
   * Rerun autotests.
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param testPlanId  (required)
   * @param testPlanTestPointsAutoTestsRerunApiModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public void apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost(String projectId, UUID testPlanId, TestPlanTestPointsAutoTestsRerunApiModel testPlanTestPointsAutoTestsRerunApiModel) throws ApiException {
    apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPostWithHttpInfo(projectId, testPlanId, testPlanTestPointsAutoTestsRerunApiModel);
  }

  /**
   * Rerun autotests.
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param testPlanId  (required)
   * @param testPlanTestPointsAutoTestsRerunApiModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<Void> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPostWithHttpInfo(String projectId, UUID testPlanId, TestPlanTestPointsAutoTestsRerunApiModel testPlanTestPointsAutoTestsRerunApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost");
    }
    if (testPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'testPlanId' when calling apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/rerun"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{testPlanId}", apiClient.escapeString(testPlanId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectTestPlanTestPointsApi.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost", localVarPath, "POST", new ArrayList<>(), testPlanTestPointsAutoTestsRerunApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Run autotests.
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param testPlanId  (required)
   * @param testPlanTestPointsAutoTestsRunApiModel  (optional)
   * @return TestRunNameApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public TestRunNameApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost(String projectId, UUID testPlanId, TestPlanTestPointsAutoTestsRunApiModel testPlanTestPointsAutoTestsRunApiModel) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPostWithHttpInfo(projectId, testPlanId, testPlanTestPointsAutoTestsRunApiModel).getData();
  }

  /**
   * Run autotests.
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param testPlanId  (required)
   * @param testPlanTestPointsAutoTestsRunApiModel  (optional)
   * @return ApiResponse&lt;TestRunNameApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<TestRunNameApiResult> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPostWithHttpInfo(String projectId, UUID testPlanId, TestPlanTestPointsAutoTestsRunApiModel testPlanTestPointsAutoTestsRunApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost");
    }
    if (testPlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'testPlanId' when calling apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/run"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{testPlanId}", apiClient.escapeString(testPlanId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestRunNameApiResult> localVarReturnType = new GenericType<TestRunNameApiResult>() {};
    return apiClient.invokeAPI("ProjectTestPlanTestPointsApi.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost", localVarPath, "POST", new ArrayList<>(), testPlanTestPointsAutoTestsRunApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
