

# TestRunShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test run |  [optional] |
|**name** | **String** | Name of the test run |  [optional] |
|**projectId** | **UUID** | Unique ID of project where test run is located |  [optional] |
|**createdDate** | **OffsetDateTime** | Date when the test run was created |  [optional] |
|**createdById** | **UUID** | Unique ID of user who created the test run |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date when the test run was modified last time |  [optional] |
|**modifiedById** | **UUID** | Unique ID of user who modified the test run last time |  [optional] |
|**isDeleted** | **Boolean** | Is the test run is deleted |  [optional] |
|**state** | **TestRunState** |  |  |
|**startedDate** | **OffsetDateTime** | Date when the test run was started |  [optional] |
|**autotestsCount** | **Integer** | Number of autotests run in the test run |  [optional] |
|**statistics** | [**TestResultsStatisticsGetModel**](TestResultsStatisticsGetModel.md) |  |  |



