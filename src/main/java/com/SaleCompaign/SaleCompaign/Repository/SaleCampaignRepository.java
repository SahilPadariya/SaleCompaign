package com.SaleCompaign.SaleCompaign.Repository;

import com.SaleCompaign.SaleCompaign.Model.SaleCampaign;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.*;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SaleCampaignRepository extends JpaRepository<SaleCampaign,Integer> {
    @Query("SELECT c.id FROM SaleCampaign c WHERE c.campaign_name = :title")
    List<Integer> findAllByTitle(@Param("title") String title);

    @Modifying
    @Transactional
    @Query("DELETE FROM SaleCampaign c WHERE c.end_date < :today")
    void deleteExpiredCampaigns(@Param("today") LocalDate today);
    @Query(value = """
    SELECT
        CASE
            WHEN CURDATE() < :start THEN 'Upcoming'
            WHEN CURDATE() > :end THEN 'Past'
            ELSE 'Current'
        END AS status
    FROM dual
""", nativeQuery = true)
    String getCampaignStatus(@Param("start") LocalDate start, @Param("end") LocalDate end);
}
