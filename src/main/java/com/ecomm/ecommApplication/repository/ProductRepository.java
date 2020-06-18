package com.ecomm.ecommApplication.repository;

import com.ecomm.ecommApplication.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}