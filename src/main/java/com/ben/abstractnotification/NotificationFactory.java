package src.main.java.com.ben.abstractnotification;

public class NotificationFactory extends AbstractFactory {
    public Notification createNotification(String typeOfNotification)
    {
        //This is our factory class/method to instantiate the concrete class
        switch (typeOfNotification){
            case "Text":
                return new TextNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + typeOfNotification);
        }
    }

    @Override
    public Phone createPhone(String typeOfPhone) {
        return null;
    }
}
