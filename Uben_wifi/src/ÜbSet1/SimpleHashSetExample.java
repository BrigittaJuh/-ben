package ÜbSet1;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashSetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("anna");
        names.add("Bela");
        names.add("Csaba");

        names.add("Dora");

        String nameToCheck = "Bela";
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " benne van a halmazba");
        } else {
            System.out.println(nameToCheck + " nincs benne a halmazba");
        }
        names.remove("anna");

        System.out.println("a halmaz elemei :" + names);
    }



}
