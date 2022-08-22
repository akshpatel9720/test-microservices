package com.user.service;

import com.user.entity.User;
import com.user.entity.UserDTO;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;
//    List<User> list = List.of(
//            new User(1111L, "aksh patel", "9662924122"),
//            new User(2222L, "sahil patel", "123"),
//            new User(3333L, "hardik patel", "8888")
//
//    );

    @Override
    public List<UserDTO> getUser(Long id) {
        List<User> users= userRepository.findAll();
        UserDTO userDTO=new UserDTO();
        List<UserDTO> userDTOList=new ArrayList<>();

        for (User u:users) {
            userDTO.setUserId(u.getUserId());
            userDTO.setName(u.getName());
            userDTO.setCid(u.getCid());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public User register(User user){
        return userRepository.save(user);
    }
}
