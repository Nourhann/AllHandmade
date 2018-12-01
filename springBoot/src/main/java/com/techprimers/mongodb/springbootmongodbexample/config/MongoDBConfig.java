package com.techprimers.mongodb.springbootmongodbexample.config;

import com.techprimers.mongodb.springbootmongodbexample.document.Admin;
import com.techprimers.mongodb.springbootmongodbexample.document.Item;
import com.techprimers.mongodb.springbootmongodbexample.repository.AdminRepository;
import com.techprimers.mongodb.springbootmongodbexample.repository.ItemRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.techprimers.mongodb.springbootmongodbexample.repository")
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(AdminRepository userRepository) {
        return strings -> {
            userRepository.save(new Admin("3", "Smith3","1234", "1","jkjkj@"));
            userRepository.save(new Admin("2", "Smith2","1234", "1","jkjkj@"));
        };
    }
//    @Bean
//    CommandLineRunner commandLineRunner(ItemRepository userRepository) {
//        return strings -> {
//            userRepository.save(new Item("mmm", "dsfghj","1234","jhghf"));
//            userRepository.save(new Item("nnn", "fdfghbn","1234","tfdfg"));
//        };
//    }

}
