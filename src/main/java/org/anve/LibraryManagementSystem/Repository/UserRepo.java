package org.anve.LibraryManagementSystem.Repository;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, String> {

}
