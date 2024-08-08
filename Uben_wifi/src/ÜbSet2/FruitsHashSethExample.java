package ÜbSet2;

import java.util.HashSet;
import java.util.Set;

public class FruitsHashSethExample {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("alma");
        fruits.add("banan");
        fruits.add("dinnye");
        fruits.add("szöllö");

        fruits.remove("alma");

        String fruitToCheck = "dinnye";
        if (fruits.contains(fruitToCheck)){
            System.out.println(fruitToCheck + " , Benne van a halmazba");
        } else {
            System.out.println(fruitToCheck + " , nincs benne a halmazba");
        }
        System.out.println("A halmaz elemei: " + fruits);
    }

}
