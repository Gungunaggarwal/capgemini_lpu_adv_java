package com.capgemini.foodDelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.capgemini.foodDelivery.notification.NotificationService;

@Component
public class OrderService {

    private final NotificationService notificationService;

    // Field Injection
    @Autowired
    private RestaurantService restaurantService;

    // Constructor Injection + Qualifier to override @Primary
    public OrderService(
            @Qualifier("smsNotification") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {

        System.out.println("Order Placed Successfully");

        restaurantService.prepareOrder();

        notificationService.sendNotification("Your order has been delivered!");
    }
}