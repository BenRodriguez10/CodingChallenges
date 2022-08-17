package com.ben.abstractnotification;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Phone".equalsIgnoreCase(choice)){
            return new PhoneFactory();
        }
        else if("Notification".equalsIgnoreCase(choice)){
            return new NotificationFactory();
        }

        return null;
    }
}
