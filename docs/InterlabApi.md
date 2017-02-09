# InterlabApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interLabTest**](InterlabApi.md#interLabTest) | **POST** /interlab/test | Creates Interlab Testing Report


<a name="interLabTest"></a>
# **interLabTest**
> Report interLabTest(title, descriptions, datasetUri, predictionFeature, parameters, subjectid)

Creates Interlab Testing Report

Creates Interlab Testing Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.InterlabApi;


InterlabApi apiInstance = new InterlabApi();
String title = "title_example"; // String | 
String descriptions = "descriptions_example"; // String | 
String datasetUri = "datasetUri_example"; // String | 
String predictionFeature = "predictionFeature_example"; // String | 
String parameters = "parameters_example"; // String | 
String subjectid = "subjectid_example"; // String | 
try {
    Report result = apiInstance.interLabTest(title, descriptions, datasetUri, predictionFeature, parameters, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InterlabApi#interLabTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**|  | [optional]
 **descriptions** | **String**|  | [optional]
 **datasetUri** | **String**|  | [optional]
 **predictionFeature** | **String**|  | [optional]
 **parameters** | **String**|  | [optional]
 **subjectid** | **String**|  | [optional]

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

