/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiInvoker;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import java.util.Map;
import org.openapitools.client.model.Order;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class StoreApi {
  String basePath = "http://petstore.swagger.io/v2";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
   * @param orderId ID of the order that needs to be deleted
   * @return void
   */
  public void  deleteOrder (String orderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
       throw new ApiException(400, "Missing the required parameter 'orderId' when calling deleteOrder");
    }

    // create path and map variables
    String localVarPath = "/store/order/{orderId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "orderId" + "\\}", apiInvoker.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Map<String, Integer>
   */
  public Map<String, Integer>  getInventory () throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/store/inventory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (Map<String, Integer>) ApiInvoker.deserialize(localVarResponse, "map", Integer.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched
   * @return Order
   */
  public Order  getOrderById (Long orderId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
       throw new ApiException(400, "Missing the required parameter 'orderId' when calling getOrderById");
    }

    // create path and map variables
    String localVarPath = "/store/order/{orderId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "orderId" + "\\}", apiInvoker.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (Order) ApiInvoker.deserialize(localVarResponse, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet
   * @return Order
   */
  public Order  placeOrder (Order body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling placeOrder");
    }

    // create path and map variables
    String localVarPath = "/store/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<>();
    // header params
    Map<String, String> localVarHeaderParams = new HashMap<>();
    // form params
    Map<String, String> localVarFormParams = new HashMap<>();



    String[] localVarContentTypes = {
      
    };
    String localVarContentType = localVarContentTypes.length > 0 ? localVarContentTypes[0] : "application/json";

    if (localVarContentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      localVarPostBody = localVarBuilder.build();
    } else {
      // normal form params
          }

    try {
      String localVarResponse = apiInvoker.invokeAPI(basePath, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarContentType);
      if(localVarResponse != null){
        return (Order) ApiInvoker.deserialize(localVarResponse, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
}
