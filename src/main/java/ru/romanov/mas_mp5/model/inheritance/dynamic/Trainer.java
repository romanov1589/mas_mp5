package ru.romanov.mas_mp5.model.inheritance.dynamic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("trainer")
public class Trainer extends Participant {
    @NotNull
    @Size(min = 2, max = 10)
    private String trainerLicense;

    public Trainer() {
    }

    public String getTrainerLicense() {
        return trainerLicense;
    }

    public void setTrainerLicense(String trainerLicense) {
        this.trainerLicense = trainerLicense;
    }
}
