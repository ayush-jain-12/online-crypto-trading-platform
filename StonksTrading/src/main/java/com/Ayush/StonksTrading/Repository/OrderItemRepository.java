package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
