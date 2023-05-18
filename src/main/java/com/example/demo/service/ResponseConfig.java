package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ResponseConfig {

    public ResponseEntity<?> reponse(List<User> user, int status) {
        HashMap<String, Object> hmap = new HashMap<String, Object>();
        hmap.put("data: ", user);
        hmap.put("status", status);

        return new ResponseEntity<HashMap<String, Object>>(hmap, HttpStatusCode.valueOf(status));
    }
}
