# ProjectFailureCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost) | **POST** /api/v2/projects/{projectId}/autotests/failure-categories/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete) | **DELETE** /api/v2/projects/{projectId}/autotests/failure-categories/{id} | Delete failure category |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet) | **GET** /api/v2/projects/{projectId}/autotests/failure-categories/{id} | Get failure category by ID |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesPost**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesPost) | **POST** /api/v2/projects/{projectId}/autotests/failure-categories | Create failure category |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesPut**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesPut) | **PUT** /api/v2/projects/{projectId}/autotests/failure-categories | Update failure category |



## apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost

> ProjectFailureCategoryGroupItemApiResultReply apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost(projectId, failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectFailureCategoriesApi;

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

        ProjectFailureCategoriesApi apiInstance = new ProjectFailureCategoriesApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        FailureCategoryGroupSearchApiModel failureCategoryGroupSearchApiModel = new FailureCategoryGroupSearchApiModel(); // FailureCategoryGroupSearchApiModel | 
        try {
            ProjectFailureCategoryGroupItemApiResultReply result = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost(projectId, failureCategoryGroupSearchApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost");
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
| **projectId** | **String**| Internal (UUID) or global (integer) identifier | |
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**ProjectFailureCategoryGroupItemApiResultReply**](ProjectFailureCategoryGroupItemApiResultReply.md)

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


## apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete

> apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete(projectId, id)

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
import ru.testit.client.api.ProjectFailureCategoriesApi;

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

        ProjectFailureCategoriesApi apiInstance = new ProjectFailureCategoriesApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete(projectId, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete");
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
| **projectId** | **String**| Internal (UUID) or global (integer) identifier | |
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


## apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet

> ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet(projectId, id)

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
import ru.testit.client.api.ProjectFailureCategoriesApi;

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

        ProjectFailureCategoriesApi apiInstance = new ProjectFailureCategoriesApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ProjectDetailedFailureCategoryApiResult result = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet(projectId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet");
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
| **projectId** | **String**| Internal (UUID) or global (integer) identifier | |
| **id** | **UUID**|  | |

### Return type

[**ProjectDetailedFailureCategoryApiResult**](ProjectDetailedFailureCategoryApiResult.md)

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


## apiV2ProjectsProjectIdAutotestsFailureCategoriesPost

> ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesPost(projectId, createProjectFailureCategoryApiModel)

Create failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectFailureCategoriesApi;

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

        ProjectFailureCategoriesApi apiInstance = new ProjectFailureCategoriesApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        CreateProjectFailureCategoryApiModel createProjectFailureCategoryApiModel = new CreateProjectFailureCategoryApiModel(); // CreateProjectFailureCategoryApiModel | 
        try {
            ProjectDetailedFailureCategoryApiResult result = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesPost(projectId, createProjectFailureCategoryApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPost");
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
| **projectId** | **String**| Internal (UUID) or global (integer) identifier | |
| **createProjectFailureCategoryApiModel** | [**CreateProjectFailureCategoryApiModel**](CreateProjectFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**ProjectDetailedFailureCategoryApiResult**](ProjectDetailedFailureCategoryApiResult.md)

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


## apiV2ProjectsProjectIdAutotestsFailureCategoriesPut

> apiV2ProjectsProjectIdAutotestsFailureCategoriesPut(projectId, updateFailureCategoryProjectApiModel)

Update failure category

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectFailureCategoriesApi;

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

        ProjectFailureCategoriesApi apiInstance = new ProjectFailureCategoriesApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UpdateFailureCategoryProjectApiModel updateFailureCategoryProjectApiModel = new UpdateFailureCategoryProjectApiModel(); // UpdateFailureCategoryProjectApiModel | 
        try {
            apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesPut(projectId, updateFailureCategoryProjectApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPut");
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
| **projectId** | **String**| Internal (UUID) or global (integer) identifier | |
| **updateFailureCategoryProjectApiModel** | [**UpdateFailureCategoryProjectApiModel**](UpdateFailureCategoryProjectApiModel.md)|  | [optional] |

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

