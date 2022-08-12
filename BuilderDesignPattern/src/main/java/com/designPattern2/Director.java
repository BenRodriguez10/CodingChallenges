package com.designPattern2;

public class Director {
    public void constructBuilding(Builder builder) {

    }

    public void constructBuilding2(Builder builder) {
        builder.setBuildingType(BuildingType.FLAT);
        builder.setNumberOfBedrooms(1);
        builder.setNumberOfBathrooms(1);
        builder.setGarden(true);
    }
}
