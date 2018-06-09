package ru.romanov.mas_mp5.model.association.composition;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.romanov.mas_mp5.model.Address;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hotel {
    private int hotelId;
    @NotNull
    @Size(min = 2, max = 40)
    private String hotelName;
    @Embedded
    private HotelAddress hotelAddress;
    private Set<Appartement> appartements = new HashSet<>();

    public Hotel( String hotelName) {
        this.hotelName = hotelName;
    }

    public Hotel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hotel")
    public Set<Appartement> getAppartements() {
        return appartements;
    }

    public void setAppartements(Set<Appartement> appartements) {
        this.appartements = appartements;
    }

    public HotelAddress getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(HotelAddress hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
