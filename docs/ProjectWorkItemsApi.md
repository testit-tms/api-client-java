# ProjectWorkItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdWorkItemsSearchGroupedPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost) | **POST** /api/v2/projects/{projectId}/workItems/search/grouped | Search for work items and group results by attribute |
| [**apiV2ProjectsProjectIdWorkItemsSearchIdPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchIdPost) | **POST** /api/v2/projects/{projectId}/workItems/search/id | Search for work items and extract IDs only |
| [**apiV2ProjectsProjectIdWorkItemsSearchPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchPost) | **POST** /api/v2/projects/{projectId}/workItems/search | Search for work items |
| [**apiV2ProjectsProjectIdWorkItemsTagsGet**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsTagsGet) | **GET** /api/v2/projects/{projectId}/workItems/tags | Get WorkItems Tags |
| [**getWorkItemsByProjectId**](ProjectWorkItemsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{projectId}/workItems | Get project work items |


<a id="apiV2ProjectsProjectIdWorkItemsSearchGroupedPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchGroupedPost**
> List&lt;WorkItemGroupModel&gt; apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, workItemGroupGetModel)

Search for work items and group results by attribute

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectWorkItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectWorkItemsApi apiInstance = new ProjectWorkItemsApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    WorkItemGroupGetModel workItemGroupGetModel = new WorkItemGroupGetModel(); // WorkItemGroupGetModel | 
    try {
      List<WorkItemGroupModel> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, workItemGroupGetModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost");
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
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **workItemGroupGetModel** | [**WorkItemGroupGetModel**](WorkItemGroupGetModel.md)|  | [optional] |

### Return type

[**List&lt;WorkItemGroupModel&gt;**](WorkItemGroupModel.md)

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

<a id="apiV2ProjectsProjectIdWorkItemsSearchIdPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchIdPost**
> List&lt;UUID&gt; apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectModel)

Search for work items and extract IDs only

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectWorkItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectWorkItemsApi apiInstance = new ProjectWorkItemsApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    WorkItemSelectModel workItemSelectModel = new WorkItemSelectModel(); // WorkItemSelectModel | 
    try {
      List<UUID> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchIdPost");
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
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **workItemSelectModel** | [**WorkItemSelectModel**](WorkItemSelectModel.md)|  | [optional] |

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
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ProjectsProjectIdWorkItemsSearchPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchPost**
> List&lt;WorkItemShortApiResult&gt; apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)

Search for work items

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectWorkItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectWorkItemsApi apiInstance = new ProjectWorkItemsApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global ID of the project
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    WorkItemSelectApiModel workItemSelectApiModel = new WorkItemSelectApiModel(); // WorkItemSelectApiModel | 
    try {
      List<WorkItemShortApiResult> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchPost");
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
| **403** | Read permission for test library is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ProjectsProjectIdWorkItemsTagsGet"></a>
# **apiV2ProjectsProjectIdWorkItemsTagsGet**
> List&lt;TagShortApiResult&gt; apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted)

Get WorkItems Tags

 Use case  User sets project internal identifier  User runs method execution  System returns work items tags

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectWorkItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectWorkItemsApi apiInstance = new ProjectWorkItemsApi(defaultClient);
    UUID projectId = UUID.randomUUID(); // UUID | Project internal (UUID) identifier
    Boolean isDeleted = true; // Boolean | 
    try {
      List<TagShortApiResult> result = apiInstance.apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsTagsGet");
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

### Return type

[**List&lt;TagShortApiResult&gt;**](TagShortApiResult.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="getWorkItemsByProjectId"></a>
# **getWorkItemsByProjectId**
> List&lt;WorkItemShortModel&gt; getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get project work items

 Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted  If User did not set isDeleted field value, System search all  workitems related to project  System returns array of found workitems (listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectWorkItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectWorkItemsApi apiInstance = new ProjectWorkItemsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean isDeleted = false; // Boolean | If result must consist of only actual/deleted work items
    List<String> tagNames = Arrays.asList(); // List<String> | List of tags to filter by
    Boolean includeIterations = true; // Boolean | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<WorkItemShortModel> result = apiInstance.getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectWorkItemsApi#getWorkItemsByProjectId");
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
| **isDeleted** | **Boolean**| If result must consist of only actual/deleted work items | [optional] [default to false] |
| **tagNames** | [**List&lt;String&gt;**](String.md)| List of tags to filter by | [optional] |
| **includeIterations** | **Boolean**|  | [optional] [default to true] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** |  - &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  - &#x60;orderBy&#x60; statement has invalid length  - &#x60;orderBy&#x60; statement must have UUID as attribute key  - Search field was not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

