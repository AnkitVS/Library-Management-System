package org.anve.LibraryManagementSystem.Repository;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, String> {

    UserEntity findByUseridAndPassword(String userid, String password);
}
