package com.ben.abstractnotification;

public class EmailNotification implements Notification {

    @Override
    public String notifyUser(){
        String notify = "Email";
        return notify;
    }
}
