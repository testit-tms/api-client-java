package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectTestPlansFilterModel;
import ru.testit.client.model.TestPlanSelectModel;
import ru.testit.client.model.TestPlanWithAnalyticModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProjectTestPlansApi {
  private ApiClient apiClient;

  public ProjectTestPlansApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectTestPlansApi(ApiClient apiClient) {
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
   * Get TestPlans analytics
   *  Use case  User sets project internal identifier  User sets query params  User runs method execution  System return analytics
   * @param projectId Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestPlanWithAnalyticModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public List<TestPlanWithAnalyticModel> apiV2ProjectsProjectIdTestPlansAnalyticsGet(UUID projectId, Boolean isDeleted, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansAnalyticsGetWithHttpInfo(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get TestPlans analytics
   *  Use case  User sets project internal identifier  User sets query params  User runs method execution  System return analytics
   * @param projectId Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestPlanWithAnalyticModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<List<TestPlanWithAnalyticModel>> apiV2ProjectsProjectIdTestPlansAnalyticsGetWithHttpInfo(UUID projectId, Boolean isDeleted, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansAnalyticsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/analytics"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansAnalyticsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete multiple test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> - Read permission for the project is required - Delete permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ProjectsProjectIdTestPlansDeleteBulkPost(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansDeleteBulkPostWithHttpInfo(projectId, testPlanSelectModel).getData();
  }

  /**
   * Delete multiple test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> - Read permission for the project is required - Delete permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ProjectsProjectIdTestPlansDeleteBulkPostWithHttpInfo(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansDeleteBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/delete/bulk"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansDeleteBulkPost", localVarPath, "POST", new ArrayList<>(), testPlanSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Checks if TestPlan exists with the specified name exists for the project
   *  Use case  User sets project internal or global identifier  User runs method execution  System purge delete project workitems
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param name TestPlan name to check (required)
   * @return Boolean
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
  public Boolean apiV2ProjectsProjectIdTestPlansNameExistsGet(UUID projectId, String name) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansNameExistsGetWithHttpInfo(projectId, name).getData();
  }

  /**
   * Checks if TestPlan exists with the specified name exists for the project
   *  Use case  User sets project internal or global identifier  User runs method execution  System purge delete project workitems
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param name TestPlan name to check (required)
   * @return ApiResponse&lt;Boolean&gt;
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
  public ApiResponse<Boolean> apiV2ProjectsProjectIdTestPlansNameExistsGetWithHttpInfo(UUID projectId, String name) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansNameExistsGet");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2ProjectsProjectIdTestPlansNameExistsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/{name}/exists"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{name}", apiClient.escapeString(name.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansNameExistsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Permanently delete multiple archived test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public void apiV2ProjectsProjectIdTestPlansPurgeBulkPost(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    apiV2ProjectsProjectIdTestPlansPurgeBulkPostWithHttpInfo(projectId, testPlanSelectModel);
  }

  /**
   * Permanently delete multiple archived test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<Void> apiV2ProjectsProjectIdTestPlansPurgeBulkPostWithHttpInfo(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansPurgeBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/purge/bulk"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansPurgeBulkPost", localVarPath, "POST", new ArrayList<>(), testPlanSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore multiple test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ProjectsProjectIdTestPlansRestoreBulkPost(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansRestoreBulkPostWithHttpInfo(projectId, testPlanSelectModel).getData();
  }

  /**
   * Restore multiple test plans
   * 
   * @param projectId Unique or global ID of the project (required)
   * @param testPlanSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ProjectsProjectIdTestPlansRestoreBulkPostWithHttpInfo(String projectId, TestPlanSelectModel testPlanSelectModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansRestoreBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/restore/bulk"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansRestoreBulkPost", localVarPath, "POST", new ArrayList<>(), testPlanSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Project TestPlans with analytics
   *  Use case  User sets project internal or global identifier  User sets request body  User runs method execution  System returns project testplans with analytics
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectTestPlansFilterModel  (optional)
   * @return List&lt;TestPlanWithAnalyticModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public List<TestPlanWithAnalyticModel> apiV2ProjectsProjectIdTestPlansSearchPost(String projectId, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectTestPlansFilterModel projectTestPlansFilterModel) throws ApiException {
    return apiV2ProjectsProjectIdTestPlansSearchPostWithHttpInfo(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, projectTestPlansFilterModel).getData();
  }

  /**
   * Get Project TestPlans with analytics
   *  Use case  User sets project internal or global identifier  User sets request body  User runs method execution  System returns project testplans with analytics
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectTestPlansFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;TestPlanWithAnalyticModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<List<TestPlanWithAnalyticModel>> apiV2ProjectsProjectIdTestPlansSearchPostWithHttpInfo(String projectId, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectTestPlansFilterModel projectTestPlansFilterModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdTestPlansSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/search"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};
    return apiClient.invokeAPI("ProjectTestPlansApi.apiV2ProjectsProjectIdTestPlansSearchPost", localVarPath, "POST", localVarQueryParams, projectTestPlansFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
