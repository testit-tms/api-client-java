

# WorkItemApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the work item |  |
|**globalId** | **Long** | Global identifier of the work item |  |
|**versionId** | **UUID** | Version identifier of the work item |  |
|**versionNumber** | **Integer** | Version number of the work item |  |
|**projectId** | **UUID** | Unique identifier of the project |  |
|**sectionId** | **UUID** | Unique identifier of the section within a project |  |
|**name** | **String** | Name of the work item |  |
|**sourceType** | **WorkItemSourceTypeApiModel** | Source type of the work item |  |
|**entityTypeName** | **WorkItemEntityTypeApiModel** | Type of entity associated with this work item |  |
|**duration** | **Integer** | Duration of the work item in milliseconds |  |
|**medianDuration** | **Long** | Median duration of the work item in milliseconds |  |
|**state** | **WorkItemStateApiModel** | State of the work item |  |
|**priority** | **WorkItemPriorityApiModel** | Priority level of the work item |  |
|**isAutomated** | **Boolean** |  |  |
|**attributes** | **Map&lt;String, Object&gt;** | Set of custom attributes associated with the work item |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  |
|**sectionPreconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) | Set of section precondition steps that need to be executed before starting the work item steps |  |
|**sectionPostconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) | Set of section postcondition steps that need to be executed after completing the work item steps |  |
|**preconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) | Set of precondition steps that need to be executed before starting the main steps |  |
|**steps** | [**List&lt;StepModel&gt;**](StepModel.md) | Main steps or actions defined for the work item |  |
|**postconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) | Set of postcondition steps that are executed after completing the main steps |  |
|**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) | Associated iterations linked to the work item |  |
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) | Automated tests associated with the work item |  |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) | Files attached to the work item |  |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) | Set of links related to the work item |  |
|**externalIssues** | [**List&lt;ExternalIssueApiResult&gt;**](ExternalIssueApiResult.md) | Set of external issues related to the work item |  |
|**createdDate** | **OffsetDateTime** | Creation date of the work item |  |
|**createdById** | **UUID** | Unique identifier of the work item creator |  |
|**isDeleted** | **Boolean** | Indicates whether the work item is marked as deleted |  |
|**description** | **String** | Description of the work item |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Modification date of the work item |  [optional] |
|**modifiedById** | **UUID** | Unique identifier of the work item modifier |  [optional] |



