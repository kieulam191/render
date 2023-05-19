package com.example.demo.config;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DbConfig implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        if(userRepository.count() == 0)
        {
            User user =new User(UUID.randomUUID().toString(), "Lam", 20);
            userRepository.save(user);
        }
    }
}
