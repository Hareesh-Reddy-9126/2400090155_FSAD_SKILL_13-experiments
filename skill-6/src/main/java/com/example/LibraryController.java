package main.java.com.example;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LibraryController {
    private List<Book> bookList = new ArrayList<>();

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Online Library!";
    }

    @GetMapping("/count")
    public int count() {
        return 5; // Sample total books
    }

    @GetMapping("/price")
    public double price() {
        return 299.99; // Sample book price
    }

    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Java Basics", "Spring Boot", "Hibernate", "Microservices", "RESTful APIs");
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        // Sample book details
        return new Book(id, "Sample Book", "Sample Author", 199.99);
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Search confirmed for book: " + title;
    }

    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Author: " + name;
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added: " + book.getTitle();
    }

    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
