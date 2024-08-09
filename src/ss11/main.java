package ss11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        // Add books to the list
        Book book1 = new Book("1", "John Smith","Java Programming", new Date(122, 1, 20),15,20.5);
        Book book2 = new Book("2", "John Smithaaa","Java Programmingaaaa", new Date(122, 12, 02),152,202.5);
        books.add(book1);
        books.add(book2);
        // Sort the books
        Collections.sort(books);

        // Print sorted books
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
