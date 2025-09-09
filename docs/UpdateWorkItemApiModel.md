

# UpdateWorkItemApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Workitem internal identifier |  |
|**sectionId** | **UUID** | Internal identifier of section where workitem is located |  |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem steps |  |
|**preconditionSteps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem precondtion steps |  |
|**postconditionSteps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem postcondition steps |  |
|**duration** | **Integer** | Workitem duration in milliseconds |  |
|**attributes** | **Map&lt;String, Object&gt;** | Key value pair of custom workitem attributes |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | Collection of workitem tags |  |
|**links** | [**List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Collection of workitem links |  |
|**name** | **String** | Workitem name |  |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) |  |  |
|**description** | **String** | Workitem description |  [optional] |
|**sourceType** | **WorkItemSourceTypeModel** |  |  [optional] |
|**iterations** | [**List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Collection of parameter id sets |  [optional] |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Collection of autotest internal ids |  [optional] |



