package com.fadelalloys.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fadelalloys.course.entities.OrderItem;
import com.fadelalloys.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}