package Bauernhof;

public class Schaf extends Tier{
    private double wolle;
    public Schaf(String name, int alter, double wolle) {

        super(name, alter);
        this.wolle = wolle;
    }

    @Override
    public void zeigeDetailis(){
        super.zeigeDetailis();
        System.out.println("Wolle pro Tag :" + wolle + "kg");
    }

    public double getWolle() {
        return wolle;
    }
}
