package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document("CSEDetails")
public class CSEDetails implements Serializable {

    @Id
    private ObjectId _Id;

    @Field("product_id")
    private String productId;

    @Field("resource_characteristics")
    private ResourceCharacteristics resourceCharacteristics;

    @Field("second_SSID_used")
    private boolean secondSSIDUsed;

    @Field("resource_under_modification")
    private boolean resourceUnderModification;

    @Field("resource_status")
    private boolean resourceStatus;

    @Field("passthrough_mode")
    private boolean passThroughMode;

    @Field("inserted")
    private Date inserted = new Date();

    @Field("updated")
    private Date updated;

    @Field("start_time")
    private Date startTime;

    @Field("end_time")
    private Date endTime;

    @Field("status")
    private String status = "active";


    public ResourceCharacteristics getResourceCharacteristics() {
        return resourceCharacteristics;
    }

    public void setResourceCharacteristics(ResourceCharacteristics resourceCharacteristics) {
        this.resourceCharacteristics = resourceCharacteristics;
    }

    public boolean isSecondSSIDUsed() {
        return secondSSIDUsed;
    }

    public void setSecondSSIDUsed(boolean secondSSIDUsed) {
        this.secondSSIDUsed = secondSSIDUsed;
    }

    public boolean isresourceUnderModification() {
        return resourceUnderModification;
    }

    public void setResource_under_modification(boolean resourceUnderModification) {
        this.resourceUnderModification = resourceUnderModification;
    }

    public boolean isResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(boolean resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public boolean isPassThroughMode() {
        return passThroughMode;
    }

    public void setPassThroughMode(boolean passThroughMode) {
        this.passThroughMode = passThroughMode;
    }

    public Date getInserted() {
        return inserted;
    }

    public void setInserted(Date inserted) {
        this.inserted = inserted;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String productName;

    public ObjectId get_Id() {
        return _Id;
    }

    public void set_Id(ObjectId _Id) {
        this._Id = _Id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
