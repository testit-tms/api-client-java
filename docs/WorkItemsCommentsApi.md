# WorkItemsCommentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2WorkItemsCommentsCommentIdDelete**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsCommentIdDelete) | **DELETE** /api/v2/workItems/comments/{commentId} | Delete WorkItem comment |
| [**apiV2WorkItemsCommentsPost**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPost) | **POST** /api/v2/workItems/comments | Create WorkItem comment |
| [**apiV2WorkItemsCommentsPut**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPut) | **PUT** /api/v2/workItems/comments | Update work item comment |
| [**apiV2WorkItemsIdCommentsGet**](WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsGet) | **GET** /api/v2/workItems/{id}/comments | Get work item comments |



## apiV2WorkItemsCommentsCommentIdDelete

> apiV2WorkItemsCommentsCommentIdDelete(commentId)

Delete WorkItem comment

<br>Use case
<br>User sets comment identifier
<br>User runs method execution
<br>System delete comment 
<br>System returns success status code

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsCommentsApi apiInstance = new WorkItemsCommentsApi(defaultClient);
        UUID commentId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Comment internal (guid format) identifier
        try {
            apiInstance.apiV2WorkItemsCommentsCommentIdDelete(commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsCommentsApi#apiV2WorkItemsCommentsCommentIdDelete");
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
| **commentId** | **UUID**| Comment internal (guid format) identifier | |

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
| **400** | Bad Request |  -  |
| **403** | System admin permission required |  -  |
| **204** | Successful operation |  -  |
| **404** | WorkItem is not found |  -  |


## apiV2WorkItemsCommentsPost

> WorkItemCommentModel apiV2WorkItemsCommentsPost(apiV2WorkItemsCommentsPostRequest)

Create WorkItem comment

<br>Use case
<br>User sets comment properties (listed in request parameters)
<br>User runs method execution
<br>System creates comment 
<br>System returns comment model (listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsCommentsApi apiInstance = new WorkItemsCommentsApi(defaultClient);
        ApiV2WorkItemsCommentsPostRequest apiV2WorkItemsCommentsPostRequest = new ApiV2WorkItemsCommentsPostRequest(); // ApiV2WorkItemsCommentsPostRequest | 
        try {
            WorkItemCommentModel result = apiInstance.apiV2WorkItemsCommentsPost(apiV2WorkItemsCommentsPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPost");
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
| **apiV2WorkItemsCommentsPostRequest** | [**ApiV2WorkItemsCommentsPostRequest**](ApiV2WorkItemsCommentsPostRequest.md)|  | [optional] |

### Return type

[**WorkItemCommentModel**](WorkItemCommentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library required |  -  |
| **404** | WorkItem is not found |  -  |
| **201** | Successful operation |  -  |
| **400** | Bad Request |  -  |


## apiV2WorkItemsCommentsPut

> apiV2WorkItemsCommentsPut(apiV2WorkItemsCommentsPutRequest)

Update work item comment

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsCommentsApi apiInstance = new WorkItemsCommentsApi(defaultClient);
        ApiV2WorkItemsCommentsPutRequest apiV2WorkItemsCommentsPutRequest = new ApiV2WorkItemsCommentsPutRequest(); // ApiV2WorkItemsCommentsPutRequest | 
        try {
            apiInstance.apiV2WorkItemsCommentsPut(apiV2WorkItemsCommentsPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPut");
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
| **apiV2WorkItemsCommentsPutRequest** | [**ApiV2WorkItemsCommentsPutRequest**](ApiV2WorkItemsCommentsPutRequest.md)|  | [optional] |

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
| **403** | System administrator role is required |  -  |
| **204** | No Content |  -  |


## apiV2WorkItemsIdCommentsGet

> List&lt;WorkItemCommentModel&gt; apiV2WorkItemsIdCommentsGet(id)

Get work item comments

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.WorkItemsCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        WorkItemsCommentsApi apiInstance = new WorkItemsCommentsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the work item
        try {
            List<WorkItemCommentModel> result = apiInstance.apiV2WorkItemsIdCommentsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkItemsCommentsApi#apiV2WorkItemsIdCommentsGet");
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

[**List&lt;WorkItemCommentModel&gt;**](WorkItemCommentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for test library is required |  -  |
| **200** | Success |  -  |

