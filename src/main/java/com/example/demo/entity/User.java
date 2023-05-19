package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Getter
    private String id;

    @Getter
    @Setter
    private int userId;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    public User(){}

    public User(String id, int userId, String name, int age) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
