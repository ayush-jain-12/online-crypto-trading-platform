package com.Ayush.StonksTrading.Repository;

import com.Ayush.StonksTrading.Model.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
