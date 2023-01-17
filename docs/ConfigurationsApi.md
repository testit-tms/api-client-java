# ConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ConfigurationsCreateByParametersPost**](ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create Configurations by parameters |
| [**apiV2ConfigurationsSearchPost**](ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations |
| [**createConfiguration**](ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration |
| [**getConfigurationById**](ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID |
| [**updateConfiguration**](ConfigurationsApi.md#updateConfiguration) | **PUT** /api/v2/configurations | Update Configuration |


<a name="apiV2ConfigurationsCreateByParametersPost"></a>
# **apiV2ConfigurationsCreateByParametersPost**
> apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel)

Create Configurations by parameters

&lt;br&gt;Use case  &lt;br&gt;User sets request model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configurations  &lt;br&gt;System returns created configuration ids (listed in the response example)

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
      apiInstance.apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel);
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

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found |  -  |
| **400** | &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty |  -  |
| **201** | Success |  -  |
| **200** | Successful operation |  -  |

<a name="apiV2ConfigurationsSearchPost"></a>
# **apiV2ConfigurationsSearchPost**
> List&lt;ConfigurationModel&gt; apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationSelectModel)

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
    ConfigurationSelectModel configurationSelectModel = new ConfigurationSelectModel(); // ConfigurationSelectModel | Model containing all the filters
    try {
      List<ConfigurationModel> result = apiInstance.apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationSelectModel);
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
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)| Model containing all the filters | [optional] |

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

<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationModel createConfiguration(configurationPostModel)

Create Configuration

&lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)

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
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |
| **201** | Successful operation |  -  |
| **403** | Update permission for configuration required |  -  |
| **404** | Can&#39;t find project |  -  |
| **409** | Configuration with the same name already exists! |  -  |

<a name="getConfigurationById"></a>
# **getConfigurationById**
> ConfigurationModel getConfigurationById(id)

Get configuration by internal or global ID

&lt;br&gt;Use case  &lt;br&gt;User sets configuration internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search configuration using the identifier  &lt;br&gt;System returns configuration

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
    String id = "id_example"; // String | 
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
| **id** | **String**|  | |

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
| **404** | Can&#39;t find configuration with id |  -  |
| **403** | Read permission for configuration required |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> updateConfiguration(configurationPutModel)

Update Configuration

&lt;br&gt;Use case  &lt;br&gt;User sets configuration updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated configuration using updated properties  &lt;br&gt;System returns no content response

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
      apiInstance.updateConfiguration(configurationPutModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationsApi#updateConfiguration");
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
| **403** |  |  -  |
| **404** | Can&#39;t find a Configuration with id |  -  |
| **422** | Can&#39;t change projectId |  -  |
| **409** | Configuration with the same name already exists! |  -  |
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **400** | Bad Request |  -  |

