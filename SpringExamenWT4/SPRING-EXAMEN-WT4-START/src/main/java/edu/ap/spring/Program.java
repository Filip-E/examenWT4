package edu.ap.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Program {
    public static void main(String[] args) {
        SpringApplication.run(Program.class);
    }

    @Bean
    CommandLineRunner runAtStartup() {
        return args -> {
            System.out.println("I have started succesfully.");
        };
    }
}
