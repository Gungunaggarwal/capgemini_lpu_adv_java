package com.capgemini.payment.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.capgemini.payment.service.PaymentService;
import com.capgemini.payment.service.TransactionLogger;

@Component
public class PaymentProcessor {

    private final PaymentService paymentService;

    // Field Injection
    @Autowired
    private TransactionLogger transactionLogger;

    // Constructor Injection with Qualifier
    public PaymentProcessor(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(double amount) {
        paymentService.processPayment(amount);
        transactionLogger.log("Payment processed successfully in Processor");
    }
}