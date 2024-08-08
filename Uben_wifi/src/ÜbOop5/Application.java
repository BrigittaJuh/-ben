package ÜbOop5;

public class Application {
    public static void main(String[] args) {
        Transport myTruck = new Truck();
        Transport myShip = new Ship();
        Transport myAirplane = new Airplane();
        myTruck.deliver();
        myShip.deliver();
        myAirplane.deliver();

        Transport[] transports = {myShip, myShip, myAirplane};
        for (Transport transport : transports){
            transport.deliver();
        }


    }
}
