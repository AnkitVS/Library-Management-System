package org.anve.LibraryManagementSystem.Service;

import org.anve.LibraryManagementSystem.Entity.AuthorEntity;
import org.anve.LibraryManagementSystem.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo repo;

    public List<AuthorEntity> getAllAuthors() {
        return repo.findAll();
    }

    public AuthorEntity getAuthorById(int id) {
        return repo.findById(id).get();
    }

    public AuthorEntity createAuthor(AuthorEntity author) {
        return repo.save(author);
    }

    public AuthorEntity updateAuthor(AuthorEntity author) {
        return repo.save(author);
    }

    public void deleteAuthor(int id) {
        repo.deleteById(id);
    }
}
