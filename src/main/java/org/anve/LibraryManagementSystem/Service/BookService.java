package org.anve.LibraryManagementSystem.Service;

import org.anve.LibraryManagementSystem.Entity.BookEntity;
import org.anve.LibraryManagementSystem.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService
{
    @Autowired
    BooksRepo repo;

    public List<BookEntity> getAllBooks(){
        System.out.println("getAllBooks");
        return repo.findAll();
    }

    public BookEntity getBookById(int id){
        return repo.findById(id).get();
    }

    public BookEntity addBook(BookEntity book){
        return repo.save(book);
    }

    public BookEntity updateBook(BookEntity book){
        return repo.save(book);
    }

    public void deleteBook(int id){
        repo.deleteById(id);
    }

}
