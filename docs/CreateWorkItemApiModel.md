

# CreateWorkItemApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Unique identifier of the project |  |
|**name** | **String** | Name of the work item |  |
|**entityTypeName** | **WorkItemEntityTypeApiModel** | Type of entity associated with this work item |  |
|**duration** | **Integer** | Duration of the work item in milliseconds |  |
|**state** | **WorkItemStateApiModel** | State of the work item |  |
|**priority** | **WorkItemPriorityApiModel** | Priority level of the work item |  |
|**attributes** | **Map&lt;String, Object&gt;** | Set of custom attributes associated with the work item |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  |
|**preconditionSteps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Set of precondition steps that need to be executed before starting the main steps |  |
|**steps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Main steps or actions defined for the work item |  |
|**postconditionSteps** | [**List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Set of postcondition steps that are executed after completing the main steps |  |
|**links** | [**List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Set of links related to the work item |  |
|**sectionId** | **UUID** | Unique identifier of the section within a project |  [optional] |
|**description** | **String** | Description of the work item |  [optional] |
|**iterations** | [**List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Associated iterations linked to the work item |  [optional] |
|**autoTests** | [**List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Automated tests associated with the work item |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Files attached to the work item |  [optional] |



