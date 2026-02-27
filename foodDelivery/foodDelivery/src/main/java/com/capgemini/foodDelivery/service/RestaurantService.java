package com.capgemini.foodDelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestaurantService {

    private DeliveryService deliveryService;

    // Setter Injection
    @Autowired
    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void prepareOrder() {
        System.out.println("Restaurant preparing order...");
        deliveryService.deliverOrder();
    }
}
