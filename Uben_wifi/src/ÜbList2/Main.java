package ÜbList2;

public class Main {
    public static void main(String[] args) {
        NumberList nl = new NumberList();
        nl.addNumber(5);
        nl.addNumber(9);
        nl.addNumber(8);
        nl.addNumber(2);

        System.out.println("Szamok listaja: ");
        nl.listNumbers();

        System.out.println("Összeg :" + nl.sum());
        System.out.println("Atlag: " + nl.average());

        nl.remoteNumbers(8);

        System.out.println("Frissitett szamok :");
        nl.listNumbers();
    }
}
