

# CreateTestRunAndFillByConfigurationsApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Specifies the GUID of the project, in which a test run will be created. |  |
|**testPlanId** | **UUID** | Specifies the GUID of the test plan, within which the test run will be created. |  |
|**testPointSelectors** | [**List&lt;TestPointSelector&gt;**](TestPointSelector.md) | Specifies an array of work items and configuration to create a test run for. |  |
|**name** | **String** | Specifies the name of the test run. |  [optional] |
|**description** | **String** | Specifies the test run description. |  [optional] |
|**launchSource** | **String** | Specifies the test run launch source. |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachment ids to relate to the test run |  [optional] |
|**links** | [**List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of links to relate to the test run |  [optional] |
|**tags** | **List&lt;String&gt;** | Collection of tags to assign to the test run |  [optional] |



