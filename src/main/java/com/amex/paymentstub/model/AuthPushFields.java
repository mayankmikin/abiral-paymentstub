package com.amex.paymentstub.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuthPushFields
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-31T16:10:16.333Z")

public class AuthPushFields   {
	
  @JsonProperty("funding_account_number")
  private String fundingAccountNumber = null;
  
 
  @JsonProperty("token_number")
  private String tokenNumber = null;

  @JsonProperty("last_auth_timestamp")
  private String lastAuthTimestamp = null;

  @JsonProperty("token_status")
  private String tokenStatus = null;

  @JsonProperty("current_domain_control_amount")
  private Double currentDomainControlAmount = null;

  @JsonProperty("authorization_decline_reason")
  private String authorizationDeclineReason = null;

  @JsonProperty("authorization_approved")
  private Boolean authorizationApproved = null;

  @JsonProperty("authorization_amount")
  private Double authorizationAmount = null;

  @JsonProperty("billing_currency")
  private String billingCurrency = null;

  @JsonProperty("approval_code_6_digit")
  private String approvalCode6Digit = null;

  @JsonProperty("approval_code_2_digit")
  private String approvalCode2Digit = null;

  @JsonProperty("merchant_data")
  private MerchantData merchantData = null;

  public AuthPushFields fundingAccountNumber(String fundingAccountNumber) {
    this.fundingAccountNumber = fundingAccountNumber;
    return this;
  }

   /**
   * 15-digit Funding account number associated with the token
   * @return fundingAccountNumber
  **/
  /*@ApiModelProperty(value = "15-digit Funding account number associated with the token")*/


  public String getFundingAccountNumber() {
    return fundingAccountNumber;
  }

  public void setFundingAccountNumber(String fundingAccountNumber) {
    this.fundingAccountNumber = fundingAccountNumber;
  }

  public AuthPushFields tokenNumber(String tokenNumber) {
    this.tokenNumber = tokenNumber;
    return this;
  }

   /**
   * Token on which the authorization was done
   * @return tokenNumber
  **/
  /*@ApiModelProperty(value = "Token on which the authorization was done")*/


  public String getTokenNumber() {
    return tokenNumber;
  }

  public void setTokenNumber(String tokenNumber) {
    this.tokenNumber = tokenNumber;
  }

  public AuthPushFields lastAuthTimestamp(String lastAuthTimestamp) {
    this.lastAuthTimestamp = lastAuthTimestamp;
    return this;
  }

   /**
   * Time at which the authorization was done.
   * @return lastAuthTimestamp
  **/
  /*@ApiModelProperty(value = "Time at which the authorization was done.")*/


  public String getLastAuthTimestamp() {
    return lastAuthTimestamp;
  }

  public void setLastAuthTimestamp(String lastAuthTimestamp) {
    this.lastAuthTimestamp = lastAuthTimestamp;
  }

  public AuthPushFields tokenStatus(String tokenStatus) {
    this.tokenStatus = tokenStatus;
    return this;
  }

   /**
   * Status of the Token. Represents if the token is still open or closed. (O or C)
   * @return tokenStatus
  **/
  /*@ApiModelProperty(value = "Status of the Token. Represents if the token is still open or closed. (O or C)")*/


  public String getTokenStatus() {
    return tokenStatus;
  }

  public void setTokenStatus(String tokenStatus) {
    this.tokenStatus = tokenStatus;
  }

  public AuthPushFields currentDomainControlAmount(Double currentDomainControlAmount) {
    this.currentDomainControlAmount = currentDomainControlAmount;
    return this;
  }

   /**
   * Current amount available on Token
   * @return currentDomainControlAmount
  **/
 /* @ApiModelProperty(value = "Current amount available on Token")*/


  public Double getCurrentDomainControlAmount() {
    return currentDomainControlAmount;
  }

  public void setCurrentDomainControlAmount(Double currentDomainControlAmount) {
    this.currentDomainControlAmount = currentDomainControlAmount;
  }

  public AuthPushFields authorizationDeclineReason(String authorizationDeclineReason) {
    this.authorizationDeclineReason = authorizationDeclineReason;
    return this;
  }

   /**
   * Represents the message if authorization is declined
   * @return authorizationDeclineReason
  **/
  /*@ApiModelProperty(value = "Represents the message if authorization is declined")*/


  public String getAuthorizationDeclineReason() {
    return authorizationDeclineReason;
  }

  public void setAuthorizationDeclineReason(String authorizationDeclineReason) {
    this.authorizationDeclineReason = authorizationDeclineReason;
  }

  public AuthPushFields authorizationApproved(Boolean authorizationApproved) {
    this.authorizationApproved = authorizationApproved;
    return this;
  }

   /**
   * Represents if authorization is approved or not
   * @return authorizationApproved
  **/
  /*@ApiModelProperty(value = "Represents if authorization is approved or not")*/


  public Boolean isAuthorizationApproved() {
    return authorizationApproved;
  }

