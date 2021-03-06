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
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T12:17:06.729Z")
public class User {
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

  @SerializedName("name")
  private String name = null;

  @SerializedName("mail")
  private String mail = null;

  @SerializedName("hashedPass")
  private String hashedPass = null;

  @SerializedName("capabilities")
  private Map<String, Integer> capabilities = new HashMap<String, Integer>();

  @SerializedName("publicationRatePerWeek")
  private Map<String, Integer> publicationRatePerWeek = new HashMap<String, Integer>();

  @SerializedName("_id")
  private String id = null;

  public User meta(MetaInfo meta) {
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

  public User ontologicalClasses(List<String> ontologicalClasses) {
    this.ontologicalClasses = ontologicalClasses;
    return this;
  }

  public User addOntologicalClassesItem(String ontologicalClassesItem) {
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

  public User visible(Boolean visible) {
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

  public User temporary(Boolean temporary) {
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

  public User featured(Boolean featured) {
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

  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public User hashedPass(String hashedPass) {
    this.hashedPass = hashedPass;
    return this;
  }

   /**
   * Get hashedPass
   * @return hashedPass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHashedPass() {
    return hashedPass;
  }

  public void setHashedPass(String hashedPass) {
    this.hashedPass = hashedPass;
  }

  public User capabilities(Map<String, Integer> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public User putCapabilitiesItem(String key, Integer capabilitiesItem) {
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Integer> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Map<String, Integer> capabilities) {
    this.capabilities = capabilities;
  }

  public User publicationRatePerWeek(Map<String, Integer> publicationRatePerWeek) {
    this.publicationRatePerWeek = publicationRatePerWeek;
    return this;
  }

  public User putPublicationRatePerWeekItem(String key, Integer publicationRatePerWeekItem) {
    this.publicationRatePerWeek.put(key, publicationRatePerWeekItem);
    return this;
  }

   /**
   * Get publicationRatePerWeek
   * @return publicationRatePerWeek
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Integer> getPublicationRatePerWeek() {
    return publicationRatePerWeek;
  }

  public void setPublicationRatePerWeek(Map<String, Integer> publicationRatePerWeek) {
    this.publicationRatePerWeek = publicationRatePerWeek;
  }

  public User id(String id) {
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
    User user = (User) o;
    return Objects.equals(this.meta, user.meta) &&
        Objects.equals(this.ontologicalClasses, user.ontologicalClasses) &&
        Objects.equals(this.visible, user.visible) &&
        Objects.equals(this.temporary, user.temporary) &&
        Objects.equals(this.featured, user.featured) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.mail, user.mail) &&
        Objects.equals(this.hashedPass, user.hashedPass) &&
        Objects.equals(this.capabilities, user.capabilities) &&
        Objects.equals(this.publicationRatePerWeek, user.publicationRatePerWeek) &&
        Objects.equals(this.id, user.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, ontologicalClasses, visible, temporary, featured, name, mail, hashedPass, capabilities, publicationRatePerWeek, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ontologicalClasses: ").append(toIndentedString(ontologicalClasses)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    hashedPass: ").append(toIndentedString(hashedPass)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    publicationRatePerWeek: ").append(toIndentedString(publicationRatePerWeek)).append("\n");
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

