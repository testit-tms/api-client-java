# UserRoleAssignmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UsersUserIdRolesRoleIdDelete**](UserRoleAssignmentsApi.md#apiV2UsersUserIdRolesRoleIdDelete) | **DELETE** /api/v2/users/{userId}/roles/{roleId} |  |
| [**apiV2UsersUserIdRolesRoleIdPost**](UserRoleAssignmentsApi.md#apiV2UsersUserIdRolesRoleIdPost) | **POST** /api/v2/users/{userId}/roles/{roleId} |  |



## apiV2UsersUserIdRolesRoleIdDelete

> apiV2UsersUserIdRolesRoleIdDelete(userId, roleId)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.UserRoleAssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        UserRoleAssignmentsApi apiInstance = new UserRoleAssignmentsApi(defaultClient);
        UUID userId = UUID.randomUUID(); // UUID | 
        UUID roleId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2UsersUserIdRolesRoleIdDelete(userId, roleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdDelete");
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
| **userId** | **UUID**|  | |
| **roleId** | **UUID**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2UsersUserIdRolesRoleIdPost

> apiV2UsersUserIdRolesRoleIdPost(userId, roleId)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.UserRoleAssignmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        UserRoleAssignmentsApi apiInstance = new UserRoleAssignmentsApi(defaultClient);
        UUID userId = UUID.randomUUID(); // UUID | 
        UUID roleId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2UsersUserIdRolesRoleIdPost(userId, roleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdPost");
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
| **userId** | **UUID**|  | |
| **roleId** | **UUID**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

