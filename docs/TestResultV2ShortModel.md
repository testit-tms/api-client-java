

# TestResultV2ShortModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**configurationId** | **UUID** |  |  [optional] |
|**workItemVersionId** | **UUID** |  |  [optional] |
|**autoTestId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  [optional] |
|**testPoint** | [**TestPointShortModel**](TestPointShortModel.md) |  |  [optional] |
|**testRunId** | **UUID** |  |  [optional] |
|**outcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |



