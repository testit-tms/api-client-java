# ExternalIssuesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ExternalIssuesSuggestionsPost**](ExternalIssuesApi.md#apiV2ExternalIssuesSuggestionsPost) | **POST** /api/v2/external-issues/suggestions | Returns list of suggestions from available external issues |



## apiV2ExternalIssuesSuggestionsPost

> ExternalIssueApiFieldSuggestionReply apiV2ExternalIssuesSuggestionsPost(getExternalIssueSuggestionsApiModel)

Returns list of suggestions from available external issues

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ExternalIssuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ExternalIssuesApi apiInstance = new ExternalIssuesApi(defaultClient);
        GetExternalIssueSuggestionsApiModel getExternalIssueSuggestionsApiModel = new GetExternalIssueSuggestionsApiModel(); // GetExternalIssueSuggestionsApiModel | 
        try {
            ExternalIssueApiFieldSuggestionReply result = apiInstance.apiV2ExternalIssuesSuggestionsPost(getExternalIssueSuggestionsApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalIssuesApi#apiV2ExternalIssuesSuggestionsPost");
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
| **getExternalIssueSuggestionsApiModel** | [**GetExternalIssueSuggestionsApiModel**](GetExternalIssueSuggestionsApiModel.md)|  | [optional] |

### Return type

[**ExternalIssueApiFieldSuggestionReply**](ExternalIssueApiFieldSuggestionReply.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
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

