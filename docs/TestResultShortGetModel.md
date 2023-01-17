

# TestResultShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of test result |  [optional] |
|**name** | **String** | Name of autotest represented by the test result |  [optional] |
|**autotestGlobalId** | **Long** | Global ID of autotest represented by test result |  [optional] |
|**testRunId** | **UUID** | Unique ID of test run where test result is located |  [optional] |
|**configurationId** | **UUID** | Unique ID of configuration which test result uses |  [optional] |
|**configurationName** | **String** | Name of configuration which test result uses |  [optional] |
|**outcome** | **TestResultOutcome** |  |  [optional] |
|**resultReasons** | [**List&lt;AutotestResultReasonSubGetModel&gt;**](AutotestResultReasonSubGetModel.md) | Collection of result reasons which test result have |  [optional] |
|**comment** | **String** | Comment to test result |  [optional] |
|**date** | **OffsetDateTime** | Date when test result has been set |  [optional] |
|**duration** | **Long** | Time which it took to run the test |  [optional] |
|**links** | [**List&lt;LinkSubGetModel&gt;**](LinkSubGetModel.md) | Collection of links attached to test result |  [optional] |
|**attachments** | [**List&lt;AttachmentSubGetModel&gt;**](AttachmentSubGetModel.md) | Collection of files attached to test result |  [optional] |



