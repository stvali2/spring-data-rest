package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Bean
    CommandLineRunner initData(AddressRepository addressRepo, UserRepository userRepo) {
        return args -> {
            userRepo.deleteAll();
            addressRepo.deleteAll();

            Address a1 = addressRepo.save(new Address(null, "Sunset Boulevard 123, Los Angeles", null));
            Address a2 = addressRepo.save(new Address(null, "Central Park West 45, New York", null));

            userRepo.save(new User(null, "Alice", 31, a1));
            userRepo.save(new User(null, "Bob", 28, a1));
            userRepo.save(new User(null, "Charlie", 35, a2));

            System.out.println("Demo data created: 2 addresses, 3 users");
        };
    }
}
