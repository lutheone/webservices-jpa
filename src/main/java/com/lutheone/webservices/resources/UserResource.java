package com.lutheone.webservices.resources;

import com.lutheone.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "123456", "988888888", "maria@gmail.com", "Maria Brown" );
        return ResponseEntity.ok().body(u); }
}

