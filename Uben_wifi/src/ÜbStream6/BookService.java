package ÜbStream6;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    public List<String> getPublishedBookTitles(List<Book> books) {
        return books.stream()
                .filter(Book::published) // Csak a publikalt könyveket szüri
                .map(Book::title)   //csak a cimeket csereli vissza
                .collect(Collectors.toList());

    }
}
