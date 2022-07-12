# WorkItemsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkItem**](WorkItemsApi.md#createWorkItem) | **POST** /api/v2/workItems | Create Test Case, Checklist or Shared Step
[**deleteAllWorkItemsFromAutoTest**](WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{workItemId}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId
[**deleteWorkItem**](WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{workItemId} | Delete Test Case, Checklist or Shared Step by Id or GlobalId
[**getAutoTestsForWorkItem**](WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{workItemId}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId
[**getIterations**](WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{workItemId}/iterations | Get iterations by workitem Id or GlobalId
[**getWorkItemById**](WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{workItemId} | Get Test Case, Checklist or Shared Step by Id or GlobalId
[**getWorkItemChronology**](WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{workItemId}/chronology | Get WorkItem chronology by Id or GlobalId
[**getWorkItemVersions**](WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{workItemId}/versions | Get WorkItem versions
[**updateWorkItem**](WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step

<a name="createWorkItem"></a>
# **createWorkItem**
> WorkItemModel createWorkItem(body)

Create Test Case, Checklist or Shared Step

&lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates workitem by identifier  &lt;br&gt;System returns workitem model (listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
WorkItemPostModel body = new WorkItemPostModel(); // WorkItemPostModel | 
try {
    WorkItemModel result = apiInstance.createWorkItem(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#createWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkItemPostModel**](WorkItemPostModel.md)|  | [optional]

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteAllWorkItemsFromAutoTest"></a>
# **deleteAllWorkItemsFromAutoTest**
> deleteAllWorkItemsFromAutoTest(workItemId)

Delete all links AutoTests from WorkItem by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search and delete all autotests, related to found workitem  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    apiInstance.deleteAllWorkItemsFromAutoTest(workItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#deleteAllWorkItemsFromAutoTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteWorkItem"></a>
# **deleteWorkItem**
> deleteWorkItem(workItemId)

Delete Test Case, Checklist or Shared Step by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes workitem  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    apiInstance.deleteWorkItem(workItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#deleteWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoTestsForWorkItem"></a>
# **getAutoTestsForWorkItem**
> List&lt;AutoTestModel&gt; getAutoTestsForWorkItem(workItemId)

Get all AutoTests linked to WorkItem by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search all autotests, related to found workitem  &lt;br&gt;System returns list of found autotests

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    List<AutoTestModel> result = apiInstance.getAutoTestsForWorkItem(workItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#getAutoTestsForWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIterations"></a>
# **getIterations**
> List&lt;IterationModel&gt; getIterations(workItemId, versionId, versionNumber)

Get iterations by workitem Id or GlobalId

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
UUID versionId = new UUID(); // UUID | WorkItem version (guid format) identifier
Integer versionNumber = 56; // Integer | WorkItem version number (0 is the last version)\"
try {
    List<IterationModel> result = apiInstance.getIterations(workItemId, versionId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#getIterations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |
 **versionId** | [**UUID**](.md)| WorkItem version (guid format) identifier | [optional]
 **versionNumber** | **Integer**| WorkItem version number (0 is the last version)\&quot; | [optional]

### Return type

[**List&lt;IterationModel&gt;**](IterationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemById"></a>
# **getWorkItemById**
> WorkItemModel getWorkItemById(workItemId, versionId, versionNumber)

Get Test Case, Checklist or Shared Step by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;[Optional] User sets workitem version number  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;[Optional] if User sets workitem version identifier, system search workitem version by identifier.  &lt;br&gt;[Optional] if user sets workitem version number, system search workitem version by number  &lt;br&gt;Otherwise, system search last workitem version  &lt;br&gt;System returns workitem 

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
UUID versionId = new UUID(); // UUID | WorkItem version (guid format) identifier\"
Integer versionNumber = 56; // Integer | WorkItem version number (0 is the last version)\"
try {
    WorkItemModel result = apiInstance.getWorkItemById(workItemId, versionId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#getWorkItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |
 **versionId** | [**UUID**](.md)| WorkItem version (guid format) identifier\&quot; | [optional]
 **versionNumber** | **Integer**| WorkItem version number (0 is the last version)\&quot; | [optional]

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemChronology"></a>
# **getWorkItemChronology**
> List&lt;TestResultChronologyModel&gt; getWorkItemChronology(workItemId)

Get WorkItem chronology by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;System search test results of all autotests, related to found workitem  &lt;br&gt;System sort results by CompletedOn ascending, then by CreatedDate ascending  &lt;br&gt;System returns sorted collection of test results

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | 
try {
    List<TestResultChronologyModel> result = apiInstance.getWorkItemChronology(workItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#getWorkItemChronology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**|  |

### Return type

[**List&lt;TestResultChronologyModel&gt;**](TestResultChronologyModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemVersions"></a>
# **getWorkItemVersions**
> List&lt;WorkItemVersionModel&gt; getWorkItemVersions(workItemId, workItemVersionId, versionNumber)

Get WorkItem versions

&lt;br&gt;Use case  &lt;br&gt;User sets workitem identifier  &lt;br&gt;[Optional] User sets workitem version identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search workitem by identifier  &lt;br&gt;                      [Optional] If User set workitem version identifier, System search workitem version by version identifier                      Otherwise, system search all version of workitem                    &lt;br&gt;System returns array of workitem version models (listed in response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
String workItemId = "workItemId_example"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
UUID workItemVersionId = new UUID(); // UUID | WorkItem version (guid format)  identifier\"
Integer versionNumber = 56; // Integer | WorkItem version (integer format)  number\"
try {
    List<WorkItemVersionModel> result = apiInstance.getWorkItemVersions(workItemId, workItemVersionId, versionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#getWorkItemVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workItemId** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; |
 **workItemVersionId** | [**UUID**](.md)| WorkItem version (guid format)  identifier\&quot; | [optional]
 **versionNumber** | **Integer**| WorkItem version (integer format)  number\&quot; | [optional]

### Return type

[**List&lt;WorkItemVersionModel&gt;**](WorkItemVersionModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorkItem"></a>
# **updateWorkItem**
> updateWorkItem(body)

Update Test Case, Checklist or Shared Step

&lt;br&gt;Use case  &lt;br&gt;User sets workitem properties (listed in request parameters)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates workitem by identifier  &lt;br&gt;System returns updated workitem model (listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.WorkItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

WorkItemsApi apiInstance = new WorkItemsApi();
WorkItemPutModel body = new WorkItemPutModel(); // WorkItemPutModel | 
try {
    apiInstance.updateWorkItem(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkItemsApi#updateWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkItemPutModel**](WorkItemPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

