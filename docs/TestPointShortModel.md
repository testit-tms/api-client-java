

# TestPointShortModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testSuiteId** | **UUID** |  |  |
|**id** | **UUID** | Test point unique internal identifier |  |
|**testerId** | **UUID** | Tester who is responded for the test unique internal identifier |  [optional] |
|**workItemId** | **UUID** | Workitem to which test point relates unique identifier |  [optional] |
|**configurationId** | **UUID** | Configuration to which test point relates unique identifier |  [optional] |
|**status** | **String** | Test point status  &lt;br&gt;Applies one of these values: Blocked, NoResults, Failed, Passed |  [optional] |
|**lastTestResultId** | **UUID** | Last test result unique identifier |  [optional] |
|**iterationId** | **UUID** | Iteration unique identifier |  |
|**workItemMedianDuration** | **Long** | Median duration of work item the test point represents |  [optional] |



