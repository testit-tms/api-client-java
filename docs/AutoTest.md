

# AutoTest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | External ID of the autotest |  |
|**links** | [**List&lt;Link&gt;**](Link.md) | Collection of the autotest links |  [optional] |
|**projectId** | **UUID** | Unique ID of the autotest project |  |
|**name** | **String** | Name of the autotest |  |
|**namespace** | **String** | Name of the autotest namespace |  [optional] |
|**classname** | **String** | Name of the autotest class |  [optional] |
|**steps** | [**List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest steps |  [optional] |
|**setup** | [**List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest setup steps |  [optional] |
|**teardown** | [**List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest teardown steps |  [optional] |
|**title** | **String** | Name of the autotest in autotest&#39;s card |  [optional] |
|**description** | **String** | Description of the autotest in autotest&#39;s card |  [optional] |
|**labels** | [**List&lt;Label&gt;**](Label.md) | Collection of the autotest labels |  [optional] |
|**isFlaky** | **Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
|**externalKey** | **String** | External key of the autotest |  [optional] |
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
|**lastTestResultConfiguration** | [**ConfigurationShort**](ConfigurationShort.md) | Configuration of the autotest last test result |  [optional] |
|**lastTestResultOutcome** | **String** | Outcome of the autotest last test result |  [optional] |
|**stabilityPercentage** | **Integer** | Stability percentage of the autotest |  [optional] |



