package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.CustomAttributeGetModel;
import ru.testit.client.model.CustomAttributeModel;
import ru.testit.client.model.CustomAttributePostModel;
import ru.testit.client.model.CustomAttributePutModel;
import ru.testit.client.model.DeletionState;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectAttributesFilterModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ProjectAttributesApi {
  private ApiClient apiClient;

  public ProjectAttributesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectAttributesApi(ApiClient apiClient) {
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
   * Create project attribute
   *  Use case  User sets attribute parameters (listed in request example) and runs method execution  System search project  System creates attribute and relates it to the project  System returns project attribute properties (example listed in response parameters)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePostModel  (optional)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Attribute is &#x60;null&#x60;  - Priority is invalid  - Attribute with &#x60;Options&#x60; type must have an options  - ID is not &#x60;null&#x60;  - Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td>  &#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel createProjectsAttribute(String projectId, CustomAttributePostModel customAttributePostModel) throws ApiException {
    return createProjectsAttributeWithHttpInfo(projectId, customAttributePostModel).getData();
  }

  /**
   * Create project attribute
   *  Use case  User sets attribute parameters (listed in request example) and runs method execution  System search project  System creates attribute and relates it to the project  System returns project attribute properties (example listed in response parameters)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param customAttributePostModel  (optional)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Attribute is &#x60;null&#x60;  - Priority is invalid  - Attribute with &#x60;Options&#x60; type must have an options  - ID is not &#x60;null&#x60;  - Option ID is not &#x60;null&#x60; </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td>  &#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot add new attribute from template which is in use </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> createProjectsAttributeWithHttpInfo(String projectId, CustomAttributePostModel customAttributePostModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling createProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};
    return apiClient.invokeAPI("ProjectAttributesApi.createProjectsAttribute", localVarPath, "POST", new ArrayList<>(), customAttributePostModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete project attribute
   *  Use case  User sets project identifier and runs method execution  User sets attribute identifier  User runs method execution  System search project  System search and delete attribute  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Project ID is invalid  - Project attribute ID is invalid  - Attribute is empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteProjectsAttribute(String projectId, UUID attributeId) throws ApiException {
    deleteProjectsAttributeWithHttpInfo(projectId, attributeId);
  }

  /**
   * Delete project attribute
   *  Use case  User sets project identifier and runs method execution  User sets attribute identifier  User runs method execution  System search project  System search and delete attribute  System returns no content response
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>  - Project ID is invalid  - Project attribute ID is invalid  - Attribute is empty </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for project settings is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Project with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteProjectsAttributeWithHttpInfo(String projectId, UUID attributeId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling deleteProjectsAttribute");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling deleteProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/{attributeId}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectAttributesApi.deleteProjectsAttribute", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get project attribute
   *  Use case  User sets project internal or global identifier  User sets project attribute identifier  User runs method execution  System search project  System search project attribute  System returns project attribute (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @return CustomAttributeModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  - Project with provided ID was not found  - Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public CustomAttributeModel getAttributeByProjectId(String projectId, UUID attributeId) throws ApiException {
    return getAttributeByProjectIdWithHttpInfo(projectId, attributeId).getData();
  }

  /**
   * Get project attribute
   *  Use case  User sets project internal or global identifier  User sets project attribute identifier  User runs method execution  System search project  System search project attribute  System returns project attribute (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param attributeId Project attribute internal (UUID) or global (integer) identifier (required)
   * @return ApiResponse&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>  - Project with provided ID was not found  - Project attribute with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomAttributeModel> getAttributeByProjectIdWithHttpInfo(String projectId, UUID attributeId) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getAttributeByProjectId");
    }
    if (attributeId == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeId' when calling getAttributeByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/{attributeId}"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()))
            .replaceAll("\\{attributeId}", apiClient.escapeString(attributeId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<CustomAttributeModel> localVarReturnType = new GenericType<CustomAttributeModel>() {};
    return apiClient.invokeAPI("ProjectAttributesApi.getAttributeByProjectId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get project attributes
   *  Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  [Optional] If User did not set isDeleted field value, System search all attributes related to project  System returns array of found attributes (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional)
   * @return List&lt;CustomAttributeModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<CustomAttributeModel> getAttributesByProjectId(String projectId, DeletionState isDeleted) throws ApiException {
    return getAttributesByProjectIdWithHttpInfo(projectId, isDeleted).getData();
  }

  /**
   * Get project attributes
   *  Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  [Optional] If User did not set isDeleted field value, System search all attributes related to project  System returns array of found attributes (listed in response model)
   * @param projectId Project internal (UUID) or global (integer) identifier (required)
   * @param isDeleted  (optional)
   * @return ApiResponse&lt;List&lt;CustomAttributeModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CustomAttributeModel>> getAttributesByProjectIdWithHttpInfo(String projectId, DeletionState isDeleted) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getAttributesByProjectId");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "isDeleted", isDeleted)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<CustomAttributeModel>> localVarReturnType = new GenericType<List<CustomAttributeModel>>() {};
    return apiClient.invokeAPI("ProjectAttributesApi.getAttributesByProjectId", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for attributes used in the project
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
     <table border="1">
       <caption>Response Details</caption>
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
  public List<CustomAttributeGetModel> searchAttributesInProject(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectAttributesFilterModel projectAttributesFilterModel) throws ApiException {
    return searchAttributesInProjectWithHttpInfo(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel).getData();
  }

  /**
   * Search for attributes used in the project
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
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<List<CustomAttributeGetModel>> searchAttributesInProjectWithHttpInfo(String projectId, Integer skip, Integer take, String orderBy, String searchField, String searchValue, ProjectAttributesFilterModel projectAttributesFilterModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling searchAttributesInProject");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes/search"
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
    return apiClient.invokeAPI("ProjectAttributesApi.searchAttributesInProject", localVarPath, "POST", localVarQueryParams, projectAttributesFilterModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit attribute of the project
   * 
   * @param projectId Unique or global project ID (required)
   * @param customAttributePutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public void updateProjectsAttribute(String projectId, CustomAttributePutModel customAttributePutModel) throws ApiException {
    updateProjectsAttributeWithHttpInfo(projectId, customAttributePutModel);
  }

  /**
   * Edit attribute of the project
   * 
   * @param projectId Unique or global project ID (required)
   * @param customAttributePutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
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
  public ApiResponse<Void> updateProjectsAttributeWithHttpInfo(String projectId, CustomAttributePutModel customAttributePutModel) throws ApiException {
    // Check required parameters
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling updateProjectsAttribute");
    }

    // Path parameters
    String localVarPath = "/api/v2/projects/{projectId}/attributes"
            .replaceAll("\\{projectId}", apiClient.escapeString(projectId.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("ProjectAttributesApi.updateProjectsAttribute", localVarPath, "PUT", new ArrayList<>(), customAttributePutModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
