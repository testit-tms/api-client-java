

# AutoTestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**globalId** | **Long** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**mustBeApproved** | **Boolean** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**lastTestRunId** | **UUID** |  |  [optional] |
|**lastTestRunName** | **String** |  |  [optional] |
|**lastTestResultId** | **UUID** |  |  [optional] |
|**lastTestResultOutcome** | **String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  [optional] |
|**stabilityPercentage** | **Integer** |  |  [optional] |
|**externalId** | **String** | Specifies the ID of your autotest in the external system.&lt;br /&gt;  To test the method, you can use any ID. |  |
|**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) | Specifies the links in the autotest. |  [optional] |
|**projectId** | **UUID** | Specifies the project GUID.&lt;br /&gt;  You can get it using the &#x60;GET /api/v2/projects&#x60; method. |  |
|**name** | **String** | Specifies autotest name in the test management system. |  |
|**namespace** | **String** | Specifies the name of the namespace in the test management system. |  [optional] |
|**classname** | **String** | Specifies the class name in the test management system. |  [optional] |
|**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Specifies the steps in the autotest. |  [optional] |
|**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Specifies the setup steps and relates them to the autotest. Supported values are the same as in the &#x60;steps&#x60; parameter. |  [optional] |
|**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Specifies the teardown steps and relates them to the autotest. Supported values are the same as in the &#x60;steps&#x60; parameter. |  [optional] |
|**title** | **String** | Specifies the name of the autotest in the autotest card.   The &#x60;Name&#x60; parameter is responsible for the name in the table. |  [optional] |
|**description** | **String** | Specifies the autotest description in the test management system. |  [optional] |
|**labels** | [**List&lt;LabelShortModel&gt;**](LabelShortModel.md) | Specifies autotest labels. |  [optional] |
|**isFlaky** | **Boolean** | Marks the autotest as flaky. |  [optional] |



