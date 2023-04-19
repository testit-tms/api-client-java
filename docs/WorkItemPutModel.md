

# WorkItemPutModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  |
|**iterations** | [**List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional] |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional] |
|**id** | **UUID** |  |  |
|**sectionId** | **UUID** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**preconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**postconditionSteps** | [**List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
|**duration** | **Integer** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  |  |
|**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  |  |
|**name** | **String** |  |  |



