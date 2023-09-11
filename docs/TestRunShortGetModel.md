

# TestRunShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test run |  |
|**name** | **String** | Name of the test run |  [optional] |
|**state** | **TestRunState** |  |  |
|**createdDate** | **OffsetDateTime** | Date when the test run was created |  |
|**startedDate** | **OffsetDateTime** | Date when the test run was started |  [optional] |
|**completedDate** | **OffsetDateTime** | Completion date of the test run |  [optional] |
|**createdById** | **UUID** | Unique ID of user who created the test run |  |
|**modifiedById** | **UUID** | Unique ID of user who modified the test run last time |  [optional] |
|**isDeleted** | **Boolean** | Is the test run is deleted |  |
|**autoTestsCount** | **Integer** | Number of AutoTests run in the test run |  |
|**statistics** | [**TestRunShortGetModelStatistics**](TestRunShortGetModelStatistics.md) |  |  [optional] |



