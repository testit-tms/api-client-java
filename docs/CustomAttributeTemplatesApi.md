# CustomAttributeTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/exclude | Exclude CustomAttributes from CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/include | Include CustomAttributes to CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdDelete**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdDelete) | **DELETE** /api/v2/customAttributes/templates/{id} | Delete CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdGet**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdGet) | **GET** /api/v2/customAttributes/templates/{id} | Get CustomAttributeTemplate by ID |
| [**apiV2CustomAttributesTemplatesNameGet**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesNameGet) | **GET** /api/v2/customAttributes/templates/{name} | Get CustomAttributeTemplate by name |
| [**apiV2CustomAttributesTemplatesPost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPost) | **POST** /api/v2/customAttributes/templates | Create CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesPut**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPut) | **PUT** /api/v2/customAttributes/templates | Update custom attributes template |
| [**apiV2CustomAttributesTemplatesSearchPost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesSearchPost) | **POST** /api/v2/customAttributes/templates/search | Search CustomAttributeTemplates |


<a name="apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost"></a>
# **apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**
> apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id, UUID)

Exclude CustomAttributes from CustomAttributeTemplate

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System delete attributes from attributes tempalte

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Attribute template internal (UUID) identifier
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost");
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
| **id** | **UUID**| Attribute template internal (UUID) identifier | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Admin system role is required |  -  |

<a name="apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost"></a>
# **apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**
> apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id, UUID)

Include CustomAttributes to CustomAttributeTemplate

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User sets attribute internal identifiers   &lt;br&gt;User runs method execution  &lt;br&gt;System add attributes to attributes tempalte

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Attribute template internal (UUID) identifier
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost");
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
| **id** | **UUID**| Attribute template internal (UUID) identifier | |
| **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | [optional] |

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
| **404** | Not Found |  -  |
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Admin system role is required |  -  |

<a name="apiV2CustomAttributesTemplatesIdDelete"></a>
# **apiV2CustomAttributesTemplatesIdDelete**
> NoContentResult apiV2CustomAttributesTemplatesIdDelete(id)

Delete CustomAttributeTemplate

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search and delete attribute template  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Attribute template internal (UUID) identifier
    try {
      NoContentResult result = apiInstance.apiV2CustomAttributesTemplatesIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdDelete");
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
| **id** | **UUID**| Attribute template internal (UUID) identifier | |

### Return type

[**NoContentResult**](NoContentResult.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **204** | No Content |  -  |
| **403** | Admin system role is required |  -  |

<a name="apiV2CustomAttributesTemplatesIdGet"></a>
# **apiV2CustomAttributesTemplatesIdGet**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesIdGet(id)

Get CustomAttributeTemplate by ID

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template internal identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute template (listed in response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | CustomAttributeTemplate internal (UUID) identifier
    try {
      CustomAttributeTemplateModel result = apiInstance.apiV2CustomAttributesTemplatesIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdGet");
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
| **id** | **UUID**| CustomAttributeTemplate internal (UUID) identifier | |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **404** | Can&#39;t find a CustomAttributeTemplate with identifier |  -  |
| **200** | Success |  -  |

<a name="apiV2CustomAttributesTemplatesNameGet"></a>
# **apiV2CustomAttributesTemplatesNameGet**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesNameGet(name)

Get CustomAttributeTemplate by name

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template name  &lt;br&gt;User runs method execution  &lt;br&gt;System search and return list of attribute templates (listed in response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    String name = "name_example"; // String | CustomAttributeTemplate name for search
    try {
      CustomAttributeTemplateModel result = apiInstance.apiV2CustomAttributesTemplatesNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesNameGet");
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
| **name** | **String**| CustomAttributeTemplate name for search | |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="apiV2CustomAttributesTemplatesPost"></a>
# **apiV2CustomAttributesTemplatesPost**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel)

Create CustomAttributeTemplate

&lt;br&gt;Use case  &lt;br&gt;User sets attribute template parameters (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates attribute template  &lt;br&gt;System returns attribute template model (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    CustomAttributeTemplatePostModel customAttributeTemplatePostModel = new CustomAttributeTemplatePostModel(); // CustomAttributeTemplatePostModel | 
    try {
      CustomAttributeTemplateModel result = apiInstance.apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPost");
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
| **customAttributeTemplatePostModel** | [**CustomAttributeTemplatePostModel**](CustomAttributeTemplatePostModel.md)|  | [optional] |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Admin system role is required |  -  |
| **201** | Created |  -  |

<a name="apiV2CustomAttributesTemplatesPut"></a>
# **apiV2CustomAttributesTemplatesPut**
> apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel)

Update custom attributes template

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    CustomAttributeTemplatePutModel customAttributeTemplatePutModel = new CustomAttributeTemplatePutModel(); // CustomAttributeTemplatePutModel | 
    try {
      apiInstance.apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPut");
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
| **customAttributeTemplatePutModel** | [**CustomAttributeTemplatePutModel**](CustomAttributeTemplatePutModel.md)|  | [optional] |

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
| **403** | System administrator role is required |  -  |
| **200** | Success |  -  |

<a name="apiV2CustomAttributesTemplatesSearchPost"></a>
# **apiV2CustomAttributesTemplatesSearchPost**
> List&lt;SearchCustomAttributeTemplateGetModel&gt; apiV2CustomAttributesTemplatesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeTemplateSearchQueryModel)

Search CustomAttributeTemplates

&lt;br&gt;Use case  &lt;br&gt;User sets search params model (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System return attribute templates (listed in response example)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.CustomAttributeTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    CustomAttributeTemplatesApi apiInstance = new CustomAttributeTemplatesApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    CustomAttributeTemplateSearchQueryModel customAttributeTemplateSearchQueryModel = new CustomAttributeTemplateSearchQueryModel(); // CustomAttributeTemplateSearchQueryModel | 
    try {
      List<SearchCustomAttributeTemplateGetModel> result = apiInstance.apiV2CustomAttributesTemplatesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeTemplateSearchQueryModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesSearchPost");
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
| **customAttributeTemplateSearchQueryModel** | [**CustomAttributeTemplateSearchQueryModel**](CustomAttributeTemplateSearchQueryModel.md)|  | [optional] |

### Return type

[**List&lt;SearchCustomAttributeTemplateGetModel&gt;**](SearchCustomAttributeTemplateGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

