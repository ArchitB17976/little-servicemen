package com.orders.misc;

import com.orders.module.Order;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionResponse 
{
    private Order order;
    private String response;
    private long paymentId;
}
