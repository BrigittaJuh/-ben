package ÜbSet4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Anna");
        namesList.add("Bela");
        namesList.add("Anna");
        namesList.add("Csaba");

        System.out.println("Eredeti lista: " + namesList);

        List<String> uniqueNameList = removeDuplicates((List<String>) namesList);
        System.out.println("Lista duplikalt elemek nelkül: " + uniqueNameList);

    }

    public static List<String> removeDuplicates(List<String> list){
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
