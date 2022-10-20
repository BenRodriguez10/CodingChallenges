package src.main.java.com.ben.facade;

public class CodecFactory {
    public static Codec extractVideo(VideoFile videoFile){
        String typeOfCompression = videoFile.getCodecType();
        if (typeOfCompression.equals("dolby")){
            System.out.println("CodecFactory: looking to extract dolby visuals and audio");
            return new DolbyTrueHdCodec();
        }
        else if (typeOfCompression.equals("mp3")){
            System.out.println("CodecFactory: extracting mpeg3 audio...");
            return new MP3CompressionCodec();
        }
        else if (typeOfCompression.equals("mp4")){
            System.out.println("CodecFactory: extracting mpeg4 audio...");
            return new MP4CompressionCodec();
        }
        else return null;
    }
}
