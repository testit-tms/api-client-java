# Api client for Test IT TMS

## Getting Started

### Compatibility

| Test IT | API Client |
|---------|------------|
| 3.5     | 0.1        |
| 3.9     | 0.2.1      |
| 4.0     | 0.3.0      |
| 4.2     | 0.3.1      |
| 4.3     | 0.3.3      |
| 4.4     | 0.3.4      |
| 4.5     | 0.3.5      |
| 4.6     | 0.3.6      |
| 5.0     | 0.4.0      |
| 5.1     | 0.4.1      |
| 5.2     | 0.4.2      |

### Installation

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ru.testit</groupId>
    <artifactId>testit-api-client</artifactId>
    <version>LATEST_VERSION</version>
    <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "ru.testit:testit-api-client:LATEST_VERSION"
```

## Examples

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import ru.testit.invoker.*;
import ru.testit.invoker.auth.*;
import ru.testit.model.*;
import ru.testit.client.AttachmentsApi;
import ru.testit.client.model.AttachmentModel;

import java.io.File;
import java.util.*;

public class AttachmentsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("Your TMS address");
        defaultClient.setApiKeyPrefix("PrivateToken");
        defaultClient.setApiKey("Your private token");

        AttachmentsApi apiInstance = new AttachmentsApi();
        File file = new File("file_example");
        try {
            AttachmentModel result = apiInstance.apiV2AttachmentsPost(file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#addAttachment");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**apiV2AttachmentsIdDelete**](docs/AttachmentsApi.md#apiV2AttachmentsIdDelete) | **DELETE** /api/v2/attachments/{id} | Delete attachment file
*AttachmentsApi* | [**apiV2AttachmentsIdGet**](docs/AttachmentsApi.md#apiV2AttachmentsIdGet) | **GET** /api/v2/attachments/{id} | Download attachment file
*AttachmentsApi* | [**apiV2AttachmentsIdMetadataGet**](docs/AttachmentsApi.md#apiV2AttachmentsIdMetadataGet) | **GET** /api/v2/attachments/{id}/metadata | Get attachment metadata
*AttachmentsApi* | [**apiV2AttachmentsOccupiedFileStorageSizeGet**](docs/AttachmentsApi.md#apiV2AttachmentsOccupiedFileStorageSizeGet) | **GET** /api/v2/attachments/occupiedFileStorageSize | Get size of attachments storage in bytes
*AttachmentsApi* | [**apiV2AttachmentsPost**](docs/AttachmentsApi.md#apiV2AttachmentsPost) | **POST** /api/v2/attachments | Upload new attachment file
*AutoTestsApi* | [**apiV2AutoTestsFlakyBulkPost**](docs/AutoTestsApi.md#apiV2AutoTestsFlakyBulkPost) | **POST** /api/v2/autoTests/flaky/bulk | Set \&quot;Flaky\&quot; status for multiple autotests
*AutoTestsApi* | [**apiV2AutoTestsIdPatch**](docs/AutoTestsApi.md#apiV2AutoTestsIdPatch) | **PATCH** /api/v2/autoTests/{id} | Patch auto test
*AutoTestsApi* | [**apiV2AutoTestsIdTestResultsSearchPost**](docs/AutoTestsApi.md#apiV2AutoTestsIdTestResultsSearchPost) | **POST** /api/v2/autoTests/{id}/testResults/search | Get test results history for autotest
*AutoTestsApi* | [**apiV2AutoTestsIdWorkItemsChangedIdGet**](docs/AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedIdGet) | **GET** /api/v2/autoTests/{id}/workItems/changed/id | Get identifiers of changed linked work items
*AutoTestsApi* | [**apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**](docs/AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost) | **POST** /api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve | Approve changes to work items linked to autotest
*AutoTestsApi* | [**apiV2AutoTestsSearchPost**](docs/AutoTestsApi.md#apiV2AutoTestsSearchPost) | **POST** /api/v2/autoTests/search | Search for autotests
*AutoTestsApi* | [**createAutoTest**](docs/AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create autotest
*AutoTestsApi* | [**createMultiple**](docs/AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create multiple autotests
*AutoTestsApi* | [**deleteAutoTest**](docs/AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{id} | Delete autotest
*AutoTestsApi* | [**deleteAutoTestLinkFromWorkItem**](docs/AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{id}/workItems | Unlink autotest from work item
*AutoTestsApi* | [**getAllAutoTests**](docs/AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests | 
*AutoTestsApi* | [**getAutoTestAverageDuration**](docs/AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{id}/averageDuration | Get average autotest duration
*AutoTestsApi* | [**getAutoTestById**](docs/AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{id} | Get autotest by internal or global ID
*AutoTestsApi* | [**getAutoTestChronology**](docs/AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{id}/chronology | Get autotest chronology
*AutoTestsApi* | [**getTestRuns**](docs/AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{id}/testRuns | Get completed tests runs for autotests
*AutoTestsApi* | [**getWorkItemsLinkedToAutoTest**](docs/AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{id}/workItems | Get work items linked to autotest
*AutoTestsApi* | [**linkAutoTestToWorkItem**](docs/AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{id}/workItems | Link autotest with work items
*AutoTestsApi* | [**updateAutoTest**](docs/AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update autotest
*AutoTestsApi* | [**updateMultiple**](docs/AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update multiple autotests
*BackgroundJobsApi* | [**apiV2BackgroundJobsCompletedDelete**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsCompletedDelete) | **DELETE** /api/v2/backgroundJobs/completed | Delete all completed background jobs
*BackgroundJobsApi* | [**apiV2BackgroundJobsGet**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsGet) | **GET** /api/v2/backgroundJobs | 
*BackgroundJobsApi* | [**apiV2BackgroundJobsIdCancelPost**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsIdCancelPost) | **POST** /api/v2/backgroundJobs/{id}/cancel | Cancel current user background job
*BackgroundJobsApi* | [**apiV2BackgroundJobsIdGet**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsIdGet) | **GET** /api/v2/backgroundJobs/{id} | Get background job by ID
*BackgroundJobsApi* | [**apiV2BackgroundJobsIdStatusGet**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsIdStatusGet) | **GET** /api/v2/backgroundJobs/{id}/status | Get background job status by job ID
*BackgroundJobsApi* | [**apiV2BackgroundJobsSearchPost**](docs/BackgroundJobsApi.md#apiV2BackgroundJobsSearchPost) | **POST** /api/v2/backgroundJobs/search | Search for user background jobs
*ConfigurationsApi* | [**apiV2ConfigurationsCreateByParametersPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create configurations by parameters
*ConfigurationsApi* | [**apiV2ConfigurationsDeleteBulkPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsDeleteBulkPost) | **POST** /api/v2/configurations/delete/bulk | Delete multiple configurations
*ConfigurationsApi* | [**apiV2ConfigurationsIdDelete**](docs/ConfigurationsApi.md#apiV2ConfigurationsIdDelete) | **DELETE** /api/v2/configurations/{id} | Delete configuration
*ConfigurationsApi* | [**apiV2ConfigurationsIdPatch**](docs/ConfigurationsApi.md#apiV2ConfigurationsIdPatch) | **PATCH** /api/v2/configurations/{id} | Patch configuration
*ConfigurationsApi* | [**apiV2ConfigurationsIdPurgePost**](docs/ConfigurationsApi.md#apiV2ConfigurationsIdPurgePost) | **POST** /api/v2/configurations/{id}/purge | Permanently delete configuration from archive
*ConfigurationsApi* | [**apiV2ConfigurationsIdRestorePost**](docs/ConfigurationsApi.md#apiV2ConfigurationsIdRestorePost) | **POST** /api/v2/configurations/{id}/restore | Restore configuration from the archive
*ConfigurationsApi* | [**apiV2ConfigurationsPurgeBulkPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsPurgeBulkPost) | **POST** /api/v2/configurations/purge/bulk | Permanently delete multiple archived configurations
*ConfigurationsApi* | [**apiV2ConfigurationsPut**](docs/ConfigurationsApi.md#apiV2ConfigurationsPut) | **PUT** /api/v2/configurations | Edit configuration
*ConfigurationsApi* | [**apiV2ConfigurationsRestoreBulkPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsRestoreBulkPost) | **POST** /api/v2/configurations/restore/bulk | Restore multiple configurations from the archive
*ConfigurationsApi* | [**apiV2ConfigurationsSearchPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations
*ConfigurationsApi* | [**createConfiguration**](docs/ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration
*ConfigurationsApi* | [**getConfigurationById**](docs/ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesExistsGet**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesExistsGet) | **GET** /api/v2/customAttributes/templates/exists | 
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/exclude | Exclude CustomAttributes from CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/include | Include CustomAttributes to CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdDelete**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdDelete) | **DELETE** /api/v2/customAttributes/templates/{id} | Delete CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdGet**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdGet) | **GET** /api/v2/customAttributes/templates/{id} | Get CustomAttributeTemplate by ID
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesNameGet**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesNameGet) | **GET** /api/v2/customAttributes/templates/{name} | Get CustomAttributeTemplate by name
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesPost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPost) | **POST** /api/v2/customAttributes/templates | Create CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesPut**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPut) | **PUT** /api/v2/customAttributes/templates | Update custom attributes template
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesSearchPost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesSearchPost) | **POST** /api/v2/customAttributes/templates/search | Search CustomAttributeTemplates
*CustomAttributesApi* | [**apiV2CustomAttributesExistsGet**](docs/CustomAttributesApi.md#apiV2CustomAttributesExistsGet) | **GET** /api/v2/customAttributes/exists | 
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalIdDelete**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalIdDelete) | **DELETE** /api/v2/customAttributes/global/{id} | Delete global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalIdPut**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalIdPut) | **PUT** /api/v2/customAttributes/global/{id} | Edit global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalPost**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalPost) | **POST** /api/v2/customAttributes/global | Create global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesIdGet**](docs/CustomAttributesApi.md#apiV2CustomAttributesIdGet) | **GET** /api/v2/customAttributes/{id} | Get attribute
*CustomAttributesApi* | [**apiV2CustomAttributesSearchPost**](docs/CustomAttributesApi.md#apiV2CustomAttributesSearchPost) | **POST** /api/v2/customAttributes/search | Search for attributes
*NotificationsApi* | [**apiV2NotificationsCountGet**](docs/NotificationsApi.md#apiV2NotificationsCountGet) | **GET** /api/v2/notifications/count | Get unread Notifications total in last 7 days
*NotificationsApi* | [**apiV2NotificationsGet**](docs/NotificationsApi.md#apiV2NotificationsGet) | **GET** /api/v2/notifications | Get all Notifications for current User
*NotificationsApi* | [**apiV2NotificationsIdReadPost**](docs/NotificationsApi.md#apiV2NotificationsIdReadPost) | **POST** /api/v2/notifications/{id}/read | Set Notification as read
*NotificationsApi* | [**apiV2NotificationsReadPost**](docs/NotificationsApi.md#apiV2NotificationsReadPost) | **POST** /api/v2/notifications/read | Set all Notifications as read
*NotificationsApi* | [**apiV2NotificationsSearchPost**](docs/NotificationsApi.md#apiV2NotificationsSearchPost) | **POST** /api/v2/notifications/search | Search Notifications for current User
*ParametersApi* | [**apiV2ParametersBulkPost**](docs/ParametersApi.md#apiV2ParametersBulkPost) | **POST** /api/v2/parameters/bulk | Create multiple parameters
*ParametersApi* | [**apiV2ParametersBulkPut**](docs/ParametersApi.md#apiV2ParametersBulkPut) | **PUT** /api/v2/parameters/bulk | Update multiple parameters
*ParametersApi* | [**apiV2ParametersGroupsGet**](docs/ParametersApi.md#apiV2ParametersGroupsGet) | **GET** /api/v2/parameters/groups | Get parameters as group
*ParametersApi* | [**apiV2ParametersKeyNameNameExistsGet**](docs/ParametersApi.md#apiV2ParametersKeyNameNameExistsGet) | **GET** /api/v2/parameters/key/name/{name}/exists | Check existence parameter key in system
*ParametersApi* | [**apiV2ParametersKeyValuesGet**](docs/ParametersApi.md#apiV2ParametersKeyValuesGet) | **GET** /api/v2/parameters/{key}/values | Get all parameter key values
*ParametersApi* | [**apiV2ParametersKeysGet**](docs/ParametersApi.md#apiV2ParametersKeysGet) | **GET** /api/v2/parameters/keys | Get all parameter keys
*ParametersApi* | [**apiV2ParametersSearchGroupsPost**](docs/ParametersApi.md#apiV2ParametersSearchGroupsPost) | **POST** /api/v2/parameters/search/groups | Search for parameters as group
*ParametersApi* | [**apiV2ParametersSearchPost**](docs/ParametersApi.md#apiV2ParametersSearchPost) | **POST** /api/v2/parameters/search | Search for parameters
*ParametersApi* | [**createParameter**](docs/ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter
*ParametersApi* | [**deleteByName**](docs/ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name
*ParametersApi* | [**deleteByParameterKeyId**](docs/ParametersApi.md#deleteByParameterKeyId) | **DELETE** /api/v2/parameters/keyId/{keyId} | Delete parameters by parameter key identifier
*ParametersApi* | [**deleteParameter**](docs/ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{id} | Delete parameter
*ParametersApi* | [**getAllParameters**](docs/ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters
*ParametersApi* | [**getParameterById**](docs/ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{id} | Get parameter by ID
*ParametersApi* | [**updateParameter**](docs/ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter
*ProjectAttributeTemplatesApi* | [**apiV2ProjectsProjectIdAttributesTemplatesSearchPost**](docs/ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesSearchPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/search | Search for custom attributes templates
*ProjectAttributeTemplatesApi* | [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete**](docs/ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete) | **DELETE** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Delete CustomAttributeTemplate from Project
*ProjectAttributeTemplatesApi* | [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost**](docs/ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Add CustomAttributeTemplate to Project
*ProjectAttributesApi* | [**createProjectsAttribute**](docs/ProjectAttributesApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{projectId}/attributes | Create project attribute
*ProjectAttributesApi* | [**deleteProjectsAttribute**](docs/ProjectAttributesApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{projectId}/attributes/{attributeId} | Delete project attribute
*ProjectAttributesApi* | [**getAttributeByProjectId**](docs/ProjectAttributesApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{projectId}/attributes/{attributeId} | Get project attribute
*ProjectAttributesApi* | [**getAttributesByProjectId**](docs/ProjectAttributesApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{projectId}/attributes | Get project attributes
*ProjectAttributesApi* | [**searchAttributesInProject**](docs/ProjectAttributesApi.md#searchAttributesInProject) | **POST** /api/v2/projects/{projectId}/attributes/search | Search for attributes used in the project
*ProjectAttributesApi* | [**updateProjectsAttribute**](docs/ProjectAttributesApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{projectId}/attributes | Edit attribute of the project
*ProjectConfigurationsApi* | [**getConfigurationsByProjectId**](docs/ProjectConfigurationsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{projectId}/configurations | Get project configurations
*ProjectSectionsApi* | [**getSectionsByProjectId**](docs/ProjectSectionsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{projectId}/sections | Get project sections
*ProjectSettingsApi* | [**apiV2ProjectsProjectIdSettingsAutotestsPost**](docs/ProjectSettingsApi.md#apiV2ProjectsProjectIdSettingsAutotestsPost) | **POST** /api/v2/projects/{projectId}/settings/autotests | Set autotest project settings.
*ProjectSettingsApi* | [**getAutotestProjectSettings**](docs/ProjectSettingsApi.md#getAutotestProjectSettings) | **GET** /api/v2/projects/{projectId}/settings/autotests | Get autotest project settings.
*ProjectTestPlanAttributesApi* | [**createCustomAttributeTestPlanProjectRelations**](docs/ProjectTestPlanAttributesApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{projectId}/testPlans/attributes | Add attributes to project&#39;s test plans
*ProjectTestPlanAttributesApi* | [**deleteCustomAttributeTestPlanProjectRelations**](docs/ProjectTestPlanAttributesApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{projectId}/testPlans/attributes/{attributeId} | Delete attribute from project&#39;s test plans
*ProjectTestPlanAttributesApi* | [**getCustomAttributeTestPlanProjectRelations**](docs/ProjectTestPlanAttributesApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{projectId}/testPlans/attributes | Get project&#39;s test plan attributes
*ProjectTestPlanAttributesApi* | [**searchTestPlanAttributesInProject**](docs/ProjectTestPlanAttributesApi.md#searchTestPlanAttributesInProject) | **POST** /api/v2/projects/{projectId}/testPlans/attributes/search | Search for attributes used in the project test plans
*ProjectTestPlanAttributesApi* | [**updateCustomAttributeTestPlanProjectRelations**](docs/ProjectTestPlanAttributesApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{projectId}/testPlans/attributes | Update attribute of project&#39;s test plans
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansAnalyticsGet**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansAnalyticsGet) | **GET** /api/v2/projects/{projectId}/testPlans/analytics | Get TestPlans analytics
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansDeleteBulkPost**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansDeleteBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/delete/bulk | Delete multiple test plans
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansNameExistsGet**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansNameExistsGet) | **GET** /api/v2/projects/{projectId}/testPlans/{name}/exists | Checks if TestPlan exists with the specified name exists for the project
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansPurgeBulkPost**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansPurgeBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/purge/bulk | Permanently delete multiple archived test plans
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansRestoreBulkPost**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansRestoreBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/restore/bulk | Restore multiple test plans
*ProjectTestPlansApi* | [**apiV2ProjectsProjectIdTestPlansSearchPost**](docs/ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansSearchPost) | **POST** /api/v2/projects/{projectId}/testPlans/search | Get Project TestPlans with analytics
*ProjectWorkItemsApi* | [**apiV2ProjectsProjectIdWorkItemsSearchGroupedPost**](docs/ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost) | **POST** /api/v2/projects/{projectId}/workItems/search/grouped | Search for work items and group results by attribute
*ProjectWorkItemsApi* | [**apiV2ProjectsProjectIdWorkItemsSearchIdPost**](docs/ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchIdPost) | **POST** /api/v2/projects/{projectId}/workItems/search/id | Search for work items and extract IDs only
*ProjectWorkItemsApi* | [**apiV2ProjectsProjectIdWorkItemsSearchPost**](docs/ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchPost) | **POST** /api/v2/projects/{projectId}/workItems/search | Search for work items
*ProjectWorkItemsApi* | [**apiV2ProjectsProjectIdWorkItemsTagsGet**](docs/ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsTagsGet) | **GET** /api/v2/projects/{projectId}/workItems/tags | Get WorkItems Tags
*ProjectWorkItemsApi* | [**getWorkItemsByProjectId**](docs/ProjectWorkItemsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{projectId}/workItems | Get project work items
*ProjectsApi* | [**addGlobaAttributesToProject**](docs/ProjectsApi.md#addGlobaAttributesToProject) | **POST** /api/v2/projects/{id}/globalAttributes | Add global attributes to project
*ProjectsApi* | [**apiV2ProjectsDemoPost**](docs/ProjectsApi.md#apiV2ProjectsDemoPost) | **POST** /api/v2/projects/demo | 
*ProjectsApi* | [**apiV2ProjectsIdDelete**](docs/ProjectsApi.md#apiV2ProjectsIdDelete) | **DELETE** /api/v2/projects/{id} | Archive project
*ProjectsApi* | [**apiV2ProjectsIdFailureClassesGet**](docs/ProjectsApi.md#apiV2ProjectsIdFailureClassesGet) | **GET** /api/v2/projects/{id}/failureClasses | Get failure classes
*ProjectsApi* | [**apiV2ProjectsIdFavoritePut**](docs/ProjectsApi.md#apiV2ProjectsIdFavoritePut) | **PUT** /api/v2/projects/{id}/favorite | Mark Project as favorite
*ProjectsApi* | [**apiV2ProjectsIdFiltersGet**](docs/ProjectsApi.md#apiV2ProjectsIdFiltersGet) | **GET** /api/v2/projects/{id}/filters | Get Project filters
*ProjectsApi* | [**apiV2ProjectsIdPatch**](docs/ProjectsApi.md#apiV2ProjectsIdPatch) | **PATCH** /api/v2/projects/{id} | Patch project
*ProjectsApi* | [**apiV2ProjectsIdPurgePost**](docs/ProjectsApi.md#apiV2ProjectsIdPurgePost) | **POST** /api/v2/projects/{id}/purge | Purge the project
*ProjectsApi* | [**apiV2ProjectsIdRestorePost**](docs/ProjectsApi.md#apiV2ProjectsIdRestorePost) | **POST** /api/v2/projects/{id}/restore | Restore archived project
*ProjectsApi* | [**apiV2ProjectsIdTestPlansAttributeAttributeIdDelete**](docs/ProjectsApi.md#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete) | **DELETE** /api/v2/projects/{id}/testPlans/attribute/{attributeId} | Delete attribute from project&#39;s test plans
*ProjectsApi* | [**apiV2ProjectsIdTestPlansAttributePut**](docs/ProjectsApi.md#apiV2ProjectsIdTestPlansAttributePut) | **PUT** /api/v2/projects/{id}/testPlans/attribute | Update attribute of project&#39;s test plans
*ProjectsApi* | [**apiV2ProjectsIdTestRunsActiveGet**](docs/ProjectsApi.md#apiV2ProjectsIdTestRunsActiveGet) | **GET** /api/v2/projects/{id}/testRuns/active | Get active Project TestRuns
*ProjectsApi* | [**apiV2ProjectsIdTestRunsFullGet**](docs/ProjectsApi.md#apiV2ProjectsIdTestRunsFullGet) | **GET** /api/v2/projects/{id}/testRuns/full | Get Project TestRuns full models
*ProjectsApi* | [**apiV2ProjectsNameNameExistsGet**](docs/ProjectsApi.md#apiV2ProjectsNameNameExistsGet) | **GET** /api/v2/projects/name/{name}/exists | 
*ProjectsApi* | [**apiV2ProjectsPurgeBulkPost**](docs/ProjectsApi.md#apiV2ProjectsPurgeBulkPost) | **POST** /api/v2/projects/purge/bulk | Purge multiple projects
*ProjectsApi* | [**apiV2ProjectsRestoreBulkPost**](docs/ProjectsApi.md#apiV2ProjectsRestoreBulkPost) | **POST** /api/v2/projects/restore/bulk | Restore multiple projects
*ProjectsApi* | [**apiV2ProjectsSearchPost**](docs/ProjectsApi.md#apiV2ProjectsSearchPost) | **POST** /api/v2/projects/search | Search for projects
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create project
*ProjectsApi* | [**deleteProjectAutoTests**](docs/ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{id}/autoTests | Delete all autotests from project
*ProjectsApi* | [**getAllProjects**](docs/ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all projects
*ProjectsApi* | [**getAutoTestsNamespaces**](docs/ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{id}/autoTestsNamespaces | Get namespaces of autotests in project
*ProjectsApi* | [**getProjectById**](docs/ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{id} | Get project by ID
*ProjectsApi* | [**getTestPlansByProjectId**](docs/ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{id}/testPlans | Get project test plans
*ProjectsApi* | [**getTestRunsByProjectId**](docs/ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{id}/testRuns | Get project test runs
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update project
*SearchApi* | [**apiV2SearchGlobalSearchPost**](docs/SearchApi.md#apiV2SearchGlobalSearchPost) | **POST** /api/v2/search/globalSearch | 
*SectionsApi* | [**apiV2SectionsIdPatch**](docs/SectionsApi.md#apiV2SectionsIdPatch) | **PATCH** /api/v2/sections/{id} | Patch section
*SectionsApi* | [**createSection**](docs/SectionsApi.md#createSection) | **POST** /api/v2/sections | Create section
*SectionsApi* | [**deleteSection**](docs/SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{id} | Delete section
*SectionsApi* | [**getSectionById**](docs/SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{id} | Get section
*SectionsApi* | [**getWorkItemsBySectionId**](docs/SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{id}/workItems | Get section work items
*SectionsApi* | [**move**](docs/SectionsApi.md#move) | **POST** /api/v2/sections/move | Move section with all work items into another section
*SectionsApi* | [**rename**](docs/SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename section
*SectionsApi* | [**updateSection**](docs/SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update section
*TagsApi* | [**apiV2TagsDelete**](docs/TagsApi.md#apiV2TagsDelete) | **DELETE** /api/v2/tags | Delete tags
*TagsApi* | [**apiV2TagsGet**](docs/TagsApi.md#apiV2TagsGet) | **GET** /api/v2/tags | Get all Tags
*TagsApi* | [**apiV2TagsIdDelete**](docs/TagsApi.md#apiV2TagsIdDelete) | **DELETE** /api/v2/tags/{id} | Delete tag
*TagsApi* | [**apiV2TagsPost**](docs/TagsApi.md#apiV2TagsPost) | **POST** /api/v2/tags | Create tag
*TagsApi* | [**apiV2TagsPut**](docs/TagsApi.md#apiV2TagsPut) | **PUT** /api/v2/tags | Update tag
*TagsApi* | [**apiV2TagsSearchGet**](docs/TagsApi.md#apiV2TagsSearchGet) | **GET** /api/v2/tags/search | Search tags
*TagsApi* | [**apiV2TagsTestPlansTagsGet**](docs/TagsApi.md#apiV2TagsTestPlansTagsGet) | **GET** /api/v2/tags/testPlansTags | Get all Tags that are used in TestPlans
*TestPlansApi* | [**addTestPointsWithSections**](docs/TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{id}/test-points/withSections | Add test-points to TestPlan with sections
*TestPlansApi* | [**addWorkItemsWithSections**](docs/TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{id}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites
*TestPlansApi* | [**apiV2TestPlansIdAnalyticsGet**](docs/TestPlansApi.md#apiV2TestPlansIdAnalyticsGet) | **GET** /api/v2/testPlans/{id}/analytics | Get analytics by TestPlan
*TestPlansApi* | [**apiV2TestPlansIdAutobalancePost**](docs/TestPlansApi.md#apiV2TestPlansIdAutobalancePost) | **POST** /api/v2/testPlans/{id}/autobalance | Distribute test points between the users
*TestPlansApi* | [**apiV2TestPlansIdConfigurationsGet**](docs/TestPlansApi.md#apiV2TestPlansIdConfigurationsGet) | **GET** /api/v2/testPlans/{id}/configurations | Get TestPlan configurations
*TestPlansApi* | [**apiV2TestPlansIdExportTestPointsXlsxPost**](docs/TestPlansApi.md#apiV2TestPlansIdExportTestPointsXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testPoints/xlsx | Export TestPoints from TestPlan in xls format
*TestPlansApi* | [**apiV2TestPlansIdExportTestResultHistoryXlsxPost**](docs/TestPlansApi.md#apiV2TestPlansIdExportTestResultHistoryXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testResultHistory/xlsx | Export TestResults history from TestPlan in xls format
*TestPlansApi* | [**apiV2TestPlansIdHistoryGet**](docs/TestPlansApi.md#apiV2TestPlansIdHistoryGet) | **GET** /api/v2/testPlans/{id}/history | Get TestPlan history
*TestPlansApi* | [**apiV2TestPlansIdLinksGet**](docs/TestPlansApi.md#apiV2TestPlansIdLinksGet) | **GET** /api/v2/testPlans/{id}/links | Get Links of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdPatch**](docs/TestPlansApi.md#apiV2TestPlansIdPatch) | **PATCH** /api/v2/testPlans/{id} | Patch test plan
*TestPlansApi* | [**apiV2TestPlansIdSummariesGet**](docs/TestPlansApi.md#apiV2TestPlansIdSummariesGet) | **GET** /api/v2/testPlans/{id}/summaries | Get summary by TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestPointsLastResultsGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsLastResultsGet) | **GET** /api/v2/testPlans/{id}/testPoints/lastResults | Get TestPoints with last result from TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestPointsResetPost**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsResetPost) | **POST** /api/v2/testPlans/{id}/testPoints/reset | Reset TestPoints status of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestPointsTesterDelete**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsTesterDelete) | **DELETE** /api/v2/testPlans/{id}/testPoints/tester | Unassign users from multiple test points
*TestPlansApi* | [**apiV2TestPlansIdTestPointsTesterUserIdPost**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsTesterUserIdPost) | **POST** /api/v2/testPlans/{id}/testPoints/tester/{userId} | Assign user as a tester to multiple test points
*TestPlansApi* | [**apiV2TestPlansIdTestRunsGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsGet) | **GET** /api/v2/testPlans/{id}/testRuns | Get TestRuns of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestRunsSearchPost**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsSearchPost) | **POST** /api/v2/testPlans/{id}/testRuns/search | Search TestRuns of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet) | **GET** /api/v2/testPlans/{id}/testRuns/testResults/lastModified/modifiedDate | Get last modification date of test plan&#39;s test results
*TestPlansApi* | [**apiV2TestPlansIdUnlockRequestPost**](docs/TestPlansApi.md#apiV2TestPlansIdUnlockRequestPost) | **POST** /api/v2/testPlans/{id}/unlock/request | Send unlock TestPlan notification
*TestPlansApi* | [**apiV2TestPlansShortsPost**](docs/TestPlansApi.md#apiV2TestPlansShortsPost) | **POST** /api/v2/testPlans/shorts | Get TestPlans short models by Project identifiers
*TestPlansApi* | [**clone**](docs/TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{id}/clone | Clone TestPlan
*TestPlansApi* | [**complete**](docs/TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{id}/complete | Complete TestPlan
*TestPlansApi* | [**createTestPlan**](docs/TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan
*TestPlansApi* | [**deleteTestPlan**](docs/TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{id} | Delete TestPlan
*TestPlansApi* | [**getTestPlanById**](docs/TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{id} | Get TestPlan by Id
*TestPlansApi* | [**getTestSuitesById**](docs/TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{id}/testSuites | Get TestSuites Tree By Id
*TestPlansApi* | [**pause**](docs/TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{id}/pause | Pause TestPlan
*TestPlansApi* | [**purgeTestPlan**](docs/TestPlansApi.md#purgeTestPlan) | **POST** /api/v2/testPlans/{id}/purge | Permanently delete test plan from archive
*TestPlansApi* | [**restoreTestPlan**](docs/TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{id}/restore | Restore TestPlan
*TestPlansApi* | [**start**](docs/TestPlansApi.md#start) | **POST** /api/v2/testPlans/{id}/start | Start TestPlan
*TestPlansApi* | [**updateTestPlan**](docs/TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan
*TestPointsApi* | [**apiV2TestPointsIdTestRunsGet**](docs/TestPointsApi.md#apiV2TestPointsIdTestRunsGet) | **GET** /api/v2/testPoints/{id}/testRuns | Get all test runs which use test point
*TestPointsApi* | [**apiV2TestPointsIdWorkItemGet**](docs/TestPointsApi.md#apiV2TestPointsIdWorkItemGet) | **GET** /api/v2/testPoints/{id}/workItem | Get work item represented by test point
*TestPointsApi* | [**apiV2TestPointsSearchIdPost**](docs/TestPointsApi.md#apiV2TestPointsSearchIdPost) | **POST** /api/v2/testPoints/search/id | Search for test points and extract IDs only
*TestPointsApi* | [**apiV2TestPointsSearchPost**](docs/TestPointsApi.md#apiV2TestPointsSearchPost) | **POST** /api/v2/testPoints/search | Search for test points
*TestResultsApi* | [**apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost**](docs/TestResultsApi.md#apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost) | **POST** /api/v2/testResults/external-projects/{externalProjectId}/defects/external-forms | 
*TestResultsApi* | [**apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost**](docs/TestResultsApi.md#apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost) | **POST** /api/v2/testResults/external-projects/{externalProjectId}/defects | 
*TestResultsApi* | [**apiV2TestResultsIdAggregatedGet**](docs/TestResultsApi.md#apiV2TestResultsIdAggregatedGet) | **GET** /api/v2/testResults/{id}/aggregated | Get test result by ID aggregated with previous results
*TestResultsApi* | [**apiV2TestResultsIdAttachmentsAttachmentIdPut**](docs/TestResultsApi.md#apiV2TestResultsIdAttachmentsAttachmentIdPut) | **PUT** /api/v2/testResults/{id}/attachments/{attachmentId} | Attach file to the test result
*TestResultsApi* | [**apiV2TestResultsIdAttachmentsInfoGet**](docs/TestResultsApi.md#apiV2TestResultsIdAttachmentsInfoGet) | **GET** /api/v2/testResults/{id}/attachments/info | Get test result attachments meta-information
*TestResultsApi* | [**apiV2TestResultsIdGet**](docs/TestResultsApi.md#apiV2TestResultsIdGet) | **GET** /api/v2/testResults/{id} | Get test result by ID
*TestResultsApi* | [**apiV2TestResultsIdPut**](docs/TestResultsApi.md#apiV2TestResultsIdPut) | **PUT** /api/v2/testResults/{id} | Edit test result by ID
*TestResultsApi* | [**apiV2TestResultsIdRerunsGet**](docs/TestResultsApi.md#apiV2TestResultsIdRerunsGet) | **GET** /api/v2/testResults/{id}/reruns | Get reruns
*TestResultsApi* | [**apiV2TestResultsSearchPost**](docs/TestResultsApi.md#apiV2TestResultsSearchPost) | **POST** /api/v2/testResults/search | Search for test results
*TestResultsApi* | [**apiV2TestResultsStatisticsFilterPost**](docs/TestResultsApi.md#apiV2TestResultsStatisticsFilterPost) | **POST** /api/v2/testResults/statistics/filter | Search for test results and extract statistics
*TestResultsApi* | [**createAttachment**](docs/TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{id}/attachments | Upload and link attachment to TestResult
*TestResultsApi* | [**deleteAttachment**](docs/TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{id}/attachments/{attachmentId} | Remove attachment and unlink from TestResult
*TestResultsApi* | [**downloadAttachment**](docs/TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId} | Get attachment of TestResult
*TestResultsApi* | [**getAttachment**](docs/TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId}/info | Get Metadata of TestResult&#39;s attachment
*TestResultsApi* | [**getAttachments**](docs/TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{id}/attachments | Get all attachments of TestResult
*TestRunsApi* | [**apiV2TestRunsDelete**](docs/TestRunsApi.md#apiV2TestRunsDelete) | **DELETE** /api/v2/testRuns | Delete multiple test runs
*TestRunsApi* | [**apiV2TestRunsIdAutoTestsNamespacesGet**](docs/TestRunsApi.md#apiV2TestRunsIdAutoTestsNamespacesGet) | **GET** /api/v2/testRuns/{id}/autoTestsNamespaces | Get autotest classes and namespaces in test run
*TestRunsApi* | [**apiV2TestRunsIdDelete**](docs/TestRunsApi.md#apiV2TestRunsIdDelete) | **DELETE** /api/v2/testRuns/{id} | Delete test run
*TestRunsApi* | [**apiV2TestRunsIdPurgePost**](docs/TestRunsApi.md#apiV2TestRunsIdPurgePost) | **POST** /api/v2/testRuns/{id}/purge | Permanently delete test run from archive
*TestRunsApi* | [**apiV2TestRunsIdRerunsPost**](docs/TestRunsApi.md#apiV2TestRunsIdRerunsPost) | **POST** /api/v2/testRuns/{id}/reruns | Manual autotests rerun in test run
*TestRunsApi* | [**apiV2TestRunsIdRestorePost**](docs/TestRunsApi.md#apiV2TestRunsIdRestorePost) | **POST** /api/v2/testRuns/{id}/restore | Restore test run from the archive
*TestRunsApi* | [**apiV2TestRunsIdStatisticsFilterPost**](docs/TestRunsApi.md#apiV2TestRunsIdStatisticsFilterPost) | **POST** /api/v2/testRuns/{id}/statistics/filter | Search for the test run test results and build statistics
*TestRunsApi* | [**apiV2TestRunsIdTestPointsResultsGet**](docs/TestRunsApi.md#apiV2TestRunsIdTestPointsResultsGet) | **GET** /api/v2/testRuns/{id}/testPoints/results | Get test results from the test run grouped by test points
*TestRunsApi* | [**apiV2TestRunsIdTestResultsBulkPut**](docs/TestRunsApi.md#apiV2TestRunsIdTestResultsBulkPut) | **PUT** /api/v2/testRuns/{id}/testResults/bulk | Partial edit of multiple test results in the test run
*TestRunsApi* | [**apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**](docs/TestRunsApi.md#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet) | **GET** /api/v2/testRuns/{id}/testResults/lastModified/modificationDate | Get modification date of last test result of the test run
*TestRunsApi* | [**apiV2TestRunsPurgeBulkPost**](docs/TestRunsApi.md#apiV2TestRunsPurgeBulkPost) | **POST** /api/v2/testRuns/purge/bulk | Permanently delete multiple test runs from archive
*TestRunsApi* | [**apiV2TestRunsRestoreBulkPost**](docs/TestRunsApi.md#apiV2TestRunsRestoreBulkPost) | **POST** /api/v2/testRuns/restore/bulk | Restore multiple test runs from the archive
*TestRunsApi* | [**apiV2TestRunsSearchPost**](docs/TestRunsApi.md#apiV2TestRunsSearchPost) | **POST** /api/v2/testRuns/search | Search for test runs
*TestRunsApi* | [**apiV2TestRunsUpdateMultiplePost**](docs/TestRunsApi.md#apiV2TestRunsUpdateMultiplePost) | **POST** /api/v2/testRuns/updateMultiple | Update multiple test runs
*TestRunsApi* | [**completeTestRun**](docs/TestRunsApi.md#completeTestRun) | **POST** /api/v2/testRuns/{id}/complete | Complete TestRun
*TestRunsApi* | [**createAndFillByAutoTests**](docs/TestRunsApi.md#createAndFillByAutoTests) | **POST** /api/v2/testRuns/byAutoTests | Create test runs based on autotests and configurations
*TestRunsApi* | [**createAndFillByConfigurations**](docs/TestRunsApi.md#createAndFillByConfigurations) | **POST** /api/v2/testRuns/byConfigurations | Create test runs picking the needed test points
*TestRunsApi* | [**createAndFillByWorkItems**](docs/TestRunsApi.md#createAndFillByWorkItems) | **POST** /api/v2/testRuns/byWorkItems | Create test run based on configurations and work items
*TestRunsApi* | [**createEmpty**](docs/TestRunsApi.md#createEmpty) | **POST** /api/v2/testRuns | Create empty TestRun
*TestRunsApi* | [**getTestRunById**](docs/TestRunsApi.md#getTestRunById) | **GET** /api/v2/testRuns/{id} | Get TestRun by Id
*TestRunsApi* | [**setAutoTestResultsForTestRun**](docs/TestRunsApi.md#setAutoTestResultsForTestRun) | **POST** /api/v2/testRuns/{id}/testResults | Send test results to the test runs in the system
*TestRunsApi* | [**startTestRun**](docs/TestRunsApi.md#startTestRun) | **POST** /api/v2/testRuns/{id}/start | Start TestRun
*TestRunsApi* | [**stopTestRun**](docs/TestRunsApi.md#stopTestRun) | **POST** /api/v2/testRuns/{id}/stop | Stop TestRun
*TestRunsApi* | [**updateEmpty**](docs/TestRunsApi.md#updateEmpty) | **PUT** /api/v2/testRuns | Update empty TestRun
*TestSuitesApi* | [**addTestPointsToTestSuite**](docs/TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{id}/test-points | Add test-points to test suite
*TestSuitesApi* | [**apiV2TestSuitesIdPatch**](docs/TestSuitesApi.md#apiV2TestSuitesIdPatch) | **PATCH** /api/v2/testSuites/{id} | Patch test suite
*TestSuitesApi* | [**apiV2TestSuitesIdRefreshPost**](docs/TestSuitesApi.md#apiV2TestSuitesIdRefreshPost) | **POST** /api/v2/testSuites/{id}/refresh | Refresh test suite. Only dynamic test suites are supported by this method
*TestSuitesApi* | [**apiV2TestSuitesIdWorkItemsPost**](docs/TestSuitesApi.md#apiV2TestSuitesIdWorkItemsPost) | **POST** /api/v2/testSuites/{id}/workItems | Set work items for test suite
*TestSuitesApi* | [**apiV2TestSuitesPost**](docs/TestSuitesApi.md#apiV2TestSuitesPost) | **POST** /api/v2/testSuites | Create test suite
*TestSuitesApi* | [**apiV2TestSuitesPut**](docs/TestSuitesApi.md#apiV2TestSuitesPut) | **PUT** /api/v2/testSuites | Edit test suite
*TestSuitesApi* | [**deleteTestSuite**](docs/TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{id} | Delete TestSuite
*TestSuitesApi* | [**getConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{id}/configurations | Get Configurations By Id
*TestSuitesApi* | [**getTestPointsById**](docs/TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{id}/testPoints | Get TestPoints By Id
*TestSuitesApi* | [**getTestResultsById**](docs/TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{id}/testResults | Get TestResults By Id
*TestSuitesApi* | [**getTestSuiteById**](docs/TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{id} | Get TestSuite by Id
*TestSuitesApi* | [**searchWorkItems**](docs/TestSuitesApi.md#searchWorkItems) | **POST** /api/v2/testSuites/{id}/workItems/search | Search WorkItems
*TestSuitesApi* | [**setConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/configurations | Set Configurations By TestSuite Id
*UsersApi* | [**apiV2UsersExistsGet**](docs/UsersApi.md#apiV2UsersExistsGet) | **GET** /api/v2/users/exists | 
*WebhooksApi* | [**apiV2WebhooksDelete**](docs/WebhooksApi.md#apiV2WebhooksDelete) | **DELETE** /api/v2/webhooks | 
*WebhooksApi* | [**apiV2WebhooksGet**](docs/WebhooksApi.md#apiV2WebhooksGet) | **GET** /api/v2/webhooks | Get all webhooks
*WebhooksApi* | [**apiV2WebhooksIdDelete**](docs/WebhooksApi.md#apiV2WebhooksIdDelete) | **DELETE** /api/v2/webhooks/{id} | Delete webhook by ID
*WebhooksApi* | [**apiV2WebhooksIdGet**](docs/WebhooksApi.md#apiV2WebhooksIdGet) | **GET** /api/v2/webhooks/{id} | Get webhook by ID
*WebhooksApi* | [**apiV2WebhooksIdPut**](docs/WebhooksApi.md#apiV2WebhooksIdPut) | **PUT** /api/v2/webhooks/{id} | Edit webhook by ID
*WebhooksApi* | [**apiV2WebhooksPost**](docs/WebhooksApi.md#apiV2WebhooksPost) | **POST** /api/v2/webhooks | Create webhook
*WebhooksApi* | [**apiV2WebhooksPut**](docs/WebhooksApi.md#apiV2WebhooksPut) | **PUT** /api/v2/webhooks | 
*WebhooksApi* | [**apiV2WebhooksSearchPost**](docs/WebhooksApi.md#apiV2WebhooksSearchPost) | **POST** /api/v2/webhooks/search | Search for webhooks
*WebhooksApi* | [**apiV2WebhooksSpecialVariablesGet**](docs/WebhooksApi.md#apiV2WebhooksSpecialVariablesGet) | **GET** /api/v2/webhooks/specialVariables | Get special variables for webhook event type
*WebhooksApi* | [**apiV2WebhooksTestPost**](docs/WebhooksApi.md#apiV2WebhooksTestPost) | **POST** /api/v2/webhooks/test | Test webhook&#39;s url
*WebhooksLogsApi* | [**apiV2WebhooksLogsGet**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsGet) | **GET** /api/v2/webhooks/logs | Get all webhook logs
*WebhooksLogsApi* | [**apiV2WebhooksLogsIdDelete**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsIdDelete) | **DELETE** /api/v2/webhooks/logs/{id} | Delete webhook log by ID
*WebhooksLogsApi* | [**apiV2WebhooksLogsIdGet**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsIdGet) | **GET** /api/v2/webhooks/logs/{id} | Get webhook log by ID
*WorkItemsApi* | [**apiV2WorkItemsIdAttachmentsPost**](docs/WorkItemsApi.md#apiV2WorkItemsIdAttachmentsPost) | **POST** /api/v2/workItems/{id}/attachments | Upload and link attachment to WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdCheckListTransformToTestCasePost**](docs/WorkItemsApi.md#apiV2WorkItemsIdCheckListTransformToTestCasePost) | **POST** /api/v2/workItems/{id}/checkList/transformTo/testCase | Transform CheckList to TestCase
*WorkItemsApi* | [**apiV2WorkItemsIdHistoryGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdHistoryGet) | **GET** /api/v2/workItems/{id}/history | Get change history of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikeDelete**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikeDelete) | **DELETE** /api/v2/workItems/{id}/like | Delete like from WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikePost**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikePost) | **POST** /api/v2/workItems/{id}/like | Set like to WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikesCountGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikesCountGet) | **GET** /api/v2/workItems/{id}/likes/count | Get likes count of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikesGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikesGet) | **GET** /api/v2/workItems/{id}/likes | Get likes of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdTestResultsHistoryGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdTestResultsHistoryGet) | **GET** /api/v2/workItems/{id}/testResults/history | Get test results history of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdVersionVersionIdActualPost**](docs/WorkItemsApi.md#apiV2WorkItemsIdVersionVersionIdActualPost) | **POST** /api/v2/workItems/{id}/version/{versionId}/actual | Set WorkItem as actual
*WorkItemsApi* | [**apiV2WorkItemsMovePost**](docs/WorkItemsApi.md#apiV2WorkItemsMovePost) | **POST** /api/v2/workItems/move | Move WorkItem to another section
*WorkItemsApi* | [**apiV2WorkItemsSearchPost**](docs/WorkItemsApi.md#apiV2WorkItemsSearchPost) | **POST** /api/v2/workItems/search | Search for work items
*WorkItemsApi* | [**apiV2WorkItemsSharedStepIdReferencesSectionsPost**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesSectionsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/sections | Get SharedStep references in sections
*WorkItemsApi* | [**apiV2WorkItemsSharedStepIdReferencesWorkItemsPost**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/workItems | Get SharedStep references in work items
*WorkItemsApi* | [**apiV2WorkItemsSharedStepsSharedStepIdReferencesGet**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet) | **GET** /api/v2/workItems/sharedSteps/{sharedStepId}/references | Get SharedStep references
*WorkItemsApi* | [**createWorkItem**](docs/WorkItemsApi.md#createWorkItem) | **POST** /api/v2/workItems | Create Test Case, Checklist or Shared Step
*WorkItemsApi* | [**deleteAllWorkItemsFromAutoTest**](docs/WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{id}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId
*WorkItemsApi* | [**deleteWorkItem**](docs/WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{id} | Delete Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getAutoTestsForWorkItem**](docs/WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{id}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId
*WorkItemsApi* | [**getIterations**](docs/WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{id}/iterations | Get iterations by work item Id or GlobalId
*WorkItemsApi* | [**getWorkItemById**](docs/WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{id} | Get Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getWorkItemChronology**](docs/WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{id}/chronology | Get WorkItem chronology by Id or GlobalId
*WorkItemsApi* | [**getWorkItemVersions**](docs/WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{id}/versions | Get WorkItem versions
*WorkItemsApi* | [**purgeWorkItem**](docs/WorkItemsApi.md#purgeWorkItem) | **POST** /api/v2/workItems/{id}/purge | Permanently delete test case, checklist or shared steps from archive
*WorkItemsApi* | [**restoreWorkItem**](docs/WorkItemsApi.md#restoreWorkItem) | **POST** /api/v2/workItems/{id}/restore | Restore test case, checklist or shared steps from archive
*WorkItemsApi* | [**updateWorkItem**](docs/WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsCommentIdDelete**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsCommentIdDelete) | **DELETE** /api/v2/workItems/comments/{commentId} | Delete WorkItem comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsPost**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPost) | **POST** /api/v2/workItems/comments | Create WorkItem comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsPut**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPut) | **PUT** /api/v2/workItems/comments | Update work item comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsIdCommentsCountGet**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsCountGet) | **GET** /api/v2/workItems/{id}/comments/count | Get work item comments count
*WorkItemsCommentsApi* | [**apiV2WorkItemsIdCommentsGet**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsGet) | **GET** /api/v2/workItems/{id}/comments | Get work item comments


## Documentation for Models

You can see the documentation [here](https://github.com/testit-tms/api-client-java/blob/main/Readme.md)

# Contributing

You can help to develop the project. Any contributions are **greatly appreciated**.

* If you have suggestions for adding or removing projects, feel free to [open an issue](https://github.com/testit-tms/api-client-java/issues/new) to discuss it, or directly create a pull request after you edit the *README.md* file with necessary changes.
* Please make sure you check your spelling and grammar.
* Create individual PR for each suggestion.
* Please also read through the [Code Of Conduct](https://github.com/testit-tms/api-client-java/blob/main/CODE_OF_CONDUCT.md) before posting your first idea as well.

# License

Distributed under the Apache-2.0 License. See [LICENSE](https://github.com/testit-tms/api-client-java/blob/main/LICENSE.md) for more information.


