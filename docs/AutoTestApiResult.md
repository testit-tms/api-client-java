

# AutoTestApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**projectId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**isFlaky** | **Boolean** |  |  |
|**globalId** | **Long** |  |  |
|**isDeleted** | **Boolean** |  |  |
|**mustBeApproved** | **Boolean** |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**createdById** | **UUID** |  |  |
|**externalId** | **String** |  |  [optional] |
|**namespace** | **String** |  |  [optional] |
|**classname** | **String** |  |  [optional] |
|**steps** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**setup** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**teardown** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**externalKey** | **String** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**lastTestRunId** | **UUID** |  |  [optional] |
|**lastTestRunName** | **String** |  |  [optional] |
|**lastTestResultId** | **UUID** |  |  [optional] |
|**lastTestResultConfiguration** | [**ConfigurationShortApiResult**](ConfigurationShortApiResult.md) |  |  [optional] |
|**lastTestResultOutcome** | **String** |  |  [optional] |
|**lastTestResultStatus** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
|**stabilityPercentage** | **Long** |  |  [optional] |
|**links** | [**List&lt;LinkApiResult&gt;**](LinkApiResult.md) |  |  [optional] |
|**labels** | [**List&lt;LabelApiResult&gt;**](LabelApiResult.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



