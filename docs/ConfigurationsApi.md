# ConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ConfigurationsCreateByParametersPost**](ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create configurations by parameters |
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


<a id="apiV2ConfigurationsCreateByParametersPost"></a>
# **apiV2ConfigurationsCreateByParametersPost**
> List&lt;UUID&gt; apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel)

Create configurations by parameters

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationByParametersModel configurationByParametersModel = new ConfigurationByParametersModel(); // ConfigurationByParametersModel | 
    try {
      List<UUID> result = apiInstance.apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel);
      System.out.println(result);
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
| **configurationByParametersModel** | [**ConfigurationByParametersModel**](ConfigurationByParametersModel.md)|  | [optional] |

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for configuration is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsDeleteBulkPost"></a>
# **apiV2ConfigurationsDeleteBulkPost**
> Integer apiV2ConfigurationsDeleteBulkPost(configurationSelectModel)

Delete multiple configurations

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationSelectModel configurationSelectModel = new ConfigurationSelectModel(); // ConfigurationSelectModel | 
    try {
      Integer result = apiInstance.apiV2ConfigurationsDeleteBulkPost(configurationSelectModel);
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
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsIdDelete"></a>
# **apiV2ConfigurationsIdDelete**
> apiV2ConfigurationsIdDelete(id)

Delete configuration

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Delete permission for configurations is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsIdPatch"></a>
# **apiV2ConfigurationsIdPatch**
> apiV2ConfigurationsIdPatch(id, operation)

Patch configuration

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for configuration is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsIdPurgePost"></a>
# **apiV2ConfigurationsIdPurgePost**
> apiV2ConfigurationsIdPurgePost(id)

Permanently delete configuration from archive

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Full access permission for the archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsIdRestorePost"></a>
# **apiV2ConfigurationsIdRestorePost**
> apiV2ConfigurationsIdRestorePost(id)

Restore configuration from the archive

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsPurgeBulkPost"></a>
# **apiV2ConfigurationsPurgeBulkPost**
> apiV2ConfigurationsPurgeBulkPost(configurationSelectModel)

Permanently delete multiple archived configurations

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationSelectModel configurationSelectModel = new ConfigurationSelectModel(); // ConfigurationSelectModel | 
    try {
      apiInstance.apiV2ConfigurationsPurgeBulkPost(configurationSelectModel);
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
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Full access permission for the archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsPut"></a>
# **apiV2ConfigurationsPut**
> apiV2ConfigurationsPut(configurationPutModel)

Edit configuration

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationPutModel configurationPutModel = new ConfigurationPutModel(); // ConfigurationPutModel | 
    try {
      apiInstance.apiV2ConfigurationsPut(configurationPutModel);
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
| **configurationPutModel** | [**ConfigurationPutModel**](ConfigurationPutModel.md)|  | [optional] |

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
| **403** | Update permission for configurations is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsRestoreBulkPost"></a>
# **apiV2ConfigurationsRestoreBulkPost**
> Integer apiV2ConfigurationsRestoreBulkPost(configurationSelectModel)

Restore multiple configurations from the archive

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationSelectModel configurationSelectModel = new ConfigurationSelectModel(); // ConfigurationSelectModel | 
    try {
      Integer result = apiInstance.apiV2ConfigurationsRestoreBulkPost(configurationSelectModel);
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
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for archive is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ConfigurationsSearchPost"></a>
# **apiV2ConfigurationsSearchPost**
> List&lt;ConfigurationModel&gt; apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationFilterModel)

Search for configurations

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationFilterModel configurationFilterModel = new ConfigurationFilterModel(); // ConfigurationFilterModel | Model containing all the filters
    try {
      List<ConfigurationModel> result = apiInstance.apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationFilterModel);
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
| **configurationFilterModel** | [**ConfigurationFilterModel**](ConfigurationFilterModel.md)| Model containing all the filters | [optional] |

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
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="createConfiguration"></a>
# **createConfiguration**
> ConfigurationModel createConfiguration(configurationPostModel)

Create Configuration

 Use case   User sets configuration model (listed in the request example)   User runs method execution   System creates configuration   System returns created configuration (listed in the response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
    ConfigurationPostModel configurationPostModel = new ConfigurationPostModel(); // ConfigurationPostModel | 
    try {
      ConfigurationModel result = apiInstance.createConfiguration(configurationPostModel);
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
| **configurationPostModel** | [**ConfigurationPostModel**](ConfigurationPostModel.md)|  | [optional] |

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
| **201** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for configuration required |  -  |
| **404** | Can&#39;t find project |  -  |
| **409** | Configuration with the same name already exists! |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="getConfigurationById"></a>
# **getConfigurationById**
> ConfigurationModel getConfigurationById(id)

Get configuration by internal or global ID

 Use case   User sets configuration internal (guid format) or global (integer format) identifier   User runs method execution   System search configuration using the identifier   System returns configuration

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
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
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for configuration required |  -  |
| **404** | Can&#39;t find configuration with id |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

