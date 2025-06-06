

# WorkItemFilterApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nameOrId** | **String** | Name or identifier (UUID) of work item |  [optional] |
|**includeIds** | **Set&lt;UUID&gt;** | Collection of identifiers of work items which need to be included in result regardless of filtering |  [optional] |
|**excludeIds** | **Set&lt;UUID&gt;** | Collection of identifiers of work items which need to be excluded from result regardless of filtering |  [optional] |
|**projectIds** | **Set&lt;UUID&gt;** | Collection of project identifiers |  [optional] |
|**name** | **String** | Name of work item |  [optional] |
|**ids** | **Set&lt;UUID&gt;** | Specifies a work item unique IDs to search for |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Collection of global (integer) identifiers |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Custom attributes of work item |  [optional] |
|**isDeleted** | **Boolean** | Is result must consist of only actual/deleted work items |  [optional] |
|**sectionIds** | **Set&lt;UUID&gt;** | Collection of section identifiers |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who created work item |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who applied last modification to work item |  [optional] |
|**states** | **Set&lt;WorkItemStates&gt;** | Collection of states of work item |  [optional] |
|**priorities** | **Set&lt;WorkItemPriorityModel&gt;** | Collection of priorities of work item |  [optional] |
|**sourceTypes** | **Set&lt;WorkItemSourceTypeModel&gt;** | Source type of work item (manual creation or AI generated) |  [optional] |
|**types** | **Set&lt;WorkItemEntityTypes&gt;** | Collection of types of work item |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of creation date to search for |  [optional] |
|**modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of last modification date to search for |  [optional] |
|**duration** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) | Specifies a work item duration range to search for |  [optional] |
|**medianDuration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a work item median duration range to search for |  [optional] |
|**isAutomated** | **Boolean** | Is result must consist of only manual/automated work items |  [optional] |
|**tags** | **Set&lt;String&gt;** | Collection of tags |  [optional] |
|**autoTestIds** | **Set&lt;UUID&gt;** | Collection of identifiers of linked autotests |  [optional] |
|**workItemVersionIds** | **List&lt;UUID&gt;** | Collection of identifiers work items versions. |  [optional] |
|**links** | [**WorkItemLinkFilterApiModel**](WorkItemLinkFilterApiModel.md) | Specifies a work item filter by its links |  [optional] |



