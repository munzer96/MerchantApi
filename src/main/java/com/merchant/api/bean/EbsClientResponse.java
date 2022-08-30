package com.merchant.api.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxnet.merchant.beans.inbound.Payee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(value = NON_NULL, content = NON_EMPTY)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EbsClientResponse extends CommonResponse {

    @JsonProperty(value = "clientId")
    private String clientId;

    @JsonProperty(value = "terminalId")
    private String terminalId;

    @JsonProperty(value = "tranDateTime")
    private String tranDateTime;

    @JsonProperty(value = "systemTraceAuditNumber")
    private Integer systemTraceAuditNumber;

    @JsonProperty(value = "PAN")
    private String PAN;

    @JsonProperty(value = "mobileNo")
    private String mobileNo;

    @JsonProperty(value = "expDate")
    private String expDate;

    @JsonProperty(value = "IPIN")
    private String IPIN;

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

    @JsonProperty(value = "newIPIN")
    private String newIPIN;

    @JsonProperty(value = "cashBackAmount")
    private double cashBackAmount;

    @JsonProperty(value = "referenceNumber")
    private String referenceNumber;

    @JsonProperty(value = "additionalAmount")
    private double additionalAmount;

    @JsonProperty(value = "additionalData")
    private List additionalData;

    @JsonProperty(value = "payeesList")
    private List<Payee> payeesList;

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



    @Override
    public String toString() {
        return "EbsClientResponse{" +
                "clientId='" + clientId + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", tranDateTime='" + tranDateTime + '\'' +
                ", systemTraceAuditNumber=" + systemTraceAuditNumber +
                ", PAN='" + PAN + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", expDate='" + expDate + '\'' +
                ", IPIN='" + IPIN + '\'' +
                ", tranCurrencyCode='" + tranCurrencyCode + '\'' +
                ", tranAmount=" + tranAmount +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", tranFee=" + tranFee +
                ", payeeId='" + payeeId + '\'' +
                ", personalPaymentInfo='" + personalPaymentInfo + '\'' +
                ", fromCard='" + fromCard + '\'' +
                ", toCard='" + toCard + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", newIPIN='" + newIPIN + '\'' +
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
