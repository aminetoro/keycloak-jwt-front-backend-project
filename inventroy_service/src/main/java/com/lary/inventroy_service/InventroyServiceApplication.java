package com.lary.inventroy_service;

import com.lary.inventroy_service.entities.Product;
import com.lary.inventroy_service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventroyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventroyServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").prix(2323).quantity(11).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer1").prix(132).quantity(2).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer2").prix(2323).quantity(11).build());
        };
    }
}
