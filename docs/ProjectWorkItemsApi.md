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
> List&lt;WorkItemGroupModel&gt; apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest)

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
    ApiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest = new ApiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest(); // ApiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest | 
    try {
      List<WorkItemGroupModel> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest);
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
| **apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest** | [**ApiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest**](ApiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequest.md)|  | [optional] |

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
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Forbidden |  -  |

<a id="apiV2ProjectsProjectIdWorkItemsSearchIdPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchIdPost**
> List&lt;UUID&gt; apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchPostRequest)

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
    ApiV2ProjectsProjectIdWorkItemsSearchPostRequest apiV2ProjectsProjectIdWorkItemsSearchPostRequest = new ApiV2ProjectsProjectIdWorkItemsSearchPostRequest(); // ApiV2ProjectsProjectIdWorkItemsSearchPostRequest | 
    try {
      List<UUID> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchPostRequest);
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
| **apiV2ProjectsProjectIdWorkItemsSearchPostRequest** | [**ApiV2ProjectsProjectIdWorkItemsSearchPostRequest**](ApiV2ProjectsProjectIdWorkItemsSearchPostRequest.md)|  | [optional] |

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
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test library is required |  -  |

<a id="apiV2ProjectsProjectIdWorkItemsSearchPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchPost**
> List&lt;WorkItemShortModel&gt; apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchPostRequest)

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
    ApiV2ProjectsProjectIdWorkItemsSearchPostRequest apiV2ProjectsProjectIdWorkItemsSearchPostRequest = new ApiV2ProjectsProjectIdWorkItemsSearchPostRequest(); // ApiV2ProjectsProjectIdWorkItemsSearchPostRequest | 
    try {
      List<WorkItemShortModel> result = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdWorkItemsSearchPostRequest);
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
| **apiV2ProjectsProjectIdWorkItemsSearchPostRequest** | [**ApiV2ProjectsProjectIdWorkItemsSearchPostRequest**](ApiV2ProjectsProjectIdWorkItemsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test library is required |  -  |

<a id="apiV2ProjectsProjectIdWorkItemsTagsGet"></a>
# **apiV2ProjectsProjectIdWorkItemsTagsGet**
> List&lt;TagModel&gt; apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted)

Get WorkItems Tags

&lt;br&gt;Use case  &lt;br&gt;User sets project internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns work items tags

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
      List<TagModel> result = apiInstance.apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted);
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

[**List&lt;TagModel&gt;**](TagModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="getWorkItemsByProjectId"></a>
# **getWorkItemsByProjectId**
> List&lt;WorkItemShortModel&gt; getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get project work items

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all  workitems related to project  &lt;br&gt;System returns array of found workitems (listed in response model)

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
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test library is required |  -  |
| **400** | &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found |  -  |
| **404** | Project with provided ID was not found |  -  |

