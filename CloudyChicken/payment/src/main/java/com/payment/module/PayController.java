package com.payment.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PayController 
{
    @Autowired
    private PayServe serve;

    // "Create" operations
    @PostMapping("/makePay")
    public Payment postPayment(@RequestBody Payment payment)
    {
        return serve.addPayment(payment);
    }
}
