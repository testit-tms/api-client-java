

# UpdateWorkItemRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  |
|**iterations** | [**List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional] |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional] |
|**id** | **UUID** |  |  |
|**sectionId** | **UUID** |  |  |
|**description** | **String** |  |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**preconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**postconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**duration** | **Integer** |  |  |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**tags** | [**List&lt;TagPutModel&gt;**](TagPutModel.md) |  |  |
|**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  |  |
|**name** | **String** |  |  |



