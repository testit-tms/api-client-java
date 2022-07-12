# TestSuitesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTestPointsToTestSuite**](TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{testSuiteId}/test-points | Add test-points to test suite
[**createTestSuite**](TestSuitesApi.md#createTestSuite) | **POST** /api/v2/testSuites | Create TestSuite
[**deleteTestSuite**](TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{testSuiteId} | Delete TestSuite
[**getConfigurationsByTestSuiteId**](TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{testSuiteId}/configurations | Get Configurations By Id
[**getTestPointsById**](TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{testSuiteId}/testPoints | Get TestPoints By Id
[**getTestResultsById**](TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{testSuiteId}/testResults | Get TestResults By Id
[**getTestSuiteById**](TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{testSuiteId} | Get TestSuite by Id
[**getWorkItemsById**](TestSuitesApi.md#getWorkItemsById) | **GET** /api/v2/testSuites/{testSuiteId}/workItems | Get WorkItems By Id
[**setConfigurationsByTestSuiteId**](TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{testSuiteId}/configurations | Set Configurations By TestSuite Id
[**setWorkItemsByTestSuiteId**](TestSuitesApi.md#setWorkItemsByTestSuiteId) | **POST** /api/v2/testSuites/{testSuiteId}/workItems | Set WorkItems By TestSuite Id
[**updateTestSuite**](TestSuitesApi.md#updateTestSuite) | **PUT** /api/v2/testSuites | Update TestSuite

<a name="addTestPointsToTestSuite"></a>
# **addTestPointsToTestSuite**
> addTestPointsToTestSuite(testSuiteId, body)

Add test-points to test suite

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal identifier
WorkItemSelectModel body = new WorkItemSelectModel(); // WorkItemSelectModel | Filter object to retrieve work items for test-suite's project
try {
    apiInstance.addTestPointsToTestSuite(testSuiteId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#addTestPointsToTestSuite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal identifier |
 **body** | [**WorkItemSelectModel**](WorkItemSelectModel.md)| Filter object to retrieve work items for test-suite&#x27;s project | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createTestSuite"></a>
# **createTestSuite**
> TestSuiteV2GetModel createTestSuite(body)

Create TestSuite

&lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test suite  &lt;br&gt;System returns test suite

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
TestSuiteV2PostModel body = new TestSuiteV2PostModel(); // TestSuiteV2PostModel | 
try {
    TestSuiteV2GetModel result = apiInstance.createTestSuite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#createTestSuite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestSuiteV2PostModel**](TestSuiteV2PostModel.md)|  | [optional]

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteTestSuite"></a>
# **deleteTestSuite**
> String deleteTestSuite(testSuiteId)

Delete TestSuite

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System deletes test suite  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
try {
    String result = apiInstance.deleteTestSuite(testSuiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#deleteTestSuite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |

### Return type

**String**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigurationsByTestSuiteId"></a>
# **getConfigurationsByTestSuiteId**
> List&lt;ConfigurationModel&gt; getConfigurationsByTestSuiteId(testSuiteId)

Get Configurations By Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configurations related to the test points  &lt;br&gt;System returns configurations array

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
try {
    List<ConfigurationModel> result = apiInstance.getConfigurationsByTestSuiteId(testSuiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#getConfigurationsByTestSuiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestPointsById"></a>
# **getTestPointsById**
> List&lt;TestPointByTestSuiteModel&gt; getTestPointsById(testSuiteId)

Get TestPoints By Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System returns test points array

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
try {
    List<TestPointByTestSuiteModel> result = apiInstance.getTestPointsById(testSuiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#getTestPointsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |

### Return type

[**List&lt;TestPointByTestSuiteModel&gt;**](TestPointByTestSuiteModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestResultsById"></a>
# **getTestResultsById**
> List&lt;TestResultV2ShortModel&gt; getTestResultsById(testSuiteId)

Get TestResults By Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search test results related to the test points  &lt;br&gt;System returns test results array

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
try {
    List<TestResultV2ShortModel> result = apiInstance.getTestResultsById(testSuiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#getTestResultsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |

### Return type

[**List&lt;TestResultV2ShortModel&gt;**](TestResultV2ShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestSuiteById"></a>
# **getTestSuiteById**
> TestSuiteV2GetModel getTestSuiteById(testSuiteId)

Get TestSuite by Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System returns test suite

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
try {
    TestSuiteV2GetModel result = apiInstance.getTestSuiteById(testSuiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#getTestSuiteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemsById"></a>
# **getWorkItemsById**
> List&lt;WorkItemShortModel&gt; getWorkItemsById(testSuiteId, isDeleted, tagNames, , , , , )

Get WorkItems By Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;[Optional] User sets isDeleted property as true  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems related to the test points  &lt;br&gt;                      [Optional] User sets isDeleted property is set as true, System includes deleted workitems                      Otherwise, system applies filter which excludes deleted workitems from all found workitems                    &lt;br&gt;System returns workitems array

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
Boolean isDeleted = false; // Boolean | Flag that defines if deleted workitems must be include in the response
List<String> tagNames = Arrays.asList("tagNames_example"); // List<String> | Array of workitem tag names
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<WorkItemShortModel> result = apiInstance.getWorkItemsById(testSuiteId, isDeleted, tagNames, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#getWorkItemsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |
 **isDeleted** | **Boolean**| Flag that defines if deleted workitems must be include in the response | [optional] [default to false]
 **tagNames** | [**List&lt;String&gt;**](String.md)| Array of workitem tag names | [optional]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setConfigurationsByTestSuiteId"></a>
# **setConfigurationsByTestSuiteId**
> List&lt;ConfigurationModel&gt; setConfigurationsByTestSuiteId(testSuiteId, body)

Set Configurations By TestSuite Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of configuration identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search configuration  &lt;br&gt;System restores(if exist) or creates test points with listed configuration  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | Collection of configuration identifiers"
try {
    List<ConfigurationModel> result = apiInstance.setConfigurationsByTestSuiteId(testSuiteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#setConfigurationsByTestSuiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |
 **body** | [**List&lt;UUID&gt;**](UUID.md)| Collection of configuration identifiers&quot; | [optional]

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="setWorkItemsByTestSuiteId"></a>
# **setWorkItemsByTestSuiteId**
> List&lt;WorkItemShortModel&gt; setWorkItemsByTestSuiteId(testSuiteId, body)

Set WorkItems By TestSuite Id

&lt;br&gt;Use case  &lt;br&gt;User sets test suite identifier  &lt;br&gt;User sets collection of workitems identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System search test suite by identifier  &lt;br&gt;System search test points related to the test suite  &lt;br&gt;System search workitems  &lt;br&gt;System restores(if exist) or creates test points with listed workitems  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
UUID testSuiteId = new UUID(); // UUID | Test suite internal (guid format) identifier\"
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | Collection of workitem identifiers"
try {
    List<WorkItemShortModel> result = apiInstance.setWorkItemsByTestSuiteId(testSuiteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#setWorkItemsByTestSuiteId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSuiteId** | [**UUID**](.md)| Test suite internal (guid format) identifier\&quot; |
 **body** | [**List&lt;UUID&gt;**](UUID.md)| Collection of workitem identifiers&quot; | [optional]

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateTestSuite"></a>
# **updateTestSuite**
> TestSuiteV2GetModel updateTestSuite(body)

Update TestSuite

&lt;br&gt;Use case  &lt;br&gt;User sets test suite model (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test suite  &lt;br&gt;System returns test suite

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestSuitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestSuitesApi apiInstance = new TestSuitesApi();
TestSuiteV2PutModel body = new TestSuiteV2PutModel(); // TestSuiteV2PutModel | 
try {
    TestSuiteV2GetModel result = apiInstance.updateTestSuite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestSuitesApi#updateTestSuite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestSuiteV2PutModel**](TestSuiteV2PutModel.md)|  | [optional]

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

