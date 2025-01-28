

# TestResultV2GetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_configuration** | [**ConfigurationModel**](ConfigurationModel.md) |  |  [optional] |
|**autoTest** | [**AutoTestModelV2GetModel**](AutoTestModelV2GetModel.md) |  |  [optional] |
|**id** | **UUID** |  |  |
|**configurationId** | **UUID** |  |  |
|**workItemVersionId** | **UUID** |  |  |
|**autoTestId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  [optional] |
|**testPoint** | [**TestPointShortModel**](TestPointShortModel.md) |  |  [optional] |
|**testRunId** | **UUID** |  |  |
|**outcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |



