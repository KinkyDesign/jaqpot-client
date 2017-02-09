# DoseresponseApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doseResponse**](DoseresponseApi.md#doseResponse) | **POST** /doseresponse | Creates Dose Response Report


<a name="doseResponse"></a>
# **doseResponse**
> Report doseResponse(title, description, datasetUri, predictionFeature, parameters, subjectid)

Creates Dose Response Report

Creates Dose Response Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DoseresponseApi;


DoseresponseApi apiInstance = new DoseresponseApi();
String title = "title_example"; // String | 
String description = "description_example"; // String | 
String datasetUri = "datasetUri_example"; // String | 
String predictionFeature = "predictionFeature_example"; // String | 
String parameters = "parameters_example"; // String | 
String subjectid = "subjectid_example"; // String | 
try {
    Report result = apiInstance.doseResponse(title, description, datasetUri, predictionFeature, parameters, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoseresponseApi#doseResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**|  | [optional]
 **description** | **String**|  | [optional]
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

