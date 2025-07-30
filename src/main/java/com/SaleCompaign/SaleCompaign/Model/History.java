package com.SaleCompaign.SaleCompaign.Model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
@Table(name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    int product_id;
    int mrp;
    double discount;
    LocalDate data;
    String status;

    public History(int product_id, int mrp, double discount, LocalDate data, String status) {
        this.product_id = product_id;
        this.mrp = mrp;
        this.discount = discount;
        this.data = data;
        this.status = status;
    }

    public History() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getMrp() {
        return mrp;
    }

    public void setMrp(int mrp) {
        this.mrp = mrp;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
