

# AutotestSelectModelFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectIds** | **Set&lt;UUID&gt;** | Specifies an autotest projects IDs to search for |  [optional] |
|**externalIds** | **Set&lt;String&gt;** | Specifies an autotest external IDs to search for |  [optional] |
|**globalIds** | **Set&lt;Long&gt;** | Specifies an autotest global IDs to search for |  [optional] |
|**name** | **String** | Specifies an autotest name to search for |  [optional] |
|**isFlaky** | **Boolean** | Specifies an autotest flaky status to search for |  [optional] |
|**mustBeApproved** | **Boolean** | Specifies an autotest unapproved changes status to search for |  [optional] |
|**stabilityPercentage** | [**AutotestFilterModelStabilityPercentage**](AutotestFilterModelStabilityPercentage.md) |  |  [optional] |
|**createdDate** | [**AutotestFilterModelCreatedDate**](AutotestFilterModelCreatedDate.md) |  |  [optional] |
|**createdByIds** | **Set&lt;UUID&gt;** | Specifies an autotest creator IDs to search for |  [optional] |
|**modifiedDate** | [**AutotestFilterModelModifiedDate**](AutotestFilterModelModifiedDate.md) |  |  [optional] |
|**modifiedByIds** | **Set&lt;UUID&gt;** | Specifies an autotest last editor IDs to search for |  [optional] |
|**isDeleted** | **Boolean** | Specifies an autotest deleted status to search for |  [optional] |
|**namespace** | **String** | Specifies an autotest namespace to search for |  [optional] |
|**isEmptyNamespace** | **Boolean** | Specifies an autotest namespace name presence status to search for |  [optional] |
|**className** | **String** | Specifies an autotest class name to search for |  [optional] |
|**isEmptyClassName** | **Boolean** | Specifies an autotest class name presence status to search for |  [optional] |
|**lastTestResultOutcome** | **AutotestResultOutcome** |  |  [optional] |
|**externalKey** | **String** | Specifies an autotest external key to search for |  [optional] |
|**lastTestResultConfigurationIds** | **Set&lt;UUID&gt;** | Specifies an autotest configuration IDs of the last test result to search for |  [optional] |



