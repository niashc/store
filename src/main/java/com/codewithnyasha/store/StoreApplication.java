package com.codewithnyasha.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
       // var oderService = new OrderService(new PaypalPaymentService());
       var notificationService = context.getBean(NotificationService.class);
        notificationService.processNotification();
    }

}
