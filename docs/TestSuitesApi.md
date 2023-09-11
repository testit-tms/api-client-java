# TestSuitesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTestPointsToTestSuite**](TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{id}/test-points | Add test-points to test suite |
| [**apiV2TestSuitesIdPatch**](TestSuitesApi.md#apiV2TestSuitesIdPatch) | **PATCH** /api/v2/testSuites/{id} | Patch test suite |
| [**apiV2TestSuitesIdRefreshPost**](TestSuitesApi.md#apiV2TestSuitesIdRefreshPost) | **POST** /api/v2/testSuites/{id}/refresh | Refresh test suite. Only dynamic test suites are supported by this method |
| [**apiV2TestSuitesIdWorkItemsPost**](TestSuitesApi.md#apiV2TestSuitesIdWorkItemsPost) | **POST** /api/v2/testSuites/{id}/workItems | Set work items for test suite |
| [**apiV2TestSuitesPost**](TestSuitesApi.md#apiV2TestSuitesPost) | **POST** /api/v2/testSuites | Create test suite |
| [**apiV2TestSuitesPut**](TestSuitesApi.md#apiV2TestSuitesPut) | **PUT** /api/v2/testSuites | Edit test suite |
| [**deleteTestSuite**](TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{id} | Delete TestSuite |
| [**getConfigurationsByTestSuiteId**](TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{id}/configurations | Get Configurations By Id |
| [**getTestPointsById**](TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{id}/testPoints | Get TestPoints By Id |
| [**getTestResultsById**](TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{id}/testResults | Get TestResults By Id |
| [**getTestSuiteById**](TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{id} | Get TestSuite by Id |
| [**searchWorkItems**](TestSuitesApi.md#searchWorkItems) | **POST** /api/v2/testSuites/{id}/workItems/search | Search WorkItems |
| [**setConfigurationsByTestSuiteId**](TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/configurations | Set Configurations By TestSuite Id |



## addTestPointsToTestSuite

> addTestPointsToTestSuite(id, apiV2ProjectsIdWorkItemsSearchPostRequest)

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
        ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest = new ApiV2ProjectsIdWorkItemsSearchPostRequest(); // ApiV2ProjectsIdWorkItemsSearchPostRequest | Filter object to retrieve work items for test-suite's project
        try {
            apiInstance.addTestPointsToTestSuite(id, apiV2ProjectsIdWorkItemsSearchPostRequest);
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
| **apiV2ProjectsIdWorkItemsSearchPostRequest** | [**ApiV2ProjectsIdWorkItemsSearchPostRequest**](ApiV2ProjectsIdWorkItemsSearchPostRequest.md)| Filter object to retrieve work items for test-suite&#39;s project | [optional] |

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
| **404** | Test suite with provided ID was not found |  -  |
| **400** | Bad Request |  -  |
| **204** | Successful operation |  -  |
| **403** | Update permission for test plan is required |  -  |
| **401** | Unauthorized |  -  |
| **422** | Shared steps cannot be added to test suite |  -  |


## apiV2TestSuitesIdPatch

> apiV2TestSuitesIdPatch(id, operation)

Patch test suite

See <a href="https://www.rfc-editor.org/rfc/rfc6902" target="_blank">RFC 6902: JavaScript Object Notation (JSON) Patch</a> for details

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
        UUID id = UUID.randomUUID(); // UUID | Test Suite internal (UUID) identifier
        List<Operation> operation = Arrays.asList(); // List<Operation> | 
        try {
            apiInstance.apiV2TestSuitesIdPatch(id, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#apiV2TestSuitesIdPatch");
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
| **id** | **UUID**| Test Suite internal (UUID) identifier | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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
| **403** | Update permission for test suite is required |  -  |


## apiV2TestSuitesIdRefreshPost

> apiV2TestSuitesIdRefreshPost(id)

Refresh test suite. Only dynamic test suites are supported by this method

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
        UUID id = UUID.randomUUID(); // UUID | Test Suite internal (UUID) identifier
        try {
            apiInstance.apiV2TestSuitesIdRefreshPost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#apiV2TestSuitesIdRefreshPost");
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
| **id** | **UUID**| Test Suite internal (UUID) identifier | |

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
| **403** | Update permission for test suite is required |  -  |
| **204** | No Content |  -  |


## apiV2TestSuitesIdWorkItemsPost

> apiV2TestSuitesIdWorkItemsPost(id, UUID)

Set work items for test suite

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
        UUID id = UUID.randomUUID(); // UUID | Unique ID of the test suite
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
        try {
            apiInstance.apiV2TestSuitesIdWorkItemsPost(id, UUID);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#apiV2TestSuitesIdWorkItemsPost");
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
| **id** | **UUID**| Unique ID of the test suite | |
| **UUID** | **List&lt;UUID&gt;**|  | [optional] |

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
| **403** | Update permission for test plan is required |  -  |


## apiV2TestSuitesPost

> TestSuiteV2GetModel apiV2TestSuitesPost(apiV2TestSuitesPostRequest)

Create test suite

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
        ApiV2TestSuitesPostRequest apiV2TestSuitesPostRequest = new ApiV2TestSuitesPostRequest(); // ApiV2TestSuitesPostRequest | 
        try {
            TestSuiteV2GetModel result = apiInstance.apiV2TestSuitesPost(apiV2TestSuitesPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#apiV2TestSuitesPost");
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
| **apiV2TestSuitesPostRequest** | [**ApiV2TestSuitesPostRequest**](ApiV2TestSuitesPostRequest.md)|  | [optional] |

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
| **201** | Created |  -  |
| **403** | Update permission for test plan is required |  -  |


## apiV2TestSuitesPut

> apiV2TestSuitesPut(apiV2TestSuitesPutRequest)

Edit test suite

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
        ApiV2TestSuitesPutRequest apiV2TestSuitesPutRequest = new ApiV2TestSuitesPutRequest(); // ApiV2TestSuitesPutRequest | 
        try {
            apiInstance.apiV2TestSuitesPut(apiV2TestSuitesPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestSuitesApi#apiV2TestSuitesPut");
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
| **apiV2TestSuitesPutRequest** | [**ApiV2TestSuitesPutRequest**](ApiV2TestSuitesPutRequest.md)|  | [optional] |

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
| **403** | Update permission for test plan is required |  -  |


## deleteTestSuite

> deleteTestSuite(id)

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
            apiInstance.deleteTestSuite(id);
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

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Delete permission for test plan required |  -  |


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
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |


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
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |


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
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id! |  -  |


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


## searchWorkItems

> List&lt;WorkItemShortModel&gt; searchWorkItems(id, skip, take, orderBy, searchField, searchValue, searchWorkItemsRequest)

Search WorkItems

<br>Use case
<br>User sets test suite identifier
<br>[Optional] User sets filter
<br>User runs method execution
<br>System search test suite by identifier
<br>System search test points related to the test suite
<br>System search work items related to the test points
<br>
                    [Optional] User sets filter, system applies filter
                
<br>System returns work items array

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
        SearchWorkItemsRequest searchWorkItemsRequest = new SearchWorkItemsRequest(); // SearchWorkItemsRequest | 
        try {
            List<WorkItemShortModel> result = apiInstance.searchWorkItems(id, skip, take, orderBy, searchField, searchValue, searchWorkItemsRequest);
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
| **searchWorkItemsRequest** | [**SearchWorkItemsRequest**](SearchWorkItemsRequest.md)|  | [optional] |

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
| **404** | Can&#39;t find a TestSuite with id! |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |


## setConfigurationsByTestSuiteId

> setConfigurationsByTestSuiteId(id, UUID)

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
            apiInstance.setConfigurationsByTestSuiteId(id, UUID);
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

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | &lt;br&gt;Some of Configurations do not exist in the project, or they are not active |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestSuite with id |  -  |
| **204** | Successful operation |  -  |

