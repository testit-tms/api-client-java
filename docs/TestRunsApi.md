# TestRunsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TestRunsIdStatisticsFilterPost**](TestRunsApi.md#apiV2TestRunsIdStatisticsFilterPost) | **POST** /api/v2/testRuns/{id}/statistics/filter | Search for the test run test results and build statistics |
| [**apiV2TestRunsIdTestPointsResultsGet**](TestRunsApi.md#apiV2TestRunsIdTestPointsResultsGet) | **GET** /api/v2/testRuns/{id}/testPoints/results | Get test results from the test run grouped by test points |
| [**apiV2TestRunsIdTestResultsBulkPut**](TestRunsApi.md#apiV2TestRunsIdTestResultsBulkPut) | **PUT** /api/v2/testRuns/{id}/testResults/bulk | Partial edit of multiple test results in the test run |
| [**apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**](TestRunsApi.md#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet) | **GET** /api/v2/testRuns/{id}/testResults/lastModified/modificationDate | Get modification date of last test result of the test run |
| [**apiV2TestRunsSearchPost**](TestRunsApi.md#apiV2TestRunsSearchPost) | **POST** /api/v2/testRuns/search | Search for test runs |
| [**apiV2TestRunsUpdateMultiplePost**](TestRunsApi.md#apiV2TestRunsUpdateMultiplePost) | **POST** /api/v2/testRuns/updateMultiple | Update multiple test runs |
| [**completeTestRun**](TestRunsApi.md#completeTestRun) | **POST** /api/v2/testRuns/{id}/complete | Complete TestRun |
| [**createAndFillByAutoTests**](TestRunsApi.md#createAndFillByAutoTests) | **POST** /api/v2/testRuns/byAutoTests | Create test runs based on autotests and configurations |
| [**createAndFillByConfigurations**](TestRunsApi.md#createAndFillByConfigurations) | **POST** /api/v2/testRuns/byConfigurations | Create test runs picking the needed test points |
| [**createAndFillByWorkItems**](TestRunsApi.md#createAndFillByWorkItems) | **POST** /api/v2/testRuns/byWorkItems | Create test run based on configurations and work items |
| [**createEmpty**](TestRunsApi.md#createEmpty) | **POST** /api/v2/testRuns | Create empty TestRun |
| [**getTestRunById**](TestRunsApi.md#getTestRunById) | **GET** /api/v2/testRuns/{id} | Get TestRun by Id |
| [**setAutoTestResultsForTestRun**](TestRunsApi.md#setAutoTestResultsForTestRun) | **POST** /api/v2/testRuns/{id}/testResults | Send test results to the test runs in the system |
| [**startTestRun**](TestRunsApi.md#startTestRun) | **POST** /api/v2/testRuns/{id}/start | Start TestRun |
| [**stopTestRun**](TestRunsApi.md#stopTestRun) | **POST** /api/v2/testRuns/{id}/stop | Stop TestRun |
| [**updateEmpty**](TestRunsApi.md#updateEmpty) | **PUT** /api/v2/testRuns | Update empty TestRun |


<a id="apiV2TestRunsIdStatisticsFilterPost"></a>
# **apiV2TestRunsIdStatisticsFilterPost**
> TestResultsStatisticsGetModel apiV2TestRunsIdStatisticsFilterPost(id, apiV2TestRunsIdStatisticsFilterPostRequest)

Search for the test run test results and build statistics

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test run unique ID
    ApiV2TestRunsIdStatisticsFilterPostRequest apiV2TestRunsIdStatisticsFilterPostRequest = new ApiV2TestRunsIdStatisticsFilterPostRequest(); // ApiV2TestRunsIdStatisticsFilterPostRequest | 
    try {
      TestResultsStatisticsGetModel result = apiInstance.apiV2TestRunsIdStatisticsFilterPost(id, apiV2TestRunsIdStatisticsFilterPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsIdStatisticsFilterPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test run unique ID | |
| **apiV2TestRunsIdStatisticsFilterPostRequest** | [**ApiV2TestRunsIdStatisticsFilterPostRequest**](ApiV2TestRunsIdStatisticsFilterPostRequest.md)|  | [optional] |

### Return type

[**TestResultsStatisticsGetModel**](TestResultsStatisticsGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test runs is required |  -  |

<a id="apiV2TestRunsIdTestPointsResultsGet"></a>
# **apiV2TestRunsIdTestPointsResultsGet**
> List&lt;TestPointResultModel&gt; apiV2TestRunsIdTestPointsResultsGet(id)

Get test results from the test run grouped by test points

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test run unique ID
    try {
      List<TestPointResultModel> result = apiInstance.apiV2TestRunsIdTestPointsResultsGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsIdTestPointsResultsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test run unique ID | |

### Return type

[**List&lt;TestPointResultModel&gt;**](TestPointResultModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test runs is required |  -  |

<a id="apiV2TestRunsIdTestResultsBulkPut"></a>
# **apiV2TestRunsIdTestResultsBulkPut**
> apiV2TestRunsIdTestResultsBulkPut(id, apiV2TestRunsIdTestResultsBulkPutRequest)

Partial edit of multiple test results in the test run

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test run unique ID
    ApiV2TestRunsIdTestResultsBulkPutRequest apiV2TestRunsIdTestResultsBulkPutRequest = new ApiV2TestRunsIdTestResultsBulkPutRequest(); // ApiV2TestRunsIdTestResultsBulkPutRequest | 
    try {
      apiInstance.apiV2TestRunsIdTestResultsBulkPut(id, apiV2TestRunsIdTestResultsBulkPutRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsIdTestResultsBulkPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test run unique ID | |
| **apiV2TestRunsIdTestResultsBulkPutRequest** | [**ApiV2TestRunsIdTestResultsBulkPutRequest**](ApiV2TestRunsIdTestResultsBulkPutRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Update permission for test runs is required |  -  |

<a id="apiV2TestRunsIdTestResultsLastModifiedModificationDateGet"></a>
# **apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**
> OffsetDateTime apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(id)

Get modification date of last test result of the test run

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test run unique ID
    try {
      OffsetDateTime result = apiInstance.apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test run unique ID | |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test runs is required |  -  |

<a id="apiV2TestRunsSearchPost"></a>
# **apiV2TestRunsSearchPost**
> List&lt;TestRunShortGetModel&gt; apiV2TestRunsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2TestRunsSearchPostRequest)

Search for test runs

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2TestRunsSearchPostRequest apiV2TestRunsSearchPostRequest = new ApiV2TestRunsSearchPostRequest(); // ApiV2TestRunsSearchPostRequest | 
    try {
      List<TestRunShortGetModel> result = apiInstance.apiV2TestRunsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2TestRunsSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsSearchPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **apiV2TestRunsSearchPostRequest** | [**ApiV2TestRunsSearchPostRequest**](ApiV2TestRunsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;TestRunShortGetModel&gt;**](TestRunShortGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for autotests library is required |  -  |

<a id="apiV2TestRunsUpdateMultiplePost"></a>
# **apiV2TestRunsUpdateMultiplePost**
> apiV2TestRunsUpdateMultiplePost(apiV2TestRunsUpdateMultiplePostRequest)

Update multiple test runs

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    ApiV2TestRunsUpdateMultiplePostRequest apiV2TestRunsUpdateMultiplePostRequest = new ApiV2TestRunsUpdateMultiplePostRequest(); // ApiV2TestRunsUpdateMultiplePostRequest | 
    try {
      apiInstance.apiV2TestRunsUpdateMultiplePost(apiV2TestRunsUpdateMultiplePostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#apiV2TestRunsUpdateMultiplePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiV2TestRunsUpdateMultiplePostRequest** | [**ApiV2TestRunsUpdateMultiplePostRequest**](ApiV2TestRunsUpdateMultiplePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="completeTestRun"></a>
# **completeTestRun**
> completeTestRun(id)

Complete TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System completes test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test Run internal identifier (GUID format)
    try {
      apiInstance.completeTestRun(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#completeTestRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestRun with id! |  -  |

<a id="createAndFillByAutoTests"></a>
# **createAndFillByAutoTests**
> TestRunV2GetModel createAndFillByAutoTests(createAndFillByAutoTestsRequest)

Create test runs based on autotests and configurations

This method creates a test run based on an autotest and a configuration.  The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is  that in this method there is no need to create a test plan and work items (test cases and checklists).

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    CreateAndFillByAutoTestsRequest createAndFillByAutoTestsRequest = new CreateAndFillByAutoTestsRequest(); // CreateAndFillByAutoTestsRequest | 
    try {
      TestRunV2GetModel result = apiInstance.createAndFillByAutoTests(createAndFillByAutoTestsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#createAndFillByAutoTests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAndFillByAutoTestsRequest** | [**CreateAndFillByAutoTestsRequest**](CreateAndFillByAutoTestsRequest.md)|  | [optional] |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | &lt;br&gt;- Field is required  &lt;br&gt;- Configuration does not exist in the project  &lt;br&gt;- Autotest does not exist in the project  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Autotest external IDs are required  &lt;br&gt;- Configuration IDs are required |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test results is required |  -  |
| **404** | Some autotests do not exist |  -  |

<a id="createAndFillByConfigurations"></a>
# **createAndFillByConfigurations**
> TestRunV2GetModel createAndFillByConfigurations(createAndFillByConfigurationsRequest)

Create test runs picking the needed test points

This method creates a test run based on a combination of a configuration and a work item(test case or checklist).  Before you create a test run using this method, make sure to create a test plan. Work items must be automated.  This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a  jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    CreateAndFillByConfigurationsRequest createAndFillByConfigurationsRequest = new CreateAndFillByConfigurationsRequest(); // CreateAndFillByConfigurationsRequest | 
    try {
      TestRunV2GetModel result = apiInstance.createAndFillByConfigurations(createAndFillByConfigurationsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#createAndFillByConfigurations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAndFillByConfigurationsRequest** | [**CreateAndFillByConfigurationsRequest**](CreateAndFillByConfigurationsRequest.md)|  | [optional] |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Test run must be automated  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Test point selectors are required  &lt;br&gt;- Some work item IDs are invalid  &lt;br&gt;- Some configuration IDs are invalid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test results is required |  -  |
| **404** | Some test points do not exists |  -  |

<a id="createAndFillByWorkItems"></a>
# **createAndFillByWorkItems**
> TestRunV2GetModel createAndFillByWorkItems(createAndFillByWorkItemsRequest)

Create test run based on configurations and work items

This method creates a test run based on a combination of configuration and work item (test case or checklist).  Before you create a test run using this method, make sure to create a test plan.  Work items must be automated.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    CreateAndFillByWorkItemsRequest createAndFillByWorkItemsRequest = new CreateAndFillByWorkItemsRequest(); // CreateAndFillByWorkItemsRequest | 
    try {
      TestRunV2GetModel result = apiInstance.createAndFillByWorkItems(createAndFillByWorkItemsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#createAndFillByWorkItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAndFillByWorkItemsRequest** | [**CreateAndFillByWorkItemsRequest**](CreateAndFillByWorkItemsRequest.md)|  | [optional] |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | &lt;br&gt;- Field is required  &lt;br&gt;- Test run cannot be created with deleted test points  &lt;br&gt;- Test run cannot be created in deleted test suite  &lt;br&gt;- Test run cannot be created with non-automated test point  &lt;br&gt;- Some work items do not exist  &lt;br&gt;- Project ID is invalid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test results is required |  -  |
| **404** | Some test points, work items or configurations do not exist |  -  |

<a id="createEmpty"></a>
# **createEmpty**
> TestRunV2GetModel createEmpty(createEmptyRequest)

Create empty TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System returns test run model

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    CreateEmptyRequest createEmptyRequest = new CreateEmptyRequest(); // CreateEmptyRequest | 
    try {
      TestRunV2GetModel result = apiInstance.createEmpty(createEmptyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#createEmpty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmptyRequest** | [**CreateEmptyRequest**](CreateEmptyRequest.md)|  | [optional] |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;TestRun must be automated  &lt;br&gt;ProjectId is not a valid! |  -  |
| **401** | TestRunTesterRequirement permission required |  -  |
| **403** | Update permission for test result required |  -  |
| **404** | Can&#39;t find a TestRun with id &#x3D; testRunId |  -  |

<a id="getTestRunById"></a>
# **getTestRunById**
> TestRunV2GetModel getTestRunById(id)

Get TestRun by Id

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds test run  &lt;br&gt;System returns test run

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test Run internal identifier (GUID format)
    try {
      TestRunV2GetModel result = apiInstance.getTestRunById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#getTestRunById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test Run internal identifier (GUID format) | |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test result required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestRun with id! |  -  |

<a id="setAutoTestResultsForTestRun"></a>
# **setAutoTestResultsForTestRun**
> List&lt;UUID&gt; setAutoTestResultsForTestRun(id, autoTestResultsForTestRunModel)

Send test results to the test runs in the system

This method sends test results to the test management system.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test Run internal identifier (GUID format)
    List<AutoTestResultsForTestRunModel> autoTestResultsForTestRunModel = Arrays.asList(); // List<AutoTestResultsForTestRunModel> | 
    try {
      List<UUID> result = apiInstance.setAutoTestResultsForTestRun(id, autoTestResultsForTestRunModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#setAutoTestResultsForTestRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test Run internal identifier (GUID format) | |
| **autoTestResultsForTestRunModel** | [**List&lt;AutoTestResultsForTestRunModel&gt;**](AutoTestResultsForTestRunModel.md)|  | [optional] |

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | &lt;br&gt;- Field is required  &lt;br&gt;- Body is invalid  &lt;br&gt;- Test points are required  &lt;br&gt;- Duration must be a positive number  &lt;br&gt;- Outcome is not defined  &lt;br&gt;- Test run is stopped |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test results is required |  -  |
| **404** | &lt;br&gt;- Test run with provided ID was not found  &lt;br&gt;- Test point was not found  &lt;br&gt;- Autotest with provided external ID was not found |  -  |
| **422** | &lt;br&gt;- Configuration with provided ID was not found  &lt;br&gt;- Test points relevant to provided filters were not found |  -  |

<a id="startTestRun"></a>
# **startTestRun**
> startTestRun(id)

Start TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System starts test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test Run internal identifier (GUID format)
    try {
      apiInstance.startTestRun(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#startTestRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;the StateName is already InProgress  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestRun with id! |  -  |

<a id="stopTestRun"></a>
# **stopTestRun**
> stopTestRun(id)

Stop TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System stops test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test Run internal identifier (GUID format)
    try {
      apiInstance.stopTestRun(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#stopTestRun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;the StateName is already Stopped  &lt;br&gt;the StateName is already Completed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestRun with id! |  -  |

<a id="updateEmpty"></a>
# **updateEmpty**
> updateEmpty(updateEmptyRequest)

Update empty TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test run  &lt;br&gt;System returns returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestRunsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestRunsApi apiInstance = new TestRunsApi(defaultClient);
    UpdateEmptyRequest updateEmptyRequest = new UpdateEmptyRequest(); // UpdateEmptyRequest | 
    try {
      apiInstance.updateEmpty(updateEmptyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestRunsApi#updateEmpty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateEmptyRequest** | [**UpdateEmptyRequest**](UpdateEmptyRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;Name is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestRun with id! |  -  |

