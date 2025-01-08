package org.anve.LibraryManagementSystem.Repository;

import org.anve.LibraryManagementSystem.Entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity, Integer> {

}
