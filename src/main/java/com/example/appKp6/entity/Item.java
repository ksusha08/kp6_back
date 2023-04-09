package com.example.appKp6.entity;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {

    @Id
    @Column(name = "iditems", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "vendore_code", length = 255)
    private String vendoreCode;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "discount_price")
    private Double discountPrice;

    public Item(){
    }

    public Item(Long id, String name, String vendoreCode, String description, Double discountPrice) {
        this.id = id;
        this.name = name;
        this.vendoreCode = vendoreCode;
        this.description = description;
        this.discountPrice = discountPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendoreCode() {
        return vendoreCode;
    }

    public void setVendoreCode(String vendoreCode) {
        this.vendoreCode = vendoreCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }
}