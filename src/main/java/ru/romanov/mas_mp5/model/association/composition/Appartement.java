package ru.romanov.mas_mp5.model.association.composition;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Appartement {
    private int appartementId;
    @NotNull
    @Size(min = 2, max = 6)
    private String appartementNumber;
    @NotNull
    private int numberOfRooms;
    @NotNull
    private double price;
    @JsonIgnore
    private Hotel hotel;

    public Appartement(String appartementNumber, int numberOfRooms, double price) {
        this.appartementNumber = appartementNumber;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public Appartement() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAppartementId() {
        return appartementId;
    }

    public void setAppartementId(int appartementId) {
        this.appartementId = appartementId;
    }

    public String getAppartementNumber() {
        return appartementNumber;
    }

    public void setAppartementNumber(String appartementNumber) {
        this.appartementNumber = appartementNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_hotel")
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
