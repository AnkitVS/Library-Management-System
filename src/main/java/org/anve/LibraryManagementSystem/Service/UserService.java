package org.anve.LibraryManagementSystem.Service;

import org.anve.LibraryManagementSystem.DAO.UserDAO;
import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<UserEntity> getAllUsers() {
        return userDAO.getAllUsers();
    }
    public UserEntity getUser(String id) {
        return userDAO.getUser(id);
    }
    public String addUser(UserEntity user) {
        if (userDAO.updateUser(user)==null)
            return "Added Successfully";
        else
            return "Not Added";
    }
    public String updateUser(UserEntity user) {
        if (userDAO.updateUser(user)==null)
            return "Updated Successfully";
        else
            return "Not Updated";
    }
    public String deleteUser(String id) {
        if (userDAO.deleteUser(id)==null)
            return "Deleted Successfully";
        else
            return "Not Deleted";
    }

}
