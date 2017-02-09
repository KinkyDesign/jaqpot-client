# UserApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UserApi.md#getUser) | **GET** /user/{id} | Finds User by Id
[**getUserQuota**](UserApi.md#getUserQuota) | **GET** /user/{id}/quota | Retrieves user&#39;s quota
[**listUsers**](UserApi.md#listUsers) | **GET** /user | Lists all Users (admins only)


<a name="getUser"></a>
# **getUser**
> getUser(id, subjectid)

Finds User by Id

Finds specified user

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.UserApi;


UserApi apiInstance = new UserApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access this resource
try {
    apiInstance.getUser(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access this resource | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="getUserQuota"></a>
# **getUserQuota**
> getUserQuota(id, subjectid)

Retrieves user&#39;s quota

Returns user&#39;s quota given the user&#39;s ID. Authenicated users can access only their own quota. Jaqpot administrators can access the quota of all Jaqpot users.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.UserApi;


UserApi apiInstance = new UserApi();
String id = "id_example"; // String | 
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access this resource
try {
    apiInstance.getUserQuota(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **subjectid** | **String**| Clients need to authenticate in order to access this resource | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> listUsers(subjectid, start, max)

Lists all Users (admins only)

Lists all Users of Jaqpot Quattro. This operation can only be performed by the system administrators.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.UserApi;


UserApi apiInstance = new UserApi();
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to access models
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max
try {
    apiInstance.listUsers(subjectid, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#listUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**| Clients need to authenticate in order to access models | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

