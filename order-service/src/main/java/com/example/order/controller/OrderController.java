package com.example.order.controller;

import com.example.order.service.OrderProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @GetMapping("/send")
    public String sendOrder(@RequestParam String order) {
        orderProducer.sendOrder(order);
        return "Order sent to Kafka: " + order;
    }
}
