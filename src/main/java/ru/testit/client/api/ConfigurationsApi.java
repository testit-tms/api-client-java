package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ConfigurationByParametersModel;
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.ConfigurationPostModel;
import ru.testit.client.model.ConfigurationPutModel;
import ru.testit.client.model.ConfigurationSelectModel;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationsApi {
  private ApiClient apiClient;

  public ConfigurationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConfigurationsApi(ApiClient apiClient) {
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
   * Create Configurations by parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets request model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configurations  &lt;br&gt;System returns created configuration ids (listed in the response example)
   * @param configurationByParametersModel  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ConfigurationsCreateByParametersPost(ConfigurationByParametersModel configurationByParametersModel) throws ApiException {
    return apiV2ConfigurationsCreateByParametersPostWithHttpInfo(configurationByParametersModel).getData();
  }

  /**
   * Create Configurations by parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets request model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configurations  &lt;br&gt;System returns created configuration ids (listed in the response example)
   * @param configurationByParametersModel  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ConfigurationsCreateByParametersPostWithHttpInfo(ConfigurationByParametersModel configurationByParametersModel) throws ApiException {
    Object localVarPostBody = configurationByParametersModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/configurations/createByParameters";

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

    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};

    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsCreateByParametersPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for configurations
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param configurationSelectModel Model containing all the filters (optional)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ConfigurationModel> apiV2ConfigurationsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ConfigurationSelectModel configurationSelectModel) throws ApiException {
    return apiV2ConfigurationsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, configurationSelectModel).getData();
  }

  /**
   * Search for configurations
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param configurationSelectModel Model containing all the filters (optional)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> apiV2ConfigurationsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ConfigurationSelectModel configurationSelectModel) throws ApiException {
    Object localVarPostBody = configurationSelectModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/configurations/search";

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

    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};

    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)
   * @param configurationPostModel  (optional)
   * @return ConfigurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find project </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
     </table>
   */
  public ConfigurationModel createConfiguration(ConfigurationPostModel configurationPostModel) throws ApiException {
    return createConfigurationWithHttpInfo(configurationPostModel).getData();
  }

  /**
   * Create Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)
   * @param configurationPostModel  (optional)
   * @return ApiResponse&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find project </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConfigurationModel> createConfigurationWithHttpInfo(ConfigurationPostModel configurationPostModel) throws ApiException {
    Object localVarPostBody = configurationPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/configurations";

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

    GenericType<ConfigurationModel> localVarReturnType = new GenericType<ConfigurationModel>() {};

    return apiClient.invokeAPI("ConfigurationsApi.createConfiguration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get configuration by internal or global ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search configuration using the identifier  &lt;br&gt;System returns configuration
   * @param id  (required)
   * @return ConfigurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find configuration with id </td><td>  -  </td></tr>
     </table>
   */
  public ConfigurationModel getConfigurationById(String id) throws ApiException {
    return getConfigurationByIdWithHttpInfo(id).getData();
  }

  /**
   * Get configuration by internal or global ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search configuration using the identifier  &lt;br&gt;System returns configuration
   * @param id  (required)
   * @return ApiResponse&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find configuration with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConfigurationModel> getConfigurationByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/configurations/{id}"
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

    GenericType<ConfigurationModel> localVarReturnType = new GenericType<ConfigurationModel>() {};

    return apiClient.invokeAPI("ConfigurationsApi.getConfigurationById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated configuration using updated properties  &lt;br&gt;System returns no content response
   * @param configurationPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Configuration with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t change projectId </td><td>  -  </td></tr>
     </table>
   */
  public void updateConfiguration(ConfigurationPutModel configurationPutModel) throws ApiException {
    updateConfigurationWithHttpInfo(configurationPutModel);
  }

  /**
   * Update Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated configuration using updated properties  &lt;br&gt;System returns no content response
   * @param configurationPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Configuration with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Can&#39;t change projectId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateConfigurationWithHttpInfo(ConfigurationPutModel configurationPutModel) throws ApiException {
    Object localVarPostBody = configurationPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/configurations";

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

    return apiClient.invokeAPI("ConfigurationsApi.updateConfiguration", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
