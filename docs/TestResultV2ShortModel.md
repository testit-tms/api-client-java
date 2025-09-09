

# TestResultV2ShortModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**configurationId** | **UUID** |  |  |
|**workItemVersionId** | **UUID** |  |  |
|**testRunId** | **UUID** |  |  |
|**outcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  |
|**autoTestId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  [optional] |
|**testPoint** | [**TestPointShortModel**](TestPointShortModel.md) |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |



