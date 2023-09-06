package com.example.hibernate_data_t4.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SpringBootApplication
public class ComandLineApp implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ComandLineApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}