package com.vishu.orderservice.api.controller;

import com.vishu.orderservice.api.common.util.TransactionRequest;
import com.vishu.orderservice.api.common.util.TransactionResponse;
import com.vishu.orderservice.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
        return service.saveOrder(request);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Order- Service is running";
    }
}
