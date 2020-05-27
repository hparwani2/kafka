package com.example.demo.response;

import com.example.demo.model.CSEDetails;
import com.example.demo.model.ResourceCharacteristics;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

public class CSEDetailsResponse implements Serializable {

    private String product_id;

    private ResourceCharacteristicsResponse resource_characteristics;

    private boolean second_SSID_used;

    private boolean resource_under_modification;

    private boolean resource_status;

    private boolean passthrough_mode;

    private Date start_time;

    private Date end_time;

    private String status;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public ResourceCharacteristicsResponse getResource_characteristics() {
        return resource_characteristics;
    }

    public void setResource_characteristics(ResourceCharacteristicsResponse resource_characteristics) {
        this.resource_characteristics = resource_characteristics;
    }

    public boolean isSecond_SSID_used() {
        return second_SSID_used;
    }

    public void setSecond_SSID_used(boolean second_SSID_used) {
        this.second_SSID_used = second_SSID_used;
    }

    public boolean isResource_under_modification() {
        return resource_under_modification;
    }

    public void setResource_under_modification(boolean resource_under_modification) {
        this.resource_under_modification = resource_under_modification;
    }

    public boolean isResource_status() {
        return resource_status;
    }

    public void setResource_status(boolean resource_status) {
        this.resource_status = resource_status;
    }

    public boolean isPassthrough_mode() {
        return passthrough_mode;
    }

    public void setPassthrough_mode(boolean passthrough_mode) {
        this.passthrough_mode = passthrough_mode;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CSEDetailsResponse() {

    }

    public static CSEDetailsResponse convertToResponse(CSEDetails cseDetails) {

        CSEDetailsResponse cseDetailsResponse = new CSEDetailsResponse();
        cseDetailsResponse.setProduct_id(cseDetails.getProductId());
        cseDetailsResponse.setResource_characteristics(ResourceCharacteristicsResponse.convertToResponse(cseDetails.getResourceCharacteristics()));
        cseDetailsResponse.setSecond_SSID_used(cseDetails.isSecondSSIDUsed());
        cseDetailsResponse.setResource_under_modification(cseDetails.isresourceUnderModification());
        cseDetailsResponse.setStatus(cseDetails.getStatus());
        cseDetailsResponse.setResource_status(cseDetails.isResourceStatus());
        cseDetailsResponse.setPassthrough_mode(cseDetails.isPassThroughMode());
        cseDetailsResponse.setStart_time(cseDetails.getStartTime());
        cseDetailsResponse.setEnd_time(cseDetails.getEndTime());

        return cseDetailsResponse;
    }
}
