package com.user.controller;

import com.user.entity.User;
import com.user.entity.UserDTO;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public UserDTO getUser(@PathVariable("userId") Long userId) {
        UserDTO user = (UserDTO) this.userService.getUser(userId);
        List contacts = this.restTemplate.getForObject("http://localhost:2222/contact/user/" + userId, List.class);
//        user.setContacts(contacts);
        return user;
    }

    @PostMapping("/saveUser")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

}
