

# TestPlanWithTestSuiteTreeModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testSuites** | [**List&lt;TestSuiteWithChildrenModel&gt;**](TestSuiteWithChildrenModel.md) |  |  |
|**status** | **TestPlanStatusModel** |  |  |
|**createdById** | **UUID** |  |  |
|**globalId** | **Long** | Used for search Test plan |  |
|**isDeleted** | **Boolean** |  |  |
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**projectId** | **UUID** |  |  |
|**attributes** | **Map&lt;String, Object&gt;** |  |  |
|**startedOn** | **OffsetDateTime** | Set when test plan is starter (status changed to: In Progress) |  [optional] |
|**completedOn** | **OffsetDateTime** | set when test plan status is completed (status changed to: Completed) |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**lockedDate** | **OffsetDateTime** |  |  [optional] |
|**lockedById** | **UUID** |  |  [optional] |
|**tags** | [**List&lt;TagModel&gt;**](TagModel.md) |  |  [optional] |
|**startDate** | **OffsetDateTime** | Used for analytics |  [optional] |
|**endDate** | **OffsetDateTime** | Used for analytics |  [optional] |
|**description** | **String** |  |  [optional] |
|**build** | **String** |  |  [optional] |
|**productName** | **String** |  |  [optional] |
|**hasAutomaticDurationTimer** | **Boolean** |  |  [optional] |



