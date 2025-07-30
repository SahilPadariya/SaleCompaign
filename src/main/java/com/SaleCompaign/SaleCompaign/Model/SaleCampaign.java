package com.SaleCompaign.SaleCompaign.Model;

import com.SaleCompaign.SaleCompaign.Repository.SaleCampaignRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "salecampaign")
public class SaleCampaign {
    public String getStatus() {
        return status;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;

    @Column(unique = true)
    String campaign_name;

    LocalDate start_date;
    LocalDate end_date;
    String status;

    public SaleCampaign(String campaign_name, LocalDate start_date, LocalDate end_date, String status) {
        this.campaign_name = campaign_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status=status;
    }

    public SaleCampaign() {
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

}
