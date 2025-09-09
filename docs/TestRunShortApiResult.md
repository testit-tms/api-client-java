

# TestRunShortApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test run |  |
|**name** | **String** | Name of the test run |  |
|**state** | **TestRunState** | Current state of the test run |  |
|**status** | [**TestStatusApiResult**](TestStatusApiResult.md) | Current status of the test run |  |
|**createdDate** | **OffsetDateTime** | Date when the test run was created |  |
|**createdById** | **UUID** | Unique ID of user who created the test run |  |
|**isDeleted** | **Boolean** | Is the test run is deleted |  |
|**autoTestsCount** | **Integer** | Number of AutoTests run in the test run |  |
|**statistics** | [**TestResultsStatisticsApiResult**](TestResultsStatisticsApiResult.md) | Statistics of the test run |  |
|**testResultsConfigurations** | [**List&lt;ConfigurationShortApiResult&gt;**](ConfigurationShortApiResult.md) | Test results configurations |  |
|**startedDate** | **OffsetDateTime** | Date when the test run was started |  [optional] |
|**completedDate** | **OffsetDateTime** | Completion date of the test run |  [optional] |
|**modifiedById** | **UUID** | Unique ID of user who modified the test run last time |  [optional] |



