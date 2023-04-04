package com.vishu.orderservice.api.common.util;

import com.vishu.orderservice.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionRequest {

    private Order order;

    private Payment payment;

}
