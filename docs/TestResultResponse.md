

# TestResultResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**stepComments** | [**List&lt;StepCommentApiModel&gt;**](StepCommentApiModel.md) |  |  [optional] |
|**failureClassIds** | **List&lt;UUID&gt;** |  |  |
|**outcome** | **TestResultOutcome** |  |  [optional] |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |
|**stepResults** | [**List&lt;StepResultApiModel&gt;**](StepResultApiModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) |  |  [optional] |
|**autoTestId** | **UUID** |  |  [optional] |
|**configurationId** | **UUID** |  |  |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**durationInMs** | **Long** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**failureType** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  |
|**testRunId** | **UUID** |  |  |
|**testPoint** | [**TestPoint**](TestPoint.md) |  |  [optional] |
|**autoTest** | [**AutoTest**](AutoTest.md) |  |  [optional] |
|**autoTestStepResults** | [**List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
|**setupResults** | [**List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
|**teardownResults** | [**List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
|**workItemVersionId** | **UUID** |  |  |
|**workItemVersionNumber** | **Integer** |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |



