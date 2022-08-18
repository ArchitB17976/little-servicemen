package com.orders.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orders.misc.*;

@Service
public class OrderServe 
{
    @Autowired
    private OrderRepo rep;

    @Autowired
    private RestTemplate rTemp;
    
    // "Create" operations
    public TransactionResponse addOrder(TransactionRequest tReq)
    {
        // Initialising tRes fields
        Order order = rep.save(tReq.getOrder());
        Payment paying = tReq.getPayment();

        // Populating the resulting Payment object
        paying.setOrderId(order.getId());
        paying.setAmount(order.getTotalCost());

        // Sending the object accros services to populate "payment_details"
        Payment paid = rTemp.postForObject(
            "http://PAYMENT-SERVICE/payment/makePay", 
            paying, 
            Payment.class
        );
        String response 
            = paid.isCompleted()? "Payment succeeded" : "Failed";

        return new TransactionResponse(order, response, paid.getId());
    }
}
