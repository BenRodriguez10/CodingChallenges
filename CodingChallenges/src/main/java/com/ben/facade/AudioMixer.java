package src.main.java.com.ben.facade;

//Abstract representation of file and directory pathnames
//File(String pathname) Creates a new File instance by converting the given pathname string into an abstract pathname.
import java.io.File;

public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
