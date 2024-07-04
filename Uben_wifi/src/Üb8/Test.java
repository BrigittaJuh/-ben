package Üb8;

public class Test {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "X5");
        Auto auto2 = new Auto("BMW", "X4");

        System.out.println("Auto 1 Marke : " + auto1.getMarke() + " modell :" + auto1.getModell());
        System.out.println("Auto 2 Marke : " + auto2.getMarke() + " modell :" + auto2.getModell());

    }
}
