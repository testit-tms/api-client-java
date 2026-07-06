package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.CreateProjectFailureCategoryApiModel;
import ru.testit.client.model.FailureCategoryGroupSearchApiModel;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectDetailedFailureCategoryApiResult;
import ru.testit.client.model.ProjectFailureCategoryGroupItemApiResultReply;
import java.util.UUID;
import ru.testit.client.model.UpdateFailureCategoryProjectApiModel;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProjectFailureCategoriesApi {
  private ApiClient apiClient;

  public ProjectFailureCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectFailureCategoriesApi(ApiClient apiClient) {
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
   * Get failure categories with support for filtering, sorting and grouping
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param failureCategoryGroupSearchApiModel  (optional)
   * @return ProjectFailureCategoryGroupItemApiResultReply
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
  public ProjectFailureCategoryGroupItemApiResultReply apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost(String projectId, FailureCategoryGroupSearchApiModel failureCategoryGroupSearchApiModel) throws ApiException {
    return apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPostWithHttpInfo(projectId, failureCategoryGroupSearchApiModel).getData();
  }

  /**
   * Get failure categories with support for filtering, sorting and grouping
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param failureCategoryGroupSearchApiModel  (optional)
   * @return ApiResponse&lt;ProjectFailureCategoryGroupItemApiResultReply&gt;
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
  public ApiResponse<ProjectFailureCategoryGroupItemApiResultReply> apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPostWithHttpInfo(String projectId, FailureCategoryGroupSearchApiModel failureCategoryGroupSearchApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/autotests/failure-categories/grouping-search"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<ProjectFailureCategoryGroupItemApiResultReply> localVarReturnType = new GenericType<ProjectFailureCategoryGroupItemApiResultReply>() {};
    return apiClient.invokeAPI("ProjectFailureCategoriesApi.apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost", localVarPath, "POST", new ArrayList<>(), failureCategoryGroupSearchApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public void apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete(String projectId, UUID id) throws ApiException {
    apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDeleteWithHttpInfo(projectId, id);
  }

  /**
   * Delete failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<Void> apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDeleteWithHttpInfo(String projectId, UUID id) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete");
    }
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/autotests/failure-categories/{id}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    return apiClient.invokeAPI("ProjectFailureCategoriesApi.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get failure category by ID
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param id  (required)
   * @return ProjectDetailedFailureCategoryApiResult
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
  public ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet(String projectId, UUID id) throws ApiException {
    return apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGetWithHttpInfo(projectId, id).getData();
  }

  /**
   * Get failure category by ID
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param id  (required)
   * @return ApiResponse&lt;ProjectDetailedFailureCategoryApiResult&gt;
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
  public ApiResponse<ProjectDetailedFailureCategoryApiResult> apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGetWithHttpInfo(String projectId, UUID id) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet");
    }
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/autotests/failure-categories/{id}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<ProjectDetailedFailureCategoryApiResult> localVarReturnType = new GenericType<ProjectDetailedFailureCategoryApiResult>() {};
    return apiClient.invokeAPI("ProjectFailureCategoriesApi.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param createProjectFailureCategoryApiModel  (optional)
   * @return ProjectDetailedFailureCategoryApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesPost(String projectId, CreateProjectFailureCategoryApiModel createProjectFailureCategoryApiModel) throws ApiException {
    return apiV2ProjectsProjectIdAutotestsFailureCategoriesPostWithHttpInfo(projectId, createProjectFailureCategoryApiModel).getData();
  }

  /**
   * Create failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param createProjectFailureCategoryApiModel  (optional)
   * @return ApiResponse&lt;ProjectDetailedFailureCategoryApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<ProjectDetailedFailureCategoryApiResult> apiV2ProjectsProjectIdAutotestsFailureCategoriesPostWithHttpInfo(String projectId, CreateProjectFailureCategoryApiModel createProjectFailureCategoryApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/autotests/failure-categories"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<ProjectDetailedFailureCategoryApiResult> localVarReturnType = new GenericType<ProjectDetailedFailureCategoryApiResult>() {};
    return apiClient.invokeAPI("ProjectFailureCategoriesApi.apiV2ProjectsProjectIdAutotestsFailureCategoriesPost", localVarPath, "POST", new ArrayList<>(), createProjectFailureCategoryApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param updateFailureCategoryProjectApiModel  (optional)
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
  public void apiV2ProjectsProjectIdAutotestsFailureCategoriesPut(String projectId, UpdateFailureCategoryProjectApiModel updateFailureCategoryProjectApiModel) throws ApiException {
    apiV2ProjectsProjectIdAutotestsFailureCategoriesPutWithHttpInfo(projectId, updateFailureCategoryProjectApiModel);
  }

  /**
   * Update failure category
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param updateFailureCategoryProjectApiModel  (optional)
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
  public ApiResponse<Void> apiV2ProjectsProjectIdAutotestsFailureCategoriesPutWithHttpInfo(String projectId, UpdateFailureCategoryProjectApiModel updateFailureCategoryProjectApiModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAutotestsFailureCategoriesPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/autotests/failure-categories"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    return apiClient.invokeAPI("ProjectFailureCategoriesApi.apiV2ProjectsProjectIdAutotestsFailureCategoriesPut", localVarPath, "PUT", new ArrayList<>(), updateFailureCategoryProjectApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
