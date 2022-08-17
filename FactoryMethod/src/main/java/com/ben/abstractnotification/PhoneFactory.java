package com.ben.abstractnotification;

public class PhoneFactory extends AbstractFactory {
    public Phone createPhone(String typeOfPhone)
    {
        //This is our factory class/method to instantiate the concrete class
        if(typeOfPhone == null || typeOfPhone.isEmpty())
            return null;
        switch (typeOfPhone){
            case "Apple":
                return new ApplePhone();
            case "Android":
                return new AndroidPhone();
            default:
                throw new IllegalArgumentException("Unknown phone " + typeOfPhone);
        }
    }

    @Override
    public Notification createNotification(String typeOfNotification) {
        return null;
    }
}
