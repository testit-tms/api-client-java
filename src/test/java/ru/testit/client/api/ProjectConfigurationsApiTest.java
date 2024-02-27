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
import ru.testit.client.model.ConfigurationModel;
import ru.testit.client.model.ProblemDetails;
import ru.testit.client.model.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectConfigurationsApi
 */
@Disabled
public class ProjectConfigurationsApiTest {

    private final ProjectConfigurationsApi api = new ProjectConfigurationsApi();

    /**
     * Get project configurations
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets project internal or global identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search project  &lt;br&gt;System search all configurations related to project  &lt;br&gt;System returns array of found configurations (listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationsByProjectIdTest() throws ApiException {
        String projectId = null;
        List<ConfigurationModel> response = api.getConfigurationsByProjectId(projectId);
        // TODO: test validations
    }

}
