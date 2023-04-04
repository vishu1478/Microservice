package com.vishu.orderservice.api.service;

import com.vishu.orderservice.api.common.util.Payment;
import com.vishu.orderservice.api.common.util.TransactionRequest;
import com.vishu.orderservice.api.common.util.TransactionResponse;
import com.vishu.orderservice.api.entity.Order;
import com.vishu.orderservice.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;


    public TransactionResponse saveOrder(TransactionRequest request){
String paymentURL="http://payment-service/payments/doPayment";
String response ="";
        Order order=request.getOrder();
        Payment payment=request.getPayment();
        payment.setOrderID(order.getId());
        payment.setAmount(order.getPrice());

        Payment paymentResponse=restTemplate.postForObject(paymentURL,payment,Payment.class);
        response=paymentResponse.getPaymentStatus().equals("success")?"Payment Success":"Payment failed";
        orderRepository.save(order);
        return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionID(),response);
    }
}
