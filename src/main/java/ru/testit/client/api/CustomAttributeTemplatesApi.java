package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2CustomAttributesTemplatesPostRequest;
import ru.testit.client.model.ApiV2CustomAttributesTemplatesPutRequest;
import ru.testit.client.model.ApiV2CustomAttributesTemplatesSearchPostRequest;
import ru.testit.client.model.CustomAttributeTemplateModel;
import ru.testit.client.model.NoContentResult;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SearchCustomAttributeTemplateGetModel;
import java.util.Set;
import java.util.UUID;
import ru.testit.client.model.ValidateAntiForgeryTokenAttribute;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomAttributeTemplatesApi {
  private ApiClient apiClient;

  public CustomAttributeTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomAttributeTemplatesApi(ApiClient apiClient) {
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
   * Exclude CustomAttributes from CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attributes from attributes tempalte
   * @param id Attribute template internal (UUID) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(UUID id, Set<UUID> UUID) throws ApiException {
    apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostWithHttpInfo(id, UUID);
  }

  /**
   * Exclude CustomAttributes from CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attributes from attributes tempalte
   * @param id Attribute template internal (UUID) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/customAttributes/templates/{id}/customAttributes/exclude"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Include CustomAttributes to CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System add attributes to attributes tempalte
   * @param id Attribute template internal (UUID) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(UUID id, Set<UUID> UUID) throws ApiException {
    apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostWithHttpInfo(id, UUID);
  }

  /**
   * Include CustomAttributes to CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System add attributes to attributes tempalte
   * @param id Attribute template internal (UUID) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/customAttributes/templates/{id}/customAttributes/include"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search and delete attribute template  &lt;br&gt;System returns no content response
   * @param id Attribute template internal (UUID) identifier (required)
   * @return NoContentResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public NoContentResult apiV2CustomAttributesTemplatesIdDelete(UUID id) throws ApiException {
    return apiV2CustomAttributesTemplatesIdDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search and delete attribute template  &lt;br&gt;System returns no content response
   * @param id Attribute template internal (UUID) identifier (required)
   * @return ApiResponse&lt;NoContentResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NoContentResult> apiV2CustomAttributesTemplatesIdDeleteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesTemplatesIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/customAttributes/templates/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<NoContentResult> localVarReturnType = new GenericType<NoContentResult>() {};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get CustomAttributeTemplate by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute template (listed in response example)
   * @param id CustomAttributeTemplate internal (UUID) identifier (required)
   * @return CustomAttributeTemplateModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a CustomAttributeTemplate with identifier </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeTemplateModel apiV2CustomAttributesTemplatesIdGet(UUID id) throws ApiException {
    return apiV2CustomAttributesTemplatesIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get CustomAttributeTemplate by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute template (listed in response example)
   * @param id CustomAttributeTemplate internal (UUID) identifier (required)
   * @return ApiResponse&lt;CustomAttributeTemplateModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a CustomAttributeTemplate with identifier </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeTemplateModel> apiV2CustomAttributesTemplatesIdGetWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2CustomAttributesTemplatesIdGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/customAttributes/templates/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeTemplateModel> localVarReturnType = new GenericType<CustomAttributeTemplateModel>() {};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesIdGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get CustomAttributeTemplate by name
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template name  &lt;br&gt;User runs method execution  &lt;br&gt;System search and return list of attribute templates (listed in response example)
   * @param name CustomAttributeTemplate name for search (required)
   * @return CustomAttributeTemplateModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeTemplateModel apiV2CustomAttributesTemplatesNameGet(String name) throws ApiException {
    return apiV2CustomAttributesTemplatesNameGetWithHttpInfo(name).getData();
  }

  /**
   * Get CustomAttributeTemplate by name
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template name  &lt;br&gt;User runs method execution  &lt;br&gt;System search and return list of attribute templates (listed in response example)
   * @param name CustomAttributeTemplate name for search (required)
   * @return ApiResponse&lt;CustomAttributeTemplateModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeTemplateModel> apiV2CustomAttributesTemplatesNameGetWithHttpInfo(String name) throws ApiException {
    // Check required parameters
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2CustomAttributesTemplatesNameGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/customAttributes/templates/{name}"
            .replaceAll("\\{name}", apiClient.escapeString(name));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeTemplateModel> localVarReturnType = new GenericType<CustomAttributeTemplateModel>() {};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesNameGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template parameters (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates attribute template  &lt;br&gt;System returns attribute template model (example listed in response parameters)
   * @param apiV2CustomAttributesTemplatesPostRequest  (optional)
   * @return CustomAttributeTemplateModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeTemplateModel apiV2CustomAttributesTemplatesPost(ApiV2CustomAttributesTemplatesPostRequest apiV2CustomAttributesTemplatesPostRequest) throws ApiException {
    return apiV2CustomAttributesTemplatesPostWithHttpInfo(apiV2CustomAttributesTemplatesPostRequest).getData();
  }

  /**
   * Create CustomAttributeTemplate
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute template parameters (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates attribute template  &lt;br&gt;System returns attribute template model (example listed in response parameters)
   * @param apiV2CustomAttributesTemplatesPostRequest  (optional)
   * @return ApiResponse&lt;CustomAttributeTemplateModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeTemplateModel> apiV2CustomAttributesTemplatesPostWithHttpInfo(ApiV2CustomAttributesTemplatesPostRequest apiV2CustomAttributesTemplatesPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeTemplateModel> localVarReturnType = new GenericType<CustomAttributeTemplateModel>() {};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesPost", "/api/v2/customAttributes/templates", "POST", new ArrayList<>(), apiV2CustomAttributesTemplatesPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update custom attributes template
   * 
   * @param apiV2CustomAttributesTemplatesPutRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2CustomAttributesTemplatesPut(ApiV2CustomAttributesTemplatesPutRequest apiV2CustomAttributesTemplatesPutRequest) throws ApiException {
    apiV2CustomAttributesTemplatesPutWithHttpInfo(apiV2CustomAttributesTemplatesPutRequest);
  }

  /**
   * Update custom attributes template
   * 
   * @param apiV2CustomAttributesTemplatesPutRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> System administrator role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2CustomAttributesTemplatesPutWithHttpInfo(ApiV2CustomAttributesTemplatesPutRequest apiV2CustomAttributesTemplatesPutRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesPut", "/api/v2/customAttributes/templates", "PUT", new ArrayList<>(), apiV2CustomAttributesTemplatesPutRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search CustomAttributeTemplates
   * &lt;br&gt;Use case  &lt;br&gt;User sets search params model (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute templates (listed in response example)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2CustomAttributesTemplatesSearchPostRequest  (optional)
   * @return List&lt;SearchCustomAttributeTemplateGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<SearchCustomAttributeTemplateGetModel> apiV2CustomAttributesTemplatesSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2CustomAttributesTemplatesSearchPostRequest apiV2CustomAttributesTemplatesSearchPostRequest) throws ApiException {
    return apiV2CustomAttributesTemplatesSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2CustomAttributesTemplatesSearchPostRequest).getData();
  }

  /**
   * Search CustomAttributeTemplates
   * &lt;br&gt;Use case  &lt;br&gt;User sets search params model (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute templates (listed in response example)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2CustomAttributesTemplatesSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;SearchCustomAttributeTemplateGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<SearchCustomAttributeTemplateGetModel>> apiV2CustomAttributesTemplatesSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2CustomAttributesTemplatesSearchPostRequest apiV2CustomAttributesTemplatesSearchPostRequest) throws ApiException {
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
    GenericType<List<SearchCustomAttributeTemplateGetModel>> localVarReturnType = new GenericType<List<SearchCustomAttributeTemplateGetModel>>() {};
    return apiClient.invokeAPI("CustomAttributeTemplatesApi.apiV2CustomAttributesTemplatesSearchPost", "/api/v2/customAttributes/templates/search", "POST", localVarQueryParams, apiV2CustomAttributesTemplatesSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
