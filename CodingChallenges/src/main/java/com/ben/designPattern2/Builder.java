package com.designPattern2;

/**
 * Builder interface defines all possible ways to configure a product.
 */

public interface Builder {
    
    void setBuildingType(BuildingType type);
    void setNumberOfBedrooms(int bedrooms);
    void setNumberOfBathrooms(int bathrooms);
    void setGarden(boolean garden);
}
