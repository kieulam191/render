package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;






    @RequestMapping(value = {"/users"}, method = RequestMethod.GET)
    public ResponseEntity<List<HashMap<String, Objects>>>  getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = {"/user"}, method = RequestMethod.GET)
    public ResponseEntity<User> getUserbyId(@RequestParam(value = "userId", defaultValue = "0") String userId) {
        return userService.getUserbyId(userId);
    }
}
