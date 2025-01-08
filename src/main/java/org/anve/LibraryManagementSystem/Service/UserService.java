package org.anve.LibraryManagementSystem.Service;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.anve.LibraryManagementSystem.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public List<UserEntity> getAllUsers() {
        return repo.findAll();
    }

    public UserEntity getUser(String id) {
        return repo.findById(id).get();
    }

    public void updateUser(UserEntity user) {
        repo.save(user);
    }

    public void deleteUser(String id) {
        repo.deleteById(id);
    }

    public void addUser(UserEntity user) {
        repo.save(user);
    }

    /*Additional Functions*/
    public String loginUser(String userId,String password) {
        return ((repo.findByUseridAndPassword(userId,password)!=null)?"User Present":"User Not Present");
    }

}
