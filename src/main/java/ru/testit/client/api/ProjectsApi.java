package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AutoTestNamespaceModel;
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.CustomAttributeGetModel;
import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.CustomAttributePostModel;
import ru.testit.client.model.CustomAttributePutModel;
import ru.testit.client.model.CustomAttributeTestPlanProjectRelationPutModel;
import ru.testit.client.model.FailureClassModel;
import java.io.File;
import ru.testit.client.model.FilterModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectExportQueryModel;
import ru.testit.client.model.ProjectExportWithTestPlansPostModel;
import ru.testit.client.model.ProjectModel;
import ru.testit.client.model.ProjectPostModel;
import ru.testit.client.model.ProjectPutModel;
import ru.testit.client.model.ProjectSelectModel;
import ru.testit.client.model.PublicTestRunModel;
import ru.testit.client.model.SearchAttributesInProjectQueryModel;
import ru.testit.client.model.SectionModel;
import java.util.Set;
import ru.testit.client.model.TagShortModel;
import ru.testit.client.model.TestPlanModel;
import ru.testit.client.model.TestPlanSearchQueryModel;
import ru.testit.client.model.TestPlanWithAnalyticModel;
import ru.testit.client.model.TestRunModel;
import ru.testit.client.model.TestRunV2GetModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemShortModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectsApi {
  private ApiClient apiClient;

  public ProjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectsApi(ApiClient apiClient) {
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
   * Add global attributes to project
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns ok response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel addGlobaAttributesToProject(String id, Set<UUID> UUID) throws ApiException {
    return addGlobaAttributesToProjectWithHttpInfo(id, UUID).getData();
  }

  /**
   * Add global attributes to project
   * &lt;br&gt;Use case  &lt;br&gt;User sets parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns ok response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> addGlobaAttributesToProjectWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    Object localVarPostBody = UUID;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addGlobaAttributesToProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/globalAttributes"
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

    return apiClient.invokeAPI("ProjectsApi.addGlobaAttributesToProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete CustomAttributeTemplate from Project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attribute template from project
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete(String id, UUID templateId) throws ApiException {
    apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDeleteWithHttpInfo(id, templateId);
  }

  /**
   * Delete CustomAttributeTemplate from Project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attribute template from project
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDeleteWithHttpInfo(String id, UUID templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/customAttributeTemplates/{templateId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Add CustomAttributeTemplate to Project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System add attribute template to project
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost(String id, UUID templateId) throws ApiException {
    apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPostWithHttpInfo(id, templateId);
  }

  /**
   * Add CustomAttributeTemplate to Project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System add attribute template to project
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPostWithHttpInfo(String id, UUID templateId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/customAttributeTemplates/{templateId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get Project FailureClasses
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project failre classes
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional)
   * @return List&lt;FailureClassModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<FailureClassModel> apiV2ProjectsIdFailureClassesGet(String id, Boolean isDeleted) throws ApiException {
    return apiV2ProjectsIdFailureClassesGetWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get Project FailureClasses
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project failre classes
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional)
   * @return ApiResponse&lt;List&lt;FailureClassModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<FailureClassModel>> apiV2ProjectsIdFailureClassesGetWithHttpInfo(String id, Boolean isDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFailureClassesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/failureClasses"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<FailureClassModel>> localVarReturnType = new GenericType<List<FailureClassModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFailureClassesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Mark Project as favorite
   * User permissions for project:  {Read only}  {Execute}  {Write}  {Full control}
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdFavoritePut(String id) throws ApiException {
    apiV2ProjectsIdFavoritePutWithHttpInfo(id);
  }

  /**
   * Mark Project as favorite
   * User permissions for project:  {Read only}  {Execute}  {Write}  {Full control}
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with id </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdFavoritePutWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFavoritePut");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/favorite"
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

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFavoritePut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get Project filters
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project filters
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;FilterModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<FilterModel> apiV2ProjectsIdFiltersGet(String id) throws ApiException {
    return apiV2ProjectsIdFiltersGetWithHttpInfo(id).getData();
  }

  /**
   * Get Project filters
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project filters
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;FilterModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<FilterModel>> apiV2ProjectsIdFiltersGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFiltersGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/filters"
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

    GenericType<List<FilterModel>> localVarReturnType = new GenericType<List<FilterModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFiltersGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestPlans analytics
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier  &lt;br&gt;User sets query params  &lt;br&gt;User runs method execution  &lt;br&gt;System return analytics
   * @param id Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestPlanWithAnalyticModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanWithAnalyticModel> apiV2ProjectsIdTestPlansAnalyticsGet(UUID id, Boolean isDeleted, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2ProjectsIdTestPlansAnalyticsGetWithHttpInfo(id, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get TestPlans analytics
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier  &lt;br&gt;User sets query params  &lt;br&gt;User runs method execution  &lt;br&gt;System return analytics
   * @param id Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestPlanWithAnalyticModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanWithAnalyticModel>> apiV2ProjectsIdTestPlansAnalyticsGetWithHttpInfo(UUID id, Boolean isDeleted, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansAnalyticsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/analytics"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache));
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

    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansAnalyticsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Project TestPlans with analytics
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets request body   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project testplans with analytics
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testPlanSearchQueryModel  (optional)
   * @return List&lt;TestPlanWithAnalyticModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanWithAnalyticModel> apiV2ProjectsIdTestPlansSearchPost(String id, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPlanSearchQueryModel testPlanSearchQueryModel) throws ApiException {
    return apiV2ProjectsIdTestPlansSearchPostWithHttpInfo(id, mustUpdateCache, skip, take, orderBy, searchField, searchValue, testPlanSearchQueryModel).getData();
  }

  /**
   * Get Project TestPlans with analytics
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets request body   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project testplans with analytics
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param mustUpdateCache  (optional, default to false)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testPlanSearchQueryModel  (optional)
   * @return ApiResponse&lt;List&lt;TestPlanWithAnalyticModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanWithAnalyticModel>> apiV2ProjectsIdTestPlansSearchPostWithHttpInfo(String id, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPlanSearchQueryModel testPlanSearchQueryModel) throws ApiException {
    Object localVarPostBody = testPlanSearchQueryModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansSearchPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/search"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache));
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

    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get active Project TestRuns
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns active testruns
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;PublicTestRunModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<PublicTestRunModel> apiV2ProjectsIdTestRunsActiveGet(String id) throws ApiException {
    return apiV2ProjectsIdTestRunsActiveGetWithHttpInfo(id).getData();
  }

  /**
   * Get active Project TestRuns
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns active testruns
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;PublicTestRunModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<PublicTestRunModel>> apiV2ProjectsIdTestRunsActiveGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestRunsActiveGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testRuns/active"
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

    GenericType<List<PublicTestRunModel>> localVarReturnType = new GenericType<List<PublicTestRunModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestRunsActiveGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Project TestRuns full models
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets query params   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project test runs full models
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param includeTestResults  (optional, default to false)
   * @param mustAggregateTestResults  (optional, default to true)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param createdDateFrom  (optional)
   * @param createdDateTo  (optional)
   * @param testPlanId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestRunModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<TestRunModel> apiV2ProjectsIdTestRunsFullGet(String id, Boolean includeTestResults, Boolean mustAggregateTestResults, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, UUID testPlanId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return apiV2ProjectsIdTestRunsFullGetWithHttpInfo(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get Project TestRuns full models
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets query params   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project test runs full models
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param includeTestResults  (optional, default to false)
   * @param mustAggregateTestResults  (optional, default to true)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param createdDateFrom  (optional)
   * @param createdDateTo  (optional)
   * @param testPlanId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestRunModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunModel>> apiV2ProjectsIdTestRunsFullGetWithHttpInfo(String id, Boolean includeTestResults, Boolean mustAggregateTestResults, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, UUID testPlanId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestRunsFullGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testRuns/full"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeTestResults", includeTestResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mustAggregateTestResults", mustAggregateTestResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notStarted", notStarted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inProgress", inProgress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopped", stopped));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completed", completed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "testPlanId", testPlanId));
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

    GenericType<List<TestRunModel>> localVarReturnType = new GenericType<List<TestRunModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestRunsFullGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get WorkItems Tags
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns work items tags
   * @param id Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @return List&lt;TagShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<TagShortModel> apiV2ProjectsIdWorkItemsTagsGet(UUID id, Boolean isDeleted) throws ApiException {
    return apiV2ProjectsIdWorkItemsTagsGetWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get WorkItems Tags
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns work items tags
   * @param id Project internal (UUID) identifier (required)
   * @param isDeleted  (optional)
   * @return ApiResponse&lt;List&lt;TagShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TagShortModel>> apiV2ProjectsIdWorkItemsTagsGetWithHttpInfo(UUID id, Boolean isDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdWorkItemsTagsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/workItems/tags"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TagShortModel>> localVarReturnType = new GenericType<List<TagShortModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdWorkItemsTagsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectSelectModel  (optional)
   * @return List&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ProjectModel> apiV2ProjectsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectSelectModel projectSelectModel) throws ApiException {
    return apiV2ProjectsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, projectSelectModel).getData();
  }

  /**
   * 
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectSelectModel  (optional)
   * @return ApiResponse&lt;List&lt;ProjectModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ProjectModel>> apiV2ProjectsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectSelectModel projectSelectModel) throws ApiException {
    Object localVarPostBody = projectSelectModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/search";

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

    GenericType<List<ProjectModel>> localVarReturnType = new GenericType<List<ProjectModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsSearchPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from JSON file
   * &lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &lt;code&gt;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &lt;/code&gt;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.
   * @param includeAttachments Enables attachment import. (optional, default to false)
   * @param _file Select file (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Entity with the same ID was already imported in other project </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void callImport(Boolean includeAttachments, File _file) throws ApiException {
    callImportWithHttpInfo(includeAttachments, _file);
  }

  /**
   * Import project from JSON file
   * &lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &lt;code&gt;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &lt;/code&gt;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.
   * @param includeAttachments Enables attachment import. (optional, default to false)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Entity with the same ID was already imported in other project </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> callImportWithHttpInfo(Boolean includeAttachments, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/import";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAttachments", includeAttachments));

    
    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("ProjectsApi.callImport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Add attributes to project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and add attributes to project for test plans  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
     </table>
   */
  public void createCustomAttributeTestPlanProjectRelations(String id, Set<UUID> UUID) throws ApiException {
    createCustomAttributeTestPlanProjectRelationsWithHttpInfo(id, UUID);
  }

  /**
   * Add attributes to project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and add attributes to project for test plans  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    Object localVarPostBody = UUID;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createCustomAttributeTestPlanProjectRelations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes"
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

    return apiClient.invokeAPI("ProjectsApi.createCustomAttributeTestPlanProjectRelations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)
   * @param projectPostModel  (optional)
   * @return ProjectModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ProjectModel createProject(ProjectPostModel projectPostModel) throws ApiException {
    return createProjectWithHttpInfo(projectPostModel).getData();
  }

  /**
   * Create project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)
   * @param projectPostModel  (optional)
   * @return ApiResponse&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProjectModel> createProjectWithHttpInfo(ProjectPostModel projectPostModel) throws ApiException {
    Object localVarPostBody = projectPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/projects";

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

    GenericType<ProjectModel> localVarReturnType = new GenericType<ProjectModel>() {};

    return apiClient.invokeAPI("ProjectsApi.createProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System creates attribute and relates it to the project  &lt;br&gt;System returns project attribute properties (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePostModel  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel createProjectsAttribute(String id, CustomAttributePostModel customAttributePostModel) throws ApiException {
    return createProjectsAttributeWithHttpInfo(id, customAttributePostModel).getData();
  }

  /**
   * Create project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System creates attribute and relates it to the project  &lt;br&gt;System returns project attribute properties (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePostModel  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> createProjectsAttributeWithHttpInfo(String id, CustomAttributePostModel customAttributePostModel) throws ApiException {
    Object localVarPostBody = customAttributePostModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createProjectsAttribute");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes"
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

    return apiClient.invokeAPI("ProjectsApi.createProjectsAttribute", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete attribute from project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and delete attribute from project for test plans  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCustomAttributeTestPlanProjectRelations(String id, UUID attributeId) throws ApiException {
    deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(id, attributeId);
  }

  /**
   * Delete attribute from project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and delete attribute from project for test plans  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, UUID attributeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomAttributeTestPlanProjectRelations");
    }
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteCustomAttributeTestPlanProjectRelations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/attribute/{attributeId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "attributeId" + "\\}", apiClient.escapeString(attributeId.toString()));

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

    return apiClient.invokeAPI("ProjectsApi.deleteCustomAttributeTestPlanProjectRelations", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete project
   * &lt;br&gt;Use case:  &lt;br&gt;1. User sets project internal or global identifier and runs method execution  &lt;br&gt;2. System searches and moves requested project to archive  &lt;br&gt;3. System responds with no content (204) result
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID does not exists </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProject(String id) throws ApiException {
    deleteProjectWithHttpInfo(id);
  }

  /**
   * Delete project
   * &lt;br&gt;Use case:  &lt;br&gt;1. User sets project internal or global identifier and runs method execution  &lt;br&gt;2. System searches and moves requested project to archive  &lt;br&gt;3. System responds with no content (204) result
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID does not exists </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}"
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

    return apiClient.invokeAPI("ProjectsApi.deleteProject", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete all autotests from project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for AutoTest required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProjectAutoTests(String id) throws ApiException {
    deleteProjectAutoTestsWithHttpInfo(id);
  }

  /**
   * Delete project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete all autotests from project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for AutoTest required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectAutoTestsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectAutoTests");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/autoTests"
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

    return apiClient.invokeAPI("ProjectsApi.deleteProjectAutoTests", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project identifier and runs method execution  &lt;br&gt;User sets attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search and delete attribute  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Project attribute ID is invalid  &lt;br&gt;- Attribute is empty </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProjectsAttribute(String id, UUID attributeId) throws ApiException {
    deleteProjectsAttributeWithHttpInfo(id, attributeId);
  }

  /**
   * Delete project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project identifier and runs method execution  &lt;br&gt;User sets attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search and delete attribute  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Project attribute ID is invalid  &lt;br&gt;- Attribute is empty </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectsAttributeWithHttpInfo(String id, UUID attributeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectsAttribute");
    }
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteProjectsAttribute");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes/{attributeId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "attributeId" + "\\}", apiClient.escapeString(attributeId.toString()));

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

    return apiClient.invokeAPI("ProjectsApi.deleteProjectsAttribute", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Export project as JSON file
   * &lt;br&gt;This method exports the selected project or its part (sections, work items) to a &#x60;.json&#x60; file.  &lt;br&gt;In the request body, you can specify sections and test cases to be exported.  &lt;br&gt;Example of a request to export two sections and two test cases:  &lt;br&gt;    &lt;code&gt;              curl -X POST \&quot;http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export\&quot; \\              -H \&quot;accept: application/json\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: application/json-patch+json\&quot; \\              -d \&quot;{\\\&quot;sectionIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;9fa85f64-5717-4562-b3fc-2c963f66a000\\\&quot;],\\\&quot;workItemIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;90085f64-5717-4562-b3fc-2c963f66a000\\\&quot;]}\&quot;              &lt;/code&gt;    &lt;br&gt;In the response, you get:  &lt;br&gt;              - A &#x60;.zip&#x60; file with attachments and a.json file if you enable attachments export.&lt;br /&gt;              - A &#x60;.json&#x60; file with the project if you do not enable attachments export.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param projectExportQueryModel  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public File export(String id, Boolean includeAttachments, ProjectExportQueryModel projectExportQueryModel) throws ApiException {
    return exportWithHttpInfo(id, includeAttachments, projectExportQueryModel).getData();
  }

  /**
   * Export project as JSON file
   * &lt;br&gt;This method exports the selected project or its part (sections, work items) to a &#x60;.json&#x60; file.  &lt;br&gt;In the request body, you can specify sections and test cases to be exported.  &lt;br&gt;Example of a request to export two sections and two test cases:  &lt;br&gt;    &lt;code&gt;              curl -X POST \&quot;http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export\&quot; \\              -H \&quot;accept: application/json\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: application/json-patch+json\&quot; \\              -d \&quot;{\\\&quot;sectionIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;9fa85f64-5717-4562-b3fc-2c963f66a000\\\&quot;],\\\&quot;workItemIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;90085f64-5717-4562-b3fc-2c963f66a000\\\&quot;]}\&quot;              &lt;/code&gt;    &lt;br&gt;In the response, you get:  &lt;br&gt;              - A &#x60;.zip&#x60; file with attachments and a.json file if you enable attachments export.&lt;br /&gt;              - A &#x60;.json&#x60; file with the project if you do not enable attachments export.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param projectExportQueryModel  (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportWithHttpInfo(String id, Boolean includeAttachments, ProjectExportQueryModel projectExportQueryModel) throws ApiException {
    Object localVarPostBody = projectExportQueryModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling export");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/export"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAttachments", includeAttachments));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProjectsApi.export", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project with test plans, test suites and test points as JSON file
   * &lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param projectExportWithTestPlansPostModel  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public File exportWithTestPlansAndConfigurations(String id, Boolean includeAttachments, ProjectExportWithTestPlansPostModel projectExportWithTestPlansPostModel) throws ApiException {
    return exportWithTestPlansAndConfigurationsWithHttpInfo(id, includeAttachments, projectExportWithTestPlansPostModel).getData();
  }

  /**
   * Export project with test plans, test suites and test points as JSON file
   * &lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param projectExportWithTestPlansPostModel  (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> exportWithTestPlansAndConfigurationsWithHttpInfo(String id, Boolean includeAttachments, ProjectExportWithTestPlansPostModel projectExportWithTestPlansPostModel) throws ApiException {
    Object localVarPostBody = projectExportWithTestPlansPostModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportWithTestPlansAndConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/export-by-testPlans"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAttachments", includeAttachments));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ProjectsApi.exportWithTestPlansAndConfigurations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all projects
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted projects  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all projects  &lt;br&gt;System returns array of all found projects(listed in response model)
   * @param isDeleted If result must consist of only actual/deleted parameters (optional)
   * @param projectName  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<ProjectModel> getAllProjects(Boolean isDeleted, String projectName, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getAllProjectsWithHttpInfo(isDeleted, projectName, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get all projects
   * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted projects  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all projects  &lt;br&gt;System returns array of all found projects(listed in response model)
   * @param isDeleted If result must consist of only actual/deleted parameters (optional)
   * @param projectName  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;ProjectModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<ProjectModel>> getAllProjectsWithHttpInfo(Boolean isDeleted, String projectName, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v2/projects";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
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

    GenericType<List<ProjectModel>> localVarReturnType = new GenericType<List<ProjectModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getAllProjects", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User sets project attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search project attribute   &lt;br&gt;System returns project attribute (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Project with provided ID was not found  &lt;br&gt;- Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel getAttributeByProjectId(String id, UUID attributeId) throws ApiException {
    return getAttributeByProjectIdWithHttpInfo(id, attributeId).getData();
  }

  /**
   * Get project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User sets project attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search project attribute   &lt;br&gt;System returns project attribute (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Project with provided ID was not found  &lt;br&gt;- Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> getAttributeByProjectIdWithHttpInfo(String id, UUID attributeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttributeByProjectId");
    }
    
    // verify the required parameter 'attributeId' is set
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling getAttributeByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes/{attributeId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "attributeId" + "\\}", apiClient.escapeString(attributeId.toString()));

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

    return apiClient.invokeAPI("ProjectsApi.getAttributeByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project attributes
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all attributes related to project  &lt;br&gt;System returns array of found attributes (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> getAttributesByProjectId(String id, Boolean isDeleted) throws ApiException {
    return getAttributesByProjectIdWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get project attributes
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all attributes related to project  &lt;br&gt;System returns array of found attributes (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> getAttributesByProjectIdWithHttpInfo(String id, Boolean isDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttributesByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getAttributesByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get namespaces of autotests in project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all autotest related to the project  &lt;br&gt;System returns array of autotest with namespaces and classnames (listed in response)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;AutoTestNamespaceModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public List<AutoTestNamespaceModel> getAutoTestsNamespaces(String id) throws ApiException {
    return getAutoTestsNamespacesWithHttpInfo(id).getData();
  }

  /**
   * Get namespaces of autotests in project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all autotest related to the project  &lt;br&gt;System returns array of autotest with namespaces and classnames (listed in response)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;AutoTestNamespaceModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestNamespaceModel>> getAutoTestsNamespacesWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestsNamespaces");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/autoTestsNamespaces"
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

    GenericType<List<AutoTestNamespaceModel>> localVarReturnType = new GenericType<List<AutoTestNamespaceModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getAutoTestsNamespaces", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project configurations
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all configurations related to project  &lt;br&gt;System returns array of found configurations (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for configurations required </td><td>  -  </td></tr>
     </table>
   */
  public List<ConfigurationModel> getConfigurationsByProjectId(String id) throws ApiException {
    return getConfigurationsByProjectIdWithHttpInfo(id).getData();
  }

  /**
   * Get project configurations
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all configurations related to project  &lt;br&gt;System returns array of found configurations (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for configurations required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> getConfigurationsByProjectIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationsByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/configurations"
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

    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getConfigurationsByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project&#39;s test plan attributes
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns project for test plans attributes by project identifier
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> getCustomAttributeTestPlanProjectRelations(String id) throws ApiException {
    return getCustomAttributeTestPlanProjectRelationsWithHttpInfo(id).getData();
  }

  /**
   * Get project&#39;s test plan attributes
   * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns project for test plans attributes by project identifier
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> getCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomAttributeTestPlanProjectRelations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes"
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

    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getCustomAttributeTestPlanProjectRelations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System returns project (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ProjectModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> ID is invalid </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ProjectModel getProjectById(String id) throws ApiException {
    return getProjectByIdWithHttpInfo(id).getData();
  }

  /**
   * Get project by ID
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System returns project (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> ID is invalid </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProjectModel> getProjectByIdWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProjectById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}"
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

    GenericType<ProjectModel> localVarReturnType = new GenericType<ProjectModel>() {};

    return apiClient.invokeAPI("ProjectsApi.getProjectById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project sections
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all sections related to the project  &lt;br&gt;System returns array of sections (listed in response)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;SectionModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<SectionModel> getSectionsByProjectId(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getSectionsByProjectIdWithHttpInfo(id, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get project sections
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all sections related to the project  &lt;br&gt;System returns array of sections (listed in response)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;SectionModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<SectionModel>> getSectionsByProjectIdWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSectionsByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/sections"
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

    GenericType<List<SectionModel>> localVarReturnType = new GenericType<List<SectionModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getSectionsByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all v related to project  &lt;br&gt;System returns array of found test plans (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/archived test plans (optional)
   * @return List&lt;TestPlanModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanModel> getTestPlansByProjectId(String id, Boolean isDeleted) throws ApiException {
    return getTestPlansByProjectIdWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get project test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all v related to project  &lt;br&gt;System returns array of found test plans (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/archived test plans (optional)
   * @return ApiResponse&lt;List&lt;TestPlanModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanModel>> getTestPlansByProjectIdWithHttpInfo(String id, Boolean isDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestPlansByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<TestPlanModel>> localVarReturnType = new GenericType<List<TestPlanModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getTestPlansByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project test runs
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all test runs related to project  &lt;br&gt;System returns array of found test runs (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param createdDateFrom  (optional)
   * @param createdDateTo  (optional)
   * @param testPlanId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;TestRunV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test result is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<TestRunV2GetModel> getTestRunsByProjectId(String id, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, UUID testPlanId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getTestRunsByProjectIdWithHttpInfo(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get project test runs
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all test runs related to project  &lt;br&gt;System returns array of found test runs (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param notStarted  (optional)
   * @param inProgress  (optional)
   * @param stopped  (optional)
   * @param completed  (optional)
   * @param createdDateFrom  (optional)
   * @param createdDateTo  (optional)
   * @param testPlanId  (optional)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;TestRunV2GetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test result is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunV2GetModel>> getTestRunsByProjectIdWithHttpInfo(String id, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, UUID testPlanId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRunsByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testRuns"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notStarted", notStarted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inProgress", inProgress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopped", stopped));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completed", completed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateFrom", createdDateFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdDateTo", createdDateTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "testPlanId", testPlanId));
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

    GenericType<List<TestRunV2GetModel>> localVarReturnType = new GenericType<List<TestRunV2GetModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getTestRunsByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all  workitems related to project  &lt;br&gt;System returns array of found workitems (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @param tagNames List of tags to filter by (optional)
   * @param includeIterations  (optional, default to true)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return List&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortModel> getWorkItemsByProjectId(String id, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getWorkItemsByProjectIdWithHttpInfo(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get project work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all  workitems related to project  &lt;br&gt;System returns array of found workitems (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
   * @param tagNames List of tags to filter by (optional)
   * @param includeIterations  (optional, default to true)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortModel>> getWorkItemsByProjectIdWithHttpInfo(String id, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsByProjectId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/workItems"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tagNames", tagNames));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeIterations", includeIterations));
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

    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.getWorkItemsByProjectId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from JSON file into existing project
   * &lt;br&gt;Use case  &lt;br&gt;User attaches project as json file taken from export or export-by-testPlans method  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param includeAttachments  (optional)
   * @param _file Select file (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with same id already imported in other project </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
     </table>
   */
  public void importToExistingProject(String id, Boolean includeAttachments, File _file) throws ApiException {
    importToExistingProjectWithHttpInfo(id, includeAttachments, _file);
  }

  /**
   * Import project from JSON file into existing project
   * &lt;br&gt;Use case  &lt;br&gt;User attaches project as json file taken from export or export-by-testPlans method  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param includeAttachments  (optional)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with same id already imported in other project </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> importToExistingProjectWithHttpInfo(String id, Boolean includeAttachments, File _file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling importToExistingProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/import"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAttachments", includeAttachments));

    
    
    if (_file != null)
      localVarFormParams.put("file", _file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    return apiClient.invokeAPI("ProjectsApi.importToExistingProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search and restores deleted project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void restoreProject(String id) throws ApiException {
    restoreProjectWithHttpInfo(id);
  }

  /**
   * Restore project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search and restores deleted project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> restoreProjectWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling restoreProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/restore"
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

    return apiClient.invokeAPI("ProjectsApi.restoreProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectQueryModel  (optional)
   * @return List&lt;CustomAttributeGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeGetModel> searchAttributesInProject(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel) throws ApiException {
    return searchAttributesInProjectWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectQueryModel  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeGetModel>> searchAttributesInProjectWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel) throws ApiException {
    Object localVarPostBody = searchAttributesInProjectQueryModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchAttributesInProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes/search"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<CustomAttributeGetModel>> localVarReturnType = new GenericType<List<CustomAttributeGetModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.searchAttributesInProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectQueryModel  (optional)
   * @return List&lt;CustomAttributeGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeGetModel> searchTestPlanAttributesInProject(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel) throws ApiException {
    return searchTestPlanAttributesInProjectWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectQueryModel  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeGetModel>> searchTestPlanAttributesInProjectWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel) throws ApiException {
    Object localVarPostBody = searchAttributesInProjectQueryModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchTestPlanAttributesInProject");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes/search"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };

    GenericType<List<CustomAttributeGetModel>> localVarReturnType = new GenericType<List<CustomAttributeGetModel>>() {};

    return apiClient.invokeAPI("ProjectsApi.searchTestPlanAttributesInProject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update attribute of project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributeTestPlanProjectRelationPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public void updateCustomAttributeTestPlanProjectRelations(String id, CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel) throws ApiException {
    updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(id, customAttributeTestPlanProjectRelationPutModel);
  }

  /**
   * Update attribute of project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributeTestPlanProjectRelationPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel) throws ApiException {
    Object localVarPostBody = customAttributeTestPlanProjectRelationPutModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomAttributeTestPlanProjectRelations");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/testPlans/attribute"
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

    return apiClient.invokeAPI("ProjectsApi.updateCustomAttributeTestPlanProjectRelations", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)
   * @param projectPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public void updateProject(ProjectPutModel projectPutModel) throws ApiException {
    updateProjectWithHttpInfo(projectPutModel);
  }

  /**
   * Update project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)
   * @param projectPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateProjectWithHttpInfo(ProjectPutModel projectPutModel) throws ApiException {
    Object localVarPostBody = projectPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/projects";

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

    return apiClient.invokeAPI("ProjectsApi.updateProject", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System updates attribute related to the project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
     </table>
   */
  public void updateProjectsAttribute(String id, CustomAttributePutModel customAttributePutModel) throws ApiException {
    updateProjectsAttributeWithHttpInfo(id, customAttributePutModel);
  }

  /**
   * Update project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System updates attribute related to the project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateProjectsAttributeWithHttpInfo(String id, CustomAttributePutModel customAttributePutModel) throws ApiException {
    Object localVarPostBody = customAttributePutModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateProjectsAttribute");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/projects/{id}/attributes"
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

    return apiClient.invokeAPI("ProjectsApi.updateProjectsAttribute", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
