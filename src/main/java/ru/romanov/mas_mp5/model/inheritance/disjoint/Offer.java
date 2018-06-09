package ru.romanov.mas_mp5.model.inheritance.disjoint;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
public abstract class Offer {
    @NotNull
    private double price;
    @NotNull
    private Date offerDate;

    public Offer() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }
}
