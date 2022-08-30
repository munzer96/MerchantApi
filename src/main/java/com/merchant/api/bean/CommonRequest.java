package com.merchant.api.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class CommonRequest extends CommonBean {

    /**
     *
     */
    private static final long serialVersionUID = -5393912346017491623L;
    private String remoteDevice;
    private String remoteAddress;
    private CommonBean requestData;

    @Override
    protected void init() {

    }

    @JsonIgnore
    @Override
    public boolean isValid() {
        if (requestData.isValid())
            return true;
        return false;
    }

    @Override
    protected void clean() {

    }

    public CommonBean getRequestData() {
        return requestData;
    }

    public void setRequestData(CommonBean requestData) {
        this.requestData = requestData;
    }

    public String getRemoteDevice() {
        return remoteDevice;
    }

    public void setRemoteDevice(String remoteDevice) {
        this.remoteDevice = remoteDevice;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((remoteAddress == null) ? 0 : remoteAddress.hashCode());
        result = prime * result
                + ((remoteDevice == null) ? 0 : remoteDevice.hashCode());
        result = prime * result
                + ((requestData == null) ? 0 : requestData.hashCode());
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
        com.maxnet.merchant.beans.CommonRequest other = (com.maxnet.merchant.beans.CommonRequest) obj;
        if (remoteAddress == null) {
            if (other.remoteAddress != null)
                return false;
        } else if (!remoteAddress.equals(other.remoteAddress))
            return false;
        if (remoteDevice == null) {
            if (other.remoteDevice != null)
                return false;
        } else if (!remoteDevice.equals(other.remoteDevice))
            return false;
        if (requestData == null) {
            if (other.requestData != null)
                return false;
        } else if (!requestData.equals(other.requestData))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "remoteDevice='" + remoteDevice + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", requestData=" + requestData +
                '}';
    }
}
