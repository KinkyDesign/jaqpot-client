/*
 * Jaqpot API
 * Jaqpot v4 (Quattro) is the 4th version of a YAQP, a RESTful web service which can be used to train machine learning models and use them to obtain toxicological predictions for given chemical compounds or engineered nano materials. The project is written in Java8 and JEE7.
 *
 * OpenAPI spec version: 4.0.3
 * Contact: hampos@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package jaqpot.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class Model {
  @SerializedName("meta")
  private MetaInfo meta = null;

  @SerializedName("ontologicalClasses")
  private List<String> ontologicalClasses = new ArrayList<String>();

  @SerializedName("visible")
  private Boolean visible = false;

  @SerializedName("temporary")
  private Boolean temporary = false;

  @SerializedName("featured")
  private Boolean featured = false;

  @SerializedName("dependentFeatures")
  private List<String> dependentFeatures = new ArrayList<String>();

  @SerializedName("independentFeatures")
  private List<String> independentFeatures = new ArrayList<String>();

  @SerializedName("predictedFeatures")
  private List<String> predictedFeatures = new ArrayList<String>();

  @SerializedName("reliability")
  private Integer reliability = null;

  @SerializedName("datasetUri")
  private String datasetUri = null;

  @SerializedName("parameters")
  private Map<String, Object> parameters = new HashMap<String, Object>();

  @SerializedName("algorithm")
  private Algorithm algorithm = null;

  @SerializedName("bibtex")
  private BibTeX bibtex = null;

  @SerializedName("actualModel")
  private Object actualModel = null;

  @SerializedName("pmmlModel")
  private Object pmmlModel = null;

  @SerializedName("additionalInfo")
  private Object additionalInfo = null;

  @SerializedName("pmmlTransformations")
  private String pmmlTransformations = null;

  @SerializedName("doaModel")
  private String doaModel = null;

  @SerializedName("transformationModels")
  private List<String> transformationModels = new ArrayList<String>();

  @SerializedName("linkedModels")
  private List<String> linkedModels = new ArrayList<String>();

  @SerializedName("_id")
  private String id = null;

  public Model meta(MetaInfo meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetaInfo getMeta() {
    return meta;
  }

  public void setMeta(MetaInfo meta) {
    this.meta = meta;
  }

  public Model ontologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
    return this;
  }

  public Model addOntologicalClassesItem(String ontologicalClassesItem) {
    this.ontologicalClasses.add(ontologicalClassesItem);
    return this;
  }

   /**
   * Get ontologicalClasses
   * @return ontologicalClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getOntologicalClasses() {
    return ontologicalClasses;
  }

  public void setOntologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
  }

  public Model visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Model temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Get temporary
   * @return temporary
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public Model featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Model dependentFeatures(List<String> dependentFeatures) {
    this.dependentFeatures = dependentFeatures;
    return this;
  }

  public Model addDependentFeaturesItem(String dependentFeaturesItem) {
    this.dependentFeatures.add(dependentFeaturesItem);
    return this;
  }

   /**
   * Get dependentFeatures
   * @return dependentFeatures
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getDependentFeatures() {
    return dependentFeatures;
  }

  public void setDependentFeatures(List<String> dependentFeatures) {
    this.dependentFeatures = dependentFeatures;
  }

  public Model independentFeatures(List<String> independentFeatures) {
    this.independentFeatures = independentFeatures;
    return this;
  }

  public Model addIndependentFeaturesItem(String independentFeaturesItem) {
    this.independentFeatures.add(independentFeaturesItem);
    return this;
  }

   /**
   * Get independentFeatures
   * @return independentFeatures
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getIndependentFeatures() {
    return independentFeatures;
  }

  public void setIndependentFeatures(List<String> independentFeatures) {
    this.independentFeatures = independentFeatures;
  }

  public Model predictedFeatures(List<String> predictedFeatures) {
    this.predictedFeatures = predictedFeatures;
    return this;
  }

  public Model addPredictedFeaturesItem(String predictedFeaturesItem) {
    this.predictedFeatures.add(predictedFeaturesItem);
    return this;
  }

   /**
   * Get predictedFeatures
   * @return predictedFeatures
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPredictedFeatures() {
    return predictedFeatures;
  }

  public void setPredictedFeatures(List<String> predictedFeatures) {
    this.predictedFeatures = predictedFeatures;
  }

  public Model reliability(Integer reliability) {
    this.reliability = reliability;
    return this;
  }

   /**
   * Get reliability
   * @return reliability
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getReliability() {
    return reliability;
  }

  public void setReliability(Integer reliability) {
    this.reliability = reliability;
  }

  public Model datasetUri(String datasetUri) {
    this.datasetUri = datasetUri;
    return this;
  }

   /**
   * Get datasetUri
   * @return datasetUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDatasetUri() {
    return datasetUri;
  }

  public void setDatasetUri(String datasetUri) {
    this.datasetUri = datasetUri;
  }

  public Model parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Model putParametersItem(String key, Object parametersItem) {
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  public Model algorithm(Algorithm algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @ApiModelProperty(example = "null", value = "")
  public Algorithm getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(Algorithm algorithm) {
    this.algorithm = algorithm;
  }

  public Model bibtex(BibTeX bibtex) {
    this.bibtex = bibtex;
    return this;
  }

   /**
   * Get bibtex
   * @return bibtex
  **/
  @ApiModelProperty(example = "null", value = "")
  public BibTeX getBibtex() {
    return bibtex;
  }

  public void setBibtex(BibTeX bibtex) {
    this.bibtex = bibtex;
  }

  public Model actualModel(Object actualModel) {
    this.actualModel = actualModel;
    return this;
  }

   /**
   * Get actualModel
   * @return actualModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getActualModel() {
    return actualModel;
  }

  public void setActualModel(Object actualModel) {
    this.actualModel = actualModel;
  }

  public Model pmmlModel(Object pmmlModel) {
    this.pmmlModel = pmmlModel;
    return this;
  }

   /**
   * Get pmmlModel
   * @return pmmlModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getPmmlModel() {
    return pmmlModel;
  }

  public void setPmmlModel(Object pmmlModel) {
    this.pmmlModel = pmmlModel;
  }

  public Model additionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Model pmmlTransformations(String pmmlTransformations) {
    this.pmmlTransformations = pmmlTransformations;
    return this;
  }

   /**
   * Get pmmlTransformations
   * @return pmmlTransformations
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPmmlTransformations() {
    return pmmlTransformations;
  }

  public void setPmmlTransformations(String pmmlTransformations) {
    this.pmmlTransformations = pmmlTransformations;
  }

  public Model doaModel(String doaModel) {
    this.doaModel = doaModel;
    return this;
  }

   /**
   * Get doaModel
   * @return doaModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDoaModel() {
    return doaModel;
  }

  public void setDoaModel(String doaModel) {
    this.doaModel = doaModel;
  }

  public Model transformationModels(List<String> transformationModels) {
    this.transformationModels = transformationModels;
    return this;
  }

  public Model addTransformationModelsItem(String transformationModelsItem) {
    this.transformationModels.add(transformationModelsItem);
    return this;
  }

   /**
   * Get transformationModels
   * @return transformationModels
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTransformationModels() {
    return transformationModels;
  }

  public void setTransformationModels(List<String> transformationModels) {
    this.transformationModels = transformationModels;
  }

  public Model linkedModels(List<String> linkedModels) {
    this.linkedModels = linkedModels;
    return this;
  }

  public Model addLinkedModelsItem(String linkedModelsItem) {
    this.linkedModels.add(linkedModelsItem);
    return this;
  }

   /**
   * Get linkedModels
   * @return linkedModels
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLinkedModels() {
    return linkedModels;
  }

  public void setLinkedModels(List<String> linkedModels) {
    this.linkedModels = linkedModels;
  }

  public Model id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.meta, model.meta) &&
        Objects.equals(this.ontologicalClasses, model.ontologicalClasses) &&
        Objects.equals(this.visible, model.visible) &&
        Objects.equals(this.temporary, model.temporary) &&
        Objects.equals(this.featured, model.featured) &&
        Objects.equals(this.dependentFeatures, model.dependentFeatures) &&
        Objects.equals(this.independentFeatures, model.independentFeatures) &&
        Objects.equals(this.predictedFeatures, model.predictedFeatures) &&
        Objects.equals(this.reliability, model.reliability) &&
        Objects.equals(this.datasetUri, model.datasetUri) &&
        Objects.equals(this.parameters, model.parameters) &&
        Objects.equals(this.algorithm, model.algorithm) &&
        Objects.equals(this.bibtex, model.bibtex) &&
        Objects.equals(this.actualModel, model.actualModel) &&
        Objects.equals(this.pmmlModel, model.pmmlModel) &&
        Objects.equals(this.additionalInfo, model.additionalInfo) &&
        Objects.equals(this.pmmlTransformations, model.pmmlTransformations) &&
        Objects.equals(this.doaModel, model.doaModel) &&
        Objects.equals(this.transformationModels, model.transformationModels) &&
        Objects.equals(this.linkedModels, model.linkedModels) &&
        Objects.equals(this.id, model.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ontologicalClasses, visible, temporary, featured, dependentFeatures, independentFeatures, predictedFeatures, reliability, datasetUri, parameters, algorithm, bibtex, actualModel, pmmlModel, additionalInfo, pmmlTransformations, doaModel, transformationModels, linkedModels, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ontologicalClasses: ").append(toIndentedString(ontologicalClasses)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    dependentFeatures: ").append(toIndentedString(dependentFeatures)).append("\n");
    sb.append("    independentFeatures: ").append(toIndentedString(independentFeatures)).append("\n");
    sb.append("    predictedFeatures: ").append(toIndentedString(predictedFeatures)).append("\n");
    sb.append("    reliability: ").append(toIndentedString(reliability)).append("\n");
    sb.append("    datasetUri: ").append(toIndentedString(datasetUri)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    bibtex: ").append(toIndentedString(bibtex)).append("\n");
    sb.append("    actualModel: ").append(toIndentedString(actualModel)).append("\n");
    sb.append("    pmmlModel: ").append(toIndentedString(pmmlModel)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    pmmlTransformations: ").append(toIndentedString(pmmlTransformations)).append("\n");
    sb.append("    doaModel: ").append(toIndentedString(doaModel)).append("\n");
    sb.append("    transformationModels: ").append(toIndentedString(transformationModels)).append("\n");
    sb.append("    linkedModels: ").append(toIndentedString(linkedModels)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
