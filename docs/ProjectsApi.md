# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGlobaAttributesToProject**](ProjectsApi.md#addGlobaAttributesToProject) | **POST** /api/v2/projects/{id}/globalAttributes | Add global attributes to project |
| [**apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete**](ProjectsApi.md#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete) | **DELETE** /api/v2/projects/{id}/customAttributeTemplates/{templateId} | Delete CustomAttributeTemplate from Project |
| [**apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost**](ProjectsApi.md#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost) | **POST** /api/v2/projects/{id}/customAttributeTemplates/{templateId} | Add CustomAttributeTemplate to Project |
| [**apiV2ProjectsIdFailureClassesGet**](ProjectsApi.md#apiV2ProjectsIdFailureClassesGet) | **GET** /api/v2/projects/{id}/failureClasses | Get Project FailureClasses |
| [**apiV2ProjectsIdFavoritePut**](ProjectsApi.md#apiV2ProjectsIdFavoritePut) | **PUT** /api/v2/projects/{id}/favorite | Mark Project as favorite |
| [**apiV2ProjectsIdFiltersGet**](ProjectsApi.md#apiV2ProjectsIdFiltersGet) | **GET** /api/v2/projects/{id}/filters | Get Project filters |
| [**apiV2ProjectsIdTestPlansAnalyticsGet**](ProjectsApi.md#apiV2ProjectsIdTestPlansAnalyticsGet) | **GET** /api/v2/projects/{id}/testPlans/analytics | Get TestPlans analytics |
| [**apiV2ProjectsIdTestPlansSearchPost**](ProjectsApi.md#apiV2ProjectsIdTestPlansSearchPost) | **POST** /api/v2/projects/{id}/testPlans/search | Get Project TestPlans with analytics |
| [**apiV2ProjectsIdTestRunsActiveGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsActiveGet) | **GET** /api/v2/projects/{id}/testRuns/active | Get active Project TestRuns |
| [**apiV2ProjectsIdTestRunsFullGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsFullGet) | **GET** /api/v2/projects/{id}/testRuns/full | Get Project TestRuns full models |
| [**apiV2ProjectsIdWorkItemsTagsGet**](ProjectsApi.md#apiV2ProjectsIdWorkItemsTagsGet) | **GET** /api/v2/projects/{id}/workItems/tags | Get WorkItems Tags |
| [**apiV2ProjectsSearchPost**](ProjectsApi.md#apiV2ProjectsSearchPost) | **POST** /api/v2/projects/search |  |
| [**callImport**](ProjectsApi.md#callImport) | **POST** /api/v2/projects/import | Import project from JSON file |
| [**createCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{id}/testPlans/attributes | Add attributes to project&#39;s test plans |
| [**createProject**](ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create project |
| [**createProjectsAttribute**](ProjectsApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{id}/attributes | Create project attribute |
| [**deleteCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{id}/testPlans/attribute/{attributeId} | Delete attribute from project&#39;s test plans |
| [**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /api/v2/projects/{id} | Delete project |
| [**deleteProjectAutoTests**](ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{id}/autoTests | Delete project |
| [**deleteProjectsAttribute**](ProjectsApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{id}/attributes/{attributeId} | Delete project attribute |
| [**export**](ProjectsApi.md#export) | **POST** /api/v2/projects/{id}/export | Export project as JSON file |
| [**exportWithTestPlansAndConfigurations**](ProjectsApi.md#exportWithTestPlansAndConfigurations) | **POST** /api/v2/projects/{id}/export-by-testPlans | Export project with test plans, test suites and test points as JSON file |
| [**getAllProjects**](ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all projects |
| [**getAttributeByProjectId**](ProjectsApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{id}/attributes/{attributeId} | Get project attribute |
| [**getAttributesByProjectId**](ProjectsApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{id}/attributes | Get project attributes |
| [**getAutoTestsNamespaces**](ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{id}/autoTestsNamespaces | Get namespaces of autotests in project |
| [**getConfigurationsByProjectId**](ProjectsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{id}/configurations | Get project configurations |
| [**getCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{id}/testPlans/attributes | Get project&#39;s test plan attributes |
| [**getProjectById**](ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{id} | Get project by ID |
| [**getSectionsByProjectId**](ProjectsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{id}/sections | Get project sections |
| [**getTestPlansByProjectId**](ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{id}/testPlans | Get project test plans |
| [**getTestRunsByProjectId**](ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{id}/testRuns | Get project test runs |
| [**getWorkItemsByProjectId**](ProjectsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{id}/workItems | Get project work items |
| [**importToExistingProject**](ProjectsApi.md#importToExistingProject) | **POST** /api/v2/projects/{id}/import | Import project from JSON file into existing project |
| [**restoreProject**](ProjectsApi.md#restoreProject) | **POST** /api/v2/projects/{id}/restore | Restore project |
| [**searchAttributesInProject**](ProjectsApi.md#searchAttributesInProject) | **POST** /api/v2/projects/{id}/attributes/search |  |
| [**searchTestPlanAttributesInProject**](ProjectsApi.md#searchTestPlanAttributesInProject) | **POST** /api/v2/projects/{id}/testPlans/attributes/search |  |
| [**updateCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{id}/testPlans/attribute | Update attribute of project&#39;s test plans |
| [**updateProject**](ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update project |
| [**updateProjectsAttribute**](ProjectsApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{id}/attributes | Update project attribute |



## addGlobaAttributesToProject

> CustomAttributeModel addGlobaAttributesToProject(id, UUID)

Add global attributes to project

<br>Use case
<br>User sets parameters (listed in request example) and runs method execution
<br>System search project
<br>System relates global attributes with project
<br>System returns ok response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            CustomAttributeModel result = apiInstance.addGlobaAttributesToProject(id, UUID);
            System.out.println(result);
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
| **UUID** | **List&lt;UUID&gt;**|  | [optional] |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Project admin permission for project settings is required |  -  |
| **409** | Conflict |  -  |
| **400** | &lt;br&gt; Attributes must be global  |  -  |
| **200** | Successful operation |  -  |
| **404** | Not Found |  -  |
| **422** | Client Error |  -  |


## apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete

> apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete(id, templateId)

Delete CustomAttributeTemplate from Project

<br>Use case
<br>User sets project internal or global identifier 
<br>User sets attribute template internal identifier 
<br>User runs method execution
<br>System delete attribute template from project

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID templateId = UUID.randomUUID(); // UUID | CustomAttributeTemplate internal (UUID) identifier
        try {
            apiInstance.apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete(id, templateId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete");
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
| **400** | Bad Request |  -  |
| **204** | Success |  -  |
| **404** | Can&#39;t find a Project with identifier |  -  |
| **403** | Update project settings permission for project required |  -  |


## apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost

> apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost(id, templateId)

Add CustomAttributeTemplate to Project

<br>Use case
<br>User sets project internal or global identifier 
<br>User sets attribute template internal identifier 
<br>User runs method execution
<br>System add attribute template to project

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID templateId = UUID.randomUUID(); // UUID | CustomAttributeTemplate internal (UUID) identifier
        try {
            apiInstance.apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost(id, templateId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost");
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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Can&#39;t find a Project with identifier |  -  |
| **403** | Update project settings permission for project required |  -  |


## apiV2ProjectsIdFailureClassesGet

> List&lt;FailureClassModel&gt; apiV2ProjectsIdFailureClassesGet(id, isDeleted)

Get Project FailureClasses

<br>Use case
<br>User sets project internal or global identifier 
<br>User runs method execution
<br>System returns project failre classes

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **id** | **String**| Project internal (UUID) or global (integer) identifier | |
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
| **400** | Bad Request |  -  |
| **200** | Success |  -  |


## apiV2ProjectsIdFavoritePut

> apiV2ProjectsIdFavoritePut(id)

Mark Project as favorite

User permissions for project:
{Read only}
{Execute}
{Write}
{Full control}

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        String id = "id_example"; // String | 
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
| **id** | **String**|  | |

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
| **404** | Can&#39;t find a Project with id |  -  |
| **400** | Bad Request |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## apiV2ProjectsIdFiltersGet

> List&lt;FilterModel&gt; apiV2ProjectsIdFiltersGet(id)

Get Project filters

<br>Use case
<br>User sets project internal or global identifier 
<br>User runs method execution
<br>System returns project filters

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **400** | Bad Request |  -  |
| **200** | Success |  -  |


## apiV2ProjectsIdTestPlansAnalyticsGet

> List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsIdTestPlansAnalyticsGet(id, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue)

Get TestPlans analytics

<br>Use case
<br>User sets project internal identifier
<br>User sets query params
<br>User runs method execution
<br>System return analytics

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | Project internal (UUID) identifier
        Boolean isDeleted = true; // Boolean | 
        Boolean mustUpdateCache = false; // Boolean | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<TestPlanWithAnalyticModel> result = apiInstance.apiV2ProjectsIdTestPlansAnalyticsGet(id, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestPlansAnalyticsGet");
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
| **id** | **UUID**| Project internal (UUID) identifier | |
| **isDeleted** | **Boolean**|  | [optional] |
| **mustUpdateCache** | **Boolean**|  | [optional] [default to false] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |


## apiV2ProjectsIdTestPlansSearchPost

> List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsIdTestPlansSearchPost(id, mustUpdateCache, skip, take, orderBy, searchField, searchValue, testPlanSearchQueryModel)

Get Project TestPlans with analytics

<br>Use case
<br>User sets project internal or global identifier 
<br>User sets request body 
<br>User runs method execution
<br>System returns project testplans with analytics

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        Boolean mustUpdateCache = false; // Boolean | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        TestPlanSearchQueryModel testPlanSearchQueryModel = new TestPlanSearchQueryModel(); // TestPlanSearchQueryModel | 
        try {
            List<TestPlanWithAnalyticModel> result = apiInstance.apiV2ProjectsIdTestPlansSearchPost(id, mustUpdateCache, skip, take, orderBy, searchField, searchValue, testPlanSearchQueryModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdTestPlansSearchPost");
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
| **mustUpdateCache** | **Boolean**|  | [optional] [default to false] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **testPlanSearchQueryModel** | [**TestPlanSearchQueryModel**](TestPlanSearchQueryModel.md)|  | [optional] |

### Return type

[**List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |


## apiV2ProjectsIdTestRunsActiveGet

> List&lt;PublicTestRunModel&gt; apiV2ProjectsIdTestRunsActiveGet(id)

Get active Project TestRuns

<br>Use case
<br>User sets project internal or global identifier 
<br>User runs method execution
<br>System returns active testruns

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |


## apiV2ProjectsIdTestRunsFullGet

> List&lt;TestRunModel&gt; apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get Project TestRuns full models

<br>Use case
<br>User sets project internal or global identifier 
<br>User sets query params 
<br>User runs method execution
<br>System returns project test runs full models

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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


## apiV2ProjectsIdWorkItemsTagsGet

> List&lt;TagShortModel&gt; apiV2ProjectsIdWorkItemsTagsGet(id, isDeleted)

Get WorkItems Tags

<br>Use case
<br>User sets project internal identifier 
<br>User runs method execution
<br>System returns work items tags

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | Project internal (UUID) identifier
        Boolean isDeleted = true; // Boolean | 
        try {
            List<TagShortModel> result = apiInstance.apiV2ProjectsIdWorkItemsTagsGet(id, isDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#apiV2ProjectsIdWorkItemsTagsGet");
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
| **id** | **UUID**| Project internal (UUID) identifier | |
| **isDeleted** | **Boolean**|  | [optional] |

### Return type

[**List&lt;TagShortModel&gt;**](TagShortModel.md)

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


## apiV2ProjectsSearchPost

> List&lt;ProjectModel&gt; apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, projectSelectModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        ProjectSelectModel projectSelectModel = new ProjectSelectModel(); // ProjectSelectModel | 
        try {
            List<ProjectModel> result = apiInstance.apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, projectSelectModel);
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
| **projectSelectModel** | [**ProjectSelectModel**](ProjectSelectModel.md)|  | [optional] |

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


## callImport

> callImport(includeAttachments, _file)

Import project from JSON file

<br>
  <b>A project can only be exported to another TMS instance, different from the one it was imported from.</b>

<br>This method imports a `.json` file with a project to the test management system.
<br>In the body of the request, send the `.json` file received by the `POST /api/v2/projects/export` method:
<br>
  <code>
            curl -X POST "http://{domain.com}/api/v2/projects/import" \
            -H "accept: /" -H "Authorization: PrivateToken {token}" -H "Content-Type: multipart/form-data" \
            -F "file=@import.txt;type=text/plain"
            </code>

<br>
            In the second instance, a project with the name of the imported one is created.
            User attributes and the test library (along with content and structure) are imported.
            
<br>Test plan execution history from the first instance of TMS cannot be transferred.

### Example

```java
import java.io.File;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **409** | Entity with the same ID was already imported in other project |  -  |
| **413** | Multipart body length limit exceeded |  -  |
| **400** | Bad Request |  -  |
| **403** | Project creator or admin system role is required |  -  |
| **204** | Success |  -  |


## createCustomAttributeTestPlanProjectRelations

> createCustomAttributeTestPlanProjectRelations(id, UUID)

Add attributes to project&#39;s test plans

<br>Use case
<br>User sets project internal or global identifier and attributes identifiers
<br>User runs method execution
<br>System updates project and add attributes to project for test plans
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            apiInstance.createCustomAttributeTestPlanProjectRelations(id, UUID);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#createCustomAttributeTestPlanProjectRelations");
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
| **UUID** | **List&lt;UUID&gt;**|  | [optional] |

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
| **403** | Update permission for project settings is required |  -  |
| **204** | Success |  -  |
| **400** | &lt;br&gt; Attributes must be global  |  -  |


## createProject

> ProjectModel createProject(projectPostModel)

Create project

<br>Use case
<br>User sets project parameters (listed in request example) and runs method execution
<br>System creates project
<br>System returns project model (example listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        ProjectPostModel projectPostModel = new ProjectPostModel(); // ProjectPostModel | 
        try {
            ProjectModel result = apiInstance.createProject(projectPostModel);
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
| **projectPostModel** | [**ProjectPostModel**](ProjectPostModel.md)|  | [optional] |

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
| **403** | Project creator or admin system role is required |  -  |
| **409** | Project with the same name already exists |  -  |
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Project with provided ID was not found |  -  |


## createProjectsAttribute

> CustomAttributeModel createProjectsAttribute(id, customAttributePostModel)

Create project attribute

<br>Use case
<br>User sets attribute parameters (listed in request example) and runs method execution
<br>System search project
<br>System creates attribute and relates it to the project
<br>System returns project attribute properties (example listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        CustomAttributePostModel customAttributePostModel = new CustomAttributePostModel(); // CustomAttributePostModel | 
        try {
            CustomAttributeModel result = apiInstance.createProjectsAttribute(id, customAttributePostModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#createProjectsAttribute");
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
| **customAttributePostModel** | [**CustomAttributePostModel**](CustomAttributePostModel.md)|  | [optional] |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **422** | Cannot add new attribute from template which is in use |  -  |
| **400** | &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; |  -  |
| **403** | Update permission for project settings is required |  -  |
| **201** | Success |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** | &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; |  -  |


## deleteCustomAttributeTestPlanProjectRelations

> deleteCustomAttributeTestPlanProjectRelations(id, attributeId)

Delete attribute from project&#39;s test plans

<br>Use case
<br>User sets project internal or global identifier and attribute identifier
<br>User runs method execution
<br>System updates project and delete attribute from project for test plans
<br>System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            apiInstance.deleteCustomAttributeTestPlanProjectRelations(id, attributeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteCustomAttributeTestPlanProjectRelations");
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
| **204** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |


## deleteProject

> deleteProject(id)

Delete project

<br>Use case:
<br>1. User sets project internal or global identifier and runs method execution
<br>2. System searches and moves requested project to archive
<br>3. System responds with no content (204) result

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            apiInstance.deleteProject(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteProject");
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
| **204** | Success |  -  |
| **403** | Delete permission for projects is required |  -  |
| **404** | Project with provided ID does not exists |  -  |


## deleteProjectAutoTests

> deleteProjectAutoTests(id)

Delete project

<br>Use case
<br>User sets project internal or global identifier 
<br>User runs method execution
<br>System delete all autotests from project
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **404** | Can&#39;t find a Project with identifier |  -  |
| **403** | Delete permission for AutoTest required |  -  |
| **204** | Success |  -  |


## deleteProjectsAttribute

> deleteProjectsAttribute(id, attributeId)

Delete project attribute

<br>Use case
<br>User sets project identifier and runs method execution
<br>User sets attribute identifier
<br>User runs method execution
<br>System search project
<br>System search and delete attribute
<br>System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID attributeId = UUID.randomUUID(); // UUID | Project attribute internal (UUID) or global (integer) identifier
        try {
            apiInstance.deleteProjectsAttribute(id, attributeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#deleteProjectsAttribute");
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
| **attributeId** | **UUID**| Project attribute internal (UUID) or global (integer) identifier | |

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
| **403** | Update permission for project settings is required |  -  |
| **400** | &lt;br&gt;- Project ID is invalid  &lt;br&gt;- Project attribute ID is invalid  &lt;br&gt;- Attribute is empty |  -  |
| **404** | Project with provided ID was not found |  -  |
| **204** | Successful operation |  -  |


## export

> File export(id, includeAttachments, projectExportQueryModel)

Export project as JSON file

<br>This method exports the selected project or its part (sections, work items) to a `.json` file.
<br>In the request body, you can specify sections and test cases to be exported.
<br>Example of a request to export two sections and two test cases:
<br>
  <code>
            curl -X POST "http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export" \
            -H "accept: application/json" -H "Authorization: PrivateToken {token}" -H "Content-Type: application/json-patch+json" \
            -d "{\"sectionIds\":[\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"9fa85f64-5717-4562-b3fc-2c963f66a000\"],\"workItemIds\":[\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"90085f64-5717-4562-b3fc-2c963f66a000\"]}"
            </code>

<br>In the response, you get:
<br>
            - A `.zip` file with attachments and a.json file if you enable attachments export.<br />
            - A `.json` file with the project if you do not enable attachments export.
            

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        ProjectExportQueryModel projectExportQueryModel = new ProjectExportQueryModel(); // ProjectExportQueryModel | 
        try {
            File result = apiInstance.export(id, includeAttachments, projectExportQueryModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#export");
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
| **projectExportQueryModel** | [**ProjectExportQueryModel**](ProjectExportQueryModel.md)|  | [optional] |

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
| **404** | Project with provided ID was not found |  -  |
| **400** | Root section was not found |  -  |
| **403** | Update permission for project settings is required |  -  |


## exportWithTestPlansAndConfigurations

> File exportWithTestPlansAndConfigurations(id, includeAttachments, projectExportWithTestPlansPostModel)

Export project with test plans, test suites and test points as JSON file

<br>
  <b>You cannot export test cases execution history.</b>

<br>This method exports the project with the test library and specified test plans to another TMS instance.
<br>
            After sending a correct request, the project is exported to a `.json` file.
            If you enable attachment export, the `.json` file and the attachments are placed in a `.zip` file.
            You can import such a project by using the `POST /api/v2/projects/import` method.
            

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        ProjectExportWithTestPlansPostModel projectExportWithTestPlansPostModel = new ProjectExportWithTestPlansPostModel(); // ProjectExportWithTestPlansPostModel | 
        try {
            File result = apiInstance.exportWithTestPlansAndConfigurations(id, includeAttachments, projectExportWithTestPlansPostModel);
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
| **projectExportWithTestPlansPostModel** | [**ProjectExportWithTestPlansPostModel**](ProjectExportWithTestPlansPostModel.md)|  | [optional] |

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
| **404** | Project with provided ID was not found |  -  |
| **200** | Success |  -  |
| **400** | Root section was not found |  -  |
| **403** | Update permission for project settings is required |  -  |


## getAllProjects

> List&lt;ProjectModel&gt; getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue)

Get all projects

<br>Use case
<br>[Optional] User sets isDeleted field value
<br>[Optional] If User sets isDeleted field value as true, System search all deleted projects
<br>[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted
<br>If User did not set isDeleted field value, System search all projects
<br>System returns array of all found projects(listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **403** | Invalid user permissions |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## getAttributeByProjectId

> CustomAttributeModel getAttributeByProjectId(id, attributeId)

Get project attribute

<br>Use case
<br>User sets project internal or global identifier
<br>User sets project attribute identifier
<br>User runs method execution
<br>System search project
<br>System search project attribute 
<br>System returns project attribute (listed in response model)

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID attributeId = UUID.randomUUID(); // UUID | Project attribute internal (UUID) or global (integer) identifier
        try {
            CustomAttributeModel result = apiInstance.getAttributeByProjectId(id, attributeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getAttributeByProjectId");
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
| **attributeId** | **UUID**| Project attribute internal (UUID) or global (integer) identifier | |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **404** | &lt;br&gt;- Project with provided ID was not found  &lt;br&gt;- Project attribute with provided ID was not found |  -  |
| **200** | Success |  -  |
| **403** | Read permission for test library is required |  -  |


## getAttributesByProjectId

> List&lt;CustomAttributeModel&gt; getAttributesByProjectId(id, isDeleted)

Get project attributes

<br>Use case
<br>User sets project internal or global identifier
<br>[Optional] User sets isDeleted field value
<br>User runs method execution
<br>System search project
<br>[Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project
<br>[Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted
<br>[Optional] If User did not set isDeleted field value, System search all attributes related to project
<br>System returns array of found attributes (listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        Boolean isDeleted = false; // Boolean | If result must consist of only actual/deleted work items
        try {
            List<CustomAttributeModel> result = apiInstance.getAttributesByProjectId(id, isDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getAttributesByProjectId");
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
| **isDeleted** | **Boolean**| If result must consist of only actual/deleted work items | [optional] [default to false] |

### Return type

[**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for test library is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **400** | Bad Request |  -  |
| **200** | Success |  -  |


## getAutoTestsNamespaces

> List&lt;AutoTestNamespaceModel&gt; getAutoTestsNamespaces(id)

Get namespaces of autotests in project

<br>Use case
<br>User sets project internal or global identifier and runs method execution
<br>System search project
<br>System search all autotest related to the project
<br>System returns array of autotest with namespaces and classnames (listed in response)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **403** | Read permission for test library is required |  -  |
| **200** | Success |  -  |
| **404** | Project with provided ID was not found |  -  |


## getConfigurationsByProjectId

> List&lt;ConfigurationModel&gt; getConfigurationsByProjectId(id)

Get project configurations

<br>Use case
<br>User sets project internal or global identifier
<br>User runs method execution
<br>System search project
<br>System search all configurations related to project
<br>System returns array of found configurations (listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            List<ConfigurationModel> result = apiInstance.getConfigurationsByProjectId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getConfigurationsByProjectId");
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

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Project with provided ID was not found |  -  |
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Read permission for configurations required |  -  |


## getCustomAttributeTestPlanProjectRelations

> List&lt;CustomAttributeModel&gt; getCustomAttributeTestPlanProjectRelations(id)

Get project&#39;s test plan attributes

<br>Use case
<br>User runs method execution
<br>System returns project for test plans attributes by project identifier

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            List<CustomAttributeModel> result = apiInstance.getCustomAttributeTestPlanProjectRelations(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getCustomAttributeTestPlanProjectRelations");
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

[**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for project settings is required |  -  |
| **200** | Success |  -  |


## getProjectById

> ProjectModel getProjectById(id)

Get project by ID

<br>Use case
<br>User sets project internal or global identifier and runs method execution
<br>System search project
<br>System returns project (example listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **400** | ID is invalid |  -  |
| **200** | Success |  -  |
| **403** | Read permission for projects is required |  -  |
| **404** | Project with provided ID was not found |  -  |


## getSectionsByProjectId

> List&lt;SectionModel&gt; getSectionsByProjectId(id, skip, take, orderBy, searchField, searchValue)

Get project sections

<br>Use case
<br>User sets project internal or global identifier and runs method execution
<br>System search project
<br>System search all sections related to the project
<br>System returns array of sections (listed in response)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<SectionModel> result = apiInstance.getSectionsByProjectId(id, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getSectionsByProjectId");
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
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;SectionModel&gt;**](SectionModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Project with provided ID was not found |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for test library is required |  -  |
| **400** | Bad Request |  -  |


## getTestPlansByProjectId

> List&lt;TestPlanModel&gt; getTestPlansByProjectId(id, isDeleted)

Get project test plans

<br>Use case
<br>User sets project internal or global identifier
<br>[Optional] User sets isDeleted field value
<br>User runs method execution
<br>System search project
<br>[Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project
<br>[Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted
<br>[Optional] If User did not set isDeleted field value, System search all v related to project
<br>System returns array of found test plans (listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **404** | Project with provided ID was not found |  -  |
| **200** | Success |  -  |
| **403** | Read permission for test library is required |  -  |


## getTestRunsByProjectId

> List&lt;TestRunV2GetModel&gt; getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get project test runs

<br>Use case
<br>User sets project internal or global identifier
<br>User runs method execution
<br>System search project
<br>System search all test runs related to project
<br>System returns array of found test runs (listed in response model)

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **403** | Read permission for test result is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## getWorkItemsByProjectId

> List&lt;WorkItemShortModel&gt; getWorkItemsByProjectId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get project work items

<br>Use case
<br>User sets project internal or global identifier
<br>[Optional] User sets isDeleted field value
<br>User runs method execution
<br>System search project
<br>[Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project
<br>[Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted
<br>If User did not set isDeleted field value, System search all  workitems related to project
<br>System returns array of found workitems (listed in response model)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        Boolean isDeleted = false; // Boolean | If result must consist of only actual/deleted work items
        List<String> tagNames = Arrays.asList(); // List<String> | List of tags to filter by
        Boolean includeIterations = true; // Boolean | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<WorkItemShortModel> result = apiInstance.getWorkItemsByProjectId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#getWorkItemsByProjectId");
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
| **isDeleted** | **Boolean**| If result must consist of only actual/deleted work items | [optional] [default to false] |
| **tagNames** | **List&lt;String&gt;**| List of tags to filter by | [optional] |
| **includeIterations** | **Boolean**|  | [optional] [default to true] |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Read permission for test library is required |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; characters  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found |  -  |
| **404** | Project with provided ID was not found |  -  |


## importToExistingProject

> importToExistingProject(id, includeAttachments, _file)

Import project from JSON file into existing project

<br>Use case
<br>User attaches project as json file taken from export or export-by-testPlans method
<br>User runs method execution
<br>System updates project
<br>System returns no content response

### Example

```java
import java.io.File;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        Boolean includeAttachments = true; // Boolean | 
        File _file = new File("/path/to/file"); // File | Select file
        try {
            apiInstance.importToExistingProject(id, includeAttachments, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#importToExistingProject");
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
| **includeAttachments** | **Boolean**|  | [optional] |
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
| **403** | Update permission for project settings required |  -  |
| **409** | Entity with same id already imported in other project |  -  |
| **413** | Multipart body length limit exceeded |  -  |
| **204** | Success |  -  |
| **404** | File not found |  -  |


## restoreProject

> restoreProject(id)

Restore project

<br>Use case
<br>User sets project internal or global identifier and runs method execution
<br>System search and restores deleted project
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            apiInstance.restoreProject(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#restoreProject");
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
| **403** | Update permission for projects is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **204** | Success |  -  |


## searchAttributesInProject

> List&lt;CustomAttributeGetModel&gt; searchAttributesInProject(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        String id = "id_example"; // String | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel = new SearchAttributesInProjectQueryModel(); // SearchAttributesInProjectQueryModel | 
        try {
            List<CustomAttributeGetModel> result = apiInstance.searchAttributesInProject(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#searchAttributesInProject");
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
| **id** | **String**|  | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **searchAttributesInProjectQueryModel** | [**SearchAttributesInProjectQueryModel**](SearchAttributesInProjectQueryModel.md)|  | [optional] |

### Return type

[**List&lt;CustomAttributeGetModel&gt;**](CustomAttributeGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **404** | Not Found |  -  |


## searchTestPlanAttributesInProject

> List&lt;CustomAttributeGetModel&gt; searchTestPlanAttributesInProject(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        String id = "id_example"; // String | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        SearchAttributesInProjectQueryModel searchAttributesInProjectQueryModel = new SearchAttributesInProjectQueryModel(); // SearchAttributesInProjectQueryModel | 
        try {
            List<CustomAttributeGetModel> result = apiInstance.searchTestPlanAttributesInProject(id, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectQueryModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#searchTestPlanAttributesInProject");
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
| **id** | **String**|  | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **searchAttributesInProjectQueryModel** | [**SearchAttributesInProjectQueryModel**](SearchAttributesInProjectQueryModel.md)|  | [optional] |

### Return type

[**List&lt;CustomAttributeGetModel&gt;**](CustomAttributeGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Forbidden |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## updateCustomAttributeTestPlanProjectRelations

> updateCustomAttributeTestPlanProjectRelations(id, customAttributeTestPlanProjectRelationPutModel)

Update attribute of project&#39;s test plans

<br>Use case
<br>User sets project internal or global identifier and attribute model
<br>User runs method execution
<br>System updates project and project attribute for test plan
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        CustomAttributeTestPlanProjectRelationPutModel customAttributeTestPlanProjectRelationPutModel = new CustomAttributeTestPlanProjectRelationPutModel(); // CustomAttributeTestPlanProjectRelationPutModel | 
        try {
            apiInstance.updateCustomAttributeTestPlanProjectRelations(id, customAttributeTestPlanProjectRelationPutModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#updateCustomAttributeTestPlanProjectRelations");
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
| **customAttributeTestPlanProjectRelationPutModel** | [**CustomAttributeTestPlanProjectRelationPutModel**](CustomAttributeTestPlanProjectRelationPutModel.md)|  | [optional] |

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
| **204** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |


## updateProject

> updateProject(projectPutModel)

Update project

<br>Use case
<br>User sets project parameters (listed in request example) and runs method execution
<br>System updates project
<br>System returns updated project model (example listed in response parameters)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        ProjectPutModel projectPutModel = new ProjectPutModel(); // ProjectPutModel | 
        try {
            apiInstance.updateProject(projectPutModel);
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
| **projectPutModel** | [**ProjectPutModel**](ProjectPutModel.md)|  | [optional] |

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
| **409** | Project with the same name already exists |  -  |
| **403** | Update permission for projects is required |  -  |
| **204** | Success |  -  |
| **400** | &lt;br&gt;- ID is invalid  &lt;br&gt;- Field is required |  -  |
| **404** | Project with provided ID was not found |  -  |


## updateProjectsAttribute

> updateProjectsAttribute(id, customAttributePutModel)

Update project attribute

<br>Use case
<br>User sets project parameters (listed in request example) and runs method execution
<br>System updates project
<br>System updates attribute related to the project
<br>System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        CustomAttributePutModel customAttributePutModel = new CustomAttributePutModel(); // CustomAttributePutModel | 
        try {
            apiInstance.updateProjectsAttribute(id, customAttributePutModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectsApi#updateProjectsAttribute");
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
| **customAttributePutModel** | [**CustomAttributePutModel**](CustomAttributePutModel.md)|  | [optional] |

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
| **404** | Project with provided ID was not found |  -  |
| **422** | Cannot add new attribute from template which is in use |  -  |
| **409** | &lt;br&gt;&#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes  &lt;br&gt;&#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; |  -  |
| **204** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |
| **400** | &lt;br&gt;- Attribute is &#x60;null&#x60;  &lt;br&gt;- Priority is invalid  &lt;br&gt;- Attribute with &#x60;Options&#x60; type must have an options  &lt;br&gt;- ID is not &#x60;null&#x60;  &lt;br&gt;- Option ID is not &#x60;null&#x60; |  -  |

