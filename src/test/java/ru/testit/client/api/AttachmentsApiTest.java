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
import ru.testit.client.model.AttachmentModel;
import java.io.File;
import ru.testit.client.model.ImageResizeType;
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
 * API tests for AttachmentsApi
 */
@Disabled
public class AttachmentsApiTest {

    private final AttachmentsApi api = new AttachmentsApi();

    /**
     * Delete attachment file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AttachmentsIdDeleteTest() throws ApiException {
        UUID id = null;
        api.apiV2AttachmentsIdDelete(id);
        // TODO: test validations
    }

    /**
     * Download attachment file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AttachmentsIdGetTest() throws ApiException {
        UUID id = null;
        Integer width = null;
        Integer height = null;
        ImageResizeType resizeType = null;
        String backgroundColor = null;
        Boolean preview = null;
        api.apiV2AttachmentsIdGet(id, width, height, resizeType, backgroundColor, preview);
        // TODO: test validations
    }

    /**
     * Get size of attachments storage in bytes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AttachmentsOccupiedFileStorageSizeGetTest() throws ApiException {
        Long response = api.apiV2AttachmentsOccupiedFileStorageSizeGet();
        // TODO: test validations
    }

    /**
     * Upload new attachment file
     *
     * File size is restricted to 50 MB (52 428 800 bytes)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2AttachmentsPostTest() throws ApiException {
        File _file = null;
        AttachmentModel response = api.apiV2AttachmentsPost(_file);
        // TODO: test validations
    }

}
