package com.vishu.orderservice.api.common.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private int paymentID;
    private String paymentStatus;
    private String transactionID;
    private int orderID;
    private double amount;
}
