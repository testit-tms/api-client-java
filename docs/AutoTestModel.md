# AutoTestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalId** | **Long** |  |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**mustBeApproved** | **Boolean** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdById** | [**UUID**](UUID.md) |  |  [optional]
**modifiedById** | [**UUID**](UUID.md) |  |  [optional]
**lastTestRunId** | [**UUID**](UUID.md) |  |  [optional]
**lastTestRunName** | **String** |  |  [optional]
**lastTestResultId** | [**UUID**](UUID.md) |  |  [optional]
**lastTestResultOutcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  [optional]
**stabilityPercentage** | **Integer** |  |  [optional]
**externalId** | **String** | This property is used to set autotest identifier from client system | 
**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  |  [optional]
**projectId** | [**UUID**](UUID.md) | This property is used to link autotest with project | 
**name** | **String** |  | 
**namespace** | **String** |  |  [optional]
**classname** | **String** |  |  [optional]
**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**labels** | [**List&lt;LabelShortModel&gt;**](LabelShortModel.md) |  |  [optional]
**isFlaky** | **Boolean** |  |  [optional]
