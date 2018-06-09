package ru.romanov.mas_mp5.model.inheritance.disjoint;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@AttributeOverride(name="price", column=@Column(name="productPrice"))
public class Product extends Offer {
    private int productId;
    @NotNull
    @Size(min = 2, max = 40)
    private String productName;
    @NotNull
    @Size(min = 2, max = 40)
    private String productType;
    private double weight;

    public Product(String productName, String productType, double weight) {
        this.productName = productName;
        this.productType = productType;
        this.weight = weight;
    }

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
