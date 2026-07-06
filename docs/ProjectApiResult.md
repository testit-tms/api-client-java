

# ProjectApiResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the project |  |
|**name** | **String** | Name of the project |  |
|**isFavorite** | **Boolean** | Indicates if the project is marked as favorite |  |
|**workItemsCount** | **Integer** | Number of work items in the project |  |
|**isDeleted** | **Boolean** | Indicates if the project is deleted |  |
|**createdDate** | **OffsetDateTime** | Creation date of the project |  |
|**createdById** | **UUID** | Unique ID of the project creator |  |
|**globalId** | **Long** | Global ID of the project |  |
|**type** | **ProjectType** | Type of the project |  |
|**workflowId** | **UUID** | ID of the workflow used in project |  |
|**description** | **String** | Description of the project |  [optional] |
|**testCasesCount** | **Integer** | Number of test cases in the project |  [optional] |
|**sharedStepsCount** | **Integer** | Number of shared steps in the project |  [optional] |
|**checkListsCount** | **Integer** | Number of checklists in the project |  [optional] |
|**autoTestsCount** | **Integer** | Number of autotests in the project |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Last modification date of the project |  [optional] |
|**modifiedById** | **UUID** | Unique ID of the project last editor |  [optional] |



