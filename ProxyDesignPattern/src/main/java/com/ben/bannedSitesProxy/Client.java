package com.ben.bannedSitesProxy;

import java.io.IOException;

public class CreateNotification {
    public static void main(String args[]) throws Exception {
        
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("fpl.com");
    }
}