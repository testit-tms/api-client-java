

# CreateWorkItemRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityTypeName** | **WorkItemEntityTypes** |  |  |
|**description** | **String** |  |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
|**preconditionSteps** | [**List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
|**postconditionSteps** | [**List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
|**duration** | **Integer** | Must be 0 for shared steps and greater than 0 for the other types of work items |  |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**tags** | [**List&lt;TagPostModel&gt;**](TagPostModel.md) |  |  |
|**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  [optional] |
|**iterations** | [**List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional] |
|**links** | [**List&lt;LinkPostModel&gt;**](LinkPostModel.md) |  |  |
|**name** | **String** |  |  |
|**projectId** | **UUID** | This property is used to link workitem with project |  |
|**sectionId** | **UUID** |  |  |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional] |



