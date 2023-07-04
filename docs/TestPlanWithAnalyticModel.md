

# TestPlanWithAnalyticModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analytic** | [**TestPlanWithAnalyticModelAnalytic**](TestPlanWithAnalyticModelAnalytic.md) |  |  [optional] |
|**status** | **TestPlanStatusModel** |  |  |
|**startedOn** | **OffsetDateTime** | Set when test plan is starter (status changed to: In Progress) |  [optional] |
|**completedOn** | **OffsetDateTime** | set when test plan status is completed (status changed to: Completed) |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**globalId** | **Long** | Used for search Test plan |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**lockedDate** | **OffsetDateTime** |  |  [optional] |
|**id** | **UUID** |  |  |
|**lockedById** | **UUID** |  |  [optional] |
|**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  |  [optional] |
|**name** | **String** |  |  |
|**startDate** | **OffsetDateTime** | Used for analytics |  [optional] |
|**endDate** | **OffsetDateTime** | Used for analytics |  [optional] |
|**description** | **String** |  |  [optional] |
|**build** | **String** |  |  [optional] |
|**projectId** | **UUID** |  |  |
|**productName** | **String** |  |  [optional] |
|**hasAutomaticDurationTimer** | **Boolean** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |



