package Bauernhof;

public class Tier {
    private String name;
    private int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    public void zeigeDetailis(){
        System.out.println("Name: " + name + ", Alter: " + alter);
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }
}
