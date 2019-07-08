package com.adidyk.models;

import java.util.Objects;

public class Passport {

    private int id;

    private String serial;

    private String country;

    private String region;

    public Passport() {
    }

    public Passport(int id) {
        this.id = id;
    }

    public Passport(String serial, String country, String region) {
        this.serial = serial;
        this.country = country;
        this.region = region;
    }

    public Passport(int id, String serial, String country, String region) {
        this.id = id;
        this.serial = serial;
        this.country = country;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return id == passport.id &&
                Objects.equals(serial, passport.serial) &&
                Objects.equals(country, passport.country) &&
                Objects.equals(region, passport.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serial, country, region);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}