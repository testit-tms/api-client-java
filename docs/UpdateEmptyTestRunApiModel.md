

# UpdateEmptyTestRunApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Test run unique identifier |  |
|**name** | **String** | Test run name |  |
|**description** | **String** | Test run description |  [optional] |
|**launchSource** | **String** | Test run launch source              Once launch source is specified it cannot be updated |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachments related to the test run |  [optional] |
|**links** | [**List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Collection of links related to the test run |  [optional] |



