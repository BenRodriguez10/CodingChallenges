package src.main.java.com.ben.notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser(){
        System.out.println("Sending Email");
    }
}
