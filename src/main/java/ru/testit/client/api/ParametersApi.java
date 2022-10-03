package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ParameterGroupModel;
import ru.testit.client.model.ParameterModel;
import ru.testit.client.model.ParameterPostModel;
import ru.testit.client.model.ParameterPutModel;
import ru.testit.client.model.ProblemDetails;
import java.util.Set;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ParametersApi {
  private ApiClient apiClient;

  public ParametersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ParametersApi(ApiClient apiClient) {
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
   * Create multiple parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameters  &lt;br&gt;System returns list of parameter model (listed in the response example)
   * @param parameterPostModel  (optional)
   * @return List&lt;ParameterModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Parameter model is not valid </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<ParameterModel> apiV2ParametersBulkPost(List<ParameterPostModel> parameterPostModel) throws ApiException {
    return apiV2ParametersBulkPostWithHttpInfo(parameterPostModel).getData();
  }

  /**
   * Create multiple parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameters  &lt;br&gt;System returns list of parameter model (listed in the response example)
   * @param parameterPostModel  (optional)
   * @return ApiResponse&lt;List&lt;ParameterModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Parameter model is not valid </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ParameterModel>> apiV2ParametersBulkPostWithHttpInfo(List<ParameterPostModel> parameterPostModel) throws ApiException {
    Object localVarPostBody = parameterPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/bulk";

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

    GenericType<List<ParameterModel>> localVarReturnType = new GenericType<List<ParameterModel>>() {};

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersBulkPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update multiple parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates parameters
   * @param parameterPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Parameter model is not valid </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ParametersBulkPut(List<ParameterPutModel> parameterPutModel) throws ApiException {
    apiV2ParametersBulkPutWithHttpInfo(parameterPutModel);
  }

  /**
   * Update multiple parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates parameters
   * @param parameterPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Parameter model is not valid </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ParametersBulkPutWithHttpInfo(List<ParameterPutModel> parameterPutModel) throws ApiException {
    Object localVarPostBody = parameterPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/bulk";

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

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersBulkPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get parameters as group
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameters  &lt;br&gt;System returns parameters models as groups (listed in the response example)
   * @param isDeleted  (optional)
   * @param parameterKeyIds  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;ParameterGroupModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ParameterGroupModel> apiV2ParametersGroupsGet(Boolean isDeleted, Set<UUID> parameterKeyIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2ParametersGroupsGetWithHttpInfo(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get parameters as group
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameters  &lt;br&gt;System returns parameters models as groups (listed in the response example)
   * @param isDeleted  (optional)
   * @param parameterKeyIds  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;ParameterGroupModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ParameterGroupModel>> apiV2ParametersGroupsGetWithHttpInfo(Boolean isDeleted, Set<UUID> parameterKeyIds, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "parameterKeyIds", parameterKeyIds));
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

    GenericType<List<ParameterGroupModel>> localVarReturnType = new GenericType<List<ParameterGroupModel>>() {};

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersGroupsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Check existence parameter key in system
   * &lt;br&gt;Use case  &lt;br&gt;User sets name of parameter key  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter key  &lt;br&gt;System returns the flag for the existence of the parameter key in the system
   * @param name  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public Boolean apiV2ParametersKeyNameNameExistsGet(String name) throws ApiException {
    return apiV2ParametersKeyNameNameExistsGetWithHttpInfo(name).getData();
  }

  /**
   * Check existence parameter key in system
   * &lt;br&gt;Use case  &lt;br&gt;User sets name of parameter key  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter key  &lt;br&gt;System returns the flag for the existence of the parameter key in the system
   * @param name  (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> apiV2ParametersKeyNameNameExistsGetWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2ParametersKeyNameNameExistsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/key/name/{name}/exists"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersKeyNameNameExistsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all parameter key values
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter key (string format)  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter values using the key  &lt;br&gt;System returns parameter
   * @param key Parameter key (string format) (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public List<String> apiV2ParametersKeyValuesGet(String key) throws ApiException {
    return apiV2ParametersKeyValuesGetWithHttpInfo(key).getData();
  }

  /**
   * Get all parameter key values
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter key (string format)  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter values using the key  &lt;br&gt;System returns parameter
   * @param key Parameter key (string format) (required)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> apiV2ParametersKeyValuesGetWithHttpInfo(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling apiV2ParametersKeyValuesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/{key}/values"
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersKeyValuesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all parameter keys
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search all parameter keys  &lt;br&gt;System returns parameter keys
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public List<String> apiV2ParametersKeysGet() throws ApiException {
    return apiV2ParametersKeysGetWithHttpInfo().getData();
  }

  /**
   * Get all parameter keys
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search all parameter keys  &lt;br&gt;System returns parameter keys
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> apiV2ParametersKeysGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/keys";

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};

    return apiClient.invokeAPI("ParametersApi.apiV2ParametersKeysGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameter  &lt;br&gt;System returns parameter model
   * @param parameterPostModel  (optional)
   * @return ParameterModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ParameterModel createParameter(ParameterPostModel parameterPostModel) throws ApiException {
    return createParameterWithHttpInfo(parameterPostModel).getData();
  }

  /**
   * Create parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameter  &lt;br&gt;System returns parameter model
   * @param parameterPostModel  (optional)
   * @return ApiResponse&lt;ParameterModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParameterModel> createParameterWithHttpInfo(ParameterPostModel parameterPostModel) throws ApiException {
    Object localVarPostBody = parameterPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters";

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

    GenericType<ParameterModel> localVarReturnType = new GenericType<ParameterModel>() {};

    return apiClient.invokeAPI("ParametersApi.createParameter", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete parameter by name
   * Deletes parameter and all it&#39;s values
   * @param name Name of the parameter (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided name either is empty or contains only white spaces </td><td>  -  </td></tr>
     </table>
   */
  public void deleteByName(String name) throws ApiException {
    deleteByNameWithHttpInfo(name);
  }

  /**
   * Delete parameter by name
   * Deletes parameter and all it&#39;s values
   * @param name Name of the parameter (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Provided name either is empty or contains only white spaces </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteByNameWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteByName");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/name/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    return apiClient.invokeAPI("ParametersApi.deleteByName", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete parameters by parameter key identifier
   * Deletes parameter and all it&#39;s values by parameter key identifier
   * @param keyId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public void deleteByParameterKeyId(UUID keyId) throws ApiException {
    deleteByParameterKeyIdWithHttpInfo(keyId);
  }

  /**
   * Delete parameters by parameter key identifier
   * Deletes parameter and all it&#39;s values by parameter key identifier
   * @param keyId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteByParameterKeyIdWithHttpInfo(UUID keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteByParameterKeyId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/keyId/{keyId}"
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    return apiClient.invokeAPI("ParametersApi.deleteByParameterKeyId", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;System search and delete parameter  &lt;br&gt;System returns deleted parameter
   * @param id Parameter internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
     </table>
   */
  public void deleteParameter(UUID id) throws ApiException {
    deleteParameterWithHttpInfo(id);
  }

  /**
   * Delete parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;System search and delete parameter  &lt;br&gt;System returns deleted parameter
   * @param id Parameter internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Parameter is in use in iterations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteParameterWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteParameter");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/{id}"
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

    return apiClient.invokeAPI("ParametersApi.deleteParameter", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get all parameters
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted parameters  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all parameters  &lt;br&gt;System returns array of all found parameters(listed in response model)
   * @param isDeleted If result must consist of only actual/deleted parameters (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ParameterModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ParameterModel getAllParameters(Boolean isDeleted, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getAllParametersWithHttpInfo(isDeleted, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get all parameters
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted parameters  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all parameters  &lt;br&gt;System returns array of all found parameters(listed in response model)
   * @param isDeleted If result must consist of only actual/deleted parameters (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;ParameterModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParameterModel> getAllParametersWithHttpInfo(Boolean isDeleted, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
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

    GenericType<ParameterModel> localVarReturnType = new GenericType<ParameterModel>() {};

    return apiClient.invokeAPI("ParametersApi.getAllParameters", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get parameter by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter using the identifier  &lt;br&gt;System returns parameter
   * @param id Parameter internal (UUID) identifier (required)
   * @return ParameterModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parameter with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ParameterModel getParameterById(UUID id) throws ApiException {
    return getParameterByIdWithHttpInfo(id).getData();
  }

  /**
   * Get parameter by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter using the identifier  &lt;br&gt;System returns parameter
   * @param id Parameter internal (UUID) identifier (required)
   * @return ApiResponse&lt;ParameterModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parameter with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParameterModel> getParameterByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getParameterById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/{id}"
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

    GenericType<ParameterModel> localVarReturnType = new GenericType<ParameterModel>() {};

    return apiClient.invokeAPI("ParametersApi.getParameterById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param name  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public void obsoleteDeleteByName(String name) throws ApiException {
    obsoleteDeleteByNameWithHttpInfo(name);
  }

  /**
   * 
   * 
   * @param name  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> obsoleteDeleteByNameWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters/deleteByName";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("ParametersApi.obsoleteDeleteByName", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated parameter using updated properties  &lt;br&gt;System returns no content response
   * @param parameterPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parameter with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public void updateParameter(ParameterPutModel parameterPutModel) throws ApiException {
    updateParameterWithHttpInfo(parameterPutModel);
  }

  /**
   * Update parameter
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameter updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated parameter using updated properties  &lt;br&gt;System returns no content response
   * @param parameterPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parameter with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateParameterWithHttpInfo(ParameterPutModel parameterPutModel) throws ApiException {
    Object localVarPostBody = parameterPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/parameters";

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

    return apiClient.invokeAPI("ParametersApi.updateParameter", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
