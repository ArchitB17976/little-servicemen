package com.payment.module;

import javax.persistence.*;
import javax.transaction.Transactional;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment_details")
@Transactional

public class Payment 
{
    @Id
    @SequenceGenerator(
        name = "pay_seq", 
        initialValue = 111000, 
        allocationSize = 2
    )
    @GeneratedValue(
        generator = "pay_seq"
    )
    private long id;
    
    private boolean isCompleted;
    private double amount;
    private long orderId;
}
