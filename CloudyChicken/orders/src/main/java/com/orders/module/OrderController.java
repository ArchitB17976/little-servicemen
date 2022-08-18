package com.orders.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.orders.misc.*;

@RestController
@RequestMapping("/orders")
public class OrderController 
{
    @Autowired
    private OrderServe serve;

    // "Create" operations
    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest tReq)
    {
        return serve.addOrder(tReq);
    }
}
