package ÜbList2;

public class Main {
    public static void main(String[] args) {
        NumberList nl = new NumberList();

        nl.addNumber(8);
        nl.addNumber(4);
        nl.addNumber(9);
        nl.addNumber(2);

        System.out.println("szamok listaja: ");
        nl.listNumber();

        System.out.println("összeg " + nl.sum());

        System.out.println("atalag:  " + nl.average());

        nl.removeNumber(9);

        System.out.println("Frisitett szamok listaja: ");
        nl.listNumber();
    }
}
