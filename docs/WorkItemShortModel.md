

# WorkItemShortModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**versionId** | **UUID** | used for versioning changes in workitem |  [optional] |
|**name** | **String** |  |  |
|**entityTypeName** | **String** | Property can have one of these values: CheckLists, SharedSteps, TestCases |  |
|**projectId** | **UUID** | This property is used to link autotest with project |  |
|**sectionId** | **UUID** | This property links workitem with section |  |
|**isAutomated** | **Boolean** |  |  [optional] |
|**globalId** | **Long** |  |  [optional] |
|**duration** | **Integer** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**isDeleted** | **Boolean** |  |  [optional] |
|**tagNames** | **List&lt;String&gt;** |  |  [optional] |
|**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional] |



