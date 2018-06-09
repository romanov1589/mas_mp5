package ru.romanov.mas_mp5.model.association.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bus {
    private int busId;
    @NotNull
    @Size(min = 2, max = 40)
    private String type;
    @NotNull
    @Size(min = 2, max = 40)
    private String model;
    private Set<Route> routes = new HashSet<>();

    public Bus(int busId, String type, String model) {
        this.busId = busId;
        this.type = type;
        this.model = model;
    }

    public Bus() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "bus_route",
            joinColumns = {@JoinColumn(name = "busId")},
            inverseJoinColumns = {@JoinColumn(name = "routeId")}
    )
    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }
}
