package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2WorkItemsCommentsPostRequest;
import ru.testit.client.model.ApiV2WorkItemsCommentsPutRequest;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemCommentModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemsCommentsApi {
  private ApiClient apiClient;

  public WorkItemsCommentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkItemsCommentsApi(ApiClient apiClient) {
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
   * Delete WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System delete comment   &lt;br&gt;System returns success status code
   * @param commentId Comment internal (guid format) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System admin permission required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsCommentsCommentIdDelete(UUID commentId) throws ApiException {
    apiV2WorkItemsCommentsCommentIdDeleteWithHttpInfo(commentId);
  }

  /**
   * Delete WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System delete comment   &lt;br&gt;System returns success status code
   * @param commentId Comment internal (guid format) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System admin permission required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsCommentsCommentIdDeleteWithHttpInfo(UUID commentId) throws ApiException {
    // Check required parameters
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling apiV2WorkItemsCommentsCommentIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/comments/{commentId}"
            .replaceAll("\\{commentId}", apiClient.escapeString(commentId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsCommentIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates comment   &lt;br&gt;System returns comment model (listed in response parameters)
   * @param apiV2WorkItemsCommentsPostRequest  (optional)
   * @return WorkItemCommentModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemCommentModel apiV2WorkItemsCommentsPost(ApiV2WorkItemsCommentsPostRequest apiV2WorkItemsCommentsPostRequest) throws ApiException {
    return apiV2WorkItemsCommentsPostWithHttpInfo(apiV2WorkItemsCommentsPostRequest).getData();
  }

  /**
   * Create WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates comment   &lt;br&gt;System returns comment model (listed in response parameters)
   * @param apiV2WorkItemsCommentsPostRequest  (optional)
   * @return ApiResponse&lt;WorkItemCommentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemCommentModel> apiV2WorkItemsCommentsPostWithHttpInfo(ApiV2WorkItemsCommentsPostRequest apiV2WorkItemsCommentsPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WorkItemCommentModel> localVarReturnType = new GenericType<WorkItemCommentModel>() {};
    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsPost", "/api/v2/workItems/comments", "POST", new ArrayList<>(), apiV2WorkItemsCommentsPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update work item comment
   * 
   * @param apiV2WorkItemsCommentsPutRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsCommentsPut(ApiV2WorkItemsCommentsPutRequest apiV2WorkItemsCommentsPutRequest) throws ApiException {
    apiV2WorkItemsCommentsPutWithHttpInfo(apiV2WorkItemsCommentsPutRequest);
  }

  /**
   * Update work item comment
   * 
   * @param apiV2WorkItemsCommentsPutRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsCommentsPutWithHttpInfo(ApiV2WorkItemsCommentsPutRequest apiV2WorkItemsCommentsPutRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsPut", "/api/v2/workItems/comments", "PUT", new ArrayList<>(), apiV2WorkItemsCommentsPutRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get work item comments
   * 
   * @param id Unique or global ID of the work item (required)
   * @return List&lt;WorkItemCommentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemCommentModel> apiV2WorkItemsIdCommentsGet(String id) throws ApiException {
    return apiV2WorkItemsIdCommentsGetWithHttpInfo(id).getData();
  }

  /**
   * Get work item comments
   * 
   * @param id Unique or global ID of the work item (required)
   * @return ApiResponse&lt;List&lt;WorkItemCommentModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemCommentModel>> apiV2WorkItemsIdCommentsGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdCommentsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/workItems/{id}/comments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemCommentModel>> localVarReturnType = new GenericType<List<WorkItemCommentModel>>() {};
    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsIdCommentsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
