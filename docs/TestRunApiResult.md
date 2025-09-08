

# TestRunApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the entity |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |
|**build** | **String** |  |  |
|**stateName** | **TestRunState** |  |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
|**projectId** | **UUID** |  |  |
|**autoTests** | [**List&lt;AutoTestApiResult&gt;**](AutoTestApiResult.md) |  |  |
|**autoTestsCount** | **Integer** |  |  |
|**testSuiteIds** | **List&lt;UUID&gt;** |  |  |
|**isAutomated** | **Boolean** |  |  |
|**analytic** | [**TestRunAnalyticApiResult**](TestRunAnalyticApiResult.md) |  |  |
|**testResults** | [**List&lt;TestResultApiResult&gt;**](TestResultApiResult.md) |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**createdById** | **UUID** |  |  |
|**startedDate** | **OffsetDateTime** |  |  [optional] |
|**completedDate** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**testPlanId** | **UUID** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**launchSource** | **String** |  |  [optional] |
|**testPlan** | [**TestPlanApiResult**](TestPlanApiResult.md) |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |



