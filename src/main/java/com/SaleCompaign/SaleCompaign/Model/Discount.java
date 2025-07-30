package com.SaleCompaign.SaleCompaign.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "discount")
public class Discount {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;

    int product_id;
    int campaign_id;
    int discount;

    public Discount(int product_id, int campaign_id, int discount) {
        this.product_id = product_id;
        this.campaign_id = campaign_id;
        this.discount = discount;
    }

    public Discount() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(int campaign_id) {
        this.campaign_id = campaign_id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
