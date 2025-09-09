

# WorkItemShortApiResult


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
|**createdById** | **UUID** | Unique identifier of user who created Work Item |  |
|**state** | **WorkItemStates** | The current state of Work Item |  |
|**priority** | **WorkItemPriorityModel** | Work Item priority level |  |
|**sourceType** | **WorkItemSourceTypeModel** | Work Item priority level |  |
|**isDeleted** | **Boolean** | Flag determining whether Work Item is deleted |  |
|**iterations** | [**List&lt;IterationApiResult&gt;**](IterationApiResult.md) | Set of iterations related to Work Item |  |
|**links** | [**List&lt;LinkShortApiResult&gt;**](LinkShortApiResult.md) | Set of links related to Work Item |  |
|**medianDuration** | **Long** | Work Item median duration |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Work Item attributes |  [optional] |
|**modifiedById** | **UUID** | Unique identifier of user who applied the latest modification of Work Item |  [optional] |
|**createdDate** | **OffsetDateTime** | Date and time of Work Item creation |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date and time of the latest modification of Work Item |  [optional] |
|**tagNames** | **List&lt;String&gt;** | Array of tag names of Work Item |  [optional] |



