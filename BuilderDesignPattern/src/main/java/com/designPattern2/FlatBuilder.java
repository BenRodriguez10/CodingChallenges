package com.designPattern2;

public class FlatBuilder implements Builder {
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
    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public Flat getResult() {
        return new Flat(type, bedrooms, bathrooms, garden);
    }
}
