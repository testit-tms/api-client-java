# TestResultsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TestResultsIdAggregatedGet**](TestResultsApi.md#apiV2TestResultsIdAggregatedGet) | **GET** /api/v2/testResults/{id}/aggregated | Get test result by ID aggregated with previous results |
| [**apiV2TestResultsIdAttachmentsAttachmentIdPut**](TestResultsApi.md#apiV2TestResultsIdAttachmentsAttachmentIdPut) | **PUT** /api/v2/testResults/{id}/attachments/{attachmentId} | Attach file to the test result |
| [**apiV2TestResultsIdAttachmentsInfoGet**](TestResultsApi.md#apiV2TestResultsIdAttachmentsInfoGet) | **GET** /api/v2/testResults/{id}/attachments/info | Get test result attachments meta-information |
| [**apiV2TestResultsIdGet**](TestResultsApi.md#apiV2TestResultsIdGet) | **GET** /api/v2/testResults/{id} | Get test result by ID |
| [**apiV2TestResultsIdPut**](TestResultsApi.md#apiV2TestResultsIdPut) | **PUT** /api/v2/testResults/{id} | Edit test result by ID |
| [**apiV2TestResultsSearchPost**](TestResultsApi.md#apiV2TestResultsSearchPost) | **POST** /api/v2/testResults/search | Search for test results |
| [**apiV2TestResultsStatisticsFilterPost**](TestResultsApi.md#apiV2TestResultsStatisticsFilterPost) | **POST** /api/v2/testResults/statistics/filter | Search for test results and extract statistics |
| [**createAttachment**](TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{id}/attachments | Upload and link attachment to TestResult |
| [**deleteAttachment**](TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{id}/attachments/{attachmentId} | Remove attachment and unlink from TestResult |
| [**downloadAttachment**](TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId} | Get attachment of TestResult |
| [**getAttachment**](TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId}/info | Get Metadata of TestResult&#39;s attachment |
| [**getAttachments**](TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{id}/attachments | Get all attachments of TestResult |


<a id="apiV2TestResultsIdAggregatedGet"></a>
# **apiV2TestResultsIdAggregatedGet**
> TestResultModel apiV2TestResultsIdAggregatedGet(id)

Get test result by ID aggregated with previous results

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test result unique ID
    try {
      TestResultModel result = apiInstance.apiV2TestResultsIdAggregatedGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsIdAggregatedGet");
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
| **id** | **UUID**| Test result unique ID | |

### Return type

[**TestResultModel**](TestResultModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for the test result is required |  -  |

<a id="apiV2TestResultsIdAttachmentsAttachmentIdPut"></a>
# **apiV2TestResultsIdAttachmentsAttachmentIdPut**
> apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId)

Attach file to the test result

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test result unique ID
    UUID attachmentId = UUID.randomUUID(); // UUID | Attachment unique ID
    try {
      apiInstance.apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsIdAttachmentsAttachmentIdPut");
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
| **id** | **UUID**| Test result unique ID | |
| **attachmentId** | **UUID**| Attachment unique ID | |

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
| **403** | Only edits from assigned user are allowed |  -  |

<a id="apiV2TestResultsIdAttachmentsInfoGet"></a>
# **apiV2TestResultsIdAttachmentsInfoGet**
> List&lt;AttachmentModel&gt; apiV2TestResultsIdAttachmentsInfoGet(id)

Get test result attachments meta-information

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test result unique ID
    try {
      List<AttachmentModel> result = apiInstance.apiV2TestResultsIdAttachmentsInfoGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsIdAttachmentsInfoGet");
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
| **id** | **UUID**| Test result unique ID | |

### Return type

[**List&lt;AttachmentModel&gt;**](AttachmentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for the test result is required |  -  |

<a id="apiV2TestResultsIdGet"></a>
# **apiV2TestResultsIdGet**
> TestResultModel apiV2TestResultsIdGet(id)

Get test result by ID

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test result unique ID
    try {
      TestResultModel result = apiInstance.apiV2TestResultsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsIdGet");
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
| **id** | **UUID**| Test result unique ID | |

### Return type

[**TestResultModel**](TestResultModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for the test result is required |  -  |

<a id="apiV2TestResultsIdPut"></a>
# **apiV2TestResultsIdPut**
> apiV2TestResultsIdPut(id, testResultUpdateModel)

Edit test result by ID

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Test result unique ID
    TestResultUpdateModel testResultUpdateModel = new TestResultUpdateModel(); // TestResultUpdateModel | 
    try {
      apiInstance.apiV2TestResultsIdPut(id, testResultUpdateModel);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsIdPut");
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
| **id** | **UUID**| Test result unique ID | |
| **testResultUpdateModel** | [**TestResultUpdateModel**](TestResultUpdateModel.md)|  | [optional] |

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
| **403** | Only edits from assigned user are allowed |  -  |

<a id="apiV2TestResultsSearchPost"></a>
# **apiV2TestResultsSearchPost**
> List&lt;TestResultShortGetModel&gt; apiV2TestResultsSearchPost(skip, take, orderBy, searchField, searchValue, testResultsFilterModel)

Search for test results

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    Integer skip = 56; // Integer | Amount of items to be skipped (offset)
    Integer take = 56; // Integer | Amount of items to be taken (limit)
    String orderBy = "orderBy_example"; // String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
    String searchField = "searchField_example"; // String | Property name for searching
    String searchValue = "searchValue_example"; // String | Value for searching
    TestResultsFilterModel testResultsFilterModel = new TestResultsFilterModel(); // TestResultsFilterModel | 
    try {
      List<TestResultShortGetModel> result = apiInstance.apiV2TestResultsSearchPost(skip, take, orderBy, searchField, searchValue, testResultsFilterModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsSearchPost");
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
| **testResultsFilterModel** | [**TestResultsFilterModel**](TestResultsFilterModel.md)|  | [optional] |

### Return type

[**List&lt;TestResultShortGetModel&gt;**](TestResultShortGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  |
| **403** | Read permission for all requested test runs is required |  -  |

<a id="apiV2TestResultsStatisticsFilterPost"></a>
# **apiV2TestResultsStatisticsFilterPost**
> TestResultsStatisticsGetModel apiV2TestResultsStatisticsFilterPost(testResultsFilterModel)

Search for test results and extract statistics

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    TestResultsFilterModel testResultsFilterModel = new TestResultsFilterModel(); // TestResultsFilterModel | 
    try {
      TestResultsStatisticsGetModel result = apiInstance.apiV2TestResultsStatisticsFilterPost(testResultsFilterModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#apiV2TestResultsStatisticsFilterPost");
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
| **testResultsFilterModel** | [**TestResultsFilterModel**](TestResultsFilterModel.md)|  | [optional] |

### Return type

[**TestResultsStatisticsGetModel**](TestResultsStatisticsGetModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Read permission for all requested test runs is required |  -  |

<a id="createAttachment"></a>
# **createAttachment**
> UUID createAttachment(id, _file)

Upload and link attachment to TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User attaches a file  &lt;br&gt;System creates attachment and links it to the test result  &lt;br&gt;System returns attachment identifier

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test result internal identifier (guid format)
    File _file = new File("/path/to/file"); // File | Select file
    try {
      UUID result = apiInstance.createAttachment(id, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#createAttachment");
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
| **id** | **UUID**| Test result internal identifier (guid format) | |
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
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Update permission for test result required |  -  |
| **404** |  |  -  |
| **413** | Multipart body length limit exceeded (default constraint is one gigabyte) |  -  |

<a id="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(id, attachmentId)

Remove attachment and unlink from TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId and attachmentId  &lt;br&gt;User attaches a file  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes attachment and unlinks it from the test result  &lt;br&gt;System returns attachment identifier

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test result internal identifier (guid format)
    UUID attachmentId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Attachment internal identifier (guid format)
    try {
      apiInstance.deleteAttachment(id, attachmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#deleteAttachment");
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
| **id** | **UUID**| Test result internal identifier (guid format) | |
| **attachmentId** | **UUID**| Attachment internal identifier (guid format) | |

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
| **403** | Update permission for test result required |  -  |

<a id="downloadAttachment"></a>
# **downloadAttachment**
> File downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview)

Get attachment of TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;[Optional] User sets resize configuration  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachments by the attachmentId and the testResultId  &lt;br&gt;                      [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                    &lt;br&gt;[Optional] Otherwise, System does not resize the attachment  &lt;br&gt;System returns attachment as a file

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID attachmentId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Attachment internal identifier (guid format)
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test result internal identifier (guid format)
    Integer width = 56; // Integer | Width of the result image
    Integer height = 56; // Integer | Height of the result image
    ImageResizeType resizeType = ImageResizeType.fromValue("Crop"); // ImageResizeType | Type of resizing to apply to the result image
    String backgroundColor = "backgroundColor_example"; // String | Color of the background if the `resizeType` is `AddBackgroundStripes`
    Boolean preview = true; // Boolean | If image must be converted to a preview (lower quality, no animation)
    try {
      File result = apiInstance.downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#downloadAttachment");
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
| **attachmentId** | **UUID**| Attachment internal identifier (guid format) | |
| **id** | **UUID**| Test result internal identifier (guid format) | |
| **width** | **Integer**| Width of the result image | [optional] |
| **height** | **Integer**| Height of the result image | [optional] |
| **resizeType** | [**ImageResizeType**](.md)| Type of resizing to apply to the result image | [optional] [enum: Crop, AddBackgroundStripes] |
| **backgroundColor** | **String**| Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; | [optional] |
| **preview** | **Boolean**| If image must be converted to a preview (lower quality, no animation) | [optional] |

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test result required |  -  |
| **404** | &lt;br&gt;File not found  &lt;br&gt;Attachment not found |  -  |

<a id="getAttachment"></a>
# **getAttachment**
> AttachmentModel getAttachment(id, attachmentId)

Get Metadata of TestResult&#39;s attachment

&lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachment by the attachmentId and the testResultId  &lt;br&gt;System returns attachment data

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test result internal identifier (guid format)
    UUID attachmentId = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Attachment internal identifier (guid format)
    try {
      AttachmentModel result = apiInstance.getAttachment(id, attachmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#getAttachment");
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
| **id** | **UUID**| Test result internal identifier (guid format) | |
| **attachmentId** | **UUID**| Attachment internal identifier (guid format) | |

### Return type

[**AttachmentModel**](AttachmentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Read permission for test result required |  -  |
| **404** | File not found |  -  |

<a id="getAttachments"></a>
# **getAttachments**
> List&lt;AttachmentModel&gt; getAttachments(id)

Get all attachments of TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search all attachments of the test result  &lt;br&gt;System returns attachments enumeration

### Example
```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.models.*;
import ru.testit.client.api.TestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: Bearer or PrivateToken
    ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
    Bearer or PrivateToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer or PrivateToken.setApiKeyPrefix("Token");

    TestResultsApi apiInstance = new TestResultsApi(defaultClient);
    UUID id = UUID.fromString("3fa85f64-5717-4562-b3fc-2c963f66afa6"); // UUID | Test result internal identifier (guid format)
    try {
      List<AttachmentModel> result = apiInstance.getAttachments(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestResultsApi#getAttachments");
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
| **id** | **UUID**| Test result internal identifier (guid format) | |

### Return type

[**List&lt;AttachmentModel&gt;**](AttachmentModel.md)

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
| **403** | Read permission for test result required |  -  |
| **404** | TestResult not found |  -  |

