# ProjectExternalServicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsIdExternalServicesExternalServiceIdDelete**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdDelete) | **DELETE** /api/v2/projects/{id}/external-services/{externalServiceId} | Disable an external service |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdGet**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdGet) | **GET** /api/v2/projects/{id}/external-services/{externalServiceId} | Retrieves settings of an external service |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdPatch**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdPatch) | **PATCH** /api/v2/projects/{id}/external-services/{externalServiceId} | Replaces one active external service with another |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdPut**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdPut) | **PUT** /api/v2/projects/{id}/external-services/{externalServiceId} | Enable an external service |
| [**apiV2ProjectsIdExternalServicesGet**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesGet) | **GET** /api/v2/projects/{id}/external-services | Retrieves information about external services, including their integration status (enabled or not) |
| [**apiV2ProjectsIdExternalServicesIssuesSearchPost**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesIssuesSearchPost) | **POST** /api/v2/projects/{id}/external-services/issues/search | Searches for external issues using enabled external services in project |



## apiV2ProjectsIdExternalServicesExternalServiceIdDelete

> apiV2ProjectsIdExternalServicesExternalServiceIdDelete(id, externalServiceId)

Disable an external service

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Project ID
        UUID externalServiceId = UUID.randomUUID(); // UUID | External service ID
        try {
            apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdDelete(id, externalServiceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdDelete");
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
| **id** | **String**| Project ID | |
| **externalServiceId** | **UUID**| External service ID | |

### Return type

null (empty response body)

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


## apiV2ProjectsIdExternalServicesExternalServiceIdGet

> ProjectExternalServiceSettingsApiResult apiV2ProjectsIdExternalServicesExternalServiceIdGet(id, externalServiceId)

Retrieves settings of an external service

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Project ID
        UUID externalServiceId = UUID.randomUUID(); // UUID | External service ID
        try {
            ProjectExternalServiceSettingsApiResult result = apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdGet(id, externalServiceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdGet");
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
| **id** | **String**| Project ID | |
| **externalServiceId** | **UUID**| External service ID | |

### Return type

[**ProjectExternalServiceSettingsApiResult**](ProjectExternalServiceSettingsApiResult.md)

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


## apiV2ProjectsIdExternalServicesExternalServiceIdPatch

> apiV2ProjectsIdExternalServicesExternalServiceIdPatch(id, externalServiceId, replaceProjectExternalServiceApiModel)

Replaces one active external service with another

See <a href="https://www.rfc-editor.org/rfc/rfc6902" target="_blank">RFC 6902: JavaScript Object Notation (JSON) Patch</a> for details

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Project ID
        UUID externalServiceId = UUID.randomUUID(); // UUID | External service ID
        ReplaceProjectExternalServiceApiModel replaceProjectExternalServiceApiModel = new ReplaceProjectExternalServiceApiModel(); // ReplaceProjectExternalServiceApiModel | 
        try {
            apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdPatch(id, externalServiceId, replaceProjectExternalServiceApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPatch");
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
| **id** | **String**| Project ID | |
| **externalServiceId** | **UUID**| External service ID | |
| **replaceProjectExternalServiceApiModel** | [**ReplaceProjectExternalServiceApiModel**](ReplaceProjectExternalServiceApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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


## apiV2ProjectsIdExternalServicesExternalServiceIdPut

> apiV2ProjectsIdExternalServicesExternalServiceIdPut(id, externalServiceId, enableProjectExternalServiceApiModel)

Enable an external service

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Project ID
        UUID externalServiceId = UUID.randomUUID(); // UUID | External service ID
        EnableProjectExternalServiceApiModel enableProjectExternalServiceApiModel = new EnableProjectExternalServiceApiModel(); // EnableProjectExternalServiceApiModel | 
        try {
            apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdPut(id, externalServiceId, enableProjectExternalServiceApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPut");
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
| **id** | **String**| Project ID | |
| **externalServiceId** | **UUID**| External service ID | |
| **enableProjectExternalServiceApiModel** | [**EnableProjectExternalServiceApiModel**](EnableProjectExternalServiceApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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


## apiV2ProjectsIdExternalServicesGet

> ProjectExternalServicesApiResult apiV2ProjectsIdExternalServicesGet(id, category)

Retrieves information about external services, including their integration status (enabled or not)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Project ID
        ApiExternalServiceCategory category = ApiExternalServiceCategory.fromValue("AI"); // ApiExternalServiceCategory | 
        try {
            ProjectExternalServicesApiResult result = apiInstance.apiV2ProjectsIdExternalServicesGet(id, category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesGet");
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
| **id** | **String**| Project ID | |
| **category** | **ApiExternalServiceCategory**|  | [optional] [enum: AI, IssueTracker] |

### Return type

[**ProjectExternalServicesApiResult**](ProjectExternalServicesApiResult.md)

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


## apiV2ProjectsIdExternalServicesIssuesSearchPost

> List&lt;ExternalIssueApiResult&gt; apiV2ProjectsIdExternalServicesIssuesSearchPost(id, searchExternalIssuesApiModel)

Searches for external issues using enabled external services in project

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectExternalServicesApi;

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

        ProjectExternalServicesApi apiInstance = new ProjectExternalServicesApi(defaultClient);
        String id = "id_example"; // String | Internal (UUID) or global (integer) identifier
        SearchExternalIssuesApiModel searchExternalIssuesApiModel = new SearchExternalIssuesApiModel(); // SearchExternalIssuesApiModel | 
        try {
            List<ExternalIssueApiResult> result = apiInstance.apiV2ProjectsIdExternalServicesIssuesSearchPost(id, searchExternalIssuesApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesIssuesSearchPost");
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
| **id** | **String**| Internal (UUID) or global (integer) identifier | |
| **searchExternalIssuesApiModel** | [**SearchExternalIssuesApiModel**](SearchExternalIssuesApiModel.md)|  | [optional] |

### Return type

[**List&lt;ExternalIssueApiResult&gt;**](ExternalIssueApiResult.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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

