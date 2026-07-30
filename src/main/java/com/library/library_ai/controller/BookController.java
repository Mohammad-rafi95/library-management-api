package com.library.library_ai.controller;

import com.library.library_ai.model.Book;
import com.library.library_ai.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // Add a book (POST)
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // View all books (GET)
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Search book by ID (GET)
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    // Update a book (PUT)
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setIsbn(updatedBook.getIsbn());
        existingBook.setPublishedYear(updatedBook.getPublishedYear());
        existingBook.setGenre(updatedBook.getGenre());
        existingBook.setSummary(updatedBook.getSummary());
        
        return bookRepository.save(existingBook);
    }

    // Delete a book (DELETE)
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "Book with id " + id + " deleted successfully!";
    }
}