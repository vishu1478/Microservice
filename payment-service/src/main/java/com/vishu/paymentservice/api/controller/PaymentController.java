package com.vishu.paymentservice.api.controller;

import com.vishu.paymentservice.api.entity.Payment;
import com.vishu.paymentservice.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService service;
@PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "Payment- Service is running";
    }

}
