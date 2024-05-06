package com.example.planetsapp;

import java.io.Serializable;

public class Location implements Serializable {

    private String city;
    private String zipcode;
    private String district;

    public Location(String city, String zipcode, String district) {
        this.city = city;
        this.zipcode = zipcode;
        this.district = district;
    }

    public Location() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}


