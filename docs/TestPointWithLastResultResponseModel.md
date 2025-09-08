

# TestPointWithLastResultResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**isAutomated** | **Boolean** |  |  |
|**workItemId** | **UUID** |  |  |
|**testSuiteId** | **UUID** |  |  |
|**sectionId** | **UUID** |  |  |
|**createdById** | **UUID** |  |  |
|**duration** | **Integer** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**sourceType** | **WorkItemSourceTypeModel** |  |  |
|**workItemName** | **String** |  |  [optional] |
|**testerId** | **UUID** |  |  [optional] |
|**configurationId** | **UUID** |  |  [optional] |
|**lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**statusModel** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
|**workItemGlobalId** | **Long** |  |  [optional] |
|**workItemEntityTypeName** | **String** |  |  [optional] |
|**sectionName** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedById** | **UUID** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**tagNames** | **List&lt;String&gt;** |  |  [optional] |
|**testSuiteNameBreadCrumbs** | **List&lt;String&gt;** |  |  [optional] |
|**groupCount** | **Integer** |  |  [optional] |
|**iteration** | [**IterationModel**](IterationModel.md) |  |  [optional] |



