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
import java.util.List;

/**
 * Algorithm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class Algorithm {
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

  @SerializedName("parameters")
  private List<Parameter> parameters = new ArrayList<Parameter>();

  @SerializedName("ranking")
  private Integer ranking = null;

  @SerializedName("bibtex")
  private List<BibTeX> bibtex = new ArrayList<BibTeX>();

  @SerializedName("trainingService")
  private String trainingService = null;

  @SerializedName("predictionService")
  private String predictionService = null;

  @SerializedName("reportService")
  private String reportService = null;

  @SerializedName("_id")
  private String id = null;

  public Algorithm meta(MetaInfo meta) {
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

  public Algorithm ontologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
    return this;
  }

  public Algorithm addOntologicalClassesItem(String ontologicalClassesItem) {
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

  public Algorithm visible(Boolean visible) {
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

  public Algorithm temporary(Boolean temporary) {
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

  public Algorithm featured(Boolean featured) {
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

  public Algorithm parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Algorithm addParametersItem(Parameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  public Algorithm ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }

   /**
   * Get ranking
   * @return ranking
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  public Algorithm bibtex(List<BibTeX> bibtex) {
    this.bibtex = bibtex;
    return this;
  }

  public Algorithm addBibtexItem(BibTeX bibtexItem) {
    this.bibtex.add(bibtexItem);
    return this;
  }

   /**
   * Get bibtex
   * @return bibtex
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BibTeX> getBibtex() {
    return bibtex;
  }

  public void setBibtex(List<BibTeX> bibtex) {
    this.bibtex = bibtex;
  }

  public Algorithm trainingService(String trainingService) {
    this.trainingService = trainingService;
    return this;
  }

   /**
   * Get trainingService
   * @return trainingService
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrainingService() {
    return trainingService;
  }

  public void setTrainingService(String trainingService) {
    this.trainingService = trainingService;
  }

  public Algorithm predictionService(String predictionService) {
    this.predictionService = predictionService;
    return this;
  }

   /**
   * Get predictionService
   * @return predictionService
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPredictionService() {
    return predictionService;
  }

  public void setPredictionService(String predictionService) {
    this.predictionService = predictionService;
  }

  public Algorithm reportService(String reportService) {
    this.reportService = reportService;
    return this;
  }

   /**
   * Get reportService
   * @return reportService
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReportService() {
    return reportService;
  }

  public void setReportService(String reportService) {
    this.reportService = reportService;
  }

  public Algorithm id(String id) {
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
    Algorithm algorithm = (Algorithm) o;
    return Objects.equals(this.meta, algorithm.meta) &&
        Objects.equals(this.ontologicalClasses, algorithm.ontologicalClasses) &&
        Objects.equals(this.visible, algorithm.visible) &&
        Objects.equals(this.temporary, algorithm.temporary) &&
        Objects.equals(this.featured, algorithm.featured) &&
        Objects.equals(this.parameters, algorithm.parameters) &&
        Objects.equals(this.ranking, algorithm.ranking) &&
        Objects.equals(this.bibtex, algorithm.bibtex) &&
        Objects.equals(this.trainingService, algorithm.trainingService) &&
        Objects.equals(this.predictionService, algorithm.predictionService) &&
        Objects.equals(this.reportService, algorithm.reportService) &&
        Objects.equals(this.id, algorithm.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ontologicalClasses, visible, temporary, featured, parameters, ranking, bibtex, trainingService, predictionService, reportService, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Algorithm {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ontologicalClasses: ").append(toIndentedString(ontologicalClasses)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    bibtex: ").append(toIndentedString(bibtex)).append("\n");
    sb.append("    trainingService: ").append(toIndentedString(trainingService)).append("\n");
    sb.append("    predictionService: ").append(toIndentedString(predictionService)).append("\n");
    sb.append("    reportService: ").append(toIndentedString(reportService)).append("\n");
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

