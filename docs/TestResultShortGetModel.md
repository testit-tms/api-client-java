

# TestResultShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test result |  |
|**name** | **String** | Name of autotest represented by the test result |  |
|**autotestGlobalId** | **Long** | Global ID of autotest represented by the test result |  |
|**testRunId** | **UUID** | Unique ID of test run where the test result is located |  |
|**configurationId** | **UUID** | Unique ID of configuration which the test result uses |  |
|**configurationName** | **String** | Name of configuration which the test result uses |  |
|**outcome** | **String** | Outcome of the test result |  |
|**resultReasons** | [**List&lt;AutotestResultReasonSubGetModel&gt;**](AutotestResultReasonSubGetModel.md) | Collection of result reasons which the test result have |  |
|**comment** | **String** | Comment to the test result |  [optional] |
|**date** | **OffsetDateTime** | Date when the test result was completed or started or created |  |
|**createdDate** | **OffsetDateTime** | Date when the test result has been created |  |
|**modifiedDate** | **OffsetDateTime** | Date when the test result has been modified |  [optional] |
|**startedOn** | **OffsetDateTime** | Date when the test result has been started |  [optional] |
|**completedOn** | **OffsetDateTime** | Date when the test result has been completed |  [optional] |
|**duration** | **Long** | Time which it took to run the test |  [optional] |
|**links** | [**List&lt;LinkSubGetModel&gt;**](LinkSubGetModel.md) | Collection of links attached to the test result |  |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) | Collection of files attached to the test result |  |



