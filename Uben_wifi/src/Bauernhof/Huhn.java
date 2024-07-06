package Bauernhof;

public class Huhn extends Tier{
    private int eier;

    public Huhn(String name, int alter, int eier) {

        super(name, alter);
        this.eier = eier;
    }

    @Override
    public void zeigeDetailis() {
        super.zeigeDetailis();
        System.out.println("Eier pro Tag :" + eier);
    }

    public int getEier() {
        return eier;
    }
}
