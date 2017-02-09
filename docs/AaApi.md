# AaApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](AaApi.md#authorize) | **POST** /aa/authorize | Requests authorization from SSO
[**login**](AaApi.md#login) | **POST** /aa/login | Creates Security Token
[**logout**](AaApi.md#logout) | **POST** /aa/logout | Logs out a user
[**validate**](AaApi.md#validate) | **POST** /aa/validate | Validate authorization token


<a name="authorize"></a>
# **authorize**
> authorize(subjectid, method, uri)

Requests authorization from SSO

Checks whether the client identified by the provided AA token can apply a method to a URI

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AaApi;


AaApi apiInstance = new AaApi();
String subjectid = "subjectid_example"; // String | 
String method = "GET"; // String | HTTP method
String uri = "uri_example"; // String | URI
try {
    apiInstance.authorize(subjectid, method, uri);
} catch (ApiException e) {
    System.err.println("Exception when calling AaApi#authorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**|  | [optional]
 **method** | **String**| HTTP method | [optional] [default to GET] [enum: GET, POST, PUT, DELETE]
 **uri** | **String**| URI | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> login(username, password)

Creates Security Token

Uses OpenAM server to get a security token.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AaApi;


AaApi apiInstance = new AaApi();
String username = "username_example"; // String | Username
String password = "password_example"; // String | Password
try {
    apiInstance.login(username, password);
} catch (ApiException e) {
    System.err.println("Exception when calling AaApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username | [optional]
 **password** | **String**| Password | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout(subjectid)

Logs out a user

Invalidates a security token and logs out the corresponding user

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AaApi;


AaApi apiInstance = new AaApi();
String subjectid = "subjectid_example"; // String | 
try {
    apiInstance.logout(subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling AaApi#logout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="validate"></a>
# **validate**
> validate(subjectid)

Validate authorization token

Checks whether an authorization token is valid

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.AaApi;


AaApi apiInstance = new AaApi();
String subjectid = "subjectid_example"; // String | 
try {
    apiInstance.validate(subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling AaApi#validate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectid** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

