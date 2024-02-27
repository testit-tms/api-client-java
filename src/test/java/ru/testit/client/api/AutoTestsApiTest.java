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
import ru.testit.client.model.ApiV2AutoTestsFlakyBulkPostRequest;
import ru.testit.client.model.ApiV2AutoTestsIdTestResultsSearchPostRequest;
import ru.testit.client.model.ApiV2AutoTestsSearchPostRequest;
import ru.testit.client.model.AutoTestAverageDurationModel;
import ru.testit.client.model.AutoTestModel;
import ru.testit.client.model.AutoTestPostModel;
import ru.testit.client.model.AutoTestPutModel;
import ru.testit.client.model.AutotestResultHistoricalGetModel;
import ru.testit.client.model.CreateAutoTestRequest;
import ru.testit.client.model.LinkAutoTestToWorkItemRequest;
import java.time.OffsetDateTime;
import ru.testit.client.model.Operation;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestResultChronologyModel;
import ru.testit.client.model.TestResultHistoryReportModel;
import ru.testit.client.model.TestRunShortModel;
import java.util.UUID;
import ru.testit.client.model.UpdateAutoTestRequest;
import ru.testit.client.model.ValidationProblemDetails;
import ru.testit.client.model.WorkItemIdentifierModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoTestsApi
 */
@Disabled
public class AutoTestsApiTest {

    private final AutoTestsApi api = new AutoTestsApi();

