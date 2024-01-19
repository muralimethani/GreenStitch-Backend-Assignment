package com.example.demo;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Component;


@Component
public class JwtTokenProvider {

    private static final String SECRET_KEY = "yourSecretKey";
    private static final long EXPIRATION_TIME = 86400000; // 1 day

    public String generateToken(String username) {
    }

    public Authentication getAuthentication(String token) {
        // Implement logic to extract user information from the token and create an Authentication object
    }

}