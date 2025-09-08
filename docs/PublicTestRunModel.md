

# PublicTestRunModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testRunId** | **UUID** |  |  |
|**testPlanGlobalId** | **Long** |  |  |
|**name** | **String** |  |  |
|**configurations** | [**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md) |  |  |
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  |
|**testPoints** | [**List&lt;PublicTestPointModel&gt;**](PublicTestPointModel.md) |  |  |
|**status** | **String** |  |  |
|**statusModel** | [**TestStatusModel**](TestStatusModel.md) |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**productName** | **String** |  |  [optional] |
|**build** | **String** |  |  [optional] |
|**customParameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**testRunDescription** | **String** |  |  [optional] |



