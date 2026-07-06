# ExternalServicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ExternalServicesMetadataGet**](ExternalServicesApi.md#apiV2ExternalServicesMetadataGet) | **GET** /api/v2/external-services/metadata | Retrieves the metadata for all available external services |



## apiV2ExternalServicesMetadataGet

> ExternalServicesMetadataApiResult apiV2ExternalServicesMetadataGet()

Retrieves the metadata for all available external services

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ExternalServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: PrivateToken
        ApiKeyAuth PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("PrivateToken");
        PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //PrivateToken.setApiKeyPrefix("Token");

        // Configure API key authorization: Cookies
        ApiKeyAuth Cookies = (ApiKeyAuth) defaultClient.getAuthentication("Cookies");
        Cookies.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Cookies.setApiKeyPrefix("Token");

        ExternalServicesApi apiInstance = new ExternalServicesApi(defaultClient);
        try {
            ExternalServicesMetadataApiResult result = apiInstance.apiV2ExternalServicesMetadataGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalServicesApi#apiV2ExternalServicesMetadataGet");
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

[**ExternalServicesMetadataApiResult**](ExternalServicesMetadataApiResult.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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

