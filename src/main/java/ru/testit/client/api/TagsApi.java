package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TagShortModel;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
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
   * Get all Tags
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns tags (listed in the response example)
   * @return List&lt;TagShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public List<TagShortModel> apiV2TagsGet() throws ApiException {
    return apiV2TagsGetWithHttpInfo().getData();
  }

  /**
   * Get all Tags
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns tags (listed in the response example)
   * @return ApiResponse&lt;List&lt;TagShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TagShortModel>> apiV2TagsGetWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TagShortModel>> localVarReturnType = new GenericType<List<TagShortModel>>() {};
    return apiClient.invokeAPI("TagsApi.apiV2TagsGet", "/api/v2/tags", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Tags that are used in TestPlans
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns tags (listed in the response example)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TagShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  &lt;br&gt;orderByStatement has invalid length  &lt;br&gt;orderByStatement must have uuid as attribute key  &lt;br&gt;Search field not found </td><td>  -  </td></tr>
     </table>
   */
  public List<TagShortModel> apiV2TagsTestPlansTagsGet(Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2TagsTestPlansTagsGetWithHttpInfo(skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get all Tags that are used in TestPlans
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns tags (listed in the response example)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TagShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  &lt;br&gt;orderByStatement has invalid length  &lt;br&gt;orderByStatement must have uuid as attribute key  &lt;br&gt;Search field not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TagShortModel>> apiV2TagsTestPlansTagsGetWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "Skip", skip)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TagShortModel>> localVarReturnType = new GenericType<List<TagShortModel>>() {};
    return apiClient.invokeAPI("TagsApi.apiV2TagsTestPlansTagsGet", "/api/v2/tags/testPlansTags", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
