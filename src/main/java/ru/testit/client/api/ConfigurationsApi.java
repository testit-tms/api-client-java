package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2ConfigurationsCreateByParametersPostRequest;
import ru.testit.client.model.ApiV2ConfigurationsPurgeBulkPostRequest;
import ru.testit.client.model.ApiV2ConfigurationsPutRequest;
import ru.testit.client.model.ApiV2ConfigurationsSearchPostRequest;
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.CreateConfigurationRequest;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
   * @param apiV2ConfigurationsCreateByParametersPostRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsCreateByParametersPost(ApiV2ConfigurationsCreateByParametersPostRequest apiV2ConfigurationsCreateByParametersPostRequest) throws ApiException {
    apiV2ConfigurationsCreateByParametersPostWithHttpInfo(apiV2ConfigurationsCreateByParametersPostRequest);
  }

  /**
   * Create Configurations by parameters
   * &lt;br&gt;Use case  &lt;br&gt;User sets request model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configurations  &lt;br&gt;System returns created configuration ids (listed in the response example)
   * @param apiV2ConfigurationsCreateByParametersPostRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsCreateByParametersPostWithHttpInfo(ApiV2ConfigurationsCreateByParametersPostRequest apiV2ConfigurationsCreateByParametersPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsCreateByParametersPost", "/api/v2/configurations/createByParameters", "POST", new ArrayList<>(), apiV2ConfigurationsCreateByParametersPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete multiple configurations
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2ConfigurationsDeleteBulkPost(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    return apiV2ConfigurationsDeleteBulkPostWithHttpInfo(apiV2ConfigurationsPurgeBulkPostRequest).getData();
  }

  /**
   * Delete multiple configurations
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2ConfigurationsDeleteBulkPostWithHttpInfo(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsDeleteBulkPost", "/api/v2/configurations/delete/bulk", "POST", new ArrayList<>(), apiV2ConfigurationsPurgeBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete configuration
   * 
   * @param id Unique or global ID of the configuration (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for configurations is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsIdDelete(String id) throws ApiException {
    apiV2ConfigurationsIdDeleteWithHttpInfo(id);
  }

  /**
   * Delete configuration
   * 
   * @param id Unique or global ID of the configuration (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for configurations is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsIdDeleteWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ConfigurationsIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/configurations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Patch configuration
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique ID of the configuration (required)
   * @param operation  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2ConfigurationsIdPatchWithHttpInfo(id, operation);
  }

  /**
   * Patch configuration
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique ID of the configuration (required)
   * @param operation  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ConfigurationsIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/configurations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Permanently delete configuration from archive
   * 
   * @param id Unique or global ID of the configuration (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsIdPurgePost(String id) throws ApiException {
    apiV2ConfigurationsIdPurgePostWithHttpInfo(id);
  }

  /**
   * Permanently delete configuration from archive
   * 
   * @param id Unique or global ID of the configuration (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsIdPurgePostWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ConfigurationsIdPurgePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/configurations/{id}/purge"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsIdPurgePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore configuration from the archive
   * 
   * @param id Unique or global ID of the configuration (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsIdRestorePost(String id) throws ApiException {
    apiV2ConfigurationsIdRestorePostWithHttpInfo(id);
  }

  /**
   * Restore configuration from the archive
   * 
   * @param id Unique or global ID of the configuration (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for archive is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsIdRestorePostWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ConfigurationsIdRestorePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/configurations/{id}/restore"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsIdRestorePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Permanently delete multiple archived configurations
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsPurgeBulkPost(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    apiV2ConfigurationsPurgeBulkPostWithHttpInfo(apiV2ConfigurationsPurgeBulkPostRequest);
  }

  /**
   * Permanently delete multiple archived configurations
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsPurgeBulkPostWithHttpInfo(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsPurgeBulkPost", "/api/v2/configurations/purge/bulk", "POST", new ArrayList<>(), apiV2ConfigurationsPurgeBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Edit configuration
   * 
   * @param apiV2ConfigurationsPutRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for configurations is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ConfigurationsPut(ApiV2ConfigurationsPutRequest apiV2ConfigurationsPutRequest) throws ApiException {
    apiV2ConfigurationsPutWithHttpInfo(apiV2ConfigurationsPutRequest);
  }

  /**
   * Edit configuration
   * 
   * @param apiV2ConfigurationsPutRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for configurations is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ConfigurationsPutWithHttpInfo(ApiV2ConfigurationsPutRequest apiV2ConfigurationsPutRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsPut", "/api/v2/configurations", "PUT", new ArrayList<>(), apiV2ConfigurationsPutRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore multiple configurations from the archive
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @return Integer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Integer apiV2ConfigurationsRestoreBulkPost(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    return apiV2ConfigurationsRestoreBulkPostWithHttpInfo(apiV2ConfigurationsPurgeBulkPostRequest).getData();
  }

  /**
   * Restore multiple configurations from the archive
   * 
   * @param apiV2ConfigurationsPurgeBulkPostRequest  (optional)
   * @return ApiResponse&lt;Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Integer> apiV2ConfigurationsRestoreBulkPostWithHttpInfo(ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsRestoreBulkPost", "/api/v2/configurations/restore/bulk", "POST", new ArrayList<>(), apiV2ConfigurationsPurgeBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
   * @param apiV2ConfigurationsSearchPostRequest Model containing all the filters (optional)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ConfigurationModel> apiV2ConfigurationsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ConfigurationsSearchPostRequest apiV2ConfigurationsSearchPostRequest) throws ApiException {
    return apiV2ConfigurationsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2ConfigurationsSearchPostRequest).getData();
  }

  /**
   * Search for configurations
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ConfigurationsSearchPostRequest Model containing all the filters (optional)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> apiV2ConfigurationsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ConfigurationsSearchPostRequest apiV2ConfigurationsSearchPostRequest) throws ApiException {
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
    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};
    return apiClient.invokeAPI("ConfigurationsApi.apiV2ConfigurationsSearchPost", "/api/v2/configurations/search", "POST", localVarQueryParams, apiV2ConfigurationsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)
   * @param createConfigurationRequest  (optional)
   * @return ConfigurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find project </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
     </table>
   */
  public ConfigurationModel createConfiguration(CreateConfigurationRequest createConfigurationRequest) throws ApiException {
    return createConfigurationWithHttpInfo(createConfigurationRequest).getData();
  }

  /**
   * Create Configuration
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)
   * @param createConfigurationRequest  (optional)
   * @return ApiResponse&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find project </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Configuration with the same name already exists! </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConfigurationModel> createConfigurationWithHttpInfo(CreateConfigurationRequest createConfigurationRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<ConfigurationModel> localVarReturnType = new GenericType<ConfigurationModel>() {};
    return apiClient.invokeAPI("ConfigurationsApi.createConfiguration", "/api/v2/configurations", "POST", new ArrayList<>(), createConfigurationRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get configuration by internal or global ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets configuration internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search configuration using the identifier  &lt;br&gt;System returns configuration
   * @param id Configuration internal (guid format) or global (integer format) identifier (required)
   * @return ConfigurationModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
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
   * @param id Configuration internal (guid format) or global (integer format) identifier (required)
   * @return ApiResponse&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for configuration required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find configuration with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConfigurationModel> getConfigurationByIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationById");
    }

    // Path parameters
    String localVarPath = "/api/v2/configurations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<ConfigurationModel> localVarReturnType = new GenericType<ConfigurationModel>() {};
    return apiClient.invokeAPI("ConfigurationsApi.getConfigurationById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
