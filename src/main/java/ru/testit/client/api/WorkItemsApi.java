package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.IterationModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SharedStepReferenceModel;
import ru.testit.client.model.SharedStepReferenceSectionModel;
import ru.testit.client.model.SharedStepReferenceSectionsQueryFilterModel;
import ru.testit.client.model.SharedStepReferencesQueryFilterModel;
import ru.testit.client.model.TestResultChronologyModel;
import ru.testit.client.model.TestResultHistoryReportModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemChangeModel;
import ru.testit.client.model.WorkItemLikeModel;
import ru.testit.client.model.WorkItemModel;
import ru.testit.client.model.WorkItemMovePostModel;
import ru.testit.client.model.WorkItemPostModel;
import ru.testit.client.model.WorkItemPutModel;
import ru.testit.client.model.WorkItemShortModel;
import ru.testit.client.model.WorkItemVersionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemsApi {
  private ApiClient apiClient;

  public WorkItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkItemsApi(ApiClient apiClient) {
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
   * Transform CheckList to TestCase
   * &lt;br&gt;Use case  &lt;br&gt;User sets checklist identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System transform CheckList to TestCase
   * @param id  (required)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find CheckList with id </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel apiV2WorkItemsIdCheckListTransformToTestCasePost(UUID id) throws ApiException {
    return apiV2WorkItemsIdCheckListTransformToTestCasePostWithHttpInfo(id).getData();
  }

  /**
   * Transform CheckList to TestCase
   * &lt;br&gt;Use case  &lt;br&gt;User sets checklist identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System transform CheckList to TestCase
   * @param id  (required)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find CheckList with id </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> apiV2WorkItemsIdCheckListTransformToTestCasePostWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdCheckListTransformToTestCasePost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/checkList/transformTo/testCase"
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

    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdCheckListTransformToTestCasePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get change history of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return change history of WorkItem
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;WorkItemChangeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemChangeModel> apiV2WorkItemsIdHistoryGet(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2WorkItemsIdHistoryGetWithHttpInfo(id, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get change history of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return change history of WorkItem
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;WorkItemChangeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemChangeModel>> apiV2WorkItemsIdHistoryGetWithHttpInfo(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/history"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<WorkItemChangeModel>> localVarReturnType = new GenericType<List<WorkItemChangeModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdHistoryGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete like from WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System delete like from WorkItem
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsIdLikeDelete(UUID id) throws ApiException {
    apiV2WorkItemsIdLikeDeleteWithHttpInfo(id);
  }

  /**
   * Delete like from WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System delete like from WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsIdLikeDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikeDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/like"
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

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikeDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Set like to WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set like to WorkItem
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WorkItemsIdLikePost(UUID id) throws ApiException {
    apiV2WorkItemsIdLikePostWithHttpInfo(id);
  }

  /**
   * Set like to WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set like to WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WorkItemsIdLikePostWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikePost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/like"
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

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get likes count of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return likes count of WorkItem
   * @param id  (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2WorkItemsIdLikesCountGet(UUID id) throws ApiException {
    return apiV2WorkItemsIdLikesCountGetWithHttpInfo(id).getData();
  }

  /**
   * Get likes count of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return likes count of WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2WorkItemsIdLikesCountGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikesCountGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/likes/count"
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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikesCountGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get likes of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return likes of WorkItem
   * @param id  (required)
   * @return List&lt;WorkItemLikeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemLikeModel> apiV2WorkItemsIdLikesGet(UUID id) throws ApiException {
    return apiV2WorkItemsIdLikesGetWithHttpInfo(id).getData();
  }

  /**
   * Get likes of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return likes of WorkItem
   * @param id  (required)
   * @return ApiResponse&lt;List&lt;WorkItemLikeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemLikeModel>> apiV2WorkItemsIdLikesGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdLikesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/likes"
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

    GenericType<List<WorkItemLikeModel>> localVarReturnType = new GenericType<List<WorkItemLikeModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdLikesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get test results history of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return test results history of WorkItem
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestResultHistoryReportModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultHistoryReportModel> apiV2WorkItemsIdTestResultsHistoryGet(UUID id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2WorkItemsIdTestResultsHistoryGetWithHttpInfo(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get test results history of WorkItem
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return test results history of WorkItem
   * @param id  (required)
   * @param from Take results from this date (optional)
   * @param to Take results until this date (optional)
   * @param configurationIds Identifiers of test result configurations (optional)
   * @param testPlanIds Identifiers of test plans which contain test results (optional)
   * @param userIds Identifiers of users who set test results (optional)
   * @param outcomes List of outcomes of test results (optional)
   * @param isAutomated OBSOLETE: Use &#x60;Automated&#x60; instead (optional)
   * @param automated If result must consist of only manual/automated test results (optional)
   * @param testRunIds Identifiers of test runs which contain test results (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestResultHistoryReportModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultHistoryReportModel>> apiV2WorkItemsIdTestResultsHistoryGetWithHttpInfo(UUID id, OffsetDateTime from, OffsetDateTime to, List<UUID> configurationIds, List<UUID> testPlanIds, List<UUID> userIds, List<String> outcomes, Boolean isAutomated, Boolean automated, List<UUID> testRunIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdTestResultsHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/testResults/history"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "configurationIds", configurationIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testPlanIds", testPlanIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "userIds", userIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "outcomes", outcomes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutomated", isAutomated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "automated", automated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "testRunIds", testRunIds));
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TestResultHistoryReportModel>> localVarReturnType = new GenericType<List<TestResultHistoryReportModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdTestResultsHistoryGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set WorkItem as actual
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set WorkItem as actual
   * @param id  (required)
   * @param versionId  (required)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel apiV2WorkItemsIdVersionVersionIdActualPost(UUID id, UUID versionId) throws ApiException {
    return apiV2WorkItemsIdVersionVersionIdActualPostWithHttpInfo(id, versionId).getData();
  }

  /**
   * Set WorkItem as actual
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set WorkItem as actual
   * @param id  (required)
   * @param versionId  (required)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> apiV2WorkItemsIdVersionVersionIdActualPostWithHttpInfo(UUID id, UUID versionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WorkItemsIdVersionVersionIdActualPost");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling apiV2WorkItemsIdVersionVersionIdActualPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/version/{versionId}/actual"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

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

    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsIdVersionVersionIdActualPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Move WorkItem to another section
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System move WorkItem to another section
   * @param workItemMovePostModel  (optional)
   * @return WorkItemShortModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemShortModel apiV2WorkItemsMovePost(WorkItemMovePostModel workItemMovePostModel) throws ApiException {
    return apiV2WorkItemsMovePostWithHttpInfo(workItemMovePostModel).getData();
  }

  /**
   * Move WorkItem to another section
   * &lt;br&gt;Use case  &lt;br&gt;User sets WorkItem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System move WorkItem to another section
   * @param workItemMovePostModel  (optional)
   * @return ApiResponse&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemShortModel> apiV2WorkItemsMovePostWithHttpInfo(WorkItemMovePostModel workItemMovePostModel) throws ApiException {
    Object localVarPostBody = workItemMovePostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/move";

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

    GenericType<WorkItemShortModel> localVarReturnType = new GenericType<WorkItemShortModel>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsMovePost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references in sections
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferenceSectionsQueryFilterModel  (optional)
   * @return List&lt;SharedStepReferenceSectionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   */
  public List<SharedStepReferenceSectionModel> apiV2WorkItemsSharedStepIdReferencesSectionsPost(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferenceSectionsQueryFilterModel sharedStepReferenceSectionsQueryFilterModel) throws ApiException {
    return apiV2WorkItemsSharedStepIdReferencesSectionsPostWithHttpInfo(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel).getData();
  }

  /**
   * Get SharedStep references in sections
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferenceSectionsQueryFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceSectionModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SharedStepReferenceSectionModel>> apiV2WorkItemsSharedStepIdReferencesSectionsPostWithHttpInfo(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferenceSectionsQueryFilterModel sharedStepReferenceSectionsQueryFilterModel) throws ApiException {
    Object localVarPostBody = sharedStepReferenceSectionsQueryFilterModel;
    
    // verify the required parameter 'sharedStepId' is set
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepIdReferencesSectionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{sharedStepId}/references/sections"
      .replaceAll("\\{" + "sharedStepId" + "\\}", apiClient.escapeString(sharedStepId.toString()));

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

    GenericType<List<SharedStepReferenceSectionModel>> localVarReturnType = new GenericType<List<SharedStepReferenceSectionModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepIdReferencesSectionsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references in workitems
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferencesQueryFilterModel  (optional)
   * @return List&lt;SharedStepReferenceModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   */
  public List<SharedStepReferenceModel> apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferencesQueryFilterModel sharedStepReferencesQueryFilterModel) throws ApiException {
    return apiV2WorkItemsSharedStepIdReferencesWorkItemsPostWithHttpInfo(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel).getData();
  }

  /**
   * Get SharedStep references in workitems
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param sharedStepReferencesQueryFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SharedStepReferenceModel>> apiV2WorkItemsSharedStepIdReferencesWorkItemsPostWithHttpInfo(UUID sharedStepId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SharedStepReferencesQueryFilterModel sharedStepReferencesQueryFilterModel) throws ApiException {
    Object localVarPostBody = sharedStepReferencesQueryFilterModel;
    
    // verify the required parameter 'sharedStepId' is set
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepIdReferencesWorkItemsPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{sharedStepId}/references/workItems"
      .replaceAll("\\{" + "sharedStepId" + "\\}", apiClient.escapeString(sharedStepId.toString()));

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

    GenericType<List<SharedStepReferenceModel>> localVarReturnType = new GenericType<List<SharedStepReferenceModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepIdReferencesWorkItemsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SharedStep references
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @return List&lt;SharedStepReferenceModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<SharedStepReferenceModel> apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(UUID sharedStepId) throws ApiException {
    return apiV2WorkItemsSharedStepsSharedStepIdReferencesGetWithHttpInfo(sharedStepId).getData();
  }

  /**
   * Get SharedStep references
   * &lt;br&gt;Use case  &lt;br&gt;User sets SharedStep identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System return SharedStep references
   * @param sharedStepId  (required)
   * @return ApiResponse&lt;List&lt;SharedStepReferenceModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find SharedStep with id </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<SharedStepReferenceModel>> apiV2WorkItemsSharedStepsSharedStepIdReferencesGetWithHttpInfo(UUID sharedStepId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sharedStepId' is set
    if (sharedStepId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedStepId' when calling apiV2WorkItemsSharedStepsSharedStepIdReferencesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/sharedSteps/{sharedStepId}/references"
      .replaceAll("\\{" + "sharedStepId" + "\\}", apiClient.escapeString(sharedStepId.toString()));

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

    GenericType<List<SharedStepReferenceModel>> localVarReturnType = new GenericType<List<SharedStepReferenceModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.apiV2WorkItemsSharedStepsSharedStepIdReferencesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Test Case, Checklist or Shared Step
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates workitem by identifier  &lt;br&gt;System returns workitem model (listed in response parameters)
   * @param workItemPostModel  (optional)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Priority is not a valid  &lt;br&gt;Tags must be set  &lt;br&gt;Duration should be a positive number  &lt;br&gt;Should be empty for CheckList  &lt;br&gt;Attribute value must be a valid guid for user scheme  &lt;br&gt;There is no option in ProjectAttributesScheme with such Id  &lt;br&gt;Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find section  &lt;br&gt;Can&#39;t find project  &lt;br&gt;Can&#39;t find attachmentIds  &lt;br&gt;Project not found  &lt;br&gt;Can&#39;t attributesScheme  &lt;br&gt;Can&#39;t attribute  &lt;br&gt;AutoTestIds not exist in project </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel createWorkItem(WorkItemPostModel workItemPostModel) throws ApiException {
    return createWorkItemWithHttpInfo(workItemPostModel).getData();
  }

  /**
   * Create Test Case, Checklist or Shared Step
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates workitem by identifier  &lt;br&gt;System returns workitem model (listed in response parameters)
   * @param workItemPostModel  (optional)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Priority is not a valid  &lt;br&gt;Tags must be set  &lt;br&gt;Duration should be a positive number  &lt;br&gt;Should be empty for CheckList  &lt;br&gt;Attribute value must be a valid guid for user scheme  &lt;br&gt;There is no option in ProjectAttributesScheme with such Id  &lt;br&gt;Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find section  &lt;br&gt;Can&#39;t find project  &lt;br&gt;Can&#39;t find attachmentIds  &lt;br&gt;Project not found  &lt;br&gt;Can&#39;t attributesScheme  &lt;br&gt;Can&#39;t attribute  &lt;br&gt;AutoTestIds not exist in project </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> createWorkItemWithHttpInfo(WorkItemPostModel workItemPostModel) throws ApiException {
    Object localVarPostBody = workItemPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems";

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

    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};

    return apiClient.invokeAPI("WorkItemsApi.createWorkItem", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete all links AutoTests from WorkItem by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search and delete all autotests, related to found workitem  &lt;br&gt;System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAllWorkItemsFromAutoTest(String id) throws ApiException {
    deleteAllWorkItemsFromAutoTestWithHttpInfo(id);
  }

  /**
   * Delete all links AutoTests from WorkItem by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search and delete all autotests, related to found workitem  &lt;br&gt;System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAllWorkItemsFromAutoTestWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAllWorkItemsFromAutoTest");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/autoTests"
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

    return apiClient.invokeAPI("WorkItemsApi.deleteAllWorkItemsFromAutoTest", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete Test Case, Checklist or Shared Step by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes workitem  &lt;br&gt;System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Could not delete Shared Step that has references </td><td>  -  </td></tr>
     </table>
   */
  public void deleteWorkItem(String id) throws ApiException {
    deleteWorkItemWithHttpInfo(id);
  }

  /**
   * Delete Test Case, Checklist or Shared Step by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes workitem  &lt;br&gt;System returns no content response
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a WorkItem with id </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Could not delete Shared Step that has references </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWorkItemWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkItem");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}"
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

    return apiClient.invokeAPI("WorkItemsApi.deleteWorkItem", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all AutoTests linked to WorkItem by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search all autotests, related to found workitem  &lt;br&gt;System returns list of found autotests
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return List&lt;AutoTestModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestModel> getAutoTestsForWorkItem(String id) throws ApiException {
    return getAutoTestsForWorkItemWithHttpInfo(id).getData();
  }

  /**
   * Get all AutoTests linked to WorkItem by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search all autotests, related to found workitem  &lt;br&gt;System returns list of found autotests
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;AutoTestModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestModel>> getAutoTestsForWorkItemWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestsForWorkItem");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/autoTests"
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

    GenericType<List<AutoTestModel>> localVarReturnType = new GenericType<List<AutoTestModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.getAutoTestsForWorkItem", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get iterations by workitem Id or GlobalId
   * 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return List&lt;IterationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public List<IterationModel> getIterations(String id, UUID versionId, Integer versionNumber) throws ApiException {
    return getIterationsWithHttpInfo(id, versionId, versionNumber).getData();
  }

  /**
   * Get iterations by workitem Id or GlobalId
   * 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return ApiResponse&lt;List&lt;IterationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<IterationModel>> getIterationsWithHttpInfo(String id, UUID versionId, Integer versionNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getIterations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/iterations"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<IterationModel>> localVarReturnType = new GenericType<List<IterationModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.getIterations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Test Case, Checklist or Shared Step by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;[Optional] User sets workitem version number  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;[Optional] if User sets workitem version identifier, system search workitem version by identifier.  &lt;br&gt;[Optional] if user sets workitem version number, system search workitem version by number  &lt;br&gt;Otherwise, system search last workitem version  &lt;br&gt;System returns workitem 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier\&quot; (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return WorkItemModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public WorkItemModel getWorkItemById(String id, UUID versionId, Integer versionNumber) throws ApiException {
    return getWorkItemByIdWithHttpInfo(id, versionId, versionNumber).getData();
  }

  /**
   * Get Test Case, Checklist or Shared Step by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;[Optional] User sets workitem version number  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;[Optional] if User sets workitem version identifier, system search workitem version by identifier.  &lt;br&gt;[Optional] if user sets workitem version number, system search workitem version by number  &lt;br&gt;Otherwise, system search last workitem version  &lt;br&gt;System returns workitem 
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param versionId WorkItem version (guid format) identifier\&quot; (optional)
   * @param versionNumber WorkItem version number (0 is the last version)\&quot; (optional)
   * @return ApiResponse&lt;WorkItemModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find workItem with id </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkItemModel> getWorkItemByIdWithHttpInfo(String id, UUID versionId, Integer versionNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", versionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<WorkItemModel> localVarReturnType = new GenericType<WorkItemModel>() {};

    return apiClient.invokeAPI("WorkItemsApi.getWorkItemById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItem chronology by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search test results of all autotests, related to found workitem  &lt;br&gt;System sort results by CompletedOn ascending, then by CreatedDate ascending  &lt;br&gt;System returns sorted collection of test results
   * @param id  (required)
   * @return List&lt;TestResultChronologyModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid workItemId </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultChronologyModel> getWorkItemChronology(String id) throws ApiException {
    return getWorkItemChronologyWithHttpInfo(id).getData();
  }

  /**
   * Get WorkItem chronology by Id or GlobalId
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search test results of all autotests, related to found workitem  &lt;br&gt;System sort results by CompletedOn ascending, then by CreatedDate ascending  &lt;br&gt;System returns sorted collection of test results
   * @param id  (required)
   * @return ApiResponse&lt;List&lt;TestResultChronologyModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid workItemId </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultChronologyModel>> getWorkItemChronologyWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemChronology");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/chronology"
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

    GenericType<List<TestResultChronologyModel>> localVarReturnType = new GenericType<List<TestResultChronologyModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.getWorkItemChronology", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItem versions
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;                      [Optional] If User set workitem version identifier, System search workitem version by version identifier                      Otherwise, system search all version of workitem                    &lt;br&gt;System returns array of workitem version models (listed in response example)
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param workItemVersionId WorkItem version (guid format)  identifier\&quot; (optional)
   * @param versionNumber WorkItem version (integer format)  number\&quot; (optional)
   * @return List&lt;WorkItemVersionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemVersionModel> getWorkItemVersions(String id, UUID workItemVersionId, Integer versionNumber) throws ApiException {
    return getWorkItemVersionsWithHttpInfo(id, workItemVersionId, versionNumber).getData();
  }

  /**
   * Get WorkItem versions
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;                      [Optional] If User set workitem version identifier, System search workitem version by version identifier                      Otherwise, system search all version of workitem                    &lt;br&gt;System returns array of workitem version models (listed in response example)
   * @param id WorkItem internal (guid format) or  global(integer format) identifier\&quot; (required)
   * @param workItemVersionId WorkItem version (guid format)  identifier\&quot; (optional)
   * @param versionNumber WorkItem version (integer format)  number\&quot; (optional)
   * @return ApiResponse&lt;List&lt;WorkItemVersionModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find WorkItem with workItemId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemVersionModel>> getWorkItemVersionsWithHttpInfo(String id, UUID workItemVersionId, Integer versionNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemVersions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems/{id}/versions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workItemVersionId", workItemVersionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionNumber", versionNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<WorkItemVersionModel>> localVarReturnType = new GenericType<List<WorkItemVersionModel>>() {};

    return apiClient.invokeAPI("WorkItemsApi.getWorkItemVersions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Test Case, Checklist or Shared Step
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates workitem by identifier  &lt;br&gt;System returns updated workitem model (listed in response parameters)
   * @param workItemPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;WorkItem not found  &lt;br&gt;Can&#39;t find section  &lt;br&gt;Can&#39;t attributesScheme  &lt;br&gt;Can&#39;t attribute  &lt;br&gt;AutoTestIds not exist in project </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Priority is not a valid  &lt;br&gt;duration should be a positive number  &lt;br&gt;should be empty for CheckList  &lt;br&gt;There is no option in ProjectAttributesScheme with such Id  &lt;br&gt;Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
     </table>
   */
  public void updateWorkItem(WorkItemPutModel workItemPutModel) throws ApiException {
    updateWorkItemWithHttpInfo(workItemPutModel);
  }

  /**
   * Update Test Case, Checklist or Shared Step
   * &lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates workitem by identifier  &lt;br&gt;System returns updated workitem model (listed in response parameters)
   * @param workItemPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;WorkItem not found  &lt;br&gt;Can&#39;t find section  &lt;br&gt;Can&#39;t attributesScheme  &lt;br&gt;Can&#39;t attribute  &lt;br&gt;AutoTestIds not exist in project </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Priority is not a valid  &lt;br&gt;duration should be a positive number  &lt;br&gt;should be empty for CheckList  &lt;br&gt;There is no option in ProjectAttributesScheme with such Id  &lt;br&gt;Attribute value must be a valid guid for options scheme </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateWorkItemWithHttpInfo(WorkItemPutModel workItemPutModel) throws ApiException {
    Object localVarPostBody = workItemPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/workItems";

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

    return apiClient.invokeAPI("WorkItemsApi.updateWorkItem", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
