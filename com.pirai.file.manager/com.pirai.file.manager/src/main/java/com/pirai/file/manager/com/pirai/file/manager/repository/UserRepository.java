package com.pirai.file.manager.com.pirai.file.manager.repository;

import com.pirai.file.manager.com.pirai.file.manager.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByGmailidOrFacebookid(String gmailid,String facebookid);
   // UserEntity findByFacebookid(String userName);
}
