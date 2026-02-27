package com.capgemini.payment;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.payment.processor.PaymentProcessor;

@SpringBootApplication
public class SmartpaymentSystemApplication implements CommandLineRunner {

    @Autowired
    private PaymentProcessor processor;

    public static void main(String[] args) {
        SpringApplication.run(SmartpaymentSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        processor.makePayment(5000);
    }
}