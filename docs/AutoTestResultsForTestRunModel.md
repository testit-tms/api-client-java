

# AutoTestResultsForTestRunModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configurationId** | **UUID** | Specifies the GUID of the autotest configuration, which was specified when the test run was created. |  |
|**links** | [**List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Specifies the links in the autotest. |  [optional] |
|**failureReasonNames** | **List&lt;String&gt;** | Specifies the cause of autotest failure. |  [optional] |
|**autoTestExternalId** | **String** | Specifies the external ID of the autotest, which was specified when the test run was created. |  |
|**outcome** | **String** | Specifies the result of the autotest execution. |  |
|**message** | **String** | A comment for the result. |  [optional] |
|**traces** | **String** | An extended comment or a stack trace. |  [optional] |
|**startedOn** | **OffsetDateTime** | Test run start date. |  [optional] |
|**completedOn** | **OffsetDateTime** | Test run end date. |  [optional] |
|**duration** | **Long** | Expected or actual duration of the test run execution in seconds. |  [optional] |
|**attachments** | [**List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) | Specifies an attachment GUID. Multiple values can be sent. |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent. |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | \&quot;&lt;b&gt;property&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom properties. Multiple properties can be sent. |  [optional] |
|**stepResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of individual steps. |  [optional] |
|**setupResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of setup steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above. |  [optional] |
|**teardownResults** | [**List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of the teardown steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above. |  [optional] |



