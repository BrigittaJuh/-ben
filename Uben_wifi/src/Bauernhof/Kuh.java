package Bauernhof;

public class Kuh extends Tier{
    private  double milch;
    public Kuh(String name, int alter, double milch) {
        super(name, alter);
        this.milch = milch;
    }
    @Override
    public void zeigeDetailis(){
        super.zeigeDetailis();
        System.out.println("Milch pro Tag: " + milch + "Liter");
    }

    public double getMilch() {
        return milch;
    }
}
