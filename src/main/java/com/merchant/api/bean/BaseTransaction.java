package com.merchant.api.bean;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class BaseTransaction extends CommonBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7459001577142935022L;
	@JsonProperty
	private String approvalCode;

	@JsonProperty
	private String clientId;

	@JsonProperty
	private String referenceNumber;

	@JsonProperty
	private int systemTraceAuditNumber;

	@JsonProperty
	private String terminalId;

	@JsonProperty
	private String tranDateTime;

	public BaseTransaction() {
		super();

	}

	@Override
	protected void init() {
	/*	if (this.getClient() == null) {
			this.setClient(new Client());
		}*/
		setSystemTraceAuditNumber(-1);
	}

	@Override
	@JsonIgnore
	public boolean isValid() {
		return true;
	}

	@Override
	protected void clean() {

	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Integer getSystemTraceAuditNumber() {
		return systemTraceAuditNumber;
	}

	public void setSystemTraceAuditNumber(int systemTraceAuditNumber) {
		this.systemTraceAuditNumber = systemTraceAuditNumber;
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

	@Override
	public String toString() {
		return "BaseTransaction{" +
				"approvalCode='" + approvalCode + '\'' +
				", clientId='" + clientId + '\'' +
				", referenceNumber='" + referenceNumber + '\'' +
				", systemTraceAuditNumber=" + systemTraceAuditNumber +
				", terminalId='" + terminalId + '\'' +
				", tranDateTime='" + tranDateTime + '\'' +
				'}';
	}
}
