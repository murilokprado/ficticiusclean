package com.ficticiusclean.ficticiusclean.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.ficticiusclean")
@ComponentScan("com.ficticiusclean")
@EnableJpaRepositories("com.ficticiusclean")
public class FicticiuscleanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FicticiuscleanApplication.class, args);
    }
}
