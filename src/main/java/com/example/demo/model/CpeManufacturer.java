package com.example.demo.model;

import java.io.Serializable;

public class CpeManufacturer implements Serializable {

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
}
