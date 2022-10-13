package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.ben.bannedSitesProxy.Internet;
import src.main.java.com.ben.bannedSitesProxy.ProxyInternet;
import src.main.java.com.ben.bannedSitesProxy.RealInternet;

import java.util.ArrayList;
import java.util.List;

public class videoDownloaderProxyTest {

    @Test
    public void videoProxyTEst(){

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
