# WorkItemPutModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  | 
**iterations** | [**List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional]
**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**sectionId** | [**UUID**](UUID.md) |  |  [optional]
**description** | **String** |  |  [optional]
**state** | [**WorkItemStates**](WorkItemStates.md) |  | 
**priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  | 
**steps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  | 
**preconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  | 
**postconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  | 
**duration** | **Integer** |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  | 
**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  | 
**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  | 
**name** | **String** |  | 
