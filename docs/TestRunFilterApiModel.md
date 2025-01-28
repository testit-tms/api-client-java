

# TestRunFilterApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectIds** | **List&lt;UUID&gt;** | Specifies a test run project IDs to search for |  [optional] |
|**name** | **String** | Specifies test run name |  [optional] |
|**states** | **List&lt;TestRunState&gt;** | Specifies a test run states to search for |  [optional] |
|**statusCodes** | **List&lt;String&gt;** | Specifies a test run status codes to search for |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of created date to search for |  [optional] |
|**startedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of started date to search for |  [optional] |
|**createdByIds** | **List&lt;UUID&gt;** | Specifies a test run creator IDs to search for |  [optional] |
|**modifiedByIds** | **List&lt;UUID&gt;** | Specifies a test run last editor IDs to search for |  [optional] |
|**isDeleted** | **Boolean** | Specifies a test run deleted status to search for |  [optional] |
|**autoTestsCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) | Number of autoTests run in the test run |  [optional] |
|**testResultsOutcome** | **List&lt;TestResultOutcome&gt;** | Specifies test results outcomes |  [optional] |
|**testResultsStatusCodes** | **List&lt;String&gt;** | Specifies test results status codes |  [optional] |
|**failureCategory** | **List&lt;FailureCategory&gt;** | Specifies failure categories |  [optional] |
|**completedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of completed date to search for |  [optional] |
|**testResultsConfigurationIds** | **List&lt;UUID&gt;** | Specifies a test result configuration IDs to search for |  [optional] |



