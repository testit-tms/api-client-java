# TestPlansApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTestPointsWithSections**](TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{testPlanId}/test-points/withSections | Add test-points to test suite with sections
[**addWorkItemsWithSections**](TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{testPlanId}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites
[**clone**](TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{testPlanId}/clone | Clone TestPlan
[**complete**](TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{testPlanId}/complete | Complete TestPlan
[**createTestPlan**](TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan
[**deleteTestPlan**](TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{testPlanId} | Delete TestPlan
[**getTestPlanById**](TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{testPlanId} | Get TestPlan by Id
[**getTestSuitesById**](TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{testPlanId}/testSuites | Get TestSuites Tree By Id
[**pause**](TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{testPlanId}/pause | Pause TestPlan
[**restoreTestPlan**](TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{testPlanId}/restore | Restore TestPlan
[**start**](TestPlansApi.md#start) | **POST** /api/v2/testPlans/{testPlanId}/start | Start TestPlan
[**updateTestPlan**](TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan

<a name="addTestPointsWithSections"></a>
# **addTestPointsWithSections**
> addTestPointsWithSections(testPlanId, body)

Add test-points to test suite with sections

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
UUID testPlanId = new UUID(); // UUID | Test suite internal identifier
WorkItemSelectModel body = new WorkItemSelectModel(); // WorkItemSelectModel | Filter object to retrieve work items for test-suite's project
try {
    apiInstance.addTestPointsWithSections(testPlanId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#addTestPointsWithSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | [**UUID**](.md)| Test suite internal identifier |
 **body** | [**WorkItemSelectModel**](WorkItemSelectModel.md)| Filter object to retrieve work items for test-suite&#x27;s project | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="addWorkItemsWithSections"></a>
# **addWorkItemsWithSections**
> addWorkItemsWithSections(testPlanId, body)

Add WorkItems to TestPlan with Sections as TestSuites

&lt;br&gt;Use case  &lt;br&gt;User sets TestPlan identifier  &lt;br&gt;User sets WorkItem identifiers (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System added WorkItems and Sections to TestPlan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
UUID testPlanId = new UUID(); // UUID | Test plan internal (guid format) or global (int  format) identifier
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
try {
    apiInstance.addWorkItemsWithSections(testPlanId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#addWorkItemsWithSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | [**UUID**](.md)| Test plan internal (guid format) or global (int  format) identifier |
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="clone"></a>
# **clone**
> TestPlanModel clone(testPlanId)

Clone TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System clones test plan  &lt;br&gt;System returns test plan (listed in response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    TestPlanModel result = apiInstance.clone(testPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#clone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="complete"></a>
# **complete**
> complete(testPlanId)

Complete TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System completes the test plan and updates test plan status  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.complete(testPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#complete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTestPlan"></a>
# **createTestPlan**
> TestPlanModel createTestPlan(body)

Create TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates test plan  &lt;br&gt;System returns test plan (listed in response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
TestPlanPostModel body = new TestPlanPostModel(); // TestPlanPostModel | 
try {
    TestPlanModel result = apiInstance.createTestPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#createTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestPlanPostModel**](TestPlanPostModel.md)|  | [optional]

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteTestPlan"></a>
# **deleteTestPlan**
> deleteTestPlan(testPlanId)

Delete TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System delete test plan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.deleteTestPlan(testPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#deleteTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestPlanById"></a>
# **getTestPlanById**
> TestPlanModel getTestPlanById(testPlanId)

Get TestPlan by Id

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search  test plan by the identifier  &lt;br&gt;System returns test plan

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    TestPlanModel result = apiInstance.getTestPlanById(testPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#getTestPlanById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestSuitesById"></a>
# **getTestSuitesById**
> List&lt;TestSuiteV2TreeModel&gt; getTestSuitesById(testPlanId)

Get TestSuites Tree By Id

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds test suites related to the test plan  &lt;br&gt;System returns test suites as a tree model (listed in response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    List<TestSuiteV2TreeModel> result = apiInstance.getTestSuitesById(testPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#getTestSuitesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

[**List&lt;TestSuiteV2TreeModel&gt;**](TestSuiteV2TreeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pause"></a>
# **pause**
> pause(testPlanId)

Pause TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System pauses the test plan and updates test plan status  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.pause(testPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#pause");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreTestPlan"></a>
# **restoreTestPlan**
> restoreTestPlan(testPlanId)

Restore TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System restores test plan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.restoreTestPlan(testPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#restoreTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="start"></a>
# **start**
> start(testPlanId)

Start TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System starts the test plan and updates test plan status  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
String testPlanId = "testPlanId_example"; // String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.start(testPlanId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#start");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testPlanId** | **String**| Test plan internal (guid format) or global (int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTestPlan"></a>
# **updateTestPlan**
> updateTestPlan(body)

Update TestPlan

&lt;br&gt;Use case  &lt;br&gt;User sets test plan properties(listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates test plan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestPlansApi apiInstance = new TestPlansApi();
TestPlanPutModel body = new TestPlanPutModel(); // TestPlanPutModel | 
try {
    apiInstance.updateTestPlan(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestPlansApi#updateTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestPlanPutModel**](TestPlanPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

