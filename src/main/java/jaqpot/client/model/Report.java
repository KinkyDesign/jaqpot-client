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
 * Report
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class Report {
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

  @SerializedName("singleCalculations")
  private Map<String, Object> singleCalculations = new HashMap<String, Object>();

  @SerializedName("arrayCalculations")
  private Map<String, ArrayCalculation> arrayCalculations = new HashMap<String, ArrayCalculation>();

  @SerializedName("figures")
  private Map<String, String> figures = new HashMap<String, String>();

  @SerializedName("_id")
  private String id = null;

  public Report meta(MetaInfo meta) {
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

  public Report ontologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
    return this;
  }

  public Report addOntologicalClassesItem(String ontologicalClassesItem) {
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

  public Report visible(Boolean visible) {
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

  public Report temporary(Boolean temporary) {
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

  public Report featured(Boolean featured) {
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

  public Report singleCalculations(Map<String, Object> singleCalculations) {
    this.singleCalculations = singleCalculations;
    return this;
  }

  public Report putSingleCalculationsItem(String key, Object singleCalculationsItem) {
    this.singleCalculations.put(key, singleCalculationsItem);
    return this;
  }

   /**
   * Get singleCalculations
   * @return singleCalculations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getSingleCalculations() {
    return singleCalculations;
  }

  public void setSingleCalculations(Map<String, Object> singleCalculations) {
    this.singleCalculations = singleCalculations;
  }

  public Report arrayCalculations(Map<String, ArrayCalculation> arrayCalculations) {
    this.arrayCalculations = arrayCalculations;
    return this;
  }

  public Report putArrayCalculationsItem(String key, ArrayCalculation arrayCalculationsItem) {
    this.arrayCalculations.put(key, arrayCalculationsItem);
    return this;
  }

   /**
   * Get arrayCalculations
   * @return arrayCalculations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ArrayCalculation> getArrayCalculations() {
    return arrayCalculations;
  }

  public void setArrayCalculations(Map<String, ArrayCalculation> arrayCalculations) {
    this.arrayCalculations = arrayCalculations;
  }

  public Report figures(Map<String, String> figures) {
    this.figures = figures;
    return this;
  }

  public Report putFiguresItem(String key, String figuresItem) {
    this.figures.put(key, figuresItem);
    return this;
  }

   /**
   * Get figures
   * @return figures
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getFigures() {
    return figures;
  }

  public void setFigures(Map<String, String> figures) {
    this.figures = figures;
  }

  public Report id(String id) {
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
    Report report = (Report) o;
    return Objects.equals(this.meta, report.meta) &&
        Objects.equals(this.ontologicalClasses, report.ontologicalClasses) &&
        Objects.equals(this.visible, report.visible) &&
        Objects.equals(this.temporary, report.temporary) &&
        Objects.equals(this.featured, report.featured) &&
        Objects.equals(this.singleCalculations, report.singleCalculations) &&
        Objects.equals(this.arrayCalculations, report.arrayCalculations) &&
        Objects.equals(this.figures, report.figures) &&
        Objects.equals(this.id, report.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ontologicalClasses, visible, temporary, featured, singleCalculations, arrayCalculations, figures, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ontologicalClasses: ").append(toIndentedString(ontologicalClasses)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    singleCalculations: ").append(toIndentedString(singleCalculations)).append("\n");
    sb.append("    arrayCalculations: ").append(toIndentedString(arrayCalculations)).append("\n");
    sb.append("    figures: ").append(toIndentedString(figures)).append("\n");
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

