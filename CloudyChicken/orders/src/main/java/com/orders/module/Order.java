package com.orders.module;

import javax.persistence.*;
import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_details")
@Transactional

public class Order 
{
    @Id
    @SequenceGenerator(
        name = "order_seq", 
        initialValue = 121000, 
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "order_seq"
    )
    private long id;
    private String customerName;
    private double totalCost;
}
