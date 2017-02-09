# ModelApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](ModelApi.md#deleteModel) | **DELETE** /model/{id} | Deletes a particular Model resource
[**getModel**](ModelApi.md#getModel) | **GET** /model/{id} | Finds Model by Id
[**getModelPmml**](ModelApi.md#getModelPmml) | **GET** /model/{id}/pmml | Finds Model by Id
[**listFeaturedModels**](ModelApi.md#listFeaturedModels) | **GET** /model/featured | Finds all Models
[**listModelDependentFeatures**](ModelApi.md#listModelDependentFeatures) | **GET** /model/{id}/dependent | Lists the dependent features of a Model
[**listModelIndependentFeatures**](ModelApi.md#listModelIndependentFeatures) | **GET** /model/{id}/independent | Lists the independent features of a Model
[**listModelPredictedFeatures**](ModelApi.md#listModelPredictedFeatures) | **GET** /model/{id}/predicted | Lists the dependent features of a Model
[**listModelRequiredFeatures**](ModelApi.md#listModelRequiredFeatures) | **GET** /model/{id}/required | Lists the required features of a Model
[**listModels**](ModelApi.md#listModels) | **GET** /model | Finds all Models
[**makePrediction**](ModelApi.md#makePrediction) | **POST** /model/{id} | Creates Prediction


<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(id, subjectid)

Deletes a particular Model resource

Deletes a Model of a given ID. The method is idempondent, that is it can be used more than once without triggering an exception/error. If the Model does not exist, the method will return without errors. Authentication and authorization requirements apply, so clients that are not authenticated with a valid token or do not have sufficient priviledges will not be able to delete Models using this method.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | ID of the Model.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.deleteModel(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Model. |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="getModel"></a>
# **getModel**
> Model getModel(id, subjectid)

Finds Model by Id

Finds specified Model

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
try {
    Model result = apiInstance.getModel(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list, application/ld+json

<a name="getModelPmml"></a>
# **getModelPmml**
> getModelPmml(id, subjectid)

Finds Model by Id

Finds specified Model

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
try {
    apiInstance.getModelPmml(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#getModelPmml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

<a name="listFeaturedModels"></a>
# **listFeaturedModels**
> listFeaturedModels(subjectid, start, max)

Finds all Models

Finds featured Models from Jaqpot database. The response will list all models and will return either a URI list of a list of JSON model objects. In the latter case, only the IDs, metadata, ontological classes and reliability of the models will be returned. Use the parameters start and max to get paginated results.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 20; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listFeaturedModels(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listFeaturedModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 20]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="listModelDependentFeatures"></a>
# **listModelDependentFeatures**
> listModelDependentFeatures(id, subjectid)

Lists the dependent features of a Model

Lists the dependent features of a Model identified by its ID. The result is available as a URI list.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
try {
    apiInstance.listModelDependentFeatures(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listModelDependentFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="listModelIndependentFeatures"></a>
# **listModelIndependentFeatures**
> listModelIndependentFeatures(id, subjectid)

Lists the independent features of a Model

Lists the independent features of a Model. The result is available as a URI list.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
try {
    apiInstance.listModelIndependentFeatures(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listModelIndependentFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="listModelPredictedFeatures"></a>
# **listModelPredictedFeatures**
> listModelPredictedFeatures(id, subjectid)

Lists the dependent features of a Model

Lists the predicted features of a Model identified by its ID. The result is available as a URI list.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
try {
    apiInstance.listModelPredictedFeatures(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listModelPredictedFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="listModelRequiredFeatures"></a>
# **listModelRequiredFeatures**
> List&lt;String&gt; listModelRequiredFeatures(id, subjectId)

Lists the required features of a Model

Lists the required features of a Model identified by its ID. The result is available as a URI list.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String id = "id_example"; // String | 
String subjectId = "subjectId_example"; // String | 
try {
    List<String> result = apiInstance.listModelRequiredFeatures(id, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listModelRequiredFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectId** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listModels"></a>
# **listModels**
> listModels(subjectid, start, max)

Finds all Models

Finds all Models from Jaqpot Dataset. The response will list all models and will return either a URI list of a list of JSON model objects. In the latter case, only the IDs, metadata, ontological classes and reliability of the models will be returned. Use the parameters start and max to get paginated results.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 20; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listModels(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#listModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 20]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="makePrediction"></a>
# **makePrediction**
> Task makePrediction(datasetUri, id, visible, subjectid)

Creates Prediction

Creates Prediction

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ModelApi;


ModelApi apiInstance = new ModelApi();
String datasetUri = "datasetUri_example"; // String | 
String id = "id_example"; // String | 
Boolean visible = true; // Boolean | 
String subjectid = "subjectid_example"; // String | 
try {
    Task result = apiInstance.makePrediction(datasetUri, id, visible, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelApi#makePrediction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetUri** | **String**|  |
 **id** | **String**|  |
 **visible** | **Boolean**|  | [optional]
 **subjectid** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

