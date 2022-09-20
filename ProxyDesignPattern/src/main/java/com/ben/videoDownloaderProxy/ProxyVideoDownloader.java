package com.ben.videoDownloaderProxy;

public class ProxyVideoDownloader implements VideoDownloader {
    private static final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();


    @Override
    public Video getVideo(String videoName){
        if (!videoCache.containsKey(videoName)){
                videoCache.put(videoName, downloader.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
