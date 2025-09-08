

# AutoTestResultReasonsProjectApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Failure category identifier |  |
|**failureCategory** | **FailureCategory** | Category type |  |
|**createdDate** | **OffsetDateTime** | Failure category creation date |  |
|**createdById** | **UUID** | Failure category creator identifier |  |
|**failureCategoryId** | **Integer** | Category type index |  |
|**regexCount** | **Integer** | Regexes count |  |
|**projects** | [**List&lt;ProjectNameApiResult&gt;**](ProjectNameApiResult.md) | Projects names |  |
|**projectIds** | **List&lt;UUID&gt;** | Projects identifiers |  |
|**name** | **String** | Failure category name |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Failure category last modification date |  [optional] |
|**modifiedById** | **UUID** | Failure category last modifier identifier |  [optional] |



