package ru.testit.client.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TestPointShortGetModelTest {

    // TMS-28748 LastTestResult assertion for null-handling
    @Test
    void testValidateJsonObject_WithNullLastTestResult() {
        // testing field
        JsonObject jsonObj = setupValidModelJsonObject();
        jsonObj.add("lastTestResult", JsonNull.INSTANCE);

        // Execute & Verify
        assertDoesNotThrow(() -> TestPointShortResponseModel.validateJsonElement(jsonObj));
    }


    private JsonObject setupValidModelJsonObject() {
        // Setup
        TestPointShortResponseModel.openapiFields = new HashSet<>(Arrays.asList(
                "id", "createdById", "modifiedById", "testerId", "tags", "links", "testSuiteId",
                "testSuiteName", "workItemId", "workItemVersionId", "name", "configurationId",
                "sectionId", "sectionName", "projectId", "lastTestResult", "iterationId",
                "workItemCreatedById", "workItemModifiedById", "status", "statusModel", "priority", "workItemState"
        ));
        TestPointShortResponseModel.openapiRequiredFields = new HashSet<>(Arrays.asList(
                "id", "createdById", "tags", "links", "testSuiteId", "testSuiteName",
                "workItemId", "workItemVersionId", "name", "configurationId", "sectionId", "projectId",
                "lastTestResult", "iterationId", "workItemCreatedById", "status", "priority", "workItemState"
        ));

        JsonObject jsonObj = new JsonObject();
        jsonObj.add("id", new JsonPrimitive(1));
        jsonObj.add("createdById", new JsonPrimitive(1001));
        jsonObj.add("modifiedById", new JsonPrimitive(1002));
        jsonObj.add("testerId", new JsonPrimitive(1003));

        JsonArray tagsArray = new JsonArray();
        tagsArray.add(new JsonPrimitive("tag1"));
        tagsArray.add(new JsonPrimitive("tag2"));
        jsonObj.add("tags", tagsArray);

        JsonArray linksArray = new JsonArray();
        linksArray.add(new JsonPrimitive("link1"));
        linksArray.add(new JsonPrimitive("link2"));
        jsonObj.add("links", linksArray);

        jsonObj.add("testSuiteId", new JsonPrimitive(123));
        jsonObj.add("testSuiteName", new JsonPrimitive("Test Suite"));
        jsonObj.add("workItemId", new JsonPrimitive(456));
        jsonObj.add("workItemVersionId", new JsonPrimitive(789));
        jsonObj.add("name", new JsonPrimitive("Test Point"));
        jsonObj.add("configurationId", new JsonPrimitive(321));
        jsonObj.add("sectionId", new JsonPrimitive(654));
        jsonObj.add("sectionName", new JsonPrimitive("Section"));
        jsonObj.add("projectId", new JsonPrimitive(987));
        jsonObj.add("workItemVersionId", new JsonPrimitive(2));

        jsonObj.add("iterationId", new JsonPrimitive(1234));
        jsonObj.add("workItemCreatedById", new JsonPrimitive(5678));
        jsonObj.add("workItemModifiedById", new JsonPrimitive(91011));
        jsonObj.add("lastTestResult", JsonNull.INSTANCE);
        jsonObj.add("status", new JsonPrimitive("NoResults"));
        jsonObj.add("statusModel", JsonNull.INSTANCE);
        jsonObj.add("priority", new JsonPrimitive("Medium"));
        jsonObj.add("workItemState", new JsonPrimitive("NeedsWork"));

        return jsonObj;
    }

}
