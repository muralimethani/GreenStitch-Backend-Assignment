package com.example.demo;


public interface UserService {

    User signUp(User user);

    String login(String username, String password);
}