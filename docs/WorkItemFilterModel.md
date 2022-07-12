# WorkItemFilterModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nameOrId** | **String** |  |  [optional]
**includeIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**excludeIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**globalIds** | **List&lt;Long&gt;** |  |  [optional]
**attributes** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) |  |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**projectIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**sectionIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**createdByIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**modifiedByIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**states** | [**List&lt;WorkItemStates&gt;**](WorkItemStates.md) |  |  [optional]
**priorities** | [**List&lt;WorkItemPriorityModel&gt;**](WorkItemPriorityModel.md) |  |  [optional]
**entityTypes** | **List&lt;String&gt;** |  |  [optional]
**createdDateMinimal** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdDateMaximal** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDateMinimal** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDateMaximal** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**durationMinimal** | **Integer** |  |  [optional]
**durationMaximal** | **Integer** |  |  [optional]
**isAutomated** | **Boolean** |  |  [optional]
**tagNames** | **List&lt;String&gt;** |  |  [optional]
**autoTestIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**exceptWorkItemIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
