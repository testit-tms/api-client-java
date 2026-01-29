# SectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2SectionsIdPatch**](SectionsApi.md#apiV2SectionsIdPatch) | **PATCH** /api/v2/sections/{id} | Patch section |
| [**createSection**](SectionsApi.md#createSection) | **POST** /api/v2/sections | Create section |
| [**deleteSection**](SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{id} | Delete section |
| [**getSectionById**](SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{id} | Get section |
| [**getWorkItemsBySectionId**](SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{id}/workItems | Get section work items |
| [**move**](SectionsApi.md#move) | **POST** /api/v2/sections/move | Move section with all work items into another section |
| [**rename**](SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename section |
| [**updateSection**](SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update section |



## apiV2SectionsIdPatch

> apiV2SectionsIdPatch(id, operation)

Patch section

See <a href="https://www.rfc-editor.org/rfc/rfc6902" target="_blank">RFC 6902: JavaScript Object Notation (JSON) Patch</a> for details

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Section internal (UUID) identifier
        List<Operation> operation = Arrays.asList(); // List<Operation> | 
        try {
            apiInstance.apiV2SectionsIdPatch(id, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#apiV2SectionsIdPatch");
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
| **id** | **UUID**| Section internal (UUID) identifier | |
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for section is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## createSection

> SectionWithStepsModel createSection(sectionPostModel)

Create section


Use case

User sets section properties (listed in request example)

User runs method execution

System creates section property values

System returns section (listed in response example)

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        SectionPostModel sectionPostModel = new SectionPostModel(); // SectionPostModel | 
        try {
            SectionWithStepsModel result = apiInstance.createSection(sectionPostModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#createSection");
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
| **sectionPostModel** | [**SectionPostModel**](SectionPostModel.md)|  | [optional] |

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Cannot create section without parent ID |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library is required |  -  |
| **404** | Parent section with provided ID was not found |  -  |
| **409** | Section with the same name already exists in the parent section |  -  |
| **422** | Unprocessable Entity |  -  |


## deleteSection

> deleteSection(id)

Delete section


Use case

User sets section identifier

User runs method execution

System search section by the identifier

System search and delete nested sections of the found section

System search and delete workitems related to the found nested sections

System deletes initial section and related workitem

System returns no content response

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Section internal (UUID) identifier
        try {
            apiInstance.deleteSection(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#deleteSection");
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
| **id** | **UUID**| Section internal (UUID) identifier | |

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
| **403** | Delete permission for test library is required |  -  |
| **404** | Section with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Cannot delete root section |  -  |


## getSectionById

> SectionWithStepsModel getSectionById(id, isDeleted)

Get section


Use case

User sets section internal (guid format) identifier

User runs method execution

System search section by the section identifier

[Optional] If isDeleted flag equals false, deleted work items are not being searched.
            If true, deleted work items are also being searched, null for all work items.

System returns section

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Section internal (UUID) identifier
        DeletionState isDeleted = DeletionState.fromValue("Any"); // DeletionState | 
        try {
            SectionWithStepsModel result = apiInstance.getSectionById(id, isDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#getSectionById");
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
| **id** | **UUID**| Section internal (UUID) identifier | |
| **isDeleted** | **DeletionState**|  | [optional] [enum: Any, Deleted, NotDeleted] |

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

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
| **404** | Section with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## getWorkItemsBySectionId

> List&lt;WorkItemShortModel&gt; getWorkItemsBySectionId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get section work items


Use case

User sets section identifier

User runs method execution

System search section by the identifier

System search work items related to the section

[Optional] If isDeleted flag equals false, deleted work items are not being searched.
            If true, deleted work items are also being searched, null for all work items.

System returns work item collection

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Section internal (UUID) identifier
        Boolean isDeleted = false; // Boolean | Requested section is deleted
        List<String> tagNames = Arrays.asList(); // List<String> | List of work item tags
        Boolean includeIterations = true; // Boolean | 
        Integer skip = 56; // Integer | Amount of items to be skipped (offset)
        Integer take = 56; // Integer | Amount of items to be taken (limit)
        String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
        String searchField = "searchField_example"; // String | Property name for searching
        String searchValue = "searchValue_example"; // String | Value for searching
        try {
            List<WorkItemShortModel> result = apiInstance.getWorkItemsBySectionId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#getWorkItemsBySectionId");
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
| **id** | **UUID**| Section internal (UUID) identifier | |
| **isDeleted** | **Boolean**| Requested section is deleted | [optional] [default to false] |
| **tagNames** | **List&lt;String&gt;**| List of work item tags | [optional] |
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
| **200** | OK |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **400** |  - &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; symbols  - &#x60;orderBy&#x60; statement has invalid length  - &#x60;orderBy&#x60; statement must have UUID as attribute key  - Search field was not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Section with provided ID was not found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## move

> move(sectionMoveModel)

Move section with all work items into another section

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        SectionMoveModel sectionMoveModel = new SectionMoveModel(); // SectionMoveModel | 
        try {
            apiInstance.move(sectionMoveModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#move");
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
| **sectionMoveModel** | [**SectionMoveModel**](SectionMoveModel.md)|  | [optional] |

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
| **403** | Update permission for test library is required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |


## rename

> rename(sectionRenameModel)

Rename section


Use case

User sets section identifier and new name (listed in request example)

User runs method execution

System search section by the identifier

System updates section name using the new name

System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        SectionRenameModel sectionRenameModel = new SectionRenameModel(); // SectionRenameModel | 
        try {
            apiInstance.rename(sectionRenameModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#rename");
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
| **sectionRenameModel** | [**SectionRenameModel**](SectionRenameModel.md)|  | [optional] |

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
| **403** | Update permission for test library is required |  -  |
| **404** | Section with provided ID was not found |  -  |
| **409** | Section with the same name already exists in the parent section |  -  |
| **422** | Root section cannot be renamed |  -  |


## updateSection

> updateSection(sectionPutModel)

Update section


Use case

User sets section properties (listed in request example)

User runs method execution

System search section by the identifier

System updates section using the property values

System returns no content response

### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
import ru.testit.client.api.SectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: Bearer or PrivateToken
        ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
        Bearer or PrivateToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer or PrivateToken.setApiKeyPrefix("Token");

        SectionsApi apiInstance = new SectionsApi(defaultClient);
        SectionPutModel sectionPutModel = new SectionPutModel(); // SectionPutModel | 
        try {
            apiInstance.updateSection(sectionPutModel);
        } catch (ApiException e) {
            System.err.println("Exception when calling SectionsApi#updateSection");
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
| **sectionPutModel** | [**SectionPutModel**](SectionPutModel.md)|  | [optional] |

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
| **400** |  - ID is invalid  - Root section cannot be create |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library is required |  -  |
| **404** |  - Section cannot be found  - Parent section cannot be found  - Project cannot be found |  -  |
| **409** | Section with the same name already exists in the parent section |  -  |
| **422** |  - Root section cannot be edited  - Parent ID cannot be changed  - Project ID cannot be changed |  -  |

