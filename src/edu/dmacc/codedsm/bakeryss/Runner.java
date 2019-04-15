package edu.dmacc.codedsm.bakeryss;

import edu.dmacc.codedsm.bakeryss.delivery.Car;
import edu.dmacc.codedsm.bakeryss.delivery.Vehicle;

public class Runner {

    public static void main(String[] args) {
        processVehicle(new Car());
    }

    public static void processVehicle(Vehicle v) {
        v.drive(10);
    }
}
