# DatasetApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataset**](DatasetApi.md#createDataset) | **POST** /dataset | Creates a new Dataset
[**createEmptyDataset**](DatasetApi.md#createEmptyDataset) | **POST** /dataset/empty | Creates a new empty Dataset
[**createQPRFReport**](DatasetApi.md#createQPRFReport) | **POST** /dataset/{id}/qprf | Creates QPRF Report
[**createQPRFReportDummy**](DatasetApi.md#createQPRFReportDummy) | **POST** /dataset/{id}/qprf-dummy | Creates QPRF Report
[**deleteDataset**](DatasetApi.md#deleteDataset) | **DELETE** /dataset/{id} | Deletes dataset
[**getDataset**](DatasetApi.md#getDataset) | **GET** /dataset/{id} | Finds Dataset by Id
[**getDatasetFeatures**](DatasetApi.md#getDatasetFeatures) | **GET** /dataset/{id}/features | Finds Dataset by Id
[**getDatasetMeta**](DatasetApi.md#getDatasetMeta) | **GET** /dataset/{id}/meta | Finds Dataset by Id
[**listDatasets**](DatasetApi.md#listDatasets) | **GET** /dataset | Finds all Datasets
[**listFeaturedDatasets**](DatasetApi.md#listFeaturedDatasets) | **GET** /dataset/featured | Finds all Datasets
[**mergeDatasets**](DatasetApi.md#mergeDatasets) | **POST** /dataset/merge | Merges Datasets


<a name="createDataset"></a>
# **createDataset**
> Dataset createDataset(subjectid, body)

Creates a new Dataset

The new Dataset created will be assigned on a random generated Id

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String subjectid = "subjectid_example"; // String | Authorization token
Dataset body = new Dataset(); // Dataset | 
try {
    Dataset result = apiInstance.createDataset(subjectid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#createDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **body** | [**Dataset**](Dataset.md)|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/uri-list, application/json

<a name="createEmptyDataset"></a>
# **createEmptyDataset**
> Dataset createEmptyDataset(subjectid, title, description)

Creates a new empty Dataset

The new empty Dataset created will be assigned on a random generated Id

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String subjectid = "subjectid_example"; // String | Authorization token
String title = "title_example"; // String | 
String description = "description_example"; // String | 
try {
    Dataset result = apiInstance.createEmptyDataset(subjectid, title, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#createEmptyDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **title** | **String**|  | [optional]
 **description** | **String**|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list, application/json

<a name="createQPRFReport"></a>
# **createQPRFReport**
> createQPRFReport(id, subjectid, substanceUri, title, description)

Creates QPRF Report



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
String substanceUri = "substanceUri_example"; // String | 
String title = "title_example"; // String | 
String description = "description_example"; // String | 
try {
    apiInstance.createQPRFReport(id, subjectid, substanceUri, title, description);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#createQPRFReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]
 **substanceUri** | **String**|  | [optional]
 **title** | **String**|  | [optional]
 **description** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="createQPRFReportDummy"></a>
# **createQPRFReportDummy**
> createQPRFReportDummy(id, subjectid, substanceUri, title, description)

Creates QPRF Report



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
String substanceUri = "substanceUri_example"; // String | 
String title = "title_example"; // String | 
String description = "description_example"; // String | 
try {
    apiInstance.createQPRFReportDummy(id, subjectid, substanceUri, title, description);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#createQPRFReportDummy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]
 **substanceUri** | **String**|  | [optional]
 **title** | **String**|  | [optional]
 **description** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="deleteDataset"></a>
# **deleteDataset**
> deleteDataset(id, subjectid)

Deletes dataset



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.deleteDataset(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#deleteDataset");
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
 - **Accept**: application/json, text/uri-list

<a name="getDataset"></a>
# **getDataset**
> Dataset getDataset(id, subjectid, rowStart, rowMax, colStart, colMax, stratify, seed, folds, targetFeature)

Finds Dataset by Id

Finds specified Dataset

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
Integer rowStart = 56; // Integer | 
Integer rowMax = 56; // Integer | 
Integer colStart = 56; // Integer | 
Integer colMax = 56; // Integer | 
String stratify = "stratify_example"; // String | 
Long seed = 789L; // Long | 
Integer folds = 56; // Integer | 
String targetFeature = "targetFeature_example"; // String | 
try {
    Dataset result = apiInstance.getDataset(id, subjectid, rowStart, rowMax, colStart, colMax, stratify, seed, folds, targetFeature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#getDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]
 **rowStart** | **Integer**|  | [optional]
 **rowMax** | **Integer**|  | [optional]
 **colStart** | **Integer**|  | [optional]
 **colMax** | **Integer**|  | [optional]
 **stratify** | **String**|  | [optional]
 **seed** | **Long**|  | [optional]
 **folds** | **Integer**|  | [optional]
 **targetFeature** | **String**|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

<a name="getDatasetFeatures"></a>
# **getDatasetFeatures**
> Dataset getDatasetFeatures(id, subjectid)

Finds Dataset by Id

Finds specified Dataset

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    Dataset result = apiInstance.getDatasetFeatures(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#getDatasetFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetMeta"></a>
# **getDatasetMeta**
> Dataset getDatasetMeta(id, subjectid)

Finds Dataset by Id

Finds specified Dataset

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    Dataset result = apiInstance.getDatasetMeta(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#getDatasetMeta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDatasets"></a>
# **listDatasets**
> listDatasets(subjectid, start, max)

Finds all Datasets

Finds all Datasets in the DB of Jaqpot and returns them in a list. Results can be obtained either in the form of a URI list or as a JSON list as specified by the Accept HTTP header. In the latter case, a list will be returned containing only the IDs of the datasets, their metadata and their ontological classes. The parameter max, which specifies the maximum number of IDs to be listed is limited to 500; if the client specifies a larger value, an HTTP Warning Header will be returned (RFC 2616) with code P670.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listDatasets(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#listDatasets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="listFeaturedDatasets"></a>
# **listFeaturedDatasets**
> listFeaturedDatasets(subjectid, start, max)

Finds all Datasets

Finds Featured Datasets in the DB of Jaqpot and returns them in a list. Results can be obtained either in the form of a URI list or as a JSON list as specified by the Accept HTTP header. In the latter case, a list will be returned containing only the IDs of the datasets, their metadata and their ontological classes. The parameter max, which specifies the maximum number of IDs to be listed is limited to 500; if the client specifies a larger value, an HTTP Warning Header will be returned (RFC 2616) with code P670.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String subjectid = "subjectid_example"; // String | Authorization token
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listFeaturedDatasets(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#listFeaturedDatasets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="mergeDatasets"></a>
# **mergeDatasets**
> mergeDatasets(datasetUris, subjectid)

Merges Datasets



### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.DatasetApi;


DatasetApi apiInstance = new DatasetApi();
String datasetUris = "datasetUris_example"; // String | 
String subjectid = "subjectid_example"; // String | 
try {
    apiInstance.mergeDatasets(datasetUris, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetApi#mergeDatasets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetUris** | **String**|  | [optional]
 **subjectid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

