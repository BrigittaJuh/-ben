package ÜbList4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(String title, String author, String isbn){
        books.add(new Book(title,author,isbn));
    }
    public void removeBookByIsbn(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> searchBookByTitle(String title){
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchBookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }

    public void listAllBook(){
        for (Book book : books){
            System.out.println(book);
        }
    }
    public void listBooksByAuthor(String author){
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author));
            System.out.println(book);
        }
    }
}
