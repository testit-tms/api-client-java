

# CreateWorkItemApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityTypeName** | **WorkItemEntityTypes** |  |  |
|**description** | **String** | Workitem description |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem steps |  |
|**preconditionSteps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem precondition steps |  |
|**postconditionSteps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem postcondition steps |  |
|**duration** | **Integer** | WorkItem duration in milliseconds, must be 0 for shared steps and greater than 0 for the other types of work items |  |
|**attributes** | **Map&lt;String, Object&gt;** | Key value pair of custom workitem attributes |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | Collection of workitem tags |  |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of workitem attachments |  [optional] |
|**iterations** | [**List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Collection of parameter sets |  [optional] |
|**links** | [**List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of workitem links |  |
|**name** | **String** | Workitem name |  |
|**projectId** | **UUID** | Project unique identifier - used to link workitem with project |  |
|**sectionId** | **UUID** | Internal identifier of section where workitem is located |  |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Collection of autotest internal ids |  [optional] |



