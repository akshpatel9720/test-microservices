package com.user.service;

import com.user.entity.User;
import com.user.entity.UserDTO;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;

public interface UserService
{
    public User getUser(Long id);
    public void register(UserDTO userDTO) throws URISyntaxException;

    void delete(Long userId);
}
