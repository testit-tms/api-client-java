

# UpdateWorkItemApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the work item |  |
|**sectionId** | **UUID** | Unique identifier of the section within a project |  |
|**name** | **String** | Name of the work item |  |
|**duration** | **Long** | Duration of the work item in milliseconds |  |
|**state** | **WorkItemStateApiModel** | Current state of the work item |  |
|**priority** | **WorkItemPriorityApiModel** | Priority level assigned to the work item |  |
|**description** | **String** | Description of the work item |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Set of custom attributes associated with the work item |  [optional] |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  [optional] |
|**preconditionSteps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of precondition steps that must be executed before the main steps |  [optional] |
|**steps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of main steps or actions defined for the work item |  [optional] |
|**postconditionSteps** | [**List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of postcondition steps that are executed after completing the main steps |  [optional] |
|**iterations** | [**List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Set of iterations associated with the work item |  [optional] |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Set of automated tests linked to the work item |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Set of files attached to the work item |  [optional] |
|**links** | [**List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Set of links related to the work item |  [optional] |
|**parameters** | [**List&lt;WorkItemParameterKeyApiModel&gt;**](WorkItemParameterKeyApiModel.md) | Set of parameter keys associated with the work item |  [optional] |



