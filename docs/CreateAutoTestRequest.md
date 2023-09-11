

# CreateAutoTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workItemIdsForLinkWithAutoTest** | **Set&lt;UUID&gt;** | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
|**shouldCreateWorkItem** | **Boolean** | Creates a test case linked to the autotest. |  [optional] |
|**externalId** | **String** | External ID of the autotest |  |
|**links** | [**List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Collection of the autotest links |  [optional] |
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
|**externalKey** | **String** | External key of the autotest |  [optional] |



