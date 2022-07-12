# AutoTestResultsForTestRunModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationId** | [**UUID**](UUID.md) |  | 
**links** | [**List&lt;LinkPostModel&gt;**](LinkPostModel.md) |  |  [optional]
**failureReasonNames** | **List&lt;String&gt;** |  |  [optional]
**autoTestExternalId** | **String** | This property is used to set autotest identifier from client system | 
**outcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped | 
**message** | **String** |  |  [optional]
**traces** | **String** |  |  [optional]
**startedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**duration** | **Long** |  |  [optional]
**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  [optional]
**parameters** | **Map&lt;String, String&gt;** |  |  [optional]
**properties** | **Map&lt;String, String&gt;** |  |  [optional]
**stepResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional]
**setupResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional]
**teardownResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional]
