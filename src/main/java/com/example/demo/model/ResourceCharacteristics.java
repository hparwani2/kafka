package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Field;
import java.io.Serializable;

public class ResourceCharacteristics implements Serializable {

    @Field("cpe_managemement_system")
    private String cpeManagementSystem;

    @Field("cpe_external_id")
    private String cpeExternalId;

    @Field("cpe_product_class")
    private String cpeExternalClass;

    @Field("cpe_manufacturer")
    private CpeManufacturer cpeManufacturer;

    @Field("cpe_serial_number")
    private String cpeSerialNumber;

    @Field("cpe_software_version")
    private String cpeSoftwareVersion;

    @Field("cpe_model_name")
    private String cpeModelName;

    public String getCpeManagementSystem() {
        return cpeManagementSystem;
    }

    public void setCpeManagementSystem(String cpeManagementSystem) {
        this.cpeManagementSystem = cpeManagementSystem;
    }

    public String getCpeExternalId() {
        return cpeExternalId;
    }

    public void setCpeExternalId(String cpeExternalId) {
        this.cpeExternalId = cpeExternalId;
    }

    public String getCpeExternalClass() {
        return cpeExternalClass;
    }

    public void setCpeExternalClass(String cpeExternalClass) {
        this.cpeExternalClass = cpeExternalClass;
    }

    public CpeManufacturer getCpeManufacturer() {
        return cpeManufacturer;
    }

    public void setCpeManufacturer(CpeManufacturer cpeManufacturer) {
        this.cpeManufacturer = cpeManufacturer;
    }

    public String getCpeSerialNumber() {
        return cpeSerialNumber;
    }

    public void setCpeSerialNumber(String cpeSerialNumber) {
        this.cpeSerialNumber = cpeSerialNumber;
    }

    public String getCpeSoftwareVersion() {
        return cpeSoftwareVersion;
    }

    public void setCpeSoftwareVersion(String cpeSoftwareVersion) {
        this.cpeSoftwareVersion = cpeSoftwareVersion;
    }

    public String getCpeModelName() {
        return cpeModelName;
    }

    public void setCpeModelName(String cpeModelName) {
        this.cpeModelName = cpeModelName;
    }
}