  public void setAuthorizationApproved(Boolean authorizationApproved) {
    this.authorizationApproved = authorizationApproved;
  }

  public AuthPushFields authorizationAmount(Double authorizationAmount) {
    this.authorizationAmount = authorizationAmount;
    return this;
  }

   /**
   * Represents the USD amount for which authorization was done
   * @return authorizationAmount
  **/
  /*@ApiModelProperty(value = "Represents the USD amount for which authorization was done")*/


  public Double getAuthorizationAmount() {
    return authorizationAmount;
  }

  public void setAuthorizationAmount(Double authorizationAmount) {
    this.authorizationAmount = authorizationAmount;
  }

  public AuthPushFields billingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
    return this;
  }

   /**
   * ISO 3-digit code representing the billing currency
   * @return billingCurrency
  **/
  /*@ApiModelProperty(value = "ISO 3-digit code representing the billing currency")*/


  public String getBillingCurrency() {
    return billingCurrency;
  }

  public void setBillingCurrency(String billingCurrency) {
    this.billingCurrency = billingCurrency;
  }

  public AuthPushFields approvalCode6Digit(String approvalCode6Digit) {
    this.approvalCode6Digit = approvalCode6Digit;
    return this;
  }

   /**
   * Represents the authorization 6 digits approval code
   * @return approvalCode6Digit
  **/
 /* @ApiModelProperty(value = "Represents the authorization 6 digits approval code")*/


  public String getApprovalCode6Digit() {
    return approvalCode6Digit;
  }

  public void setApprovalCode6Digit(String approvalCode6Digit) {
    this.approvalCode6Digit = approvalCode6Digit;
  }

  public AuthPushFields approvalCode2Digit(String approvalCode2Digit) {
    this.approvalCode2Digit = approvalCode2Digit;
    return this;
  }

   /**
   * Represents the authorization 2 digits approval code
   * @return approvalCode2Digit
  **/
/*  @ApiModelProperty(value = "Represents the authorization 2 digits approval code")*/


  public String getApprovalCode2Digit() {
    return approvalCode2Digit;
  }

  public void setApprovalCode2Digit(String approvalCode2Digit) {
    this.approvalCode2Digit = approvalCode2Digit;
  }

  public AuthPushFields merchantData(MerchantData merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Get merchantData
   * @return merchantData
  **/
  /*@ApiModelProperty(value = "")*/

  @Valid

  public MerchantData getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(MerchantData merchantData) {
    this.merchantData = merchantData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthPushFields authPushFields = (AuthPushFields) o;
    return Objects.equals(this.fundingAccountNumber, authPushFields.fundingAccountNumber) &&
        Objects.equals(this.tokenNumber, authPushFields.tokenNumber) &&
        Objects.equals(this.lastAuthTimestamp, authPushFields.lastAuthTimestamp) &&
        Objects.equals(this.tokenStatus, authPushFields.tokenStatus) &&
        Objects.equals(this.currentDomainControlAmount, authPushFields.currentDomainControlAmount) &&
        Objects.equals(this.authorizationDeclineReason, authPushFields.authorizationDeclineReason) &&
        Objects.equals(this.authorizationApproved, authPushFields.authorizationApproved) &&
        Objects.equals(this.authorizationAmount, authPushFields.authorizationAmount) &&
        Objects.equals(this.billingCurrency, authPushFields.billingCurrency) &&
        Objects.equals(this.approvalCode6Digit, authPushFields.approvalCode6Digit) &&
        Objects.equals(this.approvalCode2Digit, authPushFields.approvalCode2Digit) &&
        Objects.equals(this.merchantData, authPushFields.merchantData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingAccountNumber, tokenNumber, lastAuthTimestamp, tokenStatus, currentDomainControlAmount, authorizationDeclineReason, authorizationApproved, authorizationAmount, billingCurrency, approvalCode6Digit, approvalCode2Digit, merchantData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthPushFields {\n");
    
    sb.append("    fundingAccountNumber: ").append(toIndentedString(fundingAccountNumber)).append("\n");
    sb.append("    tokenNumber: ").append(toIndentedString(tokenNumber)).append("\n");
    sb.append("    lastAuthTimestamp: ").append(toIndentedString(lastAuthTimestamp)).append("\n");
    sb.append("    tokenStatus: ").append(toIndentedString(tokenStatus)).append("\n");
    sb.append("    currentDomainControlAmount: ").append(toIndentedString(currentDomainControlAmount)).append("\n");
    sb.append("    authorizationDeclineReason: ").append(toIndentedString(authorizationDeclineReason)).append("\n");
    sb.append("    authorizationApproved: ").append(toIndentedString(authorizationApproved)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    approvalCode6Digit: ").append(toIndentedString(approvalCode6Digit)).append("\n");
    sb.append("    approvalCode2Digit: ").append(toIndentedString(approvalCode2Digit)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
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

