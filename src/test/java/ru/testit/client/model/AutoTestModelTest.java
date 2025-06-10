package ru.testit.client.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AutoTestModelTest {

    @Test
    void testValidateJsonObject_WithNullLastTestResultStatus() {
        // testing field
        JsonObject jsonObj = setupValidModelJsonObject();
        jsonObj.add("lastTestResultStatus", JsonNull.INSTANCE);

        // Execute & Verify
        assertDoesNotThrow(() -> AutoTestModel.validateJsonElement(jsonObj));
    }

    private JsonObject setupValidModelJsonObject() {
        // Setup
        AutoTestModel.openapiFields = new HashSet<>(Arrays.asList(
                "globalId", "isDeleted", "mustBeApproved", "id", "createdDate",
                "modifiedDate", "createdById", "modifiedById", "lastTestRunId",
                "lastTestRunName", "lastTestResultId", "lastTestResultConfiguration",
                "lastTestResultOutcome", "lastTestResultStatus", "stabilityPercentage",
                "externalId", "links", "projectId", "name", "namespace", "classname",
                "steps", "setup", "teardown", "title", "description", "labels",
                "isFlaky", "externalKey"
        ));
        AutoTestModel.openapiRequiredFields = new HashSet<>(Arrays.asList(
                "globalId", "isDeleted", "mustBeApproved", "id", "createdDate",
                "createdById", "externalId", "projectId", "name"
        ));

        JsonObject jsonObj = new JsonObject();

        jsonObj.add("globalId", new JsonPrimitive(12345L));
        jsonObj.add("isDeleted", new JsonPrimitive(false));
        jsonObj.add("mustBeApproved", new JsonPrimitive(false));
        jsonObj.add("id", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("createdDate", new JsonPrimitive(OffsetDateTime.now().toString()));
        jsonObj.add("modifiedDate", new JsonPrimitive(OffsetDateTime.now().toString()));
        jsonObj.add("createdById", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("modifiedById", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("lastTestRunId", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("lastTestRunName", new JsonPrimitive("Last Test Run"));
        jsonObj.add("lastTestResultId", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("lastTestResultConfiguration", JsonNull.INSTANCE);
        jsonObj.add("lastTestResultOutcome", new JsonPrimitive("Passed"));
        jsonObj.add("lastTestResultStatus", JsonNull.INSTANCE);
        jsonObj.add("stabilityPercentage", new JsonPrimitive(100));
        jsonObj.add("externalId", new JsonPrimitive("external-123"));
        jsonObj.add("links", new JsonArray());
        jsonObj.add("projectId", new JsonPrimitive(UUID.randomUUID().toString()));
        jsonObj.add("name", new JsonPrimitive("Test Name"));
        jsonObj.add("namespace", new JsonPrimitive("Test.Namespace"));
        jsonObj.add("classname", new JsonPrimitive("TestClassName"));
        jsonObj.add("steps", new JsonArray());
        jsonObj.add("setup", new JsonArray());
        jsonObj.add("teardown", new JsonArray());
        jsonObj.add("title", new JsonPrimitive("Test Title"));
        jsonObj.add("description", new JsonPrimitive("Test Description"));
        jsonObj.add("labels", new JsonArray());
        jsonObj.add("isFlaky", new JsonPrimitive(false));
        jsonObj.add("externalKey", new JsonPrimitive("external-key-123"));

        return jsonObj;
    }
} 