package com.metodo.api.config;

import com.metodo.api.domain.User;
import com.metodo.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    public UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Alef", "alef@gmail.com", "123");
        User u2 = new User(null, "Pamela","pamela@gmail.com", "123" );

        repository.saveAll(List.of(u1,u2));
    }
}
