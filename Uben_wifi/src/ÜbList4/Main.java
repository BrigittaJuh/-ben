package ÜbList4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lb = new Library();

        lb.addBook("Harry Potter es a bölcsek köve", "J.K. Rowling", "1234567890");
        lb.addBook("Harry Potter es a tü serlege", "J.K. Rowling", "1234567890");
        lb.addBook("Harry Potter es az azkabani fogoly", "J.K. Rowling", "1234567890");
        lb.addBook("The Hobbit", "J.R.R. Tolkien", "0987654321");
        lb.addBook("The Hobbit a nayg utazas", "J.R.R. Tolkien", "0987654321");
        lb.addBook("1984", "George Orwell", "1122334455");

        System.out.println("Az összes könyv:");
        lb.listAllBook();

        lb.removeBookByIsbn("1122334455");

        System.out.println("Frissitett lista :");
        lb.listAllBook();

        System.out.println("kereses a cim alapjan: Harry Potter" );
        List<Book> foundBooks = lb.searchBookByTitle("Harry Potter es a tü serlege");
        for (Book book : foundBooks){
            System.out.println(book);
        }

        System.out.println("kereses a szerzö alapjan");
       foundBooks = lb.searchBookByAuthor("J.R.R. Tolkien");
       for (Book book : foundBooks){
           System.out.println(book);
       }

    }
}
