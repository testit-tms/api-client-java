# ParametersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ParametersBulkPost**](ParametersApi.md#apiV2ParametersBulkPost) | **POST** /api/v2/parameters/bulk | Create multiple parameters |
| [**apiV2ParametersBulkPut**](ParametersApi.md#apiV2ParametersBulkPut) | **PUT** /api/v2/parameters/bulk | Update multiple parameters |
| [**apiV2ParametersGroupsGet**](ParametersApi.md#apiV2ParametersGroupsGet) | **GET** /api/v2/parameters/groups | Get parameters as group |
| [**apiV2ParametersKeyNameNameExistsGet**](ParametersApi.md#apiV2ParametersKeyNameNameExistsGet) | **GET** /api/v2/parameters/key/name/{name}/exists | Check existence parameter key in system |
| [**apiV2ParametersKeyValuesGet**](ParametersApi.md#apiV2ParametersKeyValuesGet) | **GET** /api/v2/parameters/{key}/values | Get all parameter key values |
| [**apiV2ParametersKeysGet**](ParametersApi.md#apiV2ParametersKeysGet) | **GET** /api/v2/parameters/keys | Get all parameter keys |
| [**apiV2ParametersSearchGroupsPost**](ParametersApi.md#apiV2ParametersSearchGroupsPost) | **POST** /api/v2/parameters/search/groups | Search for parameters as group |
| [**apiV2ParametersSearchPost**](ParametersApi.md#apiV2ParametersSearchPost) | **POST** /api/v2/parameters/search | Search for parameters |
| [**createParameter**](ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter |
| [**deleteByName**](ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name |
| [**deleteByParameterKeyId**](ParametersApi.md#deleteByParameterKeyId) | **DELETE** /api/v2/parameters/keyId/{keyId} | Delete parameters by parameter key identifier |
| [**deleteParameter**](ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{id} | Delete parameter |
| [**getAllParameters**](ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters |
| [**getParameterById**](ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{id} | Get parameter by ID |
| [**updateParameter**](ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter |



## apiV2ParametersBulkPost

> List&lt;ParameterModel&gt; apiV2ParametersBulkPost(parameterPostModel)

Create multiple parameters

<br>Use case
<br>User sets list of parameter model (listed in the request example)
<br>User runs method execution
<br>System creates parameters
<br>System returns list of parameter model (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        List<ParameterPostModel> parameterPostModel = Arrays.asList(); // List<ParameterPostModel> | 
        try {
            List<ParameterModel> result = apiInstance.apiV2ParametersBulkPost(parameterPostModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersBulkPost");
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
| **parameterPostModel** | [**List&lt;ParameterPostModel&gt;**](ParameterPostModel.md)|  | [optional] |

### Return type

[**List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | &lt;br&gt;- Parameter model is not valid |  -  |
| **201** | Created |  -  |


## apiV2ParametersBulkPut

> apiV2ParametersBulkPut(parameterPutModel)

Update multiple parameters

<br>Use case
<br>User sets list of parameter model (listed in the request example)
<br>User runs method execution
<br>System updates parameters

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        List<ParameterPutModel> parameterPutModel = Arrays.asList(); // List<ParameterPutModel> | 
        try {
            apiInstance.apiV2ParametersBulkPut(parameterPutModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersBulkPut");
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
| **parameterPutModel** | [**List&lt;ParameterPutModel&gt;**](ParameterPutModel.md)|  | [optional] |

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
| **422** | Client Error |  -  |
| **204** | No Content |  -  |
| **403** | Invalid user permissions |  -  |
| **400** | &lt;br&gt;- Parameter model is not valid |  -  |


## apiV2ParametersGroupsGet

> List&lt;ParameterGroupModel&gt; apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue)

Get parameters as group

<br>Use case
<br>User runs method execution
<br>System search parameters
<br>System returns parameters models as groups (listed in the response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        Boolean isDeleted = true; // Boolean | 
        Set<UUID> parameterKeyIds = Arrays.asList(); // Set<UUID> | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<ParameterGroupModel> result = apiInstance.apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersGroupsGet");
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
| **isDeleted** | **Boolean**|  | [optional] |
| **parameterKeyIds** | **List&lt;UUID&gt;**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;ParameterGroupModel&gt;**](ParameterGroupModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **401** | Unauthorized |  -  |


## apiV2ParametersKeyNameNameExistsGet

> Boolean apiV2ParametersKeyNameNameExistsGet(name)

Check existence parameter key in system

<br>Use case
<br>User sets name of parameter key
<br>User runs method execution
<br>System search parameter key
<br>System returns the flag for the existence of the parameter key in the system

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            Boolean result = apiInstance.apiV2ParametersKeyNameNameExistsGet(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersKeyNameNameExistsGet");
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
| **name** | **String**|  | |

### Return type

**Boolean**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **200** | Success |  -  |


## apiV2ParametersKeyValuesGet

> List&lt;String&gt; apiV2ParametersKeyValuesGet(key)

Get all parameter key values

<br>Use case
<br>User sets parameter key (string format)
<br>User runs method execution
<br>System search parameter values using the key
<br>System returns parameter

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        String key = "SomeKey"; // String | Parameter key (string format)
        try {
            List<String> result = apiInstance.apiV2ParametersKeyValuesGet(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersKeyValuesGet");
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
| **key** | **String**| Parameter key (string format) | |

### Return type

**List&lt;String&gt;**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## apiV2ParametersKeysGet

> List&lt;String&gt; apiV2ParametersKeysGet()

Get all parameter keys

<br>Use case
<br>User runs method execution
<br>System search all parameter keys
<br>System returns parameter keys

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        try {
            List<String> result = apiInstance.apiV2ParametersKeysGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersKeysGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## apiV2ParametersSearchGroupsPost

> List&lt;ParameterGroupModel&gt; apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest)

Search for parameters as group

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        ApiV2ParametersSearchPostRequest apiV2ParametersSearchPostRequest = new ApiV2ParametersSearchPostRequest(); // ApiV2ParametersSearchPostRequest | 
        try {
            List<ParameterGroupModel> result = apiInstance.apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersSearchGroupsPost");
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
| **apiV2ParametersSearchPostRequest** | [**ApiV2ParametersSearchPostRequest**](ApiV2ParametersSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;ParameterGroupModel&gt;**](ParameterGroupModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## apiV2ParametersSearchPost

> List&lt;ParameterModel&gt; apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest)

Search for parameters

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        ApiV2ParametersSearchPostRequest apiV2ParametersSearchPostRequest = new ApiV2ParametersSearchPostRequest(); // ApiV2ParametersSearchPostRequest | 
        try {
            List<ParameterModel> result = apiInstance.apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#apiV2ParametersSearchPost");
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
| **apiV2ParametersSearchPostRequest** | [**ApiV2ParametersSearchPostRequest**](ApiV2ParametersSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## createParameter

> ParameterModel createParameter(createParameterRequest)

Create parameter

<br>Use case
<br>User sets parameter model (listed in the request example)
<br>User runs method execution
<br>System creates parameter
<br>System returns parameter model

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        CreateParameterRequest createParameterRequest = new CreateParameterRequest(); // CreateParameterRequest | 
        try {
            ParameterModel result = apiInstance.createParameter(createParameterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#createParameter");
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
| **createParameterRequest** | [**CreateParameterRequest**](CreateParameterRequest.md)|  | [optional] |

### Return type

[**ParameterModel**](ParameterModel.md)

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


## deleteByName

> deleteByName(name)

Delete parameter by name

Deletes parameter and all it's values

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        String name = "name_example"; // String | Name of the parameter
        try {
            apiInstance.deleteByName(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#deleteByName");
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
| **name** | **String**| Name of the parameter | |

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
| **422** | Parameter is in use in iterations |  -  |
| **400** | Provided name either is empty or contains only white spaces |  -  |


## deleteByParameterKeyId

> deleteByParameterKeyId(keyId)

Delete parameters by parameter key identifier

Deletes parameter and all it's values by parameter key identifier

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        UUID keyId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.deleteByParameterKeyId(keyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#deleteByParameterKeyId");
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
| **keyId** | **UUID**|  | |

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
| **403** | Invalid user permissions |  -  |
| **422** | Parameter is in use in iterations |  -  |
| **204** | No Content |  -  |


## deleteParameter

> deleteParameter(id)

Delete parameter

<br>Use case
<br>User sets parameter internal (guid format) identifier
<br>System search and delete parameter
<br>System returns deleted parameter

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Parameter internal (UUID) identifier
        try {
            apiInstance.deleteParameter(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#deleteParameter");
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
| **id** | **UUID**| Parameter internal (UUID) identifier | |

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
| **422** | Parameter is in use in iterations |  -  |
| **200** | Success |  -  |
| **400** | &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid |  -  |


## getAllParameters

> ParameterModel getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue)

Get all parameters

<br>Use case
<br>[Optional] User sets isDeleted field value
<br>[Optional] If User sets isDeleted field value as true, System search all deleted parameters
<br>[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted
<br>If User did not set isDeleted field value, System search all parameters
<br>System returns array of all found parameters(listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        Boolean isDeleted = true; // Boolean | If result must consist of only actual/deleted parameters
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            ParameterModel result = apiInstance.getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#getAllParameters");
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
| **isDeleted** | **Boolean**| If result must consist of only actual/deleted parameters | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Invalid user permissions |  -  |


## getParameterById

> ParameterModel getParameterById(id)

Get parameter by ID

<br>Use case
<br>User sets parameter internal (guid format) identifier
<br>User runs method execution
<br>System search parameter using the identifier
<br>System returns parameter

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Parameter internal (UUID) identifier
        try {
            ParameterModel result = apiInstance.getParameterById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#getParameterById");
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
| **id** | **UUID**| Parameter internal (UUID) identifier | |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Parameter with provided ID was not found |  -  |


## updateParameter

> updateParameter(updateParameterRequest)

Update parameter

<br>Use case
<br>User sets parameter updated properties(listed in the request example)
<br>User runs method execution
<br>System updated parameter using updated properties
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ParametersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        ParametersApi apiInstance = new ParametersApi(defaultClient);
        UpdateParameterRequest updateParameterRequest = new UpdateParameterRequest(); // UpdateParameterRequest | 
        try {
            apiInstance.updateParameter(updateParameterRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ParametersApi#updateParameter");
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
| **updateParameterRequest** | [**UpdateParameterRequest**](UpdateParameterRequest.md)|  | [optional] |

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
| **400** | &lt;br&gt;- ID is not valid  &lt;br&gt;- DTO is not valid |  -  |
| **404** | Parameter with provided ID was not found |  -  |