    /**
     * Set \&quot;Flaky\&quot; status for multiple autotests
     *
     * User permissions for project:  - Read only  - Execute  - Write  - Full control
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsFlakyBulkPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2AutoTestsFlakyBulkPostRequest apiV2AutoTestsFlakyBulkPostRequest = null;
        api.apiV2AutoTestsFlakyBulkPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsFlakyBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Patch auto test
     *
     * See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsIdPatchTest() throws ApiException {
        UUID id = null;
        List<Operation> operation = null;
        api.apiV2AutoTestsIdPatch(id, operation);
        // TODO: test validations
    }

    /**
     * Get test results history for autotest
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets getTestResultHistoryReportQuery (listed in the example)  &lt;br&gt;User runs method execution  &lt;br&gt;System search for test results using filters set by user in getTestResultHistoryReportQuery and id  &lt;br&gt;System returns the enumeration of test results
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsIdTestResultsSearchPostTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2AutoTestsIdTestResultsSearchPostRequest apiV2AutoTestsIdTestResultsSearchPostRequest = null;
        List<AutotestResultHistoricalGetModel> response = api.apiV2AutoTestsIdTestResultsSearchPost(id, skip, take, orderBy, searchField, searchValue, apiV2AutoTestsIdTestResultsSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Get identifiers of changed linked work items
     *
     * User permissions for project:  - Read only  - Execute  - Write  - Full control
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsIdWorkItemsChangedIdGetTest() throws ApiException {
        UUID id = null;
        List<UUID> response = api.apiV2AutoTestsIdWorkItemsChangedIdGet(id);
        // TODO: test validations
    }

    /**
     * Approve changes to work items linked to autotest
     *
     * User permissions for project:  - Read only  - Execute  - Write  - Full control
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePostTest() throws ApiException {
        UUID id = null;
        UUID workItemId = null;
        api.apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(id, workItemId);
        // TODO: test validations
    }

    /**
     * Search for autotests
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AutoTestsSearchPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2AutoTestsSearchPostRequest apiV2AutoTestsSearchPostRequest = null;
        List<AutoTestModel> response = api.apiV2AutoTestsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2AutoTestsSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Create autotest
     *
     * &lt;br&gt;This method creates a new autotest.  &lt;br&gt;To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.  &lt;br&gt;Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAutoTestTest() throws ApiException {
        CreateAutoTestRequest createAutoTestRequest = null;
        AutoTestModel response = api.createAutoTest(createAutoTestRequest);
        // TODO: test validations
    }

    /**
     * Create multiple autotests
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest parameters (listed in the example) and runs method execution  &lt;br&gt;System creates autotest  &lt;br&gt;[Optional] If steps enumeration is set, system creates step items and relates them to autotest  &lt;br&gt;[Optional] If setup enumeration is set, system creates setup items and relates them to autotest  &lt;br&gt;[Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  &lt;br&gt;[Optional] If label enumeration is set, system creates labels and relates them to autotest  &lt;br&gt;[Optional] If link enumeration is set, system creates links and relates them to autotest  &lt;br&gt;System returns autotest model (example listed in response parameters)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMultipleTest() throws ApiException {
        List<AutoTestPostModel> autoTestPostModel = null;
        List<AutoTestModel> response = api.createMultiple(autoTestPostModel);
        // TODO: test validations
    }

    /**
     * Delete autotest
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System deletes autotest and returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAutoTestTest() throws ApiException {
        String id = null;
        api.deleteAutoTest(id);
        // TODO: test validations
    }

    /**
     * Unlink autotest from work item
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;[Optional] User sets workitem internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;              [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it              from autotest.                &lt;br&gt;[Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  &lt;br&gt;System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAutoTestLinkFromWorkItemTest() throws ApiException {
        String id = null;
        String workItemId = null;
        api.deleteAutoTestLinkFromWorkItem(id, workItemId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAutoTestsTest() throws ApiException {
        UUID projectId = null;
        String externalId = null;
        Long globalId = null;
        String namespace = null;
        Boolean isNamespaceNull = null;
        Boolean includeEmptyNamespaces = null;
        String className = null;
        Boolean isClassnameNull = null;
        Boolean includeEmptyClassNames = null;
        Boolean isDeleted = null;
        Boolean deleted = null;
        List<String> labels = null;
        Integer stabilityMinimal = null;
        Integer minStability = null;
        Integer stabilityMaximal = null;
        Integer maxStability = null;
        Boolean isFlaky = null;
        Boolean flaky = null;
        Boolean includeSteps = null;
        Boolean includeLabels = null;
        String externalKey = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<AutoTestModel> response = api.getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, externalKey, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Get average autotest duration
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System calculates pass average duration and fail average duration of autotest from all related test results  &lt;br&gt;System returns pass average duration and fail average duration for autotest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoTestAverageDurationTest() throws ApiException {
        String id = null;
        AutoTestAverageDurationModel response = api.getAutoTestAverageDuration(id);
        // TODO: test validations
    }

    /**
     * Get autotest by internal or global ID
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal or global identifier and runs method execution  &lt;br&gt;System returns autotest, which internal or global identifier equals the identifier value set in the previous action
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoTestByIdTest() throws ApiException {
        String id = null;
        AutoTestModel response = api.getAutoTestById(id);
        // TODO: test validations
    }

    /**
     * Get autotest chronology
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search all test results related to autotest (with default limit equal 100)  &lt;br&gt;System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending  &lt;br&gt;System returns test result chronology for autotest
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAutoTestChronologyTest() throws ApiException {
        String id = null;
        List<TestResultChronologyModel> response = api.getAutoTestChronology(id);
        // TODO: test validations
    }

    /**
     * Get completed tests runs for autotests
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search for all test runs related to the autotest  &lt;br&gt;System returns the enumeration of test runs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestRunsTest() throws ApiException {
        String id = null;
        List<TestRunShortModel> response = api.getTestRuns(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkItemResultsTest() throws ApiException {
        String id = null;
        OffsetDateTime from = null;
        OffsetDateTime to = null;
        List<UUID> configurationIds = null;
        List<UUID> testPlanIds = null;
        List<UUID> userIds = null;
        List<String> outcomes = null;
        Boolean isAutomated = null;
        Boolean automated = null;
        List<UUID> testRunIds = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<TestResultHistoryReportModel> response = api.getWorkItemResults(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Get work items linked to autotest
     *
     * &lt;br&gt;              This method links an autotest to a test case or a checklist.              A manual test case with a linked automated work item is marked in the test management system as an autotest.              You can run it from graphical user interface (GUI). To do that:                &lt;br&gt;              1. Open the project in GUI.&lt;br /&gt;              2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.&lt;br /&gt;              3. Select the autotest(s) you want to run using checkboxes.&lt;br /&gt;              4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.              
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWorkItemsLinkedToAutoTestTest() throws ApiException {
        String id = null;
        Boolean isDeleted = null;
        Boolean isWorkItemDeleted = null;
        List<WorkItemIdentifierModel> response = api.getWorkItemsLinkedToAutoTest(id, isDeleted, isWorkItemDeleted);
        // TODO: test validations
    }

    /**
     * Link autotest with work items
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest internal (guid format) or global (integer format) identifier  &lt;br&gt;User sets work item internal (guid format) or global (integer format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System finds the autotest by the autotest identifier  &lt;br&gt;System finds the work item by the work item identifier  &lt;br&gt;System relates the work item with the autotest and returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkAutoTestToWorkItemTest() throws ApiException {
        String id = null;
        LinkAutoTestToWorkItemRequest linkAutoTestToWorkItemRequest = null;
        api.linkAutoTestToWorkItem(id, linkAutoTestToWorkItemRequest);
        // TODO: test validations
    }

    /**
     * Update autotest
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAutoTestTest() throws ApiException {
        UpdateAutoTestRequest updateAutoTestRequest = null;
        api.updateAutoTest(updateAutoTestRequest);
        // TODO: test validations
    }

    /**
     * Update multiple autotests
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets autotest updated parameters values (listed in the example) and runs method execution  &lt;br&gt;System finds the autotest by the identifier  &lt;br&gt;System updates autotest parameters   &lt;br&gt;              [Optional] If steps enumeration is set, system creates step items, relates them to autotest              and deletes relations with current steps( if exist)                &lt;br&gt;              [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest              and deletes relations with current Setup items (if exist)                &lt;br&gt;              [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest              and deletes relations with current teardown items (if exist)                &lt;br&gt;              [Optional] If label enumeration is set, system creates labels and relates them to autotest              and deletes relations with current Labels (if exist)                &lt;br&gt;              [Optional] If link enumeration is set, system creates links and relates them to autotest              and deletes relations with current Links (if exist)                &lt;br&gt;System updates autotest and returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMultipleTest() throws ApiException {
        List<AutoTestPutModel> autoTestPutModel = null;
        api.updateMultiple(autoTestPutModel);
        // TODO: test validations
    }

}
