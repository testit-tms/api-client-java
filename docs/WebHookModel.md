

# WebHookModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the webhook |  |
|**eventType** | **WebHookEventTypeModel** | Type of event which triggers the webhook |  |
|**url** | **String** | Url to which the webhook sends request |  |
|**requestType** | **RequestTypeModel** | Method which the webhook uses |  |
|**shouldSendBody** | **Boolean** | Indicates if the webhook sends body |  |
|**isEnabled** | **Boolean** | Indicates if the webhook is active |  |
|**shouldSendCustomBody** | **Boolean** | Indicates if the webhook sends custom body |  |
|**shouldReplaceParameters** | **Boolean** | Indicates if the webhook injects parameters |  |
|**shouldEscapeParameters** | **Boolean** | Indicates if the webhook escapes invalid characters in parameters |  |
|**createdDate** | **OffsetDateTime** | Creation date of the webhook |  |
|**createdById** | **UUID** | Unique ID of user who created the webhook |  |
|**projectId** | **UUID** | Unique ID of project where the webhook is located |  |
|**id** | **UUID** | Unique ID of the entity |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |
|**description** | **String** | Description of the webhook |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | Collection of headers which the webhook sends |  [optional] |
|**queryParameters** | **Map&lt;String, String&gt;** | Collection of query parameters which the webhook sends |  [optional] |
|**customBody** | **String** | Custom body of the webhook |  [optional] |
|**customBodyMediaType** | **String** | MIME type of body of the webhook |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the webhook |  [optional] |
|**modifiedById** | **UUID** | Unique ID of user who modified the webhook last time |  [optional] |



