package org.anve.LibraryManagementSystem.Repository;

import org.anve.LibraryManagementSystem.Entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<BookEntity, Integer> {
}
