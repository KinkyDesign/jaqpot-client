# FeatureApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeature**](FeatureApi.md#createFeature) | **POST** /feature | Creates a new Feature
[**deleteFeature**](FeatureApi.md#deleteFeature) | **DELETE** /feature/{id} | Deletes a particular Feature resource.
[**getFeature**](FeatureApi.md#getFeature) | **GET** /feature/{id} | Finds Feature by ID
[**listFeatures**](FeatureApi.md#listFeatures) | **GET** /feature | Lists features
[**putFeature**](FeatureApi.md#putFeature) | **PUT** /feature/{id} | Places a new Feature at a particular URI


<a name="createFeature"></a>
# **createFeature**
> createFeature(body, subjectid)

Creates a new Feature

Creates a new feature which is assigned a random unique ID. When creating a new feature, clients must wary not only for its syntactic correctness, but also for its semantic completeness. It is strongly recommended to add a comprehensive and identifying title to your feature using the &lt;code&gt;meta.titles&lt;/code&gt; field, to add a description in &lt;code&gt;meta.descriptions&lt;/code&gt; and also to add a list of tags in &lt;code&gt;meta.subjects&lt;/code&gt; that will facilitate the discoverability of your features later. Additionally, all features should be annotated with appropriate ontological classes (from the OpenTox ontology), such as &lt;code&gt;ot:Feature&lt;/code&gt;, &lt;code&gt;ot:NumericFeature&lt;/code&gt; and &lt;code&gt;ot:NominalFeature&lt;/code&gt;. Features that are created as prediction features for a model or are descriptors that can be calculated using a descriptor calculation web service should be linked to this/these service(s) using &lt;code&gt;meta.hasSources&lt;/code&gt;. Finally, nominal features should define their admissible values in &lt;code&gt;admissibleValues&lt;/code&gt;. Malformed feature documents will not be accepted by the server and an error report will be generated and returned to the client. Notice also that authentication, authorization and accounting restrictions may apply.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.FeatureApi;


FeatureApi apiInstance = new FeatureApi();
Feature body = new Feature(); // Feature | Feature in JSON representation compliant with the Feature specifications. Malformed Feature entries with missing fields will not be accepted.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.createFeature(body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#createFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Feature**](Feature.md)| Feature in JSON representation compliant with the Feature specifications. Malformed Feature entries with missing fields will not be accepted. |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

<a name="deleteFeature"></a>
# **deleteFeature**
> deleteFeature(id, subjectid)

Deletes a particular Feature resource.

Deletes a Feature of a given ID. The method is idempondent, that is, it can be used more than once without triggering an exception/error. If the Feature does not exist, the method will return without errors. Authentication and authorization requirements apply, so clients that are not authenticated with a valid token or do not have sufficient priviledges will not be able to delete a Feature using this method.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.FeatureApi;


FeatureApi apiInstance = new FeatureApi();
String id = "id_example"; // String | ID of the Model.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.deleteFeature(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#deleteFeature");
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

<a name="getFeature"></a>
# **getFeature**
> Feature getFeature(id, subjectid)

Finds Feature by ID

Finds specified Feature (by ID)

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.FeatureApi;


FeatureApi apiInstance = new FeatureApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    Feature result = apiInstance.getFeature(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#getFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="listFeatures"></a>
# **listFeatures**
> listFeatures(subjectid, query, start, max)

Lists features

Lists Feature entries in the DB of Jaqpot and returns them in a list. Results can be obtained either in the form of a URI list or as a JSON list as specified by the Accept HTTP header. In the latter case, a list will be returned containing only the IDs of the features, their metadata and their ontological classes. The parameter max, which specifies the maximum number of IDs to be listed is limited to 500; if the client specifies a larger value, an HTTP Warning Header will be returned (RFC 2616) with code P670.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.FeatureApi;


FeatureApi apiInstance = new FeatureApi();
String subjectid = "subjectid_example"; // String | Authorization token
String query = "query_example"; // String | Generic query
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listFeatures(subjectid, query, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#listFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **query** | **String**| Generic query | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="putFeature"></a>
# **putFeature**
> putFeature(id, body, subjectid)

Places a new Feature at a particular URI

Creates a new Feature entry at the specified URI. If a Feature already exists at this URI,it will be replaced. If, instead, no Feature is stored under the specified URI, a new Feature entry will be created. Notice that authentication, authorization and accounting (quota) restrictions may apply.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.FeatureApi;


FeatureApi apiInstance = new FeatureApi();
String id = "id_example"; // String | ID of the Feature.
Feature body = new Feature(); // Feature | Feature in JSON
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.putFeature(id, body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureApi#putFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Feature. |
 **body** | [**Feature**](Feature.md)| Feature in JSON |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

