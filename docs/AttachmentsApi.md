# AttachmentsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAttachment**](AttachmentsApi.md#addAttachment) | **POST** /api/v2/attachments | Create attachment

<a name="addAttachment"></a>
# **addAttachment**
> String addAttachment(file, apiVersion)

Create attachment

&lt;br&gt;Use case  &lt;br&gt;User send file  &lt;br&gt;User runs method execution  &lt;br&gt;System upload file  &lt;br&gt;System create attachment  &lt;br&gt;System return attachment model (listed in response parameters)

### Example
```java
// Import classes:
//import ru.testit.invoker.ApiClient;
//import ru.testit.invoker.ApiException;
//import ru.testit.invoker.Configuration;
//import ru.testit.invoker.auth.*;
//import ru.testit.client.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer or PrivateToken
ApiKeyAuth Bearer or PrivateToken = (ApiKeyAuth) defaultClient.getAuthentication("Bearer or PrivateToken");
Bearer or PrivateToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer or PrivateToken.setApiKeyPrefix("Token");

AttachmentsApi apiInstance = new AttachmentsApi();
File file = new File("file_example"); // File | 
String apiVersion = "apiVersion_example"; // String | 
try {
    String result = apiInstance.addAttachment(file, apiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#addAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **apiVersion** | **String**|  | [optional]

### Return type

**String**

### Authorization

[Bearer or PrivateToken](../README.md#Bearer or PrivateToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

