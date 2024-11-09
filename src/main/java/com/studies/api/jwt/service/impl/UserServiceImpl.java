package com.studies.api.jwt.service.impl;

import com.studies.api.jwt.entity.User;
import com.studies.api.jwt.repository.UserRepository;
import com.studies.api.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;

    @Override
    public Iterable<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        return repo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
