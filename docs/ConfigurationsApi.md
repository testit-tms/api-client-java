# ConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ConfigurationsCreateByParametersPost**](ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create Configurations by parameters |
| [**apiV2ConfigurationsDeleteBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsDeleteBulkPost) | **POST** /api/v2/configurations/delete/bulk | Delete multiple configurations |
| [**apiV2ConfigurationsIdDelete**](ConfigurationsApi.md#apiV2ConfigurationsIdDelete) | **DELETE** /api/v2/configurations/{id} | Delete configuration |
| [**apiV2ConfigurationsIdPatch**](ConfigurationsApi.md#apiV2ConfigurationsIdPatch) | **PATCH** /api/v2/configurations/{id} | Patch configuration |
| [**apiV2ConfigurationsIdPurgePost**](ConfigurationsApi.md#apiV2ConfigurationsIdPurgePost) | **POST** /api/v2/configurations/{id}/purge | Permanently delete configuration from archive |
| [**apiV2ConfigurationsIdRestorePost**](ConfigurationsApi.md#apiV2ConfigurationsIdRestorePost) | **POST** /api/v2/configurations/{id}/restore | Restore configuration from the archive |
| [**apiV2ConfigurationsPurgeBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsPurgeBulkPost) | **POST** /api/v2/configurations/purge/bulk | Permanently delete multiple archived configurations |
| [**apiV2ConfigurationsPut**](ConfigurationsApi.md#apiV2ConfigurationsPut) | **PUT** /api/v2/configurations | Edit configuration |
| [**apiV2ConfigurationsRestoreBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsRestoreBulkPost) | **POST** /api/v2/configurations/restore/bulk | Restore multiple configurations from the archive |
| [**apiV2ConfigurationsSearchPost**](ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations |
| [**createConfiguration**](ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration |
| [**getConfigurationById**](ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID |



## apiV2ConfigurationsCreateByParametersPost

> apiV2ConfigurationsCreateByParametersPost(apiV2ConfigurationsCreateByParametersPostRequest)

Create Configurations by parameters

<br>Use case
<br>User sets request model (listed in the request example)
<br>User runs method execution
<br>System creates configurations
<br>System returns created configuration ids (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        ApiV2ConfigurationsCreateByParametersPostRequest apiV2ConfigurationsCreateByParametersPostRequest = new ApiV2ConfigurationsCreateByParametersPostRequest(); // ApiV2ConfigurationsCreateByParametersPostRequest | 
        try {
            apiInstance.apiV2ConfigurationsCreateByParametersPost(apiV2ConfigurationsCreateByParametersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsCreateByParametersPost");
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
| **apiV2ConfigurationsCreateByParametersPostRequest** | [**ApiV2ConfigurationsCreateByParametersPostRequest**](ApiV2ConfigurationsCreateByParametersPostRequest.md)|  | [optional] |

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
| **201** | Created |  -  |
| **404** | &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found |  -  |
| **400** | &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty |  -  |
| **200** | Successful operation |  -  |


## apiV2ConfigurationsDeleteBulkPost

> Integer apiV2ConfigurationsDeleteBulkPost(apiV2ConfigurationsPurgeBulkPostRequest)

Delete multiple configurations

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest = new ApiV2ConfigurationsPurgeBulkPostRequest(); // ApiV2ConfigurationsPurgeBulkPostRequest | 
        try {
            Integer result = apiInstance.apiV2ConfigurationsDeleteBulkPost(apiV2ConfigurationsPurgeBulkPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsDeleteBulkPost");
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
| **apiV2ConfigurationsPurgeBulkPostRequest** | [**ApiV2ConfigurationsPurgeBulkPostRequest**](ApiV2ConfigurationsPurgeBulkPostRequest.md)|  | [optional] |

### Return type

**Integer**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV2ConfigurationsIdDelete

> apiV2ConfigurationsIdDelete(id)

Delete configuration

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the configuration
        try {
            apiInstance.apiV2ConfigurationsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsIdDelete");
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
| **id** | **String**| Unique or global ID of the configuration | |

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
| **204** | No Content |  -  |
| **403** | Delete permission for configurations is required |  -  |


## apiV2ConfigurationsIdPatch

> apiV2ConfigurationsIdPatch(id, operation)

Patch configuration

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
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Unique ID of the configuration
        List<Operation> operation = Arrays.asList(); // List<Operation> | 
        try {
            apiInstance.apiV2ConfigurationsIdPatch(id, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsIdPatch");
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
| **id** | **UUID**| Unique ID of the configuration | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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
| **403** | Update permission for configuration is required |  -  |
| **204** | No Content |  -  |


## apiV2ConfigurationsIdPurgePost

> apiV2ConfigurationsIdPurgePost(id)

Permanently delete configuration from archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the configuration
        try {
            apiInstance.apiV2ConfigurationsIdPurgePost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsIdPurgePost");
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
| **id** | **String**| Unique or global ID of the configuration | |

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
| **403** | Full access permission for the archive is required |  -  |
| **204** | No Content |  -  |


## apiV2ConfigurationsIdRestorePost

> apiV2ConfigurationsIdRestorePost(id)

Restore configuration from the archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Unique or global ID of the configuration
        try {
            apiInstance.apiV2ConfigurationsIdRestorePost(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsIdRestorePost");
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
| **id** | **String**| Unique or global ID of the configuration | |

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
| **204** | No Content |  -  |
| **403** | Read permission for archive is required |  -  |


## apiV2ConfigurationsPurgeBulkPost

> apiV2ConfigurationsPurgeBulkPost(apiV2ConfigurationsPurgeBulkPostRequest)

Permanently delete multiple archived configurations

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest = new ApiV2ConfigurationsPurgeBulkPostRequest(); // ApiV2ConfigurationsPurgeBulkPostRequest | 
        try {
            apiInstance.apiV2ConfigurationsPurgeBulkPost(apiV2ConfigurationsPurgeBulkPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsPurgeBulkPost");
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
| **apiV2ConfigurationsPurgeBulkPostRequest** | [**ApiV2ConfigurationsPurgeBulkPostRequest**](ApiV2ConfigurationsPurgeBulkPostRequest.md)|  | [optional] |

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
| **403** | Full access permission for the archive is required |  -  |


## apiV2ConfigurationsPut

> apiV2ConfigurationsPut(apiV2ConfigurationsPutRequest)

Edit configuration

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        ApiV2ConfigurationsPutRequest apiV2ConfigurationsPutRequest = new ApiV2ConfigurationsPutRequest(); // ApiV2ConfigurationsPutRequest | 
        try {
            apiInstance.apiV2ConfigurationsPut(apiV2ConfigurationsPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsPut");
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
| **apiV2ConfigurationsPutRequest** | [**ApiV2ConfigurationsPutRequest**](ApiV2ConfigurationsPutRequest.md)|  | [optional] |

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
| **403** | Update permission for configurations is required |  -  |
| **204** | No Content |  -  |


## apiV2ConfigurationsRestoreBulkPost

> Integer apiV2ConfigurationsRestoreBulkPost(apiV2ConfigurationsPurgeBulkPostRequest)

Restore multiple configurations from the archive

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        ApiV2ConfigurationsPurgeBulkPostRequest apiV2ConfigurationsPurgeBulkPostRequest = new ApiV2ConfigurationsPurgeBulkPostRequest(); // ApiV2ConfigurationsPurgeBulkPostRequest | 
        try {
            Integer result = apiInstance.apiV2ConfigurationsRestoreBulkPost(apiV2ConfigurationsPurgeBulkPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsRestoreBulkPost");
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
| **apiV2ConfigurationsPurgeBulkPostRequest** | [**ApiV2ConfigurationsPurgeBulkPostRequest**](ApiV2ConfigurationsPurgeBulkPostRequest.md)|  | [optional] |

### Return type

**Integer**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV2ConfigurationsSearchPost

> List&lt;ConfigurationModel&gt; apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ConfigurationsSearchPostRequest)

Search for configurations

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        ApiV2ConfigurationsSearchPostRequest apiV2ConfigurationsSearchPostRequest = new ApiV2ConfigurationsSearchPostRequest(); // ApiV2ConfigurationsSearchPostRequest | Model containing all the filters
        try {
            List<ConfigurationModel> result = apiInstance.apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ConfigurationsSearchPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#apiV2ConfigurationsSearchPost");
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
| **apiV2ConfigurationsSearchPostRequest** | [**ApiV2ConfigurationsSearchPostRequest**](ApiV2ConfigurationsSearchPostRequest.md)| Model containing all the filters | [optional] |

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## createConfiguration

> ConfigurationModel createConfiguration(createConfigurationRequest)

Create Configuration

<br>Use case
<br>User sets configuration model (listed in the request example)
<br>User runs method execution
<br>System creates configuration
<br>System returns created configuration (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        CreateConfigurationRequest createConfigurationRequest = new CreateConfigurationRequest(); // CreateConfigurationRequest | 
        try {
            ConfigurationModel result = apiInstance.createConfiguration(createConfigurationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#createConfiguration");
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
| **createConfigurationRequest** | [**CreateConfigurationRequest**](CreateConfigurationRequest.md)|  | [optional] |

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Update permission for configuration required |  -  |
| **404** | Can&#39;t find project |  -  |
| **401** | Unauthorized |  -  |
| **201** | Successful operation |  -  |
| **409** | Configuration with the same name already exists! |  -  |


## getConfigurationById

> ConfigurationModel getConfigurationById(id)

Get configuration by internal or global ID

<br>Use case
<br>User sets configuration internal (guid format) or global (integer format) identifier
<br>User runs method execution
<br>System search configuration using the identifier
<br>System returns configuration

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ConfigurationsApi apiInstance = new ConfigurationsApi(defaultClient);
        String id = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | Configuration internal (guid format) or global (integer format) identifier
        try {
            ConfigurationModel result = apiInstance.getConfigurationById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationsApi#getConfigurationById");
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
| **id** | **String**| Configuration internal (guid format) or global (integer format) identifier | |

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

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
| **403** | Read permission for configuration required |  -  |
| **404** | Can&#39;t find configuration with id |  -  |

