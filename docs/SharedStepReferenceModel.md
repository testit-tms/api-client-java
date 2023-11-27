

# SharedStepReferenceModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**globalId** | **Long** |  |  |
|**name** | **String** |  |  |
|**entityTypeName** | **String** |  |  |
|**hasThisSharedStepAsStep** | **Boolean** |  |  |
|**hasThisSharedStepAsPrecondition** | **Boolean** |  |  |
|**hasThisSharedStepAsPostcondition** | **Boolean** |  |  |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**state** | **String** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**isDeleted** | **Boolean** |  |  |
|**versionId** | **UUID** | used for versioning changes in workitem |  |
|**isAutomated** | **Boolean** |  |  |
|**sectionId** | **UUID** |  |  |
|**tags** | [**List&lt;TagShortModel&gt;**](TagShortModel.md) |  |  [optional] |



