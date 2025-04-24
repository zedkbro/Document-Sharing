package com.zed.DocumentSharing.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zed.DocumentSharing.Model.User; 

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User>  findByEmail(String email);
}
