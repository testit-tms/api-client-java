

# TestSuiteHierarchyApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test suite |  |
|**name** | **String** | Name of the test suite |  |
|**type** | **TestSuiteTypeApiResult** | Type of the test suite |  |
|**saveStructure** | **Boolean** | Flag indicating whether the structure of the test suite should be saved |  |
|**autoRefresh** | **Boolean** | Flag indicating whether auto-refresh functionality is enabled for the test suite |  |
|**refreshDate** | **OffsetDateTime** | The last time the test suite&#39;s results were refreshed |  |
|**parentId** | **UUID** | Unique ID of the parent test suite, if any |  |
|**testPlanId** | **UUID** | Unique ID of the associated test plan |  |
|**children** | [**List&lt;TestSuiteHierarchyApiResult&gt;**](TestSuiteHierarchyApiResult.md) | Collection of child test suites |  [optional] |



