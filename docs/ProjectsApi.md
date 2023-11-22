# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGlobaAttributesToProject**](ProjectsApi.md#addGlobaAttributesToProject) | **POST** /api/v2/projects/{id}/globalAttributes | Add global attributes to project |
| [**apiV2ProjectsDemoPost**](ProjectsApi.md#apiV2ProjectsDemoPost) | **POST** /api/v2/projects/demo |  |
| [**apiV2ProjectsIdDelete**](ProjectsApi.md#apiV2ProjectsIdDelete) | **DELETE** /api/v2/projects/{id} | Archive project |
| [**apiV2ProjectsIdFailureClassesGet**](ProjectsApi.md#apiV2ProjectsIdFailureClassesGet) | **GET** /api/v2/projects/{id}/failureClasses | Get failure classes |
| [**apiV2ProjectsIdFavoritePut**](ProjectsApi.md#apiV2ProjectsIdFavoritePut) | **PUT** /api/v2/projects/{id}/favorite | Mark Project as favorite |
| [**apiV2ProjectsIdFiltersGet**](ProjectsApi.md#apiV2ProjectsIdFiltersGet) | **GET** /api/v2/projects/{id}/filters | Get Project filters |
| [**apiV2ProjectsIdPatch**](ProjectsApi.md#apiV2ProjectsIdPatch) | **PATCH** /api/v2/projects/{id} | Patch project |
| [**apiV2ProjectsIdPurgePost**](ProjectsApi.md#apiV2ProjectsIdPurgePost) | **POST** /api/v2/projects/{id}/purge | Purge archived project |
| [**apiV2ProjectsIdRestorePost**](ProjectsApi.md#apiV2ProjectsIdRestorePost) | **POST** /api/v2/projects/{id}/restore | Restore archived project |
| [**apiV2ProjectsIdTestPlansAttributeAttributeIdDelete**](ProjectsApi.md#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete) | **DELETE** /api/v2/projects/{id}/testPlans/attribute/{attributeId} | Delete attribute from project&#39;s test plans |
| [**apiV2ProjectsIdTestPlansAttributePut**](ProjectsApi.md#apiV2ProjectsIdTestPlansAttributePut) | **PUT** /api/v2/projects/{id}/testPlans/attribute | Update attribute of project&#39;s test plans |
| [**apiV2ProjectsIdTestRunsActiveGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsActiveGet) | **GET** /api/v2/projects/{id}/testRuns/active | Get active Project TestRuns |
| [**apiV2ProjectsIdTestRunsFullGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsFullGet) | **GET** /api/v2/projects/{id}/testRuns/full | Get Project TestRuns full models |
| [**apiV2ProjectsNameNameExistsGet**](ProjectsApi.md#apiV2ProjectsNameNameExistsGet) | **GET** /api/v2/projects/name/{name}/exists |  |
| [**apiV2ProjectsPurgeBulkPost**](ProjectsApi.md#apiV2ProjectsPurgeBulkPost) | **POST** /api/v2/projects/purge/bulk | Purge multiple projects |
| [**apiV2ProjectsRestoreBulkPost**](ProjectsApi.md#apiV2ProjectsRestoreBulkPost) | **POST** /api/v2/projects/restore/bulk | Restore multiple projects |
| [**apiV2ProjectsSearchPost**](ProjectsApi.md#apiV2ProjectsSearchPost) | **POST** /api/v2/projects/search | Search for projects |
| [**backgroundImportProject**](ProjectsApi.md#backgroundImportProject) | **POST** /api/v2/projects/import/json | Import project from JSON file in background job |
| [**backgroundImportZipProject**](ProjectsApi.md#backgroundImportZipProject) | **POST** /api/v2/projects/import/zip | Import project from Zip file in background job |
| [**callImport**](ProjectsApi.md#callImport) | **POST** /api/v2/projects/import | Import project from JSON file |
| [**createProject**](ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create project |
| [**deleteProjectAutoTests**](ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{id}/autoTests | Delete all autotests from project |
| [**exportWithTestPlansAndConfigurations**](ProjectsApi.md#exportWithTestPlansAndConfigurations) | **POST** /api/v2/projects/{id}/export-by-testPlans | Export project with test plans, test suites and test points as JSON file |
| [**getAllProjects**](ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all projects |
| [**getAutoTestsNamespaces**](ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{id}/autoTestsNamespaces | Get namespaces of autotests in project |
| [**getProjectById**](ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{id} | Get project by ID |
| [**getTestPlansByProjectId**](ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{id}/testPlans | Get project test plans |
| [**getTestRunsByProjectId**](ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{id}/testRuns | Get project test runs |
| [**updateProject**](ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update project |


<a id="addGlobaAttributesToProject"></a>
# **addGlobaAttributesToProject**
> addGlobaAttributesToProject(id, UUID)

Add global attributes to project

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
    try {
      apiInstance.addGlobaAttributesToProject(id, UUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#addGlobaAttributesToProject");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
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
| **200** | Success |  -  |
| **400** | &lt;br&gt; Attributes must be global  |  -  |
| **403** | Project admin permission for project settings is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Client Error |  -  |

<a id="apiV2ProjectsDemoPost"></a>
# **apiV2ProjectsDemoPost**
> ProjectModel apiV2ProjectsDemoPost(createProjectRequest)



### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    CreateProjectRequest createProjectRequest = new CreateProjectRequest(); // CreateProjectRequest | 
    try {
      ProjectModel result = apiInstance.apiV2ProjectsDemoPost(createProjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsDemoPost");
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
| **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)|  | [optional] |

### Return type

[**ProjectModel**](ProjectModel.md)

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
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |

<a id="apiV2ProjectsIdDelete"></a>
# **apiV2ProjectsIdDelete**
> apiV2ProjectsIdDelete(id)

Archive project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Unique or global ID of the project
    try {
      apiInstance.apiV2ProjectsIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdDelete");
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
| **id** | **String**| Unique or global ID of the project | |

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
| **403** | Project manager or admin system role is required |  -  |

<a id="apiV2ProjectsIdFailureClassesGet"></a>
# **apiV2ProjectsIdFailureClassesGet**
> List&lt;FailureClassModel&gt; apiV2ProjectsIdFailureClassesGet(id, isDeleted)

Get failure classes

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Unique or global ID of the project
    Boolean isDeleted = true; // Boolean | 
    try {
      List<FailureClassModel> result = apiInstance.apiV2ProjectsIdFailureClassesGet(id, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdFailureClassesGet");
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
| **id** | **String**| Unique or global ID of the project | |
| **isDeleted** | **Boolean**|  | [optional] |

### Return type

[**List&lt;FailureClassModel&gt;**](FailureClassModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test library is required |  -  |

<a id="apiV2ProjectsIdFavoritePut"></a>
# **apiV2ProjectsIdFavoritePut**
> apiV2ProjectsIdFavoritePut(id)

Mark Project as favorite

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    try {
      apiInstance.apiV2ProjectsIdFavoritePut(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdFavoritePut");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |

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
| **204** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

<a id="apiV2ProjectsIdFiltersGet"></a>
# **apiV2ProjectsIdFiltersGet**
> List&lt;FilterModel&gt; apiV2ProjectsIdFiltersGet(id)

Get Project filters

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project filters

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    try {
      List<FilterModel> result = apiInstance.apiV2ProjectsIdFiltersGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdFiltersGet");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**List&lt;FilterModel&gt;**](FilterModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a id="apiV2ProjectsIdPatch"></a>
# **apiV2ProjectsIdPatch**
> apiV2ProjectsIdPatch(id, operation)

Patch project

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Unique or global Id of project
    List<Operation> operation = Arrays.asList(); // List<Operation> | 
    try {
      apiInstance.apiV2ProjectsIdPatch(id, operation);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdPatch");
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
| **id** | **UUID**| Unique or global Id of project | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] |

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
| **403** | Update permission for projects is required |  -  |

<a id="apiV2ProjectsIdPurgePost"></a>
# **apiV2ProjectsIdPurgePost**
> apiV2ProjectsIdPurgePost(id)

Purge archived project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Unique or global ID of the project
    try {
      apiInstance.apiV2ProjectsIdPurgePost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdPurgePost");
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
| **id** | **String**| Unique or global ID of the project | |

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
| **202** | Accepted |  -  |
| **403** | Admin system role is required |  -  |

<a id="apiV2ProjectsIdRestorePost"></a>
# **apiV2ProjectsIdRestorePost**
> apiV2ProjectsIdRestorePost(id)

Restore archived project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Unique or global ID of the project
    try {
      apiInstance.apiV2ProjectsIdRestorePost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdRestorePost");
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
| **id** | **String**| Unique or global ID of the project | |

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
| **403** | Project manager or admin system role is required |  -  |

<a id="apiV2ProjectsIdTestPlansAttributeAttributeIdDelete"></a>
# **apiV2ProjectsIdTestPlansAttributeAttributeIdDelete**
> apiV2ProjectsIdTestPlansAttributeAttributeIdDelete(id, attributeId)

Delete attribute from project&#39;s test plans

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and delete attribute from project for test plans  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    UUID attributeId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.apiV2ProjectsIdTestPlansAttributeAttributeIdDelete(id, attributeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
| **attributeId** | **UUID**|  | |

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
| **403** | Update permission for project settings is required |  -  |

<a id="apiV2ProjectsIdTestPlansAttributePut"></a>
# **apiV2ProjectsIdTestPlansAttributePut**
> apiV2ProjectsIdTestPlansAttributePut(id, updateCustomAttributeTestPlanProjectRelationsRequest)

Update attribute of project&#39;s test plans

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    UpdateCustomAttributeTestPlanProjectRelationsRequest updateCustomAttributeTestPlanProjectRelationsRequest = new UpdateCustomAttributeTestPlanProjectRelationsRequest(); // UpdateCustomAttributeTestPlanProjectRelationsRequest | 
    try {
      apiInstance.apiV2ProjectsIdTestPlansAttributePut(id, updateCustomAttributeTestPlanProjectRelationsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestPlansAttributePut");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
| **updateCustomAttributeTestPlanProjectRelationsRequest** | [**UpdateCustomAttributeTestPlanProjectRelationsRequest**](UpdateCustomAttributeTestPlanProjectRelationsRequest.md)|  | [optional] |

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
| **403** | Update permission for project settings is required |  -  |

<a id="apiV2ProjectsIdTestRunsActiveGet"></a>
# **apiV2ProjectsIdTestRunsActiveGet**
> List&lt;PublicTestRunModel&gt; apiV2ProjectsIdTestRunsActiveGet(id)

Get active Project TestRuns

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns active testruns

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    try {
      List<PublicTestRunModel> result = apiInstance.apiV2ProjectsIdTestRunsActiveGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestRunsActiveGet");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**List&lt;PublicTestRunModel&gt;**](PublicTestRunModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

<a id="apiV2ProjectsIdTestRunsFullGet"></a>
# **apiV2ProjectsIdTestRunsFullGet**
> List&lt;TestRunModel&gt; apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get Project TestRuns full models

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets query params   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project test runs full models

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean includeTestResults = false; // Boolean | 
    Boolean mustAggregateTestResults = true; // Boolean | 
    Boolean notStarted = true; // Boolean | 
    Boolean inProgress = true; // Boolean | 
    Boolean stopped = true; // Boolean | 
    Boolean completed = true; // Boolean | 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | 
    UUID testPlanId = UUID.randomUUID(); // UUID | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<TestRunModel> result = apiInstance.apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestRunsFullGet");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
| **includeTestResults** | **Boolean**|  | [optional] [default to false] |
| **mustAggregateTestResults** | **Boolean**|  | [optional] [default to true] |
| **notStarted** | **Boolean**|  | [optional] |
| **inProgress** | **Boolean**|  | [optional] |
| **stopped** | **Boolean**|  | [optional] |
| **completed** | **Boolean**|  | [optional] |
| **createdDateFrom** | **OffsetDateTime**|  | [optional] |
| **createdDateTo** | **OffsetDateTime**|  | [optional] |
| **testPlanId** | **UUID**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

<a id="apiV2ProjectsNameNameExistsGet"></a>
# **apiV2ProjectsNameNameExistsGet**
> Boolean apiV2ProjectsNameNameExistsGet(name)



### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Boolean result = apiInstance.apiV2ProjectsNameNameExistsGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsNameNameExistsGet");
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
| **200** | Success |  -  |

<a id="apiV2ProjectsPurgeBulkPost"></a>
# **apiV2ProjectsPurgeBulkPost**
> Long apiV2ProjectsPurgeBulkPost(apiV2ProjectsRestoreBulkPostRequest)

Purge multiple projects

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest = new ApiV2ProjectsRestoreBulkPostRequest(); // ApiV2ProjectsRestoreBulkPostRequest | 
    try {
      Long result = apiInstance.apiV2ProjectsPurgeBulkPost(apiV2ProjectsRestoreBulkPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsPurgeBulkPost");
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
| **apiV2ProjectsRestoreBulkPostRequest** | [**ApiV2ProjectsRestoreBulkPostRequest**](ApiV2ProjectsRestoreBulkPostRequest.md)|  | [optional] |

### Return type

**Long**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Admin system role is required |  -  |

<a id="apiV2ProjectsRestoreBulkPost"></a>
# **apiV2ProjectsRestoreBulkPost**
> Long apiV2ProjectsRestoreBulkPost(apiV2ProjectsRestoreBulkPostRequest)

Restore multiple projects

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest = new ApiV2ProjectsRestoreBulkPostRequest(); // ApiV2ProjectsRestoreBulkPostRequest | 
    try {
      Long result = apiInstance.apiV2ProjectsRestoreBulkPost(apiV2ProjectsRestoreBulkPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsRestoreBulkPost");
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
| **apiV2ProjectsRestoreBulkPostRequest** | [**ApiV2ProjectsRestoreBulkPostRequest**](ApiV2ProjectsRestoreBulkPostRequest.md)|  | [optional] |

### Return type

**Long**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Project manager or admin system role is required |  -  |

<a id="apiV2ProjectsSearchPost"></a>
# **apiV2ProjectsSearchPost**
> List&lt;ProjectModel&gt; apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ProjectsSearchPostRequest)

Search for projects

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    ApiV2ProjectsSearchPostRequest apiV2ProjectsSearchPostRequest = new ApiV2ProjectsSearchPostRequest(); // ApiV2ProjectsSearchPostRequest | 
    try {
      List<ProjectModel> result = apiInstance.apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ProjectsSearchPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#apiV2ProjectsSearchPost");
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
| **apiV2ProjectsSearchPostRequest** | [**ApiV2ProjectsSearchPostRequest**](ApiV2ProjectsSearchPostRequest.md)|  | [optional] |

### Return type

[**List&lt;ProjectModel&gt;**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |

<a id="backgroundImportProject"></a>
# **backgroundImportProject**
> UUID backgroundImportProject(_file)

Import project from JSON file in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      UUID result = apiInstance.backgroundImportProject(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#backgroundImportProject");
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
| **_file** | **File**|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings required |  -  |

<a id="backgroundImportZipProject"></a>
# **backgroundImportZipProject**
> UUID backgroundImportZipProject(_file)

Import project from Zip file in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    try {
      UUID result = apiInstance.backgroundImportZipProject(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#backgroundImportZipProject");
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
| **_file** | **File**|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings required |  -  |

<a id="callImport"></a>
# **callImport**
> callImport(includeAttachments, _file)

Import project from JSON file

&lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Boolean includeAttachments = false; // Boolean | Enables attachment import.
    File _file = new File("/path/to/file"); // File | Select file
    try {
      apiInstance.callImport(includeAttachments, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#callImport");
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
| **includeAttachments** | **Boolean**| Enables attachment import. | [optional] [default to false] |
| **_file** | **File**| Select file | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Project creator or admin system role is required |  -  |
| **409** | Entity with the same ID was already imported in other project |  -  |
| **413** | Multipart body length limit exceeded |  -  |

<a id="createProject"></a>
# **createProject**
> ProjectModel createProject(createProjectRequest)

Create project

&lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    CreateProjectRequest createProjectRequest = new CreateProjectRequest(); // CreateProjectRequest | 
    try {
      ProjectModel result = apiInstance.createProject(createProjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
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
| **createProjectRequest** | [**CreateProjectRequest**](CreateProjectRequest.md)|  | [optional] |

### Return type

[**ProjectModel**](ProjectModel.md)

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
| **403** | Project creator or admin system role is required |  -  |
| **409** | Project with the same name already exists |  -  |

<a id="deleteProjectAutoTests"></a>
# **deleteProjectAutoTests**
> deleteProjectAutoTests(id)

Delete all autotests from project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Unique or global ID of the project
    try {
      apiInstance.deleteProjectAutoTests(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProjectAutoTests");
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
| **id** | **String**| Unique or global ID of the project | |

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
| **403** | Delete permission for AutoTest is required |  -  |
| **404** | Not Found |  -  |

<a id="exportWithTestPlansAndConfigurations"></a>
# **exportWithTestPlansAndConfigurations**
> File exportWithTestPlansAndConfigurations(id, includeAttachments, exportProjectWithTestPlansJsonRequest)

Export project with test plans, test suites and test points as JSON file

&lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Specifies the ID of the project you want to export.
    Boolean includeAttachments = false; // Boolean | Enables attachment export.
    ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest = new ExportProjectWithTestPlansJsonRequest(); // ExportProjectWithTestPlansJsonRequest | 
    try {
      File result = apiInstance.exportWithTestPlansAndConfigurations(id, includeAttachments, exportProjectWithTestPlansJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#exportWithTestPlansAndConfigurations");
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
| **id** | **String**| Specifies the ID of the project you want to export. | |
| **includeAttachments** | **Boolean**| Enables attachment export. | [optional] [default to false] |
| **exportProjectWithTestPlansJsonRequest** | [**ExportProjectWithTestPlansJsonRequest**](ExportProjectWithTestPlansJsonRequest.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Root section was not found |  -  |
| **403** | Update permission for project settings is required |  -  |
| **404** | Project with provided ID was not found |  -  |

<a id="getAllProjects"></a>
# **getAllProjects**
> List&lt;ProjectModel&gt; getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue)

Get all projects

&lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted projects  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all projects  &lt;br&gt;System returns array of all found projects(listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    Boolean isDeleted = true; // Boolean | If result must consist of only actual/deleted parameters
    String projectName = "projectName_example"; // String | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<ProjectModel> result = apiInstance.getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAllProjects");
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
| **projectName** | **String**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;ProjectModel&gt;**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Invalid user permissions |  -  |

<a id="getAutoTestsNamespaces"></a>
# **getAutoTestsNamespaces**
> List&lt;AutoTestNamespaceModel&gt; getAutoTestsNamespaces(id)

Get namespaces of autotests in project

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all autotest related to the project  &lt;br&gt;System returns array of autotest with namespaces and classnames (listed in response)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    try {
      List<AutoTestNamespaceModel> result = apiInstance.getAutoTestsNamespaces(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAutoTestsNamespaces");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**List&lt;AutoTestNamespaceModel&gt;**](AutoTestNamespaceModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Project with provided ID was not found |  -  |

<a id="getProjectById"></a>
# **getProjectById**
> ProjectModel getProjectById(id)

Get project by ID

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System returns project (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    try {
      ProjectModel result = apiInstance.getProjectById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjectById");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**ProjectModel**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | ID is invalid |  -  |
| **403** | Read permission for projects is required |  -  |
| **404** | Project with provided ID was not found |  -  |

<a id="getTestPlansByProjectId"></a>
# **getTestPlansByProjectId**
> List&lt;TestPlanModel&gt; getTestPlansByProjectId(id, isDeleted)

Get project test plans

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all v related to project  &lt;br&gt;System returns array of found test plans (listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean isDeleted = true; // Boolean | If result must consist of only actual/archived test plans
    try {
      List<TestPlanModel> result = apiInstance.getTestPlansByProjectId(id, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTestPlansByProjectId");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
| **isDeleted** | **Boolean**| If result must consist of only actual/archived test plans | [optional] |

### Return type

[**List&lt;TestPlanModel&gt;**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Project with provided ID was not found |  -  |

<a id="getTestRunsByProjectId"></a>
# **getTestRunsByProjectId**
> List&lt;TestRunV2GetModel&gt; getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get project test runs

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all test runs related to project  &lt;br&gt;System returns array of found test runs (listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean notStarted = true; // Boolean | 
    Boolean inProgress = true; // Boolean | 
    Boolean stopped = true; // Boolean | 
    Boolean completed = true; // Boolean | 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | 
    UUID testPlanId = UUID.randomUUID(); // UUID | 
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    try {
      List<TestRunV2GetModel> result = apiInstance.getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getTestRunsByProjectId");
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
| **notStarted** | **Boolean**|  | [optional] |
| **inProgress** | **Boolean**|  | [optional] |
| **stopped** | **Boolean**|  | [optional] |
| **completed** | **Boolean**|  | [optional] |
| **createdDateFrom** | **OffsetDateTime**|  | [optional] |
| **createdDateTo** | **OffsetDateTime**|  | [optional] |
| **testPlanId** | **UUID**|  | [optional] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestRunV2GetModel&gt;**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test result is required |  -  |
| **404** | Project with provided ID was not found |  -  |

<a id="updateProject"></a>
# **updateProject**
> updateProject(updateProjectRequest)

Update project

&lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    UpdateProjectRequest updateProjectRequest = new UpdateProjectRequest(); // UpdateProjectRequest | 
    try {
      apiInstance.updateProject(updateProjectRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProject");
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
| **updateProjectRequest** | [**UpdateProjectRequest**](UpdateProjectRequest.md)|  | [optional] |

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
| **400** | &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required |  -  |
| **403** | Update permission for projects is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** | Project with the same name already exists |  -  |

