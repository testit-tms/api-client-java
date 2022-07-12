# ConfigurationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfiguration**](ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration
[**getConfigurationById**](ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{configurationId} | Get Configuration by Id or GlobalId
[**updateConfiguration**](ConfigurationsApi.md#updateConfiguration) | **PUT** /api/v2/configurations | Update Configuration

<a name="createConfiguration"></a>
# **createConfiguration**
> ConfigurationModel createConfiguration(body)

Create Configuration

&lt;br&gt;Use case  &lt;br&gt;User sets configuration model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates configuration  &lt;br&gt;System returns created configuration (listed in the response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ConfigurationsApi apiInstance = new ConfigurationsApi();
ConfigurationPostModel body = new ConfigurationPostModel(); // ConfigurationPostModel | 
try {
    ConfigurationModel result = apiInstance.createConfiguration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationPostModel**](ConfigurationPostModel.md)|  | [optional]

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="getConfigurationById"></a>
# **getConfigurationById**
> ConfigurationModel getConfigurationById(configurationId)

Get Configuration by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets configuration internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search configuration using the identifier  &lt;br&gt;System returns configuration

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ConfigurationsApi apiInstance = new ConfigurationsApi();
String configurationId = "configurationId_example"; // String | Configuration internal (guid format) or global (integer format) identifier
try {
    ConfigurationModel result = apiInstance.getConfigurationById(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getConfigurationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationId** | **String**| Configuration internal (guid format) or global (integer format) identifier |

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConfiguration"></a>
# **updateConfiguration**
> updateConfiguration(body)

Update Configuration

&lt;br&gt;Use case  &lt;br&gt;User sets configuration updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated configuration using updated properties  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ConfigurationsApi apiInstance = new ConfigurationsApi();
ConfigurationPutModel body = new ConfigurationPutModel(); // ConfigurationPutModel | 
try {
    apiInstance.updateConfiguration(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationPutModel**](ConfigurationPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

