# ProjectAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectsAttribute**](ProjectAttributesApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{projectId}/attributes | Create project attribute |
| [**deleteProjectsAttribute**](ProjectAttributesApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{projectId}/attributes/{attributeId} | Delete project attribute |
| [**getAttributeByProjectId**](ProjectAttributesApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{projectId}/attributes/{attributeId} | Get project attribute |
| [**getAttributesByProjectId**](ProjectAttributesApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{projectId}/attributes | Get project attributes |
| [**searchAttributesInProject**](ProjectAttributesApi.md#searchAttributesInProject) | **POST** /api/v2/projects/{projectId}/attributes/search | Search for attributes used in the project |
| [**updateProjectsAttribute**](ProjectAttributesApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{projectId}/attributes | Edit attribute of the project |


<a id="createProjectsAttribute"></a>
# **createProjectsAttribute**
> CustomAttributeModel createProjectsAttribute(projectId, createProjectsAttributeRequest)

Create project attribute

 Use case   User sets attribute parameters (listed in request example) and runs method execution   System search project   System creates attribute and relates it to the project   System returns project attribute properties (example listed in response parameters)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    CreateProjectsAttributeRequest createProjectsAttributeRequest = new CreateProjectsAttributeRequest(); // CreateProjectsAttributeRequest | 
    try {
      CustomAttributeModel result = apiInstance.createProjectsAttribute(projectId, createProjectsAttributeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#createProjectsAttribute");
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
| **createProjectsAttributeRequest** | [**CreateProjectsAttributeRequest**](CreateProjectsAttributeRequest.md)|  | [optional] |

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
| **201** | Created |  -  |
| **400** |  - Attribute is &#x60;null&#x60;   - Priority is invalid   - Attribute with &#x60;Options&#x60; type must have an options   - ID is not &#x60;null&#x60;   - Option ID is not &#x60;null&#x60; |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** |  &#x60;CustomAttribute.Name&#x60; or &#x60;CustomAttribute.Id&#x60; are not unique in attributes schemes   &#x60;CustomAttributeOptionModel.Id&#x60; or &#x60;CustomAttributeOptionModel.Value&#x60; are not unique in &#x60;attributesScheme.Options&#x60; |  -  |
| **422** | Cannot add new attribute from template which is in use |  -  |

<a id="deleteProjectsAttribute"></a>
# **deleteProjectsAttribute**
> deleteProjectsAttribute(projectId, attributeId)

Delete project attribute

 Use case   User sets project identifier and runs method execution   User sets attribute identifier   User runs method execution   System search project   System search and delete attribute   System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    UUID attributeId = UUID.randomUUID(); // UUID | Project attribute internal (UUID)
    try {
      apiInstance.deleteProjectsAttribute(projectId, attributeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#deleteProjectsAttribute");
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
| **attributeId** | **UUID**| Project attribute internal (UUID) | |

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
| **400** |  - Project ID is invalid   - Project attribute ID is invalid   - Attribute is empty |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings is required |  -  |
| **404** | Project with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="getAttributeByProjectId"></a>
# **getAttributeByProjectId**
> CustomAttributeModel getAttributeByProjectId(projectId, attributeId)

Get project attribute

 Use case   User sets project internal or global identifier   User sets project attribute identifier   User runs method execution   System search project   System search project attribute    System returns project attribute (listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    UUID attributeId = UUID.randomUUID(); // UUID | Project attribute internal (UUID) or global (integer) identifier
    try {
      CustomAttributeModel result = apiInstance.getAttributeByProjectId(projectId, attributeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#getAttributeByProjectId");
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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** |  - Project with provided ID was not found   - Project attribute with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="getAttributesByProjectId"></a>
# **getAttributesByProjectId**
> List&lt;CustomAttributeModel&gt; getAttributesByProjectId(projectId, isDeleted)

Get project attributes

 Use case   User sets project internal or global identifier   [Optional] User sets isDeleted field value   User runs method execution   System search project   [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project   [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted   [Optional] If User did not set isDeleted field value, System search all attributes related to project   System returns array of found attributes (listed in response model)

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    DeletionState isDeleted = DeletionState.fromValue("Any"); // DeletionState | 
    try {
      List<CustomAttributeModel> result = apiInstance.getAttributesByProjectId(projectId, isDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#getAttributesByProjectId");
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
| **isDeleted** | [**DeletionState**](.md)|  | [optional] [default to NotDeleted] [enum: Any, Deleted, NotDeleted] |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="searchAttributesInProject"></a>
# **searchAttributesInProject**
> List&lt;CustomAttributeGetModel&gt; searchAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectRequest)

Search for attributes used in the project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global project ID
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    SearchAttributesInProjectRequest searchAttributesInProjectRequest = new SearchAttributesInProjectRequest(); // SearchAttributesInProjectRequest | 
    try {
      List<CustomAttributeGetModel> result = apiInstance.searchAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, searchAttributesInProjectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#searchAttributesInProject");
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
| **projectId** | **String**| Unique or global project ID | |
| **skip** | **Integer**| Amount of items to be skipped (offset) | [optional] |
| **take** | **Integer**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **String**| Property name for searching | [optional] |
| **searchValue** | **String**| Value for searching | [optional] |
| **searchAttributesInProjectRequest** | [**SearchAttributesInProjectRequest**](SearchAttributesInProjectRequest.md)|  | [optional] |

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
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for project is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="updateProjectsAttribute"></a>
# **updateProjectsAttribute**
> updateProjectsAttribute(projectId, updateProjectsAttributeRequest)

Edit attribute of the project

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectAttributesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectAttributesApi apiInstance = new ProjectAttributesApi(defaultClient);
    String projectId = "projectId_example"; // String | Unique or global project ID
    UpdateProjectsAttributeRequest updateProjectsAttributeRequest = new UpdateProjectsAttributeRequest(); // UpdateProjectsAttributeRequest | 
    try {
      apiInstance.updateProjectsAttribute(projectId, updateProjectsAttributeRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectAttributesApi#updateProjectsAttribute");
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
| **projectId** | **String**| Unique or global project ID | |
| **updateProjectsAttributeRequest** | [**UpdateProjectsAttributeRequest**](UpdateProjectsAttributeRequest.md)|  | [optional] |

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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

