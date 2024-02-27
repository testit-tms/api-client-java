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
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.WebHookLogModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksLogsApi
 */
@Disabled
public class WebhooksLogsApiTest {

    private final WebhooksLogsApi api = new WebhooksLogsApi();

    /**
     * Get all webhook logs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2WebhooksLogsGetTest() throws ApiException {
        UUID projectId = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<WebHookLogModel> response = api.apiV2WebhooksLogsGet(projectId, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Delete webhook log by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2WebhooksLogsIdDeleteTest() throws ApiException {
        UUID id = null;
        api.apiV2WebhooksLogsIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get webhook log by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2WebhooksLogsIdGetTest() throws ApiException {
        UUID id = null;
        WebHookLogModel response = api.apiV2WebhooksLogsIdGet(id);
        // TODO: test validations
    }

}
