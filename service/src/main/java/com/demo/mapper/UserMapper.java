package com.demo.mapper;

import com.demo.entity.User;
import com.demo.request.UserRequest;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public User createUser (UserRequest userRequest){

        User user = new User();
        user.setUserName(userRequest.getUserName());
        user.setMobNumber(userRequest.getMobileNumber());
        return user ;
    }
}
