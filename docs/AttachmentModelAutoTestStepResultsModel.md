

# AttachmentModelAutoTestStepResultsModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The name of the step. |  [optional] |
|**description** | **String** | Description of the step result. |  [optional] |
|**info** | **String** | Extended description of the step result. |  [optional] |
|**startedOn** | **OffsetDateTime** | Step start date. |  [optional] |
|**completedOn** | **OffsetDateTime** | Step end date. |  [optional] |
|**duration** | **Long** | Expected or actual duration of the test run execution in seconds. |  [optional] |
|**outcome** | **String** | Specifies the result of the autotest execution. |  [optional] |
|**stepResults** | [**List&lt;AttachmentModelAutoTestStepResultsModel&gt;**](AttachmentModelAutoTestStepResultsModel.md) | Nested step results. The maximum nesting level is 15. |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) | /// &lt;summary&gt;  Specifies an attachment GUID. Multiple values can be sent.  &lt;/summary&gt; |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent. |  [optional] |



