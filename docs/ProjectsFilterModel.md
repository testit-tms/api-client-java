

# ProjectsFilterModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Specifies a project name to search for |  [optional] |
|**isFavorite** | **Boolean** | Specifies a project favorite status to search for |  [optional] |
|**isDeleted** | **Boolean** | Specifies a project deleted status to search for |  [optional] |
|**testCasesCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) |  |  [optional] |
|**checklistsCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) |  |  [optional] |
|**sharedStepsCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) |  |  [optional] |
|**autotestsCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) |  |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Specifies a project global IDs to search for |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) |  |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Specifies an autotest creator IDs to search for |  [optional] |



