package com.search.SearchShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Shop {
    long id;
    @NotBlank
    String shopName;
    String category;
    //Location location;
    String ownerName;

    public Shop() {
    }

    public Shop(long id, @NotBlank String shopName, String category, String ownerName) {
        this.id = id;
        this.shopName = shopName;
        this.category = category;
        this.ownerName = ownerName;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
