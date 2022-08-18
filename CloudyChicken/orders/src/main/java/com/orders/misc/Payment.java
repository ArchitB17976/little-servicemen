package com.orders.misc;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment 
{
    private long id;
    
    private boolean isCompleted;
    private double amount;
    private long orderId;
}
