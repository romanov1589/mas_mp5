package ru.romanov.mas_mp5.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Firm {
    private int firmId;
    @NotNull
    @Size(min = 1, max = 40)
    private String name;
    @NotNull
    @Pattern(regexp = "[0-9]{9}$")
    private String nip;
    private String regon;
    private Address address;

    public Firm(){

    }

    public Firm(String name, String nip, String regon, Address address) {
        this.name = name;
        this.nip = nip;
        this.regon = regon;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getFirmId() {
        return firmId;
    }

    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    //unidirectional one-to-one association
    @OneToOne
    @JoinColumn(name="firm_address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
