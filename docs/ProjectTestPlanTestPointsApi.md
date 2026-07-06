# ProjectTestPlanTestPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/analytics | Get test points analytics. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/rerun | Rerun autotests. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/run | Run autotests. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/grouping-search | Search test points in test plan. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/testers | Distribute test points between the users. |



## apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost

> TestPlanTestPointsAnalyticsApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost(projectId, testPlanId, testPlanTestPointsAnalyticsApiModel)

Get test points analytics.

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectTestPlanTestPointsApi;

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

        ProjectTestPlanTestPointsApi apiInstance = new ProjectTestPlanTestPointsApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID testPlanId = UUID.randomUUID(); // UUID | 
        TestPlanTestPointsAnalyticsApiModel testPlanTestPointsAnalyticsApiModel = new TestPlanTestPointsAnalyticsApiModel(); // TestPlanTestPointsAnalyticsApiModel | 
        try {
            TestPlanTestPointsAnalyticsApiResult result = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost(projectId, testPlanId, testPlanTestPointsAnalyticsApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost");
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
| **testPlanId** | **UUID**|  | |
| **testPlanTestPointsAnalyticsApiModel** | [**TestPlanTestPointsAnalyticsApiModel**](TestPlanTestPointsAnalyticsApiModel.md)|  | [optional] |

### Return type

[**TestPlanTestPointsAnalyticsApiResult**](TestPlanTestPointsAnalyticsApiResult.md)

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


## apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost

> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRerunApiModel)

Rerun autotests.

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectTestPlanTestPointsApi;

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

        ProjectTestPlanTestPointsApi apiInstance = new ProjectTestPlanTestPointsApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID testPlanId = UUID.randomUUID(); // UUID | 
        TestPlanTestPointsAutoTestsRerunApiModel testPlanTestPointsAutoTestsRerunApiModel = new TestPlanTestPointsAutoTestsRerunApiModel(); // TestPlanTestPointsAutoTestsRerunApiModel | 
        try {
            apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRerunApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost");
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
| **testPlanId** | **UUID**|  | |
| **testPlanTestPointsAutoTestsRerunApiModel** | [**TestPlanTestPointsAutoTestsRerunApiModel**](TestPlanTestPointsAutoTestsRerunApiModel.md)|  | [optional] |

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


## apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost

> TestRunNameApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRunApiModel)

Run autotests.

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectTestPlanTestPointsApi;

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

        ProjectTestPlanTestPointsApi apiInstance = new ProjectTestPlanTestPointsApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID testPlanId = UUID.randomUUID(); // UUID | 
        TestPlanTestPointsAutoTestsRunApiModel testPlanTestPointsAutoTestsRunApiModel = new TestPlanTestPointsAutoTestsRunApiModel(); // TestPlanTestPointsAutoTestsRunApiModel | 
        try {
            TestRunNameApiResult result = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRunApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost");
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
| **testPlanId** | **UUID**|  | |
| **testPlanTestPointsAutoTestsRunApiModel** | [**TestPlanTestPointsAutoTestsRunApiModel**](TestPlanTestPointsAutoTestsRunApiModel.md)|  | [optional] |

### Return type

[**TestRunNameApiResult**](TestRunNameApiResult.md)

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


## apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost

> TestPlanTestPointsGroupSearchApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost(projectId, testPlanId, testPlanTestPointsApiModel)

Search test points in test plan.

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectTestPlanTestPointsApi;

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

        ProjectTestPlanTestPointsApi apiInstance = new ProjectTestPlanTestPointsApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID testPlanId = UUID.randomUUID(); // UUID | 
        TestPlanTestPointsApiModel testPlanTestPointsApiModel = new TestPlanTestPointsApiModel(); // TestPlanTestPointsApiModel | 
        try {
            TestPlanTestPointsGroupSearchApiResult result = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost(projectId, testPlanId, testPlanTestPointsApiModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost");
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
| **testPlanId** | **UUID**|  | |
| **testPlanTestPointsApiModel** | [**TestPlanTestPointsApiModel**](TestPlanTestPointsApiModel.md)|  | [optional] |

### Return type

[**TestPlanTestPointsGroupSearchApiResult**](TestPlanTestPointsGroupSearchApiResult.md)

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


## apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost

> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost(projectId, testPlanId, testPlanTestPointsSetTestersApiModel)

Distribute test points between the users.

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.ProjectTestPlanTestPointsApi;

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

        ProjectTestPlanTestPointsApi apiInstance = new ProjectTestPlanTestPointsApi(defaultClient);
        String projectId = "projectId_example"; // String | Internal (UUID) or global (integer) identifier
        UUID testPlanId = UUID.randomUUID(); // UUID | 
        TestPlanTestPointsSetTestersApiModel testPlanTestPointsSetTestersApiModel = new TestPlanTestPointsSetTestersApiModel(); // TestPlanTestPointsSetTestersApiModel | 
        try {
            apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost(projectId, testPlanId, testPlanTestPointsSetTestersApiModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost");
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
| **testPlanId** | **UUID**|  | |
| **testPlanTestPointsSetTestersApiModel** | [**TestPlanTestPointsSetTestersApiModel**](TestPlanTestPointsSetTestersApiModel.md)|  | [optional] |

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

