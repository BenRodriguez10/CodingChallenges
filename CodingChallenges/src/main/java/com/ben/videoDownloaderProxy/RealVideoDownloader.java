package src.main.java.com.ben.videoDownloaderProxy;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName){

        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading video");
        System.out.println("Retrieve metadata");
        return new Video(videoName);
    }
}
