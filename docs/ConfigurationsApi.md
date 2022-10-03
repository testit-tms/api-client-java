# ConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ConfigurationsCreateByParametersPost**](ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create Configurations by parameters |
| [**apiV2ConfigurationsSearchPost**](ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations |
| [**createConfiguration**](ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration |
| [**getConfigurationById**](ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID |
| [**updateConfiguration**](ConfigurationsApi.md#updateConfiguration) | **PUT** /api/v2/configurations | Update Configuration |



## apiV2ConfigurationsCreateByParametersPost

> List&lt;UUID&gt; apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel)

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
| **200** | Successful operation |  -  |
| **404** | &lt;br&gt;Project by identifier not found  &lt;br&gt;Parameters by identifies not found |  -  |
| **400** | &lt;br&gt;Project identifier is empty  &lt;br&gt;List of parameters identifiers is empty |  -  |


## apiV2ConfigurationsSearchPost

> List&lt;ConfigurationModel&gt; apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationSelectModel)

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


## createConfiguration

> ConfigurationModel createConfiguration(configurationPostModel)

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
| **409** | Configuration with the same name already exists! |  -  |
| **400** | &lt;br&gt;Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty |  -  |
| **201** | Successful operation |  -  |
| **404** | Can&#39;t find project |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for configuration required |  -  |


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
| **403** | Read permission for configuration required |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Can&#39;t find configuration with id |  -  |


## updateConfiguration

> updateConfiguration(configurationPutModel)

Update Configuration

<br>Use case
<br>User sets configuration updated properties(listed in the request example)
<br>User runs method execution
<br>System updated configuration using updated properties
<br>System returns no content response

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
| **404** | Can&#39;t find a Configuration with id |  -  |
| **204** | Successful operation |  -  |
| **403** |  |  -  |
| **422** | Can&#39;t change projectId |  -  |
| **409** | Configuration with the same name already exists! |  -  |
| **401** | Unauthorized |  -  |
| **400** | &lt;br&gt;- Capabilities are invalid  &lt;br&gt;- Capability keys must be unique  &lt;br&gt;- Capability keys must not be empty  &lt;br&gt;- Capability values must not be empty |  -  |

