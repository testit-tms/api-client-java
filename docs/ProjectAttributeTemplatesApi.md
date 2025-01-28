# ProjectAttributeTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ProjectsProjectIdAttributesTemplatesSearchPost**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesSearchPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/search | Search for custom attributes templates |
| [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete) | **DELETE** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Delete CustomAttributeTemplate from Project |
| [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Add CustomAttributeTemplate to Project |


<a id="apiV2ProjectsProjectIdAttributesTemplatesSearchPost"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesSearchPost**
> List&lt;ProjectCustomAttributeTemplateGetModel&gt; apiV2ProjectsProjectIdAttributesTemplatesSearchPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest)

Search for custom attributes templates

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributeTemplatesApi apiInstance = new ProjectAttributeTemplatesApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest = new ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest(); // ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest | 
    try {
      List<ProjectCustomAttributeTemplateGetModel> result = apiInstance.apiV2ProjectsProjectIdAttributesTemplatesSearchPost(projectId, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesSearchPost");
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
| **projectId** | **String**|  | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **apiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest** | [**ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest**](ApiV2ProjectsProjectIdAttributesTemplatesSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;ProjectCustomAttributeTemplateGetModel&gt;**](ProjectCustomAttributeTemplateGetModel.md)

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
| **403** | Project admin permission for project settings is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete**
> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(projectId, templateId)

Delete CustomAttributeTemplate from Project

 Use case   User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution   System delete attribute template from project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributeTemplatesApi apiInstance = new ProjectAttributeTemplatesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    UUID templateId = UUID.randomUUID(); // UUID | CustomAttributeTemplate internal (UUID) identifier
    try {
      apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(projectId, templateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete");
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
| **projectId** | **String**| Project internal (UUID) or global (integer) identifier | |
| **templateId** | **UUID**| CustomAttributeTemplate internal (UUID) identifier | |

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
| **403** | Update project settings permission for project required |  -  |
| **404** | Can&#39;t find a Project with identifier |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost**
> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(projectId, templateId)

Add CustomAttributeTemplate to Project

 Use case   User sets project internal or global identifier    User sets attribute template internal identifier    User runs method execution   System add attribute template to project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributeTemplatesApi apiInstance = new ProjectAttributeTemplatesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    UUID templateId = UUID.randomUUID(); // UUID | CustomAttributeTemplate internal (UUID) identifier
    try {
      apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(projectId, templateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost");
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
| **projectId** | **String**| Project internal (UUID) or global (integer) identifier | |
| **templateId** | **UUID**| CustomAttributeTemplate internal (UUID) identifier | |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update project settings permission for project required |  -  |
| **404** | Can&#39;t find a Project with identifier |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

