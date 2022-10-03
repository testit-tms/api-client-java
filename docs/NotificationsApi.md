# NotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2NotificationsCountGet**](NotificationsApi.md#apiV2NotificationsCountGet) | **GET** /api/v2/notifications/count | Get unread Notifications total in last 7 days |
| [**apiV2NotificationsGet**](NotificationsApi.md#apiV2NotificationsGet) | **GET** /api/v2/notifications | Get all Notifications for current User |
| [**apiV2NotificationsIdReadPost**](NotificationsApi.md#apiV2NotificationsIdReadPost) | **POST** /api/v2/notifications/{id}/read | Set Notification as read |
| [**apiV2NotificationsReadPost**](NotificationsApi.md#apiV2NotificationsReadPost) | **POST** /api/v2/notifications/read | Set all Notifications as read |



## apiV2NotificationsCountGet

> Integer apiV2NotificationsCountGet(isRead)

Get unread Notifications total in last 7 days

<br>Use case
<br>User runs method execution
<br>System returns unread notifications total (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        Boolean isRead = true; // Boolean | 
        try {
            Integer result = apiInstance.apiV2NotificationsCountGet(isRead);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#apiV2NotificationsCountGet");
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
| **isRead** | **Boolean**|  | [optional] |

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
| **401** | Unauthorized |  -  |
| **200** | Successful operation |  -  |


## apiV2NotificationsGet

> List&lt;NotificationModel&gt; apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue)

Get all Notifications for current User

<br>Use case
<br>User runs method execution
<br>System returns notifications (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationTypeModel notificationType = NotificationTypeModel.fromValue("MentionInComment"); // NotificationTypeModel | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<NotificationModel> result = apiInstance.apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#apiV2NotificationsGet");
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
| **notificationType** | **NotificationTypeModel**|  | [optional] [enum: MentionInComment, TestPointIsSetInTestPlan, MentionInCustomAttribute, TestPlanUnlockRequest] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;NotificationModel&gt;**](NotificationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | &lt;br&gt;orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  &lt;br&gt;orderByStatement has invalid length  &lt;br&gt;orderByStatement must have uuid as attribute key  &lt;br&gt;Search field not found |  -  |
| **401** | Unauthorized |  -  |


## apiV2NotificationsIdReadPost

> apiV2NotificationsIdReadPost(id)

Set Notification as read

<br>Use case
<br>User sets notification internal (guid format) identifier
<br>User runs method execution
<br>System set notification as read

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2NotificationsIdReadPost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#apiV2NotificationsIdReadPost");
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
| **401** | Unauthorized |  -  |
| **404** | Can&#39;t find notification with notificationId |  -  |
| **200** | Success |  -  |
| **204** | Successful operation |  -  |


## apiV2NotificationsReadPost

> apiV2NotificationsReadPost()

Set all Notifications as read

<br>Use case
<br>User runs method execution
<br>System set all notifications as read

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        try {
            apiInstance.apiV2NotificationsReadPost();
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#apiV2NotificationsReadPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | Success |  -  |
| **204** | Successful operation |  -  |
