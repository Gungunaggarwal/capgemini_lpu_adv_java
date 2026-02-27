package com.capgemini.payment.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CreditCardPayment implements PaymentService {

    private final TransactionLogger logger;

    // Constructor Injection
    public CreditCardPayment(TransactionLogger logger) {
        this.logger = logger;
        System.out.println("CreditCardPayment Bean Created");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment: " + amount);
        logger.log("Credit Card payment successful");
    }
}