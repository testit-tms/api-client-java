

# CustomAttributeApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the attribute |  |
|**options** | [**List&lt;CustomAttributeOptionApiResult&gt;**](CustomAttributeOptionApiResult.md) | Collection of the attribute options   Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only |  |
|**type** | **CustomAttributeType** | Type of the attribute |  |
|**isDeleted** | **Boolean** | Indicates if the attribute is deleted |  |
|**name** | **String** | Name of the attribute |  |
|**isEnabled** | **Boolean** | Indicates if the attribute is enabled |  |
|**isRequired** | **Boolean** | Indicates if the attribute value is mandatory to specify |  |
|**isReadOnly** | **Boolean** | Indicates if the attribute value is read-only |  |
|**isGlobal** | **Boolean** | Indicates if the attribute is available across all projects |  |
|**isSystem** | **Boolean** | Indicates if the attribute is system |  |
|**targets** | **List&lt;String&gt;** | Collection of the attribute targets   Defines where the attribute can be used (e.g., TestCases, AutoTestCases, TestPlans) |  |



