package org.anve.LibraryManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/login")
    public String userLogin() {
        System.out.println("Inside home page");
        return "userlogin";
    }
    @RequestMapping("/register")
    public String UserRegister() {
        System.out.println("Inside registration page");
        return "userregister";
    }
}
