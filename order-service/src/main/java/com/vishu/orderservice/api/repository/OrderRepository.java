package com.vishu.orderservice.api.repository;

import com.vishu.orderservice.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
