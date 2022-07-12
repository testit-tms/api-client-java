# TestRunsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeTestRun**](TestRunsApi.md#completeTestRun) | **POST** /api/v2/testRuns/{testRunId}/complete | Complete TestRun
[**createAndFillByAutoTests**](TestRunsApi.md#createAndFillByAutoTests) | **POST** /api/v2/testRuns/byAutoTests | Create TestRun without TestPoints using ConfigurationIds and AutoTestIds
[**createAndFillByConfigurations**](TestRunsApi.md#createAndFillByConfigurations) | **POST** /api/v2/testRuns/byConfigurations | Create TestRun with TestPointSelectors based on ConfigurationId and WorkItem Ids
[**createAndFillByWorkItems**](TestRunsApi.md#createAndFillByWorkItems) | **POST** /api/v2/testRuns/byWorkItems | Create TestRun with TestPoints selected using ConfigurationIds and WorkItem Ids
[**createEmpty**](TestRunsApi.md#createEmpty) | **POST** /api/v2/testRuns | Create empty TestRun
[**getTestRunById**](TestRunsApi.md#getTestRunById) | **GET** /api/v2/testRuns/{testRunId} | Get TestRun by Id
[**setAutoTestResultsForTestRun**](TestRunsApi.md#setAutoTestResultsForTestRun) | **POST** /api/v2/testRuns/{testRunId}/testResults | Set AutoTest Results For TestRun
[**startTestRun**](TestRunsApi.md#startTestRun) | **POST** /api/v2/testRuns/{testRunId}/start | Start TestRun
[**stopTestRun**](TestRunsApi.md#stopTestRun) | **POST** /api/v2/testRuns/{testRunId}/stop | Stop TestRun
[**updateEmpty**](TestRunsApi.md#updateEmpty) | **PUT** /api/v2/testRuns | Update empty TestRun

<a name="completeTestRun"></a>
# **completeTestRun**
> completeTestRun(testRunId)

Complete TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System completes test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
UUID testRunId = new UUID(); // UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.completeTestRun(testRunId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#completeTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | [**UUID**](.md)| Test Run internal identifier (GUID format) |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAndFillByAutoTests"></a>
# **createAndFillByAutoTests**
> TestRunV2GetModel createAndFillByAutoTests(body)

Create TestRun without TestPoints using ConfigurationIds and AutoTestIds

&lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User sets relative configuration and workitem ids  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System finds autotests and configurations using ids listed by user  &lt;br&gt;System creates test result by test points which use autotests and configurations  &lt;br&gt;System returns test run model

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
TestRunFillByAutoTestsPostModel body = new TestRunFillByAutoTestsPostModel(); // TestRunFillByAutoTestsPostModel | 
try {
    TestRunV2GetModel result = apiInstance.createAndFillByAutoTests(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#createAndFillByAutoTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunFillByAutoTestsPostModel**](TestRunFillByAutoTestsPostModel.md)|  | [optional]

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createAndFillByConfigurations"></a>
# **createAndFillByConfigurations**
> TestRunV2GetModel createAndFillByConfigurations(body)

Create TestRun with TestPointSelectors based on ConfigurationId and WorkItem Ids

&lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User sets relative configuration and workitem ids  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System finds workitems and configurations using ids listed by user  &lt;br&gt;System creates test result by test points which use workitems and configurations  &lt;br&gt;System returns test run model

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
TestRunFillByConfigurationsPostModel body = new TestRunFillByConfigurationsPostModel(); // TestRunFillByConfigurationsPostModel | 
try {
    TestRunV2GetModel result = apiInstance.createAndFillByConfigurations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#createAndFillByConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunFillByConfigurationsPostModel**](TestRunFillByConfigurationsPostModel.md)|  | [optional]

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createAndFillByWorkItems"></a>
# **createAndFillByWorkItems**
> TestRunV2GetModel createAndFillByWorkItems(body)

Create TestRun with TestPoints selected using ConfigurationIds and WorkItem Ids

&lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User sets relative configuration and workitem ids  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System finds workitems and configurations using ids listed by user  &lt;br&gt;System creates test result by test points which use workitems and configurations  &lt;br&gt;System returns test run model

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
TestRunFillByWorkItemsPostModel body = new TestRunFillByWorkItemsPostModel(); // TestRunFillByWorkItemsPostModel | 
try {
    TestRunV2GetModel result = apiInstance.createAndFillByWorkItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#createAndFillByWorkItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunFillByWorkItemsPostModel**](TestRunFillByWorkItemsPostModel.md)|  | [optional]

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createEmpty"></a>
# **createEmpty**
> TestRunV2GetModel createEmpty(body)

Create empty TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test run  &lt;br&gt;System returns test run model

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
TestRunV2PostShortModel body = new TestRunV2PostShortModel(); // TestRunV2PostShortModel | 
try {
    TestRunV2GetModel result = apiInstance.createEmpty(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#createEmpty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunV2PostShortModel**](TestRunV2PostShortModel.md)|  | [optional]

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="getTestRunById"></a>
# **getTestRunById**
> TestRunV2GetModel getTestRunById(testRunId)

Get TestRun by Id

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds test run  &lt;br&gt;System returns test run

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
UUID testRunId = new UUID(); // UUID | Test Run internal identifier (GUID format)
try {
    TestRunV2GetModel result = apiInstance.getTestRunById(testRunId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#getTestRunById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | [**UUID**](.md)| Test Run internal identifier (GUID format) |

### Return type

[**TestRunV2GetModel**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setAutoTestResultsForTestRun"></a>
# **setAutoTestResultsForTestRun**
> List&lt;UUID&gt; setAutoTestResultsForTestRun(testRunId, body)

Set AutoTest Results For TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User sets test result model (listed in request parameters)   &lt;br&gt;User runs method execution  &lt;br&gt;System sets test results of autotest listed in request in test run  &lt;br&gt;System returns array of test results identifiers

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
UUID testRunId = new UUID(); // UUID | Test Run internal identifier (GUID format)
List<AutoTestResultsForTestRunModel> body = Arrays.asList(new AutoTestResultsForTestRunModel()); // List<AutoTestResultsForTestRunModel> | 
try {
    List<UUID> result = apiInstance.setAutoTestResultsForTestRun(testRunId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#setAutoTestResultsForTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | [**UUID**](.md)| Test Run internal identifier (GUID format) |
 **body** | [**List&lt;AutoTestResultsForTestRunModel&gt;**](AutoTestResultsForTestRunModel.md)|  | [optional]

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="startTestRun"></a>
# **startTestRun**
> startTestRun(testRunId)

Start TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System starts test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
UUID testRunId = new UUID(); // UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.startTestRun(testRunId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#startTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | [**UUID**](.md)| Test Run internal identifier (GUID format) |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopTestRun"></a>
# **stopTestRun**
> stopTestRun(testRunId)

Stop TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System stops test run  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
UUID testRunId = new UUID(); // UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.stopTestRun(testRunId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#stopTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testRunId** | [**UUID**](.md)| Test Run internal identifier (GUID format) |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEmpty"></a>
# **updateEmpty**
> updateEmpty(body)

Update empty TestRun

&lt;br&gt;Use case  &lt;br&gt;User sets test run properties (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test run  &lt;br&gt;System returns returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestRunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestRunsApi apiInstance = new TestRunsApi();
TestRunV2PutModel body = new TestRunV2PutModel(); // TestRunV2PutModel | 
try {
    apiInstance.updateEmpty(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestRunsApi#updateEmpty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestRunV2PutModel**](TestRunV2PutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

