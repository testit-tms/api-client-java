# AutoTestsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutoTest**](AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create AutoTest
[**createMultiple**](AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create AutoTests multiple
[**deleteAutoTest**](AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{autoTestId} | Delete AutoTest by Id or GlobalId
[**deleteAutoTestLinkFromWorkItem**](AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{autoTestId}/workItems | Delete AutoTest link from WorkItem by Id or GlobalId  (if workItemId is not specified, then remove all links WorkItems to AutoTest)
[**getAllAutoTests**](AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests | Get all AutoTests (if parameters are specified, then it&#x27;s filtered by them.)
[**getAutoTestAverageDuration**](AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{autoTestId}/averageDuration | Get AutoTest average duration by Id or GlobalId
[**getAutoTestById**](AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{autoTestId} | Get AutoTest by Id or GlobalId
[**getAutoTestChronology**](AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{autoTestId}/chronology | Get AutoTest chronology by Id or GlobalId
[**getTestRuns**](AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{autoTestId}/testRuns | Stopped and completed TestRuns which contain AutoTest by Id or GlobalId
[**getWorkItemResults**](AutoTestsApi.md#getWorkItemResults) | **GET** /api/v2/autoTests/{autoTestId}/testResultHistory | History of TestResults for AutoTest by Id or GlobalId
[**getWorkItemsLinkedToAutoTest**](AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{autoTestId}/workItems | Get all WorkItems Ids linked to AutoTest by Id or GlobalId
[**linkAutoTestToWorkItem**](AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{autoTestId}/workItems | Link AutoTest to WorkItem by Id or GlobalId
[**updateAutoTest**](AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update AutoTest
[**updateMultiple**](AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update AutoTests multiple

<a name="createAutoTest"></a>
# **createAutoTest**
> AutoTestModel createAutoTest(body)

Create AutoTest

&lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
AutoTestPostModel body = new AutoTestPostModel(); // AutoTestPostModel | 
try {
    AutoTestModel result = apiInstance.createAutoTest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#createAutoTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoTestPostModel**](AutoTestPostModel.md)|  | [optional]

### Return type

[**AutoTestModel**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createMultiple"></a>
# **createMultiple**
> List&lt;AutoTestModel&gt; createMultiple(body)

Create AutoTests multiple

&lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
List<AutoTestPostModel> body = Arrays.asList(new AutoTestPostModel()); // List<AutoTestPostModel> | 
try {
    List<AutoTestModel> result = apiInstance.createMultiple(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#createMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AutoTestPostModel&gt;**](AutoTestPostModel.md)|  | [optional]

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteAutoTest"></a>
# **deleteAutoTest**
> deleteAutoTest(autoTestId)

Delete AutoTest by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System deletes autotest and returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | Autotest internal (guid format) or global  (integer format) identifier \"
try {
    apiInstance.deleteAutoTest(autoTestId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#deleteAutoTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| Autotest internal (guid format) or global  (integer format) identifier \&quot; |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAutoTestLinkFromWorkItem"></a>
# **deleteAutoTestLinkFromWorkItem**
> deleteAutoTestLinkFromWorkItem(autoTestId, workItemId)

Delete AutoTest link from WorkItem by Id or GlobalId  (if workItemId is not specified, then remove all links WorkItems to AutoTest)

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;[Optional] User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;                      [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it                      from autotest.                    &lt;br&gt;[Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | autotest internal (guid format) or global  (integer format) identifier
String workItemId = "workItemId_example"; // String | workItem internal (guid format) or global  (integer format) identifier
try {
    apiInstance.deleteAutoTestLinkFromWorkItem(autoTestId, workItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#deleteAutoTestLinkFromWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| autotest internal (guid format) or global  (integer format) identifier |
 **workItemId** | **String**| workItem internal (guid format) or global  (integer format) identifier | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAutoTests"></a>
# **getAllAutoTests**
> List&lt;AutoTestModel&gt; getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, classname, isClassnameNull, isDeleted, labels, stabilityMinimal, stabilityMaximal, isFlaky, includeSteps, includeLabels, , , , , )

Get all AutoTests (if parameters are specified, then it&#x27;s filtered by them.)

&lt;br&gt;Use case  &lt;br&gt;[Optional] User sets search parameters (listed in request parameters) and runs method execution  &lt;br&gt;System returns all autotests, matching search criteria

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
UUID projectId = new UUID(); // UUID | Project internal identifier
String externalId = "externalId_example"; // String | Autotest external identifier
Long globalId = 789L; // Long | Autotest global identifier
String namespace = "namespace_example"; // String | Name of abstract storage where autotest is located
Boolean isNamespaceNull = false; // Boolean | Boolean flag which defines if search must include autotests with null  value Namespace attribute
String classname = "classname_example"; // String | Name of the class where autotest is located
Boolean isClassnameNull = false; // Boolean | Boolean flag which defines if search must include autotests with null  value Classname attribute
Boolean isDeleted = false; // Boolean | Boolean flag which defines if search must include deleted autotests
List<String> labels = Arrays.asList("labels_example"); // List<String> | List of autotests labels to filter by
Integer stabilityMinimal = 56; // Integer | Minimal stability value to filter by
Integer stabilityMaximal = 56; // Integer | Maximal stability value to filter by
Boolean isFlaky = true; // Boolean | [Optional] If flaky is set
Boolean includeSteps = true; // Boolean | Boolean flag which defines if setup, steps and teardown fields must be included
Boolean includeLabels = true; // Boolean | Boolean flag which defines if labels field must be included
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<AutoTestModel> result = apiInstance.getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, classname, isClassnameNull, isDeleted, labels, stabilityMinimal, stabilityMaximal, isFlaky, includeSteps, includeLabels, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getAllAutoTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**UUID**](.md)| Project internal identifier | [optional]
 **externalId** | **String**| Autotest external identifier | [optional]
 **globalId** | **Long**| Autotest global identifier | [optional]
 **namespace** | **String**| Name of abstract storage where autotest is located | [optional]
 **isNamespaceNull** | **Boolean**| Boolean flag which defines if search must include autotests with null  value Namespace attribute | [optional] [default to false]
 **classname** | **String**| Name of the class where autotest is located | [optional]
 **isClassnameNull** | **Boolean**| Boolean flag which defines if search must include autotests with null  value Classname attribute | [optional] [default to false]
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted autotests | [optional] [default to false]
 **labels** | [**List&lt;String&gt;**](String.md)| List of autotests labels to filter by | [optional]
 **stabilityMinimal** | **Integer**| Minimal stability value to filter by | [optional]
 **stabilityMaximal** | **Integer**| Maximal stability value to filter by | [optional]
 **isFlaky** | **Boolean**| [Optional] If flaky is set | [optional]
 **includeSteps** | **Boolean**| Boolean flag which defines if setup, steps and teardown fields must be included | [optional] [default to true]
 **includeLabels** | **Boolean**| Boolean flag which defines if labels field must be included | [optional] [default to true]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoTestAverageDuration"></a>
# **getAutoTestAverageDuration**
> AutoTestAverageDurationModel getAutoTestAverageDuration(autoTestId)

Get AutoTest average duration by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System calculates pass average duration and fail average duration of autotest from all related test results  &lt;br&gt;System returns pass average duration and fail average duration for autotest

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | autotest internal (guid format) or global  (integer format) identifier
try {
    AutoTestAverageDurationModel result = apiInstance.getAutoTestAverageDuration(autoTestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getAutoTestAverageDuration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| autotest internal (guid format) or global  (integer format) identifier |

### Return type

[**AutoTestAverageDurationModel**](AutoTestAverageDurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoTestById"></a>
# **getAutoTestById**
> AutoTestModel getAutoTestById(autoTestId)

Get AutoTest by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal or global identifier and runs method execution  &lt;br&gt;                      System returns autotest, which internal or global identifier equals the identifier value set in the previous                      action                  

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | Autotest internal identifier (guid format) or  global identifier (integer format)
try {
    AutoTestModel result = apiInstance.getAutoTestById(autoTestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getAutoTestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| Autotest internal identifier (guid format) or  global identifier (integer format) |

### Return type

[**AutoTestModel**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoTestChronology"></a>
# **getAutoTestChronology**
> List&lt;TestResultChronologyModel&gt; getAutoTestChronology(autoTestId)

Get AutoTest chronology by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search all test results related to autotest (with default limit equal 100)  &lt;br&gt;                      System orders the test results by CompletedOn property descending and then orders by CreatedDate property                      descending                    &lt;br&gt;System returns test result chronology for autotest

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | autotest internal (guid format) or global  (integer format) identifier
try {
    List<TestResultChronologyModel> result = apiInstance.getAutoTestChronology(autoTestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getAutoTestChronology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| autotest internal (guid format) or global  (integer format) identifier |

### Return type

[**List&lt;TestResultChronologyModel&gt;**](TestResultChronologyModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestRuns"></a>
# **getTestRuns**
> List&lt;TestRunShortModel&gt; getTestRuns(autoTestId)

Stopped and completed TestRuns which contain AutoTest by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search for all test runs related to the autotest  &lt;br&gt;System returns the enumeration of test runs

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | autotest internal (guid format) or global  (integer format) identifier
try {
    List<TestRunShortModel> result = apiInstance.getTestRuns(autoTestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getTestRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| autotest internal (guid format) or global  (integer format) identifier |

### Return type

[**List&lt;TestRunShortModel&gt;**](TestRunShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemResults"></a>
# **getWorkItemResults**
> List&lt;TestResultHistoryReportModel&gt; getWorkItemResults(autoTestId, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, testRunIds, , , , , )

History of TestResults for AutoTest by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets getTestResultHistoryReportQuery (listed in the example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search for test results using filters set by user in getTestResultHistoryReportQuery and autoTestId  &lt;br&gt;System returns the enumeration of test results

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | autotest internal (guid format) or global  (integer format) identifier
OffsetDateTime from = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime to = new OffsetDateTime(); // OffsetDateTime | 
List<UUID> configurationIds = Arrays.asList(new UUID()); // List<UUID> | 
List<UUID> testPlanIds = Arrays.asList(new UUID()); // List<UUID> | 
List<UUID> userIds = Arrays.asList(new UUID()); // List<UUID> | 
List<String> outcomes = Arrays.asList("outcomes_example"); // List<String> | 
Boolean isAutomated = true; // Boolean | 
List<UUID> testRunIds = Arrays.asList(new UUID()); // List<UUID> | 
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<TestResultHistoryReportModel> result = apiInstance.getWorkItemResults(autoTestId, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, testRunIds, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getWorkItemResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| autotest internal (guid format) or global  (integer format) identifier |
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]
 **configurationIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **testPlanIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **userIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **outcomes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **isAutomated** | **Boolean**|  | [optional]
 **testRunIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;TestResultHistoryReportModel&gt;**](TestResultHistoryReportModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemsLinkedToAutoTest"></a>
# **getWorkItemsLinkedToAutoTest**
> List&lt;WorkItemIdModel&gt; getWorkItemsLinkedToAutoTest(autoTestId, isWorkItemDeleted)

Get all WorkItems Ids linked to AutoTest by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System finds all actual and not deleted WorkItems related to the found autotest  &lt;br&gt;System returns the enumeration of WorkItems

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | Autotest internal (guid format) or global  (integer format) identifier
Boolean isWorkItemDeleted = false; // Boolean | Boolean flag which defines if search must include deleted worItems
try {
    List<WorkItemIdModel> result = apiInstance.getWorkItemsLinkedToAutoTest(autoTestId, isWorkItemDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#getWorkItemsLinkedToAutoTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| Autotest internal (guid format) or global  (integer format) identifier |
 **isWorkItemDeleted** | **Boolean**| Boolean flag which defines if search must include deleted worItems | [optional] [default to false]

### Return type

[**List&lt;WorkItemIdModel&gt;**](WorkItemIdModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linkAutoTestToWorkItem"></a>
# **linkAutoTestToWorkItem**
> linkAutoTestToWorkItem(autoTestId, body)

Link AutoTest to WorkItem by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;System finds the workitem by the workitem identifier  &lt;br&gt;System relates the workitem with the autotest and returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
String autoTestId = "autoTestId_example"; // String | Autotest internal (guid format) or global  (integer format) identifier
WorkItemIdModel body = new WorkItemIdModel(); // WorkItemIdModel | 
try {
    apiInstance.linkAutoTestToWorkItem(autoTestId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#linkAutoTestToWorkItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoTestId** | **String**| Autotest internal (guid format) or global  (integer format) identifier |
 **body** | [**WorkItemIdModel**](WorkItemIdModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateAutoTest"></a>
# **updateAutoTest**
> updateAutoTest(body)

Update AutoTest

&lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;                      [Optional] If steps enumeration is set, system creates step items, relates them to autotest                      and deletes relations with current steps( if exist)                    &lt;br&gt;                      [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest                      and deletes relations with current Setup items (if exist)                    &lt;br&gt;                      [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest                      and deletes relations with current teardown items (if exist)                    &lt;br&gt;                      [Optional] If label enumeration is set, system creates labels and relates them to autotest                      and deletes relations with current Labels (if exist)                    &lt;br&gt;                      [Optional] If link enumeration is set, system creates links and relates them to autotest                      and deletes relations with current Links (if exist)                    &lt;br&gt;System updates autotest and returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
AutoTestPutModel body = new AutoTestPutModel(); // AutoTestPutModel | 
try {
    apiInstance.updateAutoTest(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#updateAutoTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoTestPutModel**](AutoTestPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateMultiple"></a>
# **updateMultiple**
> updateMultiple(body)

Update AutoTests multiple

&lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;                      [Optional] If steps enumeration is set, system creates step items, relates them to autotest                      and deletes relations with current steps( if exist)                    &lt;br&gt;                      [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest                      and deletes relations with current Setup items (if exist)                    &lt;br&gt;                      [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest                      and deletes relations with current teardown items (if exist)                    &lt;br&gt;                      [Optional] If label enumeration is set, system creates labels and relates them to autotest                      and deletes relations with current Labels (if exist)                    &lt;br&gt;                      [Optional] If link enumeration is set, system creates links and relates them to autotest                      and deletes relations with current Links (if exist)                    &lt;br&gt;System updates autotest and returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AutoTestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AutoTestsApi apiInstance = new AutoTestsApi();
List<AutoTestPutModel> body = Arrays.asList(new AutoTestPutModel()); // List<AutoTestPutModel> | 
try {
    apiInstance.updateMultiple(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoTestsApi#updateMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;AutoTestPutModel&gt;**](AutoTestPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

