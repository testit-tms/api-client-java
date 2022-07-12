# AutoTestPostModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workItemIdsForLinkWithAutoTest** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**shouldCreateWorkItem** | **Boolean** |  |  [optional]
**externalId** | **String** | This property is used to set autotest identifier from client system | 
**links** | [**List&lt;LinkPostModel&gt;**](LinkPostModel.md) |  |  [optional]
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
