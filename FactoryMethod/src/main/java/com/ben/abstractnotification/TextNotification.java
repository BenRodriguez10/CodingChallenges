package com.ben.abstractnotification;

public class TextNotification implements Notification {

    @Override
    public String notifyUser(){
        String notify = "Text";
        return notify;
    }
}
