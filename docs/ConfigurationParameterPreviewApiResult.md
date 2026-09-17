

# ConfigurationParameterPreviewApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifier of the configuration parameter |  |
|**name** | **String** | Name of the configuration parameter |  |
|**isDeleted** | **Boolean** | Is configuration parameter deleted? |  |
|**createdDate** | **OffsetDateTime** | Date of configuration parameter creation |  |
|**createdById** | **UUID** | Identifier of user who created configuration parameter |  |
|**modifiedDate** | **OffsetDateTime** | Date of configuration parameter modification |  |
|**modifiedById** | **UUID** | Identifier of user who modified configuration parameter |  |
|**values** | [**ConfigurationParameterValueApiResultApiCollectionPreview**](ConfigurationParameterValueApiResultApiCollectionPreview.md) | Preview of configuration parameter values |  |
|**projects** | [**ProjectNameApiResultApiCollectionPreview**](ProjectNameApiResultApiCollectionPreview.md) | Preview of assigned projects |  |



