# SectionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSection**](SectionsApi.md#createSection) | **POST** /api/v2/sections | Create Section
[**deleteSection**](SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{sectionId} | Delete Section by id
[**getSectionById**](SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{sectionId} | Get Section by id
[**getWorkItemsBySectionId**](SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{sectionId}/workItems | Get WorkItems for Section (if isDeleted is true, return deleted WorkItems)
[**move**](SectionsApi.md#move) | **POST** /api/v2/sections/move | Move Section. Can be moved inside another section. It is possible to indicate a project
[**rename**](SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename Section
[**updateSection**](SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update Section

<a name="createSection"></a>
# **createSection**
> SectionWithStepsModel createSection(body)

Create Section

&lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates section property values  &lt;br&gt;System returns section (listed in response example)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
SectionPostModel body = new SectionPostModel(); // SectionPostModel | 
try {
    SectionWithStepsModel result = apiInstance.createSection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#createSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SectionPostModel**](SectionPostModel.md)|  | [optional]

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteSection"></a>
# **deleteSection**
> deleteSection(sectionId)

Delete Section by id

&lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search and delete nested sections of the found section  &lt;br&gt;System search and delete workitems related to the found nested sections  &lt;br&gt;System deletes initial section and related workitem  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
UUID sectionId = new UUID(); // UUID | Section internal (guid format) identifier
try {
    apiInstance.deleteSection(sectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#deleteSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | [**UUID**](.md)| Section internal (guid format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionById"></a>
# **getSectionById**
> SectionWithStepsModel getSectionById(sectionId, isDeleted)

Get Section by id

&lt;br&gt;Use case  &lt;br&gt;User sets section internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the section identifier  &lt;br&gt;                      [Optional] If isDeleted flag equals false, deleted workitems are not being searched.                      If true, deleted workitems are also being searched, null for all workitems.                    &lt;br&gt;System returns section

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
UUID sectionId = new UUID(); // UUID | Section internal (guid format) identifier
Boolean isDeleted = false; // Boolean | Flag that defines if deleted section must be include in the response
try {
    SectionWithStepsModel result = apiInstance.getSectionById(sectionId, isDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#getSectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | [**UUID**](.md)| Section internal (guid format) identifier |
 **isDeleted** | **Boolean**| Flag that defines if deleted section must be include in the response | [optional] [default to false]

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemsBySectionId"></a>
# **getWorkItemsBySectionId**
> List&lt;WorkItemShortModel&gt; getWorkItemsBySectionId(sectionId, isDeleted, tagNames, includeIterations, , , , , )

Get WorkItems for Section (if isDeleted is true, return deleted WorkItems)

&lt;br&gt;Use case  &lt;br&gt;User sets section identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System search workitems related to the section  &lt;br&gt;                      [Optional] If isDeleted flag equals false, deleted workitems are not being searched.                      If true, deleted workitems are also being searched, null for all workitems.                    &lt;br&gt;System returns workitem collection

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
UUID sectionId = new UUID(); // UUID | Section internal (guid format) identifier
Boolean isDeleted = false; // Boolean | Flag that defines if deleted workitems must be include in the response
List<String> tagNames = Arrays.asList("tagNames_example"); // List<String> | Array of workitem tag names
Boolean includeIterations = true; // Boolean | 
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<WorkItemShortModel> result = apiInstance.getWorkItemsBySectionId(sectionId, isDeleted, tagNames, includeIterations, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#getWorkItemsBySectionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectionId** | [**UUID**](.md)| Section internal (guid format) identifier |
 **isDeleted** | **Boolean**| Flag that defines if deleted workitems must be include in the response | [optional] [default to false]
 **tagNames** | [**List&lt;String&gt;**](String.md)| Array of workitem tag names | [optional]
 **includeIterations** | **Boolean**|  | [optional] [default to true]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="move"></a>
# **move**
> move(body)

Move Section. Can be moved inside another section. It is possible to indicate a project

&lt;br&gt;Use case  &lt;br&gt;                      User sets section identifier, old parent identifier, parent identifier and  next section identifier (listed                      in request example)                    &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System unlink section from the old parent and links to the new one  &lt;br&gt;System updates section rank using the next section identifier  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
SectionMoveModel body = new SectionMoveModel(); // SectionMoveModel | 
try {
    apiInstance.move(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#move");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SectionMoveModel**](SectionMoveModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="rename"></a>
# **rename**
> rename(body)

Rename Section

&lt;br&gt;Use case  &lt;br&gt;User sets section identifier and new name (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section name using the new name  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
SectionRenameModel body = new SectionRenameModel(); // SectionRenameModel | 
try {
    apiInstance.rename(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#rename");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SectionRenameModel**](SectionRenameModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateSection"></a>
# **updateSection**
> updateSection(body)

Update Section

&lt;br&gt;Use case  &lt;br&gt;User sets section properties (listed in request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search section by the identifier  &lt;br&gt;System updates section using the property values  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.SectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

SectionsApi apiInstance = new SectionsApi();
SectionPutModel body = new SectionPutModel(); // SectionPutModel | 
try {
    apiInstance.updateSection(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SectionsApi#updateSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SectionPutModel**](SectionPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

