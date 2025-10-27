

# FailureCategoryApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Failure category identifier |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |
|**failureCategory** | **FailureCategory** | Category type |  |
|**createdDate** | **OffsetDateTime** | Failure category creation date |  |
|**createdById** | **UUID** | Failure category creator identifier |  |
|**projects** | [**List&lt;ProjectNameApiResult&gt;**](ProjectNameApiResult.md) | Projects names |  |
|**failureClassRegexes** | [**List&lt;FailureClassRegexApiResult&gt;**](FailureClassRegexApiResult.md) | Failure category regexes |  |
|**name** | **String** | Failure category name |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Failure category last modification date |  [optional] |
|**modifiedById** | **UUID** | Failure category last modifier identifier |  [optional] |



