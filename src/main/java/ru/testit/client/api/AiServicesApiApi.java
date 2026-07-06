package ru.testit.client.api;

import ru.testit.client.invoker.ApiException;
import ru.testit.client.invoker.ApiClient;
import ru.testit.client.invoker.ApiResponse;
import ru.testit.client.invoker.Configuration;
import ru.testit.client.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import ru.testit.client.model.AIServiceModelApiResultIReply;
import ru.testit.client.model.GetAIServiceModelsApiModel;
import ru.testit.client.model.ProblemDetails;
import java.util.UUID;
import ru.testit.client.model.ValidationProblemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AiServicesApiApi {
  private ApiClient apiClient;

  public AiServicesApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AiServicesApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Ask for models with inquiry filter, cached
   * 
   * @param id  (required)
   * @param getAIServiceModelsApiModel  (optional)
   * @return AIServiceModelApiResultIReply
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid data or models request errors </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public AIServiceModelApiResultIReply apiV2ExternalServicesIdAiModelsPost(UUID id, GetAIServiceModelsApiModel getAIServiceModelsApiModel) throws ApiException {
    return apiV2ExternalServicesIdAiModelsPostWithHttpInfo(id, getAIServiceModelsApiModel).getData();
  }

  /**
   * Ask for models with inquiry filter, cached
   * 
   * @param id  (required)
   * @param getAIServiceModelsApiModel  (optional)
   * @return ApiResponse&lt;AIServiceModelApiResultIReply&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Not valid data or models request errors </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AIServiceModelApiResultIReply> apiV2ExternalServicesIdAiModelsPostWithHttpInfo(UUID id, GetAIServiceModelsApiModel getAIServiceModelsApiModel) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling apiV2ExternalServicesIdAiModelsPost");
    }

    // Path parameters
    String localVarPath = "/api/v2/external-services/{id}/ai/models"
            .replaceAll("\\{id}", apiClient.escapeString(id.toString()));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"PrivateToken", "Cookies"};
    GenericType<AIServiceModelApiResultIReply> localVarReturnType = new GenericType<AIServiceModelApiResultIReply>() {};
    return apiClient.invokeAPI("AiServicesApiApi.apiV2ExternalServicesIdAiModelsPost", localVarPath, "POST", new ArrayList<>(), getAIServiceModelsApiModel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
