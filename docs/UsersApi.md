# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2UsersExistsGet**](UsersApi.md#apiV2UsersExistsGet) | **GET** /api/v2/users/exists |  |



## apiV2UsersExistsGet

> UserCustomNameValidationResponse apiV2UsersExistsGet(userName)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: PrivateToken
        ApiKeyAuth PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("PrivateToken");
        PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //PrivateToken.setApiKeyPrefix("Token");

        // Configure API key authorization: Identity.Application
        ApiKeyAuth Identity.Application = (ApiKeyAuth) defaultClient.getAuthentication("Identity.Application");
        Identity.Application.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Identity.Application.setApiKeyPrefix("Token");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userName = "userName_example"; // String | 
        try {
            UserCustomNameValidationResponse result = apiInstance.apiV2UsersExistsGet(userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#apiV2UsersExistsGet");
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
| **userName** | **String**|  | [optional] |

### Return type

[**UserCustomNameValidationResponse**](UserCustomNameValidationResponse.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Identity.Application](../README.md#Identity.Application)

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

