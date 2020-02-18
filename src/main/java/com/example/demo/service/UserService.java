package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

        public User getUserById(String userId);

        boolean addUser(User record);


}
