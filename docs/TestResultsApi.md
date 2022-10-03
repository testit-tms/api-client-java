# TestResultsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2TestResultsIdAggregatedGet**](TestResultsApi.md#apiV2TestResultsIdAggregatedGet) | **GET** /api/v2/testResults/{id}/aggregated |  |
| [**apiV2TestResultsIdAttachmentsAttachmentIdPut**](TestResultsApi.md#apiV2TestResultsIdAttachmentsAttachmentIdPut) | **PUT** /api/v2/testResults/{id}/attachments/{attachmentId} |  |
| [**apiV2TestResultsIdAttachmentsInfoGet**](TestResultsApi.md#apiV2TestResultsIdAttachmentsInfoGet) | **GET** /api/v2/testResults/{id}/attachments/info |  |
| [**apiV2TestResultsIdGet**](TestResultsApi.md#apiV2TestResultsIdGet) | **GET** /api/v2/testResults/{id} |  |
| [**apiV2TestResultsIdPut**](TestResultsApi.md#apiV2TestResultsIdPut) | **PUT** /api/v2/testResults/{id} |  |
| [**apiV2TestResultsSearchPost**](TestResultsApi.md#apiV2TestResultsSearchPost) | **POST** /api/v2/testResults/search |  |
| [**apiV2TestResultsStatisticsFilterPost**](TestResultsApi.md#apiV2TestResultsStatisticsFilterPost) | **POST** /api/v2/testResults/statistics/filter |  |
| [**createAttachment**](TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{id}/attachments | Upload and link attachment to TestResult |
| [**deleteAttachment**](TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{id}/attachments/{attachmentId} | Remove attachment and unlink from TestResult |
| [**downloadAttachment**](TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId} | Get attachment of TestResult |
| [**getAttachment**](TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId}/info | Get Metadata of TestResult&#39;s attachment |
| [**getAttachments**](TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{id}/attachments | Get all attachments of TestResult |



## apiV2TestResultsIdAggregatedGet

> TestResultModel apiV2TestResultsIdAggregatedGet(id)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | 
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
| **id** | **UUID**|  | |

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


## apiV2TestResultsIdAttachmentsAttachmentIdPut

> apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | 
        UUID attachmentId = UUID.randomUUID(); // UUID | 
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
| **id** | **UUID**|  | |
| **attachmentId** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV2TestResultsIdAttachmentsInfoGet

> List&lt;AttachmentModel&gt; apiV2TestResultsIdAttachmentsInfoGet(id)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | 
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
| **id** | **UUID**|  | |

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


## apiV2TestResultsIdGet

> TestResultModel apiV2TestResultsIdGet(id)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | 
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
| **id** | **UUID**|  | |

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


## apiV2TestResultsIdPut

> apiV2TestResultsIdPut(id, testResultUpdateModel)



### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
        UUID id = UUID.randomUUID(); // UUID | 
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
| **id** | **UUID**|  | |
| **testResultUpdateModel** | [**TestResultUpdateModel**](TestResultUpdateModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## apiV2TestResultsSearchPost

> List&lt;TestResultShortGetModel&gt; apiV2TestResultsSearchPost(skip, take, orderBy, searchField, searchValue, testResultsFilterModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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


## apiV2TestResultsStatisticsFilterPost

> TestResultsStatisticsGetModel apiV2TestResultsStatisticsFilterPost(testResultsFilterModel)



### Example

```java
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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


## createAttachment

> UUID createAttachment(id, _file)

Upload and link attachment to TestResult

<br>Use case
<br>User sets testResultId
<br>User attaches a file
<br>System creates attachment and links it to the test result
<br>System returns attachment identifier

### Example

```java
import java.io.File;
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **400** | Bad Request |  -  |
| **403** | Update permission for test result required |  -  |
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** |  |  -  |
| **413** | Multipart body length limit exceeded (default constraint is one gigabyte) |  -  |


## deleteAttachment

> deleteAttachment(id, attachmentId)

Remove attachment and unlink from TestResult

<br>Use case
<br>User sets testResultId and attachmentId
<br>User attaches a file
<br>User runs method execution
<br>System deletes attachment and unlinks it from the test result
<br>System returns attachment identifier

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **204** | Successful operation |  -  |
| **403** | Update permission for test result required |  -  |


## downloadAttachment

> downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview)

Get attachment of TestResult

<br>Use case
<br>User sets attachmentId and testResultId
<br>[Optional] User sets resize configuration
<br>User runs method execution
<br>System search attachments by the attachmentId and the testResultId
<br>
                    [Optional] If resize configuration is set, System resizes the attachment according to the resize
                    configuration
                
<br>[Optional] Otherwise, System does not resize the attachment
<br>System returns attachment as a file

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
            apiInstance.downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview);
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
| **resizeType** | **ImageResizeType**| Type of resizing to apply to the result image | [optional] [enum: Crop, AddBackgroundStripes] |
| **backgroundColor** | **String**| Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; | [optional] |
| **preview** | **Boolean**| If image must be converted to a preview (lower quality, no animation) | [optional] |

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
| **404** | &lt;br&gt;File not found  &lt;br&gt;Attachment not found |  -  |
| **403** | Read permission for test result required |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **200** | Success |  -  |


## getAttachment

> AttachmentModel getAttachment(id, attachmentId)

Get Metadata of TestResult&#39;s attachment

<br>Use case
<br>User sets attachmentId and testResultId
<br>User runs method execution
<br>System search attachment by the attachmentId and the testResultId
<br>System returns attachment data

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **401** | Unauthorized |  -  |
| **404** | File not found |  -  |
| **403** | Read permission for test result required |  -  |
| **400** | Bad Request |  -  |


## getAttachments

> List&lt;AttachmentModel&gt; getAttachments(id)

Get all attachments of TestResult

<br>Use case
<br>User sets testResultId
<br>User runs method execution
<br>System search all attachments of the test result
<br>System returns attachments enumeration

### Example

```java
import java.util.UUID;
// Import classes:
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.auth.*;
import ru.testit.client.invoker.model.*;
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
| **401** | Unauthorized |  -  |
| **404** | TestResult not found |  -  |
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Read permission for test result required |  -  |

