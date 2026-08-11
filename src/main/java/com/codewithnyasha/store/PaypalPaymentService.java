package com.codewithnyasha.store;
import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment");
        System.out.println("Payment with amount " + amount + " processed");
    }
}
