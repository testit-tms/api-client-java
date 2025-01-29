

# TestRunApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the entity |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |
|**startedDate** | **OffsetDateTime** |  |  [optional] |
|**completedDate** | **OffsetDateTime** |  |  [optional] |
|**build** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**stateName** | **TestRunState** |  |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
|**projectId** | **UUID** |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**launchSource** | **String** |  |  [optional] |
|**autoTests** | [**List&lt;AutoTestApiResult&gt;**](AutoTestApiResult.md) |  |  |
|**autoTestsCount** | **Integer** |  |  |
|**testSuiteIds** | **List&lt;UUID&gt;** |  |  |
|**isAutomated** | **Boolean** |  |  |
|**analytic** | [**TestRunAnalyticApiResult**](TestRunAnalyticApiResult.md) |  |  |
|**testResults** | [**List&lt;TestResultApiResult&gt;**](TestResultApiResult.md) |  |  |
|**testPlan** | [**TestPlanApiResult**](TestPlanApiResult.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |



