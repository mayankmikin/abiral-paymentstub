package com.amex.paymentstub.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MerchantData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-31T16:10:16.333Z")

public class MerchantData   {
  @JsonProperty("merchant_id")
  private String merchantId = null;

  @JsonProperty("merchant_name")
  private String merchantName = null;

  @JsonProperty("merchant_city")
  private String merchantCity = null;

  @JsonProperty("merchant_state")
  private String merchantState = null;

  @JsonProperty("merchant_country_code")
  private String merchantCountryCode = null;

  public MerchantData merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant’s service establishment identifier where the authorization happened
   * @return merchantId
  **/
 /* @ApiModelProperty(value = "Merchant’s service establishment identifier where the authorization happened")*/


  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public MerchantData merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Represents the merchant name
   * @return merchantName
  **/
 /* @ApiModelProperty(value = "Represents the merchant name")*/


  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public MerchantData merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

   /**
   * Represents the merchant city
   * @return merchantCity
  **/
  /*@ApiModelProperty(value = "Represents the merchant city")*/


  public String getMerchantCity() {
    return merchantCity;
  }

  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }

  public MerchantData merchantState(String merchantState) {
    this.merchantState = merchantState;
    return this;
  }

   /**
   * Represents the merchant state
   * @return merchantState
  **/
  /*@ApiModelProperty(value = "Represents the merchant state")*/


  public String getMerchantState() {
    return merchantState;
  }

  public void setMerchantState(String merchantState) {
    this.merchantState = merchantState;
  }

  public MerchantData merchantCountryCode(String merchantCountryCode) {
    this.merchantCountryCode = merchantCountryCode;
    return this;
  }

   /**
   * Represents the merchant country
   * @return merchantCountryCode
  **/
  /*@ApiModelProperty(value = "Represents the merchant country")*/


  public String getMerchantCountryCode() {
    return merchantCountryCode;
  }

  public void setMerchantCountryCode(String merchantCountryCode) {
    this.merchantCountryCode = merchantCountryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantData merchantData = (MerchantData) o;
    return Objects.equals(this.merchantId, merchantData.merchantId) &&
        Objects.equals(this.merchantName, merchantData.merchantName) &&
        Objects.equals(this.merchantCity, merchantData.merchantCity) &&
        Objects.equals(this.merchantState, merchantData.merchantState) &&
        Objects.equals(this.merchantCountryCode, merchantData.merchantCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, merchantName, merchantCity, merchantState, merchantCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantData {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
    sb.append("    merchantState: ").append(toIndentedString(merchantState)).append("\n");
    sb.append("    merchantCountryCode: ").append(toIndentedString(merchantCountryCode)).append("\n");
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

