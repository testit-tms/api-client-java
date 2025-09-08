

# ProjectDetailedFailureCategoryApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Failure category identifier |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |
|**failureCategory** | **FailureCategory** | Category type |  |
|**createdDate** | **OffsetDateTime** | Failure category creation date |  |
|**createdById** | **UUID** | Failure category creator identifier |  |
|**failureClassRegexes** | [**List&lt;FailureClassRegexApiResult&gt;**](FailureClassRegexApiResult.md) | Failure category regexes |  |
|**projectsCount** | **Integer** | Projects relations count |  |
|**name** | **String** | Failure category name |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Failure category last modification date |  [optional] |
|**modifiedById** | **UUID** | Failure category last modifier identifier |  [optional] |



