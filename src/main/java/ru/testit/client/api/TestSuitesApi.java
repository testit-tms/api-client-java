package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.ProblemDetails;
import java.util.Set;
import ru.testit.client.model.TestPointByTestSuiteModel;
import ru.testit.client.model.TestResultV2ShortModel;
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
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Test suite with provided ID was not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Shared steps cannot be added to test suite </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan is required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addTestPointsToTestSuiteWithHttpInfo(UUID id, WorkItemSelectModel workItemSelectModel) throws ApiException {
    Object localVarPostBody = workItemSelectModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addTestPointsToTestSuite");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/test-points"
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

    return apiClient.invokeAPI("TestSuitesApi.addTestPointsToTestSuite", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Create TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test suite  &lt;br&gt;System returns test suite
   * @param testSuiteV2PostModel  (optional)
   * @return TestSuiteV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
     </table>
   */
  public TestSuiteV2GetModel createTestSuite(TestSuiteV2PostModel testSuiteV2PostModel) throws ApiException {
    return createTestSuiteWithHttpInfo(testSuiteV2PostModel).getData();
  }

  /**
   * Create TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test suite  &lt;br&gt;System returns test suite
   * @param testSuiteV2PostModel  (optional)
   * @return ApiResponse&lt;TestSuiteV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestSuiteV2GetModel> createTestSuiteWithHttpInfo(TestSuiteV2PostModel testSuiteV2PostModel) throws ApiException {
    Object localVarPostBody = testSuiteV2PostModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites";

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

    GenericType<TestSuiteV2GetModel> localVarReturnType = new GenericType<TestSuiteV2GetModel>() {};

    return apiClient.invokeAPI("TestSuitesApi.createTestSuite", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System deletes test suite  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public String deleteTestSuite(UUID id) throws ApiException {
    return deleteTestSuiteWithHttpInfo(id).getData();
  }

  /**
   * Delete TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System deletes test suite  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Delete permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> deleteTestSuiteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTestSuite");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("TestSuitesApi.deleteTestSuite", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Configurations By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configurations related to the test points  &lt;br&gt;System returns configurations array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public List<ConfigurationModel> getConfigurationsByTestSuiteId(UUID id) throws ApiException {
    return getConfigurationsByTestSuiteIdWithHttpInfo(id).getData();
  }

  /**
   * Get Configurations By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configurations related to the test points  &lt;br&gt;System returns configurations array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> getConfigurationsByTestSuiteIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getConfigurationsByTestSuiteId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/configurations"
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

    return apiClient.invokeAPI("TestSuitesApi.getConfigurationsByTestSuiteId", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestPoints By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System returns test points array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;TestPointByTestSuiteModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public List<TestPointByTestSuiteModel> getTestPointsById(UUID id) throws ApiException {
    return getTestPointsByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestPoints By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System returns test points array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;TestPointByTestSuiteModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestPointByTestSuiteModel>> getTestPointsByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestPointsById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/testPoints"
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

    GenericType<List<TestPointByTestSuiteModel>> localVarReturnType = new GenericType<List<TestPointByTestSuiteModel>>() {};

    return apiClient.invokeAPI("TestSuitesApi.getTestPointsById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestResults By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search test results related to the test points  &lt;br&gt;System returns test results array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return List&lt;TestResultV2ShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public List<TestResultV2ShortModel> getTestResultsById(UUID id) throws ApiException {
    return getTestResultsByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestResults By Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search test results related to the test points  &lt;br&gt;System returns test results array
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;List&lt;TestResultV2ShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<TestResultV2ShortModel>> getTestResultsByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestResultsById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/testResults"
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

    GenericType<List<TestResultV2ShortModel>> localVarReturnType = new GenericType<List<TestResultV2ShortModel>>() {};

    return apiClient.invokeAPI("TestSuitesApi.getTestResultsById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get TestSuite by Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System returns test suite
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return TestSuiteV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public TestSuiteV2GetModel getTestSuiteById(UUID id) throws ApiException {
    return getTestSuiteByIdWithHttpInfo(id).getData();
  }

  /**
   * Get TestSuite by Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System returns test suite
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @return ApiResponse&lt;TestSuiteV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Read permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestSuiteV2GetModel> getTestSuiteByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTestSuiteById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}"
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

    GenericType<TestSuiteV2GetModel> localVarReturnType = new GenericType<TestSuiteV2GetModel>() {};

    return apiClient.invokeAPI("TestSuitesApi.getTestSuiteById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id  (required)
   * @param isDeleted  (optional, default to false)
   * @param tagNames  (optional)
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
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public List<WorkItemShortModel> getWorkItemsById(UUID id, Boolean isDeleted, List<String> tagNames, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    return getWorkItemsByIdWithHttpInfo(id, isDeleted, tagNames, skip, take, orderBy, searchField, searchValue).getData();
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param isDeleted  (optional, default to false)
   * @param tagNames  (optional)
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
       <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<WorkItemShortModel>> getWorkItemsByIdWithHttpInfo(UUID id, Boolean isDeleted, List<String> tagNames, Integer skip, Integer take, String orderBy, String searchField, String searchValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkItemsById");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/workItems"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDeleted", isDeleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tagNames", tagNames));
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

    return apiClient.invokeAPI("TestSuitesApi.getWorkItemsById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search WorkItems
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;[Optional] User sets filter  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems related to the test points  &lt;br&gt;                      [Optional] User sets filter, system applies filter                     &lt;br&gt;System returns workitems array
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
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortModel> searchWorkItems(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel) throws ApiException {
    return searchWorkItemsWithHttpInfo(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel).getData();
  }

  /**
   * Search WorkItems
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;[Optional] User sets filter  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems related to the test points  &lt;br&gt;                      [Optional] User sets filter, system applies filter                     &lt;br&gt;System returns workitems array
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
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id! </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortModel>> searchWorkItemsWithHttpInfo(UUID id, Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel) throws ApiException {
    Object localVarPostBody = testSuiteWorkItemsSearchModel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchWorkItems");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/workItems/search"
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

    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};

    return apiClient.invokeAPI("TestSuitesApi.searchWorkItems", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set Configurations By TestSuite Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of configuration identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configuration  &lt;br&gt;System restores(if exist) or creates test points with listed configuration  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of configuration identifiers\&quot; (optional)
   * @return List&lt;ConfigurationModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Some of Configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public List<ConfigurationModel> setConfigurationsByTestSuiteId(UUID id, Set<UUID> UUID) throws ApiException {
    return setConfigurationsByTestSuiteIdWithHttpInfo(id, UUID).getData();
  }

  /**
   * Set Configurations By TestSuite Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of configuration identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configuration  &lt;br&gt;System restores(if exist) or creates test points with listed configuration  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of configuration identifiers\&quot; (optional)
   * @return ApiResponse&lt;List&lt;ConfigurationModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Some of Configurations do not exist in the project, or they are not active </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ConfigurationModel>> setConfigurationsByTestSuiteIdWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    Object localVarPostBody = UUID;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setConfigurationsByTestSuiteId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/configurations"
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

    GenericType<List<ConfigurationModel>> localVarReturnType = new GenericType<List<ConfigurationModel>>() {};

    return apiClient.invokeAPI("TestSuitesApi.setConfigurationsByTestSuiteId", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set WorkItems By TestSuite Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of workitems identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems  &lt;br&gt;System restores(if exist) or creates test points with listed workitems  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of workitem identifiers\&quot; (optional)
   * @return List&lt;WorkItemShortModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id  &lt;br&gt;Some of WorkItems does not exist or deleted </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;can&#39;t put a SharedStep in the TestSuite  &lt;br&gt;ProjectId must be the same for TestSuites </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public List<WorkItemShortModel> setWorkItemsByTestSuiteId(UUID id, Set<UUID> UUID) throws ApiException {
    return setWorkItemsByTestSuiteIdWithHttpInfo(id, UUID).getData();
  }

  /**
   * Set WorkItems By TestSuite Id
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of workitems identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems  &lt;br&gt;System restores(if exist) or creates test points with listed workitems  &lt;br&gt;System returns no content response
   * @param id Test suite internal (guid format) identifier\&quot; (required)
   * @param UUID Collection of workitem identifiers\&quot; (optional)
   * @return ApiResponse&lt;List&lt;WorkItemShortModel&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestSuite with id  &lt;br&gt;Some of WorkItems does not exist or deleted </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> &lt;br&gt;can&#39;t put a SharedStep in the TestSuite  &lt;br&gt;ProjectId must be the same for TestSuites </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<WorkItemShortModel>> setWorkItemsByTestSuiteIdWithHttpInfo(UUID id, Set<UUID> UUID) throws ApiException {
    Object localVarPostBody = UUID;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setWorkItemsByTestSuiteId");
    }
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites/{id}/workItems"
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

    GenericType<List<WorkItemShortModel>> localVarReturnType = new GenericType<List<WorkItemShortModel>>() {};

    return apiClient.invokeAPI("TestSuitesApi.setWorkItemsByTestSuiteId", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test suite  &lt;br&gt;System returns test suite
   * @param testSuiteV2PutModel  (optional)
   * @return TestSuiteV2GetModel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public TestSuiteV2GetModel updateTestSuite(TestSuiteV2PutModel testSuiteV2PutModel) throws ApiException {
    return updateTestSuiteWithHttpInfo(testSuiteV2PutModel).getData();
  }

  /**
   * Update TestSuite
   * &lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test suite  &lt;br&gt;System returns test suite
   * @param testSuiteV2PutModel  (optional)
   * @return ApiResponse&lt;TestSuiteV2GetModel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Update permission for test plan required </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestSuiteV2GetModel> updateTestSuiteWithHttpInfo(TestSuiteV2PutModel testSuiteV2PutModel) throws ApiException {
    Object localVarPostBody = testSuiteV2PutModel;
    
    // create path and map variables
    String localVarPath = "/api/v2/testSuites";

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

    GenericType<TestSuiteV2GetModel> localVarReturnType = new GenericType<TestSuiteV2GetModel>() {};

    return apiClient.invokeAPI("TestSuitesApi.updateTestSuite", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
