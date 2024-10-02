

# ApiV2TestResultsSearchPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testRunIds** | **List&lt;UUID&gt;** | Specifies a test result test run IDs to search for |  [optional] |
|**autoTestGlobalIds** | **List&lt;Long&gt;** | Specifies an autotest global IDs to search results for |  [optional] |
|**name** | **String** | Specifies an autotest name to search results for |  [optional] |
|**createdDate** | [**TestResultsFilterModelCreatedDate**](TestResultsFilterModelCreatedDate.md) |  |  [optional] |
|**modifiedDate** | [**TestResultsFilterModelModifiedDate**](TestResultsFilterModelModifiedDate.md) |  |  [optional] |
|**startedOn** | [**TestResultsFilterModelStartedOn**](TestResultsFilterModelStartedOn.md) |  |  [optional] |
|**completedOn** | [**TestResultsFilterModelCompletedOn**](TestResultsFilterModelCompletedOn.md) |  |  [optional] |
|**duration** | [**TestResultsFilterModelDuration**](TestResultsFilterModelDuration.md) |  |  [optional] |
|**resultReasons** | **List&lt;String&gt;** | Specifies result reasons for searching test results |  [optional] |
|**configurationIds** | **List&lt;UUID&gt;** | Specifies a test result configuration IDs to search for |  [optional] |
|**outcomes** | **List&lt;TestResultOutcome&gt;** | Specifies a test result outcomes to search for |  [optional] |
|**failureCategories** | **List&lt;FailureCategoryModel&gt;** | Specifies a test result failure categories to search for |  [optional] |
|**namespace** | **String** | Specifies a test result namespace to search for |  [optional] |
|**className** | **String** | Specifies a test result class name to search for |  [optional] |



