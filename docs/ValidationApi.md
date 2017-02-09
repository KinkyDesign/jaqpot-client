# ValidationApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crossValidateAlgorithm**](ValidationApi.md#crossValidateAlgorithm) | **POST** /validation/training_test_cross | Creates Validation Report
[**externalValidateAlgorithm**](ValidationApi.md#externalValidateAlgorithm) | **POST** /validation/test_set_validation | Creates Validation Report
[**splitValidateAlgorithm**](ValidationApi.md#splitValidateAlgorithm) | **POST** /validation/training_test_split | Creates Validation Report


<a name="crossValidateAlgorithm"></a>
# **crossValidateAlgorithm**
> Task crossValidateAlgorithm(algorithmUri, trainingDatasetUri, algorithmParams, predictionFeature, transformations, scaling, folds, stratify, seed, subjectId)

Creates Validation Report

Creates Validation Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ValidationApi;


ValidationApi apiInstance = new ValidationApi();
String algorithmUri = "algorithmUri_example"; // String | 
String trainingDatasetUri = "trainingDatasetUri_example"; // String | 
String algorithmParams = "algorithmParams_example"; // String | 
String predictionFeature = "predictionFeature_example"; // String | 
String transformations = "http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations"; // String | 
String scaling = "http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization"; // String | 
Integer folds = 56; // Integer | 
String stratify = "stratify_example"; // String | 
Integer seed = 56; // Integer | 
String subjectId = "subjectId_example"; // String | 
try {
    Task result = apiInstance.crossValidateAlgorithm(algorithmUri, trainingDatasetUri, algorithmParams, predictionFeature, transformations, scaling, folds, stratify, seed, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidationApi#crossValidateAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **algorithmUri** | **String**|  | [optional]
 **trainingDatasetUri** | **String**|  | [optional]
 **algorithmParams** | **String**|  | [optional]
 **predictionFeature** | **String**|  | [optional]
 **transformations** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations]
 **scaling** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization]
 **folds** | **Integer**|  | [optional]
 **stratify** | **String**|  | [optional]
 **seed** | **Integer**|  | [optional]
 **subjectId** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="externalValidateAlgorithm"></a>
# **externalValidateAlgorithm**
> Task externalValidateAlgorithm(modelUri, testDatasetUri, subjectId)

Creates Validation Report

Creates Validation Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ValidationApi;


ValidationApi apiInstance = new ValidationApi();
String modelUri = "modelUri_example"; // String | 
String testDatasetUri = "testDatasetUri_example"; // String | 
String subjectId = "subjectId_example"; // String | 
try {
    Task result = apiInstance.externalValidateAlgorithm(modelUri, testDatasetUri, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidationApi#externalValidateAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelUri** | **String**|  | [optional]
 **testDatasetUri** | **String**|  | [optional]
 **subjectId** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="splitValidateAlgorithm"></a>
# **splitValidateAlgorithm**
> Task splitValidateAlgorithm(splitRatio, algorithmUri, trainingDatasetUri, algorithmParams, predictionFeature, transformations, scaling, stratify, seed, subjectId)

Creates Validation Report

Creates Validation Report

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.ValidationApi;


ValidationApi apiInstance = new ValidationApi();
Double splitRatio = 3.4D; // Double | 
String algorithmUri = "algorithmUri_example"; // String | 
String trainingDatasetUri = "trainingDatasetUri_example"; // String | 
String algorithmParams = "algorithmParams_example"; // String | 
String predictionFeature = "predictionFeature_example"; // String | 
String transformations = "http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations"; // String | 
String scaling = "http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization"; // String | 
String stratify = "stratify_example"; // String | 
Integer seed = 56; // Integer | 
String subjectId = "subjectId_example"; // String | 
try {
    Task result = apiInstance.splitValidateAlgorithm(splitRatio, algorithmUri, trainingDatasetUri, algorithmParams, predictionFeature, transformations, scaling, stratify, seed, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ValidationApi#splitValidateAlgorithm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **splitRatio** | **Double**|  |
 **algorithmUri** | **String**|  | [optional]
 **trainingDatasetUri** | **String**|  | [optional]
 **algorithmParams** | **String**|  | [optional]
 **predictionFeature** | **String**|  | [optional]
 **transformations** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/pmml/corona-standard-transformations]
 **scaling** | **String**|  | [optional] [default to http://app.jaqpot.org:8080/jaqpot/services/algorithm/standarization]
 **stratify** | **String**|  | [optional]
 **seed** | **Integer**|  | [optional]
 **subjectId** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

