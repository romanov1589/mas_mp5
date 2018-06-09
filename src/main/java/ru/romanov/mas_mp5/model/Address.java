package ru.romanov.mas_mp5.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Address {
    private int addressId;
    @NotNull
    @Size(min = 2, max = 100)
    private String streetName;
    private String streetNumber;
    @NotNull
    @Size(min = 6, max = 6)
    private String postalCode;
    @NotNull
    @Size(min=2, max = 60)
    private String cityName;
    @NotNull
    @Size(min=2, max=60)
    private String countryName;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String postalCode, String cityName, String countryName) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
