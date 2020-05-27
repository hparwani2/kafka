package com.example.demo.response;

import com.example.demo.model.CpeManufacturer;
import reactor.core.publisher.Mono;

import java.io.Serializable;

public class CpeManufacturerResponse implements Serializable {

    private String name;

    private String out;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public static CpeManufacturerResponse covertToResponse(CpeManufacturer cpeManufacturer) {

        CpeManufacturerResponse cpeManufacturerResponse = new CpeManufacturerResponse();
        cpeManufacturerResponse.setName(cpeManufacturer.getName());
        cpeManufacturerResponse.setOut(cpeManufacturer.getOut());
        return cpeManufacturerResponse;
    }
}
