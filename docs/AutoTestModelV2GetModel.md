

# AutoTestModelV2GetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | This property is used to set autotest identifier from client system |  |
|**links** | [**List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
|**projectId** | **UUID** | This property is used to link autotest with project |  |
|**name** | **String** |  |  |
|**namespace** | **String** |  |  [optional] |
|**classname** | **String** |  |  [optional] |
|**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
|**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
|**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
|**globalId** | **Long** |  |  |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**labels** | [**List&lt;LabelShortModel&gt;**](LabelShortModel.md) |  |  [optional] |
|**externalKey** | **String** |  |  [optional] |
|**id** | **UUID** | Unique ID of the entity |  |
|**isDeleted** | **Boolean** | Indicates if the entity is deleted |  |



