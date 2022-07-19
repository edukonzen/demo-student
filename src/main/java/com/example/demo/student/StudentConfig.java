package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
             Student eduardo = new Student(
                    "Eduardo Konzen",
                    "eduardo.konzen@bol.com",
                    LocalDate.of(2000, Month.OCTOBER, 21),
                    21
            );

             Student dionei = new Student(
                    "Dionei Da Bike",
                    "dionei.dabike@bol.com",
                    LocalDate.of(1994, Month.JANUARY, 24),
                    28
            );

             repository.saveAll(
                     List.of(eduardo, dionei)
             );
        };
    }
}
