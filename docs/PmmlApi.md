# PmmlApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPMML**](PmmlApi.md#createPMML) | **POST** /pmml | Creates a new PMML entry
[**createPMMLSelection**](PmmlApi.md#createPMMLSelection) | **POST** /pmml/selection | Creates a new PMML entry
[**getPmml**](PmmlApi.md#getPmml) | **GET** /pmml/{id} | Returns PMML entry
[**listPmml**](PmmlApi.md#listPmml) | **GET** /pmml | Finds all PMML entries


<a name="createPMML"></a>
# **createPMML**
> createPMML(pmmlFile, subjectid, title, description)

Creates a new PMML entry

Creates a new PMML entry which is assigned a random unique ID

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.PmmlApi;


PmmlApi apiInstance = new PmmlApi();
File pmmlFile = new File("/path/to/file.txt"); // File | PMML in JSON representation.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
String title = "title_example"; // String | title
String description = "description_example"; // String | description
try {
    apiInstance.createPMML(pmmlFile, subjectid, title, description);
} catch (ApiException e) {
    System.err.println("Exception when calling PmmlApi#createPMML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pmmlFile** | **File**| PMML in JSON representation. |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]
 **title** | **String**| title | [optional]
 **description** | **String**| description | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml, text/xml
 - **Accept**: application/json, text/uri-list

<a name="createPMMLSelection"></a>
# **createPMMLSelection**
> Pmml createPMMLSelection(subjectid, features)

Creates a new PMML entry

Creates a new PMML entry which is assigned a random unique ID

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.PmmlApi;


PmmlApi apiInstance = new PmmlApi();
String subjectid = "subjectid_example"; // String | Authorization token
String features = "features_example"; // String | 
try {
    Pmml result = apiInstance.createPMMLSelection(subjectid, features);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PmmlApi#createPMMLSelection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **features** | **String**|  | [optional]

### Return type

[**Pmml**](Pmml.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="getPmml"></a>
# **getPmml**
> getPmml(id, subjectid)

Returns PMML entry

Finds and returns a PMML document by ID

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.PmmlApi;


PmmlApi apiInstance = new PmmlApi();
String id = "id_example"; // String | ID of the BibTeX
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.getPmml(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling PmmlApi#getPmml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the BibTeX |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list, application/xml, text/xml

<a name="listPmml"></a>
# **listPmml**
> listPmml(subjectid, start, max)

Finds all PMML entries

Finds all PMML entries in the DB of Jaqpot and returns them in a list

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.PmmlApi;


PmmlApi apiInstance = new PmmlApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max
try {
    apiInstance.listPmml(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling PmmlApi#listPmml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

