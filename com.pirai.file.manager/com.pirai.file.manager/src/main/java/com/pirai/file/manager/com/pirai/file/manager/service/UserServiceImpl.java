package com.pirai.file.manager.com.pirai.file.manager.service;

import com.pirai.file.manager.com.pirai.file.manager.model.UserEntity;
import com.pirai.file.manager.com.pirai.file.manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

 @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity getUserDetails(String username) {
        UserEntity userEntity = userRepository.findByGmailidOrFacebookid(username,username);

        return null;
    }
}
