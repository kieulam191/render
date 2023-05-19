package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ResponseConfig responseConfig;

    public ResponseEntity<List<HashMap<String, Objects>>> getAllUser() {
        List<User> userList = userRepository.findAll();
        ResponseEntity<List<User>> users = new ResponseEntity<>(userList, HttpStatus.OK);

        if(users.getStatusCode() == HttpStatus.OK){
            return (ResponseEntity<List<HashMap<String, Objects>>>)
                    responseConfig.reponse(users.getBody(), 200);
        }

        return (ResponseEntity<List<HashMap<String, Objects>>>) responseConfig.reponse(users.getBody(), 502);
    }


    public ResponseEntity<User> getUserbyId(String id) {
        User user = userRepository.findUserbyId(Integer.parseInt(id));


        if(user != null) {
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
    }
}
