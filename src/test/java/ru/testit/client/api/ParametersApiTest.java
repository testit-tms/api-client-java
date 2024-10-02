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
import ru.testit.client.model.ApiV2ParametersSearchPostRequest;
import ru.testit.client.model.CreateParameterRequest;
import ru.testit.client.model.ParameterGroupModel;
import ru.testit.client.model.ParameterModel;
import ru.testit.client.model.ParameterPostModel;
import ru.testit.client.model.ParameterPutModel;
import ru.testit.client.model.ProblemDetails;
import java.util.Set;
import java.util.UUID;
import ru.testit.client.model.UpdateParameterRequest;
import ru.testit.client.model.ValidationProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParametersApi
 */
@Disabled
public class ParametersApiTest {

    private final ParametersApi api = new ParametersApi();

    /**
     * Create multiple parameters
     *
     *  Use case   User sets list of parameter model (listed in the request example)   User runs method execution   System creates parameters   System returns list of parameter model (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersBulkPostTest() throws ApiException {
        List<ParameterPostModel> parameterPostModel = null;
        List<ParameterModel> response = api.apiV2ParametersBulkPost(parameterPostModel);
        // TODO: test validations
    }

    /**
     * Update multiple parameters
     *
     *  Use case   User sets list of parameter model (listed in the request example)   User runs method execution   System updates parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersBulkPutTest() throws ApiException {
        List<ParameterPutModel> parameterPutModel = null;
        api.apiV2ParametersBulkPut(parameterPutModel);
        // TODO: test validations
    }

    /**
     * Get parameters as group
     *
     *  Use case   User runs method execution   System search parameters   System returns parameters models as groups (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersGroupsGetTest() throws ApiException {
        Boolean isDeleted = null;
        Set<UUID> parameterKeyIds = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<ParameterGroupModel> response = api.apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Check existence parameter key in system
     *
     *  Use case   User sets name of parameter key   User runs method execution   System search parameter key   System returns the flag for the existence of the parameter key in the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeyNameNameExistsGetTest() throws ApiException {
        String name = null;
        Boolean response = api.apiV2ParametersKeyNameNameExistsGet(name);
        // TODO: test validations
    }

    /**
     * Get all parameter key values
     *
     *  Use case   User sets parameter key (string format)   User runs method execution   System search parameter values using the key   System returns parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeyValuesGetTest() throws ApiException {
        String key = null;
        List<String> response = api.apiV2ParametersKeyValuesGet(key);
        // TODO: test validations
    }

    /**
     * Get all parameter keys
     *
     *  Use case   User runs method execution   System search all parameter keys   System returns parameter keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeysGetTest() throws ApiException {
        List<String> response = api.apiV2ParametersKeysGet();
        // TODO: test validations
    }

    /**
     * Search for parameters as group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersSearchGroupsPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2ParametersSearchPostRequest apiV2ParametersSearchPostRequest = null;
        List<ParameterGroupModel> response = api.apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Search for parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersSearchPostTest() throws ApiException {
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        ApiV2ParametersSearchPostRequest apiV2ParametersSearchPostRequest = null;
        List<ParameterModel> response = api.apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, apiV2ParametersSearchPostRequest);
        // TODO: test validations
    }

    /**
     * Create parameter
     *
     *  Use case   User sets parameter model (listed in the request example)   User runs method execution   System creates parameter   System returns parameter model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createParameterTest() throws ApiException {
        CreateParameterRequest createParameterRequest = null;
        ParameterModel response = api.createParameter(createParameterRequest);
        // TODO: test validations
    }

    /**
     * Delete parameter by name
     *
     * Deletes parameter and all it&#39;s values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByNameTest() throws ApiException {
        String name = null;
        api.deleteByName(name);
        // TODO: test validations
    }

    /**
     * Delete parameters by parameter key identifier
     *
     * Deletes parameter and all it&#39;s values by parameter key identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByParameterKeyIdTest() throws ApiException {
        UUID keyId = null;
        api.deleteByParameterKeyId(keyId);
        // TODO: test validations
    }

    /**
     * Delete parameter
     *
     *  Use case   User sets parameter internal (guid format) identifier   System search and delete parameter   System returns deleted parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteParameterTest() throws ApiException {
        UUID id = null;
        api.deleteParameter(id);
        // TODO: test validations
    }

    /**
     * Get all parameters
     *
     *  Use case   [Optional] User sets isDeleted field value   [Optional] If User sets isDeleted field value as true, System search all deleted parameters   [Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted   If User did not set isDeleted field value, System search all parameters   System returns array of all found parameters(listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllParametersTest() throws ApiException {
        Boolean isDeleted = null;
        Integer skip = null;
        Integer take = null;
        String orderBy = null;
        String searchField = null;
        String searchValue = null;
        List<ParameterModel> response = api.getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Get parameter by ID
     *
     *  Use case   User sets parameter internal (guid format) identifier   User runs method execution   System search parameter using the identifier   System returns parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParameterByIdTest() throws ApiException {
        UUID id = null;
        ParameterModel response = api.getParameterById(id);
        // TODO: test validations
    }

    /**
     * Update parameter
     *
     *  Use case   User sets parameter updated properties(listed in the request example)   User runs method execution   System updated parameter using updated properties   System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateParameterTest() throws ApiException {
        UpdateParameterRequest updateParameterRequest = null;
        api.updateParameter(updateParameterRequest);
        // TODO: test validations
    }

}
