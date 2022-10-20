package src.main.java.com.ben.facade;

import java.io.File;

public class Client {
    public static void main(String args[]) {

        VideoConverterFacade converter = new VideoConverterFacade();
        File dolbyVideo = converter.convertVideo("youtubevideo.mp4", "dolby");
    }
}