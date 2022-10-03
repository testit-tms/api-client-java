# TestSuitesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTestPointsToTestSuite**](TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{id}/test-points | Add test-points to test suite |
| [**createTestSuite**](TestSuitesApi.md#createTestSuite) | **POST** /api/v2/testSuites | Create TestSuite |
| [**deleteTestSuite**](TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{id} | Delete TestSuite |
| [**getConfigurationsByTestSuiteId**](TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{id}/configurations | Get Configurations By Id |
| [**getTestPointsById**](TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{id}/testPoints | Get TestPoints By Id |
| [**getTestResultsById**](TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{id}/testResults | Get TestResults By Id |
| [**getTestSuiteById**](TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{id} | Get TestSuite by Id |
| [**getWorkItemsById**](TestSuitesApi.md#getWorkItemsById) | **GET** /api/v2/testSuites/{id}/workItems |  |
| [**searchWorkItems**](TestSuitesApi.md#searchWorkItems) | **POST** /api/v2/testSuites/{id}/workItems/search | Search WorkItems |
| [**setConfigurationsByTestSuiteId**](TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/configurations | Set Configurations By TestSuite Id |
| [**setWorkItemsByTestSuiteId**](TestSuitesApi.md#setWorkItemsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/workItems | Set WorkItems By TestSuite Id |
| [**updateTestSuite**](TestSuitesApi.md#updateTestSuite) | **PUT** /api/v2/testSuites | Update TestSuite |



## addTestPointsToTestSuite

> addTestPointsToTestSuite(id, workItemSelectModel)

Add test-points to test suite

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("1ed608bf-8ac9-4ffd-b91e-ebdbbdce6132"); // UUID | Test suite internal identifier
        WorkItemSelectModel workItemSelectModel = new WorkItemSelectModel(); // WorkItemSelectModel | Filter object to retrieve work items for test-suite's project
        try {
            apiInstance.addTestPointsToTestSuite(id, workItemSelectModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#addTestPointsToTestSuite");
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
| **id** | **UUID**| Test suite internal identifier | |
| **workItemSelectModel** | [**WorkItemSelectModel**](WorkItemSelectModel.md)| Filter object to retrieve work items for test-suite&#39;s project | [optional] |

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
| **401** | Unauthorized |  -  |
| **404** | Test suite with provided ID was not found |  -  |
| **422** | Shared steps cannot be added to test suite |  -  |
| **204** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **403** | Update permission for test plan is required |  -  |


## createTestSuite

> TestSuiteV2GetModel createTestSuite(testSuiteV2PostModel)

Create TestSuite

<br>Use case
<br>User sets test suite model (listed in request parameters)
<br>User runs method execution
<br>System creates test suite
<br>System returns test suite

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        TestSuiteV2PostModel testSuiteV2PostModel = new TestSuiteV2PostModel(); // TestSuiteV2PostModel | 
        try {
            TestSuiteV2GetModel result = apiInstance.createTestSuite(testSuiteV2PostModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#createTestSuite");
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
| **testSuiteV2PostModel** | [**TestSuiteV2PostModel**](TestSuiteV2PostModel.md)|  | [optional] |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |


## deleteTestSuite

> String deleteTestSuite(id)

Delete TestSuite

<br>Use case
<br>User sets test suite identifier
<br>User runs method execution
<br>System search test suite by identifier
<br>System deletes test suite
<br>System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        try {
            String result = apiInstance.deleteTestSuite(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#deleteTestSuite");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

**String**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Delete permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## getConfigurationsByTestSuiteId

> List&lt;ConfigurationModel&gt; getConfigurationsByTestSuiteId(id)

Get Configurations By Id

<br>Use case
<br>User sets test suite identifier
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search configurations related to the test points
<br>System returns configurations array

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        try {
            List<ConfigurationModel> result = apiInstance.getConfigurationsByTestSuiteId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#getConfigurationsByTestSuiteId");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |


## getTestPointsById

> List&lt;TestPointByTestSuiteModel&gt; getTestPointsById(id)

Get TestPoints By Id

<br>Use case
<br>User sets test suite identifier
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System returns test points array

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        try {
            List<TestPointByTestSuiteModel> result = apiInstance.getTestPointsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#getTestPointsById");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**List&lt;TestPointByTestSuiteModel&gt;**](TestPointByTestSuiteModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |
| **200** | Successful operation |  -  |
| **403** | Read permission for test plan required |  -  |


## getTestResultsById

> List&lt;TestResultV2ShortModel&gt; getTestResultsById(id)

Get TestResults By Id

<br>Use case
<br>User sets test suite identifier
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search test results related to the test points
<br>System returns test results array

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        try {
            List<TestResultV2ShortModel> result = apiInstance.getTestResultsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#getTestResultsById");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**List&lt;TestResultV2ShortModel&gt;**](TestResultV2ShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## getTestSuiteById

> TestSuiteV2GetModel getTestSuiteById(id)

Get TestSuite by Id

<br>Use case
<br>User sets test suite identifier
<br>User runs method execution
<br>System search test suite by identifier
<br>System returns test suite

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        try {
            TestSuiteV2GetModel result = apiInstance.getTestSuiteById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#getTestSuiteById");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |
| **200** | Successful operation |  -  |


## getWorkItemsById

> List&lt;WorkItemShortModel&gt; getWorkItemsById(id, isDeleted, tagNames, skip, take, orderBy, searchField, searchValue)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        Boolean isDeleted = false; // Boolean | 
        List<String> tagNames = Arrays.asList(); // List<String> | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<WorkItemShortModel> result = apiInstance.getWorkItemsById(id, isDeleted, tagNames, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#getWorkItemsById");
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
| **id** | **UUID**|  | |
| **isDeleted** | **Boolean**|  | [optional] [default to false] |
| **tagNames** | **List&lt;String&gt;**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## searchWorkItems

> List&lt;WorkItemShortModel&gt; searchWorkItems(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel)

Search WorkItems

<br>Use case
<br>User sets test suite identifier
<br>[Optional] User sets filter
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search workitems related to the test points
<br>
                    [Optional] User sets filter, system applies filter 
                
<br>System returns workitems array

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        TestSuiteWorkItemsSearchModel testSuiteWorkItemsSearchModel = new TestSuiteWorkItemsSearchModel(); // TestSuiteWorkItemsSearchModel | 
        try {
            List<WorkItemShortModel> result = apiInstance.searchWorkItems(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#searchWorkItems");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **testSuiteWorkItemsSearchModel** | [**TestSuiteWorkItemsSearchModel**](TestSuiteWorkItemsSearchModel.md)|  | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |


## setConfigurationsByTestSuiteId

> List&lt;ConfigurationModel&gt; setConfigurationsByTestSuiteId(id, UUID)

Set Configurations By TestSuite Id

<br>Use case
<br>User sets test suite identifier
<br>User sets collection of configuration identifiers
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search configuration
<br>System restores(if exist) or creates test points with listed configuration
<br>System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | Collection of configuration identifiers\"
        try {
            List<ConfigurationModel> result = apiInstance.setConfigurationsByTestSuiteId(id, UUID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#setConfigurationsByTestSuiteId");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |
| **UUID** | **List&lt;UUID&gt;**| Collection of configuration identifiers\&quot; | [optional] |

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | &lt;br&gt;Some of Configurations do not exist in the project, or they are not active |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |


## setWorkItemsByTestSuiteId

> List&lt;WorkItemShortModel&gt; setWorkItemsByTestSuiteId(id, UUID)

Set WorkItems By TestSuite Id

<br>Use case
<br>User sets test suite identifier
<br>User sets collection of workitems identifiers
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search workitems
<br>System restores(if exist) or creates test points with listed workitems
<br>System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test suite internal (guid format) identifier\"
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | Collection of workitem identifiers\"
        try {
            List<WorkItemShortModel> result = apiInstance.setWorkItemsByTestSuiteId(id, UUID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#setWorkItemsByTestSuiteId");
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
| **id** | **UUID**| Test suite internal (guid format) identifier\&quot; | |
| **UUID** | **List&lt;UUID&gt;**| Collection of workitem identifiers\&quot; | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id  &lt;br&gt;Some of WorkItems does not exist or deleted |  -  |
| **403** | Update permission for test plan required |  -  |
| **422** | &lt;br&gt;can&#39;t put a SharedStep in the TestSuite  &lt;br&gt;ProjectId must be the same for TestSuites |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |


## updateTestSuite

> TestSuiteV2GetModel updateTestSuite(testSuiteV2PutModel)

Update TestSuite

<br>Use case
<br>User sets test suite model (listed in request parameters)
<br>User runs method execution
<br>System updates test suite
<br>System returns test suite

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestSuitesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestSuitesApi apiInstance = new TestSuitesApi(defaultClient);
        TestSuiteV2PutModel testSuiteV2PutModel = new TestSuiteV2PutModel(); // TestSuiteV2PutModel | 
        try {
            TestSuiteV2GetModel result = apiInstance.updateTestSuite(testSuiteV2PutModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#updateTestSuite");
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
| **testSuiteV2PutModel** | [**TestSuiteV2PutModel**](TestSuiteV2PutModel.md)|  | [optional] |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;Suite with Id creates loop! |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |
| **204** | Successful operation |  -  |

