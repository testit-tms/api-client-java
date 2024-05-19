

# PublicTestRunModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testRunId** | **UUID** |  |  |
|**testPlanId** | **UUID** |  |  [optional] |
|**testPlanGlobalId** | **Long** |  |  |
|**name** | **String** |  |  |
|**productName** | **String** |  |  [optional] |
|**build** | **String** |  |  [optional] |
|**configurations** | [**List&lt;ConfigurationModel&gt;**](ConfigurationModel.md) |  |  |
|**autoTests** | [**List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  |
|**testPoints** | [**List&lt;PublicTestPointModel&gt;**](PublicTestPointModel.md) |  |  |
|**status** | **String** |  |  |
|**customParameters** | **Map&lt;String, String&gt;** |  |  [optional] |
|**testRunDescription** | **String** |  |  [optional] |



