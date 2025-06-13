package iti.jets.user.controller;


import iti.jets.user.dto.*;
import iti.jets.user.entity.*;
import iti.jets.user.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDetails> getAllUsers() {
        return userService.getAllUsers();
    }


    @Value("${server.port}")
    private String msg;

    @GetMapping("/message")
    public String getMessage() {
        return msg;
    }
}
