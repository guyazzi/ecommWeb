package com.ecomm.ecommApplication.repository;

import com.ecomm.ecommApplication.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}