

# TestSuiteWorkItemsSearchModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of work item |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Collection of global (integer) identifiers |  [optional] |
|**sectionIds** | **Set&lt;UUID&gt;** | Collection of section identifiers |  [optional] |
|**priorities** | **Set&lt;WorkItemPriorityModel&gt;** | Collection of priorities of work item |  [optional] |
|**isAutomated** | **Boolean** | Is result must consist of only manual/automated work items |  [optional] |
|**states** | **Set&lt;WorkItemStates&gt;** | Collection of states of work item |  [optional] |
|**duration** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) |  |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) |  |  [optional] |
|**modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) |  |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who created work item |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who applied last modification to work item |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Custom attributes of work item |  [optional] |
|**isDeleted** | **Boolean** | Is result must consist of only actual/deleted work items |  [optional] |
|**tagNames** | **Set&lt;String&gt;** | Collection of tags |  [optional] |
|**entityTypes** | **Set&lt;String&gt;** | Collection of types of work item  &lt;br&gt;Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60; |  [optional] |



