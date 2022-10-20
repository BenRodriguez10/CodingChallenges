package com.designPattern2;

public class Client {
    public static void main(String a[]) {
        
        Director director = new Director();

        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.setBuildingType(BuildingType.HOUSE);
        houseBuilder.setNumberOfBedrooms(5);
        houseBuilder.setNumberOfBathrooms(3);
        houseBuilder.setGarden(true);

        director.constructBuilding(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println("House Constructed: " + house.print());

        FlatBuilder flatBuilder = new FlatBuilder();
        flatBuilder.setBuildingType(BuildingType.FLAT);
        flatBuilder.setNumberOfBedrooms(4);
        flatBuilder.setNumberOfBathrooms(2);

        director.constructBuilding(flatBuilder);
        
        Flat flat = flatBuilder.getResult();
        System.out.println("Flat Constructed: " + flat.print());
    }

}
