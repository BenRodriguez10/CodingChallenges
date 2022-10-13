package src.main.java.com.ben.abstractnotification;

abstract class AbstractFactory {

    public abstract Notification createNotification(String type);

    public abstract Phone createPhone(String type);
}
