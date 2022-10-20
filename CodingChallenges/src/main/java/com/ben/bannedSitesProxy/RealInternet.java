package src.main.java.com.ben.bannedSitesProxy;

public class RealInternet implements Internet {

    @Override
    public String connectsTo(String host){
        return "Opened connection to " + host;
    }
}
