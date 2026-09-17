# OpenIdConnectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2OpenidConnectionsGet**](OpenIdConnectionsApi.md#apiV2OpenidConnectionsGet) | **GET** /api/v2/openid-connections |  |



## apiV2OpenidConnectionsGet

> List&lt;OpenIdConnectionClientShortModel&gt; apiV2OpenidConnectionsGet()



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.OpenIdConnectionsApi;

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

        OpenIdConnectionsApi apiInstance = new OpenIdConnectionsApi(defaultClient);
        try {
            List<OpenIdConnectionClientShortModel> result = apiInstance.apiV2OpenidConnectionsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenIdConnectionsApi#apiV2OpenidConnectionsGet");
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

[**List&lt;OpenIdConnectionClientShortModel&gt;**](OpenIdConnectionClientShortModel.md)

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

