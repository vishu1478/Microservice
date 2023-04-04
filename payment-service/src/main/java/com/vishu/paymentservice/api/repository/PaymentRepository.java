package com.vishu.paymentservice.api.repository;

import com.vishu.paymentservice.api.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
