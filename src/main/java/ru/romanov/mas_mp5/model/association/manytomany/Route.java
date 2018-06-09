package ru.romanov.mas_mp5.model.association.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Route {
    private int routeId;
    @NotNull
    @Size(min = 2, max = 40)
    private String routeName;
    @JsonIgnore
    private Set<Bus> buses;

    public Route(int routeId, String routeName) {
        this.routeId = routeId;
        this.routeName = routeName;
    }

    public Route() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @ManyToMany(mappedBy = "routes")
    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }
}
