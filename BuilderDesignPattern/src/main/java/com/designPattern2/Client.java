package com.designPattern2;

public class Client {
    public static void main(String a[]) {
        
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructHouse(builder);
        House house = builder.getResult();

        System.out.println("House Constructed: " + house.print());

        FlatBuilder flatBuilder = new FlatBuilder();
        director.constructFlat(flatBuilder);
        Flat flat = flatBuilder.getResult();
        
        System.out.println("Flat Constructed: " + flat.print());
    }

}
