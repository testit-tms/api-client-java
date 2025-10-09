# TagsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TagsDelete**](TagsApi.md#apiV2TagsDelete) | **DELETE** /api/v2/tags | Delete tags |
| [**apiV2TagsIdDelete**](TagsApi.md#apiV2TagsIdDelete) | **DELETE** /api/v2/tags/{id} | Delete tag |
| [**apiV2TagsPost**](TagsApi.md#apiV2TagsPost) | **POST** /api/v2/tags | Create tag |
| [**apiV2TagsPut**](TagsApi.md#apiV2TagsPut) | **PUT** /api/v2/tags | Update tag |
| [**apiV2TagsSearchGet**](TagsApi.md#apiV2TagsSearchGet) | **GET** /api/v2/tags/search | Search tags |
| [**apiV2TagsTestPlansTagsGet**](TagsApi.md#apiV2TagsTestPlansTagsGet) | **GET** /api/v2/tags/testPlansTags | Get all Tags that are used in TestPlans |



## apiV2TagsDelete

> apiV2TagsDelete(selectTagsApiModel)

Delete tags


Use case

User sets collection of tags internal (guid format) identifiers

System searches and deletes a collection of tags

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        SelectTagsApiModel selectTagsApiModel = new SelectTagsApiModel(); // SelectTagsApiModel | 
        try {
            apiInstance.apiV2TagsDelete(selectTagsApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsDelete");
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
| **selectTagsApiModel** | [**SelectTagsApiModel**](SelectTagsApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** |  - ID is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | System administrator role is required |  -  |
| **404** | No tags with provided IDs were found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2TagsIdDelete

> apiV2TagsIdDelete(id)

Delete tag


Use case

User sets tag internal (guid format) identifier

System search and delete tag

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Tag internal (UUID) identifier
        try {
            apiInstance.apiV2TagsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsIdDelete");
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
| **id** | **UUID**| Tag internal (UUID) identifier | |

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
| **400** |  - ID is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | System administrator role is required |  -  |
| **404** | Tag with provided ID cannot be found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2TagsPost

> TagApiResult apiV2TagsPost(createTagApiModel)

Create tag


Use case

User sets tag model (listed in the request example)

User runs method execution

System creates tag

System returns tag model (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        CreateTagApiModel createTagApiModel = new CreateTagApiModel(); // CreateTagApiModel | 
        try {
            TagApiResult result = apiInstance.apiV2TagsPost(createTagApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsPost");
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
| **createTagApiModel** | [**CreateTagApiModel**](CreateTagApiModel.md)|  | [optional] |

### Return type

[**TagApiResult**](TagApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation |  -  |
| **400** |  - Name cannot be empty or contain only white space characters  - Name already in use  - Name must be no more than 30 characters long |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2TagsPut

> TagApiResult apiV2TagsPut(id, updateTagApiModel)

Update tag


Use case

User sets tag ID and model (listed in the request example)

User runs method execution

System updates tag

System returns tag model (listed in the response example)

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateTagApiModel updateTagApiModel = new UpdateTagApiModel(); // UpdateTagApiModel | 
        try {
            TagApiResult result = apiInstance.apiV2TagsPut(id, updateTagApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsPut");
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
| **id** | **UUID**|  | [optional] |
| **updateTagApiModel** | [**UpdateTagApiModel**](UpdateTagApiModel.md)|  | [optional] |

### Return type

[**TagApiResult**](TagApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** |  - ID is not valid  - Name cannot be empty or contain only white space characters  - Name already in use  - Name must be no more than 30 characters long |  -  |
| **401** | Unauthorized |  -  |
| **403** | Project creator role is required |  -  |
| **404** | Tag with provided ID cannot be found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2TagsSearchGet

> List&lt;TagApiResult&gt; apiV2TagsSearchGet(skip, take, orderBy, searchField, searchValue)

Search tags


Use case

User runs method execution

System returns collection of tags (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TagApiResult> result = apiInstance.apiV2TagsSearchGet(skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsSearchGet");
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

### Return type

[**List&lt;TagApiResult&gt;**](TagApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** |  orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  orderByStatement has invalid length  orderByStatement must have uuid as attribute key  Search field not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2TagsTestPlansTagsGet

> List&lt;TagApiResult&gt; apiV2TagsTestPlansTagsGet(skip, take, orderBy, searchField, searchValue)

Get all Tags that are used in TestPlans


Use case

User runs method execution

System returns tags (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        TagsApi apiInstance = new TagsApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TagApiResult> result = apiInstance.apiV2TagsTestPlansTagsGet(skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#apiV2TagsTestPlansTagsGet");
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

### Return type

[**List&lt;TagApiResult&gt;**](TagApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** |  orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  orderByStatement has invalid length  orderByStatement must have uuid as attribute key  Search field not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

