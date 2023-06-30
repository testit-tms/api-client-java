# AutoTestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2AutoTestsFlakyBulkPost**](AutoTestsApi.md#apiV2AutoTestsFlakyBulkPost) | **POST** /api/v2/autoTests/flaky/bulk | Set \&quot;Flaky\&quot; status for multiple autotests |
| [**apiV2AutoTestsIdPatch**](AutoTestsApi.md#apiV2AutoTestsIdPatch) | **PATCH** /api/v2/autoTests/{id} | Patch auto test |
| [**apiV2AutoTestsIdTestResultsSearchPost**](AutoTestsApi.md#apiV2AutoTestsIdTestResultsSearchPost) | **POST** /api/v2/autoTests/{id}/testResults/search | Get test results history for autotest |
| [**apiV2AutoTestsIdWorkItemsChangedIdGet**](AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedIdGet) | **GET** /api/v2/autoTests/{id}/workItems/changed/id | Get identifiers of changed linked work items |
| [**apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**](AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost) | **POST** /api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve | Approve changes to work items linked to autotest |
| [**apiV2AutoTestsSearchPost**](AutoTestsApi.md#apiV2AutoTestsSearchPost) | **POST** /api/v2/autoTests/search | Search for autotests |
| [**createAutoTest**](AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create autotest |
| [**createMultiple**](AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create multiple autotests |
| [**deleteAutoTest**](AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{id} | Delete autotest |
| [**deleteAutoTestLinkFromWorkItem**](AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{id}/workItems | Unlink autotest from work item |
| [**getAllAutoTests**](AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests |  |
| [**getAutoTestAverageDuration**](AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{id}/averageDuration | Get average autotest duration |
| [**getAutoTestById**](AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{id} | Get autotest by internal or global ID |
| [**getAutoTestChronology**](AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{id}/chronology | Get autotest chronology |
| [**getTestRuns**](AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{id}/testRuns | Get completed tests runs for autotests |
| [**getWorkItemResults**](AutoTestsApi.md#getWorkItemResults) | **GET** /api/v2/autoTests/{id}/testResultHistory |  |
| [**getWorkItemsLinkedToAutoTest**](AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{id}/workItems | Get work items linked to autotest |
| [**linkAutoTestToWorkItem**](AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{id}/workItems | Link autotest with work items |
| [**updateAutoTest**](AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update autotest |
| [**updateMultiple**](AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update multiple autotests |


<a id="apiV2AutoTestsFlakyBulkPost"></a>
# **apiV2AutoTestsFlakyBulkPost**
> apiV2AutoTestsFlakyBulkPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsFlakyBulkPostRequest)

Set \&quot;Flaky\&quot; status for multiple autotests

User permissions for project:  - Read only  - Execute  - Write  - Full control

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2AutoTestsFlakyBulkPostRequest apiV2AutoTestsFlakyBulkPostRequest = new ApiV2AutoTestsFlakyBulkPostRequest(); // ApiV2AutoTestsFlakyBulkPostRequest | 
    try {
      apiInstance.apiV2AutoTestsFlakyBulkPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsFlakyBulkPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsFlakyBulkPost");
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
| **apiV2AutoTestsFlakyBulkPostRequest** | [**ApiV2AutoTestsFlakyBulkPostRequest**](ApiV2AutoTestsFlakyBulkPostRequest.md)|  | [optional] |

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
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Invalid user permissions |  -  |
| **422** | Autotests with provided identifiers do not belong to the same project |  -  |

<a id="apiV2AutoTestsIdPatch"></a>
# **apiV2AutoTestsIdPatch**
> apiV2AutoTestsIdPatch(id, operation)

Patch auto test

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Global Id of auto test
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      apiInstance.apiV2AutoTestsIdPatch(id, operation);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsIdPatch");
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
| **id** | **UUID**| Global Id of auto test | |
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
| **403** | Update permission for auto tests is required |  -  |

<a id="apiV2AutoTestsIdTestResultsSearchPost"></a>
# **apiV2AutoTestsIdTestResultsSearchPost**
> List&lt;AutotestResultHistoricalGetModel&gt; apiV2AutoTestsIdTestResultsSearchPost(id, skip, take, orderBy, searchField, searchValue, apiV2AutoTestsIdTestResultsSearchPostRequest)

Get test results history for autotest

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets getTestResultHistoryReportQuery (listed in the example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search for test results using filters set by user in getTestResultHistoryReportQuery and id  &lt;br&gt;System returns the enumeration of test results

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest identifier
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2AutoTestsIdTestResultsSearchPostRequest apiV2AutoTestsIdTestResultsSearchPostRequest = new ApiV2AutoTestsIdTestResultsSearchPostRequest(); // ApiV2AutoTestsIdTestResultsSearchPostRequest | 
    try {
      List<AutotestResultHistoricalGetModel> result = apiInstance.apiV2AutoTestsIdTestResultsSearchPost(id, skip, take, orderBy, searchField, searchValue, apiV2AutoTestsIdTestResultsSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsIdTestResultsSearchPost");
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
| **id** | **String**| Autotest identifier | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **apiV2AutoTestsIdTestResultsSearchPostRequest** | [**ApiV2AutoTestsIdTestResultsSearchPostRequest**](ApiV2AutoTestsIdTestResultsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;AutotestResultHistoricalGetModel&gt;**](AutotestResultHistoricalGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests required |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="apiV2AutoTestsIdWorkItemsChangedIdGet"></a>
# **apiV2AutoTestsIdWorkItemsChangedIdGet**
> List&lt;UUID&gt; apiV2AutoTestsIdWorkItemsChangedIdGet(id)

Get identifiers of changed linked work items

User permissions for project:  - Read only  - Execute  - Write  - Full control

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      List<UUID> result = apiInstance.apiV2AutoTestsIdWorkItemsChangedIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedIdGet");
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

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Invalid user permissions |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost"></a>
# **apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**
> apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(id, workItemId)

Approve changes to work items linked to autotest

User permissions for project:  - Read only  - Execute  - Write  - Full control

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID workItemId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(id, workItemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost");
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
| **workItemId** | **UUID**|  | |

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
| **200** | Success |  -  |
| **403** | Invalid user permissions |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="apiV2AutoTestsSearchPost"></a>
# **apiV2AutoTestsSearchPost**
> List&lt;AutoTestModel&gt; apiV2AutoTestsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsSearchPostRequest)

Search for autotests

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2AutoTestsSearchPostRequest apiV2AutoTestsSearchPostRequest = new ApiV2AutoTestsSearchPostRequest(); // ApiV2AutoTestsSearchPostRequest | 
    try {
      List<AutoTestModel> result = apiInstance.apiV2AutoTestsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#apiV2AutoTestsSearchPost");
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
| **apiV2AutoTestsSearchPostRequest** | [**ApiV2AutoTestsSearchPostRequest**](ApiV2AutoTestsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

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

<a id="createAutoTest"></a>
# **createAutoTest**
> AutoTestModel createAutoTest(createAutoTestRequest)

Create autotest

&lt;br&gt;This method creates a new autotest.  &lt;br&gt;To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.  &lt;br&gt;Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    CreateAutoTestRequest createAutoTestRequest = new CreateAutoTestRequest(); // CreateAutoTestRequest | 
    try {
      AutoTestModel result = apiInstance.createAutoTest(createAutoTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#createAutoTest");
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
| **createAutoTestRequest** | [**CreateAutoTestRequest**](CreateAutoTestRequest.md)|  | [optional] |

### Return type

[**AutoTestModel**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | Project with provided ID cannot be found |  -  |
| **409** | Autotest with the same external ID already exists is the project |  -  |
| **422** | &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values |  -  |

<a id="createMultiple"></a>
# **createMultiple**
> List&lt;AutoTestModel&gt; createMultiple(autoTestPostModel)

Create multiple autotests

&lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    List<AutoTestPostModel> autoTestPostModel = Arrays.asList(); // List<AutoTestPostModel> | 
    try {
      List<AutoTestModel> result = apiInstance.createMultiple(autoTestPostModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#createMultiple");
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
| **autoTestPostModel** | [**List&lt;AutoTestPostModel&gt;**](AutoTestPostModel.md)|  | [optional] |

### Return type

[**List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | Project with provided ID cannot be found |  -  |
| **409** | Autotest with the same external ID already exists is the project |  -  |
| **422** | &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values |  -  |

<a id="deleteAutoTest"></a>
# **deleteAutoTest**
> deleteAutoTest(id)

Delete autotest

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System deletes autotest and returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    try {
      apiInstance.deleteAutoTest(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#deleteAutoTest");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |

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
| **401** | Unauthorized |  -  |
| **403** | Delete permission for autotests is required |  -  |
| **404** | Autotest with provided ID cannot be found |  -  |

<a id="deleteAutoTestLinkFromWorkItem"></a>
# **deleteAutoTestLinkFromWorkItem**
> deleteAutoTestLinkFromWorkItem(id, workItemId)

Unlink autotest from work item

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;[Optional] User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;              [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.                &lt;br&gt;[Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    String workItemId = "workItemId_example"; // String | Work item internal (UUID) or global (integer) identifier
    try {
      apiInstance.deleteAutoTestLinkFromWorkItem(id, workItemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#deleteAutoTestLinkFromWorkItem");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |
| **workItemId** | **String**| Work item internal (UUID) or global (integer) identifier | [optional] |

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
| **400** | Work item ID is invalid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found |  -  |

<a id="getAllAutoTests"></a>
# **getAllAutoTests**
> List&lt;AutoTestModel&gt; getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, skip, take, orderBy, searchField, searchValue)



### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project internal ID
    String externalId = "externalId_example"; // String | Autotest external ID
    Long globalId = 56L; // Long | Autotest global ID
    String namespace = "namespace_example"; // String | Namespace in which autotest is located
    Boolean isNamespaceNull = true; // Boolean | OBSOLETE: Use `includeEmptyNamespaces` instead
    Boolean includeEmptyNamespaces = true; // Boolean | If result must contain autotests without namespace
    String className = "className_example"; // String | Name of class in which autotest is located
    Boolean isClassnameNull = true; // Boolean | OBSOLETE: Use `includeEmptyClassNames` instead
    Boolean includeEmptyClassNames = true; // Boolean | If result must contain autotests without class
    Boolean isDeleted = true; // Boolean | OBSOLETE: Use `deleted` instead
    Boolean deleted = true; // Boolean | Is autotest deleted
    List<String> labels = Arrays.asList(); // List<String> | Include only autotests with provided labels
    Integer stabilityMinimal = 56; // Integer | OBSOLETE: Use `minStability` instead
    Integer minStability = 56; // Integer | Minimum stability value of autotest
    Integer stabilityMaximal = 56; // Integer | OBSOLETE: Use `maxStability` instead
    Integer maxStability = 56; // Integer | Maximum stability value of autotest
    Boolean isFlaky = true; // Boolean | OBSOLETE: Use `flaky` instead
    Boolean flaky = true; // Boolean | Is autotest marked as \"Flaky\"
    Boolean includeSteps = true; // Boolean | If result must also include autotest steps
    Boolean includeLabels = true; // Boolean | If result must also include autotest labels
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<AutoTestModel> result = apiInstance.getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getAllAutoTests");
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
| **projectId** | **UUID**| Project internal ID | [optional] |
| **externalId** | **String**| Autotest external ID | [optional] |
| **globalId** | **Long**| Autotest global ID | [optional] |
| **namespace** | **String**| Namespace in which autotest is located | [optional] |
| **isNamespaceNull** | **Boolean**| OBSOLETE: Use &#x60;includeEmptyNamespaces&#x60; instead | [optional] |
| **includeEmptyNamespaces** | **Boolean**| If result must contain autotests without namespace | [optional] |
| **className** | **String**| Name of class in which autotest is located | [optional] |
| **isClassnameNull** | **Boolean**| OBSOLETE: Use &#x60;includeEmptyClassNames&#x60; instead | [optional] |
| **includeEmptyClassNames** | **Boolean**| If result must contain autotests without class | [optional] |
| **isDeleted** | **Boolean**| OBSOLETE: Use &#x60;deleted&#x60; instead | [optional] |
| **deleted** | **Boolean**| Is autotest deleted | [optional] |
| **labels** | [**List&lt;String&gt;**](String.md)| Include only autotests with provided labels | [optional] |
| **stabilityMinimal** | **Integer**| OBSOLETE: Use &#x60;minStability&#x60; instead | [optional] |
| **minStability** | **Integer**| Minimum stability value of autotest | [optional] |
| **stabilityMaximal** | **Integer**| OBSOLETE: Use &#x60;maxStability&#x60; instead | [optional] |
| **maxStability** | **Integer**| Maximum stability value of autotest | [optional] |
| **isFlaky** | **Boolean**| OBSOLETE: Use &#x60;flaky&#x60; instead | [optional] |
| **flaky** | **Boolean**| Is autotest marked as \&quot;Flaky\&quot; | [optional] |
| **includeSteps** | **Boolean**| If result must also include autotest steps | [optional] |
| **includeLabels** | **Boolean**| If result must also include autotest labels | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

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
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="getAutoTestAverageDuration"></a>
# **getAutoTestAverageDuration**
> AutoTestAverageDurationModel getAutoTestAverageDuration(id)

Get average autotest duration

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System calculates pass average duration and fail average duration of autotest from all related test results  &lt;br&gt;System returns pass average duration and fail average duration for autotest

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    try {
      AutoTestAverageDurationModel result = apiInstance.getAutoTestAverageDuration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getAutoTestAverageDuration");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**AutoTestAverageDurationModel**](AutoTestAverageDurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests is required |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="getAutoTestById"></a>
# **getAutoTestById**
> AutoTestModel getAutoTestById(id)

Get autotest by internal or global ID

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal or global identifier and runs method execution  &lt;br&gt;System returns autotest, which internal or global identifier equals the identifier value set in the previous action

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    try {
      AutoTestModel result = apiInstance.getAutoTestById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getAutoTestById");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**AutoTestModel**](AutoTestModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Autotest ID is invalid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests is required |  -  |
| **404** | Autotest with provided ID cannot be found |  -  |

<a id="getAutoTestChronology"></a>
# **getAutoTestChronology**
> List&lt;TestResultChronologyModel&gt; getAutoTestChronology(id)

Get autotest chronology

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search all test results related to autotest (with default limit equal 100)  &lt;br&gt;System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending  &lt;br&gt;System returns test result chronology for autotest

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    try {
      List<TestResultChronologyModel> result = apiInstance.getAutoTestChronology(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getAutoTestChronology");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests is required |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="getTestRuns"></a>
# **getTestRuns**
> List&lt;TestRunShortModel&gt; getTestRuns(id)

Get completed tests runs for autotests

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search for all test runs related to the autotest  &lt;br&gt;System returns the enumeration of test runs

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    try {
      List<TestRunShortModel> result = apiInstance.getTestRuns(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getTestRuns");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**List&lt;TestRunShortModel&gt;**](TestRunShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests is required |  -  |
| **404** | Autotest with provided ID was not found |  -  |

<a id="getWorkItemResults"></a>
# **getWorkItemResults**
> List&lt;TestResultHistoryReportModel&gt; getWorkItemResults(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue)



### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | 
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Take results from this date
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Take results until this date
    List<UUID> configurationIds = Arrays.asList(); // List<UUID> | Identifiers of test result configurations
    List<UUID> testPlanIds = Arrays.asList(); // List<UUID> | Identifiers of test plans which contain test results
    List<UUID> userIds = Arrays.asList(); // List<UUID> | Identifiers of users who set test results
    List<String> outcomes = Arrays.asList(); // List<String> | List of outcomes of test results
    Boolean isAutomated = true; // Boolean | OBSOLETE: Use `Automated` instead
    Boolean automated = true; // Boolean | If result must consist of only manual/automated test results
    List<UUID> testRunIds = Arrays.asList(); // List<UUID> | Identifiers of test runs which contain test results
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<TestResultHistoryReportModel> result = apiInstance.getWorkItemResults(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getWorkItemResults");
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
| **id** | **String**|  | |
| **from** | **OffsetDateTime**| Take results from this date | [optional] |
| **to** | **OffsetDateTime**| Take results until this date | [optional] |
| **configurationIds** | [**List&lt;UUID&gt;**](UUID.md)| Identifiers of test result configurations | [optional] |
| **testPlanIds** | [**List&lt;UUID&gt;**](UUID.md)| Identifiers of test plans which contain test results | [optional] |
| **userIds** | [**List&lt;UUID&gt;**](UUID.md)| Identifiers of users who set test results | [optional] |
| **outcomes** | [**List&lt;String&gt;**](String.md)| List of outcomes of test results | [optional] |
| **isAutomated** | **Boolean**| OBSOLETE: Use &#x60;Automated&#x60; instead | [optional] |
| **automated** | **Boolean**| If result must consist of only manual/automated test results | [optional] |
| **testRunIds** | [**List&lt;UUID&gt;**](UUID.md)| Identifiers of test runs which contain test results | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestResultHistoryReportModel&gt;**](TestResultHistoryReportModel.md)

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

<a id="getWorkItemsLinkedToAutoTest"></a>
# **getWorkItemsLinkedToAutoTest**
> List&lt;WorkItemIdentifierModel&gt; getWorkItemsLinkedToAutoTest(id, isDeleted, isWorkItemDeleted)

Get work items linked to autotest

&lt;br&gt;              This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:                &lt;br&gt;              1. Open the project in GUI.&lt;br /&gt;              2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.&lt;br /&gt;              3. Select the autotest(s) you want to run using checkboxes.&lt;br /&gt;              4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.              

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Specifies the autotest entity ID.<br />  You can copy it from the address bar in your web browser or use autotest GUID.
    Boolean isDeleted = true; // Boolean | Specifies that a test is deleted or still relevant.
    Boolean isWorkItemDeleted = false; // Boolean | OBSOLETE: Use `isDeleted` instead
    try {
      List<WorkItemIdentifierModel> result = apiInstance.getWorkItemsLinkedToAutoTest(id, isDeleted, isWorkItemDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#getWorkItemsLinkedToAutoTest");
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
| **id** | **String**| Specifies the autotest entity ID.&lt;br /&gt;  You can copy it from the address bar in your web browser or use autotest GUID. | |
| **isDeleted** | **Boolean**| Specifies that a test is deleted or still relevant. | [optional] |
| **isWorkItemDeleted** | **Boolean**| OBSOLETE: Use &#x60;isDeleted&#x60; instead | [optional] [default to false] |

### Return type

[**List&lt;WorkItemIdentifierModel&gt;**](WorkItemIdentifierModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for autotests is required |  -  |
| **404** | Autotest with provided ID cannot be found |  -  |

<a id="linkAutoTestToWorkItem"></a>
# **linkAutoTestToWorkItem**
> linkAutoTestToWorkItem(id, linkAutoTestToWorkItemRequest)

Link autotest with work items

&lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets work item internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;System finds the work item by the work item identifier  &lt;br&gt;System relates the work item with the autotest and returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    String id = "id_example"; // String | Autotest internal (UUID) or global (integer) identifier
    LinkAutoTestToWorkItemRequest linkAutoTestToWorkItemRequest = new LinkAutoTestToWorkItemRequest(); // LinkAutoTestToWorkItemRequest | 
    try {
      apiInstance.linkAutoTestToWorkItem(id, linkAutoTestToWorkItemRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#linkAutoTestToWorkItem");
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
| **id** | **String**| Autotest internal (UUID) or global (integer) identifier | |
| **linkAutoTestToWorkItemRequest** | [**LinkAutoTestToWorkItemRequest**](LinkAutoTestToWorkItemRequest.md)|  | [optional] |

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
| **400** | &lt;br&gt;- Autotest cannot be linked to shared steps  &lt;br&gt;- Autotest cannot be linked to work item from other project  &lt;br&gt;- Work item ID is invalid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | &lt;br&gt;- Autotest with provided ID cannot be found  &lt;br&gt;- Work item with provided ID cannot be found |  -  |

<a id="updateAutoTest"></a>
# **updateAutoTest**
> updateAutoTest(updateAutoTestRequest)

Update autotest

&lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    UpdateAutoTestRequest updateAutoTestRequest = new UpdateAutoTestRequest(); // UpdateAutoTestRequest | 
    try {
      apiInstance.updateAutoTest(updateAutoTestRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#updateAutoTest");
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
| **updateAutoTestRequest** | [**UpdateAutoTestRequest**](UpdateAutoTestRequest.md)|  | [optional] |

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
| **400** | &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found |  -  |
| **409** | Autotest with the same external ID already exists is the project |  -  |
| **422** | &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values |  -  |
| **204** | Success |  -  |

<a id="updateMultiple"></a>
# **updateMultiple**
> updateMultiple(autoTestPutModel)

Update multiple autotests

&lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.AutoTestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    AutoTestsApi apiInstance = new AutoTestsApi(defaultClient);
    List<AutoTestPutModel> autoTestPutModel = Arrays.asList(); // List<AutoTestPutModel> | 
    try {
      apiInstance.updateMultiple(autoTestPutModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutoTestsApi#updateMultiple");
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
| **autoTestPutModel** | [**List&lt;AutoTestPutModel&gt;**](AutoTestPutModel.md)|  | [optional] |

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
| **400** | &lt;br&gt;- Name cannot be empty or contain only white space characters  &lt;br&gt;- External ID cannot be empty or contain only white space characters  &lt;br&gt;- Namespace cannot be empty or contain only white space characters  &lt;br&gt;- Classname cannot be empty or contain only white space characters  &lt;br&gt;- Steps cannot be &#x60;null&#x60;  &lt;br&gt;- Steps nesting level is more than 15  &lt;br&gt;- Invalid URI |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for autotests is required |  -  |
| **404** | &lt;br&gt;- Autotests with provided ID cannot be found  &lt;br&gt;- Project with provided ID cannot be found  &lt;br&gt;- Link with provided ID cannot be found  &lt;br&gt;- Label with provided ID cannot be found |  -  |
| **409** | Autotest with the same external ID already exists is the project |  -  |
| **422** | &lt;br&gt;- Project ID cannot be changed  &lt;br&gt;- Labels have duplicates  &lt;br&gt;- Labels begin with &#x60;::&#x60;  &lt;br&gt;- Labels with the same base have different values |  -  |

