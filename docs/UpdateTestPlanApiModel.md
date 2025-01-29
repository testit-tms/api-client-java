

# UpdateTestPlanApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Test plan unique internal identifier |  |
|**lockedById** | **UUID** | User who locked test plan modification internal identifier |  [optional] |
|**name** | **String** | Test plan name |  |
|**startDate** | **OffsetDateTime** | Date and time of test plan start |  [optional] |
|**endDate** | **OffsetDateTime** | Date and time of test plan end |  [optional] |
|**description** | **String** | Test plan description |  [optional] |
|**build** | **String** | Build of the application on which test plan is executed |  [optional] |
|**projectId** | **UUID** | Project unique identifier |  |
|**productName** | **String** | Name of the testing product |  [optional] |
|**hasAutomaticDurationTimer** | **Boolean** | Boolean flag defines if test plan has automatic duration timer |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Key value pair of test plan custom attributes |  [optional] |
|**tags** | [**List&lt;TagApiModel&gt;**](TagApiModel.md) | Test plan tag names collection |  [optional] |



