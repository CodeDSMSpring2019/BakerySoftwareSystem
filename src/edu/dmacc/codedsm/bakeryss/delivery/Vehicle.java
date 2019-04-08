package edu.dmacc.codedsm.bakeryss.delivery;

public class Vehicle implements Drivable, Transportation{

    private String owner;
    private String make;
    private String color;

    public Vehicle(String owner, String make, String color) {
        this.owner = owner;
        this.make = make;
        this.color = color;
    }

    public Vehicle() {
    }

    @Override
    public Boolean drive(Integer miles) {
        System.out.println("vehicle");
        return false;
    }

    @Override
    public Integer calculateDuration(Integer distance) {
        return 0;
    }
}
