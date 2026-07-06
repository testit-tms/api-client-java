# AiServicesApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ExternalServicesIdAiModelsPost**](AiServicesApiApi.md#apiV2ExternalServicesIdAiModelsPost) | **POST** /api/v2/external-services/{id}/ai/models | Ask for models with inquiry filter, cached |



## apiV2ExternalServicesIdAiModelsPost

> AIServiceModelApiResultIReply apiV2ExternalServicesIdAiModelsPost(id, getAIServiceModelsApiModel)

Ask for models with inquiry filter, cached

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.AiServicesApiApi;

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

        AiServicesApiApi apiInstance = new AiServicesApiApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        GetAIServiceModelsApiModel getAIServiceModelsApiModel = new GetAIServiceModelsApiModel(); // GetAIServiceModelsApiModel | 
        try {
            AIServiceModelApiResultIReply result = apiInstance.apiV2ExternalServicesIdAiModelsPost(id, getAIServiceModelsApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AiServicesApiApi#apiV2ExternalServicesIdAiModelsPost");
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
| **getAIServiceModelsApiModel** | [**GetAIServiceModelsApiModel**](GetAIServiceModelsApiModel.md)|  | [optional] |

### Return type

[**AIServiceModelApiResultIReply**](AIServiceModelApiResultIReply.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Not valid data or models request errors |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

