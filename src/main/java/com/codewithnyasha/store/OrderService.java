package com.codewithnyasha.store;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    final private PaymentService paymentService;

    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void processOrder(double amount)
    {
        paymentService.processPayment(amount);
    }
}
