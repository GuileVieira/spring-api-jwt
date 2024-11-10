package com.studies.api.jwt.service;

import com.studies.api.jwt.dto.LoginUserDto;
import com.studies.api.jwt.dto.RegisterUserDto;
import com.studies.api.jwt.entity.User;
import com.studies.api.jwt.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {

    private final UserRepository repo;
    private final PasswordEncoder passEncoder;
    private final AuthenticationManager authManager;

    public User singUp(RegisterUserDto input){
        User user = new User();
        user.setUsername(input.getUsername());
        user.setEmail(input.getEmail());
        user.setPassword(passEncoder.encode(input.getPassword()));

        return repo.save(user);
    }

    public User authenticate(LoginUserDto input){
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );
        return repo.findByEmail(input.getEmail()).orElseThrow();
    }
}
