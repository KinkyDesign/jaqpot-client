
# Task

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**MetaInfo**](MetaInfo.md) |  |  [optional]
**ontologicalClasses** | **List&lt;String&gt;** |  |  [optional]
**visible** | **Boolean** |  |  [optional]
**temporary** | **Boolean** |  |  [optional]
**featured** | **Boolean** |  |  [optional]
**resultUri** | **String** |  |  [optional]
**result** | **String** |  |  [optional]
**percentageCompleted** | **Float** |  |  [optional]
**errorReport** | [**ErrorReport**](ErrorReport.md) |  |  [optional]
**httpStatus** | **Integer** |  |  [optional]
**duration** | **Long** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRAINING | &quot;TRAINING&quot;
PREDICTION | &quot;PREDICTION&quot;
PREPARATION | &quot;PREPARATION&quot;
VALIDATION | &quot;VALIDATION&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
ERROR | &quot;ERROR&quot;
REJECTED | &quot;REJECTED&quot;
QUEUED | &quot;QUEUED&quot;



