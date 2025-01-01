package org.anve.LibraryManagementSystem.Controller;

import org.anve.LibraryManagementSystem.Entity.UserEntity;
import org.anve.LibraryManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EntityScan(basePackages = "org.anve.demoWebApp.Entity")
public class UserController {

    @Autowired
    private UserService userService;

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
    public String update(UserEntity user){
        return userService.updateUser(user);
    }
    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable String id){
        return userService.deleteUser(id);
    }

    @RequestMapping("/add/{id}")
    @ResponseBody
    public String add(UserEntity user){
        return userService.addUser(user);
    }

}
