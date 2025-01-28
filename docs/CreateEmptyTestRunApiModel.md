

# CreateEmptyTestRunApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Project unique identifier                This property is to link test run with a project |  |
|**name** | **String** | Test run name |  [optional] |
|**description** | **String** | Test run description |  [optional] |
|**launchSource** | **String** | Test run launch source |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachments to relate to the test run |  [optional] |
|**links** | [**List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of links to relate to the test run |  [optional] |



