# ProjectsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callImport**](ProjectsApi.md#callImport) | **POST** /api/v2/projects/import | Import Project from json file  Project can be imported only once (this method or ImportToExistingProject)  Next import will sync content in previously imported project.
[**createCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{projectId}/testPlans/attributes | Add attributes to project for test plans
[**createProject**](ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create Project
[**createProjectsAttribute**](ProjectsApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{projectId}/attributes | Create Projects Attribute
[**deleteCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{projectId}/testPlans/attribute/{attributeId} | Delete attribute from project for test plans
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /api/v2/projects/{projectId} | Delete Project by Id or GlobalId
[**deleteProjectAutoTests**](ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{projectId}/autoTests | Delete all AutoTests from Project
[**deleteProjectsAttribute**](ProjectsApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{projectId}/attributes/{attributeId} | Delete Projects Attribute by Id
[**export**](ProjectsApi.md#export) | **POST** /api/v2/projects/{projectId}/export | Export Project with tests, sections and configurations in json file
[**exportWithTestPlansAndConfigurations**](ProjectsApi.md#exportWithTestPlansAndConfigurations) | **POST** /api/v2/projects/{projectId}/export-by-testPlans | Export Project with tests, sections, configurations, testPlans, testSuites and testPoints as json file
[**getAllProjects**](ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all Projects (if isDeleted is true, return deleted Projects)
[**getAttributeByProjectId**](ProjectsApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{projectId}/attributes/{attributeId} | Get Projects Attribute by Id
[**getAttributesByProjectId**](ProjectsApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{projectId}/attributes | Get Projects Attributes by Id or GlobalId
[**getAutoTestsNamespaces**](ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{projectId}/autoTestsNamespaces | Get AutoTests Namespaces for Project by Id or GlobalId
[**getConfigurationsByProjectId**](ProjectsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{projectId}/configurations | Get Configurations for Project by Id or GlobalId
[**getCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{projectId}/testPlans/attributes | Get project for test plans attributes
[**getProjectById**](ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{projectId} | Get Project by Id or GlobalId
[**getSectionsByProjectId**](ProjectsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{projectId}/sections | Get Sections for Project by Id or GlobalId
[**getTestPlansByProjectId**](ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{projectId}/testPlans | Get TestPlans for Project by Id or GlobalId (if isDeleted is true, return deleted TestPlans)
[**getTestRunsByProjectId**](ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{projectId}/testRuns | Get TestRuns for Project by Id or GlobalId
[**getWorkItemsByProjectId**](ProjectsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{projectId}/workItems | Get WorkItems for Project by Id or GlobalId (if isDeleted is true, return deleted WorkItems)
[**importToExistingProject**](ProjectsApi.md#importToExistingProject) | **POST** /api/v2/projects/{projectId}/import | Import to existing Project from json file.  Sections can be imported in only one target project!
[**restoreProject**](ProjectsApi.md#restoreProject) | **POST** /api/v2/projects/{projectId}/restore | Restore Project by Id or GlobalId
[**updateCustomAttributeTestPlanProjectRelations**](ProjectsApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{projectId}/testPlans/attribute | Update project attribute for test plan
[**updateProject**](ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update Project
[**updateProjectsAttribute**](ProjectsApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{projectId}/attributes | Update Projects Attribute

<a name="callImport"></a>
# **callImport**
> callImport(file, apiVersion, includeAttachments)

Import Project from json file  Project can be imported only once (this method or ImportToExistingProject)  Next import will sync content in previously imported project.

&lt;br&gt;Use case  &lt;br&gt;User attaches project as json file taken from export or export-by-testPlans method  &lt;br&gt;User runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
File file = new File("file_example"); // File | 
String apiVersion = "apiVersion_example"; // String | 
Boolean includeAttachments = false; // Boolean | 
try {
    apiInstance.callImport(file, apiVersion, includeAttachments);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#callImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **apiVersion** | **String**|  | [optional]
 **includeAttachments** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createCustomAttributeTestPlanProjectRelations"></a>
# **createCustomAttributeTestPlanProjectRelations**
> createCustomAttributeTestPlanProjectRelations(projectId, body)

Add attributes to project for test plans

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and add attributes to project for test plans  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | 
List<UUID> body = Arrays.asList(new UUID()); // List<UUID> | 
try {
    apiInstance.createCustomAttributeTestPlanProjectRelations(projectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createCustomAttributeTestPlanProjectRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **body** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createProject"></a>
# **createProject**
> ProjectModel createProject(body)

Create Project

&lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
ProjectPostModel body = new ProjectPostModel(); // ProjectPostModel | 
try {
    ProjectModel result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectPostModel**](ProjectPostModel.md)|  | [optional]

### Return type

[**ProjectModel**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="createProjectsAttribute"></a>
# **createProjectsAttribute**
> CustomAttributeModel createProjectsAttribute(projectId, body)

Create Projects Attribute

&lt;br&gt;Use case  &lt;br&gt;User sets attribute parameters (listed in request example) and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System creates attribute and relates it to the project  &lt;br&gt;System returns project attribute properties (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
CustomAttributePostModel body = new CustomAttributePostModel(); // CustomAttributePostModel | 
try {
    CustomAttributeModel result = apiInstance.createProjectsAttribute(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProjectsAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **body** | [**CustomAttributePostModel**](CustomAttributePostModel.md)|  | [optional]

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="deleteCustomAttributeTestPlanProjectRelations"></a>
# **deleteCustomAttributeTestPlanProjectRelations**
> deleteCustomAttributeTestPlanProjectRelations(projectId, attributeId)

Delete attribute from project for test plans

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and delete attribute from project for test plans  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | 
UUID attributeId = new UUID(); // UUID | 
try {
    apiInstance.deleteCustomAttributeTestPlanProjectRelations(projectId, attributeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteCustomAttributeTestPlanProjectRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **attributeId** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(projectId)

Delete Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search and delete project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    apiInstance.deleteProject(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProjectAutoTests"></a>
# **deleteProjectAutoTests**
> deleteProjectAutoTests(projectId)

Delete all AutoTests from Project

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System delete all autotests from project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | 
try {
    apiInstance.deleteProjectAutoTests(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProjectAutoTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProjectsAttribute"></a>
# **deleteProjectsAttribute**
> deleteProjectsAttribute(projectId, attributeId)

Delete Projects Attribute by Id

&lt;br&gt;Use case  &lt;br&gt;User sets project identifier and runs method execution  &lt;br&gt;User sets attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search and delete attribute  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
UUID attributeId = new UUID(); // UUID | Project attribute internal(guid format)  identifier
try {
    apiInstance.deleteProjectsAttribute(projectId, attributeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProjectsAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **attributeId** | [**UUID**](.md)| Project attribute internal(guid format)  identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="export"></a>
# **export**
> File export(projectId, body, includeAttachments)

Export Project with tests, sections and configurations in json file

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;                      System returns project data as json file, containing project data, related attributes, sections and                      workitems                  

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
ProjectExportQueryModel body = new ProjectExportQueryModel(); // ProjectExportQueryModel | 
Boolean includeAttachments = false; // Boolean | 
try {
    File result = apiInstance.export(projectId, body, includeAttachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#export");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **body** | [**ProjectExportQueryModel**](ProjectExportQueryModel.md)|  | [optional]
 **includeAttachments** | **Boolean**|  | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="exportWithTestPlansAndConfigurations"></a>
# **exportWithTestPlansAndConfigurations**
> File exportWithTestPlansAndConfigurations(projectId, body, includeAttachments)

Export Project with tests, sections, configurations, testPlans, testSuites and testPoints as json file

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;                      System returns project data as json file, containing project data, related attributes, sections, workitems,                      test plans, test suites, test points and configurations                  

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
ProjectExportWithTestPlansPostModel body = new ProjectExportWithTestPlansPostModel(); // ProjectExportWithTestPlansPostModel | 
Boolean includeAttachments = false; // Boolean | 
try {
    File result = apiInstance.exportWithTestPlansAndConfigurations(projectId, body, includeAttachments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#exportWithTestPlansAndConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **body** | [**ProjectExportWithTestPlansPostModel**](ProjectExportWithTestPlansPostModel.md)|  | [optional]
 **includeAttachments** | **Boolean**|  | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="getAllProjects"></a>
# **getAllProjects**
> List&lt;ProjectModel&gt; getAllProjects(isDeleted, projectName, , , , , )

Get all Projects (if isDeleted is true, return deleted Projects)

&lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted projects  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all projects  &lt;br&gt;System returns array of all found projects(listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
Boolean isDeleted = true; // Boolean | Boolean flag which defines if search must include deleted projects
String projectName = "projectName_example"; // String | 
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<ProjectModel> result = apiInstance.getAllProjects(isDeleted, projectName, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getAllProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted projects | [optional]
 **projectName** | **String**|  | [optional]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;ProjectModel&gt;**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttributeByProjectId"></a>
# **getAttributeByProjectId**
> CustomAttributeModel getAttributeByProjectId(projectId, attributeId)

Get Projects Attribute by Id

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User sets project attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search project attribute   &lt;br&gt;System returns project attribute (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
UUID attributeId = new UUID(); // UUID | Project attribute internal(guid format)  identifier
try {
    CustomAttributeModel result = apiInstance.getAttributeByProjectId(projectId, attributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getAttributeByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **attributeId** | [**UUID**](.md)| Project attribute internal(guid format)  identifier |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttributesByProjectId"></a>
# **getAttributesByProjectId**
> List&lt;CustomAttributeModel&gt; getAttributesByProjectId(projectId, isDeleted)

Get Projects Attributes by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;                      [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to                      project                    &lt;br&gt;                      [Optional] If User sets isDeleted field value as false, System search all attributes related to project which                      are not deleted                    &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all attributes related to project  &lt;br&gt;System returns array of found attributes (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
Boolean isDeleted = false; // Boolean | Boolean flag which defines if search must include deleted attributes
try {
    List<CustomAttributeModel> result = apiInstance.getAttributesByProjectId(projectId, isDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getAttributesByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted attributes | [optional] [default to false]

### Return type

[**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoTestsNamespaces"></a>
# **getAutoTestsNamespaces**
> List&lt;AutoTestNamespaceModel&gt; getAutoTestsNamespaces(projectId)

Get AutoTests Namespaces for Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all autotest related to the project  &lt;br&gt;System returns array of autotest with namespaces and classnames (listed in response)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    List<AutoTestNamespaceModel> result = apiInstance.getAutoTestsNamespaces(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getAutoTestsNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

[**List&lt;AutoTestNamespaceModel&gt;**](AutoTestNamespaceModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigurationsByProjectId"></a>
# **getConfigurationsByProjectId**
> List&lt;ConfigurationModel&gt; getConfigurationsByProjectId(projectId)

Get Configurations for Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all configurations related to project  &lt;br&gt;System returns array of found configurations (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    List<ConfigurationModel> result = apiInstance.getConfigurationsByProjectId(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getConfigurationsByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

[**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomAttributeTestPlanProjectRelations"></a>
# **getCustomAttributeTestPlanProjectRelations**
> List&lt;CustomAttributeModel&gt; getCustomAttributeTestPlanProjectRelations(projectId)

Get project for test plans attributes

&lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns project for test plans attributes by project identifier

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    List<CustomAttributeModel> result = apiInstance.getCustomAttributeTestPlanProjectRelations(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getCustomAttributeTestPlanProjectRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

[**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectById"></a>
# **getProjectById**
> ProjectModel getProjectById(projectId)

Get Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System returns project (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    ProjectModel result = apiInstance.getProjectById(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

[**ProjectModel**](ProjectModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsByProjectId"></a>
# **getSectionsByProjectId**
> List&lt;SectionModel&gt; getSectionsByProjectId(projectId, , , , , )

Get Sections for Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all sections related to the project  &lt;br&gt;System returns array of sections (listed in response)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<SectionModel> result = apiInstance.getSectionsByProjectId(projectId, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getSectionsByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;SectionModel&gt;**](SectionModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestPlansByProjectId"></a>
# **getTestPlansByProjectId**
> List&lt;TestPlanModel&gt; getTestPlansByProjectId(projectId, isDeleted)

Get TestPlans for Project by Id or GlobalId (if isDeleted is true, return deleted TestPlans)

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;                      [Optional] If User sets isDeleted field value as true, System search all deleted test plans related to                      project                    &lt;br&gt;                      [Optional] If User sets isDeleted field value as false, System search all test plans related to project which                      are not deleted                    &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all v related to project  &lt;br&gt;System returns array of found test plans (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
Boolean isDeleted = true; // Boolean | Boolean flag which defines if search must include deleted test plans
try {
    List<TestPlanModel> result = apiInstance.getTestPlansByProjectId(projectId, isDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getTestPlansByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted test plans | [optional]

### Return type

[**List&lt;TestPlanModel&gt;**](TestPlanModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestRunsByProjectId"></a>
# **getTestRunsByProjectId**
> List&lt;TestRunV2GetModel&gt; getTestRunsByProjectId(projectId, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, , , , , )

Get TestRuns for Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all test runs related to project  &lt;br&gt;System returns array of found test runs (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
Boolean notStarted = true; // Boolean | 
Boolean inProgress = true; // Boolean | 
Boolean stopped = true; // Boolean | 
Boolean completed = true; // Boolean | 
OffsetDateTime createdDateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime createdDateTo = new OffsetDateTime(); // OffsetDateTime | 
UUID testPlanId = new UUID(); // UUID | 
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<TestRunV2GetModel> result = apiInstance.getTestRunsByProjectId(projectId, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getTestRunsByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **notStarted** | **Boolean**|  | [optional]
 **inProgress** | **Boolean**|  | [optional]
 **stopped** | **Boolean**|  | [optional]
 **completed** | **Boolean**|  | [optional]
 **createdDateFrom** | **OffsetDateTime**|  | [optional]
 **createdDateTo** | **OffsetDateTime**|  | [optional]
 **testPlanId** | [**UUID**](.md)|  | [optional]
 **** | [****](.md)| Amount of items to be skipped (offset) | [optional]
 **** | [****](.md)| Amount of items to be taken (limit) | [optional]
 **** | [****](.md)| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional]
 **** | [****](.md)| Property name for searching | [optional]
 **** | [****](.md)| Value for searching | [optional]

### Return type

[**List&lt;TestRunV2GetModel&gt;**](TestRunV2GetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkItemsByProjectId"></a>
# **getWorkItemsByProjectId**
> List&lt;WorkItemShortModel&gt; getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, , , , , )

Get WorkItems for Project by Id or GlobalId (if isDeleted is true, return deleted WorkItems)

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  &lt;br&gt;                      [Optional] If User sets isDeleted field value as false, System search all workitems related to project which                      are not deleted                    &lt;br&gt;If User did not set isDeleted field value, System search all  workitems related to project  &lt;br&gt;System returns array of found workitems (listed in response model)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
Boolean isDeleted = false; // Boolean | Boolean flag which defines if search must include deleted workitems
List<String> tagNames = Arrays.asList("tagNames_example"); // List<String> | Array of workitem tag names
Boolean includeIterations = true; // Boolean | 
  = new null(); //  | Amount of items to be skipped (offset)
  = new null(); //  | Amount of items to be taken (limit)
  = new null(); //  | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
  = new null(); //  | Property name for searching
  = new null(); //  | Value for searching
try {
    List<WorkItemShortModel> result = apiInstance.getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, , , , , );
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getWorkItemsByProjectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **isDeleted** | **Boolean**| Boolean flag which defines if search must include deleted workitems | [optional] [default to false]
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

<a name="importToExistingProject"></a>
# **importToExistingProject**
> importToExistingProject(projectId, file, apiVersion, includeAttachments)

Import to existing Project from json file.  Sections can be imported in only one target project!

&lt;br&gt;Use case  &lt;br&gt;User attaches project as json file taken from export or export-by-testPlans method  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | 
File file = new File("file_example"); // File | 
String apiVersion = "apiVersion_example"; // String | 
Boolean includeAttachments = false; // Boolean | 
try {
    apiInstance.importToExistingProject(projectId, file, apiVersion, includeAttachments);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#importToExistingProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **file** | **File**|  | [optional]
 **apiVersion** | **String**|  | [optional]
 **includeAttachments** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="restoreProject"></a>
# **restoreProject**
> restoreProject(projectId)

Restore Project by Id or GlobalId

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search and restores deleted project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
try {
    apiInstance.restoreProject(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#restoreProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomAttributeTestPlanProjectRelations"></a>
# **updateCustomAttributeTestPlanProjectRelations**
> updateCustomAttributeTestPlanProjectRelations(projectId, body)

Update project attribute for test plan

&lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | 
CustomAttributeTestPlanProjectRelationPutModel body = new CustomAttributeTestPlanProjectRelationPutModel(); // CustomAttributeTestPlanProjectRelationPutModel | 
try {
    apiInstance.updateCustomAttributeTestPlanProjectRelations(projectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateCustomAttributeTestPlanProjectRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **body** | [**CustomAttributeTestPlanProjectRelationPutModel**](CustomAttributeTestPlanProjectRelationPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> updateProject(body)

Update Project

&lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
ProjectPutModel body = new ProjectPutModel(); // ProjectPutModel | 
try {
    apiInstance.updateProject(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectPutModel**](ProjectPutModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="updateProjectsAttribute"></a>
# **updateProjectsAttribute**
> updateProjectsAttribute(projectId, body)

Update Projects Attribute

&lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System updates attribute related to the project  &lt;br&gt;System returns no content response

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project internal(guid format) or global(int  format) identifier
CustomAttributeModel body = new CustomAttributeModel(); // CustomAttributeModel | 
try {
    apiInstance.updateProjectsAttribute(projectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateProjectsAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project internal(guid format) or global(int  format) identifier |
 **body** | [**CustomAttributeModel**](CustomAttributeModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

