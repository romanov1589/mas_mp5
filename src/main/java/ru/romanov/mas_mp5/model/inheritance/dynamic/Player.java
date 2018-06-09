package ru.romanov.mas_mp5.model.inheritance.dynamic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("player")
public class Player extends Participant {
    @NotNull
    @Size(min = 2, max = 10)
    private String playerLicense;

    public Player() {
    }

    public String getPlayerLicense() {
        return playerLicense;
    }

    public void setPlayerLicense(String playerLicense) {
        this.playerLicense = playerLicense;
    }
}
