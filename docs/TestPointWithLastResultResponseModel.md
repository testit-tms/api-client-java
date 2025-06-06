

# TestPointWithLastResultResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**workItemName** | **String** |  |  [optional] |
|**isAutomated** | **Boolean** |  |  |
|**testerId** | **UUID** |  |  [optional] |
|**workItemId** | **UUID** |  |  |
|**configurationId** | **UUID** |  |  [optional] |
|**testSuiteId** | **UUID** |  |  |
|**lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**statusModel** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
|**workItemGlobalId** | **Long** |  |  [optional] |
|**workItemEntityTypeName** | **String** |  |  [optional] |
|**sectionId** | **UUID** |  |  |
|**sectionName** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**createdById** | **UUID** |  |  |
|**modifiedById** | **UUID** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**tagNames** | **List&lt;String&gt;** |  |  [optional] |
|**duration** | **Integer** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**sourceType** | **WorkItemSourceTypeModel** |  |  |
|**testSuiteNameBreadCrumbs** | **List&lt;String&gt;** |  |  [optional] |
|**groupCount** | **Integer** |  |  [optional] |
|**iteration** | [**IterationModel**](IterationModel.md) |  |  [optional] |



