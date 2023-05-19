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
        userRepository.deleteAll();
        if(userRepository.count() == 0)
        {
            User user1 =new User(UUID.randomUUID().toString(), 0, "Lam", 20);
            User user2 =new User(UUID.randomUUID().toString(),1 ,"Ngoc", 20);
            userRepository.save(user1);
            userRepository.save(user2);
        }
    }
}
