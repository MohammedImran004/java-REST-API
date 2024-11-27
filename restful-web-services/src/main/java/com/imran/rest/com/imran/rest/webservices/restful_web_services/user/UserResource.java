package com.imran.rest.com.imran.rest.webservices.restful_web_services.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    private final UserService service;

    public UserResource(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.retrieveAllUsers();
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the RESTful Web Service!";
    }
}
