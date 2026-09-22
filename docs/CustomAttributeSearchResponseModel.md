

# CustomAttributeSearchResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workItemUsage** | [**List&lt;ProjectShortestModel&gt;**](ProjectShortestModel.md) |  |  |
|**testPlanUsage** | [**List&lt;ProjectShortestModel&gt;**](ProjectShortestModel.md) |  |  |
|**id** | **UUID** | Unique ID of the attribute. |  |
|**type** | **CustomAttributeTypesEnum** | Type of the attribute. |  |
|**options** | [**List&lt;CustomAttributeOptionModel&gt;**](CustomAttributeOptionModel.md) | Collection of the attribute options. |  |
|**targets** | **List&lt;String&gt;** | Collection of the attribute targets.   Defines where the attribute can be used (e.g., TestCases, AutoTestCases, TestPlans). |  |
|**isReadOnly** | **Boolean** | Indicates if the attribute is read-only. |  |
|**isDeleted** | **Boolean** | Indicates if the attribute is deleted. |  |
|**isSystem** | **Boolean** | Indicates if the attribute is system. |  |
|**name** | **String** | Name of the attribute |  |
|**isEnabled** | **Boolean** | Indicates if the attribute is enabled |  |
|**isRequired** | **Boolean** | Indicates if the attribute value is mandatory to specify |  |
|**isGlobal** | **Boolean** | Indicates if the attribute is available across all projects |  |
|**code** | **String** | Optional code identifier for the attribute. |  [optional] |



