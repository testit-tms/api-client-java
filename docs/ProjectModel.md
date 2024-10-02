

# ProjectModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the project |  |
|**description** | **String** | Description of the project |  [optional] |
|**name** | **String** | Name of the project |  |
|**isFavorite** | **Boolean** | Indicates if the project is marked as favorite |  |
|**attributesScheme** | [**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md) | Collection of the project attributes |  [optional] |
|**testPlansAttributesScheme** | [**List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md) | Collection of the project test plans attributes |  [optional] |
|**testCasesCount** | **Integer** | Number of test cases in the project |  [optional] |
|**sharedStepsCount** | **Integer** | Number of shared steps in the project |  [optional] |
|**checkListsCount** | **Integer** | Number of checklists in the project |  [optional] |
|**autoTestsCount** | **Integer** | Number of autotests in the project |  [optional] |
|**isDeleted** | **Boolean** | Indicates if the project is deleted |  |
|**createdDate** | **OffsetDateTime** | Creation date of the project |  |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the project |  [optional] |
|**createdById** | **UUID** | Unique ID of the project creator |  |
|**modifiedById** | **UUID** | Unique ID of the project last editor |  [optional] |
|**globalId** | **Long** | Global ID of the project |  |
|**type** | **ProjectTypeModel** |  |  |
|**isFlakyAuto** | **Boolean** | Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically |  |



