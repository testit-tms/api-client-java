# WorkItemModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionId** | [**UUID**](UUID.md) | used for versioning changes in workitem |  [optional]
**medianDuration** | **Long** | used for getting a median duration of all autotests related to this workitem |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**projectId** | [**UUID**](UUID.md) |  |  [optional]
**entityTypeName** | [**WorkItemEntityTypes**](WorkItemEntityTypes.md) |  | 
**isAutomated** | **Boolean** |  |  [optional]
**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional]
**sectionPreconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional]
**sectionPostconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional]
**versionNumber** | **Integer** | used for define chronology of workitem state in each version |  [optional]
**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdById** | [**UUID**](UUID.md) |  |  [optional]
**modifiedById** | [**UUID**](UUID.md) |  |  [optional]
**globalId** | **Long** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**sectionId** | [**UUID**](UUID.md) |  |  [optional]
**description** | **String** |  |  [optional]
**state** | [**WorkItemStates**](WorkItemStates.md) |  | 
**priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  | 
**steps** | [**List&lt;StepModel&gt;**](StepModel.md) |  | 
**preconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  | 
**postconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  | 
**duration** | **Integer** |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  | 
**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  | 
**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  | 
**name** | **String** |  | 
