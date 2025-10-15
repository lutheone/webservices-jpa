package com.lutheone.webservices.config;

import com.lutheone.webservices.entities.User;
import com.lutheone.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "123456", "988888888", "maria@gmail.com", "Maria Brown");
        User u2 = new User(null, "123456", "977777777", "alex@gmail.com", "Alex Green");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
