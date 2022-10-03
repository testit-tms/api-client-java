package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemCommentModel;
import ru.testit.client.model.WorkItemCommentPostModel;
import ru.testit.client.model.WorkItemCommentPutModel;

import java.util.ArrayList;
import java.util.HashMap;
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
   * @param commentId  (required)
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
   * @param commentId  (required)
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
    Object localVarPostBody = null;
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling apiV2WorkItemsCommentsCommentIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/comments/{commentId}"
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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

    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsCommentIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates comment   &lt;br&gt;System returns comment model (listed in response parameters)
   * @param workItemCommentPostModel  (optional)
   * @return WorkItemCommentModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemCommentModel apiV2WorkItemsCommentsPost(WorkItemCommentPostModel workItemCommentPostModel) throws ApiException {
    return apiV2WorkItemsCommentsPostWithHttpInfo(workItemCommentPostModel).getData();
  }

  /**
   * Create WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates comment   &lt;br&gt;System returns comment model (listed in response parameters)
   * @param workItemCommentPostModel  (optional)
   * @return ApiResponse&lt;WorkItemCommentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemCommentModel> apiV2WorkItemsCommentsPostWithHttpInfo(WorkItemCommentPostModel workItemCommentPostModel) throws ApiException {
    Object localVarPostBody = workItemCommentPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/comments";

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

    GenericType<WorkItemCommentModel> localVarReturnType = new GenericType<WorkItemCommentModel>() {};

    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates comment   &lt;br&gt;System returns success status code
   * @param workItemCommentPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System admin permission required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsCommentsPut(WorkItemCommentPutModel workItemCommentPutModel) throws ApiException {
    apiV2WorkItemsCommentsPutWithHttpInfo(workItemCommentPutModel);
  }

  /**
   * Update WorkItem comment
   * &lt;br&gt;Use case  &lt;br&gt;User sets comment properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates comment   &lt;br&gt;System returns success status code
   * @param workItemCommentPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System admin permission required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WorkItem is not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsCommentsPutWithHttpInfo(WorkItemCommentPutModel workItemCommentPutModel) throws ApiException {
    Object localVarPostBody = workItemCommentPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/comments";

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

    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsCommentsPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get WorkItem comments by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search comments by workitem identifier  &lt;br&gt;System returns comments 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return List&lt;WorkItemCommentModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemCommentModel> apiV2WorkItemsIdCommentsGet(String id) throws ApiException {
    return apiV2WorkItemsIdCommentsGetWithHttpInfo(id).getData();
  }

  /**
   * Get WorkItem comments by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search comments by workitem identifier  &lt;br&gt;System returns comments 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;WorkItemCommentModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemCommentModel>> apiV2WorkItemsIdCommentsGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdCommentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/comments"
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

    GenericType<List<WorkItemCommentModel>> localVarReturnType = new GenericType<List<WorkItemCommentModel>>() {};

    return apiClient.invokeAPI("WorkItemsCommentsApi.apiV2WorkItemsIdCommentsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
