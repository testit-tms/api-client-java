/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.model.ApiV2ProjectsRestoreBulkPostRequest;
import ru.testit.client.model.ApiV2ProjectsSearchPostRequest;
import ru.testit.client.model.AutoTestNamespaceModel;
import ru.testit.client.model.CreateProjectRequest;
import ru.testit.client.model.ExportProjectWithTestPlansJsonRequest;
import ru.testit.client.model.FailureClassModel;
import java.io.File;
import ru.testit.client.model.FilterModel;
import java.time.OffsetDateTime;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ProjectModel;
import ru.testit.client.model.PublicTestRunModel;
import java.util.Set;
import ru.testit.client.model.TestPlanModel;
import ru.testit.client.model.TestRunModel;
import ru.testit.client.model.TestRunV2GetModel;
import java.util.UUID;
import ru.testit.client.model.UpdateCustomAttributeTestPlanProjectRelationsRequest;
import ru.testit.client.model.UpdateProjectRequest;
import ru.testit.client.model.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Add global attributes to project
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attributes identifiers  &lt;br&gt;System search project  &lt;br&gt;System relates global attributes with project  &lt;br&gt;System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addGlobaAttributesToProjectTest() throws ApiException {
        String id = null;
        Set<UUID> UUID = null;
        api.addGlobaAttributesToProject(id, UUID);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsDemoPostTest() throws ApiException {
        CreateProjectRequest createProjectRequest = null;
        ProjectModel response = api.apiV2ProjectsDemoPost(createProjectRequest);
        // TODO: test validations
    }

    /**
     * Archive project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdDeleteTest() throws ApiException {
        String id = null;
        api.apiV2ProjectsIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get failure classes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdFailureClassesGetTest() throws ApiException {
        String id = null;
        Boolean isDeleted = null;
        List<FailureClassModel> response = api.apiV2ProjectsIdFailureClassesGet(id, isDeleted);
        // TODO: test validations
    }

    /**
     * Mark Project as favorite
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdFavoritePutTest() throws ApiException {
        String id = null;
        api.apiV2ProjectsIdFavoritePut(id);
        // TODO: test validations
    }

    /**
     * Get Project filters
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project filters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdFiltersGetTest() throws ApiException {
        String id = null;
        List<FilterModel> response = api.apiV2ProjectsIdFiltersGet(id);
        // TODO: test validations
    }

    /**
     * Patch project
     *
     * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdPatchTest() throws ApiException {
        UUID id = null;
        List<Operation> operation = null;
        api.apiV2ProjectsIdPatch(id, operation);
        // TODO: test validations
    }

    /**
     * Purge archived project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdPurgePostTest() throws ApiException {
        String id = null;
        api.apiV2ProjectsIdPurgePost(id);
        // TODO: test validations
    }

    /**
     * Restore archived project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdRestorePostTest() throws ApiException {
        String id = null;
        api.apiV2ProjectsIdRestorePost(id);
        // TODO: test validations
    }

    /**
     * Delete attribute from project&#39;s test plans
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and delete attribute from project for test plans  &lt;br&gt;System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdTestPlansAttributeAttributeIdDeleteTest() throws ApiException {
        String id = null;
        UUID attributeId = null;
        api.apiV2ProjectsIdTestPlansAttributeAttributeIdDelete(id, attributeId);
        // TODO: test validations
    }

    /**
     * Update attribute of project&#39;s test plans
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and attribute model  &lt;br&gt;User runs method execution  &lt;br&gt;System updates project and project attribute for test plan  &lt;br&gt;System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdTestPlansAttributePutTest() throws ApiException {
        String id = null;
        UpdateCustomAttributeTestPlanProjectRelationsRequest updateCustomAttributeTestPlanProjectRelationsRequest = null;
        api.apiV2ProjectsIdTestPlansAttributePut(id, updateCustomAttributeTestPlanProjectRelationsRequest);
        // TODO: test validations
    }

    /**
     * Get active Project TestRuns
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User runs method execution  &lt;br&gt;System returns active testruns
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdTestRunsActiveGetTest() throws ApiException {
        String id = null;
        List<PublicTestRunModel> response = api.apiV2ProjectsIdTestRunsActiveGet(id);
        // TODO: test validations
    }

    /**
     * Get Project TestRuns full models
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier   &lt;br&gt;User sets query params   &lt;br&gt;User runs method execution  &lt;br&gt;System returns project test runs full models
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsIdTestRunsFullGetTest() throws ApiException {
        String id = null;
        Boolean includeTestResults = null;
        Boolean mustAggregateTestResults = null;
        Boolean notStarted = null;
        Boolean inProgress = null;
        Boolean stopped = null;
        Boolean completed = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        UUID testPlanId = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<TestRunModel> response = api.apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsNameNameExistsGetTest() throws ApiException {
        String name = null;
        Boolean response = api.apiV2ProjectsNameNameExistsGet(name);
        // TODO: test validations
    }

    /**
     * Purge multiple projects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsPurgeBulkPostTest() throws ApiException {
        ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest = null;
        Long response = api.apiV2ProjectsPurgeBulkPost(apiV2ProjectsRestoreBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Restore multiple projects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsRestoreBulkPostTest() throws ApiException {
        ApiV2ProjectsRestoreBulkPostRequest apiV2ProjectsRestoreBulkPostRequest = null;
        Long response = api.apiV2ProjectsRestoreBulkPost(apiV2ProjectsRestoreBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Search for projects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsSearchPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2ProjectsSearchPostRequest apiV2ProjectsSearchPostRequest = null;
        List<ProjectModel> response = api.apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ProjectsSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Import project from JSON file in background job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backgroundImportProjectTest() throws ApiException {
        File _file = null;
        UUID response = api.backgroundImportProject(_file);
        // TODO: test validations
    }

    /**
     * Import project from Zip file in background job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backgroundImportZipProjectTest() throws ApiException {
        File _file = null;
        UUID response = api.backgroundImportZipProject(_file);
        // TODO: test validations
    }

    /**
     * Import project from JSON file
     *
     * &lt;br&gt;    &lt;b&gt;A project can only be exported to another TMS instance, different from the one it was imported from.&lt;/b&gt;    &lt;br&gt;This method imports a &#x60;.json&#x60; file with a project to the test management system.  &lt;br&gt;In the body of the request, send the &#x60;.json&#x60; file received by the &#x60;POST /api/v2/projects/export&#x60; method:  &lt;br&gt;    &#x60;&#x60;&#x60;              curl -X POST \&quot;http://{domain.com}/api/v2/projects/import\&quot; \\              -H \&quot;accept: /\&quot; -H \&quot;Authorization: PrivateToken {token}\&quot; -H \&quot;Content-Type: multipart/form-data\&quot; \\              -F \&quot;file&#x3D;@import.txt;type&#x3D;text/plain\&quot;              &#x60;&#x60;&#x60;    &lt;br&gt;              In the second instance, a project with the name of the imported one is created.              User attributes and the test library (along with content and structure) are imported.                &lt;br&gt;Test plan execution history from the first instance of TMS cannot be transferred.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void callImportTest() throws ApiException {
        Boolean includeAttachments = null;
        File _file = null;
        api.callImport(includeAttachments, _file);
        // TODO: test validations
    }

    /**
     * Create project
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System creates project  &lt;br&gt;System returns project model (example listed in response parameters)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        CreateProjectRequest createProjectRequest = null;
        ProjectModel response = api.createProject(createProjectRequest);
        // TODO: test validations
    }

    /**
     * Delete all autotests from project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectAutoTestsTest() throws ApiException {
        String id = null;
        api.deleteProjectAutoTests(id);
        // TODO: test validations
    }

    /**
     * Export project with test plans, test suites and test points as JSON file
     *
     * &lt;br&gt;    &lt;b&gt;You cannot export test cases execution history.&lt;/b&gt;    &lt;br&gt;This method exports the project with the test library and specified test plans to another TMS instance.  &lt;br&gt;              After sending a correct request, the project is exported to a &#x60;.json&#x60; file.              If you enable attachment export, the &#x60;.json&#x60; file and the attachments are placed in a &#x60;.zip&#x60; file.              You can import such a project by using the &#x60;POST /api/v2/projects/import&#x60; method.              
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exportWithTestPlansAndConfigurationsTest() throws ApiException {
        String id = null;
        Boolean includeAttachments = null;
        ExportProjectWithTestPlansJsonRequest exportProjectWithTestPlansJsonRequest = null;
        File response = api.exportWithTestPlansAndConfigurations(id, includeAttachments, exportProjectWithTestPlansJsonRequest);
        // TODO: test validations
    }

    /**
     * Get all projects
     *
     * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted projects  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all projects  &lt;br&gt;System returns array of all found projects(listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectsTest() throws ApiException {
        Boolean isDeleted = null;
        String projectName = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<ProjectModel> response = api.getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Get namespaces of autotests in project
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all autotest related to the project  &lt;br&gt;System returns array of autotest with namespaces and classnames (listed in response)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoTestsNamespacesTest() throws ApiException {
        String id = null;
        List<AutoTestNamespaceModel> response = api.getAutoTestsNamespaces(id);
        // TODO: test validations
    }

    /**
     * Get project by ID
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier and runs method execution  &lt;br&gt;System search project  &lt;br&gt;System returns project (example listed in response parameters)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectByIdTest() throws ApiException {
        String id = null;
        ProjectModel response = api.getProjectById(id);
        // TODO: test validations
    }

    /**
     * Get project test plans
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted  &lt;br&gt;[Optional] If User did not set isDeleted field value, System search all v related to project  &lt;br&gt;System returns array of found test plans (listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestPlansByProjectIdTest() throws ApiException {
        String id = null;
        Boolean isDeleted = null;
        List<TestPlanModel> response = api.getTestPlansByProjectId(id, isDeleted);
        // TODO: test validations
    }

    /**
     * Get project test runs
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all test runs related to project  &lt;br&gt;System returns array of found test runs (listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestRunsByProjectIdTest() throws ApiException {
        String id = null;
        Boolean notStarted = null;
        Boolean inProgress = null;
        Boolean stopped = null;
        Boolean completed = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        UUID testPlanId = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<TestRunV2GetModel> response = api.getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Update project
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project parameters (listed in request example) and runs method execution  &lt;br&gt;System updates project  &lt;br&gt;System returns updated project model (example listed in response parameters)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        UpdateProjectRequest updateProjectRequest = null;
        api.updateProject(updateProjectRequest);
        // TODO: test validations
    }

}
