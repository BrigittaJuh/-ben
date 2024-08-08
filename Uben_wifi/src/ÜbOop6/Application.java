package ÜbOop6;

public class Application {
    public static void main(String[] args) {


        Vehicle car = new Car("Reanault", 2026);
        Vehicle bicycle = new Bicycle("ktm", 2012);

        car.startEngine();
        car.move();

        bicycle.startEngine();
        bicycle.move();
    }
}
