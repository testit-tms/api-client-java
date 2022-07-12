# TestResultV2GetModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_configuration** | [**ConfigurationModel**](ConfigurationModel.md) |  |  [optional]
**autoTest** | [**AutoTestModelV2GetModel**](AutoTestModelV2GetModel.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**configurationId** | [**UUID**](UUID.md) |  |  [optional]
**workItemVersionId** | [**UUID**](UUID.md) |  |  [optional]
**autoTestId** | [**UUID**](UUID.md) |  |  [optional]
**message** | **String** |  |  [optional]
**traces** | **String** |  |  [optional]
**startedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**runByUserId** | [**UUID**](UUID.md) |  |  [optional]
**stoppedByUserId** | [**UUID**](UUID.md) |  |  [optional]
**testPointId** | [**UUID**](UUID.md) |  |  [optional]
**testPoint** | [**TestPointShortModel**](TestPointShortModel.md) |  |  [optional]
**testRunId** | [**UUID**](UUID.md) |  |  [optional]
**outcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  [optional]
**comment** | **String** |  |  [optional]
**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional]
**parameters** | **Map&lt;String, String&gt;** |  |  [optional]
**properties** | **Map&lt;String, String&gt;** |  |  [optional]
