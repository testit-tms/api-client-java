package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import java.util.Set;
import ru.testit.client.model.TestPointByTestSuiteModel;
import ru.testit.client.model.TestResultV2ShortModel;
import ru.testit.client.model.TestSuiteApiResult;
import ru.testit.client.model.TestSuiteV2GetModel;
import ru.testit.client.model.TestSuiteV2PostModel;
import ru.testit.client.model.TestSuiteV2PutModel;
import ru.testit.client.model.TestSuiteWorkItemsSearchModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemSelectModel;
import ru.testit.client.model.WorkItemShortModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TestSuitesApi {
  private ApiClient apiClient;

  public TestSuitesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TestSuitesApi(ApiClient apiClient) {
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
   * Add test-points to test suite
   * 
   * @param id Test suite internal identifier (required)
   * @param workItemSelectModel Filter object to retrieve work items for test-suite&#39;s project (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
     </table>
   */
  public void addTestPointsToTestSuite(UUID id, WorkItemSelectModel workItemSelectModel) throws ApiException {
    addTestPointsToTestSuiteWithHttpInfo(id, workItemSelectModel);
  }

  /**
   * Add test-points to test suite
   * 
   * @param id Test suite internal identifier (required)
   * @param workItemSelectModel Filter object to retrieve work items for test-suite&#39;s project (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addTestPointsToTestSuiteWithHttpInfo(UUID id, WorkItemSelectModel workItemSelectModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addTestPointsToTestSuite");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/test-points"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.addTestPointsToTestSuite", localVarPath, "POST", new ArrayList<>(), workItemSelectModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Patch test suite
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Test Suite internal (UUID) identifier (required)
   * @param operation  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test suite is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestSuitesIdPatch(UUID id, List<Operation> operation) throws ApiException {
    apiV2TestSuitesIdPatchWithHttpInfo(id, operation);
  }

  /**
   * Patch test suite
   * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
   * @param id Test Suite internal (UUID) identifier (required)
   * @param operation  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test suite is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestSuitesIdPatchWithHttpInfo(UUID id, List<Operation> operation) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestSuitesIdPatch");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.apiV2TestSuitesIdPatch", localVarPath, "PATCH", new ArrayList<>(), operation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Refresh test suite. Only dynamic test suites are supported by this method
   * 
   * @param id Test Suite internal (UUID) identifier (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test suite is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestSuitesIdRefreshPost(UUID id) throws ApiException {
    apiV2TestSuitesIdRefreshPostWithHttpInfo(id);
  }

  /**
   * Refresh test suite. Only dynamic test suites are supported by this method
   * 
   * @param id Test Suite internal (UUID) identifier (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test suite is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestSuitesIdRefreshPostWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestSuitesIdRefreshPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/refresh"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.apiV2TestSuitesIdRefreshPost", localVarPath, "POST", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Set work items for test suite
   * 
   * @param id Unique ID of the test suite (required)
   * @param UUID  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestSuitesIdWorkItemsPost(UUID id, Set<UUID> UUID) throws ApiException {
    apiV2TestSuitesIdWorkItemsPostWithHttpInfo(id, UUID);
  }

  /**
   * Set work items for test suite
   * 
   * @param id Unique ID of the test suite (required)
   * @param UUID  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestSuitesIdWorkItemsPostWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2TestSuitesIdWorkItemsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/workItems"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.apiV2TestSuitesIdWorkItemsPost", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create test suite
   * 
   * @param testSuiteV2PostModel  (optional)
   * @return TestSuiteV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestSuiteV2GetModel apiV2TestSuitesPost(TestSuiteV2PostModel testSuiteV2PostModel) throws ApiException {
    return apiV2TestSuitesPostWithHttpInfo(testSuiteV2PostModel).getData();
  }

  /**
   * Create test suite
   * 
   * @param testSuiteV2PostModel  (optional)
   * @return ApiResponse&lt;TestSuiteV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestSuiteV2GetModel> apiV2TestSuitesPostWithHttpInfo(TestSuiteV2PostModel testSuiteV2PostModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestSuiteV2GetModel> localVarReturnType = new GenericType<TestSuiteV2GetModel>() {};
    return apiClient.invokeAPI("TestSuitesApi.apiV2TestSuitesPost", "/api/v2/testSuites", "POST", new ArrayList<>(), testSuiteV2PostModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit test suite
   * 
   * @param testSuiteV2PutModel  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void apiV2TestSuitesPut(TestSuiteV2PutModel testSuiteV2PutModel) throws ApiException {
    apiV2TestSuitesPutWithHttpInfo(testSuiteV2PutModel);
  }

  /**
   * Edit test suite
   * 
   * @param testSuiteV2PutModel  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> apiV2TestSuitesPutWithHttpInfo(TestSuiteV2PutModel testSuiteV2PutModel) throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.apiV2TestSuitesPut", "/api/v2/testSuites", "PUT", new ArrayList<>(), testSuiteV2PutModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete TestSuite
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System deletes test suite    System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTestSuite(UUID id) throws ApiException {
    deleteTestSuiteWithHttpInfo(id);
  }

  /**
   * Delete TestSuite
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System deletes test suite    System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTestSuiteWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTestSuite");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.deleteTestSuite", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get Configurations By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search configurations related to the test points    System returns configurations array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<ConfigurationModel> getConfigurationsByTestSuiteId(UUID id) throws ApiException {
    return getConfigurationsByTestSuiteIdWithHttpInfo(id).getData();
  }

  /**
   * Get Configurations By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search configurations related to the test points    System returns configurations array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> getConfigurationsByTestSuiteIdWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationsByTestSuiteId");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/configurations"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};
    return apiClient.invokeAPI("TestSuitesApi.getConfigurationsByTestSuiteId", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestPoints By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System returns test points array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;TestPointByTestSuiteModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointByTestSuiteModel> getTestPointsById(UUID id) throws ApiException {
    return getTestPointsByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestPoints By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System returns test points array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;TestPointByTestSuiteModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointByTestSuiteModel>> getTestPointsByIdWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestPointsById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/testPoints"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestPointByTestSuiteModel>> localVarReturnType = new GenericType<List<TestPointByTestSuiteModel>>() {};
    return apiClient.invokeAPI("TestSuitesApi.getTestPointsById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestResults By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search test results related to the test points    System returns test results array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;TestResultV2ShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultV2ShortModel> getTestResultsById(UUID id) throws ApiException {
    return getTestResultsByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestResults By Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search test results related to the test points    System returns test results array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;TestResultV2ShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultV2ShortModel>> getTestResultsByIdWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestResultsById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/testResults"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<List<TestResultV2ShortModel>> localVarReturnType = new GenericType<List<TestResultV2ShortModel>>() {};
    return apiClient.invokeAPI("TestSuitesApi.getTestResultsById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestSuite by Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System returns test suite
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return TestSuiteApiResult
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public TestSuiteApiResult getTestSuiteById(UUID id) throws ApiException {
    return getTestSuiteByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestSuite by Id
   *   Use case    User sets test suite identifier    User runs method execution    System search test suite by identifier    System returns test suite
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;TestSuiteApiResult&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestSuiteApiResult> getTestSuiteByIdWithHttpInfo(UUID id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestSuiteById");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    GenericType<TestSuiteApiResult> localVarReturnType = new GenericType<TestSuiteApiResult>() {};
    return apiClient.invokeAPI("TestSuitesApi.getTestSuiteById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search WorkItems
   *   Use case    User sets test suite identifier    [Optional] User sets filter    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search work items related to the test points    [Optional] User sets filter, system applies filter    System returns work items array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testSuiteWorkItemsSearchModel  (optional)
   * @return List&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<WorkItemShortModel> searchWorkItems(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel) throws ApiException {
    return searchWorkItemsWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel).getData();
  }

  /**
   * Search WorkItems
   *   Use case    User sets test suite identifier    [Optional] User sets filter    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search work items related to the test points    [Optional] User sets filter, system applies filter    System returns work items array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param skip Amount of items to be skipped (offset) (optional)
   * @param take Amount of items to be taken (limit) (optional)
   * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
   * @param searchField Property name for searching (optional)
   * @param searchValue Value for searching (optional)
   * @param testSuiteWorkItemsSearchModel  (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<WorkItemShortModel>> searchWorkItemsWithHttpInfo(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchWorkItems");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/workItems/search"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

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
    return apiClient.invokeAPI("TestSuitesApi.searchWorkItems", localVarPath, "POST", localVarQueryParams, testSuiteWorkItemsSearchModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set Configurations By TestSuite Id
   *   Use case    User sets test suite identifier    User sets collection of configuration identifiers    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search configuration    System restores(if exist) or creates test points with listed configuration    System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of configuration identifiers\&quot; (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Some of Configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public void setConfigurationsByTestSuiteId(UUID id, Set<UUID> UUID) throws ApiException {
    setConfigurationsByTestSuiteIdWithHttpInfo(id, UUID);
  }

  /**
   * Set Configurations By TestSuite Id
   *   Use case    User sets test suite identifier    User sets collection of configuration identifiers    User runs method execution    System search test suite by identifier    System search test points related to the test suite    System search configuration    System restores(if exist) or creates test points with listed configuration    System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of configuration identifiers\&quot; (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td>   Some of Configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td>   Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> setConfigurationsByTestSuiteIdWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setConfigurationsByTestSuiteId");
    }

    // Path parameters
    String localVarPath = "/api/v2/testSuites/{id}/configurations"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"Bearer or PrivateToken"};
    return apiClient.invokeAPI("TestSuitesApi.setConfigurationsByTestSuiteId", localVarPath, "POST", new ArrayList<>(), UUID,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
