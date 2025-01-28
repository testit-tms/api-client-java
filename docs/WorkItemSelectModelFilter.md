

# WorkItemSelectModelFilter

Collection of filters to apply to search

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
|**types** | **Set&lt;WorkItemEntityTypes&gt;** | Collection of types of work item |  [optional] |
|**createdDate** | [**TestPointFilterModelWorkItemCreatedDate**](TestPointFilterModelWorkItemCreatedDate.md) |  |  [optional] |
|**modifiedDate** | [**TestPointFilterModelWorkItemModifiedDate**](TestPointFilterModelWorkItemModifiedDate.md) |  |  [optional] |
|**duration** | [**TestSuiteWorkItemsSearchModelDuration**](TestSuiteWorkItemsSearchModelDuration.md) |  |  [optional] |
|**medianDuration** | [**TestSuiteWorkItemsSearchModelMedianDuration**](TestSuiteWorkItemsSearchModelMedianDuration.md) |  |  [optional] |
|**isAutomated** | **Boolean** | Is result must consist of only manual/automated work items |  [optional] |
|**tags** | **Set&lt;String&gt;** | Collection of tags |  [optional] |
|**autoTestIds** | **Set&lt;UUID&gt;** | Collection of identifiers of linked autotests |  [optional] |
|**workItemVersionIds** | **List&lt;UUID&gt;** | Collection of identifiers work items versions. |  [optional] |



