package com.project.blog.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Crucial for POST requests in Postman
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Disables login for all endpoints
            );
        
        return http.build();
    }
}