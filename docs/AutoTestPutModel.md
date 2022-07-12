# AutoTestPutModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Used for search autotest. If value equals Guid mask filled with zeros, search will be executed using ExternalId |  [optional]
**workItemIdsForLinkWithAutoTest** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**externalId** | **String** | This property is used to set autotest identifier from client system | 
**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  |  [optional]
**projectId** | [**UUID**](UUID.md) | This property is used to link autotest with project | 
**name** | **String** |  | 
**namespace** | **String** |  |  [optional]
**classname** | **String** |  |  [optional]
**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional]
**title** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**labels** | [**List&lt;LabelPostModel&gt;**](LabelPostModel.md) |  |  [optional]
**isFlaky** | **Boolean** |  |  [optional]
