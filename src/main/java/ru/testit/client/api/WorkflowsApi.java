package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.CreateWorkflowApiModel;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SearchWorkflowProjectsApiModel;
import ru.testit.client.model.SearchWorkflowsApiModel;
import java.util.UUID;
import ru.testit.client.model.UpdateWorkflowApiModel;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkflowApiResult;
import ru.testit.client.model.WorkflowExistsByNameApiResult;
import ru.testit.client.model.WorkflowProjectApiResultReply;
import ru.testit.client.model.WorkflowShortApiResultReply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WorkflowsApi {
  private ApiClient apiClient;

  public WorkflowsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowsApi(ApiClient apiClient) {
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
  public void apiV2WorkflowsIdDelete(UUID id) throws ApiException {
    apiV2WorkflowsIdDeleteWithHttpInfo(id);
  }

  /**
   * 
   * 
   * @param id  (required)
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
  public ApiResponse<Void> apiV2WorkflowsIdDeleteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkflowsIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @return WorkflowApiResult
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
  public WorkflowApiResult apiV2WorkflowsIdGet(UUID id) throws ApiException {
    return apiV2WorkflowsIdGetWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return ApiResponse&lt;WorkflowApiResult&gt;
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
  public ApiResponse<WorkflowApiResult> apiV2WorkflowsIdGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkflowsIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json", "text/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkflowApiResult> localVarReturnType = new GenericType<WorkflowApiResult>() {};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id  (required)
   * @param operation  (optional)
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
  public void apiV2WorkflowsIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2WorkflowsIdPatchWithHttpInfo(id, operation);
  }

  /**
   * 
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id  (required)
   * @param operation  (optional)
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
  public ApiResponse<Void> apiV2WorkflowsIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkflowsIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json-patch+json", "application/json", "text/json", "application/*+json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param searchWorkflowProjectsApiModel  (optional)
   * @return WorkflowProjectApiResultReply
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
  public WorkflowProjectApiResultReply apiV2WorkflowsIdProjectsSearchPost(UUID id, SearchWorkflowProjectsApiModel searchWorkflowProjectsApiModel) throws ApiException {
    return apiV2WorkflowsIdProjectsSearchPostWithHttpInfo(id, searchWorkflowProjectsApiModel).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param searchWorkflowProjectsApiModel  (optional)
   * @return ApiResponse&lt;WorkflowProjectApiResultReply&gt;
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
  public ApiResponse<WorkflowProjectApiResultReply> apiV2WorkflowsIdProjectsSearchPostWithHttpInfo(UUID id, SearchWorkflowProjectsApiModel searchWorkflowProjectsApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkflowsIdProjectsSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/{id}/projects/search"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json", "text/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json-patch+json", "application/json", "text/json", "application/*+json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkflowProjectApiResultReply> localVarReturnType = new GenericType<WorkflowProjectApiResultReply>() {};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsIdProjectsSearchPost", localVarPath, "POST", new ArrayList<>(), searchWorkflowProjectsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param updateWorkflowApiModel  (optional)
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
  public void apiV2WorkflowsIdPut(UUID id, UpdateWorkflowApiModel updateWorkflowApiModel) throws ApiException {
    apiV2WorkflowsIdPutWithHttpInfo(id, updateWorkflowApiModel);
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param updateWorkflowApiModel  (optional)
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
  public ApiResponse<Void> apiV2WorkflowsIdPutWithHttpInfo(UUID id, UpdateWorkflowApiModel updateWorkflowApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkflowsIdPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json-patch+json", "application/json", "text/json", "application/*+json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsIdPut", localVarPath, "PUT", new ArrayList<>(), updateWorkflowApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param name  (required)
   * @return WorkflowExistsByNameApiResult
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
  public WorkflowExistsByNameApiResult apiV2WorkflowsNameNameExistsGet(String name) throws ApiException {
    return apiV2WorkflowsNameNameExistsGetWithHttpInfo(name).getData();
  }

  /**
   * 
   * 
   * @param name  (required)
   * @return ApiResponse&lt;WorkflowExistsByNameApiResult&gt;
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
  public ApiResponse<WorkflowExistsByNameApiResult> apiV2WorkflowsNameNameExistsGetWithHttpInfo(String name) throws ApiException {
    // Check required parameters
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2WorkflowsNameNameExistsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workflows/name/{name}/exists"
            .replaceAll("\\{name}", apiClient.escapeString(name.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json", "text/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkflowExistsByNameApiResult> localVarReturnType = new GenericType<WorkflowExistsByNameApiResult>() {};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsNameNameExistsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param createWorkflowApiModel  (optional)
   * @return WorkflowApiResult
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
  public WorkflowApiResult apiV2WorkflowsPost(CreateWorkflowApiModel createWorkflowApiModel) throws ApiException {
    return apiV2WorkflowsPostWithHttpInfo(createWorkflowApiModel).getData();
  }

  /**
   * 
   * 
   * @param createWorkflowApiModel  (optional)
   * @return ApiResponse&lt;WorkflowApiResult&gt;
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
  public ApiResponse<WorkflowApiResult> apiV2WorkflowsPostWithHttpInfo(CreateWorkflowApiModel createWorkflowApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json", "text/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json-patch+json", "application/json", "text/json", "application/*+json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkflowApiResult> localVarReturnType = new GenericType<WorkflowApiResult>() {};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsPost", "/api/v2/workflows", "POST", new ArrayList<>(), createWorkflowApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param searchWorkflowsApiModel  (optional)
   * @return WorkflowShortApiResultReply
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
  public WorkflowShortApiResultReply apiV2WorkflowsSearchPost(SearchWorkflowsApiModel searchWorkflowsApiModel) throws ApiException {
    return apiV2WorkflowsSearchPostWithHttpInfo(searchWorkflowsApiModel).getData();
  }

  /**
   * 
   * 
   * @param searchWorkflowsApiModel  (optional)
   * @return ApiResponse&lt;WorkflowShortApiResultReply&gt;
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
  public ApiResponse<WorkflowShortApiResultReply> apiV2WorkflowsSearchPostWithHttpInfo(SearchWorkflowsApiModel searchWorkflowsApiModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("text/plain", "application/json", "text/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json-patch+json", "application/json", "text/json", "application/*+json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkflowShortApiResultReply> localVarReturnType = new GenericType<WorkflowShortApiResultReply>() {};
    return apiClient.invokeAPI("WorkflowsApi.apiV2WorkflowsSearchPost", "/api/v2/workflows/search", "POST", new ArrayList<>(), searchWorkflowsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
