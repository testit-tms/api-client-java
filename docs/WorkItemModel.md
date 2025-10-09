

# WorkItemModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**versionId** | **UUID** | used for versioning changes in workitem |  |
|**medianDuration** | **Long** | used for getting a median duration of all autotests related to this workitem |  |
|**isDeleted** | **Boolean** |  |  |
|**projectId** | **UUID** |  |  |
|**entityTypeName** | **WorkItemEntityTypes** |  |  |
|**isAutomated** | **Boolean** |  |  |
|**versionNumber** | **Integer** | used for define chronology of workitem state in each version |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**createdById** | **UUID** |  |  |
|**globalId** | **Long** |  |  |
|**externalIssues** | [**List&lt;ExternalIssueModel&gt;**](ExternalIssueModel.md) |  |  |
|**id** | **UUID** |  |  |
|**sectionId** | **UUID** |  |  |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**sourceType** | **WorkItemSourceTypeModel** |  |  |
|**steps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**preconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**postconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**duration** | **Integer** |  |  |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) |  |  |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  |
|**name** | **String** |  |  |
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
|**sectionPreconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
|**sectionPostconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
|**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**description** | **String** |  |  [optional] |



