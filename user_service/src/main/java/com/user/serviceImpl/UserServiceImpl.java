package com.user.serviceImpl;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.entity.UserDTO;
import com.user.repository.UserRepository;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    public UserRepository userRepository;
//    List<User> list = List.of(
//            new User(1111L, "aksh patel", "9662924122"),
//            new User(2222L, "sahil patel", "123"),
//            new User(3333L, "hardik patel", "8888")
//
//    );

    @Override
    public User getUser(Long id) {
        User users = userRepository.findById(id).get();
        UserDTO userDTO = new UserDTO();
        List<UserDTO> userDTOList = new ArrayList<>();

        return users;
    }

    @Override
    public void register(UserDTO userDTO) throws URISyntaxException {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.set("Content-Type", String.valueOf(MediaType.APPLICATION_JSON_VALUE));
        User user = new User();
        user.setName(userDTO.getName());
        User existUser=  userRepository.save(user);

        User newUser = userRepository.findById(existUser.getUserId()).get();

        Contact contact = new Contact();
        for (String phoneNo: userDTO.getPhoneNo()) {
            for (String email: userDTO.getEmail()) {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);

                URI url = new URI("http://localhost:2222/contact/saveUser");

                contact.setContactName(newUser.getName());
                contact.setUserId(newUser.getUserId());
                contact.setEmail(email);
                contact.setPhoneNo(phoneNo);

                HttpEntity<Contact> requestEntity = new HttpEntity<>(contact, headers);

                ResponseEntity<Contact> responseEntity = restTemplate.exchange(url,HttpMethod.POST, requestEntity, Contact.class);
            }
        }


//        return null;

    }

    @Override
    public void delete(Long userId) {
        userRepository.deleteById(userId);
        String URL="http://localhost:2222/contact/delete/"+userId;
        restTemplate.delete(URL);
    }
}
