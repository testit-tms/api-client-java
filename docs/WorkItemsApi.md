# WorkItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2WorkItemsIdAttachmentsPost**](WorkItemsApi.md#apiV2WorkItemsIdAttachmentsPost) | **POST** /api/v2/workItems/{id}/attachments | Upload and link attachment to WorkItem |
| [**apiV2WorkItemsIdCheckListTransformToTestCasePost**](WorkItemsApi.md#apiV2WorkItemsIdCheckListTransformToTestCasePost) | **POST** /api/v2/workItems/{id}/checkList/transformTo/testCase | Transform CheckList to TestCase |
| [**apiV2WorkItemsIdHistoryGet**](WorkItemsApi.md#apiV2WorkItemsIdHistoryGet) | **GET** /api/v2/workItems/{id}/history | Get change history of WorkItem |
| [**apiV2WorkItemsIdLikeDelete**](WorkItemsApi.md#apiV2WorkItemsIdLikeDelete) | **DELETE** /api/v2/workItems/{id}/like | Delete like from WorkItem |
| [**apiV2WorkItemsIdLikePost**](WorkItemsApi.md#apiV2WorkItemsIdLikePost) | **POST** /api/v2/workItems/{id}/like | Set like to WorkItem |
| [**apiV2WorkItemsIdLikesCountGet**](WorkItemsApi.md#apiV2WorkItemsIdLikesCountGet) | **GET** /api/v2/workItems/{id}/likes/count | Get likes count of WorkItem |
| [**apiV2WorkItemsIdLikesGet**](WorkItemsApi.md#apiV2WorkItemsIdLikesGet) | **GET** /api/v2/workItems/{id}/likes | Get likes of WorkItem |
| [**apiV2WorkItemsIdTestResultsHistoryGet**](WorkItemsApi.md#apiV2WorkItemsIdTestResultsHistoryGet) | **GET** /api/v2/workItems/{id}/testResults/history | Get test results history of WorkItem |
| [**apiV2WorkItemsIdVersionVersionIdActualPost**](WorkItemsApi.md#apiV2WorkItemsIdVersionVersionIdActualPost) | **POST** /api/v2/workItems/{id}/version/{versionId}/actual | Set WorkItem as actual |
| [**apiV2WorkItemsLinksUrlsSearchPost**](WorkItemsApi.md#apiV2WorkItemsLinksUrlsSearchPost) | **POST** /api/v2/workItems/links/urls/search |  |
| [**apiV2WorkItemsMovePost**](WorkItemsApi.md#apiV2WorkItemsMovePost) | **POST** /api/v2/workItems/move | Move WorkItem to another section |
| [**apiV2WorkItemsPost**](WorkItemsApi.md#apiV2WorkItemsPost) | **POST** /api/v2/workItems | Creates work item |
| [**apiV2WorkItemsSearchPost**](WorkItemsApi.md#apiV2WorkItemsSearchPost) | **POST** /api/v2/workItems/search | Search for work items |
| [**apiV2WorkItemsSharedStepIdReferencesSectionsPost**](WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesSectionsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/sections | Get SharedStep references in sections |
| [**apiV2WorkItemsSharedStepIdReferencesWorkItemsPost**](WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/workItems | Get SharedStep references in work items |
| [**apiV2WorkItemsSharedStepsSharedStepIdReferencesGet**](WorkItemsApi.md#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet) | **GET** /api/v2/workItems/sharedSteps/{sharedStepId}/references | Get SharedStep references |
| [**deleteAllWorkItemsFromAutoTest**](WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{id}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId |
| [**deleteWorkItem**](WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{id} | Delete Test Case, Checklist or Shared Step by Id or GlobalId |
| [**getAutoTestsForWorkItem**](WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{id}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId |
| [**getIterations**](WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{id}/iterations | Get iterations by work item Id or GlobalId |
| [**getWorkItemById**](WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{id} | Get Test Case, Checklist or Shared Step by Id or GlobalId |
| [**getWorkItemChronology**](WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{id}/chronology | Get WorkItem chronology by Id or GlobalId |
| [**getWorkItemVersions**](WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{id}/versions | Get WorkItem versions |
| [**purgeWorkItem**](WorkItemsApi.md#purgeWorkItem) | **POST** /api/v2/workItems/{id}/purge | Permanently delete test case, checklist or shared steps from archive |
| [**restoreWorkItem**](WorkItemsApi.md#restoreWorkItem) | **POST** /api/v2/workItems/{id}/restore | Restore test case, checklist or shared steps from archive |
| [**updateWorkItem**](WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step |



## apiV2WorkItemsIdAttachmentsPost

> apiV2WorkItemsIdAttachmentsPost(id, _file)

Upload and link attachment to WorkItem


Use case

User sets workItemId

User attaches a file

System creates attachment and links it to the work item

System returns attachment identifier

### Example

```java
import java.io.File;
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Work item internal identifier (guid format)
        File _file = new File("/path/to/file"); // File | Select file
        try {
            apiInstance.apiV2WorkItemsIdAttachmentsPost(id, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdAttachmentsPost");
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
| **id** | **UUID**| Work item internal identifier (guid format) | |
| **_file** | **File**| Select file | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **413** | Multipart body length limit exceeded (default constraint is one gigabyte) |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** |  |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **200** | Successful operation |  -  |


## apiV2WorkItemsIdCheckListTransformToTestCasePost

> WorkItemModel apiV2WorkItemsIdCheckListTransformToTestCasePost(id)

Transform CheckList to TestCase


Use case

User sets checklist identifier

User runs method execution

System transform CheckList to TestCase

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            WorkItemModel result = apiInstance.apiV2WorkItemsIdCheckListTransformToTestCasePost(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdCheckListTransformToTestCasePost");
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

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library required |  -  |
| **404** | Can&#39;t find CheckList with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdHistoryGet

> List&lt;WorkItemChangeModel&gt; apiV2WorkItemsIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)

Get change history of WorkItem


Use case

User sets work item identifier

User runs method execution

System return change history of WorkItem

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<WorkItemChangeModel> result = apiInstance.apiV2WorkItemsIdHistoryGet(id, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdHistoryGet");
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
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;WorkItemChangeModel&gt;**](WorkItemChangeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find WorkItem with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdLikeDelete

> apiV2WorkItemsIdLikeDelete(id)

Delete like from WorkItem


Use case

User sets WorkItem identifier

User runs method execution

System delete like from WorkItem

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2WorkItemsIdLikeDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdLikeDelete");
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdLikePost

> apiV2WorkItemsIdLikePost(id)

Set like to WorkItem


Use case

User sets WorkItem identifier

User runs method execution

System set like to WorkItem

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2WorkItemsIdLikePost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdLikePost");
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
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdLikesCountGet

> Integer apiV2WorkItemsIdLikesCountGet(id)

Get likes count of WorkItem


Use case

User sets WorkItem identifier

User runs method execution

System return likes count of WorkItem

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Integer result = apiInstance.apiV2WorkItemsIdLikesCountGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdLikesCountGet");
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

### Return type

**Integer**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdLikesGet

> List&lt;WorkItemLikeModel&gt; apiV2WorkItemsIdLikesGet(id)

Get likes of WorkItem


Use case

User sets WorkItem identifier

User runs method execution

System return likes of WorkItem

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            List<WorkItemLikeModel> result = apiInstance.apiV2WorkItemsIdLikesGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdLikesGet");
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

### Return type

[**List&lt;WorkItemLikeModel&gt;**](WorkItemLikeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdTestResultsHistoryGet

> List&lt;TestResultHistoryReportApiResult&gt; apiV2WorkItemsIdTestResultsHistoryGet(id, from, to, configurationIds, testPlanIds, userIds, outcomes, statusCodes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue)

Get test results history of WorkItem


Use case

User sets WorkItem identifier

User runs method execution

System return test results history of WorkItem

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Take results from this date
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Take results until this date
        List<UUID> configurationIds = Arrays.asList(); // List<UUID> | Identifiers of test result configurations
        List<UUID> testPlanIds = Arrays.asList(); // List<UUID> | Identifiers of test plans which contain test results
        List<UUID> userIds = Arrays.asList(); // List<UUID> | Identifiers of users who set test results
        List<String> outcomes = Arrays.asList(); // List<String> | List of outcomes of test results
        List<String> statusCodes = Arrays.asList(); // List<String> | List of status codes of test results
        Boolean isAutomated = true; // Boolean | OBSOLETE: Use `Automated` instead
        Boolean automated = true; // Boolean | If result must consist of only manual/automated test results
        List<UUID> testRunIds = Arrays.asList(); // List<UUID> | Identifiers of test runs which contain test results
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TestResultHistoryReportApiResult> result = apiInstance.apiV2WorkItemsIdTestResultsHistoryGet(id, from, to, configurationIds, testPlanIds, userIds, outcomes, statusCodes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdTestResultsHistoryGet");
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
| **from** | **OffsetDateTime**| Take results from this date | [optional] |
| **to** | **OffsetDateTime**| Take results until this date | [optional] |
| **configurationIds** | **List&lt;UUID&gt;**| Identifiers of test result configurations | [optional] |
| **testPlanIds** | **List&lt;UUID&gt;**| Identifiers of test plans which contain test results | [optional] |
| **userIds** | **List&lt;UUID&gt;**| Identifiers of users who set test results | [optional] |
| **outcomes** | **List&lt;String&gt;**| List of outcomes of test results | [optional] |
| **statusCodes** | **List&lt;String&gt;**| List of status codes of test results | [optional] |
| **isAutomated** | **Boolean**| OBSOLETE: Use &#x60;Automated&#x60; instead | [optional] |
| **automated** | **Boolean**| If result must consist of only manual/automated test results | [optional] |
| **testRunIds** | **List&lt;UUID&gt;**| Identifiers of test runs which contain test results | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestResultHistoryReportApiResult&gt;**](TestResultHistoryReportApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsIdVersionVersionIdActualPost

> WorkItemModel apiV2WorkItemsIdVersionVersionIdActualPost(id, versionId)

Set WorkItem as actual


Use case

User sets work item identifier

User runs method execution

System set WorkItem as actual

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID versionId = UUID.randomUUID(); // UUID | 
        try {
            WorkItemModel result = apiInstance.apiV2WorkItemsIdVersionVersionIdActualPost(id, versionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsIdVersionVersionIdActualPost");
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
| **versionId** | **UUID**|  | |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library required |  -  |
| **404** | Can&#39;t find WorkItem with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsLinksUrlsSearchPost

> SearchWorkItemLinkUrlsApiResult apiV2WorkItemsLinksUrlsSearchPost(skip, take, orderBy, searchField, searchValue, workItemLinkUrlApiModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        WorkItemLinkUrlApiModel workItemLinkUrlApiModel = new WorkItemLinkUrlApiModel(); // WorkItemLinkUrlApiModel | 
        try {
            SearchWorkItemLinkUrlsApiResult result = apiInstance.apiV2WorkItemsLinksUrlsSearchPost(skip, take, orderBy, searchField, searchValue, workItemLinkUrlApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsLinksUrlsSearchPost");
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
| **workItemLinkUrlApiModel** | [**WorkItemLinkUrlApiModel**](WorkItemLinkUrlApiModel.md)|  | [optional] |

### Return type

[**SearchWorkItemLinkUrlsApiResult**](SearchWorkItemLinkUrlsApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsMovePost

> WorkItemShortModel apiV2WorkItemsMovePost(workItemMovePostModel)

Move WorkItem to another section


Use case

User sets WorkItem identifier

User runs method execution

System move WorkItem to another section

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        WorkItemMovePostModel workItemMovePostModel = new WorkItemMovePostModel(); // WorkItemMovePostModel | 
        try {
            WorkItemShortModel result = apiInstance.apiV2WorkItemsMovePost(workItemMovePostModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsMovePost");
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
| **workItemMovePostModel** | [**WorkItemMovePostModel**](WorkItemMovePostModel.md)|  | [optional] |

### Return type

[**WorkItemShortModel**](WorkItemShortModel.md)

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
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsPost

> WorkItemApiResult apiV2WorkItemsPost(createWorkItemApiModel)

Creates work item

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        CreateWorkItemApiModel createWorkItemApiModel = new CreateWorkItemApiModel(); // CreateWorkItemApiModel | 
        try {
            WorkItemApiResult result = apiInstance.apiV2WorkItemsPost(createWorkItemApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsPost");
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
| **createWorkItemApiModel** | [**CreateWorkItemApiModel**](CreateWorkItemApiModel.md)|  | [optional] |

### Return type

[**WorkItemApiResult**](WorkItemApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsSearchPost

> List&lt;WorkItemShortApiResult&gt; apiV2WorkItemsSearchPost(skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)

Search for work items

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        WorkItemSelectApiModel workItemSelectApiModel = new WorkItemSelectApiModel(); // WorkItemSelectApiModel | 
        try {
            List<WorkItemShortApiResult> result = apiInstance.apiV2WorkItemsSearchPost(skip, take, orderBy, searchField, searchValue, workItemSelectApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsSearchPost");
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
| **workItemSelectApiModel** | [**WorkItemSelectApiModel**](WorkItemSelectApiModel.md)|  | [optional] |

### Return type

[**List&lt;WorkItemShortApiResult&gt;**](WorkItemShortApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Test library read permission for all requested projects is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsSharedStepIdReferencesSectionsPost

> List&lt;SharedStepReferenceSectionModel&gt; apiV2WorkItemsSharedStepIdReferencesSectionsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel)

Get SharedStep references in sections


Use case

User sets SharedStep identifier

User runs method execution

System return SharedStep references

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID sharedStepId = UUID.randomUUID(); // UUID | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        SharedStepReferenceSectionsQueryFilterModel sharedStepReferenceSectionsQueryFilterModel = new SharedStepReferenceSectionsQueryFilterModel(); // SharedStepReferenceSectionsQueryFilterModel | 
        try {
            List<SharedStepReferenceSectionModel> result = apiInstance.apiV2WorkItemsSharedStepIdReferencesSectionsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesSectionsPost");
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
| **sharedStepId** | **UUID**|  | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **sharedStepReferenceSectionsQueryFilterModel** | [**SharedStepReferenceSectionsQueryFilterModel**](SharedStepReferenceSectionsQueryFilterModel.md)|  | [optional] |

### Return type

[**List&lt;SharedStepReferenceSectionModel&gt;**](SharedStepReferenceSectionModel.md)

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
| **403** | Forbidden |  -  |
| **404** | Can&#39;t find SharedStep with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsSharedStepIdReferencesWorkItemsPost

> List&lt;SharedStepReferenceModel&gt; apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel)

Get SharedStep references in work items


Use case

User sets SharedStep identifier

User runs method execution

System return SharedStep references

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID sharedStepId = UUID.randomUUID(); // UUID | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        SharedStepReferencesQueryFilterModel sharedStepReferencesQueryFilterModel = new SharedStepReferencesQueryFilterModel(); // SharedStepReferencesQueryFilterModel | 
        try {
            List<SharedStepReferenceModel> result = apiInstance.apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost");
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
| **sharedStepId** | **UUID**|  | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **sharedStepReferencesQueryFilterModel** | [**SharedStepReferencesQueryFilterModel**](SharedStepReferencesQueryFilterModel.md)|  | [optional] |

### Return type

[**List&lt;SharedStepReferenceModel&gt;**](SharedStepReferenceModel.md)

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
| **403** | Forbidden |  -  |
| **404** | Can&#39;t find SharedStep with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2WorkItemsSharedStepsSharedStepIdReferencesGet

> List&lt;SharedStepReferenceModel&gt; apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(sharedStepId)

Get SharedStep references


Use case

User sets SharedStep identifier

User runs method execution

System return SharedStep references

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UUID sharedStepId = UUID.randomUUID(); // UUID | 
        try {
            List<SharedStepReferenceModel> result = apiInstance.apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(sharedStepId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet");
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
| **sharedStepId** | **UUID**|  | |

### Return type

[**List&lt;SharedStepReferenceModel&gt;**](SharedStepReferenceModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Can&#39;t find SharedStep with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## deleteAllWorkItemsFromAutoTest

> deleteAllWorkItemsFromAutoTest(id)

Delete all links AutoTests from WorkItem by Id or GlobalId


Use case

User sets work item identifier

User runs method execution

System search work item by identifier

System search and delete all autotests, related to found work item

System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        try {
            apiInstance.deleteAllWorkItemsFromAutoTest(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#deleteAllWorkItemsFromAutoTest");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library required |  -  |
| **404** | Can&#39;t find a WorkItem with workItemId |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **200** | Successful operation |  -  |


## deleteWorkItem

> deleteWorkItem(id)

Delete Test Case, Checklist or Shared Step by Id or GlobalId


Use case

User sets work item identifier

User runs method execution

System deletes work item

System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        try {
            apiInstance.deleteWorkItem(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#deleteWorkItem");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Delete permission for test library required |  -  |
| **404** | Can&#39;t find a WorkItem with id |  -  |
| **409** | Conflict |  -  |
| **422** | Could not delete Shared Step that has references |  -  |


## getAutoTestsForWorkItem

> List&lt;AutoTestModel&gt; getAutoTestsForWorkItem(id)

Get all AutoTests linked to WorkItem by Id or GlobalId


Use case

User sets work item identifier

User runs method execution

System search work item by identifier

System search all autotests, related to found work item

System returns list of found autotests

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        try {
            List<AutoTestModel> result = apiInstance.getAutoTestsForWorkItem(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#getAutoTestsForWorkItem");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find WorkItem with workItemId |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getIterations

> List&lt;IterationModel&gt; getIterations(id, versionId, versionNumber)

Get iterations by work item Id or GlobalId

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        UUID versionId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | WorkItem version (guid format) identifier
        Integer versionNumber = 0; // Integer | WorkItem version number (0 is the last version)\"
        try {
            List<IterationModel> result = apiInstance.getIterations(id, versionId, versionNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#getIterations");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **versionId** | **UUID**| WorkItem version (guid format) identifier | [optional] |
| **versionNumber** | **Integer**| WorkItem version number (0 is the last version)\&quot; | [optional] |

### Return type

[**List&lt;IterationModel&gt;**](IterationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find workItem with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getWorkItemById

> WorkItemModel getWorkItemById(id, versionId, versionNumber)

Get Test Case, Checklist or Shared Step by Id or GlobalId


Use case

User sets work item identifier

[Optional] User sets work item version identifier

[Optional] User sets work item version number

User runs method execution

System search work item by identifier

[Optional] if User sets work item version identifier, system search work item version by identifier.

[Optional] if user sets work item version number, system search work item version by number

Otherwise, system search last work item version

System returns work item

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        UUID versionId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | WorkItem version (guid format) identifier\"
        Integer versionNumber = 0; // Integer | WorkItem version number (0 is the last version)\"
        try {
            WorkItemModel result = apiInstance.getWorkItemById(id, versionId, versionNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#getWorkItemById");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **versionId** | **UUID**| WorkItem version (guid format) identifier\&quot; | [optional] |
| **versionNumber** | **Integer**| WorkItem version number (0 is the last version)\&quot; | [optional] |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find workItem with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getWorkItemChronology

> List&lt;TestResultChronologyModel&gt; getWorkItemChronology(id)

Get WorkItem chronology by Id or GlobalId


Use case

User sets work item identifier

User runs method execution

System search work item by identifier

System search test results of all autotests, related to found work item

System sort results by CompletedOn ascending, then by CreatedDate ascending

System returns sorted collection of test results

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "id_example"; // String | Internal (UUID) or global (integer) identifier
        try {
            List<TestResultChronologyModel> result = apiInstance.getWorkItemChronology(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#getWorkItemChronology");
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
| **id** | **String**| Internal (UUID) or global (integer) identifier | |

### Return type

[**List&lt;TestResultChronologyModel&gt;**](TestResultChronologyModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Not valid workItemId |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find WorkItem with workItemId |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getWorkItemVersions

> List&lt;WorkItemVersionModel&gt; getWorkItemVersions(id, workItemVersionId, versionNumber)

Get WorkItem versions


Use case

User sets work item identifier

[Optional] User sets work item version identifier

User runs method execution

System search work item by identifier

[Optional] If User set work item version identifier, System search work item version by version identifier
                    Otherwise, system search all version of work item

System returns array of work item version models (listed in response example)

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | WorkItem internal (guid format) or  global(integer format) identifier\"
        UUID workItemVersionId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | WorkItem version (guid format)  identifier\"
        Integer versionNumber = 1; // Integer | WorkItem version (integer format)  number\"
        try {
            List<WorkItemVersionModel> result = apiInstance.getWorkItemVersions(id, workItemVersionId, versionNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#getWorkItemVersions");
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
| **id** | **String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **workItemVersionId** | **UUID**| WorkItem version (guid format)  identifier\&quot; | [optional] |
| **versionNumber** | **Integer**| WorkItem version (integer format)  number\&quot; | [optional] |

### Return type

[**List&lt;WorkItemVersionModel&gt;**](WorkItemVersionModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | Can&#39;t find WorkItem with workItemId |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## purgeWorkItem

> purgeWorkItem(id)

Permanently delete test case, checklist or shared steps from archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the work item
        try {
            apiInstance.purgeWorkItem(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#purgeWorkItem");
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
| **id** | **String**| Unique or global ID of the work item | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Delete permission for the archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## restoreWorkItem

> restoreWorkItem(id)

Restore test case, checklist or shared steps from archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the work item
        try {
            apiInstance.restoreWorkItem(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#restoreWorkItem");
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
| **id** | **String**| Unique or global ID of the work item | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for the archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## updateWorkItem

> updateWorkItem(updateWorkItemApiModel)

Update Test Case, Checklist or Shared Step


Use case

User sets work item properties (listed in request parameters)

User runs method execution

System updates work item by identifier

System returns updated work item model (listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsApi apiInstance = new WorkItemsApi(defaultClient);
        UpdateWorkItemApiModel updateWorkItemApiModel = new UpdateWorkItemApiModel(); // UpdateWorkItemApiModel | 
        try {
            apiInstance.updateWorkItem(updateWorkItemApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsApi#updateWorkItem");
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
| **updateWorkItemApiModel** | [**UpdateWorkItemApiModel**](UpdateWorkItemApiModel.md)|  | [optional] |

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
| **400** |   Field is required    Priority is not a valid    duration should be a positive number    should be empty for CheckList    There is no option in ProjectAttributesScheme with such Id    Attribute value must be a valid guid for options scheme |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library required |  -  |
| **404** |   WorkItem not found    Can&#39;t find section    Can&#39;t attributesScheme    Can&#39;t attribute    AutoTestIds not exist in project |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

