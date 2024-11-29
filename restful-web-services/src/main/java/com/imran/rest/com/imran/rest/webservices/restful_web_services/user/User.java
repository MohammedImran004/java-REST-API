package com.imran.rest.com.imran.rest.webservices.restful_web_services.user;

import jakarta.validation.constraints.Size;

public class User {
    private Integer id;
    @Size(min=2,message = "The name must be at least 2 characters long")
    private String name;
    private int age;
    public User(int age, Integer id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    
   
}
