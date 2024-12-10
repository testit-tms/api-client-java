package ru.testit.client.model;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TestPointWithLastResultModelTest {

    @Test
    void testValidateJsonObjectAnother_ValidJson() {
        // Setup
        TestPointWithLastResultModel.openapiFields = new HashSet<>(Arrays.asList(
                "id", "workItemName", "testerId", "workItemId", "configurationId",
                "testSuiteId", "status", "sectionId", "createdById", "modifiedById", "lastTestResult"
        ));
        TestPointWithLastResultModel.openapiRequiredFields = new HashSet<>(Arrays.asList(
                "id", "workItemId", "testSuiteId", "sectionId", "createdById", "lastTestResult"
        ));

        JsonObject jsonObj = new JsonObject();
        jsonObj.add("id", new JsonPrimitive(1));
        jsonObj.add("workItemId", new JsonPrimitive(123));
        jsonObj.add("testSuiteId", new JsonPrimitive(456));
        jsonObj.add("sectionId", new JsonPrimitive(789));
        jsonObj.add("createdById", new JsonPrimitive(1001));
        jsonObj.add("lastTestResult", JsonNull.INSTANCE);

        // Execute & Verify
        assertDoesNotThrow(() -> TestPointWithLastResultModel.validateJsonObject(jsonObj));
    }
}
