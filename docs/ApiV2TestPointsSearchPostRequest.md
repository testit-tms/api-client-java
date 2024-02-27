

# ApiV2TestPointsSearchPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testPlanIds** | **List&lt;UUID&gt;** | Specifies a test point test plan IDS to search for |  [optional] |
|**testSuiteIds** | **List&lt;UUID&gt;** | Specifies a test point test suite IDs to search for |  [optional] |
|**workItemGlobalIds** | **List&lt;Long&gt;** | Specifies a test point work item global IDs to search for |  [optional] |
|**workItemMedianDuration** | [**TestPointFilterModelWorkItemMedianDuration**](TestPointFilterModelWorkItemMedianDuration.md) |  |  [optional] |
|**workItemIsDeleted** | **Boolean** | Specifies a test point work item is deleted flag to search for |  [optional] |
|**statuses** | **List&lt;TestPointStatus&gt;** | Specifies a test point statuses to search for |  [optional] |
|**priorities** | **List&lt;WorkItemPriorityModel&gt;** | Specifies a test point priorities to search for |  [optional] |
|**isAutomated** | **Boolean** | Specifies a test point automation status to search for |  [optional] |
|**name** | **String** | Specifies a test point name to search for |  [optional] |
|**configurationIds** | **List&lt;UUID&gt;** | Specifies a test point configuration IDs to search for |  [optional] |
|**testerIds** | **List&lt;UUID&gt;** | Specifies a test point assigned user IDs to search for |  [optional] |
|**duration** | [**TestPointFilterModelDuration**](TestPointFilterModelDuration.md) |  |  [optional] |
|**sectionIds** | **List&lt;UUID&gt;** | Specifies a test point work item section IDs to search for |  [optional] |
|**createdDate** | [**TestPointFilterModelCreatedDate**](TestPointFilterModelCreatedDate.md) |  |  [optional] |
|**createdByIds** | **List&lt;UUID&gt;** | Specifies a test point creator IDs to search for |  [optional] |
|**modifiedDate** | [**TestPointFilterModelModifiedDate**](TestPointFilterModelModifiedDate.md) |  |  [optional] |
|**modifiedByIds** | **List&lt;UUID&gt;** | Specifies a test point last editor IDs to search for |  [optional] |
|**tags** | **List&lt;String&gt;** | Specifies a test point tags to search for |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Specifies a test point attributes to search for |  [optional] |
|**workItemCreatedDate** | [**TestPointFilterModelWorkItemCreatedDate**](TestPointFilterModelWorkItemCreatedDate.md) |  |  [optional] |
|**workItemCreatedByIds** | **List&lt;UUID&gt;** | Specifies a work item creator IDs to search for |  [optional] |
|**workItemModifiedDate** | [**TestPointFilterModelWorkItemModifiedDate**](TestPointFilterModelWorkItemModifiedDate.md) |  |  [optional] |
|**workItemModifiedByIds** | **List&lt;UUID&gt;** | Specifies a work item last editor IDs to search for |  [optional] |



