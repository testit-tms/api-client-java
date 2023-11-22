# ProjectTestPlansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdTestPlansAnalyticsGet**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansAnalyticsGet) | **GET** /api/v2/projects/{projectId}/testPlans/analytics | Get TestPlans analytics |
| [**apiV2ProjectsProjectIdTestPlansDeleteBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansDeleteBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/delete/bulk | Delete multiple test plans |
| [**apiV2ProjectsProjectIdTestPlansNameExistsGet**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansNameExistsGet) | **GET** /api/v2/projects/{projectId}/testPlans/{name}/exists | Checks if TestPlan exists with the specified name exists for the project |
| [**apiV2ProjectsProjectIdTestPlansPurgeBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansPurgeBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/purge/bulk | Permanently delete multiple archived test plans |
| [**apiV2ProjectsProjectIdTestPlansRestoreBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansRestoreBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/restore/bulk | Restore multiple test plans |
| [**apiV2ProjectsProjectIdTestPlansSearchPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansSearchPost) | **POST** /api/v2/projects/{projectId}/testPlans/search | Get Project TestPlans with analytics |


<a id="apiV2ProjectsProjectIdTestPlansAnalyticsGet"></a>
# **apiV2ProjectsProjectIdTestPlansAnalyticsGet**
> List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsProjectIdTestPlansAnalyticsGet(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue)

Get TestPlans analytics

&lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier  &lt;br&gt;User sets query params  &lt;br&gt;User runs method execution  &lt;br&gt;System return analytics

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project internal (UUID) identifier
    Boolean isDeleted = true; // Boolean | 
    Boolean mustUpdateCache = false; // Boolean | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<TestPlanWithAnalyticModel> result = apiInstance.apiV2ProjectsProjectIdTestPlansAnalyticsGet(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansAnalyticsGet");
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
| **projectId** | **UUID**| Project internal (UUID) identifier | |
| **isDeleted** | **Boolean**|  | [optional] |
| **mustUpdateCache** | **Boolean**|  | [optional] [default to false] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

<a id="apiV2ProjectsProjectIdTestPlansDeleteBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansDeleteBulkPost**
> List&lt;UUID&gt; apiV2ProjectsProjectIdTestPlansDeleteBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest)

Delete multiple test plans

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = new ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest(); // ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest | 
    try {
      List<UUID> result = apiInstance.apiV2ProjectsProjectIdTestPlansDeleteBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansDeleteBulkPost");
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
| **projectId** | **String**| Unique or global ID of the project | |
| **apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest** | [**ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest**](ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest.md)|  | [optional] |

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
| **403** | - Read permission for the project is required  - Delete permission for test plans is required |  -  |

<a id="apiV2ProjectsProjectIdTestPlansNameExistsGet"></a>
# **apiV2ProjectsProjectIdTestPlansNameExistsGet**
> Boolean apiV2ProjectsProjectIdTestPlansNameExistsGet(projectId, name)

Checks if TestPlan exists with the specified name exists for the project

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System purge delete project workitems

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project internal (UUID) or global (integer) identifier
    String name = "name_example"; // String | TestPlan name to check
    try {
      Boolean result = apiInstance.apiV2ProjectsProjectIdTestPlansNameExistsGet(projectId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansNameExistsGet");
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
| **projectId** | **UUID**| Project internal (UUID) or global (integer) identifier | |
| **name** | **String**| TestPlan name to check | |

### Return type

**Boolean**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="apiV2ProjectsProjectIdTestPlansPurgeBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansPurgeBulkPost**
> apiV2ProjectsProjectIdTestPlansPurgeBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest)

Permanently delete multiple archived test plans

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = new ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest(); // ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest | 
    try {
      apiInstance.apiV2ProjectsProjectIdTestPlansPurgeBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansPurgeBulkPost");
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
| **projectId** | **String**| Unique or global ID of the project | |
| **apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest** | [**ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest**](ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest.md)|  | [optional] |

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
| **403** | Full access permission for the archive is required |  -  |

<a id="apiV2ProjectsProjectIdTestPlansRestoreBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansRestoreBulkPost**
> apiV2ProjectsProjectIdTestPlansRestoreBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest)

Restore multiple test plans

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = new ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest(); // ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest | 
    try {
      apiInstance.apiV2ProjectsProjectIdTestPlansRestoreBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansRestoreBulkPost");
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
| **projectId** | **String**| Unique or global ID of the project | |
| **apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest** | [**ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest**](ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest.md)|  | [optional] |

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
| **200** | Success |  -  |
| **403** | Read permission for the archive is required |  -  |

<a id="apiV2ProjectsProjectIdTestPlansSearchPost"></a>
# **apiV2ProjectsProjectIdTestPlansSearchPost**
> List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsProjectIdTestPlansSearchPost(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdTestPlansSearchPostRequest)

Get Project TestPlans with analytics

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets request body   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project testplans with analytics

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectTestPlansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectTestPlansApi apiInstance = new ProjectTestPlansApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean mustUpdateCache = false; // Boolean | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2ProjectsProjectIdTestPlansSearchPostRequest apiV2ProjectsProjectIdTestPlansSearchPostRequest = new ApiV2ProjectsProjectIdTestPlansSearchPostRequest(); // ApiV2ProjectsProjectIdTestPlansSearchPostRequest | 
    try {
      List<TestPlanWithAnalyticModel> result = apiInstance.apiV2ProjectsProjectIdTestPlansSearchPost(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdTestPlansSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansSearchPost");
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
| **projectId** | **String**| Project internal (UUID) or global (integer) identifier | |
| **mustUpdateCache** | **Boolean**|  | [optional] [default to false] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **apiV2ProjectsProjectIdTestPlansSearchPostRequest** | [**ApiV2ProjectsProjectIdTestPlansSearchPostRequest**](ApiV2ProjectsProjectIdTestPlansSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

