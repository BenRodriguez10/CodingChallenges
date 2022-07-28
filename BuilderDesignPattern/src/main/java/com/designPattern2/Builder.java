package com.designPattern2;

public interface Builder {
    void setBuildingType(BuildingType type);
    void setNumberOfBedrooms(int bedrooms);
    void setNumberOfBathrooms(int bathrooms);
    void setGarden(boolean garden);
}
