package com.studies.api.jwt.service;

import com.studies.api.jwt.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
}
