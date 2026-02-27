package com.capgemini.foodDelivery;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.foodDelivery.service.OrderService;

@SpringBootApplication
public class FoodDeliverySystemApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(FoodDeliverySystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderService.placeOrder();
    }
}