# jaqpot-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

<!--### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others-->

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/jaqpot-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import jaqpot.client.*;
import jaqpot.client.auth.*;
import jaqpot.client.model.*;
import jaqpot.client.api.AaApi;

import java.io.File;
import java.util.*;

public class AaApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://test.jaqpot.org:8081/jaqpot/services*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AaApi* | [**authorize**](docs/AaApi.md#authorize) | **POST** /aa/authorize | Requests authorization from SSO
*AaApi* | [**login**](docs/AaApi.md#login) | **POST** /aa/login | Creates Security Token
*AaApi* | [**logout**](docs/AaApi.md#logout) | **POST** /aa/logout | Logs out a user
*AaApi* | [**validate**](docs/AaApi.md#validate) | **POST** /aa/validate | Validate authorization token
*AlgorithmApi* | [**createAlgorithm**](docs/AlgorithmApi.md#createAlgorithm) | **POST** /algorithm | Creates Algorithm
*AlgorithmApi* | [**deleteAlgorithm**](docs/AlgorithmApi.md#deleteAlgorithm) | **DELETE** /algorithm/{id} | Unregisters an algorithm of given ID
*AlgorithmApi* | [**getAlgorithm**](docs/AlgorithmApi.md#getAlgorithm) | **GET** /algorithm/{id} | Finds Algorithm
*AlgorithmApi* | [**getAlgorithms**](docs/AlgorithmApi.md#getAlgorithms) | **GET** /algorithm | Finds all Algorithms
*AlgorithmApi* | [**modifyAlgorithm**](docs/AlgorithmApi.md#modifyAlgorithm) | **PATCH** /algorithm/{id} | Modifies a particular Algorithm resource
*AlgorithmApi* | [**trainModel**](docs/AlgorithmApi.md#trainModel) | **POST** /algorithm/{id} | Creates Model
*BibtexApi* | [**createBibTeX**](docs/BibtexApi.md#createBibTeX) | **POST** /bibtex | Creates a new BibTeX entry
*BibtexApi* | [**createBibTeXGivenID**](docs/BibtexApi.md#createBibTeXGivenID) | **PUT** /bibtex/{id} | Places a new BibTeX entry at a particular URI
*BibtexApi* | [**deleteBibTeX**](docs/BibtexApi.md#deleteBibTeX) | **DELETE** /bibtex/{id} | Deletes a particular BibTeX resource
*BibtexApi* | [**getBibTeX**](docs/BibtexApi.md#getBibTeX) | **GET** /bibtex/{id} | Returns BibTeX entry
*BibtexApi* | [**listBibTeXs**](docs/BibtexApi.md#listBibTeXs) | **GET** /bibtex | Finds all BibTeX entries
*BibtexApi* | [**modifyBibTeX**](docs/BibtexApi.md#modifyBibTeX) | **PATCH** /bibtex/{id} | Modifies a particular BibTeX resource
*DatasetApi* | [**createDataset**](docs/DatasetApi.md#createDataset) | **POST** /dataset | Creates a new Dataset
*DatasetApi* | [**createEmptyDataset**](docs/DatasetApi.md#createEmptyDataset) | **POST** /dataset/empty | Creates a new empty Dataset
*DatasetApi* | [**createQPRFReport**](docs/DatasetApi.md#createQPRFReport) | **POST** /dataset/{id}/qprf | Creates QPRF Report
*DatasetApi* | [**createQPRFReportDummy**](docs/DatasetApi.md#createQPRFReportDummy) | **POST** /dataset/{id}/qprf-dummy | Creates QPRF Report
*DatasetApi* | [**deleteDataset**](docs/DatasetApi.md#deleteDataset) | **DELETE** /dataset/{id} | Deletes dataset
*DatasetApi* | [**getDataset**](docs/DatasetApi.md#getDataset) | **GET** /dataset/{id} | Finds Dataset by Id
*DatasetApi* | [**getDatasetFeatures**](docs/DatasetApi.md#getDatasetFeatures) | **GET** /dataset/{id}/features | Finds Dataset by Id
*DatasetApi* | [**getDatasetMeta**](docs/DatasetApi.md#getDatasetMeta) | **GET** /dataset/{id}/meta | Finds Dataset by Id
*DatasetApi* | [**listDatasets**](docs/DatasetApi.md#listDatasets) | **GET** /dataset | Finds all Datasets
*DatasetApi* | [**listFeaturedDatasets**](docs/DatasetApi.md#listFeaturedDatasets) | **GET** /dataset/featured | Finds all Datasets
*DatasetApi* | [**mergeDatasets**](docs/DatasetApi.md#mergeDatasets) | **POST** /dataset/merge | Merges Datasets
*DoseresponseApi* | [**doseResponse**](docs/DoseresponseApi.md#doseResponse) | **POST** /doseresponse | Creates Dose Response Report
*EnmApi* | [**createBundle**](docs/EnmApi.md#createBundle) | **POST** /enm/bundle | Creates Bundle
*EnmApi* | [**createDatasetByStudies**](docs/EnmApi.md#createDatasetByStudies) | **POST** /enm/dataset | Creates Dataset
*EnmApi* | [**getDescriptorCategories**](docs/EnmApi.md#getDescriptorCategories) | **GET** /enm/descriptor/categories | Retrieves descriptor calculation categories
*EnmApi* | [**getPropertyCategories**](docs/EnmApi.md#getPropertyCategories) | **GET** /enm/property/categories | Retrieves property categories
*FeatureApi* | [**createFeature**](docs/FeatureApi.md#createFeature) | **POST** /feature | Creates a new Feature
*FeatureApi* | [**deleteFeature**](docs/FeatureApi.md#deleteFeature) | **DELETE** /feature/{id} | Deletes a particular Feature resource.
*FeatureApi* | [**getFeature**](docs/FeatureApi.md#getFeature) | **GET** /feature/{id} | Finds Feature by ID
*FeatureApi* | [**listFeatures**](docs/FeatureApi.md#listFeatures) | **GET** /feature | Lists features
*FeatureApi* | [**putFeature**](docs/FeatureApi.md#putFeature) | **PUT** /feature/{id} | Places a new Feature at a particular URI
*InterlabApi* | [**interLabTest**](docs/InterlabApi.md#interLabTest) | **POST** /interlab/test | Creates Interlab Testing Report
*ModelApi* | [**deleteModel**](docs/ModelApi.md#deleteModel) | **DELETE** /model/{id} | Deletes a particular Model resource
*ModelApi* | [**getModel**](docs/ModelApi.md#getModel) | **GET** /model/{id} | Finds Model by Id
*ModelApi* | [**getModelPmml**](docs/ModelApi.md#getModelPmml) | **GET** /model/{id}/pmml | Finds Model by Id
*ModelApi* | [**listFeaturedModels**](docs/ModelApi.md#listFeaturedModels) | **GET** /model/featured | Finds all Models
*ModelApi* | [**listModelDependentFeatures**](docs/ModelApi.md#listModelDependentFeatures) | **GET** /model/{id}/dependent | Lists the dependent features of a Model
*ModelApi* | [**listModelIndependentFeatures**](docs/ModelApi.md#listModelIndependentFeatures) | **GET** /model/{id}/independent | Lists the independent features of a Model
*ModelApi* | [**listModelPredictedFeatures**](docs/ModelApi.md#listModelPredictedFeatures) | **GET** /model/{id}/predicted | Lists the dependent features of a Model
*ModelApi* | [**listModelRequiredFeatures**](docs/ModelApi.md#listModelRequiredFeatures) | **GET** /model/{id}/required | Lists the required features of a Model
*ModelApi* | [**listModels**](docs/ModelApi.md#listModels) | **GET** /model | Finds all Models
*ModelApi* | [**makePrediction**](docs/ModelApi.md#makePrediction) | **POST** /model/{id} | Creates Prediction
*PmmlApi* | [**createPMML**](docs/PmmlApi.md#createPMML) | **POST** /pmml | Creates a new PMML entry
*PmmlApi* | [**createPMMLSelection**](docs/PmmlApi.md#createPMMLSelection) | **POST** /pmml/selection | Creates a new PMML entry
*PmmlApi* | [**getPmml**](docs/PmmlApi.md#getPmml) | **GET** /pmml/{id} | Returns PMML entry
*PmmlApi* | [**listPmml**](docs/PmmlApi.md#listPmml) | **GET** /pmml | Finds all PMML entries
*ReadacrossApi* | [**interLabTestReadAcross**](docs/ReadacrossApi.md#interLabTestReadAcross) | **POST** /readacross | Creates Read Across Report
*ReportApi* | [**createPDF**](docs/ReportApi.md#createPDF) | **GET** /report/{id}/pdf | Creates PDF from report
*ReportApi* | [**getReport**](docs/ReportApi.md#getReport) | **GET** /report/{id} | Retrieves Report by id
*ReportApi* | [**getReports**](docs/ReportApi.md#getReports) | **GET** /report | Retrieves Reports of User
*ReportApi* | [**modifyReport**](docs/ReportApi.md#modifyReport) | **PATCH** /report/{id} | Modifies a particular Report resource
*ReportApi* | [**removeReport**](docs/ReportApi.md#removeReport) | **DELETE** /report/{id} | Removes Report by id
*TaskApi* | [**deleteTask**](docs/TaskApi.md#deleteTask) | **DELETE** /task/{id} | Deletes a Task of given ID
*TaskApi* | [**getTask**](docs/TaskApi.md#getTask) | **GET** /task/{id} | Finds Task by Id
*TaskApi* | [**listTasks**](docs/TaskApi.md#listTasks) | **GET** /task | Finds all Tasks
*TaskApi* | [**poll**](docs/TaskApi.md#poll) | **GET** /task/{id}/poll | Poll Task by Id
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /user/{id} | Finds User by Id
*UserApi* | [**getUserQuota**](docs/UserApi.md#getUserQuota) | **GET** /user/{id}/quota | Retrieves user&#39;s quota
*UserApi* | [**listUsers**](docs/UserApi.md#listUsers) | **GET** /user | Lists all Users (admins only)
*ValidationApi* | [**crossValidateAlgorithm**](docs/ValidationApi.md#crossValidateAlgorithm) | **POST** /validation/training_test_cross | Creates Validation Report
*ValidationApi* | [**externalValidateAlgorithm**](docs/ValidationApi.md#externalValidateAlgorithm) | **POST** /validation/test_set_validation | Creates Validation Report
*ValidationApi* | [**splitValidateAlgorithm**](docs/ValidationApi.md#splitValidateAlgorithm) | **POST** /validation/training_test_split | Creates Validation Report


## Documentation for Models

 - [Algorithm](docs/Algorithm.md)
 - [ArrayCalculation](docs/ArrayCalculation.md)
 - [BibTeX](docs/BibTeX.md)
 - [BundleData](docs/BundleData.md)
 - [DataEntry](docs/DataEntry.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetData](docs/DatasetData.md)
 - [ErrorReport](docs/ErrorReport.md)
 - [Feature](docs/Feature.md)
 - [FeatureInfo](docs/FeatureInfo.md)
 - [MetaInfo](docs/MetaInfo.md)
 - [Model](docs/Model.md)
 - [Parameter](docs/Parameter.md)
 - [Pmml](docs/Pmml.md)
 - [Report](docs/Report.md)
 - [Substance](docs/Substance.md)
 - [Task](docs/Task.md)
 - [User](docs/User.md)
 - [UserQuota](docs/UserQuota.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### subjectid

- **Type**: API key
- **API key parameter name**: subjectid
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hampos@me.com

