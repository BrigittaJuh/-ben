package ÜbOOP4;

public class Application {
    public static void main(String[] args) {
        Transport myTruck = new Truck();
        Transport myShip = new Ship();

        myShip.deliver();
        myTruck.deliver();
    }
}
