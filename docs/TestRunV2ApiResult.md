

# TestRunV2ApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Test run unique identifier |  |
|**name** | **String** | Test run name |  |
|**stateName** | **TestRunState** | Test run state |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) | Test run status |  |
|**projectId** | **UUID** | Project unique identifier              This property is used to link test run with project. |  |
|**createdDate** | **OffsetDateTime** | Date and time of test run creation |  |
|**createdById** | **UUID** | Unique identifier of user who created test run |  |
|**attachments** | [**List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) | Collection of attachments related to the test run |  |
|**links** | [**List&lt;LinkApiResult&gt;**](LinkApiResult.md) | Collection of links related to the test run |  |
|**webhooks** | [**List&lt;NamedEntityApiModel&gt;**](NamedEntityApiModel.md) | Enabled webhooks |  |
|**runCount** | **Integer** | Run count |  |
|**description** | **String** | Test run description |  [optional] |
|**launchSource** | **String** | Test run launch source              Once launch source is specified it cannot be updated. |  [optional] |
|**startedOn** | **OffsetDateTime** | Date and time of test run start |  [optional] |
|**completedOn** | **OffsetDateTime** | Date and time of test run end |  [optional] |
|**testPlanId** | **UUID** | Test plan unique identifier              This property is used to link test run with test plan. |  [optional] |
|**testResults** | [**List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) | Enumeration of test results related to test run |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date and time of last test run  modification |  [optional] |
|**modifiedById** | **UUID** | Unique identifier of user who applied last test run  modification |  [optional] |
|**createdByUserName** | **String** | Username of user who created test run |  [optional] |
|**customParameters** | **Map&lt;String, String&gt;** | Customers test run parameters |  [optional] |



