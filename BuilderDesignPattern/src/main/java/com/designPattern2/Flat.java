package com.designPattern2;

public class Flat {

    private final BuildingType buildingType;
    private final int bedrooms;
    private final int bathrooms;
    private final boolean garden;

    public Flat(BuildingType buildingType, int bedrooms, int bathrooms, boolean garden) {
        this.buildingType = BuildingType.FLAT;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.garden = garden;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean getGarden() {
        return garden;
    }

    public String print() {
        String info = "";
        info += "Building type: " + buildingType + "\n";
        info += "Number of bedrooms: " + bedrooms + "\n";
        info += "Number of bathrooms: " + bathrooms + "\n";
        info += "Does the flat have a garden? " + garden + "\n";
     return info;
    }
}