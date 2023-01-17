# NotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2NotificationsCountGet**](NotificationsApi.md#apiV2NotificationsCountGet) | **GET** /api/v2/notifications/count | Get unread Notifications total in last 7 days |
| [**apiV2NotificationsGet**](NotificationsApi.md#apiV2NotificationsGet) | **GET** /api/v2/notifications | Get all Notifications for current User |
| [**apiV2NotificationsIdReadPost**](NotificationsApi.md#apiV2NotificationsIdReadPost) | **POST** /api/v2/notifications/{id}/read | Set Notification as read |
| [**apiV2NotificationsReadPost**](NotificationsApi.md#apiV2NotificationsReadPost) | **POST** /api/v2/notifications/read | Set all Notifications as read |
| [**apiV2NotificationsSearchPost**](NotificationsApi.md#apiV2NotificationsSearchPost) | **POST** /api/v2/notifications/search | Search Notifications for current User |


<a name="apiV2NotificationsCountGet"></a>
# **apiV2NotificationsCountGet**
> Integer apiV2NotificationsCountGet(isRead)

Get unread Notifications total in last 7 days

&lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns unread notifications total (listed in the response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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

<a name="apiV2NotificationsGet"></a>
# **apiV2NotificationsGet**
> List&lt;NotificationModel&gt; apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue)

Get all Notifications for current User

&lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns notifications (listed in the response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **notificationType** | [**NotificationTypeModel**](.md)|  | [optional] [enum: MentionInComment, TestPointIsSetInTestPlan, MentionInCustomAttribute, TestPlanUnlockRequest] |
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
| **400** | &lt;br&gt;orderByStatement must have one &#39;.&#39; and no &#39;,&#39; symbols  &lt;br&gt;orderByStatement has invalid length  &lt;br&gt;orderByStatement must have uuid as attribute key  &lt;br&gt;Search field not found |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **401** | Unauthorized |  -  |

<a name="apiV2NotificationsIdReadPost"></a>
# **apiV2NotificationsIdReadPost**
> apiV2NotificationsIdReadPost(id)

Set Notification as read

&lt;br&gt;Use case  &lt;br&gt;User sets notification internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set notification as read

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **404** | Can&#39;t find notification with notificationId |  -  |
| **401** | Unauthorized |  -  |
| **204** | Successful operation |  -  |

<a name="apiV2NotificationsReadPost"></a>
# **apiV2NotificationsReadPost**
> apiV2NotificationsReadPost()

Set all Notifications as read

&lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System set all notifications as read

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |

<a name="apiV2NotificationsSearchPost"></a>
# **apiV2NotificationsSearchPost**
> List&lt;NotificationModel&gt; apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, notificationQueryFilterModel)

Search Notifications for current User

&lt;br&gt;Use case  &lt;br&gt;User set filter and runs method execution  &lt;br&gt;System returns notifications (listed in the response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    NotificationQueryFilterModel notificationQueryFilterModel = new NotificationQueryFilterModel(); // NotificationQueryFilterModel | 
    try {
      List<NotificationModel> result = apiInstance.apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, notificationQueryFilterModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#apiV2NotificationsSearchPost");
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
| **notificationQueryFilterModel** | [**NotificationQueryFilterModel**](NotificationQueryFilterModel.md)|  | [optional] |

### Return type

[**List&lt;NotificationModel&gt;**](NotificationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

