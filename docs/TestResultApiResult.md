

# TestResultApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**durationInMs** | **Long** |  |  [optional] |
|**traces** | **String** |  |  [optional] |
|**failureType** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**outcome** | **String** |  |  |
|**autoTestId** | **UUID** |  |  [optional] |
|**testPointId** | **UUID** |  |  [optional] |
|**testRunId** | **UUID** |  |  |
|**configurationId** | **UUID** |  |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
|**testPoint** | [**TestPointShortApiResult**](TestPointShortApiResult.md) |  |  [optional] |
|**autoTest** | [**AutoTestApiResult**](AutoTestApiResult.md) |  |  [optional] |
|**autoTestStepResults** | [**List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
|**setupResults** | [**List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
|**teardownResults** | [**List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
|**workItemVersionId** | **UUID** |  |  [optional] |
|**workItemVersionNumber** | **Integer** |  |  [optional] |
|**attachments** | [**List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) |  |  |
|**links** | [**List&lt;LinkApiResult&gt;**](LinkApiResult.md) |  |  |
|**failureClasses** | [**List&lt;TestResultFailureClassApiResult&gt;**](TestResultFailureClassApiResult.md) |  |  |
|**stepComments** | [**List&lt;StepCommentApiModel&gt;**](StepCommentApiModel.md) |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**properties** | **Map&lt;String, String&gt;** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  |



