# ProjectImportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**backgroundImportToExistingProject**](ProjectImportApi.md#backgroundImportToExistingProject) | **POST** /api/v2/projects/{projectId}/import/json | Import project from JSON file into existing project in background job |
| [**backgroundImportZipToExistingProject**](ProjectImportApi.md#backgroundImportZipToExistingProject) | **POST** /api/v2/projects/{projectId}/import/zip | Import project from Zip file into existing project in background job |
| [**importToExistingProject**](ProjectImportApi.md#importToExistingProject) | **POST** /api/v2/projects/{projectId}/import | Import project from JSON file into existing project |


<a id="backgroundImportToExistingProject"></a>
# **backgroundImportToExistingProject**
> UUID backgroundImportToExistingProject(projectId, _file)

Import project from JSON file into existing project in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectImportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectImportApi apiInstance = new ProjectImportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    File _file = new File("/path/to/file"); // File | Select file
    try {
      UUID result = apiInstance.backgroundImportToExistingProject(projectId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectImportApi#backgroundImportToExistingProject");
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
| **_file** | **File**| Select file | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="backgroundImportZipToExistingProject"></a>
# **backgroundImportZipToExistingProject**
> UUID backgroundImportZipToExistingProject(projectId, _file)

Import project from Zip file into existing project in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectImportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectImportApi apiInstance = new ProjectImportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    File _file = new File("/path/to/file"); // File | Select file
    try {
      UUID result = apiInstance.backgroundImportZipToExistingProject(projectId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectImportApi#backgroundImportZipToExistingProject");
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
| **_file** | **File**| Select file | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings required |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

<a id="importToExistingProject"></a>
# **importToExistingProject**
> importToExistingProject(projectId, includeAttachments, _file)

Import project from JSON file into existing project

 Use case   User attaches project as json file taken from export or export-by-testPlans method   User runs method execution   System updates project   System returns no content response

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectImportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectImportApi apiInstance = new ProjectImportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Boolean includeAttachments = true; // Boolean | 
    File _file = new File("/path/to/file"); // File | Select file
    try {
      apiInstance.importToExistingProject(projectId, includeAttachments, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectImportApi#importToExistingProject");
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
| **204** | No Content |  -  |
| **413** | Multipart body length limit exceeded |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for project settings required |  -  |
| **404** | File not found |  -  |
| **409** | Entity with same id already imported in other project |  -  |
| **422** | Unprocessable Entity |  -  |

