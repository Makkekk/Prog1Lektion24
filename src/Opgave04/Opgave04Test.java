package Opgave04;

import Opgave04.Models.Car;
import Opgave04.Storage.CarStorage;

import java.util.ArrayList;

public class Opgave04Test {
    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage();

        int testSpeed = 200;
        Car fasterCar = carStorage.findFirstCarWithHigerSpeed(testSpeed);
        if (fasterCar != null) {
            System.out.println("First car with speed higher than " + testSpeed + ": " + fasterCar.getBrand() + " " + fasterCar.getModel()
                    + " with top speed of " + fasterCar.getTopSpeed());
            ;

        } else {
            System.out.println("No car found with topspeed higher than" + testSpeed);
        }


        String testBrand = "Tesla";
        Car brandCar = carStorage.findCarByBrand(testBrand);
        if (brandCar != null) {
            System.out.println("First car with brand " + testBrand + ": "
                    + brandCar.getBrand() + " " + brandCar.getModel() + " with top speed of " + brandCar.getTopSpeed());;
        } else {
            System.out.println("No car found with brand " + testBrand + "Null");
        }

    }
}

