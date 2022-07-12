# TestPlanModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**TestPlanStatusModel**](TestPlanStatusModel.md) |  |  [optional]
**startedOn** | [**OffsetDateTime**](OffsetDateTime.md) | Set when test plan is starter (status changed to: In Progress) |  [optional]
**completedOn** | [**OffsetDateTime**](OffsetDateTime.md) | set when test plan status is completed (status changed to: Completed) |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdById** | [**UUID**](UUID.md) |  |  [optional]
**modifiedById** | [**UUID**](UUID.md) |  |  [optional]
**globalId** | **Long** | Used for search Test plan |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**lockedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**lockedById** | [**UUID**](UUID.md) |  |  [optional]
**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  |  [optional]
**name** | **String** |  | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Used for analytics |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | Used for analytics |  [optional]
**description** | **String** |  |  [optional]
**build** | **String** |  |  [optional]
**projectId** | [**UUID**](UUID.md) |  | 
**productName** | **String** |  |  [optional]
**hasAutomaticDurationTimer** | **Boolean** |  |  [optional]
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
