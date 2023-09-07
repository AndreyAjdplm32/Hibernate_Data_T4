package com.example.hibernate_data_t4;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class ComandLineApp implements CommandLineRunner {

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
