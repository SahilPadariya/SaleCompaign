package com.SaleCompaign.SaleCompaign.Repository;

import com.SaleCompaign.SaleCompaign.Model.Discount;
import com.SaleCompaign.SaleCompaign.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.*;

@Repository
public interface DiscountRepository extends JpaRepository<Discount,Integer> {
    @Query(value = "SELECT * FROM discount WHERE product_id =:id", nativeQuery = true)
    Discount getProductById(@Param("id") int id);
}
