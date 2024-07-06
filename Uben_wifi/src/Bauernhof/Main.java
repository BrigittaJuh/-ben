package Bauernhof;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kuh: ");
        Kuh kuh = new Kuh("Milka", 5,2);
        kuh.zeigeDetailis();

        System.out.println("Schaf: ");
        Schaf schaf = new Schaf("Scharfi", 2, 1);
        schaf.zeigeDetailis();

        System.out.println("Huhn: ");
        Huhn huhn = new Huhn("Huh", 1, 2);
        huhn.zeigeDetailis();
    }
}
