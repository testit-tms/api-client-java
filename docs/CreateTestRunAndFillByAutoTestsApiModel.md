

# CreateTestRunAndFillByAutoTestsApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Specifies the GUID of the project, in which a test run will be created. |  |
|**name** | **String** | Specifies the name of the test run. |  [optional] |
|**configurationIds** | **List&lt;UUID&gt;** | Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. |  |
|**autoTestExternalIds** | **List&lt;String&gt;** | Specifies the external ID of the autotest. You can specify several IDs. |  |
|**description** | **String** | Specifies the test run description. |  [optional] |
|**launchSource** | **String** | Specifies the test run launch source. |  [optional] |
|**attachments** | [**List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachment ids to relate to the test run |  [optional] |
|**links** | [**List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of links to relate to the test run |  [optional] |



