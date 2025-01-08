package org.anve.LibraryManagementSystem.Controller;

import org.anve.LibraryManagementSystem.Entity.AuthorEntity;
import org.anve.LibraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/author")
    @ResponseBody
    public List<AuthorEntity> getAuthor() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    @ResponseBody
    public AuthorEntity getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping("/author")
    @ResponseBody
    public AuthorEntity addAuthor(@RequestBody AuthorEntity author) {
        return authorService.createAuthor(author);
    }

    @PutMapping("/author")
    @ResponseBody
    public AuthorEntity updateAuthor(@RequestBody AuthorEntity author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/author")
    @ResponseBody
    public void deleteAuthor(@RequestBody int id) {
        authorService.deleteAuthor(id);
    }

}
