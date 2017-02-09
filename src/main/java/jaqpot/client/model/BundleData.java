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
 * BundleData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class BundleData {
  @SerializedName("bundleId")
  private String bundleId = null;

  @SerializedName("bundleUri")
  private String bundleUri = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("substanceOwner")
  private String substanceOwner = null;

  @SerializedName("substances")
  private List<String> substances = new ArrayList<String>();

  @SerializedName("properties")
  private Map<String, List<String>> properties = new HashMap<String, List<String>>();

  public BundleData bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public BundleData bundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
    return this;
  }

   /**
   * Get bundleUri
   * @return bundleUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBundleUri() {
    return bundleUri;
  }

  public void setBundleUri(String bundleUri) {
    this.bundleUri = bundleUri;
  }

  public BundleData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BundleData substanceOwner(String substanceOwner) {
    this.substanceOwner = substanceOwner;
    return this;
  }

   /**
   * Get substanceOwner
   * @return substanceOwner
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubstanceOwner() {
    return substanceOwner;
  }

  public void setSubstanceOwner(String substanceOwner) {
    this.substanceOwner = substanceOwner;
  }

  public BundleData substances(List<String> substances) {
    this.substances = substances;
    return this;
  }

  public BundleData addSubstancesItem(String substancesItem) {
    this.substances.add(substancesItem);
    return this;
  }

   /**
   * Get substances
   * @return substances
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSubstances() {
    return substances;
  }

  public void setSubstances(List<String> substances) {
    this.substances = substances;
  }

  public BundleData properties(Map<String, List<String>> properties) {
    this.properties = properties;
    return this;
  }

  public BundleData putPropertiesItem(String key, List<String> propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, List<String>> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, List<String>> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleData bundleData = (BundleData) o;
    return Objects.equals(this.bundleId, bundleData.bundleId) &&
        Objects.equals(this.bundleUri, bundleData.bundleUri) &&
        Objects.equals(this.description, bundleData.description) &&
        Objects.equals(this.substanceOwner, bundleData.substanceOwner) &&
        Objects.equals(this.substances, bundleData.substances) &&
        Objects.equals(this.properties, bundleData.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, bundleUri, description, substanceOwner, substances, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleData {\n");
    
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    bundleUri: ").append(toIndentedString(bundleUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    substanceOwner: ").append(toIndentedString(substanceOwner)).append("\n");
    sb.append("    substances: ").append(toIndentedString(substances)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
