package com.ben.bannedSitesProxy;

public class ProxyInternet implements Internet {
    private static final List<String> bannedWebsites;
    private final Internet internet = new RealInternet();

    static {
        bannedWebsites = new ArrayList<>();
        bannedWebsites.add("fpl.com")
    }

    @Override
    public void connectTo(String host){
        if (bannedWebsites.contains(host)){
        System.out.println("Access Denied);
        return;}
        internet.connectTo(host);
    }
}
