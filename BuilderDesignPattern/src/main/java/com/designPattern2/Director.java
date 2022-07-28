package com.designPattern2;

public class Director {
    public void constructHouse(Builder builder) {
        builder.setBuildingType(BuildingType.HOUSE);
        builder.setNumberOfBedrooms(2);
    }

    public void constructFlat(Builder builder) {
        builder.setBuildingType(BuildingType.FLAT);
        builder.setNumberOfBedrooms(1);
        builder.setNumberOfBathrooms(1);
        builder.setGarden(true);
    }
}
