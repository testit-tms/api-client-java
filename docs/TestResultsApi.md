# TestResultsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachment**](TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{testResultId}/attachments | Upload and link attachment to TestResult
[**deleteAttachment**](TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{testResultId}/attachments/{attachmentId} | Remove attachment and unlink from TestResult
[**downloadAttachment**](TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{testResultId}/attachments/{attachmentId} | Get attachment of TestResult
[**getAttachment**](TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{testResultId}/attachments/{attachmentId}/info | Get Metadata of TestResult&#x27;s attachment
[**getAttachments**](TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{testResultId}/attachments | Get all attachments of TestResult
[**setAutoTestResults**](TestResultsApi.md#setAutoTestResults) | **POST** /api/v2/testResults | Set result for AutoTest (Obsolete).  The new endpoint is [POST]/api/v2/testRuns/{testRunId}/testResults

<a name="createAttachment"></a>
# **createAttachment**
> UUID createAttachment(testResultId, file)

Upload and link attachment to TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User attaches a file  &lt;br&gt;System creates attachment and links it to the test result  &lt;br&gt;System returns attachment identifier

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
UUID testResultId = new UUID(); // UUID | Test result internal identifier (guid format)
File file = new File("file_example"); // File | 
try {
    UUID result = apiInstance.createAttachment(testResultId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#createAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testResultId** | [**UUID**](.md)| Test result internal identifier (guid format) |
 **file** | **File**|  | [optional]

### Return type

[**UUID**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(testResultId, attachmentId)

Remove attachment and unlink from TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId and attachmentId  &lt;br&gt;User attaches a file  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes attachment and unlinks it from the test result  &lt;br&gt;System returns attachment identifier

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
UUID testResultId = new UUID(); // UUID | Test result internal identifier (guid format)
UUID attachmentId = new UUID(); // UUID | Attachment internal identifier (guid format)
try {
    apiInstance.deleteAttachment(testResultId, attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#deleteAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testResultId** | [**UUID**](.md)| Test result internal identifier (guid format) |
 **attachmentId** | [**UUID**](.md)| Attachment internal identifier (guid format) |

### Return type

null (empty response body)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadAttachment"></a>
# **downloadAttachment**
> File downloadAttachment(attachmentId, testResultId, width, height, resizeOption, backgroundColor)

Get attachment of TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;[Optional] User sets resize configuration  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachments by the attachmentId and the testResultId  &lt;br&gt;                      [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                    &lt;br&gt;[Optional] Otherwise, System does not resize the attachment  &lt;br&gt;System returns attachment as a file

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
UUID attachmentId = new UUID(); // UUID | Attachment internal identifier (guid format)
UUID testResultId = new UUID(); // UUID | Test result internal identifier (guid format)
Integer width = 56; // Integer | 
Integer height = 56; // Integer | 
ImageResizeOption resizeOption = new ImageResizeOption(); // ImageResizeOption | 
String backgroundColor = "backgroundColor_example"; // String | 
try {
    File result = apiInstance.downloadAttachment(attachmentId, testResultId, width, height, resizeOption, backgroundColor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#downloadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | [**UUID**](.md)| Attachment internal identifier (guid format) |
 **testResultId** | [**UUID**](.md)| Test result internal identifier (guid format) |
 **width** | **Integer**|  | [optional]
 **height** | **Integer**|  | [optional]
 **resizeOption** | [**ImageResizeOption**](.md)|  | [optional]
 **backgroundColor** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachment"></a>
# **getAttachment**
> AttachmentModel getAttachment(attachmentId, testResultId)

Get Metadata of TestResult&#x27;s attachment

&lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachment by the attachmentId and the testResultId  &lt;br&gt;System returns attachment data

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
UUID attachmentId = new UUID(); // UUID | Attachment internal identifier (guid format)
UUID testResultId = new UUID(); // UUID | Test result internal identifier (guid format)
try {
    AttachmentModel result = apiInstance.getAttachment(attachmentId, testResultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#getAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | [**UUID**](.md)| Attachment internal identifier (guid format) |
 **testResultId** | [**UUID**](.md)| Test result internal identifier (guid format) |

### Return type

[**AttachmentModel**](AttachmentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachments"></a>
# **getAttachments**
> List&lt;AttachmentModel&gt; getAttachments(testResultId)

Get all attachments of TestResult

&lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search all attachments of the test result  &lt;br&gt;System returns attachments enumeration

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
UUID testResultId = new UUID(); // UUID | Test result internal identifier (guid format)
try {
    List<AttachmentModel> result = apiInstance.getAttachments(testResultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#getAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testResultId** | [**UUID**](.md)| Test result internal identifier (guid format) |

### Return type

[**List&lt;AttachmentModel&gt;**](AttachmentModel.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setAutoTestResults"></a>
# **setAutoTestResults**
> List&lt;UUID&gt; setAutoTestResults(body)

Set result for AutoTest (Obsolete).  The new endpoint is [POST]/api/v2/testRuns/{testRunId}/testResults

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.TestResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

TestResultsApi apiInstance = new TestResultsApi();
AutoTestResultPostModel body = new AutoTestResultPostModel(); // AutoTestResultPostModel | 
try {
    List<UUID> result = apiInstance.setAutoTestResults(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestResultsApi#setAutoTestResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoTestResultPostModel**](AutoTestResultPostModel.md)|  | [optional]

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

