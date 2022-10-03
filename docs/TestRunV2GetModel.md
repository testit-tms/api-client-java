

# TestRunV2GetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**stateName** | **TestRunState** |  |  [optional] |
|**projectId** | **UUID** | This property is used to link test run with project |  [optional] |
|**testPlanId** | **UUID** | This property is used to link test run with test plan |  [optional] |
|**testResults** | [**List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**launchSource** | **String** | Once launch source is specified it cannot be updated |  [optional] |



