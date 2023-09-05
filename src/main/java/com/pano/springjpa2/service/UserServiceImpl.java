package com.pano.springjpa2.service;

import com.pano.springjpa2.entity.UserEntity;
import com.pano.springjpa2.model.User;
import com.pano.springjpa2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
