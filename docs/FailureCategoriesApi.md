# FailureCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2AutotestsFailureCategoriesGroupingSearchPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesGroupingSearchPost) | **POST** /api/v2/autotests/failure-categories/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2AutotestsFailureCategoriesIdDelete**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesIdDelete) | **DELETE** /api/v2/autotests/failure-categories/{id} | Delete failure category |
| [**apiV2AutotestsFailureCategoriesIdGet**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesIdGet) | **GET** /api/v2/autotests/failure-categories/{id} | Get failure category by ID |
| [**apiV2AutotestsFailureCategoriesNameNameExistsGet**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesNameNameExistsGet) | **GET** /api/v2/autotests/failure-categories/name/{name}/exists | Check failure category with the specified name already exists |
| [**apiV2AutotestsFailureCategoriesPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesPost) | **POST** /api/v2/autotests/failure-categories | Create failure category |
| [**apiV2AutotestsFailureCategoriesPut**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesPut) | **PUT** /api/v2/autotests/failure-categories | Update failure category |
| [**apiV2AutotestsFailureCategoriesSearchPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesSearchPost) | **POST** /api/v2/autotests/failure-categories/search |  |
| [**apiV2AutotestsResultReasonsGroupingSearchPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsGroupingSearchPost) | **POST** /api/v2/autotests/resultReasons/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2AutotestsResultReasonsIdDelete**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsIdDelete) | **DELETE** /api/v2/autotests/resultReasons/{id} | Delete failure category |
| [**apiV2AutotestsResultReasonsIdGet**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsIdGet) | **GET** /api/v2/autotests/resultReasons/{id} | Get failure category by ID |
| [**apiV2AutotestsResultReasonsNameNameExistsGet**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsNameNameExistsGet) | **GET** /api/v2/autotests/resultReasons/name/{name}/exists | Check failure category with the specified name already exists |
| [**apiV2AutotestsResultReasonsPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsPost) | **POST** /api/v2/autotests/resultReasons | Create failure category |
| [**apiV2AutotestsResultReasonsPut**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsPut) | **PUT** /api/v2/autotests/resultReasons | Update failure category |
| [**apiV2AutotestsResultReasonsSearchPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsSearchPost) | **POST** /api/v2/autotests/resultReasons/search |  |



## apiV2AutotestsFailureCategoriesGroupingSearchPost

