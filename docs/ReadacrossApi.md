# ReadacrossApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interLabTestReadAcross**](ReadacrossApi.md#interLabTestReadAcross) | **POST** /readacross | Creates Read Across Report


<a name="interLabTestReadAcross"></a>
# **interLabTestReadAcross**
> Report interLabTestReadAcross(title, descriptions, datasetUri, predictionFeature, parameters, subjectid)

Creates Read Across Report

Creates Read Across Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ReadacrossApi;


ReadacrossApi apiInstance = new ReadacrossApi();
String title = "title_example"; // String | 
String descriptions = "descriptions_example"; // String | 
String datasetUri = "datasetUri_example"; // String | 
String predictionFeature = "predictionFeature_example"; // String | 
String parameters = "parameters_example"; // String | 
String subjectid = "subjectid_example"; // String | 
try {
    Report result = apiInstance.interLabTestReadAcross(title, descriptions, datasetUri, predictionFeature, parameters, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReadacrossApi#interLabTestReadAcross");
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

