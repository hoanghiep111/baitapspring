package com.example.baitapspring.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository){
        return  new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User user = new User( "Hiep", "hiep@gmail.com","123456");
                User user2 = new User( "Hoan", "Hoan@gmail.com","123456");
                System.out.println("insert database : " + userRepository.save(user));
                System.out.println("insert database : " + userRepository.save(user2));
            }
        };
    }
}
