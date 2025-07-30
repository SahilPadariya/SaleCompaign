package com.SaleCompaign.SaleCompaign.Myscheduker;

import com.SaleCompaign.SaleCompaign.Repository.SaleCampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyScheduler {

    @Autowired
    SaleCampaignRepository saleCampaignRepository;

    @Scheduled(cron = "0 */5 * * * ?")
    public void removeExpiredCampaigns() {
        LocalDate today = LocalDate.now();
        saleCampaignRepository.deleteExpiredCampaigns(today);
        System.out.println("Expired campaigns deleted on: " + today);
    }
}
