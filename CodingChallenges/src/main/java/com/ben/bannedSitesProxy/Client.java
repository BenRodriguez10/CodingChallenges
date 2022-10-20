package src.main.java.com.ben.bannedSitesProxy;

public class Client {
    public static void main(String args[]) throws Exception {
        
        Internet internet = new ProxyInternet();
        internet.connectsTo("google.com");
        internet.connectsTo("fpl.com");
        internet.connectsTo("bing.com");
    }
}