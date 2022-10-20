package src.main.java.com.ben.abstractnotification;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) throws Exception {

        if("Phone".equalsIgnoreCase(choice)){
            return new PhoneFactory();
        }
        else if("Notification".equalsIgnoreCase(choice)){
            return new NotificationFactory();
        }
        else {
            throw new Exception("Bad choice");
        }
    }
}
