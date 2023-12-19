package inheritance;

import inheritance.Vehicle;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Car is moving...");
    }
}
