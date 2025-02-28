

# AutoTestResultHistoryApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**testPlanGlobalId** | **Long** |  |  [optional] |
|**testPlanName** | **String** |  |  [optional] |
|**duration** | **Long** |  |  [optional] |
|**testRunId** | **UUID** |  |  |
|**testRunName** | **String** |  |  [optional] |
|**configurationId** | **UUID** |  |  |
|**configurationName** | **String** |  |  |
|**outcome** | **AutotestResultOutcome** |  |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
|**launchSource** | **String** |  |  [optional] |
|**rerunCount** | **Integer** |  |  |
|**rerunTestResults** | [**List&lt;RerunTestResultApiResult&gt;**](RerunTestResultApiResult.md) |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**createdById** | **UUID** |  |  |
|**createdByName** | **String** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |



