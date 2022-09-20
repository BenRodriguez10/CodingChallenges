package com.ben.videoDownloaderProxy;

import java.io.IOException;

public class CreateNotification {
    public static void main(String args[]) throws Exception {
        
        VideoDownloader vd = new ProxyVideoDownlaoder();
        vd.getVideo("java");
        vd.getVideo("c#");
        vd.getVideo("java");
        vd.getVideo("python");
    }
}