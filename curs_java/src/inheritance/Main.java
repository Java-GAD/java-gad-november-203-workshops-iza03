package inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("GenericBrand");
        vehicle.start();
        vehicle.stop();

        System.out.println();
        Car car = new Car("Toyota", 4);
        car.start();
        car.drive();
        car.stop();
    }
}
