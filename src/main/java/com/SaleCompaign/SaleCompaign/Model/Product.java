package com.SaleCompaign.SaleCompaign.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;
    String Title;
    int mrp;
    double current_price;
    double discount;
    int inventory_count;

    public Product(int id, String title, int mrp, double current_price, double discount, int inventory_count) {
        this.id = id;
        this.Title = title;
        this.mrp = mrp;
        this.current_price = current_price;
        this.discount = discount;
        this.inventory_count = inventory_count;
    }

    public Product() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getInventory_count() {
        return inventory_count;
    }

    public void setInventory_count(int inventory_count) {
        this.inventory_count = inventory_count;
    }

    public int getId() {
        return id;
    }
}
