package com.merchant.api.bean;

import java.io.Serializable;
import java.util.Date;

public abstract class CommonBean implements Serializable {

    private static final long serialVersionUID = 7238055550254241600L;
    private Long systemId;
    private int version;
    private String status;
    private String notes;
    private Date startDate;
    private Date endDate;
    private Date lastUpdated;

    public CommonBean() {
        super();
        init();
    }

    /*
     * This method is abstract method that contains the initialization of inner
     * bean contained inside the class
     */
    protected abstract void init();

    /*
     * This method is abstract method that is used to validate bean
     *
     * @return true if the bean is valid otherwise false
     */
    protected abstract boolean isValid();

    /*
     * This method is abstract method that is used to clean inner beans objects
     */
    protected abstract void clean();

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result
                + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result
                + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result
                + ((systemId == null) ? 0 : systemId.hashCode());
        result = prime * result + version;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CommonBean other = (CommonBean) obj;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (lastUpdated == null) {
            if (other.lastUpdated != null)
                return false;
        } else if (!lastUpdated.equals(other.lastUpdated))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        } else if (!notes.equals(other.notes))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (systemId == null) {
            if (other.systemId != null)
                return false;
        } else if (!systemId.equals(other.systemId))
            return false;
        return version == other.version;
    }

    @Override
    public String toString() {
        String builder = "CommonBean [systemId=" + systemId +
                ", version=" + version + ", status=" +
                status + ", notes=" + notes +
                ", startDate=" + startDate + ", endDate=" +
                endDate + ", lastUpdated=" + lastUpdated +
                "]";
        return builder;
    }

}

