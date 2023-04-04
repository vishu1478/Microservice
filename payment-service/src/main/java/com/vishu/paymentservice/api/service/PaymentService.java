package com.vishu.paymentservice.api.service;

import com.vishu.paymentservice.api.entity.Payment;
import com.vishu.paymentservice.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
   @Autowired
    private PaymentRepository repository;

   public Payment doPayment(Payment payment){
       payment.setPaymentStatus(new Random().nextBoolean()?"success":"fail");
       payment.setTransactionID(UUID.randomUUID().toString());
       return repository.save(payment);
   }

}
