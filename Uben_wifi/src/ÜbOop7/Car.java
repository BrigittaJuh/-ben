package ÜbOop7;

public class Car extends Vehicle implements Drivable{
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    public  void move(){
        drive();
    }
    @Override
    public void drive(){
        System.out.println("The car dirive");
    }

}
