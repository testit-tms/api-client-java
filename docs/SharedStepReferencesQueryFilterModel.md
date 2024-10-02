

# SharedStepReferencesQueryFilterModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of work item |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Collection of global (integer) identifiers |  [optional] |
|**sectionIds** | **Set&lt;UUID&gt;** | Collection of section identifiers |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who created work item |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Collection of identifiers of users who applied last modification to work item |  [optional] |
|**states** | **Set&lt;WorkItemStates&gt;** | Collection of states of work item |  [optional] |
|**priorities** | **Set&lt;WorkItemPriorityModel&gt;** | Collection of priorities of work item |  [optional] |
|**entityTypes** | **Set&lt;String&gt;** | Collection of types of work item   Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60; |  [optional] |
|**createdDate** | [**SharedStepReferenceSectionsQueryFilterModelCreatedDate**](SharedStepReferenceSectionsQueryFilterModelCreatedDate.md) |  |  [optional] |
|**modifiedDate** | [**SharedStepReferenceSectionsQueryFilterModelModifiedDate**](SharedStepReferenceSectionsQueryFilterModelModifiedDate.md) |  |  [optional] |
|**isAutomated** | **Boolean** | Is result must consist of only manual/automated work items |  [optional] |
|**tags** | **Set&lt;String&gt;** | Collection of tags |  [optional] |



