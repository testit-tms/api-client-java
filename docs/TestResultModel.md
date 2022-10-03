

# TestResultModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoTestId** | **UUID** |  |  [optional] |
|**configurationId** | **UUID** |  |  [optional] |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**durationInMs** | **Long** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**failureType** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  [optional] |
|**testRunId** | **UUID** |  |  [optional] |
|**testPoint** | [**TestPointPutModel**](TestPointPutModel.md) |  |  [optional] |
|**autoTest** | [**AutoTestModel**](AutoTestModel.md) |  |  [optional] |
|**autoTestStepResults** | [**List&lt;AttachmentModelAutoTestStepResultsModel&gt;**](AttachmentModelAutoTestStepResultsModel.md) |  |  [optional] |
|**setupResults** | [**List&lt;AttachmentModelAutoTestStepResultsModel&gt;**](AttachmentModelAutoTestStepResultsModel.md) |  |  [optional] |
|**teardownResults** | [**List&lt;AttachmentModelAutoTestStepResultsModel&gt;**](AttachmentModelAutoTestStepResultsModel.md) |  |  [optional] |
|**workItemVersionId** | **UUID** |  |  [optional] |
|**workItemVersionNumber** | **Integer** |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**stepComments** | [**List&lt;StepCommentModel&gt;**](StepCommentModel.md) |  |  [optional] |
|**failureClassIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**outcome** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**stepResults** | [**List&lt;StepResultModel&gt;**](StepResultModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |



