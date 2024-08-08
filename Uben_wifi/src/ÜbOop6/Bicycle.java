package ÜbOop6;

public class Bicycle extends Vehicle{
    public Bicycle(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("The bicycle is pedaling");
    }
}
