package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ApiV2ProjectsIdAttributesTemplatesSearchPostRequest;
import ru.testit.client.model.ApiV2ProjectsIdTestPlansDeleteBulkPostRequest;
import ru.testit.client.model.ApiV2ProjectsIdTestPlansSearchPostRequest;
import ru.testit.client.model.ApiV2ProjectsIdWorkItemsSearchPostRequest;
import ru.testit.client.model.ApiV2ProjectsRestoreBulkPostRequest;
import ru.testit.client.model.ApiV2ProjectsSearchPostRequest;
import ru.testit.client.model.AutoTestNamespaceModel;
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.CreateProjectRequest;
import ru.testit.client.model.CreateProjectsAttributeRequest;
import ru.testit.client.model.CustomAttributeGetModel;
import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.DeletionState;
import ru.testit.client.model.ExportProjectJsonRequest;
import ru.testit.client.model.ExportProjectWithTestPlansJsonRequest;
import ru.testit.client.model.FailureClassModel;
import java.io.File;
import ru.testit.client.model.FilterModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectCustomAttributeTemplateGetModel;
import ru.testit.client.model.ProjectModel;
import ru.testit.client.model.PublicTestRunModel;
import ru.testit.client.model.SearchAttributesInProjectRequest;
import ru.testit.client.model.SectionModel;
import java.util.Set;
import ru.testit.client.model.TagShortModel;
import ru.testit.client.model.TestPlanModel;
import ru.testit.client.model.TestPlanWithAnalyticModel;
import ru.testit.client.model.TestRunModel;
import ru.testit.client.model.TestRunV2GetModel;
import java.util.UUID;
import ru.testit.client.model.UpdateCustomAttributeTestPlanProjectRelationsRequest;
import ru.testit.client.model.UpdateProjectRequest;
import ru.testit.client.model.UpdateProjectsAttributeRequest;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemShortModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
     </table>
   */
  public void addGlobaAttributesToProject(String id, Set<UUID> UUID) throws ApiException {
    addGlobaAttributesToProjectWithHttpInfo(id, UUID);
  }

  /**
   * Add global attributes to project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addGlobaAttributesToProjectWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addGlobaAttributesToProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/globalAttributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.addGlobaAttributesToProject", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search for custom attributes templates
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdAttributesTemplatesSearchPostRequest  (optional)
   * @return List&lt;ProjectCustomAttributeTemplateGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ProjectCustomAttributeTemplateGetModel> apiV2ProjectsIdAttributesTemplatesSearchPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdAttributesTemplatesSearchPostRequest apiV2ProjectsIdAttributesTemplatesSearchPostRequest) throws ApiException {
    return apiV2ProjectsIdAttributesTemplatesSearchPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, apiV2ProjectsIdAttributesTemplatesSearchPostRequest).getData();
  }

  /**
   * Search for custom attributes templates
   * 
   * @param id  (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdAttributesTemplatesSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;ProjectCustomAttributeTemplateGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ProjectCustomAttributeTemplateGetModel>> apiV2ProjectsIdAttributesTemplatesSearchPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdAttributesTemplatesSearchPostRequest apiV2ProjectsIdAttributesTemplatesSearchPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdAttributesTemplatesSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/templates/search"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<ProjectCustomAttributeTemplateGetModel>> localVarReturnType = new GenericType<List<ProjectCustomAttributeTemplateGetModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdAttributesTemplatesSearchPost", localVarPath, "POST", localVarQueryParams, apiV2ProjectsIdAttributesTemplatesSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdAttributesTemplatesTemplateIdDelete(String id, UUID templateId) throws ApiException {
    apiV2ProjectsIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(id, templateId);
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
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(String id, UUID templateId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdAttributesTemplatesTemplateIdDelete");
    }
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsIdAttributesTemplatesTemplateIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/templates/{templateId}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{templateId}", apiClient.escapeString(templateId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdAttributesTemplatesTemplateIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
  public void apiV2ProjectsIdAttributesTemplatesTemplateIdPost(String id, UUID templateId) throws ApiException {
    apiV2ProjectsIdAttributesTemplatesTemplateIdPostWithHttpInfo(id, templateId);
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
  public ApiResponse<Void> apiV2ProjectsIdAttributesTemplatesTemplateIdPostWithHttpInfo(String id, UUID templateId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdAttributesTemplatesTemplateIdPost");
    }
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsIdAttributesTemplatesTemplateIdPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/templates/{templateId}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{templateId}", apiClient.escapeString(templateId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdAttributesTemplatesTemplateIdPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Archive project
   * 
   * @param id Unique or global ID of the project (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdDelete(String id) throws ApiException {
    apiV2ProjectsIdDeleteWithHttpInfo(id);
  }

  /**
   * Archive project
   * 
   * @param id Unique or global ID of the project (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdDeleteWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get failure classes
   * 
   * @param id Unique or global ID of the project (required)
   * @param isDeleted  (optional)
   * @return List&lt;FailureClassModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public List<FailureClassModel> apiV2ProjectsIdFailureClassesGet(String id, Boolean isDeleted) throws ApiException {
    return apiV2ProjectsIdFailureClassesGetWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get failure classes
   * 
   * @param id Unique or global ID of the project (required)
   * @param isDeleted  (optional)
   * @return ApiResponse&lt;List&lt;FailureClassModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<FailureClassModel>> apiV2ProjectsIdFailureClassesGetWithHttpInfo(String id, Boolean isDeleted) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFailureClassesGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/failureClasses"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<FailureClassModel>> localVarReturnType = new GenericType<List<FailureClassModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFailureClassesGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Mark Project as favorite
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdFavoritePut(String id) throws ApiException {
    apiV2ProjectsIdFavoritePutWithHttpInfo(id);
  }

  /**
   * Mark Project as favorite
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdFavoritePutWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFavoritePut");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/favorite"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFavoritePut", localVarPath, "PUT", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<FilterModel>> apiV2ProjectsIdFiltersGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdFiltersGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/filters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<FilterModel>> localVarReturnType = new GenericType<List<FilterModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdFiltersGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Patch project
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique or global Id of project (required)
   * @param operation  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2ProjectsIdPatchWithHttpInfo(id, operation);
  }

  /**
   * Patch project
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Unique or global Id of project (required)
   * @param operation  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Purge archived project
   * 
   * @param id Unique or global ID of the project (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdPurgePost(String id) throws ApiException {
    apiV2ProjectsIdPurgePostWithHttpInfo(id);
  }

  /**
   * Purge archived project
   * 
   * @param id Unique or global ID of the project (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdPurgePostWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdPurgePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/purge"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdPurgePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore archived project
   * 
   * @param id Unique or global ID of the project (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdRestorePost(String id) throws ApiException {
    apiV2ProjectsIdRestorePostWithHttpInfo(id);
  }

  /**
   * Restore archived project
   * 
   * @param id Unique or global ID of the project (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdRestorePostWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdRestorePost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/restore"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdRestorePost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansAnalyticsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/analytics"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansAnalyticsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete multiple test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> - Read permission for the project is required  - Delete permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ProjectsIdTestPlansDeleteBulkPost(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    return apiV2ProjectsIdTestPlansDeleteBulkPostWithHttpInfo(id, apiV2ProjectsIdTestPlansDeleteBulkPostRequest).getData();
  }

  /**
   * Delete multiple test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> - Read permission for the project is required  - Delete permission for test plans is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ProjectsIdTestPlansDeleteBulkPostWithHttpInfo(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansDeleteBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/delete/bulk"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansDeleteBulkPost", localVarPath, "POST", new ArrayList<>(), apiV2ProjectsIdTestPlansDeleteBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Checks if TestPlan exists with the specified name exists for the project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System purge delete project workitems
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param name TestPlan name to check (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Boolean apiV2ProjectsIdTestPlansNameExistsGet(UUID id, String name) throws ApiException {
    return apiV2ProjectsIdTestPlansNameExistsGetWithHttpInfo(id, name).getData();
  }

  /**
   * Checks if TestPlan exists with the specified name exists for the project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System purge delete project workitems
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param name TestPlan name to check (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> apiV2ProjectsIdTestPlansNameExistsGetWithHttpInfo(UUID id, String name) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansNameExistsGet");
    }
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2ProjectsIdTestPlansNameExistsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/{name}/exists"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{name}", apiClient.escapeString(name));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansNameExistsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Permanently delete multiple archived test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdTestPlansPurgeBulkPost(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    apiV2ProjectsIdTestPlansPurgeBulkPostWithHttpInfo(id, apiV2ProjectsIdTestPlansDeleteBulkPostRequest);
  }

  /**
   * Permanently delete multiple archived test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Full access permission for the archive is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdTestPlansPurgeBulkPostWithHttpInfo(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansPurgeBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/purge/bulk"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansPurgeBulkPost", localVarPath, "POST", new ArrayList<>(), apiV2ProjectsIdTestPlansDeleteBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Restore multiple test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsIdTestPlansRestoreBulkPost(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    apiV2ProjectsIdTestPlansRestoreBulkPostWithHttpInfo(id, apiV2ProjectsIdTestPlansDeleteBulkPostRequest);
  }

  /**
   * Restore multiple test plans
   * 
   * @param id Unique or global ID of the project (required)
   * @param apiV2ProjectsIdTestPlansDeleteBulkPostRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for the archive is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsIdTestPlansRestoreBulkPostWithHttpInfo(String id, ApiV2ProjectsIdTestPlansDeleteBulkPostRequest apiV2ProjectsIdTestPlansDeleteBulkPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansRestoreBulkPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/restore/bulk"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansRestoreBulkPost", localVarPath, "POST", new ArrayList<>(), apiV2ProjectsIdTestPlansDeleteBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
   * @param apiV2ProjectsIdTestPlansSearchPostRequest  (optional)
   * @return List&lt;TestPlanWithAnalyticModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPlanWithAnalyticModel> apiV2ProjectsIdTestPlansSearchPost(String id, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdTestPlansSearchPostRequest apiV2ProjectsIdTestPlansSearchPostRequest) throws ApiException {
    return apiV2ProjectsIdTestPlansSearchPostWithHttpInfo(id, mustUpdateCache, skip, take, orderBy, searchField, searchValue, apiV2ProjectsIdTestPlansSearchPostRequest).getData();
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
   * @param apiV2ProjectsIdTestPlansSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;TestPlanWithAnalyticModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanWithAnalyticModel>> apiV2ProjectsIdTestPlansSearchPostWithHttpInfo(String id, Boolean mustUpdateCache, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdTestPlansSearchPostRequest apiV2ProjectsIdTestPlansSearchPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestPlansSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/search"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "mustUpdateCache", mustUpdateCache)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanWithAnalyticModel>> localVarReturnType = new GenericType<List<TestPlanWithAnalyticModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestPlansSearchPost", localVarPath, "POST", localVarQueryParams, apiV2ProjectsIdTestPlansSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<PublicTestRunModel>> apiV2ProjectsIdTestRunsActiveGetWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestRunsActiveGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testRuns/active"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<PublicTestRunModel>> localVarReturnType = new GenericType<List<PublicTestRunModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestRunsActiveGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdTestRunsFullGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testRuns/full"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeTestResults", includeTestResults)
    );
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

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestRunModel>> localVarReturnType = new GenericType<List<TestRunModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdTestRunsFullGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for work items and extract IDs only
   * 
   * @param id Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdWorkItemsSearchPostRequest  (optional)
   * @return List&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public List<UUID> apiV2ProjectsIdWorkItemsSearchIdPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest) throws ApiException {
    return apiV2ProjectsIdWorkItemsSearchIdPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, apiV2ProjectsIdWorkItemsSearchPostRequest).getData();
  }

  /**
   * Search for work items and extract IDs only
   * 
   * @param id Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdWorkItemsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<UUID>> apiV2ProjectsIdWorkItemsSearchIdPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdWorkItemsSearchIdPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/workItems/search/id"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<UUID>> localVarReturnType = new GenericType<List<UUID>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdWorkItemsSearchIdPost", localVarPath, "POST", localVarQueryParams, apiV2ProjectsIdWorkItemsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for work items
   * 
   * @param id Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdWorkItemsSearchPostRequest  (optional)
   * @return List&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortModel> apiV2ProjectsIdWorkItemsSearchPost(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest) throws ApiException {
    return apiV2ProjectsIdWorkItemsSearchPostWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, apiV2ProjectsIdWorkItemsSearchPostRequest).getData();
  }

  /**
   * Search for work items
   * 
   * @param id Unique or global ID of the project (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsIdWorkItemsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortModel>> apiV2ProjectsIdWorkItemsSearchPostWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdWorkItemsSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/workItems/search"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdWorkItemsSearchPost", localVarPath, "POST", localVarQueryParams, apiV2ProjectsIdWorkItemsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TagShortModel>> apiV2ProjectsIdWorkItemsTagsGetWithHttpInfo(UUID id, Boolean isDeleted) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ProjectsIdWorkItemsTagsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/workItems/tags"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TagShortModel>> localVarReturnType = new GenericType<List<TagShortModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsIdWorkItemsTagsGet", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param name  (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Boolean apiV2ProjectsNameNameExistsGet(String name) throws ApiException {
    return apiV2ProjectsNameNameExistsGetWithHttpInfo(name).getData();
  }

  /**
   * 
   * 
   * @param name  (required)
   * @return ApiResponse&lt;Boolean&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Boolean> apiV2ProjectsNameNameExistsGetWithHttpInfo(String name) throws ApiException {
    // Check required parameters
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling apiV2ProjectsNameNameExistsGet");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/name/{name}/exists"
            .replaceAll("\\{name}", apiClient.escapeString(name));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsNameNameExistsGet", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Purge multiple projects
   * 
   * @param apiV2ProjectsRestoreBulkPostRequest  (optional)
   * @return Long
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Long apiV2ProjectsPurgeBulkPost(ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest) throws ApiException {
    return apiV2ProjectsPurgeBulkPostWithHttpInfo(apiV2ProjectsRestoreBulkPostRequest).getData();
  }

  /**
   * Purge multiple projects
   * 
   * @param apiV2ProjectsRestoreBulkPostRequest  (optional)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Admin system role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Long> apiV2ProjectsPurgeBulkPostWithHttpInfo(ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsPurgeBulkPost", "/api/v2/projects/purge/bulk", "POST", new ArrayList<>(), apiV2ProjectsRestoreBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Restore multiple projects
   * 
   * @param apiV2ProjectsRestoreBulkPostRequest  (optional)
   * @return Long
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Long apiV2ProjectsRestoreBulkPost(ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest) throws ApiException {
    return apiV2ProjectsRestoreBulkPostWithHttpInfo(apiV2ProjectsRestoreBulkPostRequest).getData();
  }

  /**
   * Restore multiple projects
   * 
   * @param apiV2ProjectsRestoreBulkPostRequest  (optional)
   * @return ApiResponse&lt;Long&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project manager or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Long> apiV2ProjectsRestoreBulkPostWithHttpInfo(ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsRestoreBulkPost", "/api/v2/projects/restore/bulk", "POST", new ArrayList<>(), apiV2ProjectsRestoreBulkPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for projects
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsSearchPostRequest  (optional)
   * @return List&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public List<ProjectModel> apiV2ProjectsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsSearchPostRequest apiV2ProjectsSearchPostRequest) throws ApiException {
    return apiV2ProjectsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, apiV2ProjectsSearchPostRequest).getData();
  }

  /**
   * Search for projects
   * 
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param apiV2ProjectsSearchPostRequest  (optional)
   * @return ApiResponse&lt;List&lt;ProjectModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<ProjectModel>> apiV2ProjectsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, ApiV2ProjectsSearchPostRequest apiV2ProjectsSearchPostRequest) throws ApiException {
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
    GenericType<List<ProjectModel>> localVarReturnType = new GenericType<List<ProjectModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.apiV2ProjectsSearchPost", "/api/v2/projects/search", "POST", localVarQueryParams, apiV2ProjectsSearchPostRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from JSON file in background job
   * 
   * @param _file  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public UUID backgroundImportProject(File _file) throws ApiException {
    return backgroundImportProjectWithHttpInfo(_file).getData();
  }

  /**
   * Import project from JSON file in background job
   * 
   * @param _file  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> backgroundImportProjectWithHttpInfo(File _file) throws ApiException {
    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data", "application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.backgroundImportProject", "/api/v2/projects/import/json", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from JSON file into existing project in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param _file Select file (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public UUID backgroundImportToExistingProject(String id, File _file) throws ApiException {
    return backgroundImportToExistingProjectWithHttpInfo(id, _file).getData();
  }

  /**
   * Import project from JSON file into existing project in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> backgroundImportToExistingProjectWithHttpInfo(String id, File _file) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling backgroundImportToExistingProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/import/json"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.backgroundImportToExistingProject", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from Zip file in background job
   * 
   * @param _file  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public UUID backgroundImportZipProject(File _file) throws ApiException {
    return backgroundImportZipProjectWithHttpInfo(_file).getData();
  }

  /**
   * Import project from Zip file in background job
   * 
   * @param _file  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> backgroundImportZipProjectWithHttpInfo(File _file) throws ApiException {
    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data", "application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.backgroundImportZipProject", "/api/v2/projects/import/zip", "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from Zip file into existing project in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param _file Select file (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public UUID backgroundImportZipToExistingProject(String id, File _file) throws ApiException {
    return backgroundImportZipToExistingProjectWithHttpInfo(id, _file).getData();
  }

  /**
   * Import project from Zip file into existing project in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> backgroundImportZipToExistingProjectWithHttpInfo(String id, File _file) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling backgroundImportZipToExistingProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/import/zip"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.backgroundImportZipToExistingProject", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import project from JSON file
   * &lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.
   * @param includeAttachments Enables attachment import. (optional, default to false)
   * @param _file Select file (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with the same ID was already imported in other project </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public void callImport(Boolean includeAttachments, File _file) throws ApiException {
    callImportWithHttpInfo(includeAttachments, _file);
  }

  /**
   * Import project from JSON file
   * &lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.
   * @param includeAttachments Enables attachment import. (optional, default to false)
   * @param _file Select file (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with the same ID was already imported in other project </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> callImportWithHttpInfo(Boolean includeAttachments, File _file) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeAttachments", includeAttachments)
    );

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.callImport", "/api/v2/projects/import", "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
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
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
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
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt; Attributes must be global  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.createCustomAttributeTestPlanProjectRelations", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)
   * @param createProjectRequest  (optional)
   * @return ProjectModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ProjectModel createProject(CreateProjectRequest createProjectRequest) throws ApiException {
    return createProjectWithHttpInfo(createProjectRequest).getData();
  }

  /**
   * Create project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)
   * @param createProjectRequest  (optional)
   * @return ApiResponse&lt;ProjectModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Project creator or admin system role is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProjectModel> createProjectWithHttpInfo(CreateProjectRequest createProjectRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<ProjectModel> localVarReturnType = new GenericType<ProjectModel>() {};
    return apiClient.invokeAPI("ProjectsApi.createProject", "/api/v2/projects", "POST", new ArrayList<>(), createProjectRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System creates attribute and relates it to the project  &lt;br&gt;System returns project attribute properties (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param createProjectsAttributeRequest  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel createProjectsAttribute(String id, CreateProjectsAttributeRequest createProjectsAttributeRequest) throws ApiException {
    return createProjectsAttributeWithHttpInfo(id, createProjectsAttributeRequest).getData();
  }

  /**
   * Create project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets attribute parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System creates attribute and relates it to the project  &lt;br&gt;System returns project attribute properties (example listed in response parameters)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param createProjectsAttributeRequest  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> createProjectsAttributeWithHttpInfo(String id, CreateProjectsAttributeRequest createProjectsAttributeRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};
    return apiClient.invokeAPI("ProjectsApi.createProjectsAttribute", localVarPath, "POST", new ArrayList<>(), createProjectsAttributeRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
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
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, UUID attributeId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomAttributeTestPlanProjectRelations");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/attribute/{attributeId}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.deleteCustomAttributeTestPlanProjectRelations", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete all autotests from project
   * 
   * @param id Unique or global ID of the project (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for AutoTest is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProjectAutoTests(String id) throws ApiException {
    deleteProjectAutoTestsWithHttpInfo(id);
  }

  /**
   * Delete all autotests from project
   * 
   * @param id Unique or global ID of the project (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for AutoTest is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectAutoTestsWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectAutoTests");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/autoTests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.deleteProjectAutoTests", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project identifier and runs method execution  &lt;br&gt;User sets attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search and delete attribute  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Project attribute ID is invalid  &lt;br&gt;- Attribute is empty </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProjectsAttribute(String id, UUID attributeId) throws ApiException {
    deleteProjectsAttributeWithHttpInfo(id, attributeId);
  }

  /**
   * Delete project attribute
   * &lt;br&gt;Use case  &lt;br&gt;User sets project identifier and runs method execution  &lt;br&gt;User sets attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search and delete attribute  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Project attribute ID is invalid  &lt;br&gt;- Attribute is empty </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectsAttributeWithHttpInfo(String id, UUID attributeId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProjectsAttribute");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/{attributeId}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.deleteProjectsAttribute", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Export project as JSON file
   * &lt;br&gt;This method exports the selected project or its part (sections, work items) to a &#x60;.json&#x60; file.  &lt;br&gt;In the request body, you can specify sections and test cases to be exported.  &lt;br&gt;Example of a request to export two sections and two test cases:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export\&quot; \\              -H \&quot;accept: application/json\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: application/json-patch+json\&quot; \\              -d \&quot;{\\\&quot;sectionIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;9fa85f64-5717-4562-b3fc-2c963f66a000\\\&quot;],\\\&quot;workItemIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;90085f64-5717-4562-b3fc-2c963f66a000\\\&quot;]}\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;In the response, you get:  &lt;br&gt;              - A &#x60;.zip&#x60; file with attachments and a.json file if you enable attachments export.&lt;br /&gt;              - A &#x60;.json&#x60; file with the project if you do not enable attachments export.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param exportProjectJsonRequest  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public File export(String id, Boolean includeAttachments, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    return exportWithHttpInfo(id, includeAttachments, exportProjectJsonRequest).getData();
  }

  /**
   * Export project as JSON file
   * &lt;br&gt;This method exports the selected project or its part (sections, work items) to a &#x60;.json&#x60; file.  &lt;br&gt;In the request body, you can specify sections and test cases to be exported.  &lt;br&gt;Example of a request to export two sections and two test cases:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export\&quot; \\              -H \&quot;accept: application/json\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: application/json-patch+json\&quot; \\              -d \&quot;{\\\&quot;sectionIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;9fa85f64-5717-4562-b3fc-2c963f66a000\\\&quot;],\\\&quot;workItemIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;90085f64-5717-4562-b3fc-2c963f66a000\\\&quot;]}\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;In the response, you get:  &lt;br&gt;              - A &#x60;.zip&#x60; file with attachments and a.json file if you enable attachments export.&lt;br /&gt;              - A &#x60;.json&#x60; file with the project if you do not enable attachments export.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param exportProjectJsonRequest  (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<File> exportWithHttpInfo(String id, Boolean includeAttachments, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling export");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeAttachments", includeAttachments)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProjectsApi.export", localVarPath, "POST", localVarQueryParams, exportProjectJsonRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project as JSON file in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectJsonRequest  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public UUID exportProjectJson(String id, Long timeZoneOffsetInMinutes, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    return exportProjectJsonWithHttpInfo(id, timeZoneOffsetInMinutes, exportProjectJsonRequest).getData();
  }

  /**
   * Export project as JSON file in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectJsonRequest  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> exportProjectJsonWithHttpInfo(String id, Long timeZoneOffsetInMinutes, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportProjectJson");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export/json"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.exportProjectJson", localVarPath, "POST", new ArrayList<>(), exportProjectJsonRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project as JSON file with test plans in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UUID exportProjectWithTestPlansJson(String id, Long timeZoneOffsetInMinutes, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    return exportProjectWithTestPlansJsonWithHttpInfo(id, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest).getData();
  }

  /**
   * Export project as JSON file with test plans in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> exportProjectWithTestPlansJsonWithHttpInfo(String id, Long timeZoneOffsetInMinutes, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportProjectWithTestPlansJson");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export/testPlans/json"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.exportProjectWithTestPlansJson", localVarPath, "POST", new ArrayList<>(), exportProjectWithTestPlansJsonRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project as Zip file with test plans in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UUID exportProjectWithTestPlansZip(String id, Long timeZoneOffsetInMinutes, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    return exportProjectWithTestPlansZipWithHttpInfo(id, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest).getData();
  }

  /**
   * Export project as Zip file with test plans in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> exportProjectWithTestPlansZipWithHttpInfo(String id, Long timeZoneOffsetInMinutes, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportProjectWithTestPlansZip");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export/testPlans/zip"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.exportProjectWithTestPlansZip", localVarPath, "POST", new ArrayList<>(), exportProjectWithTestPlansJsonRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project as Zip file in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectJsonRequest  (optional)
   * @return UUID
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public UUID exportProjectZip(String id, Long timeZoneOffsetInMinutes, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    return exportProjectZipWithHttpInfo(id, timeZoneOffsetInMinutes, exportProjectJsonRequest).getData();
  }

  /**
   * Export project as Zip file in background job
   * 
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param timeZoneOffsetInMinutes  (optional)
   * @param exportProjectJsonRequest  (optional)
   * @return ApiResponse&lt;UUID&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UUID> exportProjectZipWithHttpInfo(String id, Long timeZoneOffsetInMinutes, ExportProjectJsonRequest exportProjectJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportProjectZip");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export/zip"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (timeZoneOffsetInMinutes != null) {
      localVarHeaderParams.put("time-Zone-Offset-In-Minutes", apiClient.parameterToString(timeZoneOffsetInMinutes));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<UUID> localVarReturnType = new GenericType<UUID>() {};
    return apiClient.invokeAPI("ProjectsApi.exportProjectZip", localVarPath, "POST", new ArrayList<>(), exportProjectJsonRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Export project with test plans, test suites and test points as JSON file
   * &lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public File exportWithTestPlansAndConfigurations(String id, Boolean includeAttachments, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    return exportWithTestPlansAndConfigurationsWithHttpInfo(id, includeAttachments, exportProjectWithTestPlansJsonRequest).getData();
  }

  /**
   * Export project with test plans, test suites and test points as JSON file
   * &lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              
   * @param id Specifies the ID of the project you want to export. (required)
   * @param includeAttachments Enables attachment export. (optional, default to false)
   * @param exportProjectWithTestPlansJsonRequest  (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Root section was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<File> exportWithTestPlansAndConfigurationsWithHttpInfo(String id, Boolean includeAttachments, ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling exportWithTestPlansAndConfigurations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/export-by-testPlans"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeAttachments", includeAttachments)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("ProjectsApi.exportWithTestPlansAndConfigurations", localVarPath, "POST", localVarQueryParams, exportProjectWithTestPlansJsonRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Invalid user permissions </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<ProjectModel>> getAllProjectsWithHttpInfo(Boolean isDeleted, String projectName, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectName", projectName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<ProjectModel>> localVarReturnType = new GenericType<List<ProjectModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getAllProjects", "/api/v2/projects", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Project with provided ID was not found  &lt;br&gt;- Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Project with provided ID was not found  &lt;br&gt;- Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> getAttributeByProjectIdWithHttpInfo(String id, UUID attributeId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttributeByProjectId");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling getAttributeByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/{attributeId}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};
    return apiClient.invokeAPI("ProjectsApi.getAttributeByProjectId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project attributes
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all attributes related to project  &lt;br&gt;System returns array of found attributes (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional, default to NotDeleted)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> getAttributesByProjectId(String id, DeletionState isDeleted) throws ApiException {
    return getAttributesByProjectIdWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get project attributes
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all attributes related to project  &lt;br&gt;System returns array of found attributes (listed in response model)
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional, default to NotDeleted)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> getAttributesByProjectIdWithHttpInfo(String id, DeletionState isDeleted) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAttributesByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getAttributesByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AutoTestNamespaceModel>> getAutoTestsNamespacesWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAutoTestsNamespaces");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/autoTestsNamespaces"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<AutoTestNamespaceModel>> localVarReturnType = new GenericType<List<AutoTestNamespaceModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getAutoTestsNamespaces", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 403 </td><td> Read permission for configurations required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
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
       <tr><td> 403 </td><td> Read permission for configurations required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> getConfigurationsByProjectIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationsByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/configurations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getConfigurationsByProjectId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getCustomAttributeTestPlanProjectRelations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> ID is invalid </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for projects is required </td><td>  -  </td></tr>
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
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> ID is invalid </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for projects is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProjectModel> getProjectByIdWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getProjectById");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<ProjectModel> localVarReturnType = new GenericType<ProjectModel>() {};
    return apiClient.invokeAPI("ProjectsApi.getProjectById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<SectionModel>> getSectionsByProjectIdWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSectionsByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/sections"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<SectionModel>> localVarReturnType = new GenericType<List<SectionModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getSectionsByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
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
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPlanModel>> getTestPlansByProjectIdWithHttpInfo(String id, Boolean isDeleted) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestPlansByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPlanModel>> localVarReturnType = new GenericType<List<TestPlanModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getTestPlansByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result is required </td><td>  -  </td></tr>
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
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test result is required </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   */
  public ApiResponse<List<TestRunV2GetModel>> getTestRunsByProjectIdWithHttpInfo(String id, Boolean notStarted, Boolean inProgress, Boolean stopped, Boolean completed, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, UUID testPlanId, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestRunsByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "notStarted", notStarted)
    );
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

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestRunV2GetModel>> localVarReturnType = new GenericType<List<TestRunV2GetModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getTestRunsByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
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
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<WorkItemShortModel>> getWorkItemsByProjectIdWithHttpInfo(String id, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/workItems"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tagNames", tagNames));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeIterations", includeIterations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Take", take));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchField", searchField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "SearchValue", searchValue));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.getWorkItemsByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
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
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with same id already imported in other project </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
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
       <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Entity with same id already imported in other project </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings required </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Multipart body length limit exceeded </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> importToExistingProjectWithHttpInfo(String id, Boolean includeAttachments, File _file) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling importToExistingProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/import"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "includeAttachments", includeAttachments)
    );

    // Form parameters
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    if (_file != null) {
      localVarFormParams.put("file", _file);
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("multipart/form-data");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.importToExistingProject", localVarPath, "POST", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Search for attributes used in the project
   * 
   * @param id Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectRequest  (optional)
   * @return List&lt;CustomAttributeGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeGetModel> searchAttributesInProject(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectRequest searchAttributesInProjectRequest) throws ApiException {
    return searchAttributesInProjectWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectRequest).getData();
  }

  /**
   * Search for attributes used in the project
   * 
   * @param id Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectRequest  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeGetModel>> searchAttributesInProjectWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectRequest searchAttributesInProjectRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchAttributesInProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes/search"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<CustomAttributeGetModel>> localVarReturnType = new GenericType<List<CustomAttributeGetModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.searchAttributesInProject", localVarPath, "POST", localVarQueryParams, searchAttributesInProjectRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for attributes used in the project test plans
   * 
   * @param id Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectRequest  (optional)
   * @return List&lt;CustomAttributeGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeGetModel> searchTestPlanAttributesInProject(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectRequest searchAttributesInProjectRequest) throws ApiException {
    return searchTestPlanAttributesInProjectWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectRequest).getData();
  }

  /**
   * Search for attributes used in the project test plans
   * 
   * @param id Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param searchAttributesInProjectRequest  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeGetModel>> searchTestPlanAttributesInProjectWithHttpInfo(String id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, SearchAttributesInProjectRequest searchAttributesInProjectRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchTestPlanAttributesInProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/attributes/search"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    GenericType<List<CustomAttributeGetModel>> localVarReturnType = new GenericType<List<CustomAttributeGetModel>>() {};
    return apiClient.invokeAPI("ProjectsApi.searchTestPlanAttributesInProject", localVarPath, "POST", localVarQueryParams, searchAttributesInProjectRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update attribute of project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param updateCustomAttributeTestPlanProjectRelationsRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public void updateCustomAttributeTestPlanProjectRelations(String id, UpdateCustomAttributeTestPlanProjectRelationsRequest updateCustomAttributeTestPlanProjectRelationsRequest) throws ApiException {
    updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(id, updateCustomAttributeTestPlanProjectRelationsRequest);
  }

  /**
   * Update attribute of project&#39;s test plans
   * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response
   * @param id Project internal (UUID) or global (integer) identifier (required)
   * @param updateCustomAttributeTestPlanProjectRelationsRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(String id, UpdateCustomAttributeTestPlanProjectRelationsRequest updateCustomAttributeTestPlanProjectRelationsRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/testPlans/attribute"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.updateCustomAttributeTestPlanProjectRelations", localVarPath, "PUT", new ArrayList<>(), updateCustomAttributeTestPlanProjectRelationsRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)
   * @param updateProjectRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required </td><td>  -  </td></tr>
     </table>
   */
  public void updateProject(UpdateProjectRequest updateProjectRequest) throws ApiException {
    updateProjectWithHttpInfo(updateProjectRequest);
  }

  /**
   * Update project
   * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)
   * @param updateProjectRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for projects is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Project with the same name already exists </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateProjectWithHttpInfo(UpdateProjectRequest updateProjectRequest) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.updateProject", "/api/v2/projects", "PUT", new ArrayList<>(), updateProjectRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Edit attribute of the project
   * 
   * @param id Unique or global project ID (required)
   * @param updateProjectsAttributeRequest  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public void updateProjectsAttribute(String id, UpdateProjectsAttributeRequest updateProjectsAttributeRequest) throws ApiException {
    updateProjectsAttributeWithHttpInfo(id, updateProjectsAttributeRequest);
  }

  /**
   * Edit attribute of the project
   * 
   * @param id Unique or global project ID (required)
   * @param updateProjectsAttributeRequest  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateProjectsAttributeWithHttpInfo(String id, UpdateProjectsAttributeRequest updateProjectsAttributeRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{id}/attributes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectsApi.updateProjectsAttribute", localVarPath, "PUT", new ArrayList<>(), updateProjectsAttributeRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
