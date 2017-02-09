# BibtexApi

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBibTeX**](BibtexApi.md#createBibTeX) | **POST** /bibtex | Creates a new BibTeX entry
[**createBibTeXGivenID**](BibtexApi.md#createBibTeXGivenID) | **PUT** /bibtex/{id} | Places a new BibTeX entry at a particular URI
[**deleteBibTeX**](BibtexApi.md#deleteBibTeX) | **DELETE** /bibtex/{id} | Deletes a particular BibTeX resource
[**getBibTeX**](BibtexApi.md#getBibTeX) | **GET** /bibtex/{id} | Returns BibTeX entry
[**listBibTeXs**](BibtexApi.md#listBibTeXs) | **GET** /bibtex | Finds all BibTeX entries
[**modifyBibTeX**](BibtexApi.md#modifyBibTeX) | **PATCH** /bibtex/{id} | Modifies a particular BibTeX resource


<a name="createBibTeX"></a>
# **createBibTeX**
> createBibTeX(body, subjectid)

Creates a new BibTeX entry

Creates a new BibTeX entry which is assigned a random unique ID. Clients are not allowed to specify a custom ID when using this method. Clients should use PUT instead in such a case.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
BibTeX body = new BibTeX(); // BibTeX | BibTeX in JSON representation compliant with the BibTeX specifications. Malformed BibTeX entries with missing fields will not be accepted.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.createBibTeX(body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#createBibTeX");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BibTeX**](BibTeX.md)| BibTeX in JSON representation compliant with the BibTeX specifications. Malformed BibTeX entries with missing fields will not be accepted. |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

<a name="createBibTeXGivenID"></a>
# **createBibTeXGivenID**
> createBibTeXGivenID(id, body, subjectid)

Places a new BibTeX entry at a particular URI

Creates a new BibTeX entry at the specified URI. If a BibTeX already exists at this URI,it will be replaced. If, instead, no BibTeX is stored under the specified URI, a new BibTeX entry will be created. Notice that authentication, authorization and accounting (quota) restrictions may apply.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
String id = "id_example"; // String | ID of the BibTeX.
BibTeX body = new BibTeX(); // BibTeX | BibTeX in JSON
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.createBibTeXGivenID(id, body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#createBibTeXGivenID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the BibTeX. |
 **body** | [**BibTeX**](BibTeX.md)| BibTeX in JSON |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/uri-list

<a name="deleteBibTeX"></a>
# **deleteBibTeX**
> deleteBibTeX(id, subjectid)

Deletes a particular BibTeX resource

Deletes a BibTeX resource of a given ID. The method is idempondent, that is, it can be used more than once without triggering an exception/error. If the BibTeX does not exist, the method will return without errors. Authentication and authorization requirements apply, so clients that are not authenticated with a valid token or do not have sufficient priviledges will not be able to delete a BibTeX using this method.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
String id = "id_example"; // String | ID of the BibTeX.
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.deleteBibTeX(id, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#deleteBibTeX");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the BibTeX. |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="getBibTeX"></a>
# **getBibTeX**
> getBibTeX(id)

Returns BibTeX entry

Finds and returns a BibTeX by ID

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
String id = "id_example"; // String | ID of the BibTeX
try {
    apiInstance.getBibTeX(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#getBibTeX");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the BibTeX |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="listBibTeXs"></a>
# **listBibTeXs**
> listBibTeXs(bibtype, creator, query, start, max)

Finds all BibTeX entries

Finds all BibTeX entries in the DB of Jaqpot and returns them in a list

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
String bibtype = "Entry"; // String | BibTeX type of entry
String creator = "creator_example"; // String | Creator of the BibTeX entry
String query = "query_example"; // String | Generic query (e.g., Article title, journal name, etc)
Integer start = 0; // Integer | start
Integer max = 10; // Integer | max
try {
    apiInstance.listBibTeXs(bibtype, creator, query, start, max);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#listBibTeXs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bibtype** | **String**| BibTeX type of entry | [optional] [default to Entry] [enum: Article, Conference, Book, PhDThesis, InBook, InCollection, InProceedings, Manual, Mastersthesis, Proceedings, TechReport, Unpublished, Entry]
 **creator** | **String**| Creator of the BibTeX entry | [optional]
 **query** | **String**| Generic query (e.g., Article title, journal name, etc) | [optional]
 **start** | **Integer**| start | [optional] [default to 0]
 **max** | **Integer**| max | [optional] [default to 10]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/uri-list

<a name="modifyBibTeX"></a>
# **modifyBibTeX**
> modifyBibTeX(id, body, subjectid)

Modifies a particular BibTeX resource

Modifies (applies a patch on) a BibTeX resource of a given ID. This implementation of PATCH follows the RFC 6902 proposed standard. See https://tools.ietf.org/rfc/rfc6902.txt for details.

### Example
```java
// Import classes:
//import jaqpot.client.ApiException;
//import jaqpot.client.api.BibtexApi;


BibtexApi apiInstance = new BibtexApi();
String id = "id_example"; // String | ID of an existing BibTeX.
String body = "body_example"; // String | The patch in JSON according to the RFC 6902 specs
String subjectid = "subjectid_example"; // String | Clients need to authenticate in order to create resources on the server
try {
    apiInstance.modifyBibTeX(id, body, subjectid);
} catch (ApiException e) {
    System.err.println("Exception when calling BibtexApi#modifyBibTeX");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of an existing BibTeX. |
 **body** | **String**| The patch in JSON according to the RFC 6902 specs |
 **subjectid** | **String**| Clients need to authenticate in order to create resources on the server | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json, text/uri-list

