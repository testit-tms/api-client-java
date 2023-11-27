# ProjectExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**export**](ProjectExportApi.md#export) | **POST** /api/v2/projects/{projectId}/export | Export project as JSON file |
| [**exportProjectJson**](ProjectExportApi.md#exportProjectJson) | **POST** /api/v2/projects/{projectId}/export/json | Export project as JSON file in background job |
| [**exportProjectWithTestPlansJson**](ProjectExportApi.md#exportProjectWithTestPlansJson) | **POST** /api/v2/projects/{projectId}/export/testPlans/json | Export project as JSON file with test plans in background job |
| [**exportProjectWithTestPlansZip**](ProjectExportApi.md#exportProjectWithTestPlansZip) | **POST** /api/v2/projects/{projectId}/export/testPlans/zip | Export project as Zip file with test plans in background job |
| [**exportProjectZip**](ProjectExportApi.md#exportProjectZip) | **POST** /api/v2/projects/{projectId}/export/zip | Export project as Zip file in background job |


<a id="export"></a>
# **export**
> File export(projectId, includeAttachments, exportProjectJsonRequest)

Export project as JSON file

&lt;br&gt;This method exports the selected project or its part (sections, work items) to a &#x60;.json&#x60; file.  &lt;br&gt;In the request body, you can specify sections and test cases to be exported.  &lt;br&gt;Example of a request to export two sections and two test cases:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain}.com/api/v2/projects/27a32ce6-d972-4ef8-bef5-51be4bf9e468/export\&quot; \\              -H \&quot;accept: application/json\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: application/json-patch+json\&quot; \\              -d \&quot;{\\\&quot;sectionIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;9fa85f64-5717-4562-b3fc-2c963f66a000\\\&quot;],\\\&quot;workItemIds\\\&quot;:[\\\&quot;3fa85f64-5717-4562-b3fc-2c963f66afa6\\\&quot;,\\\&quot;90085f64-5717-4562-b3fc-2c963f66a000\\\&quot;]}\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;In the response, you get:  &lt;br&gt;              - A &#x60;.zip&#x60; file with attachments and a.json file if you enable attachments export.&lt;br /&gt;              - A &#x60;.json&#x60; file with the project if you do not enable attachments export.              

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectExportApi apiInstance = new ProjectExportApi(defaultClient);
    String projectId = "projectId_example"; // String | Specifies the ID of the project you want to export.
    Boolean includeAttachments = false; // Boolean | Enables attachment export.
    ExportProjectJsonRequest exportProjectJsonRequest = new ExportProjectJsonRequest(); // ExportProjectJsonRequest | 
    try {
      File result = apiInstance.export(projectId, includeAttachments, exportProjectJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectExportApi#export");
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
| **projectId** | **String**| Specifies the ID of the project you want to export. | |
| **includeAttachments** | **Boolean**| Enables attachment export. | [optional] [default to false] |
| **exportProjectJsonRequest** | [**ExportProjectJsonRequest**](ExportProjectJsonRequest.md)|  | [optional] |

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
| **403** | Update permission for project settings is required |  -  |
| **400** | Root section was not found |  -  |

<a id="exportProjectJson"></a>
# **exportProjectJson**
> UUID exportProjectJson(projectId, timeZoneOffsetInMinutes, exportProjectJsonRequest)

Export project as JSON file in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectExportApi apiInstance = new ProjectExportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Long timeZoneOffsetInMinutes = 56L; // Long | 
    ExportProjectJsonRequest exportProjectJsonRequest = new ExportProjectJsonRequest(); // ExportProjectJsonRequest | 
    try {
      UUID result = apiInstance.exportProjectJson(projectId, timeZoneOffsetInMinutes, exportProjectJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectExportApi#exportProjectJson");
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
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |
| **exportProjectJsonRequest** | [**ExportProjectJsonRequest**](ExportProjectJsonRequest.md)|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |

<a id="exportProjectWithTestPlansJson"></a>
# **exportProjectWithTestPlansJson**
> UUID exportProjectWithTestPlansJson(projectId, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest)

Export project as JSON file with test plans in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectExportApi apiInstance = new ProjectExportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Long timeZoneOffsetInMinutes = 56L; // Long | 
    ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest = new ExportProjectWithTestPlansJsonRequest(); // ExportProjectWithTestPlansJsonRequest | 
    try {
      UUID result = apiInstance.exportProjectWithTestPlansJson(projectId, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectExportApi#exportProjectWithTestPlansJson");
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
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |
| **exportProjectWithTestPlansJsonRequest** | [**ExportProjectWithTestPlansJsonRequest**](ExportProjectWithTestPlansJsonRequest.md)|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |

<a id="exportProjectWithTestPlansZip"></a>
# **exportProjectWithTestPlansZip**
> UUID exportProjectWithTestPlansZip(projectId, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest)

Export project as Zip file with test plans in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectExportApi apiInstance = new ProjectExportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Long timeZoneOffsetInMinutes = 56L; // Long | 
    ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest = new ExportProjectWithTestPlansJsonRequest(); // ExportProjectWithTestPlansJsonRequest | 
    try {
      UUID result = apiInstance.exportProjectWithTestPlansZip(projectId, timeZoneOffsetInMinutes, exportProjectWithTestPlansJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectExportApi#exportProjectWithTestPlansZip");
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
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |
| **exportProjectWithTestPlansJsonRequest** | [**ExportProjectWithTestPlansJsonRequest**](ExportProjectWithTestPlansJsonRequest.md)|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |

<a id="exportProjectZip"></a>
# **exportProjectZip**
> UUID exportProjectZip(projectId, timeZoneOffsetInMinutes, exportProjectJsonRequest)

Export project as Zip file in background job

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.ProjectExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    ProjectExportApi apiInstance = new ProjectExportApi(defaultClient);
    String projectId = "projectId_example"; // String | Project internal (UUID) or global (integer) identifier
    Long timeZoneOffsetInMinutes = 56L; // Long | 
    ExportProjectJsonRequest exportProjectJsonRequest = new ExportProjectJsonRequest(); // ExportProjectJsonRequest | 
    try {
      UUID result = apiInstance.exportProjectZip(projectId, timeZoneOffsetInMinutes, exportProjectJsonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectExportApi#exportProjectZip");
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
| **timeZoneOffsetInMinutes** | **Long**|  | [optional] |
| **exportProjectJsonRequest** | [**ExportProjectJsonRequest**](ExportProjectJsonRequest.md)|  | [optional] |

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Update permission for project settings is required |  -  |

