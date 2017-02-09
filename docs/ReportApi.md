# ReportApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPDF**](ReportApi.md#createPDF) | **GET** /report/{id}/pdf | Creates PDF from report
[**getReport**](ReportApi.md#getReport) | **GET** /report/{id} | Retrieves Report by id
[**getReports**](ReportApi.md#getReports) | **GET** /report | Retrieves Reports of User
[**modifyReport**](ReportApi.md#modifyReport) | **PATCH** /report/{id} | Modifies a particular Report resource
[**removeReport**](ReportApi.md#removeReport) | **DELETE** /report/{id} | Removes Report by id


<a name="createPDF"></a>
# **createPDF**
> createPDF(id, subjectid)

Creates PDF from report



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.createPDF(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#createPDF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8

<a name="getReport"></a>
# **getReport**
> getReport(id, subjectid)

Retrieves Report by id



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.getReport(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReports"></a>
# **getReports**
> getReports(subjectid, start, max)

Retrieves Reports of User



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 20; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.getReports(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getReports");
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
 - **Accept**: application/json

<a name="modifyReport"></a>
# **modifyReport**
> modifyReport(id, body, subjectid)

Modifies a particular Report resource

Modifies (applies a patch on) a Report resource of a given ID. This implementation of PATCH follows the RFC 6902 proposed standard. See https://tools.ietf.org/rfc/rfc6902.txt for details.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
String id = "id_example"; // String | ID of an existing Report.
String body = "body_example"; // String | The patch in JSON according to the RFC 6902 specs
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.modifyReport(id, body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#modifyReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of an existing Report. |
 **body** | **String**| The patch in JSON according to the RFC 6902 specs |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json, text/uri-list

<a name="removeReport"></a>
# **removeReport**
> removeReport(id, subjectid)

Removes Report by id



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.removeReport(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#removeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

