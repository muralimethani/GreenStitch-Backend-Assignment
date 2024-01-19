package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public User signUp(User user) {
        // Implement user registration logic and password hashing
        // Save the user in the database
        return userRepository.save(user);
    }

    @Override
    public String login(String username, String password) {
        // Authenticate the user
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        // Generate JWT token
        return jwtTokenProvider.generateToken(username);
    }
}
