package ÜbOop7;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String model, int year) {
        super(model, year);
    }
    @Override
    public void move(){
        fly();
    }

    @Override
    public void fly(){
        System.out.println("The airplane fly");
    }
}
