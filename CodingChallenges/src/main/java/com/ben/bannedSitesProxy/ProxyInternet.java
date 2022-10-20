package src.main.java.com.ben.bannedSitesProxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static final List<String> bannedWebsites;
    private final Internet internet = new RealInternet();

    static {
        bannedWebsites = new ArrayList<>();
        bannedWebsites.add("fpl.com");
        bannedWebsites.add("bing.com");
    }

    @Override
    public String connectsTo(String host){
        if (bannedWebsites.contains(host)){
        return "Access Denied";
        }

        return internet.connectsTo(host);
    }
}
