package ru.romanov.mas_mp5.model.inheritance.disjoint;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@AttributeOverride(name="price", column=@Column(name="servicePrice"))
public class Service extends Offer {
    private int serviceId;
    @NotNull
    @Size(min = 2, max = 40)
    private String serviceName;
    @Size(min = 2, max = 1000)
    @NotNull
    private String description;

    public Service(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }

    public Service() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
