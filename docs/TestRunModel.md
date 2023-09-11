

# TestRunModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional] |
|**autoTestsCount** | **Integer** |  |  |
|**testSuiteIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**isAutomated** | **Boolean** |  |  |
|**analytic** | [**TestRunAnalyticResultModel**](TestRunAnalyticResultModel.md) |  |  [optional] |
|**testResults** | [**List&lt;TestResultModel&gt;**](TestResultModel.md) |  |  [optional] |
|**testPlan** | [**TestPlanModel**](TestPlanModel.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |
|**startedDate** | **OffsetDateTime** |  |  [optional] |
|**completedDate** | **OffsetDateTime** |  |  [optional] |
|**build** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**stateName** | **TestRunState** |  |  |
|**projectId** | **UUID** |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**runByUserId** | **UUID** |  |  [optional] |
|**stoppedByUserId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**launchSource** | **String** |  |  [optional] |
|**id** | **UUID** | Unique ID of the entity |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |



