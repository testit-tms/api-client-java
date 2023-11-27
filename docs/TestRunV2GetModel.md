

# TestRunV2GetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**stateName** | **TestRunState** |  |  |
|**projectId** | **UUID** | This property is used to link test run with project |  |
|**testPlanId** | **UUID** | This property is used to link test run with test plan |  [optional] |
|**testResults** | [**List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  |
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**launchSource** | **String** | Once launch source is specified it cannot be updated |  [optional] |



