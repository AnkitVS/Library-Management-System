package org.anve.LibraryManagementSystem.Controller;

import org.anve.LibraryManagementSystem.Entity.BookEntity;
import org.anve.LibraryManagementSystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/book")
    @ResponseBody
    public List<BookEntity> book() {
        System.out.println("inside book controller");
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    @ResponseBody
    public BookEntity book(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/book")
    @ResponseBody
    public BookEntity updateBook(@RequestBody BookEntity book) {
        return bookService.updateBook(book);
    }

    @PostMapping("/book")
    @ResponseBody
    public BookEntity createBook(@RequestBody BookEntity book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/book/{id}")
    @ResponseBody
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
