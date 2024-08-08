package ÜbSet3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryBooksHashSetExample {
    public static void main(String[] args) {
        Set<String> book = new HashSet<>();
        book.add("Harry Potter");
        book.add("Kis herceg");
        book.add("vuk");
        book.add("Conni");
        book.add("Java programozas");

        String bookToCheck = "vuk";
        if (book.contains(bookToCheck)) {
            System.out.println(bookToCheck + " , a halmaz resze");
        } else {
            System.out.println(bookToCheck + " , nem a halmaz resze");
        }
        book.remove("Conni");

        List<String> bookList = convertSetToList(book);
        System.out.println("A halmaz elemei listakent :" + bookList);

        System.out.println("A halmaz elemei: " + book);



    }
    public static List<String> convertSetToList(Set<String> set){
        return new ArrayList<>(set);
    }
}
