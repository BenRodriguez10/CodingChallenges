package src.main.java.com.ben.facade;

public class FileProcessor {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading File...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting File...");
        return buffer;
    }
}
