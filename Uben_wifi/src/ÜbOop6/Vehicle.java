package ÜbOop6;

public abstract class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void startEngine(){
        System.out.println("Engine strated.");
    }

    public abstract void move();
}
