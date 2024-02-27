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
import ru.testit.client.model.ApiV2NotificationsSearchPostRequest;
import ru.testit.client.model.NotificationModel;
import ru.testit.client.model.NotificationTypeModel;
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
 * API tests for NotificationsApi
 */
@Disabled
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    /**
     * Get unread Notifications total in last 7 days
     *
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns unread notifications total (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2NotificationsCountGetTest() throws ApiException {
        Boolean isRead = null;
        Integer response = api.apiV2NotificationsCountGet(isRead);
        // TODO: test validations
    }

    /**
     * Get all Notifications for current User
     *
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System returns notifications (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2NotificationsGetTest() throws ApiException {
        NotificationTypeModel notificationType = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<NotificationModel> response = api.apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Set Notification as read
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets notification internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System set notification as read
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2NotificationsIdReadPostTest() throws ApiException {
        UUID id = null;
        api.apiV2NotificationsIdReadPost(id);
        // TODO: test validations
    }

    /**
     * Set all Notifications as read
     *
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System set all notifications as read
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2NotificationsReadPostTest() throws ApiException {
        api.apiV2NotificationsReadPost();
        // TODO: test validations
    }

    /**
     * Search Notifications for current User
     *
     * &lt;br&gt;Use case  &lt;br&gt;User set filter and runs method execution  &lt;br&gt;System returns notifications (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2NotificationsSearchPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2NotificationsSearchPostRequest apiV2NotificationsSearchPostRequest = null;
        List<NotificationModel> response = api.apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, apiV2NotificationsSearchPostRequest);
        // TODO: test validations
    }

}
