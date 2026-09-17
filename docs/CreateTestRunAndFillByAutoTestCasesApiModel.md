

# CreateTestRunAndFillByAutoTestCasesApiModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **UUID** | Specifies the GUID of the project, in which a test run will be created. |  |
|**configurationIds** | **List&lt;UUID&gt;** | Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. |  |
|**option** | [**TestRunLaunchOptionApiModel**](TestRunLaunchOptionApiModel.md) | Specifies the test run launch options. |  |
|**filter** | [**CompositeFilter**](CompositeFilter.md) | Specifies the filter for selecting autotests, from which test points are created. |  [optional] |
|**name** | **String** | Specifies the name of the test run. |  [optional] |
|**description** | **String** | Specifies the test run description. |  [optional] |
|**launchSource** | **String** | Specifies the test run launch source. |  [optional] |
|**tags** | **List&lt;String&gt;** | Collection of tags to assign to the test run |  [optional] |



