package com.demo.service;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.repository.UserRepository;
import com.demo.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository ;
   @Autowired
    private UserMapper userMapper;

    public void createUser (UserRequest userRequest){
       User user = userMapper.createUser(userRequest);
       userRepository.save(user);
    }



}