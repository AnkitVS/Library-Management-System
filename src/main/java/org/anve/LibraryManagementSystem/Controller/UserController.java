package org.anve.LibraryManagementSystem.Controller;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.anve.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/user/{id}")
    @ResponseBody
    public UserEntity get(@PathVariable String id){
       return userService.getUser(id);
    }
    @PutMapping("/user")
    @ResponseBody
    public void update(@RequestBody UserEntity user){
        userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        userService.deleteUser(id);
    }

    @PostMapping("/user/")
    @ResponseBody
    public void add(@RequestBody UserEntity user){
        userService.addUser(user);
    }

}
