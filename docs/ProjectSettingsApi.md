# ProjectSettingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdSettingsAutotestsPost**](ProjectSettingsApi.md#apiV2ProjectsProjectIdSettingsAutotestsPost) | **POST** /api/v2/projects/{projectId}/settings/autotests | Set autotest project settings. |
| [**getAutotestProjectSettings**](ProjectSettingsApi.md#getAutotestProjectSettings) | **GET** /api/v2/projects/{projectId}/settings/autotests | Get autotest project settings. |


<a id="apiV2ProjectsProjectIdSettingsAutotestsPost"></a>
# **apiV2ProjectsProjectIdSettingsAutotestsPost**
> apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsPostModel)

Set autotest project settings.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectSettingsApi apiInstance = new ProjectSettingsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    AutoTestProjectSettingsPostModel autoTestProjectSettingsPostModel = new AutoTestProjectSettingsPostModel(); // AutoTestProjectSettingsPostModel | 
    try {
      apiInstance.apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsPostModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectSettingsApi#apiV2ProjectsProjectIdSettingsAutotestsPost");
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
| **projectId** | **String**|  | |
| **autoTestProjectSettingsPostModel** | [**AutoTestProjectSettingsPostModel**](AutoTestProjectSettingsPostModel.md)|  | [optional] |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="getAutotestProjectSettings"></a>
# **getAutotestProjectSettings**
> AutoTestProjectSettingsGetModel getAutotestProjectSettings(projectId)

Get autotest project settings.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectSettingsApi apiInstance = new ProjectSettingsApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    try {
      AutoTestProjectSettingsGetModel result = apiInstance.getAutotestProjectSettings(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectSettingsApi#getAutotestProjectSettings");
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
| **projectId** | **String**|  | |

### Return type

[**AutoTestProjectSettingsGetModel**](AutoTestProjectSettingsGetModel.md)

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

