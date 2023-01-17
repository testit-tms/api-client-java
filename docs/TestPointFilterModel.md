

# TestPointFilterModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testSuiteIds** | **Set&lt;UUID&gt;** | Specifies a test point test suite IDs to search for |  [optional] |
|**workItemGlobalIds** | **Set&lt;Long&gt;** | Specifies a test point work item global IDs to search for |  [optional] |
|**statuses** | **Set&lt;TestPointStatus&gt;** | Specifies a test point statuses to search for |  [optional] |
|**priorities** | **Set&lt;WorkItemPriorityModel&gt;** | Specifies a test point priorities to search for |  [optional] |
|**isAutomated** | **Boolean** | Specifies a test point automation status to search for |  [optional] |
|**name** | **String** | Specifies a test point name to search for |  [optional] |
|**configurationIds** | **Set&lt;UUID&gt;** | Specifies a test point configuration IDs to search for |  [optional] |
|**testerIds** | **Set&lt;UUID&gt;** | Specifies a test point assigned user IDs to search for |  [optional] |
|**duration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) |  |  [optional] |
|**sectionIds** | **Set&lt;UUID&gt;** | Specifies a test point work item section IDs to search for |  [optional] |
|**createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) |  |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Specifies a test point creator IDs to search for |  [optional] |
|**modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) |  |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Specifies a test point last editor IDs to search for |  [optional] |
|**tags** | **Set&lt;String&gt;** | Specifies a test point tags to search for |  [optional] |
|**attributes** | **Map&lt;String, Set&lt;String&gt;&gt;** | Specifies a test point attributes to search for |  [optional] |



