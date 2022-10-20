package src.main.java.com.ben.notification;

public class NotificationFactory {
    public Notification createNotification(String type)
    {
        //This is our factory class/method to instantiate the concrete class
        if(type == null || type.isEmpty())
            return null;
        switch (type){
            case "Text":
                return new TextNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + type);
        }
    }
}
