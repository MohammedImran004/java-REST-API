package com.imran.rest.com.imran.rest.webservices.restful_web_services.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static Integer userCount = 0;

    static {
        users.add(new User(30, ++userCount, "John"));
        users.add(new User(25, ++userCount, "Doe"));
        users.add(new User(28, ++userCount, "Jane"));
    }

    public List<User> retrieveAllUsers() {
        return users;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User saveUser(User user) {
        user.setId(++userCount); 
        users.add(user); 
        return user; 
    }
}
