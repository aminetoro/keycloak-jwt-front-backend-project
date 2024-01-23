package com.lary.inventroy_service.repository;

import com.lary.inventroy_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
