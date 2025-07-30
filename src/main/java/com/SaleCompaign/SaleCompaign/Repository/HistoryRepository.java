package com.SaleCompaign.SaleCompaign.Repository;

import com.SaleCompaign.SaleCompaign.Model.History;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered

public interface HistoryRepository extends JpaRepository<History,Integer> {

}
