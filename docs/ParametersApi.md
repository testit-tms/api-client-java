# ParametersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createParameter**](ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter
[**deleteByName**](ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name
[**deleteParameter**](ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{parameterId} | Delete parameter by id
[**getAllParameters**](ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters (if isDeleted is true, return deleted parameters)
[**getParameterById**](ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{parameterId} | Get parameter by id
[**obsoleteDeleteByName**](ParametersApi.md#obsoleteDeleteByName) | **POST** /api/v2/parameters/deleteByName | Delete parameters by name
[**updateParameter**](ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter

<a name="createParameter"></a>
# **createParameter**
> ParameterModel createParameter(body)

Create parameter

&lt;br&gt;Use case  &lt;br&gt;User sets parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameter  &lt;br&gt;System returns parameter model

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
ParameterPostModel body = new ParameterPostModel(); // ParameterPostModel | 
try {
    ParameterModel result = apiInstance.createParameter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#createParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterPostModel**](ParameterPostModel.md)|  | [optional]

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteByName"></a>
# **deleteByName**
> deleteByName(name)

Delete parameter by name

Deletes parameter and all it&#x27;s values

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
String name = "name_example"; // String | Name of the parameter
try {
    apiInstance.deleteByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#deleteByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the parameter |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteParameter"></a>
# **deleteParameter**
> ParameterModel deleteParameter(parameterId)

Delete parameter by id

&lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;System search and delete parameter  &lt;br&gt;System returns deleted parameter

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
UUID parameterId = new UUID(); // UUID | Parameter internal(guid format) identifier
try {
    ParameterModel result = apiInstance.deleteParameter(parameterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#deleteParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameterId** | [**UUID**](.md)| Parameter internal(guid format) identifier |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllParameters"></a>
# **getAllParameters**
> List&lt;ParameterModel&gt; getAllParameters(isDeleted, , , , , )

Get all parameters (if isDeleted is true, return deleted parameters)

&lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted parameters  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all parameters  &lt;br&gt;System returns array of all found parameters(listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
Boolean isDeleted = true; // Boolean | Boolean flag which defines if search must include deleted parameters
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<ParameterModel> result = apiInstance.getAllParameters(isDeleted, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#getAllParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted parameters | [optional]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterById"></a>
# **getParameterById**
> ParameterModel getParameterById(parameterId)

Get parameter by id

&lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter using the identifier  &lt;br&gt;System returns parameter

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
UUID parameterId = new UUID(); // UUID | Parameter internal (guid format) identifier
try {
    ParameterModel result = apiInstance.getParameterById(parameterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#getParameterById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameterId** | [**UUID**](.md)| Parameter internal (guid format) identifier |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obsoleteDeleteByName"></a>
# **obsoleteDeleteByName**
> obsoleteDeleteByName(name)

Delete parameters by name

&lt;br&gt;Use case  &lt;br&gt;User sets parameter name (string format)  &lt;br&gt;System search and delete parameter  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
String name = "name_example"; // String | Parameter name(string format)
try {
    apiInstance.obsoleteDeleteByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#obsoleteDeleteByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Parameter name(string format) | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateParameter"></a>
# **updateParameter**
> updateParameter(body)

Update parameter

&lt;br&gt;Use case  &lt;br&gt;User sets parameter updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated parameter using updated properties  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ParametersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ParametersApi apiInstance = new ParametersApi();
ParameterPutModel body = new ParameterPutModel(); // ParameterPutModel | 
try {
    apiInstance.updateParameter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ParametersApi#updateParameter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterPutModel**](ParameterPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

