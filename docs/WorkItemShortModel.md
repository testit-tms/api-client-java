

# WorkItemShortModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Work Item internal unique identifier |  |
|**versionId** | **UUID** | Work Item version identifier |  |
|**versionNumber** | **Integer** | Work Item version number |  |
|**name** | **String** | Work Item name |  |
|**entityTypeName** | **String** | Work Item type. Possible values: CheckLists, SharedSteps, TestCases |  |
|**projectId** | **UUID** | Project unique identifier |  |
|**sectionId** | **UUID** | Identifier of Section where Work Item is located |  |
|**sectionName** | **String** | Section name of Work Item |  |
|**isAutomated** | **Boolean** | Boolean flag determining whether Work Item is automated |  |
|**globalId** | **Long** | Work Item global identifier |  |
|**duration** | **Integer** | Work Item duration |  |
|**medianDuration** | **Long** | Work Item median duration |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Work Item attributes |  [optional] |
|**createdById** | **UUID** | Unique identifier of user who created Work Item |  |
|**modifiedById** | **UUID** | Unique identifier of user who applied the latest modification of Work Item |  [optional] |
|**createdDate** | **OffsetDateTime** | Date and time of Work Item creation |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date and time of the latest modification of Work Item |  [optional] |
|**state** | **WorkItemStates** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**isDeleted** | **Boolean** | Flag determining whether Work Item is deleted |  |
|**tagNames** | **List&lt;String&gt;** | Array of tag names of Work Item |  [optional] |
|**iterations** | [**List&lt;IterationModel&gt;**](IterationModel.md) | Set of iterations related to Work Item |  |
|**links** | [**List&lt;LinkShortModel&gt;**](LinkShortModel.md) | Set of links related to Work Item |  |



