# WorkItemShortModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**versionId** | [**UUID**](UUID.md) | used for versioning changes in workitem |  [optional]
**name** | **String** |  | 
**entityTypeName** | **String** | Property can have one of these values: CheckLists, SharedSteps, TestCases | 
**projectId** | [**UUID**](UUID.md) | This property is used to link autotest with project | 
**sectionId** | [**UUID**](UUID.md) | This property links workitem with section | 
**isAutomated** | **Boolean** |  |  [optional]
**globalId** | **Long** |  |  [optional]
**duration** | **Integer** |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**createdById** | [**UUID**](UUID.md) |  |  [optional]
**modifiedById** | [**UUID**](UUID.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**state** | **String** | Property can have one of these values: NeedsWork, NotReady, Ready | 
**priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  | 
**isDeleted** | **Boolean** |  |  [optional]
**tagNames** | **List&lt;String&gt;** |  |  [optional]
**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional]
