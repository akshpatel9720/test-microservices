package com.user.service;

import com.user.entity.User;
import com.user.entity.UserDTO;

import java.util.List;

public interface UserService
{
    public List<UserDTO> getUser(Long id);
    public User register(User user);
}
