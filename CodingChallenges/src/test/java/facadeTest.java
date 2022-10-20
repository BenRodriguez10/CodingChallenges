package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.ben.bannedSitesProxy.Internet;
import src.main.java.com.ben.bannedSitesProxy.ProxyInternet;
import src.main.java.com.ben.bannedSitesProxy.RealInternet;
import src.main.java.com.ben.facade.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class facadeTest {

    @Test
    public void videoConverterFacadeConvertToDolbyTest(){
        String fileName = "youtube.mp4";
        String target = "dolby";

        VideoConverterFacade converter = new VideoConverterFacade();

        File convertMp4ToDolby = converter.convertVideo(fileName, target);

        VideoFile file = new VideoFile(fileName, target);
        Codec sourceCodec = CodecFactory.extractVideo(file);
        Codec destinationCodec = new DolbyTrueHdCodec();
        VideoFile buffer = FileProcessor.read(file, sourceCodec);
        VideoFile intermediateResult = FileProcessor.convert(buffer, destinationCodec);

        File targetFormatFile = AudioMixer.fix(intermediateResult);

        Assert.assertEquals(convertMp4ToDolby, targetFormatFile);
    }
}
