

# WebHookPostModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Unique ID of the webhook project |  |
|**eventType** | **WebHookEventTypeModel** |  |  |
|**description** | **String** | Description of the webhook |  [optional] |
|**url** | **String** | Request URL of the webhook |  |
|**requestType** | **RequestTypeModel** |  |  |
|**shouldSendBody** | **Boolean** | Indicates if the webhook sends body |  |
|**headers** | **Map&lt;String, String&gt;** | Collection of the webhook headers |  |
|**queryParameters** | **Map&lt;String, String&gt;** | Collection of the webhook query parameters |  |
|**isEnabled** | **Boolean** | Indicates if the webhook is active |  |
|**shouldSendCustomBody** | **Boolean** | Indicates if the webhook sends custom body |  |
|**customBody** | **String** | Custom body of the webhook |  [optional] |
|**shouldReplaceParameters** | **Boolean** | Indicates if the webhook injects parameters |  |
|**shouldEscapeParameters** | **Boolean** | Indicates if the webhook escapes invalid characters in parameters |  |
|**name** | **String** | Name of the webhook |  |



