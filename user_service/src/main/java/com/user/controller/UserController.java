package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.entity.UserDTO;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser")
    public UserDTO getUser(@RequestParam("userId") Long userId) {
        User user = userService.getUser(userId);
        UserDTO userDTO=new UserDTO();
        List<Contact> contacts = this.restTemplate.getForObject("http://localhost:2222/contact/getContactByUserId?userId=" + userId, List.class);
        userDTO.setUserId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setContacts(contacts);
        return userDTO;
    }

    @PostMapping("/saveUser")
    public void register(@RequestBody UserDTO userDTO) throws URISyntaxException {
         userService.register(userDTO);

    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam("userId") Long userId) throws URISyntaxException {
        userService.delete(userId);

    }

}
