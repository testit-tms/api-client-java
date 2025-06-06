

# TestPointFilterModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testPlanIds** | **List&lt;UUID&gt;** | Specifies a test point test plan IDS to search for |  [optional] |
|**testSuiteIds** | **List&lt;UUID&gt;** | Specifies a test point test suite IDs to search for |  [optional] |
|**workItemGlobalIds** | **List&lt;Long&gt;** | Specifies a test point work item global IDs to search for |  [optional] |
|**workItemMedianDuration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a test point work item median duration range to search for |  [optional] |
|**workItemIsDeleted** | **Boolean** | Specifies a test point work item is deleted flag to search for |  [optional] |
|**statuses** | **List&lt;TestPointStatus&gt;** | Specifies a test point statuses to search for |  [optional] |
|**statusCodes** | **List&lt;String&gt;** | Specifies a test point status codes to search for |  [optional] |
|**priorities** | **List&lt;WorkItemPriorityModel&gt;** | Specifies a test point priorities to search for |  [optional] |
|**sourceTypes** | **List&lt;WorkItemSourceTypeModel&gt;** | Specifies a test point source types to search for |  [optional] |
|**isAutomated** | **Boolean** | Specifies a test point automation status to search for |  [optional] |
|**name** | **String** | Specifies a test point name to search for |  [optional] |
|**configurationIds** | **List&lt;UUID&gt;** | Specifies a test point configuration IDs to search for |  [optional] |
|**testerIds** | **List&lt;UUID&gt;** | Specifies a test point assigned user IDs to search for |  [optional] |
|**duration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a test point range of duration to search for |  [optional] |
|**sectionIds** | **List&lt;UUID&gt;** | Specifies a test point work item section IDs to search for |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test point range of creation date to search for |  [optional] |
|**createdByIds** | **List&lt;UUID&gt;** | Specifies a test point creator IDs to search for |  [optional] |
|**modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test point range of last modification date to search for |  [optional] |
|**modifiedByIds** | **List&lt;UUID&gt;** | Specifies a test point last editor IDs to search for |  [optional] |
|**tags** | **List&lt;String&gt;** | Specifies a test point tags to search for |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Specifies a test point attributes to search for |  [optional] |
|**workItemCreatedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of creation date to search for |  [optional] |
|**workItemCreatedByIds** | **List&lt;UUID&gt;** | Specifies a work item creator IDs to search for |  [optional] |
|**workItemModifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of last modification date to search for |  [optional] |
|**workItemModifiedByIds** | **List&lt;UUID&gt;** | Specifies a work item last editor IDs to search for |  [optional] |



