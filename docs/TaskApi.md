# TaskApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTask**](TaskApi.md#deleteTask) | **DELETE** /task/{id} | Deletes a Task of given ID
[**getTask**](TaskApi.md#getTask) | **GET** /task/{id} | Finds Task by Id
[**listTasks**](TaskApi.md#listTasks) | **GET** /task | Finds all Tasks
[**poll**](TaskApi.md#poll) | **GET** /task/{id}/poll | Poll Task by Id


<a name="deleteTask"></a>
# **deleteTask**
> deleteTask(id, subjectid)

Deletes a Task of given ID

Deletes a Task given its ID in the URI. When the DELETE method is applied, the task is interrupted and tagged as CANCELLED. Note that this method does not return a response on success. If the task does not exist, an error report will be returned to the client accompanied by an HTTP status code 404. Note also that authentication and authorization restrictions apply, so clients need to be authenticated with a valid token and have appropriate rights to be able to successfully apply this method.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String id = "id_example"; // String | ID of the task which is to be cancelled.
String subjectid = "subjectid_example"; // String | 
try {
    apiInstance.deleteTask(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#deleteTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the task which is to be cancelled. |
 **subjectid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTask"></a>
# **getTask**
> getTask(id, subjectid)

Finds Task by Id

Finds specified Task

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String id = "id_example"; // String | ID of the task to be retrieved
String subjectid = "subjectid_example"; // String | Authorization token
try {
    apiInstance.getTask(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the task to be retrieved |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="listTasks"></a>
# **listTasks**
> listTasks(subjectid, status, start, max)

Finds all Tasks

Finds all Tasks from Jaqpot Dataset. One may specify various search criteria such as the task creator of the task status.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String subjectid = "subjectid_example"; // String | Authorization token
String status = "status_example"; // String | Status of the task
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max - the server imposes an upper limit of 500 on this parameter.
try {
    apiInstance.listTasks(subjectid, status, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#listTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Authorization token | [optional]
 **status** | **String**| Status of the task | [optional] [enum: RUNNING, QUEUED, COMPLETED, ERROR, CANCELLED, REJECTED]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max - the server imposes an upper limit of 500 on this parameter. | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="poll"></a>
# **poll**
> Task poll(id, subjectid)

Poll Task by Id

Implements long polling

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Authorization token
try {
    Task result = apiInstance.poll(id, subjectid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#poll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Authorization token | [optional]

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

