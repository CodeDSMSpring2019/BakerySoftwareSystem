package edu.dmacc.codedsm.bakeryss.delivery;

import java.util.List;

public class Car extends Vehicle {

    private Integer doors;
    private String style;

    public Car() {

    }

    public Car(String owner, String make, String color, Integer doors, String style) {
        super(owner, make, color);
        this.doors = doors;
        this.style = style;
    }

    public Car(String owner, String make, String color) {
        super(owner, make, color);
        this.doors = 4;
        this.style = "sedan";
    }

    public Car(List<String> parts) {
        this("me", "ford", "blue", 2, "suv");
        //work with parts to make a car
    }

    //    @Override
//    public void drive(Integer miles) {
//        System.out.println("car");
//    }
}
