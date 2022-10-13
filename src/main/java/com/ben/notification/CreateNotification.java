package src.main.java.com.ben.notification;


public class CreateNotification {
    public static void main(String args[]){
        
        System.out.println("Sending notification based off input");
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Email");
        notification.notifyUser();
    }
}