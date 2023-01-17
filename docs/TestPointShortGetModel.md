

# TestPointShortGetModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the test point |  [optional] |
|**createdDate** | **OffsetDateTime** | Creation date of the test point |  [optional] |
|**createdById** | **UUID** | Unique ID of the test point creator |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the test point |  [optional] |
|**modifiedById** | **UUID** | Unique ID of the test point last editor |  [optional] |
|**testerId** | **UUID** | Unique ID of the test point assigned user |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | Collection of the test point parameters |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** | Collection of attributes of work item the test point represents |  [optional] |
|**tags** | **List&lt;String&gt;** | Collection of the test point tags |  [optional] |
|**links** | **List&lt;String&gt;** | Collection of the test point links |  [optional] |
|**testSuiteId** | **UUID** | Unique ID of test suite the test point assigned to |  [optional] |
|**workItemGlobalId** | **Long** | Global ID of work item the test point represents |  [optional] |
|**workItemVersionId** | **UUID** | Unique ID of work item version the test point represents |  [optional] |
|**status** | **TestPointStatus** |  |  [optional] |
|**priority** | **WorkItemPriorityModel** |  |  [optional] |
|**isAutomated** | **Boolean** | Indicates if the test point represents an autotest |  [optional] |
|**name** | **String** | Name of the test point |  [optional] |
|**configurationId** | **UUID** | Unique ID of the test point configuration |  [optional] |
|**duration** | **Integer** | Duration of the test point |  [optional] |
|**sectionId** | **UUID** | Unique ID of section where work item the test point represents is located |  [optional] |
|**projectId** | **UUID** | Unique ID of the test point project |  [optional] |
|**lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) |  |  [optional] |
|**iterationId** | **UUID** | Unique ID of work item iteration the test point represents |  [optional] |



