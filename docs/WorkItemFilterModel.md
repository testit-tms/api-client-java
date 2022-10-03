

# WorkItemFilterModel

Collection of filters to apply to search

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nameOrId** | **String** | Name or identifier (UUID) of work item |  [optional] |
|**includeIds** | **Set&lt;UUID&gt;** | Collection of identifiers of work items which need to be included in result regardless of filtering |  [optional] |
|**excludeIds** | **Set&lt;UUID&gt;** | Collection of identifiers of work items which need to be excluded from result regardless of filtering |  [optional] |
|**name** | **String** | Name of work item |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Collection of global (integer) identifiers |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Custom attributes of work item |  [optional] |
|**isDeleted** | **Boolean** | Is result must consist of only actual/deleted work items |  [optional] |
|**projectIds** | **Set&lt;UUID&gt;** | Collection of project identifiers |  [optional] |
|**sectionIds** | **Set&lt;UUID&gt;** | Collection of section identifiers |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who created work item |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who applied last modification to work item |  [optional] |
|**states** | **Set&lt;WorkItemStates&gt;** | Collection of states of work item |  [optional] |
|**priorities** | **Set&lt;WorkItemPriorityModel&gt;** | Collection of priorities of work item |  [optional] |
|**entityTypes** | **Set&lt;String&gt;** | Collection of types of work item  &lt;br&gt;Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60; |  [optional] |
|**createdDateMinimal** | **OffsetDateTime** | Minimum date and time of work item creation |  [optional] |
|**createdDateMaximal** | **OffsetDateTime** | Maximum date and time of work item creation |  [optional] |
|**modifiedDateMinimal** | **OffsetDateTime** | Minimum date and time of work item last modification |  [optional] |
|**modifiedDateMaximal** | **OffsetDateTime** | Maximum date and time of work item last modification |  [optional] |
|**durationMinimal** | **Integer** | Minimum completion time (seconds) of work item |  [optional] |
|**durationMaximal** | **Integer** | Maximum completion time (seconds) of work item |  [optional] |
|**isAutomated** | **Boolean** | Is result must consist of only manual/automated work items |  [optional] |
|**tagNames** | **Set&lt;String&gt;** | Collection of tags |  [optional] |
|**autoTestIds** | **Set&lt;UUID&gt;** | Collection of identifiers of linked autotests |  [optional] |
|**exceptWorkItemIds** | **Set&lt;UUID&gt;** |  |  [optional] |