> FailureCategoryGroupItemApiResultReply apiV2AutotestsFailureCategoriesGroupingSearchPost(failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        FailureCategoryGroupSearchApiModel failureCategoryGroupSearchApiModel = new FailureCategoryGroupSearchApiModel(); // FailureCategoryGroupSearchApiModel | 
        try {
            FailureCategoryGroupItemApiResultReply result = apiInstance.apiV2AutotestsFailureCategoriesGroupingSearchPost(failureCategoryGroupSearchApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesGroupingSearchPost");
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
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryGroupItemApiResultReply**](FailureCategoryGroupItemApiResultReply.md)

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


## apiV2AutotestsFailureCategoriesIdDelete

> apiV2AutotestsFailureCategoriesIdDelete(id)

Delete failure category

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2AutotestsFailureCategoriesIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdDelete");
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
| **id** | **UUID**|  | |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2AutotestsFailureCategoriesIdGet

> FailureCategoryApiResult apiV2AutotestsFailureCategoriesIdGet(id, isDeleted)

Get failure category by ID

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        Boolean isDeleted = true; // Boolean | 
        try {
            FailureCategoryApiResult result = apiInstance.apiV2AutotestsFailureCategoriesIdGet(id, isDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdGet");
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
| **id** | **UUID**|  | |
| **isDeleted** | **Boolean**|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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


## apiV2AutotestsFailureCategoriesNameNameExistsGet

> Boolean apiV2AutotestsFailureCategoriesNameNameExistsGet(name)

Check failure category with the specified name already exists

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            Boolean result = apiInstance.apiV2AutotestsFailureCategoriesNameNameExistsGet(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesNameNameExistsGet");
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


## apiV2AutotestsFailureCategoriesPost

> FailureCategoryApiResult apiV2AutotestsFailureCategoriesPost(createFailureCategoryApiModel)

Create failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        CreateFailureCategoryApiModel createFailureCategoryApiModel = new CreateFailureCategoryApiModel(); // CreateFailureCategoryApiModel | 
        try {
            FailureCategoryApiResult result = apiInstance.apiV2AutotestsFailureCategoriesPost(createFailureCategoryApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPost");
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
| **createFailureCategoryApiModel** | [**CreateFailureCategoryApiModel**](CreateFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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


## apiV2AutotestsFailureCategoriesPut

> apiV2AutotestsFailureCategoriesPut(updateFailureCategoryApiModel)

Update failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UpdateFailureCategoryApiModel updateFailureCategoryApiModel = new UpdateFailureCategoryApiModel(); // UpdateFailureCategoryApiModel | 
        try {
            apiInstance.apiV2AutotestsFailureCategoriesPut(updateFailureCategoryApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPut");
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
| **updateFailureCategoryApiModel** | [**UpdateFailureCategoryApiModel**](UpdateFailureCategoryApiModel.md)|  | [optional] |

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


## apiV2AutotestsFailureCategoriesSearchPost

> List&lt;AutotestResultReasonShortGetModel&gt; apiV2AutotestsFailureCategoriesSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        AutotestResultReasonFilterModel autotestResultReasonFilterModel = new AutotestResultReasonFilterModel(); // AutotestResultReasonFilterModel | 
        try {
            List<AutotestResultReasonShortGetModel> result = apiInstance.apiV2AutotestsFailureCategoriesSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesSearchPost");
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
| **autotestResultReasonFilterModel** | [**AutotestResultReasonFilterModel**](AutotestResultReasonFilterModel.md)|  | [optional] |

### Return type

[**List&lt;AutotestResultReasonShortGetModel&gt;**](AutotestResultReasonShortGetModel.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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


## apiV2AutotestsResultReasonsGroupingSearchPost

> FailureCategoryGroupItemApiResultReply apiV2AutotestsResultReasonsGroupingSearchPost(failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        FailureCategoryGroupSearchApiModel failureCategoryGroupSearchApiModel = new FailureCategoryGroupSearchApiModel(); // FailureCategoryGroupSearchApiModel | 
        try {
            FailureCategoryGroupItemApiResultReply result = apiInstance.apiV2AutotestsResultReasonsGroupingSearchPost(failureCategoryGroupSearchApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsGroupingSearchPost");
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
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryGroupItemApiResultReply**](FailureCategoryGroupItemApiResultReply.md)

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


## apiV2AutotestsResultReasonsIdDelete

> apiV2AutotestsResultReasonsIdDelete(id)

Delete failure category

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2AutotestsResultReasonsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdDelete");
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
| **id** | **UUID**|  | |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## apiV2AutotestsResultReasonsIdGet

> FailureCategoryApiResult apiV2AutotestsResultReasonsIdGet(id, isDeleted)

Get failure category by ID

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        Boolean isDeleted = true; // Boolean | 
        try {
            FailureCategoryApiResult result = apiInstance.apiV2AutotestsResultReasonsIdGet(id, isDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdGet");
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
| **id** | **UUID**|  | |
| **isDeleted** | **Boolean**|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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


## apiV2AutotestsResultReasonsNameNameExistsGet

> Boolean apiV2AutotestsResultReasonsNameNameExistsGet(name)

Check failure category with the specified name already exists

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        String name = "name_example"; // String | 
        try {
            Boolean result = apiInstance.apiV2AutotestsResultReasonsNameNameExistsGet(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsNameNameExistsGet");
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


## apiV2AutotestsResultReasonsPost

> FailureCategoryApiResult apiV2AutotestsResultReasonsPost(createFailureCategoryApiModel)

Create failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        CreateFailureCategoryApiModel createFailureCategoryApiModel = new CreateFailureCategoryApiModel(); // CreateFailureCategoryApiModel | 
        try {
            FailureCategoryApiResult result = apiInstance.apiV2AutotestsResultReasonsPost(createFailureCategoryApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsPost");
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
| **createFailureCategoryApiModel** | [**CreateFailureCategoryApiModel**](CreateFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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


## apiV2AutotestsResultReasonsPut

> apiV2AutotestsResultReasonsPut(updateFailureCategoryApiModel)

Update failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        UpdateFailureCategoryApiModel updateFailureCategoryApiModel = new UpdateFailureCategoryApiModel(); // UpdateFailureCategoryApiModel | 
        try {
            apiInstance.apiV2AutotestsResultReasonsPut(updateFailureCategoryApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsPut");
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
| **updateFailureCategoryApiModel** | [**UpdateFailureCategoryApiModel**](UpdateFailureCategoryApiModel.md)|  | [optional] |

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


## apiV2AutotestsResultReasonsSearchPost

> List&lt;AutotestResultReasonShortGetModel&gt; apiV2AutotestsResultReasonsSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.FailureCategoriesApi;

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

        FailureCategoriesApi apiInstance = new FailureCategoriesApi(defaultClient);
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        AutotestResultReasonFilterModel autotestResultReasonFilterModel = new AutotestResultReasonFilterModel(); // AutotestResultReasonFilterModel | 
        try {
            List<AutotestResultReasonShortGetModel> result = apiInstance.apiV2AutotestsResultReasonsSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FailureCategoriesApi#apiV2AutotestsResultReasonsSearchPost");
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
| **autotestResultReasonFilterModel** | [**AutotestResultReasonFilterModel**](AutotestResultReasonFilterModel.md)|  | [optional] |

### Return type

[**List&lt;AutotestResultReasonShortGetModel&gt;**](AutotestResultReasonShortGetModel.md)

### Authorization

[PrivateToken](../README.md#PrivateToken), [Cookies](../README.md#Cookies)

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

