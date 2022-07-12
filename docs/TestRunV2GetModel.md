# TestRunV2GetModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**stateName** | [**TestRunStateTypeModel**](TestRunStateTypeModel.md) |  |  [optional]
**projectId** | [**UUID**](UUID.md) | This property is used to link test run with project |  [optional]
**testPlanId** | [**UUID**](UUID.md) | This property is used to link test run with test plan |  [optional]
**testResults** | [**List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdById** | [**UUID**](UUID.md) |  |  [optional]
**modifiedById** | [**UUID**](UUID.md) |  |  [optional]
**createdByUserName** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**launchSource** | **String** | Once launch source is specified it cannot be updated |  [optional]
