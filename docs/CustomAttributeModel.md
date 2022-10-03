

# CustomAttributeModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of attribute |  [optional] |
|**options** | [**List&lt;CustomAttributeOptionModel&gt;**](CustomAttributeOptionModel.md) | Collection of attribute options  &lt;br /&gt;  Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only |  [optional] |
|**type** | **CustomAttributeTypesEnum** |  |  |
|**isDeleted** | **Boolean** | Indicates whether the attribute is deleted |  [optional] |
|**name** | **String** | Name of attribute |  |
|**enabled** | **Boolean** | Indicates whether the attribute is available |  [optional] |
|**required** | **Boolean** | Indicates whether the attribute value is mandatory to specify |  [optional] |
|**isGlobal** | **Boolean** | Indicates whether the attribute is available across all projects |  [optional] |



