package com.SaleCompaign.SaleCompaign.Repository;

import com.SaleCompaign.SaleCompaign.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product WHERE id = :product_id", nativeQuery = true)
    Product getProductById(@Param("product_id") int productId);
}
