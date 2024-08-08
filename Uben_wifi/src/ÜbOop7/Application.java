package ÜbOop7;

public class Application {
    public static void main(String[] args) {
        Vehicle car = new Car("er", 455);

        Vehicle airplane = new Airplane("boing", 85);

        car.move();
        airplane.move();

        Vehicle[] vehicles = {car, airplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }

        }
    }
}