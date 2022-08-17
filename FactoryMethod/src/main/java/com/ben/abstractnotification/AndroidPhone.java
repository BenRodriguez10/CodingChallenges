package com.ben.abstractnotification;

public class AndroidPhone extends Phone{

    @Override
    public void getRam() {
        System.out.println("12GB");
    }

    @Override
    public String getOperatingSystem() {
        String os = "Android Phone";
        return os;
    }

}
