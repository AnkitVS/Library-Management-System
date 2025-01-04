package org.anve.LibraryManagementSystem.Controller;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.anve.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }
    @RequestMapping("/{id}")
    @ResponseBody
    public UserEntity get(@PathVariable String id){
       return userService.getUser(id);
    }
    @RequestMapping("/update/")
    @ResponseBody
    public void update(UserEntity user){
        userService.updateUser(user);
    }
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        userService.deleteUser(id);
    }

    @RequestMapping("/add/{id}")
    @ResponseBody
    public void add(UserEntity user){
        userService.addUser(user);
    }

}
