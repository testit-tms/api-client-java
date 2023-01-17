

# AutoTestPutModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Used for search autotest. If value equals Guid mask filled with zeros, search will be executed using ExternalId |  [optional] |
|**workItemIdsForLinkWithAutoTest** | **Set&lt;UUID&gt;** |  |  [optional] |
|**externalId** | **String** | External ID of the autotest |  |
|**links** | [**List&lt;LinkPutModel&gt;**](LinkPutModel.md) | Collection of the autotest links |  [optional] |
|**projectId** | **UUID** | Unique ID of the autotest project |  |
|**name** | **String** | Name of the autotest |  |
|**namespace** | **String** | Name of the autotest namespace |  [optional] |
|**classname** | **String** | Name of the autotest class |  [optional] |
|**steps** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest steps |  [optional] |
|**setup** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest setup steps |  [optional] |
|**teardown** | [**List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest teardown steps |  [optional] |
|**title** | **String** | Name of the autotest in autotest&#39;s card |  [optional] |
|**description** | **String** | Description of the autotest in autotest&#39;s card |  [optional] |
|**labels** | [**List&lt;LabelPostModel&gt;**](LabelPostModel.md) | Collection of the autotest labels |  [optional] |
|**isFlaky** | **Boolean** | Indicates if the autotest is marked as flaky |  [optional] |



