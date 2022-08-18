package com.orders.misc;

import com.orders.module.Order;

import lombok.Data;

@Data

public class TransactionRequest 
{
    private Order order;
    private Payment payment;
}
