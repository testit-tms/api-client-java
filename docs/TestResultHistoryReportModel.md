

# TestResultHistoryReportModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**createdDate** | **OffsetDateTime** |  |  |
|**modifiedDate** | **OffsetDateTime** |  |  |
|**userId** | **UUID** | If test run was stopped, this property equals identifier of user who stopped it.Otherwise, the property equals identifier of user who created the test result |  |
|**testRunId** | **UUID** |  |  [optional] |
|**testRunName** | **String** |  |  [optional] |
|**createdByUserName** | **String** |  |  [optional] |
|**testPlanId** | **UUID** |  |  [optional] |
|**testPlanGlobalId** | **Long** |  |  [optional] |
|**testPlanName** | **String** |  |  [optional] |
|**configurationName** | **String** | If test point related to the test result has configuration, this property will be equal to the test point configuration name. Otherwise, this property will be equal to the test result configuration name |  [optional] |
|**isAutomated** | **Boolean** |  |  |
|**outcome** | **String** | If any test result related to the test run is linked with autotest and the run has an outcome, the outcome value equalsto the worst outcome of the last modified test result.Otherwise, the outcome equals to the outcome of first created test result in the test run |  [optional] |
|**comment** | **String** | If any test result related to the test run is linked with autotest, comment will have default valueOtherwise, the comment equals to the comment of first created test result in the test run |  [optional] |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) | If any test result related to the test run is linked with autotest, link will be equal to the links of last modified test result.Otherwise, the links equals to the links of first created test result in the test run |  [optional] |
|**startedOn** | **OffsetDateTime** |  |  [optional] |
|**completedOn** | **OffsetDateTime** |  |  [optional] |
|**duration** | **Long** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**attachments** | [**List&lt;AttachmentModel&gt;**](AttachmentModel.md) | If any test result related to the test run is linked with autotest, attachments will be equal to the attachments of last modified test result.Otherwise, the attachments equals to the attachments of first created test result in the test run |  [optional] |
|**workItemVersionId** | **UUID** |  |  [optional] |
|**workItemVersionNumber** | **Integer** |  |  [optional] |
|**launchSource** | **String** |  |  [optional] |
|**failureClassIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** |  |  [optional] |



