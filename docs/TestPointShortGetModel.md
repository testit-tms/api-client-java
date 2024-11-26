

# TestPointShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test point |  |
|**createdDate** | **OffsetDateTime** | Creation date of the test point |  |
|**createdById** | **UUID** | Unique ID of the test point creator |  |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the test point |  [optional] |
|**modifiedById** | **UUID** | Unique ID of the test point last editor |  [optional] |
|**testerId** | **UUID** | Unique ID of the test point assigned user |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | Collection of the test point parameters |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Collection of attributes of work item the test point represents |  |
|**tags** | **List&lt;String&gt;** | Collection of the test point tags |  |
|**links** | **List&lt;String&gt;** | Collection of the test point links |  |
|**testSuiteId** | **UUID** | Unique ID of test suite the test point assigned to |  |
|**testSuiteName** | **String** | Name of the test suite |  |
|**workItemId** | **UUID** | Unique ID of work item the test point represents |  |
|**workItemGlobalId** | **Long** | Global ID of work item the test point represents |  |
|**workItemVersionId** | **UUID** | Unique ID of work item version the test point represents |  |
|**workItemVersionNumber** | **Integer** | Number of work item version the test point represents |  |
|**workItemMedianDuration** | **Long** | Median duration of work item the test point represents |  [optional] |
|**status** | **TestPointStatus** |  |  |
|**priority** | **WorkItemPriorityModel** |  |  |
|**isAutomated** | **Boolean** | Indicates if the test point represents an autotest |  |
|**name** | **String** | Name of the test point |  |
|**configurationId** | **UUID** | Unique ID of the test point configuration |  |
|**duration** | **Integer** | Duration of the test point |  |
|**sectionId** | **UUID** | Unique ID of section where work item the test point represents is located |  |
|**sectionName** | **String** | Name of section where work item the test point represents is located |  [optional] |
|**projectId** | **UUID** | Unique ID of the test point project |  |
|**lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) |  |  |
|**iterationId** | **UUID** | Unique ID of work item iteration the test point represents |  |
|**workItemState** | **WorkItemState** |  |  |
|**workItemCreatedById** | **UUID** | Unique ID of the work item creator |  |
|**workItemCreatedDate** | **OffsetDateTime** | Creation date of work item |  |
|**workItemModifiedById** | **UUID** | Unique ID of the work item last editor |  [optional] |
|**workItemModifiedDate** | **OffsetDateTime** | Modified date of work item |  [optional] |



