package com.SaleCompaign.SaleCompaign.DTO;

import com.SaleCompaign.SaleCompaign.Model.Discount;

import java.time.LocalDate;
import java.util.List;

public class CampaignDTO {
    String campaign_name;
    LocalDate start_date;
    LocalDate end_date;
    List<Discount> discount;

    public CampaignDTO(String campaign_name, LocalDate start_date, LocalDate end_date, List<Discount> discount) {
        this.campaign_name = campaign_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.discount = discount;
    }

    public CampaignDTO() {
    }

    public String getCampaign_name() {
        return campaign_name;
    }

    public void setCampaign_name(String campaign_name) {
        this.campaign_name = campaign_name;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public List<Discount> getDiscount() {
        return discount;
    }

    public void setDiscount(List<Discount> discount) {
        this.discount = discount;
    }
}
