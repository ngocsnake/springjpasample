package com.pano.springjpa2.service;

import com.pano.springjpa2.entity.UserEntity;
import com.pano.springjpa2.model.User;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
}
