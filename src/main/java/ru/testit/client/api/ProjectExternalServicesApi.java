package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiExternalServiceCategory;
import ru.testit.client.model.EnableProjectExternalServiceApiModel;
import ru.testit.client.model.ExternalIssueApiResult;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectExternalServiceSettingsApiResult;
import ru.testit.client.model.ProjectExternalServicesApiResult;
import ru.testit.client.model.ReplaceProjectExternalServiceApiModel;
import ru.testit.client.model.SearchExternalIssuesApiModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProjectExternalServicesApi {
  private ApiClient apiClient;

  public ProjectExternalServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectExternalServicesApi(ApiClient apiClient) {
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
   * Disable an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
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
  public void apiV2ProjectsIdExternalServicesExternalServiceIdDelete(String id, UUID externalServiceId) throws ApiException {
    apiV2ProjectsIdExternalServicesExternalServiceIdDeleteWithHttpInfo(id, externalServiceId);
  }

  /**
   * Disable an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
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
  public ApiResponse<Void> apiV2ProjectsIdExternalServicesExternalServiceIdDeleteWithHttpInfo(String id, UUID externalServiceId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesExternalServiceIdDelete");
    }
    if (externalServiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalServiceId' when calling apiV2ProjectsIdExternalServicesExternalServiceIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services/{externalServiceId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{externalServiceId}", apiClient.escapeString(externalServiceId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesExternalServiceIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieves settings of an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @return ProjectExternalServiceSettingsApiResult
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
  public ProjectExternalServiceSettingsApiResult apiV2ProjectsIdExternalServicesExternalServiceIdGet(String id, UUID externalServiceId) throws ApiException {
    return apiV2ProjectsIdExternalServicesExternalServiceIdGetWithHttpInfo(id, externalServiceId).getData();
  }

  /**
   * Retrieves settings of an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @return ApiResponse&lt;ProjectExternalServiceSettingsApiResult&gt;
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
  public ApiResponse<ProjectExternalServiceSettingsApiResult> apiV2ProjectsIdExternalServicesExternalServiceIdGetWithHttpInfo(String id, UUID externalServiceId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesExternalServiceIdGet");
    }
    if (externalServiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalServiceId' when calling apiV2ProjectsIdExternalServicesExternalServiceIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services/{externalServiceId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{externalServiceId}", apiClient.escapeString(externalServiceId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<ProjectExternalServiceSettingsApiResult> localVarReturnType = new GenericType<ProjectExternalServiceSettingsApiResult>() {};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesExternalServiceIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Replaces one active external service with another
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @param replaceProjectExternalServiceApiModel  (optional)
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
  public void apiV2ProjectsIdExternalServicesExternalServiceIdPatch(String id, UUID externalServiceId, ReplaceProjectExternalServiceApiModel replaceProjectExternalServiceApiModel) throws ApiException {
    apiV2ProjectsIdExternalServicesExternalServiceIdPatchWithHttpInfo(id, externalServiceId, replaceProjectExternalServiceApiModel);
  }

  /**
   * Replaces one active external service with another
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @param replaceProjectExternalServiceApiModel  (optional)
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
  public ApiResponse<Void> apiV2ProjectsIdExternalServicesExternalServiceIdPatchWithHttpInfo(String id, UUID externalServiceId, ReplaceProjectExternalServiceApiModel replaceProjectExternalServiceApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesExternalServiceIdPatch");
    }
    if (externalServiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalServiceId' when calling apiV2ProjectsIdExternalServicesExternalServiceIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services/{externalServiceId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{externalServiceId}", apiClient.escapeString(externalServiceId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesExternalServiceIdPatch", localVarPath, "PATCH", new ArrayList<>(), replaceProjectExternalServiceApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Enable an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @param enableProjectExternalServiceApiModel  (optional)
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
  public void apiV2ProjectsIdExternalServicesExternalServiceIdPut(String id, UUID externalServiceId, EnableProjectExternalServiceApiModel enableProjectExternalServiceApiModel) throws ApiException {
    apiV2ProjectsIdExternalServicesExternalServiceIdPutWithHttpInfo(id, externalServiceId, enableProjectExternalServiceApiModel);
  }

  /**
   * Enable an external service
   * 
   * @param id Project ID (required)
   * @param externalServiceId External service ID (required)
   * @param enableProjectExternalServiceApiModel  (optional)
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
  public ApiResponse<Void> apiV2ProjectsIdExternalServicesExternalServiceIdPutWithHttpInfo(String id, UUID externalServiceId, EnableProjectExternalServiceApiModel enableProjectExternalServiceApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesExternalServiceIdPut");
    }
    if (externalServiceId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalServiceId' when calling apiV2ProjectsIdExternalServicesExternalServiceIdPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services/{externalServiceId}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{externalServiceId}", apiClient.escapeString(externalServiceId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesExternalServiceIdPut", localVarPath, "PUT", new ArrayList<>(), enableProjectExternalServiceApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieves information about external services, including their integration status (enabled or not)
   * 
   * @param id Project ID (required)
   * @param category  (optional)
   * @return ProjectExternalServicesApiResult
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
  public ProjectExternalServicesApiResult apiV2ProjectsIdExternalServicesGet(String id, ApiExternalServiceCategory category) throws ApiException {
    return apiV2ProjectsIdExternalServicesGetWithHttpInfo(id, category).getData();
  }

  /**
   * Retrieves information about external services, including their integration status (enabled or not)
   * 
   * @param id Project ID (required)
   * @param category  (optional)
   * @return ApiResponse&lt;ProjectExternalServicesApiResult&gt;
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
  public ApiResponse<ProjectExternalServicesApiResult> apiV2ProjectsIdExternalServicesGetWithHttpInfo(String id, ApiExternalServiceCategory category) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "category", category)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<ProjectExternalServicesApiResult> localVarReturnType = new GenericType<ProjectExternalServicesApiResult>() {};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Searches for external issues using enabled external services in project
   * 
   * @param id Internal (UUID) or global (integer) identifier (required)
   * @param searchExternalIssuesApiModel  (optional)
   * @return List&lt;ExternalIssueApiResult&gt;
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
  public List<ExternalIssueApiResult> apiV2ProjectsIdExternalServicesIssuesSearchPost(String id, SearchExternalIssuesApiModel searchExternalIssuesApiModel) throws ApiException {
    return apiV2ProjectsIdExternalServicesIssuesSearchPostWithHttpInfo(id, searchExternalIssuesApiModel).getData();
  }

  /**
   * Searches for external issues using enabled external services in project
   * 
   * @param id Internal (UUID) or global (integer) identifier (required)
   * @param searchExternalIssuesApiModel  (optional)
   * @return ApiResponse&lt;List&lt;ExternalIssueApiResult&gt;&gt;
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
  public ApiResponse<List<ExternalIssueApiResult>> apiV2ProjectsIdExternalServicesIssuesSearchPostWithHttpInfo(String id, SearchExternalIssuesApiModel searchExternalIssuesApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdExternalServicesIssuesSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/external-services/issues/search"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<List<ExternalIssueApiResult>> localVarReturnType = new GenericType<List<ExternalIssueApiResult>>() {};
    return apiClient.invokeAPI("ProjectExternalServicesApi.apiV2ProjectsIdExternalServicesIssuesSearchPost", localVarPath, "POST", new ArrayList<>(), searchExternalIssuesApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
