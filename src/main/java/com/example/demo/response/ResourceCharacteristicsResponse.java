package com.example.demo.response;

import com.example.demo.model.CpeManufacturer;
import com.example.demo.model.ResourceCharacteristics;
import org.springframework.data.mongodb.core.mapping.Field;

public class ResourceCharacteristicsResponse {

    private String cpe_managemement_system;

    private String cpe_external_id;

    private String cpe_product_class;

    private CpeManufacturerResponse cpe_manufacturer;

    private String cpe_serial_number;

    private String cpe_software_version;

    private String cpe_model_name;


    public String getCpe_managemement_system() {
        return cpe_managemement_system;
    }

    public void setCpe_managemement_system(String cpe_managemement_system) {
        this.cpe_managemement_system = cpe_managemement_system;
    }

    public String getCpe_external_id() {
        return cpe_external_id;
    }

    public void setCpe_external_id(String cpe_external_id) {
        this.cpe_external_id = cpe_external_id;
    }

    public String getCpe_product_class() {
        return cpe_product_class;
    }

    public void setCpe_product_class(String cpe_product_class) {
        this.cpe_product_class = cpe_product_class;
    }

    public CpeManufacturerResponse getCpe_manufacturer() {
        return cpe_manufacturer;
    }

    public void setCpe_manufacturer(CpeManufacturerResponse cpe_manufacturer) {
        this.cpe_manufacturer = cpe_manufacturer;
    }

    public String getCpe_serial_number() {
        return cpe_serial_number;
    }

    public void setCpe_serial_number(String cpe_serial_number) {
        this.cpe_serial_number = cpe_serial_number;
    }

    public String getCpe_software_version() {
        return cpe_software_version;
    }

    public void setCpe_software_version(String cpe_software_version) {
        this.cpe_software_version = cpe_software_version;
    }

    public String getCpe_model_name() {
        return cpe_model_name;
    }

    public void setCpe_model_name(String cpe_model_name) {
        this.cpe_model_name = cpe_model_name;
    }

    public static ResourceCharacteristicsResponse convertToResponse(ResourceCharacteristics resourceCharacteristics) {
        ResourceCharacteristicsResponse resourceCharacteristicsResponse = new ResourceCharacteristicsResponse();

        resourceCharacteristicsResponse.setCpe_external_id(resourceCharacteristics.getCpeExternalId());
        resourceCharacteristicsResponse.setCpe_manufacturer(CpeManufacturerResponse.covertToResponse(resourceCharacteristics.getCpeManufacturer()));
        resourceCharacteristicsResponse.setCpe_managemement_system(resourceCharacteristics.getCpeManagementSystem());
        resourceCharacteristicsResponse.setCpe_product_class(resourceCharacteristics.getCpeExternalClass());
        resourceCharacteristicsResponse.setCpe_serial_number(resourceCharacteristics.getCpeSerialNumber());
        resourceCharacteristicsResponse.setCpe_software_version(resourceCharacteristics.getCpeSoftwareVersion());

        return resourceCharacteristicsResponse;
    }
}
