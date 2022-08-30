package com.merchant.api.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class EbsClientRequest extends CommonRequest {

    @JsonProperty(value = "clientId")
    private String clientId;

    @JsonProperty(value = "terminalId")
    private String terminalId;

    @JsonProperty(value = "tranDateTime")
    @JsonFormat(pattern = "DDMMYYhhmmss")
    private String tranDateTime;

    @JsonProperty(value = "systemTraceAuditNumber")
    private Integer systemTraceAuditNumber;

    @JsonProperty(value = "PAN")
    private String PAN;

    @JsonProperty(value = "mobileNo")
    private String mobileNo;

    @JsonProperty(value = "expDate")
    private String expDate;

    @JsonProperty(value = "PIN")
    private String PIN;

    @JsonProperty(value = "tranCurrencyCode")
    private String tranCurrencyCode;

    @JsonProperty(value = "tranAmount")
    private Double tranAmount;

    @JsonProperty(value = "voucherNumber")
    private String voucherNumber;

    @JsonProperty(value = "tranFee")
    private double tranFee;

    @JsonProperty(value = "payeeId")
    private String payeeId;

    @JsonProperty(value = "personalPaymentInfo")
    private String personalPaymentInfo;

    @JsonProperty(value = "fromCard")
    private String fromCard;

    @JsonProperty(value = "toCard")
    private String toCard;

    @JsonProperty(value = "toAccount")
    private String toAccount;

    @JsonProperty(value = "newPIN")
    private String newPIN;

    @JsonProperty(value = "cashBackAmount")
    private double cashBackAmount;

    @JsonProperty(value = "referenceNumber")
    private String referenceNumber;

    @JsonProperty(value = "additionalAmount")
    private double additionalAmount;

    @JsonProperty(value = "additionalData")
    private List additionalData;

    @JsonProperty(value = "payeesList")
    private List payeesList;

    @JsonProperty(value = "payeesCount")
    private Integer payeesCount;

    @JsonProperty(value = "workingKey")
    private String workingKey;

    @JsonProperty(value = "originalSystemTraceAuditNumber")
    private Integer originalSystemTraceAuditNumber;

    @JsonProperty(value = "miniStatementRecords")
    private List miniStatementRecords;

    @JsonProperty(value = "serviceId")
    private String serviceId;

    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    @JsonProperty(value = "disputeRRN")
    private Integer disputeRRN;

    @JsonProperty(value = "accountType")
    private String accountType;

    @JsonProperty(value = "track2")
    private String track2;

    @JsonProperty(value = "billerResponseCode")
    private Integer billerResponseCode;

    @JsonProperty(value = "checkDuplicate")
    private boolean checkDuplicate;

    @JsonProperty(value = "originalTranReferenceNumber")
    private String originalTranReferenceNumber;

    @JsonProperty(value = "entityType")
    private String entityType;

    @JsonProperty(value = "entityId")
    private String entityId;

    @JsonProperty(value = "otpChannelType")
    private String otpChannelType;

    @JsonProperty(value = "otp")
    private String otp;

    @JsonProperty(value = "tranAuthenticationType")
    private String tranAuthenticationType;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTranDateTime() {
        return tranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        this.tranDateTime = tranDateTime;
    }

    public Integer getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    public void setSystemTraceAuditNumber(Integer systemTraceAuditNumber) {
        this.systemTraceAuditNumber = systemTraceAuditNumber;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getTranCurrencyCode() {
        return tranCurrencyCode;
    }

    public void setTranCurrencyCode(String tranCurrencyCode) {
        this.tranCurrencyCode = tranCurrencyCode;
    }

    public Double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Double tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public double getTranFee() {
        return tranFee;
    }

    public void setTranFee(double tranFee) {
        this.tranFee = tranFee;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPersonalPaymentInfo() {
        return personalPaymentInfo;
    }

    public void setPersonalPaymentInfo(String personalPaymentInfo) {
        this.personalPaymentInfo = personalPaymentInfo;
    }

    public String getFromCard() {
        return fromCard;
    }

    public void setFromCard(String fromCard) {
        this.fromCard = fromCard;
    }

    public String getToCard() {
        return toCard;
    }

    public void setToCard(String toCard) {
        this.toCard = toCard;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getNewPIN() {
        return newPIN;
    }

    public void setNewPIN(String newPIN) {
        this.newPIN = newPIN;
    }

    public double getCashBackAmount() {
        return cashBackAmount;
    }

    public void setCashBackAmount(double cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public double getAdditionalAmount() {
        return additionalAmount;
    }

    public void setAdditionalAmount(double additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public List getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List additionalData) {
        this.additionalData = additionalData;
    }

    public List getPayeesList() {
        return payeesList;
    }

    public void setPayeesList(List payeesList) {
        this.payeesList = payeesList;
    }

    public Integer getPayeesCount() {
        return payeesCount;
    }

    public void setPayeesCount(Integer payeesCount) {
        this.payeesCount = payeesCount;
    }

    public String getWorkingKey() {
        return workingKey;
    }

    public void setWorkingKey(String workingKey) {
        this.workingKey = workingKey;
    }

    public Integer getOriginalSystemTraceAuditNumber() {
        return originalSystemTraceAuditNumber;
    }

    public void setOriginalSystemTraceAuditNumber(Integer originalSystemTraceAuditNumber) {
        this.originalSystemTraceAuditNumber = originalSystemTraceAuditNumber;
    }

    public List getMiniStatementRecords() {
        return miniStatementRecords;
    }

    public void setMiniStatementRecords(List miniStatementRecords) {
        this.miniStatementRecords = miniStatementRecords;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDisputeRRN() {
        return disputeRRN;
    }

    public void setDisputeRRN(Integer disputeRRN) {
        this.disputeRRN = disputeRRN;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public Integer getBillerResponseCode() {
        return billerResponseCode;
    }

    public void setBillerResponseCode(Integer billerResponseCode) {
        this.billerResponseCode = billerResponseCode;
    }

    public boolean isCheckDuplicate() {
        return checkDuplicate;
    }

    public void setCheckDuplicate(boolean checkDuplicate) {
        this.checkDuplicate = checkDuplicate;
    }

    public String getOriginalTranReferenceNumber() {
        return originalTranReferenceNumber;
    }

    public void setOriginalTranReferenceNumber(String originalTranReferenceNumber) {
        this.originalTranReferenceNumber = originalTranReferenceNumber;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getOtpChannelType() {
        return otpChannelType;
    }

    public void setOtpChannelType(String otpChannelType) {
        this.otpChannelType = otpChannelType;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getTranAuthenticationType() {
        return tranAuthenticationType;
    }

    public void setTranAuthenticationType(String tranAuthenticationType) {
        this.tranAuthenticationType = tranAuthenticationType;
    }

    @Override
    public String toString() {
        return "EbsClientRequest{" +
                "clientId='" + clientId + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", tranDateTime='" + tranDateTime + '\'' +
                ", systemTraceAuditNumber=" + systemTraceAuditNumber +
                ", PAN='" + PAN + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", expDate='" + expDate + '\'' +
                ", PIN='" + PIN + '\'' +
                ", tranCurrencyCode='" + tranCurrencyCode + '\'' +
                ", tranAmount=" + tranAmount +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", tranFee=" + tranFee +
                ", payeeId='" + payeeId + '\'' +
                ", personalPaymentInfo='" + personalPaymentInfo + '\'' +
                ", fromCard='" + fromCard + '\'' +
                ", toCard='" + toCard + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", newPIN='" + newPIN + '\'' +
                ", cashBackAmount=" + cashBackAmount +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", additionalAmount=" + additionalAmount +
                ", additionalData=" + additionalData +
                ", payeesList=" + payeesList +
                ", payeesCount=" + payeesCount +
                ", workingKey='" + workingKey + '\'' +
                ", originalSystemTraceAuditNumber=" + originalSystemTraceAuditNumber +
                ", miniStatementRecords=" + miniStatementRecords +
                ", serviceId='" + serviceId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", disputeRRN=" + disputeRRN +
                ", accountType='" + accountType + '\'' +
                ", track2='" + track2 + '\'' +
                ", billerResponseCode=" + billerResponseCode +
                ", checkDuplicate=" + checkDuplicate +
                ", originalTranReferenceNumber='" + originalTranReferenceNumber + '\'' +
                ", entityType='" + entityType + '\'' +
                ", entityId='" + entityId + '\'' +
                ", otpChannelType='" + otpChannelType + '\'' +
                ", otp='" + otp + '\'' +
                ", tranAuthenticationType='" + tranAuthenticationType + '\'' +
                '}';
    }


}
