package com.merchant.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommonResponse extends CommonBean {

    /**
     *
     */
    private static final long serialVersionUID = -6100772866403367287L;

    private int responseCode;
    private String responseMessage;
    private String responseStatus;

    @JsonIgnore
    private CommonRequest request;
    private CommonBean responseData;

    @Override
    protected void init() {

    }

    @Override
    protected boolean isValid() {
        if (this.getResponseCode() >= 0 || this.getResponseData() != null) {
            return true;
        }
        return false;
    }

    @Override
    protected void clean() {

    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;

    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public CommonRequest getRequest() {
        return request;
    }

    public void setRequest(CommonRequest request) {
        this.request = request;
    }

    public CommonBean getResponseData() {
        return responseData;
    }

    public void setResponseData(CommonBean responseData) {
        this.responseData = responseData;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     *
     *
     * /* (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BaseResponse [responseCode=" + responseCode
                + ", responseMessage=" + responseMessage + ", responseStatus="
                + responseStatus + ", request=" + request + ", responseData="
                + responseData + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((request == null) ? 0 : request.hashCode());
        result = prime * result + responseCode;
        result = prime * result
                + ((responseData == null) ? 0 : responseData.hashCode());
        result = prime * result
                + ((responseMessage == null) ? 0 : responseMessage.hashCode());
        result = prime * result
                + ((responseStatus == null) ? 0 : responseStatus.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        com.maxnet.merchant.beans.CommonResponse other = (com.maxnet.merchant.beans.CommonResponse) obj;
        if (request == null) {
            if (other.request != null)
                return false;
        } else if (!request.equals(other.request))
            return false;
        if (responseCode != other.responseCode)
            return false;
        if (responseData == null) {
            if (other.responseData != null)
                return false;
        } else if (!responseData.equals(other.responseData))
            return false;
        if (responseMessage == null) {
            if (other.responseMessage != null)
                return false;
        } else if (!responseMessage.equals(other.responseMessage))
            return false;
        if (responseStatus == null) {
            if (other.responseStatus != null)
                return false;
        } else if (!responseStatus.equals(other.responseStatus))
            return false;
        return true;
    }

}