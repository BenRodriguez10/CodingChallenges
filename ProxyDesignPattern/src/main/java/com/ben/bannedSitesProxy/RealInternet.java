package com.ben.bannedSitesProxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host){
        System.out.println("Opened connection to " + host);
    }
}
