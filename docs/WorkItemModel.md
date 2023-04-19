

# WorkItemModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**versionId** | **UUID** | used for versioning changes in workitem |  [optional] |
|**medianDuration** | **Long** | used for getting a median duration of all autotests related to this workitem |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**projectId** | **UUID** |  |  [optional] |
|**entityTypeName** | **WorkItemEntityTypes** |  |  |
|**isAutomated** | **Boolean** |  |  [optional] |
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
|**sectionPreconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
|**sectionPostconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
|**versionNumber** | **Integer** | used for define chronology of workitem state in each version |  [optional] |
|**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**globalId** | **Long** |  |  [optional] |
|**id** | **UUID** |  |  |
|**sectionId** | **UUID** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**steps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**preconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**postconditionSteps** | [**List&lt;StepModel&gt;**](StepModel.md) |  |  |
|**duration** | **Integer** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  |  |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  |
|**name** | **String** |  |  |



