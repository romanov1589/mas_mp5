package ru.romanov.mas_mp5.model.association.composition;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class HotelAddress {
    @NotNull
    @Size(min = 2, max = 40)
    private String street;
    @Size(min = 2, max = 40)
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
