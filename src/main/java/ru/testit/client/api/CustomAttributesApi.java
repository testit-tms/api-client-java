package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.CustomAttributeSearchQueryModel;
import ru.testit.client.model.GlobalCustomAttributePostModel;
import ru.testit.client.model.GlobalCustomAttributeUpdateModel;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributesApi {
  private ApiClient apiClient;

  public CustomAttributesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomAttributesApi(ApiClient apiClient) {
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
   * Delete global attribute
   * 
   * @param id Unique ID of attribute (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2CustomAttributesGlobalIdDelete(UUID id) throws ApiException {
    apiV2CustomAttributesGlobalIdDeleteWithHttpInfo(id);
  }

  /**
   * Delete global attribute
   * 
   * @param id Unique ID of attribute (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2CustomAttributesGlobalIdDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesGlobalIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/customAttributes/global/{id}"
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

    return apiClient.invokeAPI("CustomAttributesApi.apiV2CustomAttributesGlobalIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Edit global attribute
   * 
   * @param id Unique ID of attribute (required)
   * @param globalCustomAttributeUpdateModel  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel apiV2CustomAttributesGlobalIdPut(UUID id, GlobalCustomAttributeUpdateModel globalCustomAttributeUpdateModel) throws ApiException {
    return apiV2CustomAttributesGlobalIdPutWithHttpInfo(id, globalCustomAttributeUpdateModel).getData();
  }

  /**
   * Edit global attribute
   * 
   * @param id Unique ID of attribute (required)
   * @param globalCustomAttributeUpdateModel  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> apiV2CustomAttributesGlobalIdPutWithHttpInfo(UUID id, GlobalCustomAttributeUpdateModel globalCustomAttributeUpdateModel) throws ApiException {
    Object localVarPostBody = globalCustomAttributeUpdateModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesGlobalIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/customAttributes/global/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};

    return apiClient.invokeAPI("CustomAttributesApi.apiV2CustomAttributesGlobalIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create global attribute
   * 
   * @param globalCustomAttributePostModel  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel apiV2CustomAttributesGlobalPost(GlobalCustomAttributePostModel globalCustomAttributePostModel) throws ApiException {
    return apiV2CustomAttributesGlobalPostWithHttpInfo(globalCustomAttributePostModel).getData();
  }

  /**
   * Create global attribute
   * 
   * @param globalCustomAttributePostModel  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> apiV2CustomAttributesGlobalPostWithHttpInfo(GlobalCustomAttributePostModel globalCustomAttributePostModel) throws ApiException {
    Object localVarPostBody = globalCustomAttributePostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/customAttributes/global";

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

    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};

    return apiClient.invokeAPI("CustomAttributesApi.apiV2CustomAttributesGlobalPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get attribute
   * 
   * @param id Unique ID of attribute (required)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel apiV2CustomAttributesIdGet(UUID id) throws ApiException {
    return apiV2CustomAttributesIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get attribute
   * 
   * @param id Unique ID of attribute (required)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> apiV2CustomAttributesIdGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/customAttributes/{id}"
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

    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};

    return apiClient.invokeAPI("CustomAttributesApi.apiV2CustomAttributesIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for attributes
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param customAttributeSearchQueryModel  (optional)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> apiV2CustomAttributesSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, CustomAttributeSearchQueryModel customAttributeSearchQueryModel) throws ApiException {
    return apiV2CustomAttributesSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, customAttributeSearchQueryModel).getData();
  }

  /**
   * Search for attributes
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param customAttributeSearchQueryModel  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> apiV2CustomAttributesSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, CustomAttributeSearchQueryModel customAttributeSearchQueryModel) throws ApiException {
    Object localVarPostBody = customAttributeSearchQueryModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/customAttributes/search";

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

    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};

    return apiClient.invokeAPI("CustomAttributesApi.apiV2CustomAttributesSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
