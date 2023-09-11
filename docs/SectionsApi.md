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
| **403** | Update permission for section is required |  -  |


## createSection

> SectionWithStepsModel createSection(createSectionRequest)

Create section

<br>Use case
<br>User sets section properties (listed in request example)
<br>User runs method execution
<br>System creates section property values
<br>System returns section (listed in response example)

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
        CreateSectionRequest createSectionRequest = new CreateSectionRequest(); // CreateSectionRequest | 
        try {
            SectionWithStepsModel result = apiInstance.createSection(createSectionRequest);
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
| **createSectionRequest** | [**CreateSectionRequest**](CreateSectionRequest.md)|  | [optional] |

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


## deleteSection

> deleteSection(id)

Delete section

<br>Use case
<br>User sets section identifier
<br>User runs method execution
<br>System search section by the identifier
<br>System search and delete nested sections of the found section
<br>System search and delete workitems related to the found nested sections
<br>System deletes initial section and related workitem
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
| **409** | Conflict |  -  |
| **400** | Bad Request |  -  |
| **403** | Delete permission for test library is required |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **404** | Section with provided ID was not found |  -  |
| **422** | Cannot delete root section |  -  |


## getSectionById

> SectionWithStepsModel getSectionById(id, isDeleted)

Get section

<br>Use case
<br>User sets section internal (guid format) identifier
<br>User runs method execution
<br>System search section by the section identifier
<br>
            [Optional] If isDeleted flag equals false, deleted work items are not being searched.
            If true, deleted work items are also being searched, null for all work items.
            
<br>System returns section

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
| **isDeleted** | **DeletionState**|  | [optional] [default to NotDeleted] [enum: Any, Deleted, NotDeleted] |

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
| **404** | Section with provided ID was not found |  -  |
| **403** | Read permission for test library is required |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **200** | Success |  -  |


## getWorkItemsBySectionId

> List&lt;WorkItemShortModel&gt; getWorkItemsBySectionId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get section work items

<br>Use case
<br>User sets section identifier
<br>User runs method execution
<br>System search section by the identifier
<br>System search work items related to the section
<br>
            [Optional] If isDeleted flag equals false, deleted work items are not being searched.
            If true, deleted work items are also being searched, null for all work items.
            
<br>System returns work item collection

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
| **401** | Unauthorized |  -  |
| **403** | Read permission for test library is required |  -  |
| **404** | Section with provided ID was not found |  -  |
| **400** | &lt;br&gt;- &#x60;orderBy&#x60; statement must have one &#x60;.&#x60; and no &#x60;,&#x60; symbols  &lt;br&gt;- &#x60;orderBy&#x60; statement has invalid length  &lt;br&gt;- &#x60;orderBy&#x60; statement must have UUID as attribute key  &lt;br&gt;- Search field was not found |  -  |
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |


## move

> move(moveRequest)

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
        MoveRequest moveRequest = new MoveRequest(); // MoveRequest | 
        try {
            apiInstance.move(moveRequest);
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
| **moveRequest** | [**MoveRequest**](MoveRequest.md)|  | [optional] |

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
| **403** | Update permission for test library is required |  -  |
| **204** | No Content |  -  |


## rename

> rename(renameRequest)

Rename section

<br>Use case
<br>User sets section identifier and new name (listed in request example)
<br>User runs method execution
<br>System search section by the identifier
<br>System updates section name using the new name
<br>System returns no content response

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
        RenameRequest renameRequest = new RenameRequest(); // RenameRequest | 
        try {
            apiInstance.rename(renameRequest);
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
| **renameRequest** | [**RenameRequest**](RenameRequest.md)|  | [optional] |

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
| **409** | Section with the same name already exists in the parent section |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library is required |  -  |
| **404** | Section with provided ID was not found |  -  |
| **422** | Root section cannot be renamed |  -  |


## updateSection

> updateSection(updateSectionRequest)

Update section

<br>Use case
<br>User sets section properties (listed in request example)
<br>User runs method execution
<br>System search section by the identifier
<br>System updates section using the property values
<br>System returns no content response

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
        UpdateSectionRequest updateSectionRequest = new UpdateSectionRequest(); // UpdateSectionRequest | 
        try {
            apiInstance.updateSection(updateSectionRequest);
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
| **updateSectionRequest** | [**UpdateSectionRequest**](UpdateSectionRequest.md)|  | [optional] |

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
| **400** | &lt;br&gt;- ID is invalid  &lt;br&gt;- Root section cannot be create |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test library is required |  -  |
| **404** | &lt;br&gt;- Section cannot be found  &lt;br&gt;- Parent section cannot be found  &lt;br&gt;- Project cannot be found |  -  |
| **409** | Section with the same name already exists in the parent section |  -  |
| **422** | &lt;br&gt;- Root section cannot be edited  &lt;br&gt;- Parent ID cannot be changed  &lt;br&gt;- Project ID cannot be changed |  -  |

