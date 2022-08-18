package com.payment.module;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServe 
{
    @Autowired
    private PayRepo rep;

    // "Create" operations
    public Payment addPayment(Payment payment)
    {
        payment.setCompleted(isProcessed());
        return rep.save(payment);
    }

    public boolean isProcessed()
    {
        return new Random().nextBoolean();
    }
}
