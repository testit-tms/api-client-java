package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectCustomAttributeTemplateGetModel;
import ru.testit.client.model.ProjectCustomAttributesTemplatesFilterModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ProjectAttributeTemplatesApi {
  private ApiClient apiClient;

  public ProjectAttributeTemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectAttributeTemplatesApi(ApiClient apiClient) {
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
   * Search for custom attributes templates
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectCustomAttributesTemplatesFilterModel  (optional)
   * @return List&lt;ProjectCustomAttributeTemplateGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<ProjectCustomAttributeTemplateGetModel> apiV2ProjectsProjectIdAttributesTemplatesSearchPost(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectCustomAttributesTemplatesFilterModel projectCustomAttributesTemplatesFilterModel) throws ApiException {
    return apiV2ProjectsProjectIdAttributesTemplatesSearchPostWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, projectCustomAttributesTemplatesFilterModel).getData();
  }

  /**
   * Search for custom attributes templates
   * 
   * @param projectId Internal (UUID) or global (integer) identifier (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectCustomAttributesTemplatesFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;ProjectCustomAttributeTemplateGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Project admin permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ProjectCustomAttributeTemplateGetModel>> apiV2ProjectsProjectIdAttributesTemplatesSearchPostWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectCustomAttributesTemplatesFilterModel projectCustomAttributesTemplatesFilterModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesSearchPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/search"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

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
    return apiClient.invokeAPI("ProjectAttributeTemplatesApi.apiV2ProjectsProjectIdAttributesTemplatesSearchPost", localVarPath, "POST", localVarQueryParams, projectCustomAttributesTemplatesFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete CustomAttributeTemplate from Project
   *   Use case    User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution    System delete attribute template from project
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(String projectId, UUID templateId) throws ApiException {
    apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(projectId, templateId);
  }

  /**
   * Delete CustomAttributeTemplate from Project
   *   Use case    User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution    System delete attribute template from project
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDeleteWithHttpInfo(String projectId, UUID templateId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete");
    }
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/{templateId}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{templateId}", apiClient.escapeString(templateId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectAttributeTemplatesApi.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Add CustomAttributeTemplate to Project
   *   Use case    User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution    System add attribute template to project
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(String projectId, UUID templateId) throws ApiException {
    apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostWithHttpInfo(projectId, templateId);
  }

  /**
   * Add CustomAttributeTemplate to Project
   *   Use case    User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution    System add attribute template to project
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param templateId CustomAttributeTemplate internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update project settings permission for project required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a Project with identifier </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPostWithHttpInfo(String projectId, UUID templateId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost");
    }
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/templates/{templateId}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{templateId}", apiClient.escapeString(templateId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectAttributeTemplatesApi.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
