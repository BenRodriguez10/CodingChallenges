package src.main.java.com.ben.videoDownloaderProxy;

public class Client {
    public static void main(String args[]) {
        
        VideoDownloader vd = new ProxyVideoDownloader();
        vd.getVideo("java");
        vd.getVideo("c#");
        vd.getVideo("java");
        vd.getVideo("python");
        vd.getVideo("go");
        vd.getVideo("python");
        vd.getVideo("java");
    }
}