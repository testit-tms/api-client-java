

# AutoTestCreateApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Unique ID of the autotest project |  |
|**externalId** | **String** | External ID of the autotest |  |
|**name** | **String** | Name of the autotest |  |
|**externalKey** | **String** | External key of the autotest |  [optional] |
|**namespace** | **String** | Name of the autotest namespace |  [optional] |
|**classname** | **String** | Name of the autotest class |  [optional] |
|**title** | **String** | Name of the autotest in autotest&#39;s card |  [optional] |
|**description** | **String** | Description of the autotest in autotest&#39;s card |  [optional] |
|**isFlaky** | **Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
|**steps** | [**List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest steps |  [optional] |
|**setup** | [**List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest setup steps |  [optional] |
|**teardown** | [**List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest teardown steps |  [optional] |
|**shouldCreateWorkItem** | **Boolean** | Creates a test case linked to the autotest. |  [optional] |
|**workItemIds** | **List&lt;UUID&gt;** | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Key value pair of custom work item attributes |  [optional] |
|**workItemIdsForLinkWithAutoTest** | **List&lt;UUID&gt;** | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
|**labels** | [**List&lt;LabelApiModel&gt;**](LabelApiModel.md) | Collection of the autotest labels |  [optional] |
|**links** | [**List&lt;LinkCreateApiModel&gt;**](LinkCreateApiModel.md) | Collection of the autotest links |  [optional] |
|**tags** | **List&lt;String&gt;** | Collection of the autotest tags |  [optional] |



