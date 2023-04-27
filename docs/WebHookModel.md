

# WebHookModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the webhook |  [optional] |
|**eventType** | **WebHookEventTypeModel** |  |  |
|**description** | **String** | Description of the webhook |  [optional] |
|**url** | **String** | Url to which the webhook sends request |  [optional] |
|**requestType** | **RequestTypeModel** |  |  |
|**shouldSendBody** | **Boolean** | Indicates if the webhook sends body |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | Collection of headers which the webhook sends |  [optional] |
|**queryParameters** | **Map&lt;String, String&gt;** | Collection of query parameters which the webhook sends |  [optional] |
|**isEnabled** | **Boolean** | Indicates if the webhook is active |  [optional] |
|**shouldSendCustomBody** | **Boolean** | Indicates if the webhook sends custom body |  [optional] |
|**customBody** | **String** | Custom body of the webhook |  [optional] |
|**customBodyMediaType** | **String** | MIME type of body of the webhook |  [optional] |
|**shouldReplaceParameters** | **Boolean** | Indicates if the webhook injects parameters |  [optional] |
|**shouldEscapeParameters** | **Boolean** | Indicates if the webhook escapes invalid characters in parameters |  [optional] |
|**createdDate** | **OffsetDateTime** | Creation date of the webhook |  [optional] |
|**createdById** | **UUID** | Unique ID of user who created the webhook |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the webhook |  [optional] |
|**modifiedById** | **UUID** | Unique ID of user who modified the webhook last time |  [optional] |
|**projectId** | **UUID** | Unique ID of project where the webhook is located |  [optional] |
|**id** | **UUID** | Unique ID of the entity |  [optional] |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  [optional] |



