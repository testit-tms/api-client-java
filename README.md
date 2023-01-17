# Api client for Test IT TMS

## Getting Started

### Compatibility

| Test IT | API Client |
|---------|------------|
| 3.5     | 0.1        |
| 3.9     | 0.2.1      |
| 4.0     | 0.3.0      |

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
*AttachmentsApi* | [**apiV2AttachmentsOccupiedFileStorageSizeGet**](docs/AttachmentsApi.md#apiV2AttachmentsOccupiedFileStorageSizeGet) | **GET** /api/v2/attachments/occupiedFileStorageSize |
*AttachmentsApi* | [**apiV2AttachmentsPost**](docs/AttachmentsApi.md#apiV2AttachmentsPost) | **POST** /api/v2/attachments | Upload new attachment file
*AutoTestsApi* | [**apiV2AutoTestsFlakyBulkPost**](docs/AutoTestsApi.md#apiV2AutoTestsFlakyBulkPost) | **POST** /api/v2/autoTests/flaky/bulk | Set \&quot;Flaky\&quot; status for multiple autotests
*AutoTestsApi* | [**apiV2AutoTestsIdTestResultsSearchPost**](docs/AutoTestsApi.md#apiV2AutoTestsIdTestResultsSearchPost) | **POST** /api/v2/autoTests/{id}/testResults/search | Get test results history for autotest
*AutoTestsApi* | [**apiV2AutoTestsIdWorkItemsChangedIdGet**](docs/AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedIdGet) | **GET** /api/v2/autoTests/{id}/workItems/changed/id | Get identifiers of changed linked work items
*AutoTestsApi* | [**apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**](docs/AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost) | **POST** /api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve | Approve changes to work items linked to autotest
*AutoTestsApi* | [**apiV2AutoTestsSearchPost**](docs/AutoTestsApi.md#apiV2AutoTestsSearchPost) | **POST** /api/v2/autoTests/search |
*AutoTestsApi* | [**createAutoTest**](docs/AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create autotest
*AutoTestsApi* | [**createMultiple**](docs/AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create multiple autotests
*AutoTestsApi* | [**deleteAutoTest**](docs/AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{id} | Delete autotest
*AutoTestsApi* | [**deleteAutoTestLinkFromWorkItem**](docs/AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{id}/workItems | Unlink autotest from work item
*AutoTestsApi* | [**getAllAutoTests**](docs/AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests | Get all autotests
*AutoTestsApi* | [**getAutoTestAverageDuration**](docs/AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{id}/averageDuration | Get average autotest duration
*AutoTestsApi* | [**getAutoTestById**](docs/AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{id} | Get autotest by internal or global ID
*AutoTestsApi* | [**getAutoTestChronology**](docs/AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{id}/chronology | Get autotest chronology
*AutoTestsApi* | [**getTestRuns**](docs/AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{id}/testRuns | Get completed tests runs for autotests
*AutoTestsApi* | [**getWorkItemResults**](docs/AutoTestsApi.md#getWorkItemResults) | **GET** /api/v2/autoTests/{id}/testResultHistory |
*AutoTestsApi* | [**getWorkItemsLinkedToAutoTest**](docs/AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{id}/workItems | Get work items linked to autotest
*AutoTestsApi* | [**linkAutoTestToWorkItem**](docs/AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{id}/workItems | Link autotest with work items
*AutoTestsApi* | [**updateAutoTest**](docs/AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update autotest
*AutoTestsApi* | [**updateMultiple**](docs/AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update multiple autotests
*ConfigurationsApi* | [**apiV2ConfigurationsCreateByParametersPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create Configurations by parameters
*ConfigurationsApi* | [**apiV2ConfigurationsSearchPost**](docs/ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations
*ConfigurationsApi* | [**createConfiguration**](docs/ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration
*ConfigurationsApi* | [**getConfigurationById**](docs/ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID
*ConfigurationsApi* | [**updateConfiguration**](docs/ConfigurationsApi.md#updateConfiguration) | **PUT** /api/v2/configurations | Update Configuration
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/exclude | Exclude CustomAttributes from CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/include | Include CustomAttributes to CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdDelete**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdDelete) | **DELETE** /api/v2/customAttributes/templates/{id} | Delete CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesIdGet**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdGet) | **GET** /api/v2/customAttributes/templates/{id} | Get CustomAttributeTemplate by ID
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesNameGet**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesNameGet) | **GET** /api/v2/customAttributes/templates/{name} | Get CustomAttributeTemplate by name
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesPost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPost) | **POST** /api/v2/customAttributes/templates | Create CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesPut**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPut) | **PUT** /api/v2/customAttributes/templates | Update CustomAttributeTemplate
*CustomAttributeTemplatesApi* | [**apiV2CustomAttributesTemplatesSearchPost**](docs/CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesSearchPost) | **POST** /api/v2/customAttributes/templates/search | Search CustomAttributeTemplates
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalIdDelete**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalIdDelete) | **DELETE** /api/v2/customAttributes/global/{id} | Delete global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalIdPut**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalIdPut) | **PUT** /api/v2/customAttributes/global/{id} | Edit global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesGlobalPost**](docs/CustomAttributesApi.md#apiV2CustomAttributesGlobalPost) | **POST** /api/v2/customAttributes/global | Create global attribute
*CustomAttributesApi* | [**apiV2CustomAttributesIdGet**](docs/CustomAttributesApi.md#apiV2CustomAttributesIdGet) | **GET** /api/v2/customAttributes/{id} | Get attribute
*CustomAttributesApi* | [**apiV2CustomAttributesSearchPost**](docs/CustomAttributesApi.md#apiV2CustomAttributesSearchPost) | **POST** /api/v2/customAttributes/search | Search for attributes
*NotificationsApi* | [**apiV2NotificationsCountGet**](docs/NotificationsApi.md#apiV2NotificationsCountGet) | **GET** /api/v2/notifications/count | Get unread Notifications total in last 7 days
*NotificationsApi* | [**apiV2NotificationsGet**](docs/NotificationsApi.md#apiV2NotificationsGet) | **GET** /api/v2/notifications | Get all Notifications for current User
*NotificationsApi* | [**apiV2NotificationsIdReadPost**](docs/NotificationsApi.md#apiV2NotificationsIdReadPost) | **POST** /api/v2/notifications/{id}/read | Set Notification as read
*NotificationsApi* | [**apiV2NotificationsReadPost**](docs/NotificationsApi.md#apiV2NotificationsReadPost) | **POST** /api/v2/notifications/read | Set all Notifications as read
*ParametersApi* | [**apiV2ParametersBulkPost**](docs/ParametersApi.md#apiV2ParametersBulkPost) | **POST** /api/v2/parameters/bulk | Create multiple parameters
*ParametersApi* | [**apiV2ParametersBulkPut**](docs/ParametersApi.md#apiV2ParametersBulkPut) | **PUT** /api/v2/parameters/bulk | Update multiple parameters
*ParametersApi* | [**apiV2ParametersGroupsGet**](docs/ParametersApi.md#apiV2ParametersGroupsGet) | **GET** /api/v2/parameters/groups | Get parameters as group
*ParametersApi* | [**apiV2ParametersKeyNameNameExistsGet**](docs/ParametersApi.md#apiV2ParametersKeyNameNameExistsGet) | **GET** /api/v2/parameters/key/name/{name}/exists | Check existence parameter key in system
*ParametersApi* | [**apiV2ParametersKeyValuesGet**](docs/ParametersApi.md#apiV2ParametersKeyValuesGet) | **GET** /api/v2/parameters/{key}/values | Get all parameter key values
*ParametersApi* | [**apiV2ParametersKeysGet**](docs/ParametersApi.md#apiV2ParametersKeysGet) | **GET** /api/v2/parameters/keys | Get all parameter keys
*ParametersApi* | [**createParameter**](docs/ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter
*ParametersApi* | [**deleteByName**](docs/ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name
*ParametersApi* | [**deleteByParameterKeyId**](docs/ParametersApi.md#deleteByParameterKeyId) | **DELETE** /api/v2/parameters/keyId/{keyId} | Delete parameters by parameter key identifier
*ParametersApi* | [**deleteParameter**](docs/ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{id} | Delete parameter
*ParametersApi* | [**getAllParameters**](docs/ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters
*ParametersApi* | [**getParameterById**](docs/ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{id} | Get parameter by ID
*ParametersApi* | [**obsoleteDeleteByName**](docs/ParametersApi.md#obsoleteDeleteByName) | **POST** /api/v2/parameters/deleteByName |
*ParametersApi* | [**updateParameter**](docs/ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter
*ProjectsApi* | [**addGlobaAttributesToProject**](docs/ProjectsApi.md#addGlobaAttributesToProject) | **POST** /api/v2/projects/{id}/globalAttributes | Add global attributes to project
*ProjectsApi* | [**apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete**](docs/ProjectsApi.md#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdDelete) | **DELETE** /api/v2/projects/{id}/customAttributeTemplates/{templateId} | Delete CustomAttributeTemplate from Project
*ProjectsApi* | [**apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost**](docs/ProjectsApi.md#apiV2ProjectsIdCustomAttributeTemplatesTemplateIdPost) | **POST** /api/v2/projects/{id}/customAttributeTemplates/{templateId} | Add CustomAttributeTemplate to Project
*ProjectsApi* | [**apiV2ProjectsIdFailureClassesGet**](docs/ProjectsApi.md#apiV2ProjectsIdFailureClassesGet) | **GET** /api/v2/projects/{id}/failureClasses | Get Project FailureClasses
*ProjectsApi* | [**apiV2ProjectsIdFavoritePut**](docs/ProjectsApi.md#apiV2ProjectsIdFavoritePut) | **PUT** /api/v2/projects/{id}/favorite | Mark Project as favorite
*ProjectsApi* | [**apiV2ProjectsIdFiltersGet**](docs/ProjectsApi.md#apiV2ProjectsIdFiltersGet) | **GET** /api/v2/projects/{id}/filters | Get Project filters
*ProjectsApi* | [**apiV2ProjectsIdTestPlansAnalyticsGet**](docs/ProjectsApi.md#apiV2ProjectsIdTestPlansAnalyticsGet) | **GET** /api/v2/projects/{id}/testPlans/analytics | Get TestPlans analytics
*ProjectsApi* | [**apiV2ProjectsIdTestPlansSearchPost**](docs/ProjectsApi.md#apiV2ProjectsIdTestPlansSearchPost) | **POST** /api/v2/projects/{id}/testPlans/search | Get Project TestPlans with analytics
*ProjectsApi* | [**apiV2ProjectsIdTestRunsActiveGet**](docs/ProjectsApi.md#apiV2ProjectsIdTestRunsActiveGet) | **GET** /api/v2/projects/{id}/testRuns/active | Get active Project TestRuns
*ProjectsApi* | [**apiV2ProjectsIdTestRunsFullGet**](docs/ProjectsApi.md#apiV2ProjectsIdTestRunsFullGet) | **GET** /api/v2/projects/{id}/testRuns/full | Get Project TestRuns full models
*ProjectsApi* | [**apiV2ProjectsIdWorkItemsTagsGet**](docs/ProjectsApi.md#apiV2ProjectsIdWorkItemsTagsGet) | **GET** /api/v2/projects/{id}/workItems/tags | Get WorkItems Tags
*ProjectsApi* | [**apiV2ProjectsSearchPost**](docs/ProjectsApi.md#apiV2ProjectsSearchPost) | **POST** /api/v2/projects/search |
*ProjectsApi* | [**callImport**](docs/ProjectsApi.md#callImport) | **POST** /api/v2/projects/import | Import project from JSON file
*ProjectsApi* | [**createCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{id}/testPlans/attributes | Add attributes to project&#39;s test plans
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create project
*ProjectsApi* | [**createProjectsAttribute**](docs/ProjectsApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{id}/attributes | Create project attribute
*ProjectsApi* | [**deleteCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{id}/testPlans/attribute/{attributeId} | Delete attribute from project&#39;s test plans
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /api/v2/projects/{id} | Delete project
*ProjectsApi* | [**deleteProjectAutoTests**](docs/ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{id}/autoTests | Delete project
*ProjectsApi* | [**deleteProjectsAttribute**](docs/ProjectsApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{id}/attributes/{attributeId} | Delete project attribute
*ProjectsApi* | [**export**](docs/ProjectsApi.md#export) | **POST** /api/v2/projects/{id}/export | Export project as JSON file
*ProjectsApi* | [**exportWithTestPlansAndConfigurations**](docs/ProjectsApi.md#exportWithTestPlansAndConfigurations) | **POST** /api/v2/projects/{id}/export-by-testPlans | Export project with test plans, test suites and test points as JSON file
*ProjectsApi* | [**getAllProjects**](docs/ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all projects
*ProjectsApi* | [**getAttributeByProjectId**](docs/ProjectsApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{id}/attributes/{attributeId} | Get project attribute
*ProjectsApi* | [**getAttributesByProjectId**](docs/ProjectsApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{id}/attributes | Get project attributes
*ProjectsApi* | [**getAutoTestsNamespaces**](docs/ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{id}/autoTestsNamespaces | Get namespaces of autotests in project
*ProjectsApi* | [**getConfigurationsByProjectId**](docs/ProjectsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{id}/configurations | Get project configurations
*ProjectsApi* | [**getCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{id}/testPlans/attributes | Get project&#39;s test plan attributes
*ProjectsApi* | [**getProjectById**](docs/ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{id} | Get project by ID
*ProjectsApi* | [**getSectionsByProjectId**](docs/ProjectsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{id}/sections | Get project sections
*ProjectsApi* | [**getTestPlansByProjectId**](docs/ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{id}/testPlans | Get project test plans
*ProjectsApi* | [**getTestRunsByProjectId**](docs/ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{id}/testRuns | Get project test runs
*ProjectsApi* | [**getWorkItemsByProjectId**](docs/ProjectsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{id}/workItems | Get project work items
*ProjectsApi* | [**importToExistingProject**](docs/ProjectsApi.md#importToExistingProject) | **POST** /api/v2/projects/{id}/import | Import project from JSON file into existing project
*ProjectsApi* | [**restoreProject**](docs/ProjectsApi.md#restoreProject) | **POST** /api/v2/projects/{id}/restore | Restore project
*ProjectsApi* | [**searchAttributesInProject**](docs/ProjectsApi.md#searchAttributesInProject) | **POST** /api/v2/projects/{id}/attributes/search |
*ProjectsApi* | [**searchTestPlanAttributesInProject**](docs/ProjectsApi.md#searchTestPlanAttributesInProject) | **POST** /api/v2/projects/{id}/testPlans/attributes/search |
*ProjectsApi* | [**updateCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{id}/testPlans/attribute | Update attribute of project&#39;s test plans
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update project
*ProjectsApi* | [**updateProjectsAttribute**](docs/ProjectsApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{id}/attributes | Update project attribute
*SectionsApi* | [**createSection**](docs/SectionsApi.md#createSection) | **POST** /api/v2/sections | Create section
*SectionsApi* | [**deleteSection**](docs/SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{id} | Delete section
*SectionsApi* | [**getSectionById**](docs/SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{id} | Get section
*SectionsApi* | [**getWorkItemsBySectionId**](docs/SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{id}/workItems | Get section work items
*SectionsApi* | [**move**](docs/SectionsApi.md#move) | **POST** /api/v2/sections/move | Move section
*SectionsApi* | [**rename**](docs/SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename section
*SectionsApi* | [**updateSection**](docs/SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update section
*TagsApi* | [**apiV2TagsGet**](docs/TagsApi.md#apiV2TagsGet) | **GET** /api/v2/tags | Get all Tags
*TagsApi* | [**apiV2TagsTestPlansTagsGet**](docs/TagsApi.md#apiV2TagsTestPlansTagsGet) | **GET** /api/v2/tags/testPlansTags | Get all Tags that are used in TestPlans
*TestPlansApi* | [**addTestPointsWithSections**](docs/TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{id}/test-points/withSections | Add test-points to TestPlan with sections
*TestPlansApi* | [**addWorkItemsWithSections**](docs/TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{id}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites
*TestPlansApi* | [**apiV2TestPlansIdAnalyticsGet**](docs/TestPlansApi.md#apiV2TestPlansIdAnalyticsGet) | **GET** /api/v2/testPlans/{id}/analytics | Get analytics by TestPlan
*TestPlansApi* | [**apiV2TestPlansIdAutobalancePost**](docs/TestPlansApi.md#apiV2TestPlansIdAutobalancePost) | **POST** /api/v2/testPlans/{id}/autobalance | Auto-balance for TestPlan with testers
*TestPlansApi* | [**apiV2TestPlansIdConfigurationsGet**](docs/TestPlansApi.md#apiV2TestPlansIdConfigurationsGet) | **GET** /api/v2/testPlans/{id}/configurations | Get TestPlan configurations
*TestPlansApi* | [**apiV2TestPlansIdExportTestPointsXlsxPost**](docs/TestPlansApi.md#apiV2TestPlansIdExportTestPointsXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testPoints/xlsx | Export TestPoints from TestPlan in xls format
*TestPlansApi* | [**apiV2TestPlansIdExportTestResultHistoryXlsxPost**](docs/TestPlansApi.md#apiV2TestPlansIdExportTestResultHistoryXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testResultHistory/xlsx | Export TestResults history from TestPlan in xls format
*TestPlansApi* | [**apiV2TestPlansIdHistoryGet**](docs/TestPlansApi.md#apiV2TestPlansIdHistoryGet) | **GET** /api/v2/testPlans/{id}/history | Get TestPlan history
*TestPlansApi* | [**apiV2TestPlansIdLinksGet**](docs/TestPlansApi.md#apiV2TestPlansIdLinksGet) | **GET** /api/v2/testPlans/{id}/links | Get Links of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestPointsLastResultsGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsLastResultsGet) | **GET** /api/v2/testPlans/{id}/testPoints/lastResults | Get TestPoints with last result from TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestPointsResetPost**](docs/TestPlansApi.md#apiV2TestPlansIdTestPointsResetPost) | **POST** /api/v2/testPlans/{id}/testPoints/reset | Reset TestPoints status of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestRunsGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsGet) | **GET** /api/v2/testPlans/{id}/testRuns | Get TestRuns of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestRunsSearchPost**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsSearchPost) | **POST** /api/v2/testPlans/{id}/testRuns/search | Search TestRuns of TestPlan
*TestPlansApi* | [**apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet**](docs/TestPlansApi.md#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet) | **GET** /api/v2/testPlans/{id}/testRuns/testResults/lastModified/modifiedDate | Get max modified date in TestRun for TestPlan
*TestPlansApi* | [**apiV2TestPlansIdUnlockRequestPost**](docs/TestPlansApi.md#apiV2TestPlansIdUnlockRequestPost) | **POST** /api/v2/testPlans/{id}/unlock/request | Send unlock TestPlan notification
*TestPlansApi* | [**apiV2TestPlansShortsPost**](docs/TestPlansApi.md#apiV2TestPlansShortsPost) | **POST** /api/v2/testPlans/shorts | Get TestPlans short models by Project identifiers
*TestPlansApi* | [**clone**](docs/TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{id}/clone | Clone TestPlan
*TestPlansApi* | [**complete**](docs/TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{id}/complete | Complete TestPlan
*TestPlansApi* | [**createTestPlan**](docs/TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan
*TestPlansApi* | [**deleteTestPlan**](docs/TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{id} | Delete TestPlan
*TestPlansApi* | [**getTestPlanById**](docs/TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{id} | Get TestPlan by Id
*TestPlansApi* | [**getTestSuitesById**](docs/TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{id}/testSuites | Get TestSuites Tree By Id
*TestPlansApi* | [**pause**](docs/TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{id}/pause | Pause TestPlan
*TestPlansApi* | [**restoreTestPlan**](docs/TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{id}/restore | Restore TestPlan
*TestPlansApi* | [**start**](docs/TestPlansApi.md#start) | **POST** /api/v2/testPlans/{id}/start | Start TestPlan
*TestPlansApi* | [**updateTestPlan**](docs/TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan
*TestPointsApi* | [**apiV2TestPointsIdTestRunsGet**](docs/TestPointsApi.md#apiV2TestPointsIdTestRunsGet) | **GET** /api/v2/testPoints/{id}/testRuns |
*TestPointsApi* | [**apiV2TestPointsIdWorkItemGet**](docs/TestPointsApi.md#apiV2TestPointsIdWorkItemGet) | **GET** /api/v2/testPoints/{id}/workItem |
*TestPointsApi* | [**apiV2TestPointsSearchIdPost**](docs/TestPointsApi.md#apiV2TestPointsSearchIdPost) | **POST** /api/v2/testPoints/search/id |
*TestPointsApi* | [**apiV2TestPointsSearchPost**](docs/TestPointsApi.md#apiV2TestPointsSearchPost) | **POST** /api/v2/testPoints/search |
*TestResultsApi* | [**apiV2TestResultsIdAggregatedGet**](docs/TestResultsApi.md#apiV2TestResultsIdAggregatedGet) | **GET** /api/v2/testResults/{id}/aggregated |
*TestResultsApi* | [**apiV2TestResultsIdAttachmentsAttachmentIdPut**](docs/TestResultsApi.md#apiV2TestResultsIdAttachmentsAttachmentIdPut) | **PUT** /api/v2/testResults/{id}/attachments/{attachmentId} |
*TestResultsApi* | [**apiV2TestResultsIdAttachmentsInfoGet**](docs/TestResultsApi.md#apiV2TestResultsIdAttachmentsInfoGet) | **GET** /api/v2/testResults/{id}/attachments/info |
*TestResultsApi* | [**apiV2TestResultsIdGet**](docs/TestResultsApi.md#apiV2TestResultsIdGet) | **GET** /api/v2/testResults/{id} |
*TestResultsApi* | [**apiV2TestResultsIdPut**](docs/TestResultsApi.md#apiV2TestResultsIdPut) | **PUT** /api/v2/testResults/{id} |
*TestResultsApi* | [**apiV2TestResultsSearchPost**](docs/TestResultsApi.md#apiV2TestResultsSearchPost) | **POST** /api/v2/testResults/search |
*TestResultsApi* | [**apiV2TestResultsStatisticsFilterPost**](docs/TestResultsApi.md#apiV2TestResultsStatisticsFilterPost) | **POST** /api/v2/testResults/statistics/filter |
*TestResultsApi* | [**createAttachment**](docs/TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{id}/attachments | Upload and link attachment to TestResult
*TestResultsApi* | [**deleteAttachment**](docs/TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{id}/attachments/{attachmentId} | Remove attachment and unlink from TestResult
*TestResultsApi* | [**downloadAttachment**](docs/TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId} | Get attachment of TestResult
*TestResultsApi* | [**getAttachment**](docs/TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId}/info | Get Metadata of TestResult&#39;s attachment
*TestResultsApi* | [**getAttachments**](docs/TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{id}/attachments | Get all attachments of TestResult
*TestRunsApi* | [**apiV2TestRunsIdStatisticsFilterPost**](docs/TestRunsApi.md#apiV2TestRunsIdStatisticsFilterPost) | **POST** /api/v2/testRuns/{id}/statistics/filter |
*TestRunsApi* | [**apiV2TestRunsIdTestPointsResultsGet**](docs/TestRunsApi.md#apiV2TestRunsIdTestPointsResultsGet) | **GET** /api/v2/testRuns/{id}/testPoints/results |
*TestRunsApi* | [**apiV2TestRunsIdTestResultsBulkPut**](docs/TestRunsApi.md#apiV2TestRunsIdTestResultsBulkPut) | **PUT** /api/v2/testRuns/{id}/testResults/bulk |
*TestRunsApi* | [**apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**](docs/TestRunsApi.md#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet) | **GET** /api/v2/testRuns/{id}/testResults/lastModified/modificationDate |
*TestRunsApi* | [**apiV2TestRunsSearchPost**](docs/TestRunsApi.md#apiV2TestRunsSearchPost) | **POST** /api/v2/testRuns/search |
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
*TestSuitesApi* | [**createTestSuite**](docs/TestSuitesApi.md#createTestSuite) | **POST** /api/v2/testSuites | Create TestSuite
*TestSuitesApi* | [**deleteTestSuite**](docs/TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{id} | Delete TestSuite
*TestSuitesApi* | [**getConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{id}/configurations | Get Configurations By Id
*TestSuitesApi* | [**getTestPointsById**](docs/TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{id}/testPoints | Get TestPoints By Id
*TestSuitesApi* | [**getTestResultsById**](docs/TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{id}/testResults | Get TestResults By Id
*TestSuitesApi* | [**getTestSuiteById**](docs/TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{id} | Get TestSuite by Id
*TestSuitesApi* | [**getWorkItemsById**](docs/TestSuitesApi.md#getWorkItemsById) | **GET** /api/v2/testSuites/{id}/workItems |
*TestSuitesApi* | [**searchWorkItems**](docs/TestSuitesApi.md#searchWorkItems) | **POST** /api/v2/testSuites/{id}/workItems/search | Search WorkItems
*TestSuitesApi* | [**setConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/configurations | Set Configurations By TestSuite Id
*TestSuitesApi* | [**setWorkItemsByTestSuiteId**](docs/TestSuitesApi.md#setWorkItemsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/workItems | Set WorkItems By TestSuite Id
*TestSuitesApi* | [**updateTestSuite**](docs/TestSuitesApi.md#updateTestSuite) | **PUT** /api/v2/testSuites | Update TestSuite
*WebhooksApi* | [**apiV2WebhooksGet**](docs/WebhooksApi.md#apiV2WebhooksGet) | **GET** /api/v2/webhooks |
*WebhooksApi* | [**apiV2WebhooksIdDelete**](docs/WebhooksApi.md#apiV2WebhooksIdDelete) | **DELETE** /api/v2/webhooks/{id} |
*WebhooksApi* | [**apiV2WebhooksIdGet**](docs/WebhooksApi.md#apiV2WebhooksIdGet) | **GET** /api/v2/webhooks/{id} |
*WebhooksApi* | [**apiV2WebhooksIdPut**](docs/WebhooksApi.md#apiV2WebhooksIdPut) | **PUT** /api/v2/webhooks/{id} |
*WebhooksApi* | [**apiV2WebhooksPost**](docs/WebhooksApi.md#apiV2WebhooksPost) | **POST** /api/v2/webhooks |
*WebhooksApi* | [**apiV2WebhooksSearchPost**](docs/WebhooksApi.md#apiV2WebhooksSearchPost) | **POST** /api/v2/webhooks/search |
*WebhooksApi* | [**apiV2WebhooksSpecialVariablesGet**](docs/WebhooksApi.md#apiV2WebhooksSpecialVariablesGet) | **GET** /api/v2/webhooks/specialVariables |
*WebhooksLogsApi* | [**apiV2WebhooksLogsGet**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsGet) | **GET** /api/v2/webhooks/logs |
*WebhooksLogsApi* | [**apiV2WebhooksLogsIdDelete**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsIdDelete) | **DELETE** /api/v2/webhooks/logs/{id} |
*WebhooksLogsApi* | [**apiV2WebhooksLogsIdGet**](docs/WebhooksLogsApi.md#apiV2WebhooksLogsIdGet) | **GET** /api/v2/webhooks/logs/{id} |
*WorkItemsApi* | [**apiV2WorkItemsIdCheckListTransformToTestCasePost**](docs/WorkItemsApi.md#apiV2WorkItemsIdCheckListTransformToTestCasePost) | **POST** /api/v2/workItems/{id}/checkList/transformTo/testCase | Transform CheckList to TestCase
*WorkItemsApi* | [**apiV2WorkItemsIdHistoryGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdHistoryGet) | **GET** /api/v2/workItems/{id}/history | Get change history of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikeDelete**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikeDelete) | **DELETE** /api/v2/workItems/{id}/like | Delete like from WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikePost**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikePost) | **POST** /api/v2/workItems/{id}/like | Set like to WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikesCountGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikesCountGet) | **GET** /api/v2/workItems/{id}/likes/count | Get likes count of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdLikesGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdLikesGet) | **GET** /api/v2/workItems/{id}/likes | Get likes of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdTestResultsHistoryGet**](docs/WorkItemsApi.md#apiV2WorkItemsIdTestResultsHistoryGet) | **GET** /api/v2/workItems/{id}/testResults/history | Get test results history of WorkItem
*WorkItemsApi* | [**apiV2WorkItemsIdVersionVersionIdActualPost**](docs/WorkItemsApi.md#apiV2WorkItemsIdVersionVersionIdActualPost) | **POST** /api/v2/workItems/{id}/version/{versionId}/actual | Set WorkItem as actual
*WorkItemsApi* | [**apiV2WorkItemsMovePost**](docs/WorkItemsApi.md#apiV2WorkItemsMovePost) | **POST** /api/v2/workItems/move | Move WorkItem to another section
*WorkItemsApi* | [**apiV2WorkItemsSharedStepIdReferencesSectionsPost**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesSectionsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/sections | Get SharedStep references in sections
*WorkItemsApi* | [**apiV2WorkItemsSharedStepIdReferencesWorkItemsPost**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/workItems | Get SharedStep references in workitems
*WorkItemsApi* | [**apiV2WorkItemsSharedStepsSharedStepIdReferencesGet**](docs/WorkItemsApi.md#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet) | **GET** /api/v2/workItems/sharedSteps/{sharedStepId}/references | Get SharedStep references
*WorkItemsApi* | [**createWorkItem**](docs/WorkItemsApi.md#createWorkItem) | **POST** /api/v2/workItems | Create Test Case, Checklist or Shared Step
*WorkItemsApi* | [**deleteAllWorkItemsFromAutoTest**](docs/WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{id}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId
*WorkItemsApi* | [**deleteWorkItem**](docs/WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{id} | Delete Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getAutoTestsForWorkItem**](docs/WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{id}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId
*WorkItemsApi* | [**getIterations**](docs/WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{id}/iterations | Get iterations by workitem Id or GlobalId
*WorkItemsApi* | [**getWorkItemById**](docs/WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{id} | Get Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getWorkItemChronology**](docs/WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{id}/chronology | Get WorkItem chronology by Id or GlobalId
*WorkItemsApi* | [**getWorkItemVersions**](docs/WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{id}/versions | Get WorkItem versions
*WorkItemsApi* | [**updateWorkItem**](docs/WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsCommentIdDelete**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsCommentIdDelete) | **DELETE** /api/v2/workItems/comments/{commentId} | Delete WorkItem comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsPost**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPost) | **POST** /api/v2/workItems/comments | Create WorkItem comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsCommentsPut**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPut) | **PUT** /api/v2/workItems/comments | Update WorkItem comment
*WorkItemsCommentsApi* | [**apiV2WorkItemsIdCommentsGet**](docs/WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsGet) | **GET** /api/v2/workItems/{id}/comments | Get WorkItem comments by Id or GlobalId

## Documentation for Models

You can see the documentation [here](https://github.com/testit-tms/api-client-java/blob/main/docs/Readme.md)

# Contributing

You can help to develop the project. Any contributions are **greatly appreciated**.

* If you have suggestions for adding or removing projects, feel free to [open an issue](https://github.com/testit-tms/api-client-java/issues/new) to discuss it, or directly create a pull request after you edit the *README.md* file with necessary changes.
* Please make sure you check your spelling and grammar.
* Create individual PR for each suggestion.
* Please also read through the [Code Of Conduct](https://github.com/testit-tms/api-client-java/blob/main/CODE_OF_CONDUCT.md) before posting your first idea as well.

# License

Distributed under the Apache-2.0 License. See [LICENSE](https://github.com/testit-tms/api-client-java/blob/main/LICENSE.md) for more information.


