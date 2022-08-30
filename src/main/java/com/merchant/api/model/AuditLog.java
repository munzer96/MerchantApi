package com.merchant.api.model;

import com.merchant.api.config.Constant;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AuditLog {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Constant.ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(Constant.ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isIncomingRequest() {
        return incomingRequest;
    }

    public void setIncomingRequest(boolean incomingRequest) {
        this.incomingRequest = incomingRequest;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    //data use to complete the action
    @Column(columnDefinition = "TEXT")
    private String body;

    //service name
    @Enumerated(EnumType.STRING)
    private Constant.ServiceType serviceType;

    //is it request from client or response
    private boolean incomingRequest;

    //date
    private Date createdAt;

    //remoteDevice
    private String remoteDevice;

    public String getRemoteDevice() {
        return remoteDevice;
    }

    public void setRemoteDevice(String remoteDevice) {
        this.remoteDevice = remoteDevice;
    }

    @PrePersist
    public void prePersist() {
        createdAt = new Date();
    }

    @OneToOne(cascade = {CascadeType.ALL})
    private Transaction transaction;



}
