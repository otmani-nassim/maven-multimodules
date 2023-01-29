package com.simopr.controllers;

import com.simopr.UserMapper;
import com.simopr.domain.UserCommand;
import com.simopr.entities.User;

public class UserController {

    User saveUser(UserCommand command){
        return UserMapper.INSTANCE.userCommandToUser(command);
        //return new User();
    }

}
