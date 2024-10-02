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
import ru.testit.client.model.ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest;
import ru.testit.client.model.ApiV2ProjectsProjectIdTestPlansSearchPostRequest;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.TestPlanWithAnalyticModel;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectTestPlansApi
 */
@Disabled
public class ProjectTestPlansApiTest {

    private final ProjectTestPlansApi api = new ProjectTestPlansApi();

    /**
     * Get TestPlans analytics
     *
     *  Use case   User sets project internal identifier   User sets query params   User runs method execution   System return analytics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansAnalyticsGetTest() throws ApiException {
        UUID projectId = null;
        Boolean isDeleted = null;
        Boolean mustUpdateCache = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<TestPlanWithAnalyticModel> response = api.apiV2ProjectsProjectIdTestPlansAnalyticsGet(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Delete multiple test plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansDeleteBulkPostTest() throws ApiException {
        String projectId = null;
        ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = null;
        List<UUID> response = api.apiV2ProjectsProjectIdTestPlansDeleteBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Checks if TestPlan exists with the specified name exists for the project
     *
     *  Use case   User sets project internal or global identifier    User runs method execution   System purge delete project workitems
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansNameExistsGetTest() throws ApiException {
        UUID projectId = null;
        String name = null;
        Boolean response = api.apiV2ProjectsProjectIdTestPlansNameExistsGet(projectId, name);
        // TODO: test validations
    }

    /**
     * Permanently delete multiple archived test plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansPurgeBulkPostTest() throws ApiException {
        String projectId = null;
        ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = null;
        api.apiV2ProjectsProjectIdTestPlansPurgeBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Restore multiple test plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansRestoreBulkPostTest() throws ApiException {
        String projectId = null;
        ApiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest = null;
        List<UUID> response = api.apiV2ProjectsProjectIdTestPlansRestoreBulkPost(projectId, apiV2ProjectsProjectIdTestPlansDeleteBulkPostRequest);
        // TODO: test validations
    }

    /**
     * Get Project TestPlans with analytics
     *
     *  Use case   User sets project internal or global identifier    User sets request body    User runs method execution   System returns project testplans with analytics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ProjectsProjectIdTestPlansSearchPostTest() throws ApiException {
        String projectId = null;
        Boolean mustUpdateCache = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2ProjectsProjectIdTestPlansSearchPostRequest apiV2ProjectsProjectIdTestPlansSearchPostRequest = null;
        List<TestPlanWithAnalyticModel> response = api.apiV2ProjectsProjectIdTestPlansSearchPost(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, apiV2ProjectsProjectIdTestPlansSearchPostRequest);
        // TODO: test validations
    }

}
