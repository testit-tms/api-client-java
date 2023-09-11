# TestPlansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTestPointsWithSections**](TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{id}/test-points/withSections | Add test-points to TestPlan with sections |
| [**addWorkItemsWithSections**](TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{id}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites |
| [**apiV2TestPlansIdAnalyticsGet**](TestPlansApi.md#apiV2TestPlansIdAnalyticsGet) | **GET** /api/v2/testPlans/{id}/analytics | Get analytics by TestPlan |
| [**apiV2TestPlansIdAutobalancePost**](TestPlansApi.md#apiV2TestPlansIdAutobalancePost) | **POST** /api/v2/testPlans/{id}/autobalance | Distribute test points between the users |
| [**apiV2TestPlansIdConfigurationsGet**](TestPlansApi.md#apiV2TestPlansIdConfigurationsGet) | **GET** /api/v2/testPlans/{id}/configurations | Get TestPlan configurations |
| [**apiV2TestPlansIdExportTestPointsXlsxPost**](TestPlansApi.md#apiV2TestPlansIdExportTestPointsXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testPoints/xlsx | Export TestPoints from TestPlan in xls format |
| [**apiV2TestPlansIdExportTestResultHistoryXlsxPost**](TestPlansApi.md#apiV2TestPlansIdExportTestResultHistoryXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testResultHistory/xlsx | Export TestResults history from TestPlan in xls format |
| [**apiV2TestPlansIdHistoryGet**](TestPlansApi.md#apiV2TestPlansIdHistoryGet) | **GET** /api/v2/testPlans/{id}/history | Get TestPlan history |
| [**apiV2TestPlansIdLinksGet**](TestPlansApi.md#apiV2TestPlansIdLinksGet) | **GET** /api/v2/testPlans/{id}/links | Get Links of TestPlan |
| [**apiV2TestPlansIdPatch**](TestPlansApi.md#apiV2TestPlansIdPatch) | **PATCH** /api/v2/testPlans/{id} | Patch test plan |
| [**apiV2TestPlansIdTestPointsLastResultsGet**](TestPlansApi.md#apiV2TestPlansIdTestPointsLastResultsGet) | **GET** /api/v2/testPlans/{id}/testPoints/lastResults | Get TestPoints with last result from TestPlan |
| [**apiV2TestPlansIdTestPointsResetPost**](TestPlansApi.md#apiV2TestPlansIdTestPointsResetPost) | **POST** /api/v2/testPlans/{id}/testPoints/reset | Reset TestPoints status of TestPlan |
| [**apiV2TestPlansIdTestPointsTesterDelete**](TestPlansApi.md#apiV2TestPlansIdTestPointsTesterDelete) | **DELETE** /api/v2/testPlans/{id}/testPoints/tester | Unassign users from multiple test points |
| [**apiV2TestPlansIdTestPointsTesterUserIdPost**](TestPlansApi.md#apiV2TestPlansIdTestPointsTesterUserIdPost) | **POST** /api/v2/testPlans/{id}/testPoints/tester/{userId} | Assign user as a tester to multiple test points |
| [**apiV2TestPlansIdTestRunsGet**](TestPlansApi.md#apiV2TestPlansIdTestRunsGet) | **GET** /api/v2/testPlans/{id}/testRuns | Get TestRuns of TestPlan |
| [**apiV2TestPlansIdTestRunsSearchPost**](TestPlansApi.md#apiV2TestPlansIdTestRunsSearchPost) | **POST** /api/v2/testPlans/{id}/testRuns/search | Search TestRuns of TestPlan |
| [**apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet**](TestPlansApi.md#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet) | **GET** /api/v2/testPlans/{id}/testRuns/testResults/lastModified/modifiedDate | Get last modification date of test plan&#39;s test results |
| [**apiV2TestPlansIdUnlockRequestPost**](TestPlansApi.md#apiV2TestPlansIdUnlockRequestPost) | **POST** /api/v2/testPlans/{id}/unlock/request | Send unlock TestPlan notification |
| [**apiV2TestPlansShortsPost**](TestPlansApi.md#apiV2TestPlansShortsPost) | **POST** /api/v2/testPlans/shorts | Get TestPlans short models by Project identifiers |
| [**clone**](TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{id}/clone | Clone TestPlan |
| [**complete**](TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{id}/complete | Complete TestPlan |
| [**createTestPlan**](TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan |
| [**deleteTestPlan**](TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{id} | Delete TestPlan |
| [**getTestPlanById**](TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{id} | Get TestPlan by Id |
| [**getTestSuitesById**](TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{id}/testSuites | Get TestSuites Tree By Id |
| [**pause**](TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{id}/pause | Pause TestPlan |
| [**purgeTestPlan**](TestPlansApi.md#purgeTestPlan) | **POST** /api/v2/testPlans/{id}/purge | Permanently delete test plan from archive |
| [**restoreTestPlan**](TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{id}/restore | Restore TestPlan |
| [**start**](TestPlansApi.md#start) | **POST** /api/v2/testPlans/{id}/start | Start TestPlan |
| [**updateTestPlan**](TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan |



## addTestPointsWithSections

> addTestPointsWithSections(id, apiV2ProjectsIdWorkItemsSearchPostRequest)

Add test-points to TestPlan with sections

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        ApiV2ProjectsIdWorkItemsSearchPostRequest apiV2ProjectsIdWorkItemsSearchPostRequest = new ApiV2ProjectsIdWorkItemsSearchPostRequest(); // ApiV2ProjectsIdWorkItemsSearchPostRequest | Filter object to retrieve work items for test-suite's project
        try {
            apiInstance.addTestPointsWithSections(id, apiV2ProjectsIdWorkItemsSearchPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#addTestPointsWithSections");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
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
| **204** | Successful operation |  -  |
| **422** | Shared steps cannot be added to test suite |  -  |
| **404** | Test suite with provided ID was not found |  -  |
| **403** | Update permission for test plan is required |  -  |
| **401** | Unauthorized |  -  |


## addWorkItemsWithSections

> addWorkItemsWithSections(id, UUID)

Add WorkItems to TestPlan with Sections as TestSuites

<br>Use case
<br>User sets TestPlan identifier
<br>User sets WorkItem identifiers (listed in request example)
<br>User runs method execution
<br>System added WorkItems and Sections to TestPlan
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
        try {
            apiInstance.addWorkItemsWithSections(id, UUID);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#addWorkItemsWithSections");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
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
| **422** | Can&#39;t put a SharedStep in the TestSuite |  -  |
| **403** | Update permission for TestPlan required |  -  |
| **401** | Unauthorized |  -  |
| **400** | &lt;br&gt;TestPlan is locked  &lt;br&gt;Some of configurations do not exist in the project, or they are not active |  -  |
| **404** | &lt;br&gt;Can&#39;t find a TestPlan with id  &lt;br&gt;Some of workItems do not exist |  -  |
| **204** | Successful operation |  -  |


## apiV2TestPlansIdAnalyticsGet

> TestPointAnalyticResult apiV2TestPlansIdAnalyticsGet(id)

Get analytics by TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System returns analytics by test plan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            TestPointAnalyticResult result = apiInstance.apiV2TestPlansIdAnalyticsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdAnalyticsGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPointAnalyticResult**](TestPointAnalyticResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Can&#39;t find a Project with id |  -  |
| **400** | Bad Request |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## apiV2TestPlansIdAutobalancePost

> TestPlanWithTestSuiteTreeModel apiV2TestPlansIdAutobalancePost(id, testers)

Distribute test points between the users

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "id_example"; // String | Test plan unique or global ID
        Set<UUID> testers = Arrays.asList(); // Set<UUID> | Specifies a project user IDs to distribute
        try {
            TestPlanWithTestSuiteTreeModel result = apiInstance.apiV2TestPlansIdAutobalancePost(id, testers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdAutobalancePost");
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
| **id** | **String**| Test plan unique or global ID | |
| **testers** | **List&lt;UUID&gt;**| Specifies a project user IDs to distribute | [optional] |

### Return type

[**TestPlanWithTestSuiteTreeModel**](TestPlanWithTestSuiteTreeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for test plan is required |  -  |


## apiV2TestPlansIdConfigurationsGet

> List&lt;ConfigurationModel&gt; apiV2TestPlansIdConfigurationsGet(id)

Get TestPlan configurations

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System return test plan configurations

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            List<ConfigurationModel> result = apiInstance.apiV2TestPlansIdConfigurationsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdConfigurationsGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **400** | Bad Request |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | TestPlan not found |  -  |


## apiV2TestPlansIdExportTestPointsXlsxPost

> File apiV2TestPlansIdExportTestPointsXlsxPost(id, timeZoneOffsetInMinutes, apiV2TestPlansIdExportTestPointsXlsxPostRequest)

Export TestPoints from TestPlan in xls format

<br>Use case
<br>User sets test plan identifier
<br>User sets filter model (listed in request example)
<br>User runs method execution
<br>System return export xlsx file

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Long timeZoneOffsetInMinutes = 56L; // Long | 
        ApiV2TestPlansIdExportTestPointsXlsxPostRequest apiV2TestPlansIdExportTestPointsXlsxPostRequest = new ApiV2TestPlansIdExportTestPointsXlsxPostRequest(); // ApiV2TestPlansIdExportTestPointsXlsxPostRequest | 
        try {
            File result = apiInstance.apiV2TestPlansIdExportTestPointsXlsxPost(id, timeZoneOffsetInMinutes, apiV2TestPlansIdExportTestPointsXlsxPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdExportTestPointsXlsxPost");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |
| **apiV2TestPlansIdExportTestPointsXlsxPostRequest** | [**ApiV2TestPlansIdExportTestPointsXlsxPostRequest**](ApiV2TestPlansIdExportTestPointsXlsxPostRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **404** | TestPlan not found |  -  |
| **403** | Read permission for test plan required |  -  |
| **401** | Unauthorized |  -  |


## apiV2TestPlansIdExportTestResultHistoryXlsxPost

> File apiV2TestPlansIdExportTestResultHistoryXlsxPost(id, mustReturnOnlyLastTestResult, includeSteps, includeDeletedTestSuites, timeZoneOffsetInMinutes)

Export TestResults history from TestPlan in xls format

<br>Use case
<br>User sets test plan identifier
<br>User sets filter model (listed in request example)
<br>User runs method execution
<br>System return export xlsx file

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Boolean mustReturnOnlyLastTestResult = true; // Boolean | 
        Boolean includeSteps = true; // Boolean | 
        Boolean includeDeletedTestSuites = true; // Boolean | 
        Long timeZoneOffsetInMinutes = 56L; // Long | 
        try {
            File result = apiInstance.apiV2TestPlansIdExportTestResultHistoryXlsxPost(id, mustReturnOnlyLastTestResult, includeSteps, includeDeletedTestSuites, timeZoneOffsetInMinutes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdExportTestResultHistoryXlsxPost");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **mustReturnOnlyLastTestResult** | **Boolean**|  | [optional] |
| **includeSteps** | **Boolean**|  | [optional] |
| **includeDeletedTestSuites** | **Boolean**|  | [optional] |
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | TestPlan not found |  -  |
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |


## apiV2TestPlansIdHistoryGet

> List&lt;TestPlanChangeModel&gt; apiV2TestPlansIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)

Get TestPlan history

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System return test plan history

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TestPlanChangeModel> result = apiInstance.apiV2TestPlansIdHistoryGet(id, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdHistoryGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestPlanChangeModel&gt;**](TestPlanChangeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **404** | TestPlan not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |


## apiV2TestPlansIdLinksGet

> List&lt;TestPlanLink&gt; apiV2TestPlansIdLinksGet(id, skip, take, orderBy)

Get Links of TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User sets pagination filter (listed in request example)
<br>User runs method execution
<br>System returns links of TestPlan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Integer skip = 56; // Integer | 
        Integer take = 56; // Integer | 
        String orderBy = "orderBy_example"; // String | 
        try {
            List<TestPlanLink> result = apiInstance.apiV2TestPlansIdLinksGet(id, skip, take, orderBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdLinksGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **Integer**|  | [optional] |
| **take** | **Integer**|  | [optional] |
| **orderBy** | **String**|  | [optional] |

### Return type

[**List&lt;TestPlanLink&gt;**](TestPlanLink.md)

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
| **403** | Read permission for test plan is required |  -  |


## apiV2TestPlansIdPatch

> apiV2TestPlansIdPatch(id, operation)

Patch test plan

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
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Unique ID of the test plan
        List<Operation> operation = Arrays.asList(); // List<Operation> | 
        try {
            apiInstance.apiV2TestPlansIdPatch(id, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdPatch");
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
| **id** | **UUID**| Unique ID of the test plan | |
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
| **403** | Update permission for test plan is required |  -  |
| **204** | No Content |  -  |


## apiV2TestPlansIdTestPointsLastResultsGet

> List&lt;TestPointWithLastResultModel&gt; apiV2TestPlansIdTestPointsLastResultsGet(id, testerId, skip, take, orderBy, searchField, searchValue)

Get TestPoints with last result from TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User sets filter (listed in request example)
<br>User runs method execution
<br>System return test points with last result from test plan

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        UUID testerId = UUID.randomUUID(); // UUID | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TestPointWithLastResultModel> result = apiInstance.apiV2TestPlansIdTestPointsLastResultsGet(id, testerId, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestPointsLastResultsGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **testerId** | **UUID**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestPointWithLastResultModel&gt;**](TestPointWithLastResultModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **404** | TestPlan not found |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **403** | Read permission for test plan required |  -  |


## apiV2TestPlansIdTestPointsResetPost

> apiV2TestPlansIdTestPointsResetPost(id, UUID)

Reset TestPoints status of TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User sets test points identifiers
<br>User runs method execution
<br>System reset test points statuses of test plan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
        try {
            apiInstance.apiV2TestPlansIdTestPointsResetPost(id, UUID);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestPointsResetPost");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
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
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **422** | Client Error |  -  |
| **401** | Unauthorized |  -  |


## apiV2TestPlansIdTestPointsTesterDelete

> List&lt;UUID&gt; apiV2TestPlansIdTestPointsTesterDelete(id, apiV2TestPlansIdTestPointsTesterUserIdPostRequest)

Unassign users from multiple test points

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the test plan
        ApiV2TestPlansIdTestPointsTesterUserIdPostRequest apiV2TestPlansIdTestPointsTesterUserIdPostRequest = new ApiV2TestPlansIdTestPointsTesterUserIdPostRequest(); // ApiV2TestPlansIdTestPointsTesterUserIdPostRequest | 
        try {
            List<UUID> result = apiInstance.apiV2TestPlansIdTestPointsTesterDelete(id, apiV2TestPlansIdTestPointsTesterUserIdPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestPointsTesterDelete");
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
| **id** | **String**| Unique or global ID of the test plan | |
| **apiV2TestPlansIdTestPointsTesterUserIdPostRequest** | [**ApiV2TestPlansIdTestPointsTesterUserIdPostRequest**](ApiV2TestPlansIdTestPointsTesterUserIdPostRequest.md)|  | [optional] |

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
| **403** | Update permission for test plans is required |  -  |
| **200** | Success |  -  |


## apiV2TestPlansIdTestPointsTesterUserIdPost

> List&lt;UUID&gt; apiV2TestPlansIdTestPointsTesterUserIdPost(id, userId, apiV2TestPlansIdTestPointsTesterUserIdPostRequest)

Assign user as a tester to multiple test points

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the test plan
        UUID userId = UUID.randomUUID(); // UUID | Unique ID of the user
        ApiV2TestPlansIdTestPointsTesterUserIdPostRequest apiV2TestPlansIdTestPointsTesterUserIdPostRequest = new ApiV2TestPlansIdTestPointsTesterUserIdPostRequest(); // ApiV2TestPlansIdTestPointsTesterUserIdPostRequest | 
        try {
            List<UUID> result = apiInstance.apiV2TestPlansIdTestPointsTesterUserIdPost(id, userId, apiV2TestPlansIdTestPointsTesterUserIdPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestPointsTesterUserIdPost");
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
| **id** | **String**| Unique or global ID of the test plan | |
| **userId** | **UUID**| Unique ID of the user | |
| **apiV2TestPlansIdTestPointsTesterUserIdPostRequest** | [**ApiV2TestPlansIdTestPointsTesterUserIdPostRequest**](ApiV2TestPlansIdTestPointsTesterUserIdPostRequest.md)|  | [optional] |

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
| **200** | Success |  -  |
| **403** | Update permission for test plans is required |  -  |


## apiV2TestPlansIdTestRunsGet

> List&lt;TestRunModel&gt; apiV2TestPlansIdTestRunsGet(id, notStarted, inProgress, stopped, completed, skip, take, orderBy, searchField, searchValue)

Get TestRuns of TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User sets TestRun status filter (listed in request example)
<br>User runs method execution
<br>System returns TestRuns for TestPlan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Boolean notStarted = true; // Boolean | 
        Boolean inProgress = true; // Boolean | 
        Boolean stopped = true; // Boolean | 
        Boolean completed = true; // Boolean | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TestRunModel> result = apiInstance.apiV2TestPlansIdTestRunsGet(id, notStarted, inProgress, stopped, completed, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestRunsGet");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **notStarted** | **Boolean**|  | [optional] |
| **inProgress** | **Boolean**|  | [optional] |
| **stopped** | **Boolean**|  | [optional] |
| **completed** | **Boolean**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan is required |  -  |


## apiV2TestPlansIdTestRunsSearchPost

> List&lt;TestRunModel&gt; apiV2TestPlansIdTestRunsSearchPost(id, skip, take, orderBy, searchField, searchValue, apiV2TestPlansIdTestRunsSearchPostRequest)

Search TestRuns of TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User sets TestRuns filter (listed in request example)
<br>User runs method execution
<br>System returns TestRuns for TestPlan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        ApiV2TestPlansIdTestRunsSearchPostRequest apiV2TestPlansIdTestRunsSearchPostRequest = new ApiV2TestPlansIdTestRunsSearchPostRequest(); // ApiV2TestPlansIdTestRunsSearchPostRequest | 
        try {
            List<TestRunModel> result = apiInstance.apiV2TestPlansIdTestRunsSearchPost(id, skip, take, orderBy, searchField, searchValue, apiV2TestPlansIdTestRunsSearchPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestRunsSearchPost");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **apiV2TestPlansIdTestRunsSearchPostRequest** | [**ApiV2TestPlansIdTestRunsSearchPostRequest**](ApiV2TestPlansIdTestRunsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test plan is required |  -  |


## apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet

> OffsetDateTime apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet(id)

Get last modification date of test plan&#39;s test results

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "id_example"; // String | Test plan unique or global ID
        try {
            OffsetDateTime result = apiInstance.apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet");
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
| **id** | **String**| Test plan unique or global ID | |

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
| **403** | Read permission for test plan is required |  -  |
| **204** | Last modification date does not exist |  -  |
| **200** | Last modification date exists |  -  |


## apiV2TestPlansIdUnlockRequestPost

> apiV2TestPlansIdUnlockRequestPost(id)

Send unlock TestPlan notification

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System send unlock test plan notification

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.apiV2TestPlansIdUnlockRequestPost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansIdUnlockRequestPost");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **401** | Unauthorized |  -  |
| **403** | Read permission for test plan required |  -  |
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **404** | TestPlan not found |  -  |


## apiV2TestPlansShortsPost

> List&lt;TestPlanShortModel&gt; apiV2TestPlansShortsPost(isDeleted, UUID)

Get TestPlans short models by Project identifiers

<br>Use case
<br>User sets projects identifiers
<br>User runs method execution
<br>System return test plans short models (listed in response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        Boolean isDeleted = true; // Boolean | 
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
        try {
            List<TestPlanShortModel> result = apiInstance.apiV2TestPlansShortsPost(isDeleted, UUID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#apiV2TestPlansShortsPost");
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
| **isDeleted** | **Boolean**|  | [optional] |
| **UUID** | **List&lt;UUID&gt;**|  | [optional] |

### Return type

[**List&lt;TestPlanShortModel&gt;**](TestPlanShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **403** | Read permission for project required |  -  |
| **404** | Project not found |  -  |
| **401** | Unauthorized |  -  |


## clone

> TestPlanModel clone(id)

Clone TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System clones test plan
<br>System returns test plan (listed in response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            TestPlanModel result = apiInstance.clone(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#clone");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **201** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |


## complete

> complete(id)

Complete TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System completes the test plan and updates test plan status
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.complete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#complete");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |
| **400** | &lt;br&gt;Execute status from New to Completed forbidden  &lt;br&gt;Execute status from Completed to Completed forbidden |  -  |


## createTestPlan

> TestPlanModel createTestPlan(createTestPlanRequest)

Create TestPlan

<br>Use case
<br>User sets test plan properties (listed in request example)
<br>User runs method execution
<br>System creates test plan
<br>System returns test plan (listed in response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        CreateTestPlanRequest createTestPlanRequest = new CreateTestPlanRequest(); // CreateTestPlanRequest | 
        try {
            TestPlanModel result = apiInstance.createTestPlan(createTestPlanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#createTestPlan");
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
| **createTestPlanRequest** | [**CreateTestPlanRequest**](CreateTestPlanRequest.md)|  | [optional] |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **409** | TestPlan with the same name already exists! |  -  |
| **201** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;Tags must be no more than 10! |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test plan required |  -  |


## deleteTestPlan

> deleteTestPlan(id)

Delete TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System delete test plan
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.deleteTestPlan(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#deleteTestPlan");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **401** | Unauthorized |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |
| **403** | Delete permission for test plan required |  -  |
| **204** | Successful operation |  -  |


## getTestPlanById

> TestPlanModel getTestPlanById(id)

Get TestPlan by Id

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System search  test plan by the identifier
<br>System returns test plan

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            TestPlanModel result = apiInstance.getTestPlanById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#getTestPlanById");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for test plan required |  -  |
| **404** | Can&#39;t find a Project with id |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## getTestSuitesById

> List&lt;TestSuiteV2TreeModel&gt; getTestSuitesById(id)

Get TestSuites Tree By Id

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System finds test suites related to the test plan
<br>System returns test suites as a tree model (listed in response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            List<TestSuiteV2TreeModel> result = apiInstance.getTestSuitesById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#getTestSuitesById");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**List&lt;TestSuiteV2TreeModel&gt;**](TestSuiteV2TreeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **403** | Read permission for test plan required |  -  |
| **404** | Can&#39;t find a TestRun with id! |  -  |
| **401** | Unauthorized |  -  |


## pause

> pause(id)

Pause TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System pauses the test plan and updates test plan status
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.pause(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#pause");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **403** | Update permission for test plan required |  -  |
| **400** | &lt;br&gt;Execute status from New to Paused forbidden  &lt;br&gt;Execute status from Paused to Paused forbidden  &lt;br&gt;Execute status from Completed to Paused forbidden |  -  |
| **401** | Unauthorized |  -  |
| **204** | Successful operation |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |


## purgeTestPlan

> purgeTestPlan(id)

Permanently delete test plan from archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the test plan
        try {
            apiInstance.purgeTestPlan(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#purgeTestPlan");
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
| **id** | **String**| Unique or global ID of the test plan | |

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
| **204** | No Content |  -  |
| **403** | Full access permission for the archive is required |  -  |


## restoreTestPlan

> restoreTestPlan(id)

Restore TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System restores test plan
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.restoreTestPlan(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#restoreTestPlan");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **403** | Update permission for test plan required |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |


## start

> start(id)

Start TestPlan

<br>Use case
<br>User sets test plan identifier
<br>User runs method execution
<br>System starts the test plan and updates test plan status
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Test plan internal (guid format) or global (int  format) identifier
        try {
            apiInstance.start(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#start");
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
| **id** | **String**| Test plan internal (guid format) or global (int  format) identifier | |

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
| **403** | Update permission for test plan required |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## updateTestPlan

> updateTestPlan(updateTestPlanRequest)

Update TestPlan

<br>Use case
<br>User sets test plan properties(listed in request example)
<br>User runs method execution
<br>System updates test plan
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TestPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TestPlansApi apiInstance = new TestPlansApi(defaultClient);
        UpdateTestPlanRequest updateTestPlanRequest = new UpdateTestPlanRequest(); // UpdateTestPlanRequest | 
        try {
            apiInstance.updateTestPlan(updateTestPlanRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestPlansApi#updateTestPlan");
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
| **updateTestPlanRequest** | [**UpdateTestPlanRequest**](UpdateTestPlanRequest.md)|  | [optional] |

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
| **422** | Can&#39;t change ProjectId |  -  |
| **204** | Successful operation |  -  |
| **400** | &lt;br&gt;Field is required  &lt;br&gt;Tags must be no more than 10!  &lt;br&gt;StartDate can&#39;t be more than EndDate! |  -  |
| **403** | Update permission for test plan required |  -  |
| **404** | Can&#39;t find a TestPlan with id! |  -  |
| **409** | TestPlan with the same name already exists! |  -  |

