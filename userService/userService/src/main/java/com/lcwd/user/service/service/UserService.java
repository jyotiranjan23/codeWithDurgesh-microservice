package com.lcwd.user.service.service;

import com.lcwd.user.service.entity.User;

import java.util.List;

public interface UserService {
    //create User
    User saveUser(User user);
    //get all user
    List<User> getAllUser();
    //get Single user based on the given Id.
    User getUser(String id);
    //TODO delete
    //TODO update

}
