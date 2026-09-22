

# ConfigurationParameterApiResult


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
|**values** | [**List&lt;ConfigurationParameterValueApiResult&gt;**](ConfigurationParameterValueApiResult.md) | List of configuration parameter values |  |
|**projects** | [**List&lt;ProjectNameApiResult&gt;**](ProjectNameApiResult.md) | List of assigned projects |  |



