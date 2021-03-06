/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

import java.util.List;
import java.util.Map;

/**
 * The Class Result.
 */
public class Result extends GenericModel {

  /** The explanation tags. */
  @SerializedName("explanation_tags")
  private List<Annotation> explanationTags;

  /** The id. */
  private String id;

  /** The label. */
  private String label;

  /** The score. */
  private Double score;

  // Fixes https://github.com/watson-developer-cloud/java-sdk/issues/309
  @SerializedName("user_fields")
  private Map<String, String> userFields;
  public Map<String, String> getUserFields() {
    return userFields;
  }
  public void setUserFields(Map<String, String> userFields) {
    this.userFields = userFields;
  }
  // End fix


  /**
   * Gets the explanation tags.
   * 
   * @return The explanationTags
   */
  public List<Annotation> getAnnotations() {
    return explanationTags;
  }

  /**
   * Gets the id.
   * 
   * @return The id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the label.
   * 
   * @return The label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the score.
   * 
   * @return The score
   */
  public Double getScore() {
    return score;
  }

  /**
   * Sets the explanation tags.
   * 
   * @param explanationTags The explanation_tags
   */
  public void setAnnotations(List<Annotation> explanationTags) {
    this.explanationTags = explanationTags;
  }

  /**
   * Sets the id.
   * 
   * @param id The id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the label.
   * 
   * @param label The label
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Sets the score.
   * 
   * @param score The score
   */
  public void setScore(Double score) {
    this.score = score;
  }
}
