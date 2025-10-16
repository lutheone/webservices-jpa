package com.lutheone.webservices.config;

import com.lutheone.webservices.entities.Order;
import com.lutheone.webservices.entities.User;
import com.lutheone.webservices.repositories.OrderRepository;
import com.lutheone.webservices.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "123456", "988888888", "maria@gmail.com", "Maria Brown");
        User u2 = new User(null, "123456", "977777777", "alex@gmail.com", "Alex Green");

        Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
