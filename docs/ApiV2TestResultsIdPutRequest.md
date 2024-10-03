

# ApiV2TestResultsIdPutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failureClassIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**outcome** | **TestResultOutcome** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**stepResults** | [**List&lt;StepResultModel&gt;**](StepResultModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  [optional] |
|**durationInMs** | **Long** |  |  [optional] |
|**duration** | **Long** |  |  [optional] |
|**stepComments** | [**List&lt;TestResultStepCommentPutModel&gt;**](TestResultStepCommentPutModel.md) |  |  [optional] |
|**setupResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional] |
|**teardownResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**trace** | **String** |  |  [optional] |



