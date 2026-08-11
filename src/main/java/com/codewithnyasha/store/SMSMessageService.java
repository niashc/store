package com.codewithnyasha.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSMessageService implements NotificationService {
    @Override
    public void processNotification()
    {
        System.out.println("This is  the SMS Message Service ===");
    }
}
