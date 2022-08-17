package com.ben.abstractnotification;

import java.io.IOException;

public class CreateNotification {
    public static void main(String args[]) throws IOException {
        
        System.out.println("Sending notification based off input");

        AbstractFactory phoneFactory = FactoryProvider.getFactory("Phone");
        Phone phone = phoneFactory.createPhone("Apple");

        AbstractFactory notificatonFactory = FactoryProvider.getFactory("Notification");
        Notification notification = notificatonFactory.createNotification("Text");
        System.out.println("Your " + notification.notifyUser() + " has been sent out using an " + phone.getOperatingSystem());

    }
}