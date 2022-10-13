package com.designPattern2;

public class HouseBuilder implements Builder {
    private BuildingType type;
    private int bedrooms;
    private int bathrooms;
    private boolean garden;

    @Override
    public void setBuildingType(BuildingType type) {
        this.type = type;
    }

    @Override
    public void setNumberOfBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public void setNumberOfBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public void setGarden(boolean garden) { this.garden = garden; }

    public House getResult() {
        return new House(type, bedrooms, bathrooms, garden);
    }
}
