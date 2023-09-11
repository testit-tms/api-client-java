package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2WebhooksPostRequest;
import ru.testit.client.model.ApiV2WebhooksSearchPostRequest;
import ru.testit.client.model.ApiV2WebhooksTestPostRequest;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.RequestData;
import java.util.UUID;
import ru.testit.client.model.WebHookEventType;
import ru.testit.client.model.WebHookModel;
import ru.testit.client.model.WebhookVariablesType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * Get all webhooks
   * 
   * @param projectId Project unique ID (optional)
   * @return List&lt;WebHookModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for requested project is required </td><td>  -  </td></tr>
     </table>
   */
  public List<WebHookModel> apiV2WebhooksGet(UUID projectId) throws ApiException {
    return apiV2WebhooksGetWithHttpInfo(projectId).getData();
  }

  /**
   * Get all webhooks
   * 
   * @param projectId Project unique ID (optional)
   * @return ApiResponse&lt;List&lt;WebHookModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for requested project is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WebHookModel>> apiV2WebhooksGetWithHttpInfo(UUID projectId) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "projectId", projectId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WebHookModel>> localVarReturnType = new GenericType<List<WebHookModel>>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksGet", "/api/v2/webhooks", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2WebhooksIdDelete(UUID id) throws ApiException {
    apiV2WebhooksIdDeleteWithHttpInfo(id);
  }

  /**
   * Delete webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2WebhooksIdDeleteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WebhooksIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @return WebHookModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public WebHookModel apiV2WebhooksIdGet(UUID id) throws ApiException {
    return apiV2WebhooksIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @return ApiResponse&lt;WebHookModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebHookModel> apiV2WebhooksIdGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WebhooksIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WebHookModel> localVarReturnType = new GenericType<WebHookModel>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @param apiV2WebhooksPostRequest  (optional)
   * @return WebHookModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public WebHookModel apiV2WebhooksIdPut(UUID id, ApiV2WebhooksPostRequest apiV2WebhooksPostRequest) throws ApiException {
    return apiV2WebhooksIdPutWithHttpInfo(id, apiV2WebhooksPostRequest).getData();
  }

  /**
   * Edit webhook by ID
   * 
   * @param id Webhook unique ID (required)
   * @param apiV2WebhooksPostRequest  (optional)
   * @return ApiResponse&lt;WebHookModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebHookModel> apiV2WebhooksIdPutWithHttpInfo(UUID id, ApiV2WebhooksPostRequest apiV2WebhooksPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2WebhooksIdPut");
    }

    // Path parameters
    String localVarPath = "/api/v2/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WebHookModel> localVarReturnType = new GenericType<WebHookModel>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksIdPut", localVarPath, "PUT", new ArrayList<>(), apiV2WebhooksPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create webhook
   * 
   * @param apiV2WebhooksPostRequest  (optional)
   * @return WebHookModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public WebHookModel apiV2WebhooksPost(ApiV2WebhooksPostRequest apiV2WebhooksPostRequest) throws ApiException {
    return apiV2WebhooksPostWithHttpInfo(apiV2WebhooksPostRequest).getData();
  }

  /**
   * Create webhook
   * 
   * @param apiV2WebhooksPostRequest  (optional)
   * @return ApiResponse&lt;WebHookModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebHookModel> apiV2WebhooksPostWithHttpInfo(ApiV2WebhooksPostRequest apiV2WebhooksPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<WebHookModel> localVarReturnType = new GenericType<WebHookModel>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksPost", "/api/v2/webhooks", "POST", new ArrayList<>(), apiV2WebhooksPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for webhooks
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2WebhooksSearchPostRequest  (optional)
   * @return List&lt;WebHookModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested projects is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<WebHookModel> apiV2WebhooksSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2WebhooksSearchPostRequest apiV2WebhooksSearchPostRequest) throws ApiException {
    return apiV2WebhooksSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2WebhooksSearchPostRequest).getData();
  }

  /**
   * Search for webhooks
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2WebhooksSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;WebHookModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for all requested projects is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<WebHookModel>> apiV2WebhooksSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2WebhooksSearchPostRequest apiV2WebhooksSearchPostRequest) throws ApiException {
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
    GenericType<List<WebHookModel>> localVarReturnType = new GenericType<List<WebHookModel>>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksSearchPost", "/api/v2/webhooks/search", "POST", localVarQueryParams, apiV2WebhooksSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get special variables for webhook event type
   * 
   * @param eventType Webhook event type (optional)
   * @param variablesType  (optional, default to VariablesForUrl)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<String> apiV2WebhooksSpecialVariablesGet(WebHookEventType eventType, WebhookVariablesType variablesType) throws ApiException {
    return apiV2WebhooksSpecialVariablesGetWithHttpInfo(eventType, variablesType).getData();
  }

  /**
   * Get special variables for webhook event type
   * 
   * @param eventType Webhook event type (optional)
   * @param variablesType  (optional, default to VariablesForUrl)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> apiV2WebhooksSpecialVariablesGetWithHttpInfo(WebHookEventType eventType, WebhookVariablesType variablesType) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "eventType", eventType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variablesType", variablesType));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksSpecialVariablesGet", "/api/v2/webhooks/specialVariables", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Test webhook&#39;s url
   * 
   * @param apiV2WebhooksTestPostRequest  (optional)
   * @return RequestData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public RequestData apiV2WebhooksTestPost(ApiV2WebhooksTestPostRequest apiV2WebhooksTestPostRequest) throws ApiException {
    return apiV2WebhooksTestPostWithHttpInfo(apiV2WebhooksTestPostRequest).getData();
  }

  /**
   * Test webhook&#39;s url
   * 
   * @param apiV2WebhooksTestPostRequest  (optional)
   * @return ApiResponse&lt;RequestData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for webhooks is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RequestData> apiV2WebhooksTestPostWithHttpInfo(ApiV2WebhooksTestPostRequest apiV2WebhooksTestPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<RequestData> localVarReturnType = new GenericType<RequestData>() {};
    return apiClient.invokeAPI("WebhooksApi.apiV2WebhooksTestPost", "/api/v2/webhooks/test", "POST", new ArrayList<>(), apiV2WebhooksTestPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
