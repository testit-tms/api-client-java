

# AutoTestResultHistoryApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**testRunId** | **UUID** |  |  |
|**configurationId** | **UUID** |  |  |
|**configurationName** | **String** |  |  |
|**outcome** | **AutotestResultOutcome** |  |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
|**rerunCount** | **Integer** |  |  |
|**rerunTestResults** | [**List&lt;RerunTestResultApiResult&gt;**](RerunTestResultApiResult.md) |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**createdById** | **UUID** |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**testPlanGlobalId** | **Long** |  |  [optional] |
|**testPlanName** | **String** |  |  [optional] |
|**duration** | **Long** |  |  [optional] |
|**testRunName** | **String** |  |  [optional] |
|**launchSource** | **String** |  |  [optional] |
|**createdByName** | **String** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |



