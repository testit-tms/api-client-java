# ConfigurationParametersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ConfigurationParametersConfigurationParameterIdDelete**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdDelete) | **DELETE** /api/v2/configuration-parameters/{configurationParameterId} | Deletes configuration parameter |
| [**apiV2ConfigurationParametersConfigurationParameterIdGet**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdGet) | **GET** /api/v2/configuration-parameters/{configurationParameterId} | Gets configuration parameter by its identifier |
| [**apiV2ConfigurationParametersConfigurationParameterIdPut**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdPut) | **PUT** /api/v2/configuration-parameters/{configurationParameterId} | Updates configuration parameter |
| [**apiV2ConfigurationParametersPost**](ConfigurationParametersApi.md#apiV2ConfigurationParametersPost) | **POST** /api/v2/configuration-parameters | Creates new configuration parameter |
| [**apiV2ConfigurationParametersSearchPost**](ConfigurationParametersApi.md#apiV2ConfigurationParametersSearchPost) | **POST** /api/v2/configuration-parameters/search | Searches for configuration parameters |



## apiV2ConfigurationParametersConfigurationParameterIdDelete

> apiV2ConfigurationParametersConfigurationParameterIdDelete(configurationParameterId)

Deletes configuration parameter

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationParametersApi;

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

        ConfigurationParametersApi apiInstance = new ConfigurationParametersApi(defaultClient);
        UUID configurationParameterId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2ConfigurationParametersConfigurationParameterIdDelete(configurationParameterId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdDelete");
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
| **configurationParameterId** | **UUID**|  | |

### Return type

null (empty response body)

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


## apiV2ConfigurationParametersConfigurationParameterIdGet

> ConfigurationParameterApiResult apiV2ConfigurationParametersConfigurationParameterIdGet(configurationParameterId)

Gets configuration parameter by its identifier

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationParametersApi;

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

        ConfigurationParametersApi apiInstance = new ConfigurationParametersApi(defaultClient);
        UUID configurationParameterId = UUID.randomUUID(); // UUID | 
        try {
            ConfigurationParameterApiResult result = apiInstance.apiV2ConfigurationParametersConfigurationParameterIdGet(configurationParameterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdGet");
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
| **configurationParameterId** | **UUID**|  | |

### Return type

[**ConfigurationParameterApiResult**](ConfigurationParameterApiResult.md)

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


## apiV2ConfigurationParametersConfigurationParameterIdPut

> apiV2ConfigurationParametersConfigurationParameterIdPut(configurationParameterId, configurationParameterApiModel)

Updates configuration parameter

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationParametersApi;

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

        ConfigurationParametersApi apiInstance = new ConfigurationParametersApi(defaultClient);
        UUID configurationParameterId = UUID.randomUUID(); // UUID | 
        ConfigurationParameterApiModel configurationParameterApiModel = new ConfigurationParameterApiModel(); // ConfigurationParameterApiModel | 
        try {
            apiInstance.apiV2ConfigurationParametersConfigurationParameterIdPut(configurationParameterId, configurationParameterApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdPut");
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
| **configurationParameterId** | **UUID**|  | |
| **configurationParameterApiModel** | [**ConfigurationParameterApiModel**](ConfigurationParameterApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Identity.Application](../README.md#Identity.Application)

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


## apiV2ConfigurationParametersPost

> ConfigurationParameterApiResult apiV2ConfigurationParametersPost(configurationParameterApiModel)

Creates new configuration parameter

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationParametersApi;

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

        ConfigurationParametersApi apiInstance = new ConfigurationParametersApi(defaultClient);
        ConfigurationParameterApiModel configurationParameterApiModel = new ConfigurationParameterApiModel(); // ConfigurationParameterApiModel | 
        try {
            ConfigurationParameterApiResult result = apiInstance.apiV2ConfigurationParametersPost(configurationParameterApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationParametersApi#apiV2ConfigurationParametersPost");
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
| **configurationParameterApiModel** | [**ConfigurationParameterApiModel**](ConfigurationParameterApiModel.md)|  | [optional] |

### Return type

[**ConfigurationParameterApiResult**](ConfigurationParameterApiResult.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Identity.Application](../README.md#Identity.Application)

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


## apiV2ConfigurationParametersSearchPost

> ConfigurationParameterPreviewApiResultIReply apiV2ConfigurationParametersSearchPost(searchConfigurationParametersApiModel)

Searches for configuration parameters

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationParametersApi;

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

        ConfigurationParametersApi apiInstance = new ConfigurationParametersApi(defaultClient);
        SearchConfigurationParametersApiModel searchConfigurationParametersApiModel = new SearchConfigurationParametersApiModel(); // SearchConfigurationParametersApiModel | 
        try {
            ConfigurationParameterPreviewApiResultIReply result = apiInstance.apiV2ConfigurationParametersSearchPost(searchConfigurationParametersApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationParametersApi#apiV2ConfigurationParametersSearchPost");
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
| **searchConfigurationParametersApiModel** | [**SearchConfigurationParametersApiModel**](SearchConfigurationParametersApiModel.md)|  | [optional] |

### Return type

[**ConfigurationParameterPreviewApiResultIReply**](ConfigurationParameterPreviewApiResultIReply.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Identity.Application](../README.md#Identity.Application)

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

