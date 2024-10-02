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
import java.io.File;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectImportApi
 */
@Disabled
public class ProjectImportApiTest {

    private final ProjectImportApi api = new ProjectImportApi();

    /**
     * Import project from JSON file into existing project in background job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backgroundImportToExistingProjectTest() throws ApiException {
        String projectId = null;
        File _file = null;
        UUID response = api.backgroundImportToExistingProject(projectId, _file);
        // TODO: test validations
    }

    /**
     * Import project from Zip file into existing project in background job
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void backgroundImportZipToExistingProjectTest() throws ApiException {
        String projectId = null;
        File _file = null;
        UUID response = api.backgroundImportZipToExistingProject(projectId, _file);
        // TODO: test validations
    }

    /**
     * Import project from JSON file into existing project
     *
     *  Use case   User attaches project as json file taken from export or export-by-testPlans method   User runs method execution   System updates project   System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importToExistingProjectTest() throws ApiException {
        String projectId = null;
        Boolean includeAttachments = null;
        File _file = null;
        api.importToExistingProject(projectId, includeAttachments, _file);
        // TODO: test validations
    }

}
