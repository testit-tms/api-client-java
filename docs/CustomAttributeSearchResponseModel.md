

# CustomAttributeSearchResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workItemUsage** | [**List&lt;ProjectShortestModel&gt;**](ProjectShortestModel.md) |  |  |
|**testPlanUsage** | [**List&lt;ProjectShortestModel&gt;**](ProjectShortestModel.md) |  |  |
|**id** | **UUID** | Unique ID of the attribute |  |
|**options** | [**List&lt;CustomAttributeOptionModel&gt;**](CustomAttributeOptionModel.md) | Collection of the attribute options   Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only |  |
|**type** | **CustomAttributeTypesEnum** | Type of the attribute |  |
|**isDeleted** | **Boolean** | Indicates if the attribute is deleted |  |
|**name** | **String** | Name of the attribute |  |
|**isEnabled** | **Boolean** | Indicates if the attribute is enabled |  |
|**isRequired** | **Boolean** | Indicates if the attribute value is mandatory to specify |  |
|**isGlobal** | **Boolean** | Indicates if the attribute is available across all projects |  |



