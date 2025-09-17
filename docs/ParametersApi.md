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

> List&lt;ParameterApiResult&gt; apiV2ParametersBulkPost(createParameterApiModel)

Create multiple parameters


Use case

User sets list of parameter model (listed in the request example)

User runs method execution

System creates parameters

System returns list of parameter model (listed in the response example)

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
        List<CreateParameterApiModel> createParameterApiModel = Arrays.asList(); // List<CreateParameterApiModel> | 
        try {
            List<ParameterApiResult> result = apiInstance.apiV2ParametersBulkPost(createParameterApiModel);
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
| **createParameterApiModel** | [**List&lt;CreateParameterApiModel&gt;**](CreateParameterApiModel.md)|  | [optional] |

### Return type

[**List&lt;ParameterApiResult&gt;**](ParameterApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** |   - Parameter model is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2ParametersBulkPut

> apiV2ParametersBulkPut(updateParameterApiModel)

Update multiple parameters


Use case

User sets list of parameter model (listed in the request example)

User runs method execution

System updates parameters

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
        List<UpdateParameterApiModel> updateParameterApiModel = Arrays.asList(); // List<UpdateParameterApiModel> | 
        try {
            apiInstance.apiV2ParametersBulkPut(updateParameterApiModel);
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
| **updateParameterApiModel** | [**List&lt;UpdateParameterApiModel&gt;**](UpdateParameterApiModel.md)|  | [optional] |

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
| **400** |   - Parameter model is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Invalid user permissions |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2ParametersGroupsGet

> List&lt;ParameterGroupApiResult&gt; apiV2ParametersGroupsGet(parameterKeyIds, name, isDeleted, projectIds, skip, take, orderBy, searchField, searchValue)

Get parameters as group


Use case

User runs method execution

System search parameters

System returns parameters models as groups (listed in the response example)

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
        Set<UUID> parameterKeyIds = Arrays.asList(); // Set<UUID> | 
        String name = "name_example"; // String | 
        Boolean isDeleted = true; // Boolean | 
        List<UUID> projectIds = Arrays.asList(); // List<UUID> | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<ParameterGroupApiResult> result = apiInstance.apiV2ParametersGroupsGet(parameterKeyIds, name, isDeleted, projectIds, skip, take, orderBy, searchField, searchValue);
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
| **parameterKeyIds** | **List&lt;UUID&gt;**|  | [optional] |
| **name** | **String**|  | [optional] |
| **isDeleted** | **Boolean**|  | [optional] |
| **projectIds** | **List&lt;UUID&gt;**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;ParameterGroupApiResult&gt;**](ParameterGroupApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
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


## apiV2ParametersKeyNameNameExistsGet

> Boolean apiV2ParametersKeyNameNameExistsGet(name)

Check existence parameter key in system


Use case

User sets name of parameter key

User runs method execution

System search parameter key

System returns the flag for the existence of the parameter key in the system

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2ParametersKeyValuesGet

> List&lt;String&gt; apiV2ParametersKeyValuesGet(key)

Get all parameter key values


Use case

User sets parameter key (string format)

User runs method execution

System search parameter values using the key

System returns parameter

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2ParametersKeysGet

> List&lt;String&gt; apiV2ParametersKeysGet(projectIds, skip, take, orderBy, searchField, searchValue)

Get all parameter keys


Use case

User runs method execution

System search all parameter keys

System returns parameter keys

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
        List<UUID> projectIds = Arrays.asList(); // List<UUID> | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<String> result = apiInstance.apiV2ParametersKeysGet(projectIds, skip, take, orderBy, searchField, searchValue);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectIds** | **List&lt;UUID&gt;**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

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
| **200** | Successful operation |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2ParametersSearchGroupsPost

> List&lt;ParameterGroupApiResult&gt; apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, parameterGroupsFilterApiModel)

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
        ParameterGroupsFilterApiModel parameterGroupsFilterApiModel = new ParameterGroupsFilterApiModel(); // ParameterGroupsFilterApiModel | 
        try {
            List<ParameterGroupApiResult> result = apiInstance.apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, parameterGroupsFilterApiModel);
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
| **parameterGroupsFilterApiModel** | [**ParameterGroupsFilterApiModel**](ParameterGroupsFilterApiModel.md)|  | [optional] |

### Return type

[**List&lt;ParameterGroupApiResult&gt;**](ParameterGroupApiResult.md)

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


## apiV2ParametersSearchPost

> List&lt;ParameterApiResult&gt; apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, parametersFilterApiModel)

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
        ParametersFilterApiModel parametersFilterApiModel = new ParametersFilterApiModel(); // ParametersFilterApiModel | 
        try {
            List<ParameterApiResult> result = apiInstance.apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, parametersFilterApiModel);
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
| **parametersFilterApiModel** | [**ParametersFilterApiModel**](ParametersFilterApiModel.md)|  | [optional] |

### Return type

[**List&lt;ParameterApiResult&gt;**](ParameterApiResult.md)

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


## createParameter

> ParameterApiResult createParameter(createParameterApiModel)

Create parameter


Use case

User sets parameter model (listed in the request example)

User runs method execution

System creates parameter

System returns parameter model

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
        CreateParameterApiModel createParameterApiModel = new CreateParameterApiModel(); // CreateParameterApiModel | 
        try {
            ParameterApiResult result = apiInstance.createParameter(createParameterApiModel);
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
| **createParameterApiModel** | [**CreateParameterApiModel**](CreateParameterApiModel.md)|  | [optional] |

### Return type

[**ParameterApiResult**](ParameterApiResult.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


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
| **400** | Provided name either is empty or contains only white spaces |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Parameter is in use in iterations |  -  |


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
        UUID keyId = UUID.randomUUID(); // UUID | Identifier of the parameter key
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
| **keyId** | **UUID**| Identifier of the parameter key | |

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
| **403** | Invalid user permissions |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Parameter is in use in iterations |  -  |


## deleteParameter

> deleteParameter(id)

Delete parameter


Use case

User sets parameter internal (guid format) identifier

System search and delete parameter

System returns deleted parameter

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
| **200** | OK |  -  |
| **400** |   - ID is not valid    - DTO is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Parameter is in use in iterations |  -  |


## getAllParameters

> List&lt;ParameterApiResult&gt; getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue)

Get all parameters


Use case

[Optional] User sets isDeleted field value

[Optional] If User sets isDeleted field value as true, System search all deleted parameters

[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted

If User did not set isDeleted field value, System search all parameters

System returns array of all found parameters(listed in response model)

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
            List<ParameterApiResult> result = apiInstance.getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue);
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

[**List&lt;ParameterApiResult&gt;**](ParameterApiResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Invalid user permissions |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getParameterById

> ParameterApiResult getParameterById(id)

Get parameter by ID


Use case

User sets parameter internal (guid format) identifier

User runs method execution

System search parameter using the identifier

System returns parameter

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
            ParameterApiResult result = apiInstance.getParameterById(id);
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

[**ParameterApiResult**](ParameterApiResult.md)

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
| **404** | Parameter with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## updateParameter

> updateParameter(updateParameterApiModel)

Update parameter


Use case

User sets parameter updated properties(listed in the request example)

User runs method execution

System updated parameter using updated properties

System returns no content response

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
        UpdateParameterApiModel updateParameterApiModel = new UpdateParameterApiModel(); // UpdateParameterApiModel | 
        try {
            apiInstance.updateParameter(updateParameterApiModel);
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
| **updateParameterApiModel** | [**UpdateParameterApiModel**](UpdateParameterApiModel.md)|  | [optional] |

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
| **400** |   - ID is not valid    - DTO is not valid |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Parameter with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

