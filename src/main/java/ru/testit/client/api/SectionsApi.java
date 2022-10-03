package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.SectionMoveModel;
import ru.testit.client.model.SectionPostModel;
import ru.testit.client.model.SectionPutModel;
import ru.testit.client.model.SectionRenameModel;
import ru.testit.client.model.SectionWithStepsModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemShortModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SectionsApi {
  private ApiClient apiClient;

  public SectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SectionsApi(ApiClient apiClient) {
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
   * Create section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates section property values  &lt;br&gt;System returns section (listed in response example)
   * @param sectionPostModel  (optional)
   * @return SectionWithStepsModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Cannot create section without parent ID </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parent section with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public SectionWithStepsModel createSection(SectionPostModel sectionPostModel) throws ApiException {
    return createSectionWithHttpInfo(sectionPostModel).getData();
  }

  /**
   * Create section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates section property values  &lt;br&gt;System returns section (listed in response example)
   * @param sectionPostModel  (optional)
   * @return ApiResponse&lt;SectionWithStepsModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Cannot create section without parent ID </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Parent section with provided ID was not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SectionWithStepsModel> createSectionWithHttpInfo(SectionPostModel sectionPostModel) throws ApiException {
    Object localVarPostBody = sectionPostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/sections";

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

    GenericType<SectionWithStepsModel> localVarReturnType = new GenericType<SectionWithStepsModel>() {};

    return apiClient.invokeAPI("SectionsApi.createSection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search and delete nested sections of the found section  &lt;br&gt;System search and delete workitems related to the found nested sections  &lt;br&gt;System deletes initial section and related workitem  &lt;br&gt;System returns no content response
   * @param id Section internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot delete root section </td><td>  -  </td></tr>
     </table>
   */
  public void deleteSection(UUID id) throws ApiException {
    deleteSectionWithHttpInfo(id);
  }

  /**
   * Delete section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search and delete nested sections of the found section  &lt;br&gt;System search and delete workitems related to the found nested sections  &lt;br&gt;System deletes initial section and related workitem  &lt;br&gt;System returns no content response
   * @param id Section internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot delete root section </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteSectionWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSection");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/sections/{id}"
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

    return apiClient.invokeAPI("SectionsApi.deleteSection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the section identifier  &lt;br&gt;              [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                &lt;br&gt;System returns section
   * @param id Section internal (UUID) identifier (required)
   * @param isDeleted Requested section is deleted (optional, default to false)
   * @return SectionWithStepsModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public SectionWithStepsModel getSectionById(UUID id, Boolean isDeleted) throws ApiException {
    return getSectionByIdWithHttpInfo(id, isDeleted).getData();
  }

  /**
   * Get section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the section identifier  &lt;br&gt;              [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                &lt;br&gt;System returns section
   * @param id Section internal (UUID) identifier (required)
   * @param isDeleted Requested section is deleted (optional, default to false)
   * @return ApiResponse&lt;SectionWithStepsModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SectionWithStepsModel> getSectionByIdWithHttpInfo(UUID id, Boolean isDeleted) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSectionById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/sections/{id}"
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

    GenericType<SectionWithStepsModel> localVarReturnType = new GenericType<SectionWithStepsModel>() {};

    return apiClient.invokeAPI("SectionsApi.getSectionById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get section work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search work items related to the section  &lt;br&gt;              [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                &lt;br&gt;System returns work item collection
   * @param id Section internal (UUID) identifier (required)
   * @param isDeleted Requested section is deleted (optional, default to false)
   * @param tagNames List of work item tags (optional)
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
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; symbols  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortModel> getWorkItemsBySectionId(UUID id, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getWorkItemsBySectionIdWithHttpInfo(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * Get section work items
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search work items related to the section  &lt;br&gt;              [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                &lt;br&gt;System returns work item collection
   * @param id Section internal (UUID) identifier (required)
   * @param isDeleted Requested section is deleted (optional, default to false)
   * @param tagNames List of work item tags (optional)
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
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; symbols  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test library is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortModel>> getWorkItemsBySectionIdWithHttpInfo(UUID id, Boolean isDeleted, List<String> tagNames, Boolean includeIterations, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsBySectionId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/sections/{id}/workItems"
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

    return apiClient.invokeAPI("SectionsApi.getWorkItemsBySectionId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Move section
   * &lt;br&gt;Can be moved inside another section. It is possible to indicate a project  &lt;br&gt;Use case  &lt;br&gt;User sets section identifier, old parent identifier, parent identifier and  next section identifier (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System unlink section from the old parent and links to the new one  &lt;br&gt;System updates section rank using the next section identifier  &lt;br&gt;System returns no content response
   * @param sectionMoveModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Action leads to section loop </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Section with provided ID was not found  &lt;br&gt;- Parent section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section was modified </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot move root section </td><td>  -  </td></tr>
     </table>
   */
  public void move(SectionMoveModel sectionMoveModel) throws ApiException {
    moveWithHttpInfo(sectionMoveModel);
  }

  /**
   * Move section
   * &lt;br&gt;Can be moved inside another section. It is possible to indicate a project  &lt;br&gt;Use case  &lt;br&gt;User sets section identifier, old parent identifier, parent identifier and  next section identifier (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System unlink section from the old parent and links to the new one  &lt;br&gt;System updates section rank using the next section identifier  &lt;br&gt;System returns no content response
   * @param sectionMoveModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Action leads to section loop </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Section with provided ID was not found  &lt;br&gt;- Parent section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section was modified </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Cannot move root section </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> moveWithHttpInfo(SectionMoveModel sectionMoveModel) throws ApiException {
    Object localVarPostBody = sectionMoveModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/sections/move";

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

    return apiClient.invokeAPI("SectionsApi.move", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Rename section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier and new name (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section name using the new name  &lt;br&gt;System returns no content response
   * @param sectionRenameModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Root section cannot be renamed </td><td>  -  </td></tr>
     </table>
   */
  public void rename(SectionRenameModel sectionRenameModel) throws ApiException {
    renameWithHttpInfo(sectionRenameModel);
  }

  /**
   * Rename section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section identifier and new name (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section name using the new name  &lt;br&gt;System returns no content response
   * @param sectionRenameModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Section with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Root section cannot be renamed </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> renameWithHttpInfo(SectionRenameModel sectionRenameModel) throws ApiException {
    Object localVarPostBody = sectionRenameModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/sections/rename";

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

    return apiClient.invokeAPI("SectionsApi.rename", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section using the property values  &lt;br&gt;System returns no content response
   * @param sectionPutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Root section cannot be edited  &lt;br&gt;- Parent ID cannot be changed  &lt;br&gt;- Project ID cannot be changed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Root section cannot be create </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Section cannot be found  &lt;br&gt;- Parent section cannot be found  &lt;br&gt;- Project cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
     </table>
   */
  public void updateSection(SectionPutModel sectionPutModel) throws ApiException {
    updateSectionWithHttpInfo(sectionPutModel);
  }

  /**
   * Update section
   * &lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section using the property values  &lt;br&gt;System returns no content response
   * @param sectionPutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;- Root section cannot be edited  &lt;br&gt;- Parent ID cannot be changed  &lt;br&gt;- Project ID cannot be changed </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;- ID is invalid  &lt;br&gt;- Root section cannot be create </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test library is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;- Section cannot be found  &lt;br&gt;- Parent section cannot be found  &lt;br&gt;- Project cannot be found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Section with the same name already exists in the parent section </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateSectionWithHttpInfo(SectionPutModel sectionPutModel) throws ApiException {
    Object localVarPostBody = sectionPutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/sections";

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

    return apiClient.invokeAPI("SectionsApi.updateSection", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
