package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    @Autowired
    UserService userService;






    @GetMapping("/api/users")
    public ResponseEntity<List<HashMap<String, Objects>>>  getAllUser() {
        return userService.getAllUser();
    }
}
