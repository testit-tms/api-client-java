

# AutoTestApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**projectId** | **UUID** |  |  |
|**externalId** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**namespace** | **String** |  |  [optional] |
|**classname** | **String** |  |  [optional] |
|**steps** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**setup** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**teardown** | [**List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**isFlaky** | **Boolean** |  |  |
|**externalKey** | **String** |  |  [optional] |
|**globalId** | **Long** |  |  |
|**isDeleted** | **Boolean** |  |  |
|**mustBeApproved** | **Boolean** |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
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



