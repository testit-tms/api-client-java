

# TestRunFilterModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectIds** | **Set&lt;UUID&gt;** | Specifies a test run project IDs to search for |  [optional] |
|**name** | **String** | Specifies test run name |  [optional] |
|**states** | **Set&lt;TestRunState&gt;** | Specifies a test run states to search for |  [optional] |
|**createdDate** | [**TestRunFilterModelCreatedDate**](TestRunFilterModelCreatedDate.md) |  |  [optional] |
|**startedDate** | [**TestRunFilterModelStartedDate**](TestRunFilterModelStartedDate.md) |  |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Specifies a test run creator IDs to search for |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Specifies a test run last editor IDs to search for |  [optional] |
|**isDeleted** | **Boolean** | Specifies a test run deleted status to search for |  [optional] |
|**autoTestsCount** | [**TestRunFilterModelAutoTestsCount**](TestRunFilterModelAutoTestsCount.md) |  |  [optional] |
|**testResultsOutcome** | **List&lt;TestResultOutcome&gt;** | Specifies test results outcomes |  [optional] |
|**failureCategory** | **List&lt;FailureCategoryModel&gt;** | Specifies failure categories |  [optional] |
|**completedDate** | [**TestRunFilterModelCompletedDate**](TestRunFilterModelCompletedDate.md) |  |  [optional] |



