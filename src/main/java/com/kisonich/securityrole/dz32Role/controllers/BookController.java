package com.kisonich.securityrole.dz32Role.controllers;



import com.kisonich.securityrole.dz32Role.exception.BookNotFoundException;
import com.kisonich.securityrole.dz32Role.model.Book;
import com.kisonich.securityrole.dz32Role.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id) throws BookNotFoundException {
        return bookService.getBook(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable long id, @RequestBody Book updatedBook) throws BookNotFoundException {
        return bookService.updateBook(id, updatedBook);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id) throws BookNotFoundException {
        bookService.deleteBook(id);
    }
}