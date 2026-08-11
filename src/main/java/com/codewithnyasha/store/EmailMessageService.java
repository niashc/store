package com.codewithnyasha.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailMessageService implements NotificationService {
    @Override
    public void processNotification() {
        System.out.println("This is  the Email Message Service");
    }
}
