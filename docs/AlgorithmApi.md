# AlgorithmApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlgorithm**](AlgorithmApi.md#createAlgorithm) | **POST** /algorithm | Creates Algorithm
[**deleteAlgorithm**](AlgorithmApi.md#deleteAlgorithm) | **DELETE** /algorithm/{id} | Unregisters an algorithm of given ID
[**getAlgorithm**](AlgorithmApi.md#getAlgorithm) | **GET** /algorithm/{id} | Finds Algorithm
[**getAlgorithms**](AlgorithmApi.md#getAlgorithms) | **GET** /algorithm | Finds all Algorithms
[**modifyAlgorithm**](AlgorithmApi.md#modifyAlgorithm) | **PATCH** /algorithm/{id} | Modifies a particular Algorithm resource
[**trainModel**](AlgorithmApi.md#trainModel) | **POST** /algorithm/{id} | Creates Model


<a name="createAlgorithm"></a>
# **createAlgorithm**
> Algorithm createAlgorithm(body, subjectid, title, description, tags)

Creates Algorithm

Registers a new JPDI-compliant algorithm service. When registering a new JPDI-compliant algorithm web service it is crucial to propertly annotate your algorithm with appropriate ontological classes following the &lt;a href&#x3D;\&quot;http://opentox.org/dev/apis/api-1.1/Algorithms\&quot;&gt;OpenTox algorithms ontology&lt;/a&gt;. For instance, a Clustering algorithm must be annotated with &lt;code&gt;ot:Clustering&lt;/code&gt;. It is also important for discoverability to add tags to your algorithm using the &lt;code&gt;meta.subjects&lt;/code&gt; field. An example is provided below.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
Algorithm body = new Algorithm(); // Algorithm | Algorithm in JSON
String subjectid = "subjectid_example"; // String | Authorization token
String title = "title_example"; // String | Title of your algorithm
String description = "description_example"; // String | Short description of your algorithm
String tags = "tags_example"; // String | Tags for your algorithm (in a comma separated list) to facilitate look-up
try {
    Algorithm result = apiInstance.createAlgorithm(body, subjectid, title, description, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#createAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Algorithm**](Algorithm.md)| Algorithm in JSON |
 **subjectid** | **String**| Authorization token | [optional]
 **title** | **String**| Title of your algorithm | [optional]
 **description** | **String**| Short description of your algorithm | [optional]
 **tags** | **String**| Tags for your algorithm (in a comma separated list) to facilitate look-up | [optional]

### Return type

[**Algorithm**](Algorithm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="deleteAlgorithm"></a>
# **deleteAlgorithm**
> deleteAlgorithm(id, subjectid)

Unregisters an algorithm of given ID

Deletes an algorithm of given ID. The application of this method requires authentication and assumes certain priviledges.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
String id = "id_example"; // String | ID of the algorithm which is to be deleted.
String subjectid = "subjectid_example"; // String | 
try {
    apiInstance.deleteAlgorithm(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#deleteAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the algorithm which is to be deleted. |
 **subjectid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlgorithm"></a>
# **getAlgorithm**
> Algorithm getAlgorithm(id, subjectid)

Finds Algorithm

Finds Algorithm with provided name

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    Algorithm result = apiInstance.getAlgorithm(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#getAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

[**Algorithm**](Algorithm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list, application/ld+json

<a name="getAlgorithms"></a>
# **getAlgorithms**
> List&lt;Algorithm&gt; getAlgorithms(subjectid, propertyClass, start, max)

Finds all Algorithms

Finds all Algorithms JaqpotQuattro supports

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
String subjectid = "subjectid_example"; // String | Authorization token
String propertyClass = "propertyClass_example"; // String | class
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max
try {
    List<Algorithm> result = apiInstance.getAlgorithms(subjectid, propertyClass, start, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#getAlgorithms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **propertyClass** | **String**| class | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max | [optional] [default to 10]

### Return type

[**List&lt;Algorithm&gt;**](Algorithm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="modifyAlgorithm"></a>
# **modifyAlgorithm**
> modifyAlgorithm(id, body, subjectid)

Modifies a particular Algorithm resource

Modifies (applies a patch on) an Algorithm resource of a given ID. This implementation of PATCH follows the RFC 6902 proposed standard. See https://tools.ietf.org/rfc/rfc6902.txt for details.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
String id = "id_example"; // String | ID of an existing BibTeX.
String body = "body_example"; // String | The patch in JSON according to the RFC 6902 specs
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.modifyAlgorithm(id, body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#modifyAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of an existing BibTeX. |
 **body** | **String**| The patch in JSON according to the RFC 6902 specs |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json, text/uri-list

<a name="trainModel"></a>
# **trainModel**
> Task trainModel(title, description, id, datasetUri, predictionFeature, parameters, transformations, scaling, doa, subjectid)

Creates Model

Applies Dataset and Parameters on Algorithm and creates Model.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AlgorithmApi;


AlgorithmApi apiInstance = new AlgorithmApi();
String title = "title_example"; // String | 
String description = "description_example"; // String | 
String id = "id_example"; // String | 
String datasetUri = "http://app.jaqpot.org:8080/jaqpot/services/dataset/corona"; // String | 
String predictionFeature = "https://apps.ideaconsult.net/enmtest/property/TOX/UNKNOWN_TOXICITY_SECTION/Log2+transformed/94D664CFE4929A0F400A5AD8CA733B52E049A688/3ed642f9-1b42-387a-9966-dea5b91e5f8a"; // String | 
String parameters = "parameters_example"; // String | 
String transformations = "http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations"; // String | 
String scaling = "http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization"; // String | 
String doa = "http://app.jaqpot.org:8080/jaqpot/services/algorithm/leverage"; // String | 
String subjectid = "subjectid_example"; // String | 
try {
    Task result = apiInstance.trainModel(title, description, id, datasetUri, predictionFeature, parameters, transformations, scaling, doa, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlgorithmApi#trainModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**|  |
 **description** | **String**|  |
 **id** | **String**|  |
 **datasetUri** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/dataset/corona]
 **predictionFeature** | **String**|  | [optional] [default to https://apps.ideaconsult.net/enmtest/property/TOX/UNKNOWN_TOXICITY_SECTION/Log2+transformed/94D664CFE4929A0F400A5AD8CA733B52E049A688/3ed642f9-1b42-387a-9966-dea5b91e5f8a]
 **parameters** | **String**|  | [optional]
 **transformations** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations]
 **scaling** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization]
 **doa** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/algorithm/leverage]
 **subjectid** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

