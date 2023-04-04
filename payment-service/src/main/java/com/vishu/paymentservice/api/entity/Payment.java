package com.vishu.paymentservice.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private int paymentID;
    private String paymentStatus;
    private String transactionID;
    private int orderID;
    private int amount;
}
