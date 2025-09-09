package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.CustomAttributeGetModel;
import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.CustomAttributeTestPlanProjectRelationPutModel;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectAttributesFilterModel;
import java.util.Set;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ProjectTestPlanAttributesApi {
  private ApiClient apiClient;

  public ProjectTestPlanAttributesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectTestPlanAttributesApi(ApiClient apiClient) {
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
   * Add attributes to project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attributes identifiers  User runs method execution  System updates project and add attributes to project for test plans  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Attributes must be global </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void createCustomAttributeTestPlanProjectRelations(String projectId, Set<UUID> UUID) throws ApiException {
    createCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId, UUID);
  }

  /**
   * Add attributes to project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attributes identifiers  User runs method execution  System updates project and add attributes to project for test plans  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  Attributes must be global </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createCustomAttributeTestPlanProjectRelationsWithHttpInfo(String projectId, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling createCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectTestPlanAttributesApi.createCustomAttributeTestPlanProjectRelations", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete attribute from project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attribute identifier  User runs method execution  System updates project and delete attribute from project for test plans  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCustomAttributeTestPlanProjectRelations(String projectId, UUID attributeId) throws ApiException {
    deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId, attributeId);
  }

  /**
   * Delete attribute from project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attribute identifier  User runs method execution  System updates project and delete attribute from project for test plans  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(String projectId, UUID attributeId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling deleteCustomAttributeTestPlanProjectRelations");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/attributes/{attributeId}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectTestPlanAttributesApi.deleteCustomAttributeTestPlanProjectRelations", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get project&#39;s test plan attributes
   *  Use case  User runs method execution  System returns project for test plans attributes by project identifier
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> getCustomAttributeTestPlanProjectRelations(String projectId) throws ApiException {
    return getCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId).getData();
  }

  /**
   * Get project&#39;s test plan attributes
   *  Use case  User runs method execution  System returns project for test plans attributes by project identifier
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> getCustomAttributeTestPlanProjectRelationsWithHttpInfo(String projectId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};
    return apiClient.invokeAPI("ProjectTestPlanAttributesApi.getCustomAttributeTestPlanProjectRelations", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for attributes used in the project test plans
   * 
   * @param projectId Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectAttributesFilterModel  (optional)
   * @return List&lt;CustomAttributeGetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeGetModel> searchTestPlanAttributesInProject(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectAttributesFilterModel projectAttributesFilterModel) throws ApiException {
    return searchTestPlanAttributesInProjectWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel).getData();
  }

  /**
   * Search for attributes used in the project test plans
   * 
   * @param projectId Unique or global project ID (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param projectAttributesFilterModel  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeGetModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for project is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeGetModel>> searchTestPlanAttributesInProjectWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectAttributesFilterModel projectAttributesFilterModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling searchTestPlanAttributesInProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/attributes/search"
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
    GenericType<List<CustomAttributeGetModel>> localVarReturnType = new GenericType<List<CustomAttributeGetModel>>() {};
    return apiClient.invokeAPI("ProjectTestPlanAttributesApi.searchTestPlanAttributesInProject", localVarPath, "POST", localVarQueryParams, projectAttributesFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update attribute of project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attribute model  User runs method execution  System updates project and project attribute for test plan  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributeTestPlanProjectRelationPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void updateCustomAttributeTestPlanProjectRelations(String projectId, CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel) throws ApiException {
    updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId, customAttributeTestPlanProjectRelationPutModel);
  }

  /**
   * Update attribute of project&#39;s test plans
   *  Use case  User sets project internal or global identifier and attribute model  User runs method execution  System updates project and project attribute for test plan  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributeTestPlanProjectRelationPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(String projectId, CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling updateCustomAttributeTestPlanProjectRelations");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/testPlans/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectTestPlanAttributesApi.updateCustomAttributeTestPlanProjectRelations", localVarPath, "PUT", new ArrayList<>(), customAttributeTestPlanProjectRelationPutModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
