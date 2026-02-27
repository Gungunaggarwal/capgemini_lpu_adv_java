package com.capgemini.foodDelivery.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class DeliveryService {

    @PostConstruct
    public void init() {
        System.out.println("Delivery Service Ready");
    }

    public void deliverOrder() {
        System.out.println("Order Delivered Successfully");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Delivery Service Closed");
    }
}
