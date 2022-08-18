package com.gate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Fallback 
{
    @RequestMapping("/orderFallBack")
    public Mono<String> orderServeFall()
    {
        return Mono.just(
            "Order service is taking too long/is down."
        );
    }

    @RequestMapping("/paymentFallBack")
    public Mono<String> paymentServeFall()
    {
        return Mono.just(
            "Payment service is taking too long/is down."
        );
    }
}
