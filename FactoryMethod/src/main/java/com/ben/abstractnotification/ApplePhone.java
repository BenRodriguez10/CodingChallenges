package com.ben.abstractnotification;

public class ApplePhone extends Phone{

    @Override
    public void getRam() {
        System.out.println("16GB");
    }

    @Override
    public String getOperatingSystem() {
        String os = "Apple Phone";
        return os;
    }

}
