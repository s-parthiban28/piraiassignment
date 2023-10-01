package com.pirai.file.manager.com.pirai.file.manager.service;

import com.pirai.file.manager.com.pirai.file.manager.model.UserEntity;

public interface UserService {
    UserEntity getUserDetails(String username);
    //UserEntity findByFacebookid(String username);
}
