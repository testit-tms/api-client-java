

# TestResultUpdateV2Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failureClassIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**outcome** | **TestResultOutcome** |  |  [optional] |
|**statusCode** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |
|**stepResults** | [**List&lt;StepResultApiModel&gt;**](StepResultApiModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentUpdateRequest&gt;**](AttachmentUpdateRequest.md) |  |  [optional] |
|**durationInMs** | **Long** |  |  [optional] |
|**duration** | **Long** |  |  [optional] |
|**stepComments** | [**List&lt;TestResultStepCommentUpdateRequest&gt;**](TestResultStepCommentUpdateRequest.md) |  |  [optional] |
|**setupResults** | [**List&lt;AutoTestStepResultUpdateRequest&gt;**](AutoTestStepResultUpdateRequest.md) |  |  [optional] |
|**teardownResults** | [**List&lt;AutoTestStepResultUpdateRequest&gt;**](AutoTestStepResultUpdateRequest.md) |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**trace** | **String** |  |  [optional] |



