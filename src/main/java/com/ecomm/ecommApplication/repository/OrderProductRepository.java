package com.ecomm.ecommApplication.repository;

import com.ecomm.ecommApplication.model.OrderProduct;
import com.ecomm.ecommApplication.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}