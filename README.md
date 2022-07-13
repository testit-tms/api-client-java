# Api client for Test IT TMS

## Getting Started

### Compatibility

| Test IT | API Client |
|---------|------------|
| 3.5     | 0.1        |

### Installation

#### Maven users

Add this dependency to your project's POM:

```xml

<dependency>
    <groupId>ru.testit</groupId>
    <artifactId>testit-api-client</artifactId>
    <version>0.1</version>
    <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
implementation "ru.testit:testit-api-client:0.1"
```

## Examples

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import ru.testit.invoker.*;
import ru.testit.invoker.auth.*;
import ru.testit.model.*;
import ru.testit.client.AttachmentsApi;

import java.io.File;
import java.util.*;

public class AttachmentsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("Your TMS address");
        defaultClient.setApiKeyPrefix("PrivateToken");
        defaultClient.setApiKey("Your private token");

        AttachmentsApi apiInstance = new AttachmentsApi();
        File file = new File("file_example"); // File | 
        String apiVersion = "apiVersion_example"; // String | 
        try {
            String result = apiInstance.addAttachment(file, apiVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#addAttachment");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**addAttachment**](docs/AttachmentsApi.md#addAttachment) | **POST** /api/v2/attachments | Create attachment
*AutoTestsApi* | [**createAutoTest**](docs/AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create AutoTest
*AutoTestsApi* | [**createMultiple**](docs/AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create AutoTests multiple
*AutoTestsApi* | [**deleteAutoTest**](docs/AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{autoTestId} | Delete AutoTest by Id or GlobalId
*AutoTestsApi* | [**deleteAutoTestLinkFromWorkItem**](docs/AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{autoTestId}/workItems | Delete AutoTest link from WorkItem by Id or GlobalId  (if workItemId is not specified, then remove all links WorkItems to AutoTest)
*AutoTestsApi* | [**getAllAutoTests**](docs/AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests | Get all AutoTests (if parameters are specified, then it&#x27;s filtered by them.)
*AutoTestsApi* | [**getAutoTestAverageDuration**](docs/AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{autoTestId}/averageDuration | Get AutoTest average duration by Id or GlobalId
*AutoTestsApi* | [**getAutoTestById**](docs/AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{autoTestId} | Get AutoTest by Id or GlobalId
*AutoTestsApi* | [**getAutoTestChronology**](docs/AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{autoTestId}/chronology | Get AutoTest chronology by Id or GlobalId
*AutoTestsApi* | [**getTestRuns**](docs/AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{autoTestId}/testRuns | Stopped and completed TestRuns which contain AutoTest by Id or GlobalId
*AutoTestsApi* | [**getWorkItemResults**](docs/AutoTestsApi.md#getWorkItemResults) | **GET** /api/v2/autoTests/{autoTestId}/testResultHistory | History of TestResults for AutoTest by Id or GlobalId
*AutoTestsApi* | [**getWorkItemsLinkedToAutoTest**](docs/AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{autoTestId}/workItems | Get all WorkItems Ids linked to AutoTest by Id or GlobalId
*AutoTestsApi* | [**linkAutoTestToWorkItem**](docs/AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{autoTestId}/workItems | Link AutoTest to WorkItem by Id or GlobalId
*AutoTestsApi* | [**updateAutoTest**](docs/AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update AutoTest
*AutoTestsApi* | [**updateMultiple**](docs/AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update AutoTests multiple
*ConfigurationsApi* | [**createConfiguration**](docs/ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration
*ConfigurationsApi* | [**getConfigurationById**](docs/ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{configurationId} | Get Configuration by Id or GlobalId
*ConfigurationsApi* | [**updateConfiguration**](docs/ConfigurationsApi.md#updateConfiguration) | **PUT** /api/v2/configurations | Update Configuration
*ParametersApi* | [**createParameter**](docs/ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter
*ParametersApi* | [**deleteByName**](docs/ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name
*ParametersApi* | [**deleteParameter**](docs/ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{parameterId} | Delete parameter by id
*ParametersApi* | [**getAllParameters**](docs/ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters (if isDeleted is true, return deleted parameters)
*ParametersApi* | [**getParameterById**](docs/ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{parameterId} | Get parameter by id
*ParametersApi* | [**obsoleteDeleteByName**](docs/ParametersApi.md#obsoleteDeleteByName) | **POST** /api/v2/parameters/deleteByName | Delete parameters by name
*ParametersApi* | [**updateParameter**](docs/ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter
*ProjectsApi* | [**callImport**](docs/ProjectsApi.md#callImport) | **POST** /api/v2/projects/import | Import Project from json file  Project can be imported only once (this method or ImportToExistingProject)  Next import will sync content in previously imported project.
*ProjectsApi* | [**createCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{projectId}/testPlans/attributes | Add attributes to project for test plans
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create Project
*ProjectsApi* | [**createProjectsAttribute**](docs/ProjectsApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{projectId}/attributes | Create Projects Attribute
*ProjectsApi* | [**deleteCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{projectId}/testPlans/attribute/{attributeId} | Delete attribute from project for test plans
*ProjectsApi* | [**deleteProject**](docs/ProjectsApi.md#deleteProject) | **DELETE** /api/v2/projects/{projectId} | Delete Project by Id or GlobalId
*ProjectsApi* | [**deleteProjectAutoTests**](docs/ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{projectId}/autoTests | Delete all AutoTests from Project
*ProjectsApi* | [**deleteProjectsAttribute**](docs/ProjectsApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{projectId}/attributes/{attributeId} | Delete Projects Attribute by Id
*ProjectsApi* | [**export**](docs/ProjectsApi.md#export) | **POST** /api/v2/projects/{projectId}/export | Export Project with tests, sections and configurations in json file
*ProjectsApi* | [**exportWithTestPlansAndConfigurations**](docs/ProjectsApi.md#exportWithTestPlansAndConfigurations) | **POST** /api/v2/projects/{projectId}/export-by-testPlans | Export Project with tests, sections, configurations, testPlans, testSuites and testPoints as json file
*ProjectsApi* | [**getAllProjects**](docs/ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all Projects (if isDeleted is true, return deleted Projects)
*ProjectsApi* | [**getAttributeByProjectId**](docs/ProjectsApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{projectId}/attributes/{attributeId} | Get Projects Attribute by Id
*ProjectsApi* | [**getAttributesByProjectId**](docs/ProjectsApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{projectId}/attributes | Get Projects Attributes by Id or GlobalId
*ProjectsApi* | [**getAutoTestsNamespaces**](docs/ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{projectId}/autoTestsNamespaces | Get AutoTests Namespaces for Project by Id or GlobalId
*ProjectsApi* | [**getConfigurationsByProjectId**](docs/ProjectsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{projectId}/configurations | Get Configurations for Project by Id or GlobalId
*ProjectsApi* | [**getCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{projectId}/testPlans/attributes | Get project for test plans attributes
*ProjectsApi* | [**getProjectById**](docs/ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{projectId} | Get Project by Id or GlobalId
*ProjectsApi* | [**getSectionsByProjectId**](docs/ProjectsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{projectId}/sections | Get Sections for Project by Id or GlobalId
*ProjectsApi* | [**getTestPlansByProjectId**](docs/ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{projectId}/testPlans | Get TestPlans for Project by Id or GlobalId (if isDeleted is true, return deleted TestPlans)
*ProjectsApi* | [**getTestRunsByProjectId**](docs/ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{projectId}/testRuns | Get TestRuns for Project by Id or GlobalId
*ProjectsApi* | [**getWorkItemsByProjectId**](docs/ProjectsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{projectId}/workItems | Get WorkItems for Project by Id or GlobalId (if isDeleted is true, return deleted WorkItems)
*ProjectsApi* | [**importToExistingProject**](docs/ProjectsApi.md#importToExistingProject) | **POST** /api/v2/projects/{projectId}/import | Import to existing Project from json file.  Sections can be imported in only one target project!
*ProjectsApi* | [**restoreProject**](docs/ProjectsApi.md#restoreProject) | **POST** /api/v2/projects/{projectId}/restore | Restore Project by Id or GlobalId
*ProjectsApi* | [**updateCustomAttributeTestPlanProjectRelations**](docs/ProjectsApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{projectId}/testPlans/attribute | Update project attribute for test plan
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update Project
*ProjectsApi* | [**updateProjectsAttribute**](docs/ProjectsApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{projectId}/attributes | Update Projects Attribute
*SectionsApi* | [**createSection**](docs/SectionsApi.md#createSection) | **POST** /api/v2/sections | Create Section
*SectionsApi* | [**deleteSection**](docs/SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{sectionId} | Delete Section by id
*SectionsApi* | [**getSectionById**](docs/SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{sectionId} | Get Section by id
*SectionsApi* | [**getWorkItemsBySectionId**](docs/SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{sectionId}/workItems | Get WorkItems for Section (if isDeleted is true, return deleted WorkItems)
*SectionsApi* | [**move**](docs/SectionsApi.md#move) | **POST** /api/v2/sections/move | Move Section. Can be moved inside another section. It is possible to indicate a project
*SectionsApi* | [**rename**](docs/SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename Section
*SectionsApi* | [**updateSection**](docs/SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update Section
*TestPlansApi* | [**addTestPointsWithSections**](docs/TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{testPlanId}/test-points/withSections | Add test-points to test suite with sections
*TestPlansApi* | [**addWorkItemsWithSections**](docs/TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{testPlanId}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites
*TestPlansApi* | [**clone**](docs/TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{testPlanId}/clone | Clone TestPlan
*TestPlansApi* | [**complete**](docs/TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{testPlanId}/complete | Complete TestPlan
*TestPlansApi* | [**createTestPlan**](docs/TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan
*TestPlansApi* | [**deleteTestPlan**](docs/TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{testPlanId} | Delete TestPlan
*TestPlansApi* | [**getTestPlanById**](docs/TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{testPlanId} | Get TestPlan by Id
*TestPlansApi* | [**getTestSuitesById**](docs/TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{testPlanId}/testSuites | Get TestSuites Tree By Id
*TestPlansApi* | [**pause**](docs/TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{testPlanId}/pause | Pause TestPlan
*TestPlansApi* | [**restoreTestPlan**](docs/TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{testPlanId}/restore | Restore TestPlan
*TestPlansApi* | [**start**](docs/TestPlansApi.md#start) | **POST** /api/v2/testPlans/{testPlanId}/start | Start TestPlan
*TestPlansApi* | [**updateTestPlan**](docs/TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan
*TestResultsApi* | [**createAttachment**](docs/TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{testResultId}/attachments | Upload and link attachment to TestResult
*TestResultsApi* | [**deleteAttachment**](docs/TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{testResultId}/attachments/{attachmentId} | Remove attachment and unlink from TestResult
*TestResultsApi* | [**downloadAttachment**](docs/TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{testResultId}/attachments/{attachmentId} | Get attachment of TestResult
*TestResultsApi* | [**getAttachment**](docs/TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{testResultId}/attachments/{attachmentId}/info | Get Metadata of TestResult&#x27;s attachment
*TestResultsApi* | [**getAttachments**](docs/TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{testResultId}/attachments | Get all attachments of TestResult
*TestResultsApi* | [**setAutoTestResults**](docs/TestResultsApi.md#setAutoTestResults) | **POST** /api/v2/testResults | Set result for AutoTest (Obsolete).  The new endpoint is [POST]/api/v2/testRuns/{testRunId}/testResults
*TestRunsApi* | [**completeTestRun**](docs/TestRunsApi.md#completeTestRun) | **POST** /api/v2/testRuns/{testRunId}/complete | Complete TestRun
*TestRunsApi* | [**createAndFillByAutoTests**](docs/TestRunsApi.md#createAndFillByAutoTests) | **POST** /api/v2/testRuns/byAutoTests | Create TestRun without TestPoints using ConfigurationIds and AutoTestIds
*TestRunsApi* | [**createAndFillByConfigurations**](docs/TestRunsApi.md#createAndFillByConfigurations) | **POST** /api/v2/testRuns/byConfigurations | Create TestRun with TestPointSelectors based on ConfigurationId and WorkItem Ids
*TestRunsApi* | [**createAndFillByWorkItems**](docs/TestRunsApi.md#createAndFillByWorkItems) | **POST** /api/v2/testRuns/byWorkItems | Create TestRun with TestPoints selected using ConfigurationIds and WorkItem Ids
*TestRunsApi* | [**createEmpty**](docs/TestRunsApi.md#createEmpty) | **POST** /api/v2/testRuns | Create empty TestRun
*TestRunsApi* | [**getTestRunById**](docs/TestRunsApi.md#getTestRunById) | **GET** /api/v2/testRuns/{testRunId} | Get TestRun by Id
*TestRunsApi* | [**setAutoTestResultsForTestRun**](docs/TestRunsApi.md#setAutoTestResultsForTestRun) | **POST** /api/v2/testRuns/{testRunId}/testResults | Set AutoTest Results For TestRun
*TestRunsApi* | [**startTestRun**](docs/TestRunsApi.md#startTestRun) | **POST** /api/v2/testRuns/{testRunId}/start | Start TestRun
*TestRunsApi* | [**stopTestRun**](docs/TestRunsApi.md#stopTestRun) | **POST** /api/v2/testRuns/{testRunId}/stop | Stop TestRun
*TestRunsApi* | [**updateEmpty**](docs/TestRunsApi.md#updateEmpty) | **PUT** /api/v2/testRuns | Update empty TestRun
*TestSuitesApi* | [**addTestPointsToTestSuite**](docs/TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{testSuiteId}/test-points | Add test-points to test suite
*TestSuitesApi* | [**createTestSuite**](docs/TestSuitesApi.md#createTestSuite) | **POST** /api/v2/testSuites | Create TestSuite
*TestSuitesApi* | [**deleteTestSuite**](docs/TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{testSuiteId} | Delete TestSuite
*TestSuitesApi* | [**getConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{testSuiteId}/configurations | Get Configurations By Id
*TestSuitesApi* | [**getTestPointsById**](docs/TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{testSuiteId}/testPoints | Get TestPoints By Id
*TestSuitesApi* | [**getTestResultsById**](docs/TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{testSuiteId}/testResults | Get TestResults By Id
*TestSuitesApi* | [**getTestSuiteById**](docs/TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{testSuiteId} | Get TestSuite by Id
*TestSuitesApi* | [**getWorkItemsById**](docs/TestSuitesApi.md#getWorkItemsById) | **GET** /api/v2/testSuites/{testSuiteId}/workItems | Get WorkItems By Id
*TestSuitesApi* | [**setConfigurationsByTestSuiteId**](docs/TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{testSuiteId}/configurations | Set Configurations By TestSuite Id
*TestSuitesApi* | [**setWorkItemsByTestSuiteId**](docs/TestSuitesApi.md#setWorkItemsByTestSuiteId) | **POST** /api/v2/testSuites/{testSuiteId}/workItems | Set WorkItems By TestSuite Id
*TestSuitesApi* | [**updateTestSuite**](docs/TestSuitesApi.md#updateTestSuite) | **PUT** /api/v2/testSuites | Update TestSuite
*WorkItemsApi* | [**createWorkItem**](docs/WorkItemsApi.md#createWorkItem) | **POST** /api/v2/workItems | Create Test Case, Checklist or Shared Step
*WorkItemsApi* | [**deleteAllWorkItemsFromAutoTest**](docs/WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{workItemId}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId
*WorkItemsApi* | [**deleteWorkItem**](docs/WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{workItemId} | Delete Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getAutoTestsForWorkItem**](docs/WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{workItemId}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId
*WorkItemsApi* | [**getIterations**](docs/WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{workItemId}/iterations | Get iterations by workitem Id or GlobalId
*WorkItemsApi* | [**getWorkItemById**](docs/WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{workItemId} | Get Test Case, Checklist or Shared Step by Id or GlobalId
*WorkItemsApi* | [**getWorkItemChronology**](docs/WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{workItemId}/chronology | Get WorkItem chronology by Id or GlobalId
*WorkItemsApi* | [**getWorkItemVersions**](docs/WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{workItemId}/versions | Get WorkItem versions
*WorkItemsApi* | [**updateWorkItem**](docs/WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step

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


