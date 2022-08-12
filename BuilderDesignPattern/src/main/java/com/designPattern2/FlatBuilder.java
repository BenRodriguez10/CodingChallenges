package com.designPattern2;

/**
  Concrete builders implement steps defined in the common interface.
 
  Unlike other creational patterns, Builder can construct unrelated products,
  which don't have the common interface.
 
  In this case we build a user manual for a car, using the same steps as we
  built a car. This allows to produce manuals for specific car models,
  configured with different features.
*/

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
