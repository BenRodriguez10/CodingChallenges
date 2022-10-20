package src.main.java.com.ben.facade;

import java.io.File;

public class VideoConverterFacade {
    public File convertVideo(String fileName, String format) {

        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile(fileName, format);
        Codec sourceCodec = CodecFactory.extractVideo(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new MP4CompressionCodec();
        } else if (format.equals("mp3")) {
            destinationCodec = new MP3CompressionCodec();
        } else {
            destinationCodec = new DolbyTrueHdCodec();
        }

        VideoFile buffer = FileProcessor.read(file, sourceCodec);
        VideoFile intermediateResult = FileProcessor.convert(buffer, destinationCodec);

        File result = AudioMixer.fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed to " + format);

        return result;
    }
}
