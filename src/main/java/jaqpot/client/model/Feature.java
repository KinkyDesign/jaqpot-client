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
 * Feature
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class Feature {
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

  @SerializedName("units")
  private String units = null;

  @SerializedName("predictorFor")
  private String predictorFor = null;

  @SerializedName("admissibleValues")
  private List<String> admissibleValues = new ArrayList<String>();

  @SerializedName("_id")
  private String id = null;

  public Feature meta(MetaInfo meta) {
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

  public Feature ontologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
    return this;
  }

  public Feature addOntologicalClassesItem(String ontologicalClassesItem) {
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

  public Feature visible(Boolean visible) {
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

  public Feature temporary(Boolean temporary) {
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

  public Feature featured(Boolean featured) {
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

  public Feature units(String units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }

  public Feature predictorFor(String predictorFor) {
    this.predictorFor = predictorFor;
    return this;
  }

   /**
   * Get predictorFor
   * @return predictorFor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPredictorFor() {
    return predictorFor;
  }

  public void setPredictorFor(String predictorFor) {
    this.predictorFor = predictorFor;
  }

  public Feature admissibleValues(List<String> admissibleValues) {
    this.admissibleValues = admissibleValues;
    return this;
  }

  public Feature addAdmissibleValuesItem(String admissibleValuesItem) {
    this.admissibleValues.add(admissibleValuesItem);
    return this;
  }

   /**
   * Get admissibleValues
   * @return admissibleValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAdmissibleValues() {
    return admissibleValues;
  }

  public void setAdmissibleValues(List<String> admissibleValues) {
    this.admissibleValues = admissibleValues;
  }

  public Feature id(String id) {
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
    Feature feature = (Feature) o;
    return Objects.equals(this.meta, feature.meta) &&
        Objects.equals(this.ontologicalClasses, feature.ontologicalClasses) &&
        Objects.equals(this.visible, feature.visible) &&
        Objects.equals(this.temporary, feature.temporary) &&
        Objects.equals(this.featured, feature.featured) &&
        Objects.equals(this.units, feature.units) &&
        Objects.equals(this.predictorFor, feature.predictorFor) &&
        Objects.equals(this.admissibleValues, feature.admissibleValues) &&
        Objects.equals(this.id, feature.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ontologicalClasses, visible, temporary, featured, units, predictorFor, admissibleValues, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ontologicalClasses: ").append(toIndentedString(ontologicalClasses)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    predictorFor: ").append(toIndentedString(predictorFor)).append("\n");
    sb.append("    admissibleValues: ").append(toIndentedString(admissibleValues)).append("\n");
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

