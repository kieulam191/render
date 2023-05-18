package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    List<User> users;

    String create_uuid() {
        return  UUID.randomUUID().toString();
    }

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User( create_uuid(),"Nguyen Van A", 18));
        users.add(new User(create_uuid(), "Nguyen Van A", 18));
        users.add(new User(create_uuid(), "Nguyen Van A", 18));
    }

    public ResponseEntity<List<User>> getAllUser() {
        if(users.size() != 0) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(users, HttpStatus.BAD_REQUEST);
        }
    }
}
