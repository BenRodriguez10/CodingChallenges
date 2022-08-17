package com.ben.notification;

public class TextNotification implements Notification {

    @Override
    public void notifyUser(){
        System.out.println("Sending Text Message");
    }

}
