package src.test.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import src.main.java.com.ben.videoDownloaderProxy.*;
import src.main.java.com.ben.bannedSitesProxy.*;

public class bannedSitesTest {

    @Test
    public void bannedWebsiteProxyTest(){
        //Internet internet = new RealInternet();
        List<String> bannedWebsites;
        bannedWebsites = new ArrayList<>();
        bannedWebsites.add("fpl.com");
        bannedWebsites.add("bing.com");

        ProxyInternet proxyInternet = new ProxyInternet();
        String bannedSiteOne = proxyInternet.connectsTo(bannedWebsites.get(0));
        String bannedSiteTwo = proxyInternet.connectsTo(bannedWebsites.get(1));

        Assert.assertEquals(bannedSiteOne, "Access Denied");
        Assert.assertEquals(bannedSiteTwo, "Access Denied");
    }

    @Test
    public void usableAndBannedWebsiteProxyTest(){
        List<String> bannedWebsites;
        bannedWebsites = new ArrayList<>();
        bannedWebsites.add("fpl.com");
        bannedWebsites.add("bing.com");

        ProxyInternet proxyInternet = new ProxyInternet();
        String bannedSiteOne = proxyInternet.connectsTo(bannedWebsites.get(0));
        String bannedSiteTwo = proxyInternet.connectsTo(bannedWebsites.get(1));

        String usableSite = proxyInternet.connectsTo("google.com");

        Assert.assertEquals(bannedSiteOne, "Access Denied");
        Assert.assertEquals(bannedSiteTwo, "Access Denied");
        Assert.assertEquals(usableSite, "Opened connection to google.com");
    }

}
