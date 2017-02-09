# EnmApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBundle**](EnmApi.md#createBundle) | **POST** /enm/bundle | Creates Bundle
[**createDatasetByStudies**](EnmApi.md#createDatasetByStudies) | **POST** /enm/dataset | Creates Dataset
[**getDescriptorCategories**](EnmApi.md#getDescriptorCategories) | **GET** /enm/descriptor/categories | Retrieves descriptor calculation categories
[**getPropertyCategories**](EnmApi.md#getPropertyCategories) | **GET** /enm/property/categories | Retrieves property categories


<a name="createBundle"></a>
# **createBundle**
> String createBundle(body, subjectid)

Creates Bundle

Reads Substances from SubstanceOwner and creates Bundle.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.EnmApi;


EnmApi apiInstance = new EnmApi();
BundleData body = new BundleData(); // BundleData | Data for bundle creation
String subjectid = "subjectid_example"; // String | 
try {
    String result = apiInstance.createBundle(body, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnmApi#createBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BundleData**](BundleData.md)| Data for bundle creation |
 **subjectid** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

<a name="createDatasetByStudies"></a>
# **createDatasetByStudies**
> Task createDatasetByStudies(data, subjectid)

Creates Dataset

Reads Studies from Bundle&#39;s Substances, creates Dateaset,calculates Descriptors, returns Dataset

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.EnmApi;


EnmApi apiInstance = new EnmApi();
DatasetData data = new DatasetData(); // DatasetData | 
String subjectid = "subjectid_example"; // String | 
try {
    Task result = apiInstance.createDatasetByStudies(data, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnmApi#createDatasetByStudies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**DatasetData**](DatasetData.md)|  | [optional]
 **subjectid** | **String**|  | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

<a name="getDescriptorCategories"></a>
# **getDescriptorCategories**
> List&lt;Object&gt; getDescriptorCategories()

Retrieves descriptor calculation categories



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.EnmApi;


EnmApi apiInstance = new EnmApi();
try {
    List<Object> result = apiInstance.getDescriptorCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnmApi#getDescriptorCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPropertyCategories"></a>
# **getPropertyCategories**
> Map&lt;String, Object&gt; getPropertyCategories()

Retrieves property categories



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.EnmApi;


EnmApi apiInstance = new EnmApi();
try {
    Map<String, Object> result = apiInstance.getPropertyCategories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnmApi#getPropertyCategories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Object&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

