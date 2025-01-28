

# TestSuiteV2TreeModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**children** | [**List&lt;TestSuiteV2TreeModel&gt;**](TestSuiteV2TreeModel.md) | nested enumeration of children is allowed |  [optional] |
|**id** | **UUID** | Unique ID of the test suite |  |
|**refreshDate** | **OffsetDateTime** | Date of the last refresh of the test suite |  [optional] |
|**parentId** | **UUID** | Unique ID of the parent test suite in hierarchy |  [optional] |
|**testPlanId** | **UUID** | Unique ID of test plan to which the test suite belongs |  |
|**name** | **String** | Name of the test suite |  |
|**type** | **TestSuiteType** |  |  [optional] |
|**saveStructure** | **Boolean** | Indicates if the test suite retains section tree structure |  [optional] |
|**autoRefresh** | **Boolean** | Indicates if scheduled auto refresh is enabled for the test suite |  [optional] |



