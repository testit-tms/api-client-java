

# AutoTestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**globalId** | **Long** | Global ID of the autotest |  |
|**isDeleted** | **Boolean** | Indicates if the autotest is deleted |  |
|**mustBeApproved** | **Boolean** | Indicates if the autotest has unapproved changes from linked work items |  |
|**id** | **UUID** | Unique ID of the autotest |  |
|**createdDate** | **OffsetDateTime** | Creation date of the autotest |  |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the project |  [optional] |
|**createdById** | **UUID** | Unique ID of the project creator |  |
|**modifiedById** | **UUID** | Unique ID of the project last editor |  [optional] |
|**lastTestRunId** | **UUID** | Unique ID of the autotest last test run |  [optional] |
|**lastTestRunName** | **String** | Name of the autotest last test run |  [optional] |
|**lastTestResultId** | **UUID** | Unique ID of the autotest last test result |  [optional] |
|**lastTestResultConfiguration** | [**ConfigurationShortModel**](ConfigurationShortModel.md) | Configuration of the autotest last test result |  [optional] |
|**lastTestResultOutcome** | **String** | Outcome of the autotest last test result |  [optional] |
|**lastTestResultStatus** | [**TestStatusModel**](TestStatusModel.md) | Status of the autotest last test result |  [optional] |
|**stabilityPercentage** | **Integer** | Stability percentage of the autotest |  [optional] |
|**externalId** | **String** | External ID of the autotest |  |
|**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) | Collection of the autotest links |  [optional] |
|**projectId** | **UUID** | Unique ID of the autotest project |  |
|**name** | **String** | Name of the autotest |  |
|**namespace** | **String** | Name of the autotest namespace |  [optional] |
|**classname** | **String** | Name of the autotest class |  [optional] |
|**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest steps |  [optional] |
|**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest setup steps |  [optional] |
|**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest teardown steps |  [optional] |
|**title** | **String** | Name of the autotest in autotest&#39;s card |  [optional] |
|**description** | **String** | Description of the autotest in autotest&#39;s card |  [optional] |
|**labels** | [**List&lt;LabelShortModel&gt;**](LabelShortModel.md) | Collection of the autotest labels |  [optional] |
|**isFlaky** | **Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
|**externalKey** | **String** | External key of the autotest |  [optional] |



